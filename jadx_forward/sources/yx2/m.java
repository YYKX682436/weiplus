package yx2;

/* loaded from: classes2.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f549397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f549398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1676x2ef9413f.C15433xbefc23a9 f549399f;

    public m(r45.mb4 mb4Var, android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1676x2ef9413f.C15433xbefc23a9 c15433xbefc23a9) {
        this.f549397d = mb4Var;
        this.f549398e = imageView;
        this.f549399f = c15433xbefc23a9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17858x5da04085 m62913x4eb0f6e5;
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d b17 = g1Var.b();
        r45.mb4 item = this.f549397d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "$item");
        wo0.c b18 = b17.b(new mn2.u0(item, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, 4, null), g1Var.h(mn2.f1.f411486d));
        android.widget.ImageView bgView = this.f549398e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bgView, "$bgView");
        b18.c(bgView);
        m62913x4eb0f6e5 = this.f549399f.m62913x4eb0f6e5();
        m62913x4eb0f6e5.setVisibility(8);
    }
}
