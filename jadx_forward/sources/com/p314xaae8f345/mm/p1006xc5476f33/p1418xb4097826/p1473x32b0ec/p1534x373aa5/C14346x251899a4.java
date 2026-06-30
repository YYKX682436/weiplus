package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveShoppingListSubPageHeader;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "Ljz5/f0;", "setTitle", "Lkotlin/Function0;", "dismissAction", "setDismissAction", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveShoppingListSubPageHeader */
/* loaded from: classes2.dex */
public final class C14346x251899a4 extends p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 {

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f197629v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14346x251899a4(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: setDismissAction */
    public final void m57442x3b7cb01e(yz5.a dismissAction) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dismissAction, "dismissAction");
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.uof);
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.hb(dismissAction));
        }
    }

    /* renamed from: setTitle */
    public final void m57443x53bfe316(java.lang.String title) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f197629v.setText(title);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14346x251899a4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ebt, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.obc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f197629v = textView;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vd2.x5.f517543e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            java.lang.String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                textView.setText(string);
            }
            obtainStyledAttributes.recycle();
        }
    }
}
