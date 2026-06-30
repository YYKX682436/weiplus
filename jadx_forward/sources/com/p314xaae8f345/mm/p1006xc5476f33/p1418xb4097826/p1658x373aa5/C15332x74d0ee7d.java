package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B%\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0019R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR6\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderPostEditText;", "Lcom/tencent/mm/ui/widget/MMEditText;", "", "H", "I", "getLastSelection", "()I", "setLastSelection", "(I)V", "lastSelection", "Lkotlin/Function2;", "Ljz5/f0;", "Lyz5/p;", "getOnSelectionChangedListener", "()Lyz5/p;", "setOnSelectionChangedListener", "(Lyz5/p;)V", "onSelectionChangedListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderPostEditText */
/* loaded from: classes5.dex */
public final class C15332x74d0ee7d extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 {
    public final java.lang.String G;

    /* renamed from: H, reason: from kotlin metadata */
    public int lastSelection;

    /* renamed from: I, reason: from kotlin metadata */
    public yz5.p onSelectionChangedListener;

    public C15332x74d0ee7d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = "Finder.FinderPostEditText";
    }

    public final int getLastSelection() {
        return this.lastSelection;
    }

    public final yz5.p getOnSelectionChangedListener() {
        return this.onSelectionChangedListener;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017, fl5.i
    /* renamed from: getRealEditText */
    public fl5.i mo61840xc52e48b() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017, android.widget.TextView
    public void onSelectionChanged(int i17, int i18) {
        super.onSelectionChanged(i17, i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.G, "onSelectionChanged start " + i17 + ", end " + i18);
        if (this.lastSelection != i17) {
            yz5.p pVar = this.onSelectionChangedListener;
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.lastSelection));
            }
            this.lastSelection = i17;
        }
    }

    /* renamed from: setLastSelection */
    public final void m62305x7efaaa54(int i17) {
        this.lastSelection = i17;
    }

    /* renamed from: setOnSelectionChangedListener */
    public final void m62306x63051b5d(yz5.p pVar) {
        this.onSelectionChangedListener = pVar;
    }

    public C15332x74d0ee7d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = "Finder.FinderPostEditText";
    }
}
