package of2;

/* loaded from: classes8.dex */
public final class d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f426603d;

    /* renamed from: e, reason: collision with root package name */
    public final nf2.l1[] f426604e;

    /* renamed from: f, reason: collision with root package name */
    public final int f426605f;

    /* renamed from: g, reason: collision with root package name */
    public final int f426606g;

    /* renamed from: h, reason: collision with root package name */
    public final int f426607h;

    /* renamed from: i, reason: collision with root package name */
    public final int f426608i;

    /* renamed from: m, reason: collision with root package name */
    public final int f426609m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ of2.m f426610n;

    public d(of2.m mVar, yz5.l onItemClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClick, "onItemClick");
        this.f426610n = mVar;
        this.f426603d = onItemClick;
        this.f426604e = nf2.l1.m149500xcee59d22();
        this.f426605f = ym5.x.a(mVar.f199716e, 2.0f);
        this.f426606g = ym5.x.a(mVar.f199716e, 3.0f);
        this.f426607h = mVar.f199716e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19);
        this.f426608i = mVar.f199716e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adh);
        this.f426609m = mVar.f199716e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f426604e.length;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        of2.b holder = (of2.b) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        nf2.l1 l1Var = this.f426604e[i17];
        of2.m mVar = this.f426610n;
        boolean z17 = l1Var == mVar.K;
        l1Var.getClass();
        android.content.Context context = mVar.f199716e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(0);
        of2.d dVar = holder.f426600f;
        if (z17) {
            gradientDrawable.setStroke(dVar.f426606g, dVar.f426607h);
        } else {
            gradientDrawable.setStroke(0, dVar.f426607h);
        }
        holder.f426598d.setBackground(gradientDrawable);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(l1Var.f418308d);
        gradientDrawable2.setStroke(dVar.f426605f, z17 ? dVar.f426609m : dVar.f426608i);
        holder.f426599e.setBackground(gradientDrawable2);
        holder.f3639x46306858.setOnClickListener(new of2.c(this, l1Var));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f426610n.f199716e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570456ea4, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new of2.b(this, inflate);
    }
}
