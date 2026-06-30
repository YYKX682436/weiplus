package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes14.dex */
public final class o4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f151667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f151668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f151669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f151670g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(yz5.p pVar, float f17, float f18, long j17) {
        super(2);
        this.f151667d = pVar;
        this.f151668e = f17;
        this.f151669f = f18;
        this.f151670g = j17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj3 = n0.e1.f415025a;
        this.f151667d.mo149xb9724478(oVar, 0);
        float f17 = this.f151668e;
        if (f17 >= 0.0f && f17 < 100.0f) {
            com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.a7.i(f17, i0.h.a(this.f151669f), this.f151670g, null, oVar, 0, 8);
        }
        return jz5.f0.f384359a;
    }
}
