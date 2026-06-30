package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f70146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f70147e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(e0.f1 f1Var, float f17) {
        super(0);
        this.f70146d = f1Var;
        this.f70147e = f17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int size = this.f70146d.f().b().size();
        float f17 = size >= 0 && size < 2 ? 0.0f : 1.0f;
        return java.lang.Float.valueOf((f17 <= 1.0f ? f17 : 1.0f) * this.f70147e);
    }
}
