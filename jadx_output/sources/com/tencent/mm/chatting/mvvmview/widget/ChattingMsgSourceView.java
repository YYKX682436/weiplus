package com.tencent.mm.chatting.mvvmview.widget;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0004\u001a\u00020\u0003R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/chatting/mvvmview/widget/ChattingMsgSourceView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/x;", "Lcom/tencent/mm/ui/widget/MMTextView;", "getSourceTextView", "Lem/u;", "g", "Lem/u;", "getHolder", "()Lem/u;", "setHolder", "(Lem/u;)V", "holder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingMsgSourceView extends com.tencent.mm.mvvm.MvvmView<z01.x> {

    /* renamed from: f, reason: collision with root package name */
    public final int f64739f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public em.u holder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingMsgSourceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488586e26, (android.view.ViewGroup) this, false);
        setHolder(new em.u(inflate));
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.d(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x014e, code lost:
    
        if (r2 == null) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v48, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View] */
    @Override // com.tencent.mm.mvvm.MvvmView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(q31.p r20, q31.p r21) {
        /*
            Method dump skipped, instructions count: 1660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.chatting.mvvmview.widget.ChattingMsgSourceView.e(q31.p, q31.p):void");
    }

    public final em.u getHolder() {
        em.u uVar = this.holder;
        if (uVar != null) {
            return uVar;
        }
        kotlin.jvm.internal.o.o("holder");
        throw null;
    }

    public final com.tencent.mm.ui.widget.MMTextView getSourceTextView() {
        com.tencent.mm.ui.widget.MMTextView c17 = getHolder().c();
        kotlin.jvm.internal.o.f(c17, "getChattingItemSourceTv(...)");
        return c17;
    }

    public final void setHolder(em.u uVar) {
        kotlin.jvm.internal.o.g(uVar, "<set-?>");
        this.holder = uVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingMsgSourceView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f64739f = i65.a.b(context, 14);
    }
}
