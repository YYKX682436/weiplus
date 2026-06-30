package px2;

/* loaded from: classes2.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f440436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c f440437e;

    public m0(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c c15413x7c45044c) {
        this.f440436d = s0Var;
        this.f440437e = c15413x7c45044c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o17 = this.f440436d.o();
        px2.v0 callback = this.f440437e.getCallback();
        int i17 = callback != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.at) callback).f215336b.f217151s : -1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(o17, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout$addPreview$2$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        o17.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(o17, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout$addPreview$2$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
