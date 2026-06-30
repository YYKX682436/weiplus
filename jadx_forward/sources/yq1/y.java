package yq1;

/* loaded from: classes.dex */
public final class y implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yq1.z f546027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f546028b;

    public y(yq1.z zVar, yz5.l lVar) {
        this.f546027a = zVar;
        this.f546028b = lVar;
    }

    @Override // wd0.p1
    public void a() {
        this.f546027a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceImpl", "changeSwitchWechatForStatus2CommonTips onCancelBtn.");
        yz5.l lVar = this.f546028b;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
    }

    @Override // wd0.p1
    /* renamed from: onSuccess */
    public void mo977xe05b4124() {
        ((vd0.j2) ((wd0.q1) i95.n0.c(wd0.q1.class))).wi(true, 256L);
        this.f546027a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceImpl", "changeSwitchWechatForStatus2CommonTips onAgreeBtn.");
        yz5.l lVar = this.f546028b;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
    }
}
