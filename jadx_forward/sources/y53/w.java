package y53;

/* loaded from: classes8.dex */
public final class w implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u53.w f541043a;

    public w(u53.w wVar) {
        this.f541043a = wVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152149b;
        jz5.f0 f0Var = jz5.f0.f384359a;
        u53.w wVar = this.f541043a;
        if (i17 != 0 || fVar.f152148a != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameLife.ContactService", "setBlackListAssociateWithWAGame errCode:%d,errType:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(fVar.f152148a));
            if (wVar != null) {
                wVar.a(false);
                return f0Var;
            }
        } else if (wVar != null) {
            wVar.a(true);
            return f0Var;
        }
        return null;
    }
}
