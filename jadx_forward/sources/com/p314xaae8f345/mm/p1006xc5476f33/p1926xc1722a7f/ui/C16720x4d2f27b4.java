package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* renamed from: com.tencent.mm.plugin.nearby.ui.BindMobileOrQQHeaderView */
/* loaded from: classes.dex */
public class C16720x4d2f27b4 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f233610d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.b f233611e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View.OnClickListener f233612f;

    public C16720x4d2f27b4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f233612f = new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.a(this);
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.c5z, this);
        this.f233610d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.k5f);
        int ordinal = this.f233611e.ordinal();
        android.view.View.OnClickListener onClickListener = this.f233612f;
        if (ordinal == 0) {
            setOnClickListener(onClickListener);
            this.f233610d.setImageResource(com.p314xaae8f345.mm.R.raw.f80035xbf0882f4);
        } else {
            if (ordinal != 1) {
                return;
            }
            setOnClickListener(onClickListener);
            this.f233610d.setImageResource(com.p314xaae8f345.mm.R.raw.f80067xa7749ab);
        }
    }

    public C16720x4d2f27b4(android.content.Context context) {
        super(context);
        this.f233612f = new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.a(this);
        this.f233611e = com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.b.Mobile;
        a(context);
    }
}
