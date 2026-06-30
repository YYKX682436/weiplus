package aw2;

/* loaded from: classes10.dex */
public final class x0 implements ya2.r1 {

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.List f96339s = kz5.c0.i(34, 36, 47);

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f96340d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f96341e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f96342f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f96343g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f96344h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f96345i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f96346m;

    /* renamed from: n, reason: collision with root package name */
    public r45.zi2 f96347n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f96348o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f96349p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f96350q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f96351r;

    public x0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f96340d = activity;
        this.f96341e = jz5.h.b(new aw2.q0(this));
        this.f96342f = jz5.h.b(new aw2.o0(this));
        this.f96343g = jz5.h.b(new aw2.u0(this));
        this.f96344h = jz5.h.b(new aw2.r0(this));
        this.f96346m = jz5.h.b(new aw2.v0(this));
        this.f96349p = jz5.h.b(new aw2.n0(this));
        this.f96350q = jz5.h.b(new aw2.w0(this));
        this.f96351r = jz5.h.b(new aw2.p0(this));
    }

    public final android.view.View a() {
        return (android.view.View) ((jz5.n) this.f96341e).mo141623x754a37bb();
    }

    public final boolean b() {
        return ((java.lang.Boolean) ((jz5.n) this.f96344h).mo141623x754a37bb()).booleanValue();
    }

    public final r45.kc4 c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079;
        if (!b() || (c14994x9b99c079 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) ((jz5.n) this.f96343g).mo141623x754a37bb()) == null) {
            return null;
        }
        android.widget.CheckBox checkBox = (android.widget.CheckBox) ((jz5.n) this.f96342f).mo141623x754a37bb();
        int i17 = (checkBox == null || !checkBox.isChecked()) ? 0 : 1;
        r45.kc4 kc4Var = new r45.kc4();
        kc4Var.set(0, java.lang.Long.valueOf(c14994x9b99c079.m59251x5db1b11()));
        kc4Var.set(7, c14994x9b99c079.m59229xb5af1dd5());
        kc4Var.set(1, c14994x9b99c079.m59276x6c285d75());
        kc4Var.set(2, c14994x9b99c079.m59299x6bf53a6c());
        kc4Var.set(3, c14994x9b99c079.m59273x80025a04());
        kc4Var.set(5, java.lang.Integer.valueOf(i17));
        kc4Var.set(6, (java.lang.String) ((jz5.n) this.f96346m).mo141623x754a37bb());
        if (((java.lang.Boolean) ((jz5.n) this.f96349p).mo141623x754a37bb()).booleanValue()) {
            r2 = 3;
        } else if (!this.f96345i) {
            java.lang.String str = (java.lang.String) ((jz5.n) this.f96350q).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "<get-topicWord>(...)");
            r2 = (str.length() <= 0 ? 0 : 1) != 0 ? 2 : 0;
        }
        kc4Var.set(4, java.lang.Integer.valueOf(r2));
        return kc4Var;
    }
}
