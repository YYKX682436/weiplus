package nh5;

/* loaded from: classes.dex */
public final class l extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f418687d;

    public l(java.util.List data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f418687d = data;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f418687d.size() + 1;
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
        oh5.p pVar = (oh5.p) this.f418687d.get(i17 - 1);
        nh5.o oVar = (nh5.o) holder;
        java.lang.Object mo141623x754a37bb = ((jz5.n) oVar.f418690d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb).setText("So: " + pVar.f427049a);
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) oVar.f418691e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb2).setText("Alloc Size: " + pVar.f427050b + " Byte");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 0) {
            return new nh5.k(android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bx6, parent, false));
        }
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bx7, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new nh5.o(inflate);
    }
}
