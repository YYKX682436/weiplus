package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes13.dex */
public final class s2 implements o4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0.s f92275a;

    public s2(w0.s sVar) {
        this.f92275a = sVar;
    }

    @Override // o4.d
    public final android.os.Bundle a() {
        java.util.Map a17 = this.f92275a.a();
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.util.Map.Entry entry : a17.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            bundle.putParcelableArrayList(str, list instanceof java.util.ArrayList ? (java.util.ArrayList) list : new java.util.ArrayList<>(list));
        }
        return bundle;
    }
}
