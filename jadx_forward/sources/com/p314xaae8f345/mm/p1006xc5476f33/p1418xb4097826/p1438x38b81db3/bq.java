package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes4.dex */
public final class bq implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f184525g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f184526h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.cq f184527i;

    public bq(android.view.View view, android.view.View view2, in5.s0 s0Var, android.widget.TextView textView, android.widget.TextView textView2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.cq cqVar) {
        this.f184522d = view;
        this.f184523e = view2;
        this.f184524f = s0Var;
        this.f184525g = textView;
        this.f184526h = textView2;
        this.f184527i = cqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int width = this.f184522d.getWidth();
        if (this.f184523e.getVisibility() == 0) {
            width -= i65.a.p(this.f184524f.f374654e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        }
        android.widget.TextView textView = this.f184525g;
        if (textView.getVisibility() == 0) {
            width -= (int) textView.getPaint().measureText(textView.getText().toString());
        }
        this.f184526h.setMaxWidth(width);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f184527i.f184620h, "maxWidth: " + width);
    }
}
