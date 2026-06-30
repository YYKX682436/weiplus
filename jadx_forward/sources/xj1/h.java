package xj1;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f536323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732 f536324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f536325f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f536326g;

    public h(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732 c12708x81c12732, boolean z17, yz5.a aVar) {
        this.f536323d = list;
        this.f536324e = c12708x81c12732;
        this.f536325f = z17;
        this.f536326g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List list = this.f536323d;
        boolean isEmpty = list.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732 c12708x81c12732 = this.f536324e;
        if (isEmpty) {
            p012xc85e97e9.p013x9d4bf30f.k mo7430x19263085 = c12708x81c12732.mo7430x19263085();
            zj1.a aVar = mo7430x19263085 instanceof zj1.a ? (zj1.a) mo7430x19263085 : null;
            if (aVar != null) {
                aVar.H3(false);
            }
        } else {
            xj1.b0 b0Var = c12708x81c12732.f171173i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b0Var);
            synchronized (b0Var.f536313d) {
                b0Var.f536313d.clear();
                b0Var.f536313d.addAll(list);
            }
            if (this.f536325f) {
                xj1.b0 b0Var2 = c12708x81c12732.f171173i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b0Var2);
                b0Var2.m8151xc67946d3(0, list.size());
            } else {
                xj1.b0 b0Var3 = c12708x81c12732.f171173i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b0Var3);
                b0Var3.m8153xd399a4d9(0, list.size());
            }
        }
        java.lang.Runnable runnable = (java.lang.Runnable) this.f536326g.mo152xb9724478();
        if (runnable != null) {
            runnable.run();
        }
    }
}
