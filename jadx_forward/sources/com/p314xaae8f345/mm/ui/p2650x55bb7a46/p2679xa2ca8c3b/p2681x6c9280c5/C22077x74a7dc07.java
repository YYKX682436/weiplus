package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingFileMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/m;", "Lem/l;", "f", "Lem/l;", "getHolder", "()Lem/l;", "setHolder", "(Lem/l;)V", "holder", "Lem/p;", "g", "Lem/p;", "getSourceHolder", "()Lem/p;", "setSourceHolder", "(Lem/p;)V", "sourceHolder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingFileMvvmView */
/* loaded from: classes9.dex */
public final class C22077x74a7dc07 extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<z01.m> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public em.l holder;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public em.p sourceHolder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22077x74a7dc07(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e0v, (android.view.ViewGroup) this, false);
        em.l lVar = new em.l(inflate);
        m80086x101324ae(lVar);
        m80087xd351ef29(new em.p(lVar.e()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01ab, code lost:
    
        if (r14 != 2) goto L54;
     */
    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(q31.p r14, q31.p r15) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22077x74a7dc07.e(q31.p, q31.p):void");
    }

    public final void g() {
        m80084x1cddf0a2().d().setVisibility(8);
        m80084x1cddf0a2().j().m82112x7e1bd1fe(true);
        m80084x1cddf0a2().j().setVisibility(0);
    }

    /* renamed from: getHolder */
    public final em.l m80084x1cddf0a2() {
        em.l lVar = this.holder;
        if (lVar != null) {
            return lVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
        throw null;
    }

    /* renamed from: getSourceHolder */
    public final em.p m80085x9d08f41d() {
        em.p pVar = this.sourceHolder;
        if (pVar != null) {
            return pVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceHolder");
        throw null;
    }

    /* renamed from: setHolder */
    public final void m80086x101324ae(em.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar, "<set-?>");
        this.holder = lVar;
    }

    /* renamed from: setSourceHolder */
    public final void m80087xd351ef29(em.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pVar, "<set-?>");
        this.sourceHolder = pVar;
    }

    public /* synthetic */ C22077x74a7dc07(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22077x74a7dc07(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
