package cd0;

/* loaded from: classes5.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f40569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f40570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f40571f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.storage.f9 f9Var, boolean z17, java.lang.ref.WeakReference weakReference, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f40569d = f9Var;
        this.f40570e = z17;
        this.f40571f = weakReference;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cd0.r(this.f40569d, this.f40570e, this.f40571f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cd0.r rVar = (cd0.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yb5.d dVar;
        android.app.Activity g17;
        android.content.res.Resources resources;
        yb5.d dVar2;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.ref.WeakReference weakReference = cd0.b0.f40526b;
        if (weakReference != null && (u3Var = (com.tencent.mm.ui.widget.dialog.u3) weakReference.get()) != null) {
            u3Var.dismiss();
        }
        dh3.c cVar = dh3.c.f232489a;
        com.tencent.mm.storage.f9 f9Var = this.f40569d;
        if (f9Var != null) {
            dh3.c.f232495g.entrySet().removeIf(new dh3.b(f9Var));
        }
        if (this.f40570e) {
            java.lang.String str = null;
            java.lang.ref.WeakReference weakReference2 = this.f40571f;
            android.app.Activity g18 = (weakReference2 == null || (dVar2 = (yb5.d) weakReference2.get()) == null) ? null : dVar2.g();
            if (weakReference2 != null && (dVar = (yb5.d) weakReference2.get()) != null && (g17 = dVar.g()) != null && (resources = g17.getResources()) != null) {
                str = resources.getString(com.tencent.mm.R.string.d48);
            }
            db5.t7.i(g18, str, com.tencent.mm.R.raw.icons_outlined_done);
        }
        return jz5.f0.f302826a;
    }
}
