package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2686xc5e33a1f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingMultiCoverViewNew;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lc11/f;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview.ChattingMultiCoverViewNew */
/* loaded from: classes9.dex */
public final class C22115x12e50717 extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<c11.f> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f286421h = 0;

    /* renamed from: f, reason: collision with root package name */
    public em.v f286422f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f286423g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22115x12e50717(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        android.view.ViewGroup viewGroup;
        int indexOfChild;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e27, (android.view.ViewGroup) this, false);
        em.v vVar = new em.v(inflate);
        this.f286422f = vVar;
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        this.f286423g = ((ko.a) ((q31.t) ((q31.r) c17)).wi()).b(context);
        if (vVar.f336389d == null) {
            vVar.f336389d = (android.view.ViewStub) inflate.findViewById(com.p314xaae8f345.mm.R.id.v_2);
        }
        android.view.ViewStub viewStub = vVar.f336389d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewStub, "getSourceLineViewStub(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f286423g;
        if (abstractC11172x705e5905 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceView");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        try {
            android.view.ViewParent parent = viewStub.getParent();
            viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            indexOfChild = viewGroup != null ? viewGroup.indexOfChild(viewStub) : -1;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DSLComponents", "inflateWithView exp=" + e17);
        }
        if (indexOfChild >= 0) {
            if (viewGroup != null) {
                viewGroup.removeViewInLayout(viewStub);
            }
            android.view.ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            if (layoutParams != null) {
                if (viewGroup != null) {
                    viewGroup.addView(abstractC11172x705e5905, indexOfChild, layoutParams);
                }
            } else if (viewGroup != null) {
                viewGroup.addView(abstractC11172x705e5905, indexOfChild);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
            android.view.View view = vVar.f336386a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "getInflateRootView(...)");
            return view;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        android.view.View view2 = vVar.f336386a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view2, "getInflateRootView(...)");
        return view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x04cb, code lost:
    
        if (r6 == null) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x065e  */
    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(q31.p r28, q31.p r29) {
        /*
            Method dump skipped, instructions count: 1652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2686xc5e33a1f.C22115x12e50717.e(q31.p, q31.p):void");
    }

    public /* synthetic */ C22115x12e50717(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22115x12e50717(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
