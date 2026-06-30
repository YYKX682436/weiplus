package qf4;

/* loaded from: classes4.dex */
public final class f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f444224d = "loadingMore";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f444225e = "favorite";

    /* renamed from: f, reason: collision with root package name */
    public final int f444226f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final int f444227g = 2;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f444228h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final int f444229i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f444230m;

    /* renamed from: n, reason: collision with root package name */
    public int f444231n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.l f444232o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.a f444233p;

    public f() {
        new java.util.ArrayList();
        df4.a aVar = df4.b.f313571a;
        this.f444229i = new java.util.GregorianCalendar().get(1);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f444228h.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        java.util.ArrayList arrayList = this.f444228h;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((qf4.h) arrayList.get(i17)).f444234a, this.f444224d)) {
            return this.f444226f;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((qf4.h) arrayList.get(i17)).f444234a, this.f444225e)) {
            return this.f444227g;
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        qf4.e holder = (qf4.e) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        holder.i(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == this.f444226f) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571074cw3, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            dVar = new qf4.c(this, inflate);
        } else if (i17 == this.f444227g) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571072cw1, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
            dVar = new qf4.b(this, inflate2);
        } else {
            android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571073cw2, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate3, "inflate(...)");
            dVar = new qf4.d(this, inflate3);
        }
        if (dVar instanceof qf4.d) {
            ((qf4.d) dVar).f444220f.N(new qf4.g());
        }
        return dVar;
    }
}
