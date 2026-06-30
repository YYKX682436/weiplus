package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class we extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f110969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we(com.tencent.mm.plugin.finder.feed.af afVar) {
        super(0);
        this.f110969d = afVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.af afVar = this.f110969d;
        afVar.W6();
        android.widget.LinearLayout linearLayout = afVar.f106262m;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("concertLoadingLayout");
            throw null;
        }
        linearLayout.setVisibility(8);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = afVar.F;
        if (constraintLayout == null) {
            kotlin.jvm.internal.o.o("concertRetryLayout");
            throw null;
        }
        constraintLayout.setVisibility(0);
        com.tencent.mm.view.RCConstraintLayout rCConstraintLayout = afVar.f106260i;
        if (rCConstraintLayout == null) {
            kotlin.jvm.internal.o.o("concertTicketViewRoot");
            throw null;
        }
        rCConstraintLayout.setVisibility(8);
        com.tencent.mm.plugin.finder.view.ConcertTicketTextView concertTicketTextView = afVar.f106257f;
        if (concertTicketTextView == null) {
            kotlin.jvm.internal.o.o("shareBtn");
            throw null;
        }
        concertTicketTextView.setVisibility(8);
        com.tencent.mm.plugin.finder.view.ConcertTicketTextView concertTicketTextView2 = afVar.f106264o;
        if (concertTicketTextView2 == null) {
            kotlin.jvm.internal.o.o("saveImgBtn");
            throw null;
        }
        concertTicketTextView2.setVisibility(8);
        com.tencent.mm.plugin.finder.view.ConcertTicketTextView concertTicketTextView3 = afVar.f106265p;
        if (concertTicketTextView3 == null) {
            kotlin.jvm.internal.o.o("changeImgBtn");
            throw null;
        }
        concertTicketTextView3.setVisibility(8);
        android.view.View view = afVar.f106258g;
        if (view == null) {
            kotlin.jvm.internal.o.o("playDivider");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$showRetry$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$showRetry$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.view.ConcertTicketTextView concertTicketTextView4 = afVar.f106268q;
        if (concertTicketTextView4 == null) {
            kotlin.jvm.internal.o.o("miniShareBtn");
            throw null;
        }
        concertTicketTextView4.setVisibility(8);
        android.view.View view2 = afVar.f106269r;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("miniShareDivider");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$showRetry$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$showRetry$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView = afVar.E;
        if (imageView != null) {
            imageView.setImageDrawable(new android.graphics.drawable.ColorDrawable(afVar.getContext().getResources().getColor(com.tencent.mm.R.color.f478501l)));
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("concertlayoutBg");
        throw null;
    }
}
