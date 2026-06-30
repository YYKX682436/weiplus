package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class gx extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty f194272a;

    public gx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar) {
        this.f194272a = tyVar;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i17 = iArr[1];
        int[] iArr2 = new int[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar = this.f194272a;
        tyVar.H.getLocationInWindow(iArr2);
        int i18 = iArr2[1];
        int max = java.lang.Math.max(0, (tyVar.f196032y0 + i18) - i17);
        outline.setRect(0, max, view.getWidth(), view.getHeight());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tyVar.f196021q, "getOutline height:" + max + " yInWindow " + i17 + "  contentYInWindow " + i18);
    }
}
