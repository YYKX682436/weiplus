package ap1;

/* loaded from: classes5.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.w f12695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f12696e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ap1.w wVar, com.tencent.mm.ui.widget.dialog.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f12695d = wVar;
        this.f12696e = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ap1.l(this.f12695d, this.f12696e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ap1.l lVar = (ap1.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.widget.dialog.u3 dialog = this.f12696e;
        kotlin.jvm.internal.o.f(dialog, "$dialog");
        ap1.w wVar = this.f12695d;
        wVar.getClass();
        com.tencent.mm.plugin.backup.roambackup.r0.f92684a.l(wVar.f12751h, new ap1.q(java.lang.System.currentTimeMillis(), wVar, dialog));
        return jz5.f0.f302826a;
    }
}
