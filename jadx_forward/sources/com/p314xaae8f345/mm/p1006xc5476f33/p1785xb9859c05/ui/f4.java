package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class f4 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16145xcc3dc144 f224361e;

    public f4(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16145xcc3dc144 activityC16145xcc3dc144, java.lang.String str) {
        this.f224361e = activityC16145xcc3dc144;
        this.f224360d = str;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI$14", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16145xcc3dc144 activityC16145xcc3dc144 = this.f224361e;
        ((android.widget.TextView) view).setHighlightColor(activityC16145xcc3dc144.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13340, -1, -1, -1, -1, 1);
        db5.e1.F(activityC16145xcc3dc144.mo55332x76847179(), this.f224360d, activityC16145xcc3dc144.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6d), true).z(com.p314xaae8f345.mm.R.C30867xcad56011.g3i, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e4(this));
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI$14", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setColor(this.f224361e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        textPaint.setUnderlineText(false);
    }
}
