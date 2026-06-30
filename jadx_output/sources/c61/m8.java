package c61;

/* loaded from: classes8.dex */
public final class m8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f39160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.k0 f39161e;

    public m8(androidx.lifecycle.y yVar, androidx.lifecycle.k0 k0Var) {
        this.f39160d = yVar;
        this.f39161e = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) com.tencent.mm.plugin.finder.extension.reddot.aa.Q0.getValue();
        if (z9Var == null || !this.f39160d.mo133getLifecycle().b().a(androidx.lifecycle.n.STARTED)) {
            return;
        }
        this.f39161e.onChanged(z9Var);
    }
}
