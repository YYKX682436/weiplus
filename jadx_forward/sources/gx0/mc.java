package gx0;

/* loaded from: classes5.dex */
public final class mc extends gx0.gg {

    /* renamed from: t, reason: collision with root package name */
    public ou0.z f358254t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f358255u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f358254t = new ou0.w(false);
        this.f358255u = jz5.h.b(new gx0.lc(this));
    }

    @Override // gx0.gg
    public void X6() {
        super.X6();
        d7().L7(false);
        d7().M7(false);
        d7().N7(false);
        jz5.g gVar = this.f358255u;
        this.f358254t = ((gx0.bh) ((jz5.n) gVar).mo141623x754a37bb()).B;
        ((gx0.bh) ((jz5.n) gVar).mo141623x754a37bb()).f7(new ou0.w(false));
    }

    @Override // gx0.gg
    public void a7() {
        super.a7();
        d7().L7(true);
        d7().M7(true);
        d7().N7(true);
        ((gx0.bh) ((jz5.n) this.f358255u).mo141623x754a37bb()).f7(this.f358254t);
    }

    @Override // gx0.gg, nv0.f
    public void v4(boolean z17, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q composingPanel, nv0.d stack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composingPanel, "composingPanel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stack, "stack");
        super.v4(z17, composingPanel, stack);
        if (z17 && !(!stack.f421961b.isEmpty()) && this.f358016s == gx0.jf.f358130f) {
            ((gx0.bh) ((jz5.n) this.f358255u).mo141623x754a37bb()).f7(new ou0.w(false));
        }
    }
}
