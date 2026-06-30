package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes4.dex */
public final class h7 implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.SportHistoryUI f99496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f99497b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f99498c;

    public h7(com.tencent.mm.plugin.exdevice.ui.SportHistoryUI sportHistoryUI, android.widget.TextView textView, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f99496a = sportHistoryUI;
        this.f99497b = textView;
        this.f99498c = weImageView;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public final void a(k91.v5 v5Var) {
        if (v5Var != null) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.exdevice.ui.g7(this.f99497b, v5Var, this.f99498c, this.f99496a));
        }
        androidx.appcompat.app.AppCompatActivity context = this.f99496a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ym5.a1.f(new a42.f(this.f99497b, v5Var != null ? i65.a.d(context, com.tencent.mm.R.color.Link_100) : i65.a.d(context, com.tencent.mm.R.color.FG_2), null));
    }
}
