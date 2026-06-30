package gu0;

/* loaded from: classes5.dex */
public final class w0 implements com.p314xaae8f345.p457x3304c6.p479x4179489f.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422 f357369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f357370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357371c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f357372d;

    public w0(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422 c4143xe6876422, gu0.k2 k2Var, java.lang.String str, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f357369a = c4143xe6876422;
        this.f357370b = k2Var;
        this.f357371c = str;
        this.f357372d = qVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.k
    public final void a(java.lang.String str, boolean z17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.Session", "export complete: checksum=" + str + ", error=" + c4093x6b88526b);
        this.f357369a.b();
        this.f357370b.f357272o = null;
        i95.m c17 = i95.n0.c(pp0.h0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String str2 = this.f357371c;
        java.lang.String Ai = ((yy0.m0) ((pp0.h0) c17)).Ai(str2);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f357372d.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.o(str2, Ai, c4093x6b88526b)));
    }
}
