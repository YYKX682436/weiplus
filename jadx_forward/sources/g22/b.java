package g22;

/* loaded from: classes12.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final g22.a f349328d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f349329e = new java.util.LinkedList();

    public b(g22.a aVar) {
        this.f349328d = aVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f349329e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        g22.e holder = (g22.e) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f349329e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.ri0 ri0Var = (r45.ri0) obj;
        holder.f349338g = ri0Var;
        zq.h hVar = zq.h.f556505a;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 i18 = n22.m.i(ri0Var);
        android.widget.ImageView imageView = holder.f349337f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        hVar.d(i18, imageView, null);
        mo1894x7e414b06();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a6k, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new g22.e(inflate, this.f349328d);
    }
}
