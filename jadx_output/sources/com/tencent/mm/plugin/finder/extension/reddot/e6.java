package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class e6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.l6 f105495d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(com.tencent.mm.plugin.finder.extension.reddot.l6 l6Var) {
        super(0);
        this.f105495d = l6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.plugin.finder.extension.reddot.l6 l6Var = this.f105495d;
        return new androidx.lifecycle.v() { // from class: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotFreqCtrlWindow$lifecycleObserver$2$1
            @Override // androidx.lifecycle.v
            public final void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
                java.lang.ref.WeakReference weakReference;
                androidx.lifecycle.y yVar;
                androidx.lifecycle.o mo133getLifecycle;
                kotlin.jvm.internal.o.g(source, "source");
                kotlin.jvm.internal.o.g(event, "event");
                androidx.lifecycle.m mVar = androidx.lifecycle.m.ON_PAUSE;
                com.tencent.mm.plugin.finder.extension.reddot.l6 l6Var2 = com.tencent.mm.plugin.finder.extension.reddot.l6.this;
                if (event == mVar) {
                    l6Var2.d();
                } else {
                    if (event != androidx.lifecycle.m.ON_DESTROY || (weakReference = l6Var2.f105686l) == null || (yVar = (androidx.lifecycle.y) weakReference.get()) == null || (mo133getLifecycle = yVar.mo133getLifecycle()) == null) {
                        return;
                    }
                    mo133getLifecycle.c((androidx.lifecycle.v) ((jz5.n) l6Var2.f105687m).getValue());
                }
            }
        };
    }
}
