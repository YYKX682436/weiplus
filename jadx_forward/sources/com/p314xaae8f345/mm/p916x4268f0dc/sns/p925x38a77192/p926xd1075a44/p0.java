package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes5.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f151679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f151680e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(e0.f1 f1Var, float f17) {
        super(0);
        this.f151679d = f1Var;
        this.f151680e = f17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int size = this.f151679d.f().b().size();
        float f17 = size >= 0 && size < 2 ? 0.0f : 1.0f;
        return java.lang.Float.valueOf((f17 <= 1.0f ? f17 : 1.0f) * this.f151680e);
    }
}
