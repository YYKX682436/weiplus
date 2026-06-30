package cx3;

/* loaded from: classes14.dex */
public final class f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17168xdb4644c5 f306091d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17168xdb4644c5 c17168xdb4644c5) {
        this.f306091d = c17168xdb4644c5;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f306091d.f239610d).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        cx3.e holder = (cx3.e) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int i18 = i17 % 2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17168xdb4644c5 c17168xdb4644c5 = this.f306091d;
        android.widget.ImageView imageView = holder.f306089d;
        if (i18 == 0) {
            android.content.res.Resources m7460x893a2f6f = c17168xdb4644c5.m7460x893a2f6f();
            java.lang.ThreadLocal threadLocal = d3.q.f307641a;
            imageView.setImageDrawable(d3.l.a(m7460x893a2f6f, com.p314xaae8f345.mm.R.C30861xcebc809e.bhm, null));
        } else {
            android.content.res.Resources m7460x893a2f6f2 = c17168xdb4644c5.m7460x893a2f6f();
            java.lang.ThreadLocal threadLocal2 = d3.q.f307641a;
            imageView.setImageDrawable(d3.l.a(m7460x893a2f6f2, com.p314xaae8f345.mm.R.C30861xcebc809e.f562879c16, null));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17168xdb4644c5 c17168xdb4644c5 = this.f306091d;
        android.view.View inflate = android.view.LayoutInflater.from(c17168xdb4644c5.mo7438x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570936cf5, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new cx3.e(c17168xdb4644c5, inflate);
    }
}
