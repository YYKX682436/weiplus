package androidx.lifecycle;

/* loaded from: classes13.dex */
public class u0 implements o4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.v0 f11654a;

    public u0(androidx.lifecycle.v0 v0Var) {
        this.f11654a = v0Var;
    }

    @Override // o4.d
    public android.os.Bundle a() {
        androidx.lifecycle.v0 v0Var = this.f11654a;
        for (java.util.Map.Entry entry : new java.util.HashMap(v0Var.f11657b).entrySet()) {
            android.os.Bundle a17 = ((o4.d) entry.getValue()).a();
            java.lang.String str = (java.lang.String) entry.getKey();
            if (a17 != null) {
                v0Var.getClass();
                java.lang.Class[] clsArr = androidx.lifecycle.v0.f11655e;
                for (int i17 = 0; i17 < 29; i17++) {
                    if (!clsArr[i17].isInstance(a17)) {
                    }
                }
                throw new java.lang.IllegalArgumentException("Can't put value with type " + a17.getClass() + " into saved state");
            }
            androidx.lifecycle.j0 j0Var = (androidx.lifecycle.j0) ((java.util.HashMap) v0Var.f11658c).get(str);
            if (j0Var != null) {
                j0Var.setValue(a17);
            } else {
                ((java.util.HashMap) v0Var.f11656a).put(str, a17);
            }
        }
        java.util.Set<java.lang.String> keySet = ((java.util.HashMap) v0Var.f11656a).keySet();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(keySet.size());
        java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>(arrayList.size());
        for (java.lang.String str2 : keySet) {
            arrayList.add(str2);
            arrayList2.add(((java.util.HashMap) v0Var.f11656a).get(str2));
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("keys", arrayList);
        bundle.putParcelableArrayList("values", arrayList2);
        return bundle;
    }
}
