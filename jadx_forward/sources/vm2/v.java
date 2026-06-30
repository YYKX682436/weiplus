package vm2;

/* loaded from: classes3.dex */
public final class v extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f519653d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f519654e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f519655f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f519656g;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f519653d = store;
        this.f519654e = jz5.h.b(new vm2.u(this));
        this.f519656g = new java.util.LinkedList();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f519656g.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0975  */
    /* JADX WARN: Type inference failed for: r25v4, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [android.view.ViewGroup] */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r38, int r39) {
        /*
            Method dump skipped, instructions count: 2522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vm2.v.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dta, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new vm2.o(inflate);
    }
}
