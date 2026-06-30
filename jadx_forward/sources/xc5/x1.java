package xc5;

/* loaded from: classes3.dex */
public final class x1 extends lf3.o implements lf3.j {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f535119d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.a4 f535120e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f535121f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f535122g;

    /* renamed from: h, reason: collision with root package name */
    public lf3.i f535123h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f535120e = new com.p314xaae8f345.mm.ui.p2740x696c9db.a4();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    @Override // lf3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E2(android.view.View r21) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.x1.E2(android.view.View):void");
    }

    @Override // lf3.j
    public void N3(lf3.i iVar) {
        this.f535123h = iVar;
    }

    @Override // lf3.o
    public int T6() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ejd;
    }

    public final java.lang.String V6() {
        mf3.k V6;
        sf3.g e17;
        xc5.a aVar = (xc5.a) U6(xc5.a.class);
        if (aVar == null || (V6 = ((xc5.d) aVar).V6()) == null || (e17 = V6.e()) == null) {
            return null;
        }
        sf3.g b17 = e17.b(sf3.m.f488936e);
        sf3.m mVar = b17.f488924e;
        sf3.m mVar2 = sf3.m.f488935d;
        if (mVar != mVar2) {
            return b17.c();
        }
        sf3.g b18 = e17.b(sf3.m.f488937f, sf3.m.f488939h);
        if (b18.f488924e != mVar2) {
            return b18.c();
        }
        return null;
    }

    public final void W6(android.view.View view, android.view.View view2, yz5.a aVar) {
        view2.animate().setDuration(200L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).alpha(0.0f).setListener(new xc5.s1(this)).start();
        view.animate().setDuration(200L).setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f)).alpha(0.0f).setUpdateListener(new xc5.t1(this)).setListener(new xc5.u1(aVar)).start();
    }

    @Override // lf3.j
    public void d3(float f17) {
        android.view.View view = this.f535119d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryPageAnimationComponent", "setBgAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryPageAnimationComponent", "setBgAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        lf3.i iVar = this.f535123h;
        if (iVar != null) {
            ((yh5.e) iVar).V6(f17);
        }
    }

    @Override // lf3.j
    public void m6(android.view.View contentView, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        if (this.f535121f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryPageAni", "enter: already running");
            return;
        }
        android.view.View view = this.f535119d;
        if (view == null) {
            return;
        }
        this.f535121f = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryPageAnimationComponent", "runAlphaEnter", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        contentView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(contentView, "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryPageAnimationComponent", "runAlphaEnter", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryPageAnimationComponent", "runAlphaEnter", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryPageAnimationComponent", "runAlphaEnter", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.animate().setDuration(200L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).alpha(1.0f).setListener(null).start();
        contentView.animate().setDuration(200L).setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f)).alpha(1.0f).setListener(new xc5.r1(this)).start();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.tzq);
        if (findViewById == null) {
            return false;
        }
        E2(findViewById);
        return true;
    }

    @Override // lf3.o, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        this.f535119d = contentView.findViewById(com.p314xaae8f345.mm.R.id.ght);
    }
}
