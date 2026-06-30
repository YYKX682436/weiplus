package cd0;

/* loaded from: classes5.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f40559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f40560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f40561f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f40562g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f40563h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.ref.WeakReference weakReference, kotlin.jvm.internal.c0 c0Var, com.tencent.mm.modelbase.f fVar, boolean z17, kotlin.jvm.internal.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f40559d = weakReference;
        this.f40560e = c0Var;
        this.f40561f = fVar;
        this.f40562g = z17;
        this.f40563h = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cd0.o(this.f40559d, this.f40560e, this.f40561f, this.f40562g, this.f40563h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cd0.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yb5.d dVar;
        android.content.res.Resources s17;
        android.content.res.Resources s18;
        yb5.d dVar2;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.ref.WeakReference weakReference = cd0.b0.f40526b;
        if (weakReference != null && (u3Var = (com.tencent.mm.ui.widget.dialog.u3) weakReference.get()) != null) {
            u3Var.dismiss();
        }
        java.lang.String str = null;
        str = null;
        str = null;
        java.lang.ref.WeakReference weakReference2 = this.f40559d;
        android.app.Activity g17 = (weakReference2 == null || (dVar2 = (yb5.d) weakReference2.get()) == null) ? null : dVar2.g();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (g17 == null) {
            return f0Var;
        }
        boolean z17 = this.f40560e.f310112d;
        boolean z18 = this.f40562g;
        if (z17) {
            com.tencent.mm.modelbase.f fVar = this.f40561f;
            java.lang.String str2 = ((r45.og) fVar.f70618d).f382231d;
            if (!(str2 == null || str2.length() == 0) && z18) {
                yb5.d dVar3 = (yb5.d) weakReference2.get();
                db5.e1.s(dVar3 != null ? dVar3.g() : null, ((r45.og) fVar.f70618d).f382231d, "");
                return f0Var;
            }
        }
        kotlin.jvm.internal.f0 f0Var2 = this.f40563h;
        if (f0Var2.f310116d > 0 && z18) {
            yb5.d dVar4 = (yb5.d) weakReference2.get();
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(dVar4 != null ? dVar4.g() : null);
            yb5.d dVar5 = (yb5.d) weakReference2.get();
            u1Var.g((dVar5 == null || (s18 = dVar5.s()) == null) ? null : s18.getString(com.tencent.mm.R.string.nhb, new java.lang.Integer(f0Var2.f310116d)));
            if (weakReference2 != null && (dVar = (yb5.d) weakReference2.get()) != null && (s17 = dVar.s()) != null) {
                str = s17.getString(com.tencent.mm.R.string.f490454vi);
            }
            u1Var.n(str);
            u1Var.l(cd0.n.f40558a);
            u1Var.q(false);
        }
        return f0Var;
    }
}
