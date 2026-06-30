package com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB%\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/masssend/ui/MassSendHistoryListView;", "Landroid/widget/ListView;", "", ya.b.f77479x42930b2, "Ljz5/f0;", "setHighLightChildNew", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendHistoryListView */
/* loaded from: classes5.dex */
public final class C16485x4d1368bb extends android.widget.ListView {
    public C16485x4d1368bb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: setHighLightChildNew */
    public final void m66586x14659756(int i17) {
        android.animation.PropertyValuesHolder ofFloat;
        int max = java.lang.Math.max(0, i17);
        android.view.View childAt = getChildAt(max);
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.C16484xf5149ba0 c16484xf5149ba0 = null;
        android.view.View findViewById = childAt != null ? childAt.findViewById(com.p314xaae8f345.mm.R.id.jci) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.C16484xf5149ba0 c16484xf5149ba02 = findViewById instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.C16484xf5149ba0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.C16484xf5149ba0) findViewById : null;
        if (c16484xf5149ba02 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChattingListView", "null == view index:%s", java.lang.Integer.valueOf(max));
        } else {
            c16484xf5149ba0 = c16484xf5149ba02;
        }
        if (c16484xf5149ba0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MassSendHistoryListView", "null == view index:%s", java.lang.Integer.valueOf(max));
            return;
        }
        c16484xf5149ba0.clearAnimation();
        boolean C = com.p314xaae8f345.mm.ui.bk.C();
        android.graphics.Paint paint = c16484xf5149ba0.f230057f;
        if (C) {
            paint.setColor(c16484xf5149ba0.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        } else {
            paint.setColor(c16484xf5149ba0.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaskAnimView", "[setHighLightChild]view rect:%s", new android.graphics.Rect(c16484xf5149ba0.getLeft(), c16484xf5149ba0.getTop(), c16484xf5149ba0.getRight(), c16484xf5149ba0.getBottom()));
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            ofFloat = android.animation.PropertyValuesHolder.ofFloat("alpha", 0.0f, 0.08f, 0.08f, 0.08f, 0.08f, 0.08f, 0.0f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ofFloat);
        } else {
            ofFloat = android.animation.PropertyValuesHolder.ofFloat("alpha", 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.0f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ofFloat);
        }
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(ofFloat);
        c16484xf5149ba0.clearAnimation();
        ofPropertyValuesHolder.addUpdateListener(new kf3.g(c16484xf5149ba0, c16484xf5149ba0));
        ofPropertyValuesHolder.addListener(new kf3.h(c16484xf5149ba0));
        ofPropertyValuesHolder.setDuration(1150L);
        ofPropertyValuesHolder.start();
    }

    public C16485x4d1368bb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
