package k13;

/* loaded from: classes5.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15563xb39a5965 f384763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15563xb39a5965 activityC15563xb39a5965) {
        super(0);
        this.f384763d = activityC15563xb39a5965;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = this.f384763d.mo55332x76847179().getSystemService("vibrator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        return (android.os.Vibrator) systemService;
    }
}
