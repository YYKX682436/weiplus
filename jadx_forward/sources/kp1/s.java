package kp1;

/* loaded from: classes8.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12880x474fa32c f392469d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12880x474fa32c c12880x474fa32c) {
        super(0);
        this.f392469d = c12880x474fa32c;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bw5.lp0 lp0Var;
        byte[] b17;
        ef0.d4 d4Var = (ef0.d4) ((qk.h9) i95.n0.c(qk.h9.class));
        if (d4Var.f333731f == null && (b17 = gm4.a.f355090a.b("key_taskbar_recommend_data")) != null) {
            bw5.qb0 qb0Var = new bw5.qb0();
            qb0Var.mo11468x92b714fd(b17);
            d4Var.f333731f = qb0Var;
        }
        bw5.qb0 qb0Var2 = d4Var.f333731f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12880x474fa32c c12880x474fa32c = this.f392469d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12880x474fa32c.q(c12880x474fa32c, qb0Var2);
        ((ef0.d4) ((qk.h9) i95.n0.c(qk.h9.class))).getClass();
        byte[] b18 = gm4.a.f355090a.b("key_task_bar_play_item");
        if (b18 != null) {
            lp0Var = new bw5.lp0();
            lp0Var.mo11468x92b714fd(b18);
        } else {
            lp0Var = null;
        }
        c12880x474fa32c.f174533t = lp0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "initLocalRecommendData categoryItem: %s, playingItem: %s", c12880x474fa32c.f174534u, lp0Var);
        pm0.v.X(new kp1.r(c12880x474fa32c));
        return jz5.f0.f384359a;
    }
}
