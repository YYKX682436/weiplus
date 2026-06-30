package ch2;

/* loaded from: classes3.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f41391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.q f41392e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ch2.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41392e = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.k(this.f41392e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ch2.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f41391d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ch2.q qVar = this.f41392e;
            android.content.Context O6 = qVar.O6();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(O6);
            e4Var.f211776c = qVar.O6().getString(((mm2.o4) qVar.business(mm2.o4.class)).C7() ? com.tencent.mm.R.string.dsk : com.tencent.mm.R.string.dst);
            e4Var.c();
            this.f41391d = 1;
            if (kotlinx.coroutines.k1.b(30000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
