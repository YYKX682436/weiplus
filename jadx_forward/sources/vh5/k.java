package vh5;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e f518757a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16502x5827459 f518758b;

    /* renamed from: c, reason: collision with root package name */
    public vh5.s f518759c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f518760d;

    public k(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e viewPager, com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16502x5827459 interceptorView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewPager, "viewPager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interceptorView, "interceptorView");
        this.f518757a = viewPager;
        this.f518758b = interceptorView;
        interceptorView.a();
    }

    public final void a(int i17) {
        vh5.s sVar = this.f518759c;
        vh5.q a17 = sVar != null ? sVar.a(i17) : null;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = this.f518757a;
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.ChatXGestureAdapter", "ChatXGestureAdapter disabled in position " + c21520x5bb48e5e.m80830xfda78ef6());
            b(false);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.ChatXGestureAdapter", "ChatXGestureAdapter enable in position " + c21520x5bb48e5e.m80830xfda78ef6());
        b(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16502x5827459 c16502x5827459 = this.f518758b;
        java.util.Iterator it = ((java.util.ArrayList) c16502x5827459.f230132g.f407780a).iterator();
        while (it.hasNext()) {
            ((ng3.e) it.next()).e();
        }
        mg3.b l17 = a17.l();
        vh5.g gVar = a17.f518769m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.ChatXGestureAdapter", "onPageSelected gesture: " + c21520x5bb48e5e.m80830xfda78ef6() + ' ' + l17);
        vh5.j jVar = new vh5.j(this, gVar);
        c16502x5827459.f230129d = l17;
        c16502x5827459.f230130e = jVar;
        mg3.m mVar = c16502x5827459.f230132g;
        mVar.f407782c = l17;
        mVar.f407783d = jVar;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    public final void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16502x5827459 c16502x5827459 = this.f518758b;
        if (z17) {
            c16502x5827459.setVisibility(0);
        } else {
            c16502x5827459.setVisibility(8);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.ChatXGestureAdapter", "ChatXGestureAdapter setEnabled enable: " + z17);
    }

    public final void c(boolean z17) {
        this.f518760d = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16502x5827459 c16502x5827459 = this.f518758b;
        if (!z17) {
            c16502x5827459.a();
            return;
        }
        android.content.Context context = c16502x5827459.getContext();
        mg3.m mVar = new mg3.m();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        mVar.a(new ng3.n(context));
        mVar.a(new ng3.k(context));
        mVar.a(new vh5.m(context));
        c16502x5827459.m66629x532e2873(mVar);
    }
}
