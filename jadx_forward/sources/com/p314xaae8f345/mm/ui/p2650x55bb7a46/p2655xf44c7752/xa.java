package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes12.dex */
public class xa extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f283096d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.wa(this);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316 f283097e;

    public xa(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316 viewOnClickListenerC21789x2eb4d316) {
        this.f283097e = viewOnClickListenerC21789x2eb4d316;
    }

    public void b(boolean z17) {
        java.lang.Runnable runnable = this.f283096d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316 viewOnClickListenerC21789x2eb4d316 = this.f283097e;
        if (!z17) {
            viewOnClickListenerC21789x2eb4d316.f282279g.removeCallbacks(runnable);
            viewOnClickListenerC21789x2eb4d316.f282279g.postDelayed(runnable, 256L);
            return;
        }
        viewOnClickListenerC21789x2eb4d316.f282279g.removeCallbacks(runnable);
        if (viewOnClickListenerC21789x2eb4d316.f282279g.getVisibility() != 0) {
            viewOnClickListenerC21789x2eb4d316.f282279g.clearAnimation();
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(viewOnClickListenerC21789x2eb4d316.mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc);
            viewOnClickListenerC21789x2eb4d316.f282279g.setVisibility(0);
            viewOnClickListenerC21789x2eb4d316.f282279g.startAnimation(loadAnimation);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        zb5.f fVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.a0 a0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316 viewOnClickListenerC21789x2eb4d316 = this.f283097e;
        if (1 == i17) {
            b(true);
            com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46128x89c4face(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45892xbfcecaf(), viewOnClickListenerC21789x2eb4d316.f282287r);
            viewOnClickListenerC21789x2eb4d316.f282287r = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45892xbfcecaf(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45891x31dd5cd7(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45890x8fe6e5fc(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45893xfc624a32(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45894x8fe728d2() ? android.os.Process.myTid() : 0, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45895x85406bb5(), 703, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45889x4974562(), "MicroMsg.MediaHistoryGalleryUI");
        } else if (i17 == 0) {
            b(false);
        }
        if (c1163xf1deaba4.getLayoutManager() instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
            if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) c1163xf1deaba4.getLayoutManager()).w() == 0 && !viewOnClickListenerC21789x2eb4d316.f282288s && (fVar = viewOnClickListenerC21789x2eb4d316.f282276d) != null && (a0Var = viewOnClickListenerC21789x2eb4d316.f282277e) != null && !a0Var.f279925o) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3) fVar).j(false, -1);
            }
            viewOnClickListenerC21789x2eb4d316.f282288s = false;
            n11.a.b().n(i17);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316 viewOnClickListenerC21789x2eb4d316 = this.f283097e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3) viewOnClickListenerC21789x2eb4d316.f282276d).d(viewOnClickListenerC21789x2eb4d316);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.a0 a0Var = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3) viewOnClickListenerC21789x2eb4d316.f282276d).f283894i;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.w x17 = a0Var.x(c1162x665295de.w());
        if (x17 == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        java.lang.String d17 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().d(new java.util.Date(x17.f279982d), a0Var.f279917d);
        android.widget.TextView textView = viewOnClickListenerC21789x2eb4d316.f282279g;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (d17 == null) {
            d17 = "";
        }
        textView.setText(d17);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
