package lv4;

/* loaded from: classes12.dex */
public class b implements jv4.n {

    /* renamed from: a, reason: collision with root package name */
    public final mv4.d f403045a;

    /* renamed from: b, reason: collision with root package name */
    public final rv4.y f403046b;

    /* renamed from: c, reason: collision with root package name */
    public final rv4.w f403047c;

    /* renamed from: d, reason: collision with root package name */
    public final jv4.m f403048d;

    public b(mv4.d data, rv4.y delegate, rv4.w session) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        this.f403045a = data;
        this.f403046b = delegate;
        this.f403047c = session;
        this.f403048d = jv4.m.f383777g;
    }

    @Override // jv4.n
    public void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        lv4.o oVar = holder instanceof lv4.o ? (lv4.o) holder : null;
        if (oVar == null) {
            return;
        }
        qv4.e eVar = (qv4.e) oVar;
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) eVar.f448499f).mo141623x754a37bb();
        mv4.d dVar = this.f403045a;
        if (textView != null) {
            textView.setText(dVar.mo148471x7531c8a2());
        }
        dVar.f(dVar.a());
        android.view.View view = ((qv4.e) ((lv4.o) holder)).f448497d;
        dVar.b(view.getMeasuredHeight());
        com.p314xaae8f345.mm.ui.kk.f(view, dVar.mo148470xc1272e11());
        android.view.View view2 = (android.view.View) ((jz5.n) eVar.f448498e).mo141623x754a37bb();
        if (view2 != null) {
            view2.setOnClickListener(new lv4.a(this));
        }
        jv4.i iVar = this.f403047c.f482090c;
        if (iVar != null) {
            ((jv4.e) ((jv4.p) iVar).f383795e).f383768a.g();
        }
    }

    @Override // jv4.n
    /* renamed from: getType */
    public jv4.m mo141457xfb85f7b0() {
        return this.f403048d;
    }

    @Override // nv4.g
    public java.lang.String v() {
        return "box-title-" + this.f403045a.mo148471x7531c8a2();
    }

    @Override // nv4.g
    public void w() {
    }
}
