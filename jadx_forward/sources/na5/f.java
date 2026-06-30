package na5;

/* loaded from: classes5.dex */
public class f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f417531d;

    /* renamed from: e, reason: collision with root package name */
    public final int f417532e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f417533f;

    public f(java.util.List dataList, int i17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f417531d = dataList;
        this.f417532e = i17;
        this.f417533f = list;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.List list = this.f417531d;
        int size = list.size();
        int i17 = this.f417532e;
        return size > i17 ? i17 : list.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        na5.i holder = (na5.i) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int intValue = ((java.lang.Number) this.f417531d.get(i17)).intValue();
        android.widget.ImageView imageView = holder.f417540d;
        imageView.setImageResource(intValue);
        wa5.k.a(imageView, "soontest" + i17, java.lang.Integer.valueOf(i17));
        java.util.List list = this.f417533f;
        if (list != null) {
            android.util.Pair create = android.util.Pair.create(imageView, imageView.getTransitionName());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(create, "create(...)");
            list.add(create);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public na5.i mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569477c7, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new na5.i(inflate);
    }
}
