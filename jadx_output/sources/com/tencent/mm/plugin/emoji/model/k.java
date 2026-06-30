package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes11.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f97568d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f97569e;

    /* renamed from: f, reason: collision with root package name */
    public int f97570f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.model.l f97571g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.emoji.model.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f97571g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.emoji.model.k(this.f97571g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.emoji.model.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Iterator it;
        com.tencent.mm.plugin.emoji.model.l lVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f97570f;
        com.tencent.mm.plugin.emoji.model.l lVar2 = this.f97571g;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                android.content.Context context = lVar2.f97572a;
                lVar2.f97576e = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), lVar2.f97572a.getString(com.tencent.mm.R.string.f490583z4), true, true, new com.tencent.mm.plugin.emoji.model.j(lVar2));
                it = lVar2.f97573b.iterator();
                lVar = lVar2;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (java.util.Iterator) this.f97569e;
                lVar = (com.tencent.mm.plugin.emoji.model.l) this.f97568d;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                this.f97568d = lVar;
                this.f97569e = it;
                this.f97570f = 1;
                if (lVar.a(str, this) == aVar) {
                    return aVar;
                }
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = lVar2.f97576e;
            if (u3Var != null) {
                u3Var.dismiss();
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = lVar2.f97576e;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        }
        return jz5.f0.f302826a;
    }
}
