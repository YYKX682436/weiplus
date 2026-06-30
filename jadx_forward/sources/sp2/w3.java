package sp2;

/* loaded from: classes2.dex */
public final class w3 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sp2.x3 f492794a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(sp2.x3 x3Var, android.os.Looper looper) {
        super(looper);
        this.f492794a = x3Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        java.lang.Integer valueOf = message != null ? java.lang.Integer.valueOf(message.what) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            sp2.x3 x3Var = this.f492794a;
            if (x3Var.f492810h) {
                x3Var.W6(x3Var.f492811i, x3Var.f492812m);
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = x3Var.f492808f;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = x3Var.f492809g;
            if (c1163xf1deaba4 == null || c22848x6ddd90cf == null) {
                return;
            }
            p3325xe03a0797.p3326xc267989b.y0 mo144225x95f74600 = x3Var.mo144225x95f74600();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new sp2.p3(x3Var, c1163xf1deaba4, c22848x6ddd90cf, null), 2, null);
        }
    }
}
