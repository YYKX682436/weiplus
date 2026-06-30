package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingPocketMoneyMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/a0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingPocketMoneyMvvmView */
/* loaded from: classes9.dex */
public final class C22087x284a2b89 extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<z01.a0> {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f286166f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f286167g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22087x284a2b89(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 y17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Bi()).y(context);
        this.f286167g = y17;
        return y17;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        z01.a0 a0Var = (z01.a0) pVar2;
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f286167g;
        if (abstractC11172x705e5905 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        if (a0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f286166f, "[ChattingPocketMoneyMvvmView] onUpdateViewModel viewModel: " + a0Var);
            c11.g gVar = new c11.g();
            java.lang.String str = a0Var.f550470d;
            if (str == null) {
                str = "";
            }
            gVar.f119378d = str;
            java.lang.String str2 = a0Var.f550471e;
            if (str2 == null) {
                str2 = "";
            }
            gVar.f119379e = str2;
            java.lang.String str3 = a0Var.f550472f;
            gVar.f119385n = str3 != null ? str3 : "";
            java.lang.Integer num = a0Var.f550475i;
            gVar.f119380f = num != null ? num.intValue() : 0;
            a11.b bVar = new a11.b();
            bVar.f82036g = a0Var.f550476m;
            gVar.f119388q = bVar;
            abstractC11172x705e5905.m48330xfcfee142(gVar);
        }
    }

    public /* synthetic */ C22087x284a2b89(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22087x284a2b89(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f286166f = "ChattingPocketMoneyMvvmView";
    }
}
