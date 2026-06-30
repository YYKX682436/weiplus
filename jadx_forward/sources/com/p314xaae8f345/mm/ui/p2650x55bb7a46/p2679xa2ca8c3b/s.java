package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f287007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f287008e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f287009f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f287010g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zy2.c f287011h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287012i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.content.Intent intent, yb5.d dVar, long j17, long j18, zy2.c cVar, java.lang.String str) {
        super(0);
        this.f287007d = intent;
        this.f287008e = dVar;
        this.f287009f = j17;
        this.f287010g = j18;
        this.f287011h = cVar;
        this.f287012i = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
        long j17 = this.f287009f;
        android.content.Intent intent = this.f287007d;
        intent.putExtra("CURRENT_FEED_ID", j17);
        intent.putExtra("LAUNCH_WITH_ANIM", true);
        android.app.Activity g17 = this.f287008e.g();
        long j18 = this.f287009f;
        long j19 = this.f287010g;
        zy2.c cVar = this.f287011h;
        java.lang.String m75945x2fec8307 = cVar.f558892b.m75945x2fec8307(1);
        java.lang.String str = m75945x2fec8307 == null ? "" : m75945x2fec8307;
        java.lang.String m75945x2fec83072 = cVar.f558892b.m75945x2fec8307(12);
        ((vd2.d5) i0Var).wi(intent, g17, j18, j19, str, m75945x2fec83072 == null ? "" : m75945x2fec83072, cVar.f558892b.m75945x2fec8307(4), this.f287012i, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
        return jz5.f0.f384359a;
    }
}
