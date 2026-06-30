package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u001b\f\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u001aR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderSubTabView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Lin5/u;", "Lcom/tencent/mm/plugin/finder/view/kl;", "", "j2", "I", "getSelectedId", "()I", "setSelectedId", "(I)V", "selectedId", "Lcom/tencent/mm/plugin/finder/view/jl;", "onTabSelectedListener", "Lcom/tencent/mm/plugin/finder/view/jl;", "getOnTabSelectedListener", "()Lcom/tencent/mm/plugin/finder/view/jl;", "setOnTabSelectedListener", "(Lcom/tencent/mm/plugin/finder/view/jl;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/view/il", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderSubTabView */
/* loaded from: classes2.dex */
public final class C15350xda330e60 extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 implements in5.u {

    /* renamed from: j2, reason: collision with root package name and from kotlin metadata */
    public int selectedId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15350xda330e60(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        setBackgroundColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
        int dimension = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        setPadding(dimension, dimension, dimension, dimension);
        mo7960x6cab2c8d(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.view.FinderSubTabView.1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.il(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15350xda330e60.this);
            }
        }, arrayList, false));
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(context2, 0, false);
        c15415x74224fd8.C = false;
        mo7967x900dcbe1(c15415x74224fd8);
        m7964x8d4ad49c(null);
    }

    /* renamed from: getOnTabSelectedListener */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.jl m62391xebfcb40f() {
        return null;
    }

    public final int getSelectedId() {
        return this.selectedId;
    }

    /* renamed from: setOnTabSelectedListener */
    public final void m62393xbc0f6683(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.jl jlVar) {
    }

    /* renamed from: setSelectedId */
    public final void m62394xb9b8c718(int i17) {
        this.selectedId = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15350xda330e60(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        setBackgroundColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
        int dimension = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        setPadding(dimension, dimension, dimension, dimension);
        mo7960x6cab2c8d(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.view.FinderSubTabView.1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.il(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15350xda330e60.this);
            }
        }, arrayList, false));
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(context2, 0, false);
        c15415x74224fd8.C = false;
        mo7967x900dcbe1(c15415x74224fd8);
        m7964x8d4ad49c(null);
    }
}
