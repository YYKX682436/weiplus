package cd0;

/* loaded from: classes5.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f40565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f40566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f40567f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f40568g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z17, java.lang.ref.WeakReference weakReference, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f40565d = z17;
        this.f40566e = weakReference;
        this.f40567f = h0Var;
        this.f40568g = f9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cd0.q(this.f40565d, this.f40566e, this.f40567f, this.f40568g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cd0.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.res.Resources s17;
        yb5.d dVar;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.ref.WeakReference weakReference = cd0.b0.f40526b;
        if (weakReference != null && (u3Var = (com.tencent.mm.ui.widget.dialog.u3) weakReference.get()) != null) {
            u3Var.dismiss();
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (this.f40565d) {
            java.lang.String str = null;
            java.lang.ref.WeakReference weakReference2 = this.f40566e;
            if (((weakReference2 == null || (dVar = (yb5.d) weakReference2.get()) == null) ? null : dVar.g()) == null) {
                return f0Var;
            }
            yb5.d dVar2 = (yb5.d) weakReference2.get();
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(dVar2 != null ? dVar2.g() : null);
            u1Var.g((java.lang.String) this.f40567f.f310123d);
            yb5.d dVar3 = (yb5.d) weakReference2.get();
            if (dVar3 != null && (s17 = dVar3.s()) != null) {
                str = s17.getString(com.tencent.mm.R.string.f490454vi);
            }
            u1Var.n(str);
            u1Var.l(cd0.p.f40564a);
            u1Var.q(false);
        }
        dh3.c cVar = dh3.c.f232489a;
        com.tencent.mm.storage.f9 f9Var = this.f40568g;
        if (f9Var != null) {
            dh3.c.f232495g.entrySet().removeIf(new dh3.b(f9Var));
        }
        return f0Var;
    }
}
