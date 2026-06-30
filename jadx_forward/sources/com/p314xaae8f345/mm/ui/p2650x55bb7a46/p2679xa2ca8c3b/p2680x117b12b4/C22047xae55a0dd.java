package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2680x117b12b4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/tencent/mm/ui/chatting/viewitems/foldItem/ChattingItemFoldSys$ExpandTextView", "Lcom/tencent/mm/mvvm/MvvmView;", "Lye5/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.foldItem.ChattingItemFoldSys$ExpandTextView */
/* loaded from: classes9.dex */
public final class C22047xae55a0dd extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<ye5.c> {

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f285522f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22047xae55a0dd(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k8m));
        textView.setGravity(17);
        int color = context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560844vr);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        textView.setTextColor(color);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        textView.setTextSize(14.0f);
        textView.setPadding(c44.b.a(6), c44.b.a(6), c44.b.a(6), c44.b.a(6));
        this.f285522f = textView;
        return textView;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        ye5.c cVar = (ye5.c) pVar2;
        android.widget.TextView textView = this.f285522f;
        if (textView != null) {
            textView.setOnClickListener(cVar != null ? cVar.f542777d : null);
        }
    }

    public /* synthetic */ C22047xae55a0dd(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22047xae55a0dd(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
