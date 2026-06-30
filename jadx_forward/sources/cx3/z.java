package cx3;

/* loaded from: classes14.dex */
public final class z extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17173x786fe74f f306113d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17173x786fe74f c17173x786fe74f) {
        this.f306113d = c17173x786fe74f;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f306113d.f239610d).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        cx3.y holder = (cx3.y) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int i18 = i17 % 2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17173x786fe74f c17173x786fe74f = this.f306113d;
        android.widget.ImageView imageView = holder.f306112d;
        if (i18 == 0) {
            android.content.res.Resources m7460x893a2f6f = c17173x786fe74f.m7460x893a2f6f();
            java.lang.ThreadLocal threadLocal = d3.q.f307641a;
            imageView.setImageDrawable(d3.l.a(m7460x893a2f6f, com.p314xaae8f345.mm.R.C30861xcebc809e.bhm, null));
        } else {
            android.content.res.Resources m7460x893a2f6f2 = c17173x786fe74f.m7460x893a2f6f();
            java.lang.ThreadLocal threadLocal2 = d3.q.f307641a;
            imageView.setImageDrawable(d3.l.a(m7460x893a2f6f2, com.p314xaae8f345.mm.R.C30861xcebc809e.bho, null));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17173x786fe74f c17173x786fe74f = this.f306113d;
        android.view.View inflate = android.view.LayoutInflater.from(c17173x786fe74f.mo7438x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570935cf4, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new cx3.y(c17173x786fe74f, inflate);
    }
}
