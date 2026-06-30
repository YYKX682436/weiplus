package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class e implements com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.s1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC15995xdf941836 f222795a;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC15995xdf941836 activityC15995xdf941836) {
        this.f222795a = activityC15995xdf941836;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.s1
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16005x8451a937 c16005x8451a937;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC15995xdf941836 activityC15995xdf941836 = this.f222795a;
        if (activityC15995xdf941836.f222632o == null || (c16005x8451a937 = activityC15995xdf941836.f222633p) == null || !c16005x8451a937.m7481x7a6e8df6() || !activityC15995xdf941836.f222632o.m7481x7a6e8df6()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16006x4c6b7dbb c16006x4c6b7dbb = activityC15995xdf941836.f222632o;
        o43.c cVar = c16006x4c6b7dbb.f222678f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
        android.view.ViewGroup.LayoutParams layoutParams = cVar.f424382b.getLayoutParams();
        if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
            ((android.widget.FrameLayout.LayoutParams) layoutParams).bottomMargin = i17;
        }
        o43.c cVar2 = c16006x4c6b7dbb.f222678f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar2);
        cVar2.f424382b.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16005x8451a937 c16005x8451a9372 = activityC15995xdf941836.f222633p;
        o43.a aVar = c16005x8451a9372.f222665e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
        android.view.ViewGroup.LayoutParams layoutParams2 = aVar.f424373c.getLayoutParams();
        if (layoutParams2 instanceof android.widget.FrameLayout.LayoutParams) {
            ((android.widget.FrameLayout.LayoutParams) layoutParams2).bottomMargin = i17;
        }
        o43.a aVar2 = c16005x8451a9372.f222665e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar2);
        aVar2.f424373c.setLayoutParams(layoutParams2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.s1
    public void b(java.lang.String str) {
    }
}
