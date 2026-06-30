package com.p314xaae8f345.mm.p653x55bb7a46.p656x6c9280c5.p657xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0004\u001a\u00020\u0003R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/chatting/mvvmview/widget/ChattingMsgSourceView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/x;", "Lcom/tencent/mm/ui/widget/MMTextView;", "getSourceTextView", "Lem/u;", "g", "Lem/u;", "getHolder", "()Lem/u;", "setHolder", "(Lem/u;)V", "holder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.chatting.mvvmview.widget.ChattingMsgSourceView */
/* loaded from: classes9.dex */
public final class C10390x428ecefb extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<z01.x> {

    /* renamed from: f, reason: collision with root package name */
    public final int f146272f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public em.u holder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10390x428ecefb(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570119e26, (android.view.ViewGroup) this, false);
        m43559x101324ae(new em.u(inflate));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void d(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.d(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x014e, code lost:
    
        if (r2 == null) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v48, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View] */
    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(q31.p r20, q31.p r21) {
        /*
            Method dump skipped, instructions count: 1660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p653x55bb7a46.p656x6c9280c5.p657xd1075a44.C10390x428ecefb.e(q31.p, q31.p):void");
    }

    /* renamed from: getHolder */
    public final em.u m43557x1cddf0a2() {
        em.u uVar = this.holder;
        if (uVar != null) {
            return uVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
        throw null;
    }

    /* renamed from: getSourceTextView */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 m43558x6180e3a3() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c17 = m43557x1cddf0a2().c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getChattingItemSourceTv(...)");
        return c17;
    }

    /* renamed from: setHolder */
    public final void m43559x101324ae(em.u uVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<set-?>");
        this.holder = uVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10390x428ecefb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f146272f = i65.a.b(context, 14);
    }
}
