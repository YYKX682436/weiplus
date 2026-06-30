package jv4;

/* loaded from: classes12.dex */
public abstract class e implements jv4.f {

    /* renamed from: a, reason: collision with root package name */
    public final su4.p0 f383768a;

    /* renamed from: b, reason: collision with root package name */
    public nv4.e f383769b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.ViewGroup f383770c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f383771d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f383772e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f383773f;

    public e(su4.p0 config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f383768a = config;
        this.f383771d = jz5.h.b(new jv4.d(this));
        this.f383772e = jz5.h.b(new jv4.a(this));
        this.f383773f = jz5.h.b(new jv4.b(this));
    }

    public abstract jv4.h a();

    public int b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.egj;
    }

    public void c() {
        android.view.ViewGroup viewGroup;
        su4.p0 p0Var = this.f383768a;
        android.view.View findViewById = p0Var.mo134669x19263085().findViewById(p0Var.n());
        android.view.ViewGroup viewGroup2 = findViewById instanceof android.view.ViewGroup ? (android.view.ViewGroup) findViewById : null;
        if (viewGroup2 == null) {
            return;
        }
        android.view.View inflate = android.view.LayoutInflater.from(p0Var.mo134669x19263085()).inflate(b(), (android.view.ViewGroup) null);
        android.view.ViewGroup viewGroup3 = inflate instanceof android.view.ViewGroup ? (android.view.ViewGroup) inflate : null;
        if (viewGroup3 == null) {
            return;
        }
        this.f383770c = viewGroup3;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.f566614tz5);
        c1163xf1deaba4.setBackground(null);
        e(c1163xf1deaba4, viewGroup3);
        viewGroup2.addView(viewGroup3);
        if (p0Var.mo134670x74219ae7() && (viewGroup = this.f383770c) != null) {
            viewGroup.setVisibility(8);
        }
        d();
    }

    public abstract void d();

    public void e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, android.view.ViewGroup teachContainer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(teachContainer, "teachContainer");
        recyclerView.setOnTouchListener(new jv4.c(this));
        recyclerView.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this.f383768a.mo134669x19263085()));
        recyclerView.mo7960x6cab2c8d((jv4.p) ((jz5.n) this.f383772e).mo141623x754a37bb());
        recyclerView.m7964x8d4ad49c(null);
        this.f383769b = new nv4.e(recyclerView, new nv4.a((jv4.k) ((jz5.n) this.f383773f).mo141623x754a37bb()));
    }
}
