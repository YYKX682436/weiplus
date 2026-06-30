package xt2;

/* loaded from: classes.dex */
public final class j6 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f538365d;

    public j6(v65.n nVar) {
        this.f538365d = nVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        v65.n nVar = this.f538365d;
        byte[] byteArray = bundle != null ? bundle.getByteArray("FinderProductAutoScrollRespKey") : null;
        try {
            r45.s42 s42Var = new r45.s42();
            if (byteArray != null) {
                try {
                    s42Var.mo11468x92b714fd(byteArray);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
                nVar.a(s42Var);
            }
            s42Var = null;
            nVar.a(s42Var);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderProductAutoScrollWidget", e18, "create widget failed", new java.lang.Object[0]);
            nVar.a(null);
        }
    }
}
