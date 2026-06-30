package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderActionBarLayout;", "Landroid/widget/LinearLayout;", "Landroid/view/ViewGroup$LayoutParams;", "params", "Ljz5/f0;", "setLayoutParams", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderActionBarLayout */
/* loaded from: classes2.dex */
public final class C15223x788b8661 extends android.widget.LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15223x788b8661(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.view.View findViewById;
        android.view.View findViewById2;
        android.view.View findViewById3;
        super.onLayout(z17, i17, i18, i19, i27);
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.nuq);
        if (findViewById4 == null || (findViewById = findViewById(com.p314xaae8f345.mm.R.id.hza)) == null || (findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.r0j)) == null || (findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.nfb)) == null) {
            return;
        }
        boolean z18 = (findViewById.getVisibility() == 8 && findViewById2.getVisibility() == 8 && findViewById3.getVisibility() == 8) ? false : true;
        int left = findViewById.getLeft();
        int left2 = findViewById2.getLeft();
        if (left <= 0 || left2 <= 0 ? left2 > 0 : left > left2) {
            left = left2;
        }
        int left3 = findViewById3.getLeft();
        if (left <= 0 || left3 <= 0 ? left3 > 0 : left > left3) {
            left = left3;
        }
        int measuredWidth = (getMeasuredWidth() - findViewById4.getMeasuredWidth()) / 2;
        int measuredWidth2 = findViewById4.getMeasuredWidth() + measuredWidth;
        if (z18 && measuredWidth2 > left) {
            int i28 = measuredWidth2 - left;
            measuredWidth -= i28;
            measuredWidth2 -= i28;
        }
        findViewById4.layout(measuredWidth, findViewById4.getTop(), measuredWidth2, findViewById4.getBottom());
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        boolean z17;
        boolean z18 = true;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (!z17 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f387758a;
            z18 = false;
        }
        if (z18) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("FinderActionBarLayout", "stack", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActionBarLayout", "paddingLeft:" + getPaddingLeft() + ", paddingTop:" + getPaddingTop() + ", paddingRight:" + getPaddingRight() + ", paddingBottom:" + getPaddingBottom());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("measuredHeight: ");
        sb6.append(getMeasuredHeight());
        sb6.append(", measuredWidth: ");
        sb6.append(getMeasuredWidth());
        sb6.append(", height: ");
        sb6.append(getHeight());
        sb6.append(", width: ");
        sb6.append(getWidth());
        sb6.append(", new height:");
        sb6.append(layoutParams != null ? java.lang.Integer.valueOf(layoutParams.height) : null);
        sb6.append(", new width:");
        sb6.append(layoutParams != null ? java.lang.Integer.valueOf(layoutParams.width) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActionBarLayout", sb6.toString());
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        boolean z17;
        boolean z18 = true;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (!z17 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f387758a;
            z18 = false;
        }
        if (z18) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("FinderActionBarLayout", "stack", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActionBarLayout", "left:" + i17 + ", top:" + i18 + ", right:" + i19 + ", bottom:" + i27 + ", paddingLeft:" + getPaddingLeft() + ", paddingTop:" + getPaddingTop() + ", paddingRight:" + getPaddingRight() + ", paddingBottom:" + getPaddingBottom());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("measuredHeight: ");
        sb6.append(getMeasuredHeight());
        sb6.append(", measuredWidth: ");
        sb6.append(getMeasuredWidth());
        sb6.append(", height: ");
        sb6.append(getHeight());
        sb6.append(", width: ");
        sb6.append(getWidth());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActionBarLayout", sb6.toString());
        super.setPadding(i17, i18, i19, i27);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15223x788b8661(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }
}
