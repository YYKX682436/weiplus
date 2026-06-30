package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes4.dex */
public final class i7 implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.SportHistoryUI f99519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f99520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f99521c;

    public i7(com.tencent.mm.plugin.exdevice.ui.SportHistoryUI sportHistoryUI, android.widget.TextView textView, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f99519a = sportHistoryUI;
        this.f99520b = textView;
        this.f99521c = weImageView;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public final void a(k91.v5 v5Var) {
        androidx.appcompat.app.AppCompatActivity context = this.f99519a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ym5.a1.f(new a42.f(this.f99520b, v5Var != null ? i65.a.d(context, com.tencent.mm.R.color.Link_100) : i65.a.d(context, com.tencent.mm.R.color.FG_2), this.f99521c));
    }
}
