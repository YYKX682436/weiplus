package yf2;

/* loaded from: classes10.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.s0 f543298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf2.j2 f543299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f543300f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(yf2.s0 s0Var, yf2.j2 j2Var, yz5.a aVar) {
        super(0);
        this.f543298d = s0Var;
        this.f543299e = j2Var;
        this.f543300f = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yf2.j2 j2Var = this.f543299e;
        yf2.s0 s0Var = this.f543298d;
        s0Var.e7(3, j2Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLivePostLicenseWidget", "handleLicenseConfirmed");
        s0Var.f7(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLivePostLicenseWidget", "reportLicenseConfirmed");
        r45.q12 q12Var = (r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) s0Var.m56788xbba4bfc0(mm2.g1.class)).f410601f).mo144003x754a37bb();
        if (q12Var != null ? zl2.r4.f555483a.T1(q12Var) : false) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLivePostLicenseWidget", "reportGameLiveLicenseConfirmed");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLivePostLicenseWidget", "reportNormalLiveLicenseConfirmed");
        }
        yz5.a aVar = this.f543300f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
