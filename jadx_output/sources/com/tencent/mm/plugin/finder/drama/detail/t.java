package com.tencent.mm.plugin.finder.drama.detail;

/* loaded from: classes2.dex */
public final class t implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f105181d;

    public t(android.app.Activity activity) {
        this.f105181d = activity;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        if (z17) {
            return;
        }
        android.app.Activity context = this.f105181d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.drama.detail.y yVar = (com.tencent.mm.plugin.finder.drama.detail.y) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.drama.detail.y.class);
        if (yVar != null) {
            yVar.f105196q.remove(this);
        }
    }
}
