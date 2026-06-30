package kp4;

/* loaded from: classes10.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0 f392618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f392619e;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0 c18814xdf4aba0, java.util.LinkedList linkedList, long j17) {
        this.f392618d = c18814xdf4aba0;
        this.f392619e = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0 c18814xdf4aba0 = this.f392618d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c18814xdf4aba0.f257588e;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        if (c1163xf1deaba4.getWidth() <= 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = c18814xdf4aba0.f257588e;
            if (c1163xf1deaba42 != null) {
                c1163xf1deaba42.post(c18814xdf4aba0.f257605y);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
        }
        c18814xdf4aba0.f257599s = i65.a.b(c18814xdf4aba0.getContext(), 40);
        if (c18814xdf4aba0.f257588e == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        float height = (r2.getHeight() * 1.0f) / c18814xdf4aba0.f257592i;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = c18814xdf4aba0.f257588e;
        if (c1163xf1deaba43 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        int width = c1163xf1deaba43.getWidth() - (c18814xdf4aba0.f257599s * 2);
        c18814xdf4aba0.f257600t = width;
        float f17 = (width * 1.0f) / ((float) c18814xdf4aba0.f257595o);
        c18814xdf4aba0.f257598r = f17;
        int i17 = (int) (f17 * ((float) c18814xdf4aba0.f257594n));
        c18814xdf4aba0.getClass();
        float f18 = i17 / (c18814xdf4aba0.f257593m * height);
        java.util.LinkedList<kp4.c1> linkedList = this.f392619e;
        for (kp4.c1 c1Var : linkedList) {
            c1Var.f392609f = ((f18 / ((float) c18814xdf4aba0.f257594n)) * ((float) (c1Var.f392608e - c1Var.f392607d))) / c1Var.f392630n.f257160l.f479039h;
            c1Var.f();
        }
        kp4.c1 c1Var2 = c18814xdf4aba0.f257601u;
        int i18 = c18814xdf4aba0.f257599s;
        c1Var2.f392606c = i18;
        kp4.c1 c1Var3 = c18814xdf4aba0.f257602v;
        c1Var3.f392606c = i18;
        float f19 = (float) c18814xdf4aba0.f257596p;
        float f27 = c18814xdf4aba0.f257598r;
        int max = java.lang.Math.max(0, java.lang.Math.min((int) (f19 * f27), (int) ((((float) c18814xdf4aba0.f257597q) * f27) - c18814xdf4aba0.f257600t)));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = c18814xdf4aba0.f257589f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(-max));
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$setTrack$4", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$setTrack$4", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linkedList.add(0, c1Var2);
        linkedList.add(c1Var3);
        kp4.r rVar = c18814xdf4aba0.f257590g;
        rVar.z(linkedList);
        rVar.m8146xced61ae5();
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a seekSlider = c18814xdf4aba0.getSeekSlider();
        if (seekSlider != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = c18814xdf4aba0.f257588e;
            if (c1163xf1deaba44 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            int width2 = c1163xf1deaba44.getWidth();
            int i19 = c18814xdf4aba0.f257599s;
            seekSlider.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.i1(seekSlider, width2 - (i19 * 2), i19, (int) (((float) 3000) * c18814xdf4aba0.f257598r)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a seekSlider2 = c18814xdf4aba0.getSeekSlider();
        if (seekSlider2 != null) {
            seekSlider2.m66939x853690dc(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a seekSlider3 = c18814xdf4aba0.getSeekSlider();
        if (seekSlider3 != null) {
            seekSlider3.post(new kp4.z0(c18814xdf4aba0, max));
        }
    }
}
