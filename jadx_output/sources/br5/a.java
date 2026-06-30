package br5;

/* loaded from: classes8.dex */
public final class a implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ br5.e f23748d;

    public a(br5.e eVar) {
        this.f23748d = eVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        this.f23748d.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        br5.e eVar = this.f23748d;
        kotlinx.coroutines.y0 y0Var = eVar.f23753b;
        if (y0Var == null) {
            return;
        }
        com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = eVar.f23754c;
        m0Var.getClass();
        zq5.b.d();
        kotlinx.coroutines.y0 y0Var2 = m0Var.f214997f;
        if (y0Var2 != null) {
            androidx.lifecycle.o oVar = m0Var.f215011t;
            if (oVar != null) {
                oVar.c(m0Var.f215005n);
            }
            m0Var.b("setCoroutineScope");
            m0Var.c("setCoroutineScope");
            kotlinx.coroutines.z0.c(y0Var2, null);
            m0Var.f214997f = null;
        }
        kotlinx.coroutines.z0.d(y0Var, "onDetachFromWindow", null, 2, null);
        eVar.f23753b = null;
    }
}
