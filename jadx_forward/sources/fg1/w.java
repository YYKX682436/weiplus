package fg1;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f343445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f343446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fg1.z f343447f;

    public w(fg1.z zVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f343447f = zVar;
        this.f343445d = v5Var;
        this.f343446e = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f343445d;
        if (!v5Var.mo50262x39e05d35() || v5Var.a2() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "exitFullscreen, invalid state");
            return;
        }
        xi1.m mo14663xe55fc971 = v5Var.a2().mo14663xe55fc971();
        if (mo14663xe55fc971 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "exitFullscreen, state error");
            return;
        }
        this.f343447f.g(this.f343446e);
        mo14663xe55fc971.g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "exitFullscreen");
    }
}
