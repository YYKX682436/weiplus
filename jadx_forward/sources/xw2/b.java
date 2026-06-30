package xw2;

/* loaded from: classes10.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f539218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1661x2e06d1.C15387x98533664 f539219e;

    public b(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1661x2e06d1.C15387x98533664 c15387x98533664) {
        this.f539218d = f2Var;
        this.f539219e = c15387x98533664;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eb5.d dVar = (eb5.d) this.f539218d;
        int mo1894x7e414b06 = dVar.mo1894x7e414b06() - 1;
        if (mo1894x7e414b06 > 0 || mo1894x7e414b06 < dVar.f332454d.size()) {
            dVar.f332454d.remove(mo1894x7e414b06);
            dVar.m8155x27702c4(mo1894x7e414b06);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1661x2e06d1.C15387x98533664 c15387x98533664 = this.f539219e;
        dVar.mo8163xed962dec(c15387x98533664.f213247o);
        com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b = c15387x98533664.recyclerView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c22800xb2c6317b, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/base/MediaPlayBanner", "selectViewAt", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
        c22800xb2c6317b.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c22800xb2c6317b, "com/tencent/mm/plugin/finder/view/base/MediaPlayBanner", "selectViewAt", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
        c22800xb2c6317b.g1(0, true, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1661x2e06d1.C15387x98533664.b(c15387x98533664, 0L, 1, null);
    }
}
