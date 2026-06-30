package kd2;

/* loaded from: classes2.dex */
public final class u1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 f388375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f388376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f388377c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f388378d;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88, int i17, long j17, int i18) {
        this.f388375a = c14989xf862ae88;
        this.f388376b = i17;
        this.f388377c = j17;
        this.f388378d = i18;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[5];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = this.f388375a;
        lVarArr[0] = new jz5.l("feedid", pm0.v.u(c14989xf862ae88.m59127x5db1b11()));
        lVarArr[1] = new jz5.l("screen_type", java.lang.Integer.valueOf(this.f388376b));
        lVarArr[2] = new jz5.l("last_completed_feedid", pm0.v.u(this.f388377c));
        java.lang.String sessionBuffer = c14989xf862ae88.getSessionBuffer();
        if (sessionBuffer == null) {
            sessionBuffer = "";
        }
        lVarArr[3] = new jz5.l("session_buffer", sessionBuffer);
        lVarArr[4] = new jz5.l("continue_play_type", java.lang.Integer.valueOf(this.f388378d));
        return kz5.c1.k(lVarArr);
    }
}
