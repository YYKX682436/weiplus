package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f103873d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f103874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103875f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f103876g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, android.widget.ImageView imageView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f103875f = str;
        this.f103876g = imageView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.convert.l lVar = new com.tencent.mm.plugin.finder.convert.l(this.f103875f, this.f103876g, continuation);
        lVar.f103874e = obj;
        return lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.convert.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        android.widget.ImageView imageView;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f103873d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        jz5.f0 f0Var2 = null;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String str = this.f103875f;
                android.widget.ImageView imageView2 = this.f103876g;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
                com.tencent.mm.plugin.finder.convert.k kVar = new com.tencent.mm.plugin.finder.convert.k(str, null);
                this.f103874e = imageView2;
                this.f103873d = 1;
                obj = kotlinx.coroutines.l.g(p0Var, kVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                imageView = imageView2;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                imageView = (android.widget.ImageView) this.f103874e;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                f0Var2 = f0Var;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var2);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("FinderAIGCDraftInfoConvert", "Failed to load image: " + m524exceptionOrNullimpl);
        }
        return f0Var;
    }
}
