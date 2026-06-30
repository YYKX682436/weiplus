package cw2;

/* loaded from: classes2.dex */
public final class t9 implements cw2.z9 {

    /* renamed from: d, reason: collision with root package name */
    public final cw2.f8 f305563d;

    /* renamed from: e, reason: collision with root package name */
    public dw2.c0 f305564e;

    /* renamed from: f, reason: collision with root package name */
    public final cw2.i0 f305565f;

    public t9(cw2.f8 pageVideoCore, p012xc85e97e9.p093xedfae76a.y lifecycleOwner, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageVideoCore, "pageVideoCore");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f305563d = pageVideoCore;
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f305565f = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209196df).mo141623x754a37bb()).r()).booleanValue() ? new cw2.i0(lifecycleOwner, context) : null;
    }

    @Override // cw2.z9
    public boolean A() {
        return this.f305563d.A();
    }

    @Override // cw2.z9
    public cw2.w9 C() {
        return this.f305565f;
    }

    @Override // cw2.z9
    public void D(long j17) {
    }

    @Override // cw2.z9
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0 F() {
        return this.f305563d.f305233h;
    }

    @Override // cw2.z9
    public ec2.i I() {
        return this.f305563d.f305235m;
    }

    @Override // cw2.z9
    public void Z() {
        this.f305563d.Z();
    }

    @Override // cw2.z9
    public void c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f305563d.c(context);
    }

    @Override // cw2.z9
    public void g(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f305563d.g(context);
    }

    @Override // cw2.z9
    public void i() {
        this.f305563d.i();
    }

    @Override // cw2.z9
    public void j0() {
        this.f305563d.j0();
    }

    @Override // cw2.z9
    public dw2.c0 v() {
        return this.f305564e;
    }
}
