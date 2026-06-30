package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes15.dex */
public final class qb implements oe1.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12693xccd93dc7 f171496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f171497b;

    public qb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12693xccd93dc7 activityC12693xccd93dc7, android.view.View view) {
        this.f171496a = activityC12693xccd93dc7;
        this.f171497b = view;
    }

    @Override // oe1.k1
    public final void a(boolean z17) {
        android.view.View view = this.f171497b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12693xccd93dc7 activityC12693xccd93dc7 = this.f171496a;
        if (z17) {
            ((android.widget.ImageView) activityC12693xccd93dc7.findViewById(com.p314xaae8f345.mm.R.id.l3v)).setVisibility(0);
            ((android.widget.ImageView) activityC12693xccd93dc7.findViewById(com.p314xaae8f345.mm.R.id.l4q)).setVisibility(0);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((android.widget.RelativeLayout.LayoutParams) layoutParams).bottomMargin = activityC12693xccd93dc7.f171017v;
            return;
        }
        ((android.widget.ImageView) activityC12693xccd93dc7.findViewById(com.p314xaae8f345.mm.R.id.l3v)).setVisibility(8);
        ((android.widget.ImageView) activityC12693xccd93dc7.findViewById(com.p314xaae8f345.mm.R.id.l4q)).setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((android.widget.RelativeLayout.LayoutParams) layoutParams2).bottomMargin = activityC12693xccd93dc7.f171016u;
    }
}
