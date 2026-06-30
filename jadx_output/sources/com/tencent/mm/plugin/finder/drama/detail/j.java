package com.tencent.mm.plugin.finder.drama.detail;

/* loaded from: classes2.dex */
public final class j extends zx2.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.detail.p f105163k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.drama.detail.p pVar, java.lang.CharSequence title) {
        super(title);
        kotlin.jvm.internal.o.g(title, "title");
        this.f105163k = pVar;
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.tencent.mm.R.layout.ecy;
    }

    @Override // zx2.k, zx2.i
    public void d(boolean z17, android.view.ViewGroup tabView) {
        kotlin.jvm.internal.o.g(tabView, "tabView");
        super.d(z17, tabView);
        if (z17) {
            com.tencent.mm.plugin.finder.drama.detail.p pVar = this.f105163k;
            if (pVar.A) {
                pVar.A = false;
                return;
            }
            com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
            android.content.Context context = tabView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.util.Map c17 = d2Var.c(context);
            r45.qj2 qj2Var = pVar.f105173v;
            c17.put("native_drama_id", pm0.v.u(qj2Var != null ? qj2Var.getLong(0) : 0L));
            android.app.Activity context2 = pVar.getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            c17.put("feed_id", pm0.v.u(((com.tencent.mm.plugin.finder.drama.detail.i) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.drama.detail.i.class)).f105162u));
            hc2.v0.b(tabView, "native_drama_collection_tab", "view_clk", 0, c17, null, 20, null);
        }
    }

    @Override // zx2.k, zx2.i
    public void e(boolean z17) {
        android.widget.TextView textView = this.f477052j;
        if (textView != null) {
            android.content.Context context = textView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            textView.setText(i(context));
            k(z17);
            if (z17) {
                com.tencent.mm.ui.bk.s0(textView.getPaint());
            } else {
                com.tencent.mm.ui.bk.t0(textView.getPaint());
            }
        }
    }
}
