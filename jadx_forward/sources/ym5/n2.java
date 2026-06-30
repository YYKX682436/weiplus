package ym5;

/* loaded from: classes10.dex */
public final class n2 implements ym5.n3 {

    /* renamed from: a, reason: collision with root package name */
    public float f544974a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22792x31410810 f544975b;

    public n2(com.p314xaae8f345.mm.p2776x373aa5.C22792x31410810 c22792x31410810) {
        this.f544975b = c22792x31410810;
    }

    @Override // ym5.n3
    public void a(android.view.MotionEvent event) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int action = event.getAction();
        com.p314xaae8f345.mm.p2776x373aa5.C22792x31410810 c22792x31410810 = this.f544975b;
        if (action == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaBanner", "[pauseLoopPlay] isAutoPlay:" + c22792x31410810.isAutoPlay);
            if (c22792x31410810.isAutoPlay) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = c22792x31410810.f294894t;
                n3Var.mo50303x856b99f0(1);
                n3Var.mo50307xb9e94560(1, 2000L);
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parentRecyclerView = c22792x31410810.getParentRecyclerView();
        java.lang.Object layoutManager2 = parentRecyclerView != null ? parentRecyclerView.getLayoutManager() : null;
        if (!(layoutManager2 instanceof ym5.o2) || (layoutManager = c22792x31410810.getPagerView().getLayoutManager()) == null) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager3 = (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) && ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).m8020x7e414b06() > 1 ? layoutManager : null;
        if (layoutManager3 != null) {
            if (event.getAction() == 0) {
                this.f544974a = event.getRawX();
            } else if (event.getAction() == 2 && java.lang.Math.abs(event.getRawX() - this.f544974a) >= 10.0f) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) ((ym5.o2) layoutManager2)).C = false;
            }
            if (event.getAction() == 1 || event.getAction() == 3) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) ((ym5.o2) layoutManager2)).C = true;
            }
        }
    }

    @Override // ym5.n3
    public boolean b(int i17, android.view.MotionEvent event, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        this.f544975b.getClass();
        return z17;
    }
}
