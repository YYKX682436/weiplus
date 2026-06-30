package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f199497a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.l f199498b;

    public c5(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f199497a = context;
    }

    public final void a(boolean z17, java.util.List anchorVideoLevels, int i17) {
        int dimensionPixelOffset;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorVideoLevels, "anchorVideoLevels");
        android.content.Context context = this.f199497a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.io ioVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.io(context, 0, true, true);
        ioVar.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.b0d);
        if (context.getResources().getConfiguration().orientation == 2) {
            android.view.ViewGroup.LayoutParams layoutParams = ioVar.f293560f.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = com.p314xaae8f345.mm.ui.bl.b(context).y;
                layoutParams.height = -1;
            }
            ioVar.A = com.p314xaae8f345.mm.ui.bl.b(context).y;
            ioVar.m(java.lang.Boolean.TRUE);
        }
        ioVar.f293560f.findViewById(com.p314xaae8f345.mm.R.id.cru).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a5(ioVar));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ioVar.f293560f.findViewById(com.p314xaae8f345.mm.R.id.crw);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext()));
        c1163xf1deaba4.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y4(anchorVideoLevels, i17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b5(this, ioVar)));
        android.view.ViewGroup.LayoutParams layoutParams2 = c1163xf1deaba4.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
        if (z17) {
            c1163xf1deaba4.getLayoutParams().height = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y - c1163xf1deaba4.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
            dimensionPixelOffset = c1163xf1deaba4.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        } else {
            dimensionPixelOffset = c1163xf1deaba4.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj) + com.p314xaae8f345.mm.ui.bl.c(c1163xf1deaba4.getContext());
        }
        marginLayoutParams.bottomMargin = dimensionPixelOffset;
        ioVar.s();
    }
}
