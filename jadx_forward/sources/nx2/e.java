package nx2;

/* loaded from: classes2.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f422873d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f422874e;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f422873d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        nx2.f holder = (nx2.f) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        holder.f3639x46306858.setOnClickListener(new nx2.d(this, holder, i17));
        int i18 = this.f422874e;
        android.widget.ImageView imageView = holder.f422875d;
        if (i18 == i17) {
            if (imageView != null) {
                imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ayt);
            }
        } else if (imageView != null) {
            imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.afl);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bl7, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new nx2.f(inflate);
    }
}
