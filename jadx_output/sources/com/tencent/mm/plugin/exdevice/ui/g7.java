package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes4.dex */
public final class g7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f99467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f99468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f99469f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.SportHistoryUI f99470g;

    public g7(android.widget.TextView textView, k91.v5 v5Var, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, com.tencent.mm.plugin.exdevice.ui.SportHistoryUI sportHistoryUI) {
        this.f99467d = textView;
        this.f99468e = v5Var;
        this.f99469f = weImageView;
        this.f99470g = sportHistoryUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k91.v5 v5Var = this.f99468e;
        android.widget.TextView textView = this.f99467d;
        if (textView != null) {
            textView.setText(v5Var.field_nickname);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f99469f;
        if (weImageView != null) {
            weImageView.setIconColor(this.f99470g.getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
        }
        o11.f fVar = new o11.f();
        fVar.f342096t = true;
        fVar.f342079c = true;
        n11.a.b().h(v5Var.field_smallHeadURL, weImageView, fVar.a());
    }
}
