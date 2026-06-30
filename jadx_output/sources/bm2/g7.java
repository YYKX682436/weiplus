package bm2;

/* loaded from: classes8.dex */
public final class g7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.k7 f21920d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(bm2.k7 k7Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f21920d = k7Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bm2.g7(this.f21920d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bm2.g7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.content.Context context = this.f21920d.f22039h;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = context.getString(com.tencent.mm.R.string.du6);
        return e4Var.c();
    }
}
