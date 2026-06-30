package kp1;

/* loaded from: classes11.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12883xfb6c00a4 f392423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12883xfb6c00a4 c12883xfb6c00a4) {
        super(0);
        this.f392423d = c12883xfb6c00a4;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12883xfb6c00a4.f174561z;
        gp1.o onEnterPlayerCallback = this.f392423d.getOnEnterPlayerCallback();
        if (onEnterPlayerCallback != null) {
            ((oh4.a) onEnterPlayerCallback).a();
        }
        ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ui(bw5.yq0.TingReportAction_ControlAreaClickRecent, null, null);
        return jz5.f0.f384359a;
    }
}
