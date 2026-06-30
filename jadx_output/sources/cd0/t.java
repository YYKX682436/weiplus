package cd0;

/* loaded from: classes5.dex */
public final class t implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.d1 f40592d;

    public t(com.tencent.mm.modelsimple.d1 d1Var) {
        this.f40592d = d1Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        com.tencent.mm.modelsimple.d1 d1Var = this.f40592d;
        if (kotlin.jvm.internal.o.b(m1Var, d1Var)) {
            com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
            d1Var.getClass();
            d17.q(594, this);
            java.lang.ref.WeakReference weakReference = cd0.b0.f40526b;
            if (weakReference == null || (u3Var = (com.tencent.mm.ui.widget.dialog.u3) weakReference.get()) == null) {
                return;
            }
            u3Var.dismiss();
        }
    }
}
