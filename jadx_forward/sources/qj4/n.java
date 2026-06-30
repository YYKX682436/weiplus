package qj4;

/* loaded from: classes4.dex */
public final class n implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f445469b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445470c;

    public n(java.lang.String str, yz5.l lVar, java.lang.String str2) {
        this.f445468a = str;
        this.f445469b = lVar;
        this.f445470c = str2;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        mj4.h M = ai4.m0.f86706a.M(this.f445468a);
        if (M == null) {
            return;
        }
        java.util.Map map2 = (java.util.Map) this.f445469b.mo146xb9724478(M);
        ((mj4.k) M).l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(this.f445470c, str, map2, 33629);
    }
}
