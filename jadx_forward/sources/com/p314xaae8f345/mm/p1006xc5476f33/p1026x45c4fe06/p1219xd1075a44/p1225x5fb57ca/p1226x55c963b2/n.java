package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2;

/* loaded from: classes15.dex */
public class n implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ListView f172879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.o f172880e;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.o oVar, android.widget.ListView listView, int i17) {
        this.f172880e = oVar;
        this.f172879d = listView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.v vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4 t4Var;
        android.view.View mo53433x400bc850;
        int i17;
        this.f172879d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.o oVar = this.f172880e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.s sVar = oVar.f172882b;
        if (sVar.b() && (vVar = sVar.f172825d) != null && vVar.getAdapter() != null && sVar.f172825d.getAdapter().getCount() > 0 && (mo53433x400bc850 = (t4Var = oVar.f172881a).mo53433x400bc850()) != null) {
            int b17 = i65.a.b(t4Var.m53522x76847179(), 8);
            int height = sVar.f172825d.getChildAt(0).getHeight();
            int count = sVar.f172825d.getAdapter().getCount() * height;
            int i18 = b17 * 2;
            int i19 = count + i18;
            int i27 = (height * 3) + i18;
            if (i19 > i27) {
                i17 = i27 - i18;
                i19 = i27;
            } else {
                i17 = count;
            }
            sVar.f172826e = i19;
            int[] iArr = new int[2];
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 e4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4) t4Var;
            e4Var.m53466xfb86a31b().getLocationInWindow(iArr);
            int height2 = iArr[1] + e4Var.m53466xfb86a31b().getHeight();
            mo53433x400bc850.getLocationInWindow(iArr);
            oVar.a(height2, iArr[1], height, i17, b17);
            sVar.c();
            oVar.f172885e = sVar.f172829h ? sVar.f172828g : 0;
        }
        return true;
    }
}
