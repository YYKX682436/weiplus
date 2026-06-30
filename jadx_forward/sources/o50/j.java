package o50;

/* loaded from: classes5.dex */
public abstract class j extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f424600d;

    /* renamed from: e, reason: collision with root package name */
    public int f424601e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f424602f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f424603g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f424604h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f424600d = jz5.h.b(new o50.i(this));
        this.f424602f = jz5.h.b(new o50.c(this));
        this.f424603g = jz5.h.b(new o50.e(this));
        this.f424604h = jz5.h.b(new o50.d(this));
    }

    public abstract co.a T6();

    public abstract android.view.View U6(co.a aVar);

    public final co.a V6() {
        return (co.a) ((jz5.n) this.f424602f).mo141623x754a37bb();
    }

    public final em.b W6() {
        return (em.b) ((jz5.n) this.f424600d).mo141623x754a37bb();
    }

    public void X6(android.view.View previewChattingView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewChattingView, "previewChattingView");
        previewChattingView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        vg5.a aVar;
        j75.f Q6 = Q6();
        if (Q6 != null && (aVar = (vg5.a) Q6.mo140437x75286adb()) != null) {
            aVar.f518309g = V6();
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.L2(m158354x19263085(), new o50.h(this));
        }
    }
}
