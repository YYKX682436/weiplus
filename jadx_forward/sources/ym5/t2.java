package ym5;

/* loaded from: classes10.dex */
public final class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f545068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22792x31410810 f545069e;

    public t2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var, com.p314xaae8f345.mm.p2776x373aa5.C22792x31410810 c22792x31410810) {
        this.f545068d = f2Var;
        this.f545069e = c22792x31410810;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = this.f545068d;
        eb5.d dVar = (eb5.d) f2Var;
        int mo1894x7e414b06 = dVar.mo1894x7e414b06() - 1;
        if (mo1894x7e414b06 > 0 || mo1894x7e414b06 < dVar.f332454d.size()) {
            dVar.f332454d.remove(mo1894x7e414b06);
            dVar.m8155x27702c4(mo1894x7e414b06);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22792x31410810 c22792x31410810 = this.f545069e;
        f2Var.mo8163xed962dec(c22792x31410810.getDataObserver());
        com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b = c22792x31410810.pagerView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c22800xb2c6317b, arrayList.toArray(), "com/tencent/mm/view/MediaBanner", "selectViewAt", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
        c22800xb2c6317b.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c22800xb2c6317b, "com/tencent/mm/view/MediaBanner", "selectViewAt", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
        c22800xb2c6317b.g1(0, true, true);
        c22792x31410810.b();
    }
}
