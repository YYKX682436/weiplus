package nh5;

/* loaded from: classes3.dex */
public final class c0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f418663d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f418664e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f418665f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f418666g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f418667h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f418668i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f418669m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f418670n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f418663d = jz5.h.b(new nh5.b0(itemView));
        this.f418664e = jz5.h.b(new nh5.a0(itemView));
        this.f418665f = jz5.h.b(new nh5.w(itemView));
        this.f418666g = jz5.h.b(new nh5.v(itemView));
        this.f418667h = jz5.h.b(new nh5.z(itemView));
        this.f418668i = jz5.h.b(new nh5.x(itemView));
        this.f418669m = jz5.h.b(new nh5.y(itemView));
        i().setVisibility(8);
        l().setVisibility(8);
        j().setVisibility(8);
        k().setVisibility(8);
        itemView.setOnClickListener(new nh5.t(this));
        itemView.setOnLongClickListener(new nh5.u(this));
    }

    public final android.widget.TextView i() {
        java.lang.Object mo141623x754a37bb = this.f418666g.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    public final android.widget.TextView j() {
        java.lang.Object mo141623x754a37bb = this.f418668i.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    public final android.widget.TextView k() {
        java.lang.Object mo141623x754a37bb = this.f418669m.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    public final android.widget.TextView l() {
        java.lang.Object mo141623x754a37bb = this.f418667h.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }
}
