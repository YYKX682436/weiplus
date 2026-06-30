package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class a5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16367x1189c620 f228226d;

    public a5(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16367x1189c620 activityC16367x1189c620) {
        this.f228226d = activityC16367x1189c620;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16367x1189c620 activityC16367x1189c620 = this.f228226d;
        activityC16367x1189c620.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        activityC16367x1189c620.f227653d = (rect.width() - (sp5.c.a(8) * 3)) / 2;
        int i17 = activityC16367x1189c620.f227653d;
        activityC16367x1189c620.f227654e = (int) (i17 * 1.9844f);
        activityC16367x1189c620.f227655f = i17 - (sp5.c.a(8) * 2);
        int i18 = activityC16367x1189c620.f227655f;
        activityC16367x1189c620.f227656g = (int) (i18 * 1.656f);
        activityC16367x1189c620.f227657h = (int) (i18 * 1.38f);
        activityC16367x1189c620.f227658i = (int) (i18 / 2.9f);
        int i19 = (int) (i18 / 1.1f);
        activityC16367x1189c620.f227659m = i19;
        activityC16367x1189c620.f227660n = (int) (i19 * 1.656f);
        activityC16367x1189c620.f227663q = (int) (i19 * 1.38f);
        activityC16367x1189c620.f227664r = (int) (i19 / 2.9f);
        activityC16367x1189c620.f227661o = i18;
        activityC16367x1189c620.f227662p = (int) (i18 * 1.72f);
    }
}
