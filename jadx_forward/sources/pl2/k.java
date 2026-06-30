package pl2;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl2.s f438163d;

    public k(pl2.s sVar) {
        this.f438163d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pl2.s sVar = this.f438163d;
        if (sVar.f438189k.size() < 2) {
            com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = sVar.f438186h;
            if (c22851x22587864 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sidebarRvLayout");
                throw null;
            }
            c22851x22587864.m82942xeab9e637(true);
            xx2.l lVar = sVar.f438181c;
            if (lVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderSideBar");
                throw null;
            }
            android.view.View findViewById = lVar.f539517f.findViewById(com.p314xaae8f345.mm.R.id.u4q);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) findViewById;
            c22627xa933f8e4.setVisibility(0);
            c22627xa933f8e4.d();
        }
    }
}
