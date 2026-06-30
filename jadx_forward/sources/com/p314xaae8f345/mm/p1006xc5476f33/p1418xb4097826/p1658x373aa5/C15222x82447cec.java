package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0002\u0013B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FakeEditText;", "Lcom/tencent/mm/ui/widget/cedit/edit/EditTextCompatHeight;", "Lcom/tencent/mm/plugin/finder/view/v1;", "d", "Lcom/tencent/mm/plugin/finder/view/v1;", "getInputCallBack", "()Lcom/tencent/mm/plugin/finder/view/v1;", "setInputCallBack", "(Lcom/tencent/mm/plugin/finder/view/v1;)V", "inputCallBack", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/view/w1", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FakeEditText */
/* loaded from: classes8.dex */
public final class C15222x82447cec extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.C22669xa5de5760 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.v1 inputCallBack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15222x82447cec(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.v1 getInputCallBack() {
        return this.inputCallBack;
    }

    @Override // android.view.View
    public boolean isInEditMode() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onCheckIsTextEditor() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        if (editorInfo != null) {
            editorInfo.imeOptions = 268435456;
        }
        if (editorInfo != null) {
            editorInfo.inputType = 131072;
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w1(this.inputCallBack, this, true);
    }

    /* renamed from: setInputCallBack */
    public final void m61641x6472090d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.v1 v1Var) {
        this.inputCallBack = v1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15222x82447cec(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
