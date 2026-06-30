package zx;

/* loaded from: classes14.dex */
public final class t extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f558498d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f558499e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f558500f;

    /* renamed from: g, reason: collision with root package name */
    public zx.p f558501g;

    public t(java.util.List items) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        this.f558498d = items;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f558498d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        return ((zx.u) this.f558498d.get(i17)).f558505d.b().hashCode();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        zx.r holder = (zx.r) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        zx.u uVar = (zx.u) this.f558498d.get(i17);
        boolean equals = android.text.TextUtils.equals(this.f558499e, uVar.f558505d.b());
        boolean z17 = !equals && android.text.TextUtils.equals(this.f558500f, uVar.f558505d.b());
        zx.s sVar = new zx.s(this, uVar, equals, holder);
        android.view.View view = holder.f558493d;
        view.setOnLongClickListener(sVar);
        zx.i.a(uVar, equals, z17, view);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569778e06, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new zx.r(inflate);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: setHasStableIds */
    public void mo8164xbbdced85(boolean z17) {
        super.mo8164xbbdced85(true);
    }

    public final int x(java.lang.String traceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(traceId, "traceId");
        java.util.Iterator it = this.f558498d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (android.text.TextUtils.equals(((zx.u) it.next()).f558505d.b(), traceId)) {
                return i17;
            }
            i17++;
        }
        return -1;
    }
}
