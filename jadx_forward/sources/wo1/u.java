package wo1;

/* loaded from: classes5.dex */
public final class u extends wo1.l {

    /* renamed from: f, reason: collision with root package name */
    public boolean f529565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wo1.v f529566g;

    public u(wo1.v vVar) {
        this.f529566g = vVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f529566g.f77372x5644142d.size() + 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return i17 == 0 ? 1 : 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View view = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.ImageView");
        android.widget.ImageView imageView = (android.widget.ImageView) view;
        if (i17 == 0) {
            if (this.f529565f) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ctw);
                return;
            } else {
                imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cw9);
                return;
            }
        }
        wo1.v vVar = this.f529566g;
        java.lang.Object obj = vVar.f77372x5644142d.get(i17 - 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        java.lang.String str = (java.lang.String) obj;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, null);
        imageView.setOnClickListener(new wo1.s(vVar, str));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dus, parent, false);
        if (i17 == 1) {
            int dimension = (int) parent.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            inflate.setPadding(dimension, dimension, dimension, dimension);
            inflate.setOnClickListener(new wo1.t(this));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        wo1.r rVar = new wo1.r(this, inflate);
        inflate.setTag(rVar);
        return rVar;
    }
}
