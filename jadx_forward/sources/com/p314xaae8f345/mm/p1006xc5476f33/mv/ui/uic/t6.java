package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class t6 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f8 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ss4 f232992d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f232993e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f232994f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f232995g;

    /* renamed from: h, reason: collision with root package name */
    public int f232996h;

    /* renamed from: i, reason: collision with root package name */
    public final int f232997i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f232998m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f232999n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f8 f233000o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f232993e = new java.util.ArrayList();
        this.f232995g = new java.util.LinkedList();
        this.f232996h = -1;
        this.f232997i = i65.a.f(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        this.f232998m = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.o6(this));
        this.f232999n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.r6(activity));
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf O6() {
        return (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) ((jz5.n) this.f232998m).mo141623x754a37bb();
    }

    public final void P6(int i17) {
        java.util.ArrayList arrayList = this.f232993e;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l6 l6Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l6) kz5.n0.a0(arrayList, this.f232996h);
        if (l6Var != null) {
            l6Var.f232811g = false;
            O6().m8148xed6e4d18(this.f232996h + O6().a0(), 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l6 l6Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l6) kz5.n0.a0(arrayList, i17);
        if (l6Var2 != null) {
            l6Var2.f232812h = 0.0f;
            l6Var2.f232811g = true;
            O6().m8148xed6e4d18(O6().a0() + i17, 1);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f232994f;
        if (c22849x81a93d25 != null) {
            int a07 = O6().a0() + i17;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(a07));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c22849x81a93d25, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC", "selectMedia", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            c22849x81a93d25.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c22849x81a93d25, "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC", "selectMedia", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        this.f232996h = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f8
    /* renamed from: select */
    public void mo67284xc9ff34fc(int i17) {
        P6(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f8 f8Var = this.f233000o;
        if (f8Var != null) {
            f8Var.mo67284xc9ff34fc(i17);
        }
    }
}
