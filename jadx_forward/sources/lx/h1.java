package lx;

/* loaded from: classes8.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx.r1 f403313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f403314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f403315f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(lx.r1 r1Var, long j17, long j18) {
        super(1);
        this.f403313d = r1Var;
        this.f403314e = j17;
        this.f403315f = j18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p2845xc516c4b6.biz.C23184x5f38fda5 c23184x5f38fda5 = (com.p314xaae8f345.p2845xc516c4b6.biz.C23184x5f38fda5) obj;
        java.lang.Double valueOf = java.lang.Double.valueOf(0.0d);
        if (c23184x5f38fda5 == null) {
            c23184x5f38fda5 = new com.p314xaae8f345.p2845xc516c4b6.biz.C23184x5f38fda5(valueOf, valueOf, com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a, null, 8, null);
        }
        lx.r1 r1Var = this.f403313d;
        r1Var.getClass();
        java.lang.Double m85183x79d7af9 = c23184x5f38fda5.m85183x79d7af9();
        java.lang.Double valueOf2 = java.lang.Double.valueOf(m85183x79d7af9 != null ? m85183x79d7af9.doubleValue() : 0.0d);
        java.lang.Double m85182x2605e9e2 = c23184x5f38fda5.m85182x2605e9e2();
        java.lang.Double valueOf3 = java.lang.Double.valueOf(m85182x2605e9e2 != null ? m85182x2605e9e2.doubleValue() : 0.0d);
        java.lang.String m85180x27184b6e = c23184x5f38fda5.m85180x27184b6e();
        if (m85180x27184b6e == null) {
            m85180x27184b6e = "";
        }
        com.p314xaae8f345.p2845xc516c4b6.biz.C23259xb2dc8081 c23259xb2dc8081 = new com.p314xaae8f345.p2845xc516c4b6.biz.C23259xb2dc8081(valueOf2, valueOf3, m85180x27184b6e, java.lang.Long.valueOf(this.f403314e), java.lang.Long.valueOf(this.f403315f));
        r1Var.f403463g = c23259xb2dc8081;
        com.p314xaae8f345.p2845xc516c4b6.biz.C23149x178594ad c23149x178594ad = r1Var.f403461e;
        if (c23149x178594ad != null) {
            c23149x178594ad.m85090x3171ce6e(c23259xb2dc8081, java.lang.System.currentTimeMillis(), lx.g1.f403301d);
        }
        return jz5.f0.f384359a;
    }
}
