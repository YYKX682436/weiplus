package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/widget/pref/FinderInteractPreference;", "Lcom/tencent/mm/ui/base/preference/Preference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.widget.pref.FinderInteractPreference */
/* loaded from: classes.dex */
public final class C15508xee803e97 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public int L;

    public C15508xee803e97(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = -1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        if (this.L == -1) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
            if (textView != null) {
                textView.setTextColor(this.f279303d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw, null));
                return;
            }
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(android.R.id.title);
        if (textView2 != null) {
            textView2.setTextColor(this.L);
        }
    }

    public C15508xee803e97(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = -1;
    }

    public C15508xee803e97(android.content.Context context) {
        super(context);
        this.L = -1;
    }
}
