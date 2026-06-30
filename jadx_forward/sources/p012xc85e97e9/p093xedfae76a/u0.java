package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public class u0 implements o4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.v0 f93187a;

    public u0(p012xc85e97e9.p093xedfae76a.v0 v0Var) {
        this.f93187a = v0Var;
    }

    @Override // o4.d
    public android.os.Bundle a() {
        p012xc85e97e9.p093xedfae76a.v0 v0Var = this.f93187a;
        for (java.util.Map.Entry entry : new java.util.HashMap(v0Var.f93190b).entrySet()) {
            android.os.Bundle a17 = ((o4.d) entry.getValue()).a();
            java.lang.String str = (java.lang.String) entry.getKey();
            if (a17 != null) {
                v0Var.getClass();
                java.lang.Class[] clsArr = p012xc85e97e9.p093xedfae76a.v0.f93188e;
                for (int i17 = 0; i17 < 29; i17++) {
                    if (!clsArr[i17].isInstance(a17)) {
                    }
                }
                throw new java.lang.IllegalArgumentException("Can't put value with type " + a17.getClass() + " into saved state");
            }
            p012xc85e97e9.p093xedfae76a.j0 j0Var = (p012xc85e97e9.p093xedfae76a.j0) ((java.util.HashMap) v0Var.f93191c).get(str);
            if (j0Var != null) {
                j0Var.mo523x53d8522f(a17);
            } else {
                ((java.util.HashMap) v0Var.f93189a).put(str, a17);
            }
        }
        java.util.Set<java.lang.String> keySet = ((java.util.HashMap) v0Var.f93189a).keySet();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(keySet.size());
        java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>(arrayList.size());
        for (java.lang.String str2 : keySet) {
            arrayList.add(str2);
            arrayList2.add(((java.util.HashMap) v0Var.f93189a).get(str2));
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("keys", arrayList);
        bundle.putParcelableArrayList("values", arrayList2);
        return bundle;
    }
}
