package cw2;

/* loaded from: classes2.dex */
public final class n1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 f305412d;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90) {
        this.f305412d = c15178x4303ff90;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 m61248xe86a733b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 m61248xe86a733b2;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1656x35ce78.C15210x60aafb55 m61214x2f13401b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$enlargeSeekBarListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90.f212079x0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = this.f305412d;
        if ((c15178x4303ff90.x() && !c15178x4303ff90.isSeekMode) || c15178x4303ff90.getRequestNotSeek()) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$enlargeSeekBarListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (c15178x4303ff90.m(view, motionEvent)) {
            android.graphics.Rect rect = c15178x4303ff90.U;
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getX(), rect.top + (rect.height() / 2.0f), motionEvent.getMetaState());
            if (c15178x4303ff90.getBeforeDragStyle() == -1) {
                m61248xe86a733b2 = c15178x4303ff90.m61248xe86a733b();
                if ((m61248xe86a733b2 == null || (m61214x2f13401b = m61248xe86a733b2.m61214x2f13401b()) == null || m61214x2f13401b.getVisibility() != 0) ? false : true) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                    i17 = (((java.lang.Number) t70Var.G1().r()).intValue() == 5 || ((java.lang.Number) t70Var.G1().r()).intValue() == 3) ? 3 : 2;
                } else {
                    i17 = 1;
                }
                c15178x4303ff90.m61274xeff6b5c(i17);
            }
            android.content.Context context = c15178x4303ff90.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o00) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o00.class)).P6();
            m61248xe86a733b = c15178x4303ff90.m61248xe86a733b();
            if (m61248xe86a733b != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obtain);
                m61248xe86a733b.C(obtain);
            }
            z17 = true;
        } else {
            c15178x4303ff90.V = false;
            c15178x4303ff90.m61274xeff6b5c(-1);
            z17 = false;
        }
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            c15178x4303ff90.V = false;
            c15178x4303ff90.m61274xeff6b5c(-1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15180x393a0b2f m61264xe34baebb = c15178x4303ff90.m61264xe34baebb();
            if (m61264xe34baebb != null) {
                m61264xe34baebb.m61302x598c5814(false);
            }
        }
        if (!c15178x4303ff90.V) {
            c15178x4303ff90.getParent().requestDisallowInterceptTouchEvent(false);
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$enlargeSeekBarListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
