package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* renamed from: com.tencent.mm.ui.conversation.ConversationFolderItemView */
/* loaded from: classes9.dex */
public class C22365xcc043e69 extends com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Class f288842d;

    static {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$PerformClick");
            f288842d = cls;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ConversationFolderItemV", "processName, performClick = %s", bm5.f1.a(), java.lang.Integer.valueOf(cls.hashCode()));
        } catch (java.lang.ClassNotFoundException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ConversationFolderItemV", "ClassNotFoundException for android.view.View$PerformClick");
        }
    }

    public C22365xcc043e69(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (!(getTag() instanceof yf5.n)) {
            super.onMeasure(i17, i18);
            return;
        }
        yf5.n nVar = (yf5.n) getTag();
        nVar.getClass();
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(nVar.f543462p, 1073741824));
    }

    @Override // android.view.View
    public boolean post(java.lang.Runnable runnable) {
        if (runnable != null && runnable.getClass() == f288842d && (getTag() instanceof yf5.n)) {
            runnable = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.c3(this, runnable);
        }
        return super.post(runnable);
    }

    public C22365xcc043e69(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
