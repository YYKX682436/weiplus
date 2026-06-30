package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class h4 implements android.text.SpanWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.j4 f91480d;

    public h4(com.tencent.mm.plugin.appbrand.widget.input.j4 j4Var) {
        this.f91480d = j4Var;
    }

    @Override // android.text.SpanWatcher
    public void onSpanAdded(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18) {
        if (com.tencent.mm.plugin.appbrand.widget.input.m5.f91549d.isInstance(obj)) {
            obj.getClass();
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanChanged(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18, int i19, int i27) {
        if (com.tencent.mm.plugin.appbrand.widget.input.m5.f91549d.isInstance(obj)) {
            obj.getClass();
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanRemoved(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18) {
        if (com.tencent.mm.plugin.appbrand.widget.input.m5.f91549d.isInstance(obj)) {
            obj.getClass();
            com.tencent.mm.plugin.appbrand.widget.input.j4 j4Var = this.f91480d;
            com.tencent.mm.sdk.platformtools.n3 n3Var = j4Var.f91504d;
            java.lang.Runnable runnable = j4Var.f91507g;
            n3Var.removeCallbacks(runnable);
            j4Var.f91504d.postDelayed(runnable, 100L);
        }
    }
}
