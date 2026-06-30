package c72;

/* loaded from: classes12.dex */
public class t implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c72.u f39590d;

    public t(c72.u uVar) {
        this.f39590d = uVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        c72.u uVar = this.f39590d;
        if (i17 == 0 && i18 == 0) {
            c72.v vVar = uVar.f39592e;
            vVar.H(vVar.dispatcher(), uVar.f39592e.f39594e);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneFaceRsaBase", "hy: do scene err in rsa when get cert. clear ticket");
        c72.v.f39593f = null;
        c72.v vVar2 = uVar.f39592e;
        vVar2.getClass();
        vVar2.K(c72.v.f39593f);
        c72.v vVar3 = uVar.f39592e;
        vVar3.f39594e.onSceneEnd(i17, i18, "", vVar3);
    }
}
