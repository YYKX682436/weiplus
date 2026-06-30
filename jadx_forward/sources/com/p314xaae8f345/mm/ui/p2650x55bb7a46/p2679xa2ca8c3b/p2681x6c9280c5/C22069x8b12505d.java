package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAppBrandFakeNativeMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAppBrandFakeNativeMvvmView */
/* loaded from: classes9.dex */
public final class C22069x8b12505d extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<z01.a> {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f286142f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22069x8b12505d(android.content.Context context, android.util.AttributeSet attributeSet) {
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
        this.f286142f = y17;
        return y17;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        java.lang.String str;
        java.lang.String B;
        java.lang.String str2;
        z01.a aVar = (z01.a) pVar2;
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f286142f;
        if (abstractC11172x705e5905 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        if (aVar != null) {
            c11.g gVar = new c11.g();
            android.content.Context context = abstractC11172x705e5905.getContext();
            s05.d dVar = aVar.f550461f;
            if (dVar == null || (str = dVar.y()) == null) {
                str = "";
            }
            java.lang.String str3 = aVar.f550460e;
            if (str3 == null) {
                str3 = "";
            }
            s05.a aVar2 = aVar.f550469q;
            if (aVar2 == null || (B = aVar2.j()) == null) {
                s05.d dVar2 = aVar.f550461f;
                B = dVar2 != null ? dVar2.B() : null;
                if (B == null) {
                    B = "";
                }
            }
            int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
            gk0.k kVar = new gk0.k(h17, h17);
            kVar.f353966d = 0.5f;
            kVar.f353967e = com.p314xaae8f345.mm.R.C30861xcebc809e.bhm;
            a11.b bVar = new a11.b();
            bVar.f82036g = new af5.a(context, B, kVar, str3);
            gVar.f119388q = bVar;
            gVar.f119387p = aVar.f550464i;
            gVar.f119384m = null;
            s05.d dVar3 = aVar.f550461f;
            if (dVar3 == null || (str2 = dVar3.C()) == null) {
                str2 = "";
            }
            gVar.f119385n = str2;
            gVar.f119386o = aVar.f550462g;
            gVar.f119383i = l01.a.h();
            java.lang.String str4 = aVar.f550459d;
            if (str4 == null) {
                str4 = "";
            }
            gVar.f119378d = str4;
            java.lang.String str5 = aVar.f550463h;
            gVar.f119379e = str5 != null ? str5 : "";
            gVar.f119380f = aVar.f550465m;
            gVar.f119389r = new af5.b(aVar, str, context);
            abstractC11172x705e5905.m48330xfcfee142(gVar);
        }
    }

    public /* synthetic */ C22069x8b12505d(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22069x8b12505d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
