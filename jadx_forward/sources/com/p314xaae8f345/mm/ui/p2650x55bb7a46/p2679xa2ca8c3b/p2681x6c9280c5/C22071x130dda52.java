package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAppBrandProfileCardMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAppBrandProfileCardMvvmView */
/* loaded from: classes9.dex */
public final class C22071x130dda52 extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<z01.b> {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f286144f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22071x130dda52(android.content.Context context, android.util.AttributeSet attributeSet) {
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
        this.f286144f = r17;
        return r17;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        java.lang.String str;
        java.lang.String B;
        jz5.f0 f0Var;
        z01.b bVar = (z01.b) pVar2;
        if (bVar != null) {
            s05.d dVar = bVar.f550480g;
            if (dVar == null || (str = dVar.y()) == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f286144f;
            if (abstractC11172x705e5905 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            android.content.Context context = abstractC11172x705e5905.getContext();
            c11.a aVar = new c11.a();
            java.lang.String str2 = bVar.f550479f;
            java.lang.String str3 = str2 != null ? str2 : "";
            int i17 = bVar.f550482i;
            int i18 = 0;
            boolean z17 = i17 > 1;
            boolean z18 = i17 == 2;
            int i19 = bVar.f550481h;
            if (i19 != 0) {
                aVar.f119333d = i19;
            }
            k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(str);
            java.lang.String str4 = Bi != null ? Bi.f68913x21f9b213 : bVar.f550477d;
            if (Bi != null) {
                B = Bi.f68920x68aa7b8d;
            } else {
                s05.d dVar2 = bVar.f550480g;
                B = dVar2 != null ? dVar2.B() : null;
            }
            aVar.f119334e = new af5.e(str, B, bVar);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            aVar.f119335f = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str4);
            if (z18) {
                i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.c6t;
            } else if (z17) {
                i18 = com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.C30861xcebc809e.c6s : com.p314xaae8f345.mm.R.C30861xcebc809e.c6r;
            }
            aVar.f119337h = i18;
            aVar.f119339m = str3;
            aVar.f119341o = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n8d);
            android.view.View.OnClickListener onClickListener = bVar.f550483m;
            if (onClickListener != null) {
                setOnClickListener(onClickListener);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                setOnClickListener(new af5.f(bVar, str, context));
            }
            com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f286144f;
            if (abstractC11172x705e59052 != null) {
                abstractC11172x705e59052.m48330xfcfee142(aVar);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
        }
    }

    public /* synthetic */ C22071x130dda52(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22071x130dda52(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
