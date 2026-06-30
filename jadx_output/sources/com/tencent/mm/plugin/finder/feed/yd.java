package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class yd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f111160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f111161e;

    public yd(com.tencent.mm.plugin.finder.feed.af afVar, boolean z17) {
        this.f111160d = afVar;
        this.f111161e = z17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String string;
        java.lang.String string2;
        r45.xn1 xn1Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.lang.String headUrl;
        java.lang.String string3;
        java.lang.String string4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$initData$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.af afVar = this.f111160d;
        android.widget.LinearLayout linearLayout = afVar.f106262m;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("concertLoadingLayout");
            throw null;
        }
        linearLayout.setVisibility(0);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = afVar.F;
        if (constraintLayout == null) {
            kotlin.jvm.internal.o.o("concertRetryLayout");
            throw null;
        }
        constraintLayout.setVisibility(8);
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
        com.tencent.mm.plugin.finder.view.ConcertTicketTextView concertTicketTextView4 = afVar.f106268q;
        if (concertTicketTextView4 == null) {
            kotlin.jvm.internal.o.o("miniShareBtn");
            throw null;
        }
        concertTicketTextView4.setVisibility(8);
        com.tencent.mm.plugin.finder.feed.af afVar2 = this.f111160d;
        afVar2.W = 0;
        r45.l70 l70Var = afVar2.U;
        java.lang.String str = (l70Var == null || (string4 = l70Var.getString(8)) == null) ? "" : string4;
        r45.l70 l70Var2 = afVar.U;
        java.lang.String str2 = (l70Var2 == null || (string3 = l70Var2.getString(2)) == null) ? "" : string3;
        r45.m70 m70Var = afVar.T;
        java.lang.String str3 = (m70Var == null || (xn1Var = (r45.xn1) m70Var.getCustom(7)) == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null || (headUrl = finderContact.getHeadUrl()) == null) ? "" : headUrl;
        r45.l70 l70Var3 = afVar.U;
        java.lang.String str4 = (l70Var3 == null || (string2 = l70Var3.getString(3)) == null) ? "" : string2;
        r45.l70 l70Var4 = afVar.U;
        afVar2.h7(str, str2, str3, str4, (l70Var4 == null || (string = l70Var4.getString(9)) == null) ? "" : string, this.f111161e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$initData$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
