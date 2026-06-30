package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* renamed from: com.tencent.mm.ui.conversation.EnterpriseFullHeightListView */
/* loaded from: classes4.dex */
public class C22372x99cad47a extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f288897d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f288898e;

    /* renamed from: f, reason: collision with root package name */
    public int f288899f;

    public C22372x99cad47a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f288897d = true;
        this.f288899f = 0;
    }

    public final void b(int i17, int i18) {
        if (this.f288897d) {
            return;
        }
        int count = getAdapter().getCount();
        if (this.f288898e != null) {
            count--;
        }
        int i19 = 0;
        for (int headerViewsCount = getHeaderViewsCount(); headerViewsCount < count; headerViewsCount++) {
            if (this.f288899f <= 0) {
                try {
                    android.view.View view = getAdapter().getView(headerViewsCount, null, this);
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    this.f288899f = view.getMeasuredHeight();
                } catch (java.lang.Exception unused) {
                    continue;
                }
            }
            i19 += this.f288899f;
            if (i19 > i18) {
                android.view.View view2 = this.f288898e;
                if (view2 != null) {
                    removeFooterView(view2);
                    this.f288898e = null;
                    return;
                }
                return;
            }
        }
        if (i19 < i18) {
            if (this.f288898e == null) {
                this.f288898e = new android.view.View(getContext());
            }
            removeFooterView(this.f288898e);
            this.f288898e.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, i18 - i19));
            addFooterView(this.f288898e, null, false);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (this.f288897d) {
            return;
        }
        try {
            b(i17, i18);
        } catch (java.lang.Exception unused) {
        }
    }

    public C22372x99cad47a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f288897d = true;
        this.f288899f = 0;
    }
}
