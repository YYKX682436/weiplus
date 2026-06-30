package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes4.dex */
public final class bq implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f102989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f102990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f102991f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f102992g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f102993h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.cq f102994i;

    public bq(android.view.View view, android.view.View view2, in5.s0 s0Var, android.widget.TextView textView, android.widget.TextView textView2, com.tencent.mm.plugin.finder.convert.cq cqVar) {
        this.f102989d = view;
        this.f102990e = view2;
        this.f102991f = s0Var;
        this.f102992g = textView;
        this.f102993h = textView2;
        this.f102994i = cqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int width = this.f102989d.getWidth();
        if (this.f102990e.getVisibility() == 0) {
            width -= i65.a.p(this.f102991f.f293121e, com.tencent.mm.R.dimen.f479688cn);
        }
        android.widget.TextView textView = this.f102992g;
        if (textView.getVisibility() == 0) {
            width -= (int) textView.getPaint().measureText(textView.getText().toString());
        }
        this.f102993h.setMaxWidth(width);
        com.tencent.mars.xlog.Log.i(this.f102994i.f103087h, "maxWidth: " + width);
    }
}
