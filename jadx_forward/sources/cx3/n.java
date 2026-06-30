package cx3;

/* loaded from: classes5.dex */
public final class n extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f306101d = {android.R.color.holo_blue_dark, android.R.color.holo_green_dark, android.R.color.holo_red_dark, android.R.color.holo_orange_dark};

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17170x7687e6c5 f306102e;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17170x7687e6c5 c17170x7687e6c5) {
        this.f306102e = c17170x7687e6c5;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f306102e.f239623h.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View view = holder.f3639x46306858;
        int[] iArr = this.f306101d;
        view.setBackgroundResource(iArr[i17 % iArr.length]);
        android.widget.TextView textView = ((cx3.m) holder).f306100d;
        textView.setText("这是数据项" + i17);
        textView.setTextColor(textView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17170x7687e6c5 c17170x7687e6c5 = this.f306102e;
        android.view.View inflate = android.view.LayoutInflater.from(c17170x7687e6c5.mo7438x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cfh, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new cx3.m(c17170x7687e6c5, inflate);
    }
}
