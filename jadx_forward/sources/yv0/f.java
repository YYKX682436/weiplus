package yv0;

/* loaded from: classes5.dex */
public final class f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f547494d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f547495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yv0.h f547496f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yv0.h hVar, android.view.View view) {
        super(view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f547496f = hVar;
        this.f547494d = jz5.h.b(new yv0.e(this));
    }

    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10944xceb8a619 i() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f547494d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10944xceb8a619) mo141623x754a37bb;
    }

    public final void j(double d17) {
        i().post(new yv0.c(this, d17));
    }

    public final void k(double d17, com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a offset) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(offset, "offset");
        i().post(new yv0.d(this, d17, offset));
    }

    public final void l(android.graphics.Rect cachedFrame) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cachedFrame, "cachedFrame");
        android.view.View itemView = this.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        android.view.ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = cachedFrame.width();
        layoutParams.height = cachedFrame.height();
        itemView.setLayoutParams(layoutParams);
        i();
    }
}
