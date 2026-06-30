package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aR)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderCommentEditText;", "Lcom/tencent/mm/ui/widget/MMEditText;", "", "", "Ljava/util/LinkedList;", "", "G", "Ljava/util/Map;", "getPastedList", "()Ljava/util/Map;", "pastedList", "H", "J", "getFeedId", "()J", "setFeedId", "(J)V", "feedId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentEditText */
/* loaded from: classes10.dex */
public final class C15269x718714b0 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 {

    /* renamed from: G, reason: from kotlin metadata */
    public final java.util.Map pastedList;

    /* renamed from: H, reason: from kotlin metadata */
    public long feedId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15269x718714b0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.pastedList = new java.util.HashMap();
        this.feedId = -1L;
        this.f293619q.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.k5(this));
    }

    public final long getFeedId() {
        return this.feedId;
    }

    /* renamed from: getPastedList */
    public final java.util.Map<java.lang.Long, java.util.LinkedList<java.lang.String>> m61839x50c91065() {
        return this.pastedList;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017, fl5.i
    /* renamed from: getRealEditText */
    public fl5.i mo61840xc52e48b() {
        return this;
    }

    /* renamed from: setFeedId */
    public final void m61841xc19565b(long j17) {
        this.feedId = j17;
    }

    public final java.util.LinkedList u(long j17) {
        java.util.LinkedList linkedList = (java.util.LinkedList) this.pastedList.get(java.lang.Long.valueOf(j17));
        return linkedList == null ? new java.util.LinkedList() : linkedList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15269x718714b0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.pastedList = new java.util.HashMap();
        this.feedId = -1L;
        this.f293619q.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.k5(this));
    }
}
