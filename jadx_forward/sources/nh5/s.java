package nh5;

/* loaded from: classes3.dex */
public final class s extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f418694d;

    public s(java.util.List glInfoList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(glInfoList, "glInfoList");
        this.f418694d = glInfoList;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f418694d.size() + 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (i17 == 0) {
            return;
        }
        oi.e eVar = (oi.e) this.f418694d.get(i17 - 1);
        nh5.c0 c0Var = (nh5.c0) holder;
        java.lang.Object mo141623x754a37bb = ((jz5.n) c0Var.f418663d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb).setText("UI: " + eVar.f427098k.f436026b + '@' + eVar.f427098k.f436025a);
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) c0Var.f418664e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb2).setText("Type: " + eVar.f427092e.name());
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) c0Var.f418665f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb3).setText("res ID: " + eVar.f427089b);
        android.widget.TextView i18 = c0Var.i();
        r26.a.a(16);
        java.lang.String l17 = java.lang.Long.toString(eVar.f427094g, 16);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "toString(...)");
        i18.setText("EGLContext: 0x".concat(l17));
        c0Var.l().setText("ThreadId: " + eVar.f427088a);
        c0Var.j().setText("Java: " + eVar.a());
        c0Var.k().setText("Native: " + eVar.b());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 0) {
            return new nh5.r(android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bx9, parent, false));
        }
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bx_, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new nh5.c0(inflate);
    }
}
