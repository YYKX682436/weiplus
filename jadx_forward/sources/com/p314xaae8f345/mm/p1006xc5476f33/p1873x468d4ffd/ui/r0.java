package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes7.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f230942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16552x1ceceed9 f230943e;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16552x1ceceed9 activityC16552x1ceceed9, android.widget.TextView textView) {
        this.f230943e = activityC16552x1ceceed9;
        this.f230942d = textView;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = this.f230942d;
        textView.setText("");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16552x1ceceed9 activityC16552x1ceceed9 = this.f230943e;
        textView.append(java.lang.String.format("picture size: %s, ratio: %s\n", activityC16552x1ceceed9.f230747d.m66781x8dfb48e9(), java.lang.Float.valueOf(java.lang.Math.min(activityC16552x1ceceed9.f230747d.m66781x8dfb48e9().x, activityC16552x1ceceed9.f230747d.m66781x8dfb48e9().y) / java.lang.Math.max(activityC16552x1ceceed9.f230747d.m66781x8dfb48e9().x, activityC16552x1ceceed9.f230747d.m66781x8dfb48e9().y))));
        textView.append(java.lang.String.format("video size: %s, ratio: %s\n", activityC16552x1ceceed9.f230747d.m66785x4ee02466(), java.lang.Float.valueOf(java.lang.Math.min(activityC16552x1ceceed9.f230747d.m66785x4ee02466().x, activityC16552x1ceceed9.f230747d.m66785x4ee02466().y) / java.lang.Math.max(activityC16552x1ceceed9.f230747d.m66785x4ee02466().x, activityC16552x1ceceed9.f230747d.m66785x4ee02466().y))));
        textView.append(java.lang.String.format("preview size limit: %s\n", java.lang.Integer.valueOf(activityC16552x1ceceed9.f230748e)));
        textView.append(java.lang.String.format("display ratio: %s\n", java.lang.Float.valueOf(activityC16552x1ceceed9.f230749f)));
        textView.append(java.lang.String.format("view size: %s, ratio: %s\n", new android.graphics.Point(activityC16552x1ceceed9.f230747d.getWidth(), activityC16552x1ceceed9.f230747d.getHeight()), java.lang.Float.valueOf(activityC16552x1ceceed9.f230747d.getWidth() / activityC16552x1ceceed9.f230747d.getHeight())));
    }
}
