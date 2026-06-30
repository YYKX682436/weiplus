package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTouchableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/view/MotionEvent;", "getLastTouchUpEvent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveTouchableTextView */
/* loaded from: classes4.dex */
public class C18278x8895fd33 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {

    /* renamed from: g, reason: collision with root package name */
    public android.view.MotionEvent f250713g;

    public C18278x8895fd33(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: getLastTouchUpEvent */
    public final android.view.MotionEvent m71029xf5dac() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLastTouchUpEvent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTouchableTextView");
        android.view.MotionEvent motionEvent = this.f250713g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastTouchUpEvent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTouchableTextView");
        return motionEvent;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchEvent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTouchableTextView");
        if (motionEvent != null && motionEvent.getAction() == 1) {
            this.f250713g = android.view.MotionEvent.obtain(motionEvent);
            motionEvent.getRawX();
            motionEvent.getRawY();
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTouchableTextView");
        return onTouchEvent;
    }

    public /* synthetic */ C18278x8895fd33(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? android.R.attr.textViewStyle : i17);
    }

    public C18278x8895fd33(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
