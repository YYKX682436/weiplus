package of2;

/* loaded from: classes5.dex */
public final class g extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f426616d;

    /* renamed from: e, reason: collision with root package name */
    public final nf2.a[] f426617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of2.m f426618f;

    public g(of2.m mVar, yz5.l onItemClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClick, "onItemClick");
        this.f426618f = mVar;
        this.f426616d = onItemClick;
        this.f426617e = nf2.a.m149488xcee59d22();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f426617e.length;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        float f17;
        of2.e holder = (of2.e) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        nf2.a aVar = this.f426617e[i17];
        of2.m mVar = this.f426618f;
        boolean z17 = aVar == mVar.f426624J;
        aVar.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = holder.f426612e;
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79254xf5aaca68);
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            f17 = 0.0f;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            f17 = -90.0f;
        }
        c22699x3dcdb352.setRotation(f17);
        android.content.Context context = mVar.f199716e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String string = context.getString(aVar.f418184d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        holder.f426613f.setText(string);
        holder.f426611d.setBackgroundResource(z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.d2z : com.p314xaae8f345.mm.R.C30861xcebc809e.d2y);
        holder.f3639x46306858.setOnClickListener(new of2.f(this, aVar));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f426618f.f199716e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570457ea5, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new of2.e(this, inflate);
    }
}
