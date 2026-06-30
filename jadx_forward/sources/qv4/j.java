package qv4;

/* loaded from: classes12.dex */
public final class j extends jv4.e {

    /* renamed from: g, reason: collision with root package name */
    public boolean f448515g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f448516h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f448517i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(su4.p0 config) {
        super(config);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f448515g = true;
        this.f448516h = jz5.h.b(new qv4.i(this, config));
        this.f448517i = jz5.h.b(qv4.h.f448510d);
    }

    @Override // jv4.e
    public jv4.h a() {
        return f();
    }

    @Override // jv4.e
    public int b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.efz;
    }

    @Override // jv4.e
    public void d() {
        if (this.f383768a.mo134670x74219ae7()) {
            return;
        }
        f().k();
    }

    @Override // jv4.e
    public void e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, android.view.ViewGroup teachContainer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(teachContainer, "teachContainer");
        super.e(recyclerView, teachContainer);
        android.view.View findViewById = teachContainer.findViewById(com.p314xaae8f345.mm.R.id.f566610tz1);
        android.view.ViewGroup viewGroup = findViewById instanceof android.view.ViewGroup ? (android.view.ViewGroup) findViewById : null;
        android.widget.TextView textView = viewGroup != null ? (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.tyu) : null;
        android.widget.TextView textView2 = textView instanceof android.widget.TextView ? textView : null;
        su4.p0 p0Var = this.f383768a;
        if (p0Var.mo134670x74219ae7() || p0Var.m()) {
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
        } else {
            if (textView2 != null) {
                textView2.setOnClickListener(new qv4.f(this));
            }
            f().g().w();
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new qv4.g(recyclerView, this, viewGroup));
        }
    }

    public final qv4.r0 f() {
        return (qv4.r0) ((jz5.n) this.f448516h).mo141623x754a37bb();
    }
}
