package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAppMsgFinderNameCardMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAppMsgFinderNameCardMvvmView */
/* loaded from: classes9.dex */
public final class C22072x5721f1cc extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<z01.d> {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f286145f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22072x5721f1cc(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 r17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Bi()).r(context);
        this.f286145f = r17;
        return r17;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        android.view.View contentView;
        z01.d dVar = (z01.d) pVar2;
        c11.a aVar = new c11.a();
        if (dVar != null) {
            aVar.f119335f = dVar.f550513f;
            aVar.f119339m = dVar.f550514g;
            aVar.f119334e = new af5.g(this, dVar.f550512e);
            java.lang.String str = dVar.f550517m;
            if (str == null || str.length() == 0) {
                int i17 = dVar.f550515h;
                if (i17 != 0) {
                    aVar.f119337h = i17;
                    aVar.f119338i = dVar.f550516i;
                }
            } else {
                aVar.f119336g = new af5.h(str);
            }
            aVar.f119341o = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eqw);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(dVar.f550511d);
            if (!(valueOf.intValue() != 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f286145f;
                if (abstractC11172x705e5905 != null && (contentView = abstractC11172x705e5905.getContentView()) != null) {
                    contentView.setBackgroundResource(intValue);
                }
            }
            setOnClickListener(dVar.f550518n);
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f286145f;
        if (abstractC11172x705e59052 == null) {
            return;
        }
        abstractC11172x705e59052.m48330xfcfee142(aVar);
    }

    public /* synthetic */ C22072x5721f1cc(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22072x5721f1cc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
