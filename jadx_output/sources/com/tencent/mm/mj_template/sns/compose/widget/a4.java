package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class a4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f69843d;

    /* renamed from: e, reason: collision with root package name */
    public int f69844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.MJTemplateInfo f69845f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f69846g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.tencent.maas.model.MJTemplateInfo mJTemplateInfo, n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f69845f = mJTemplateInfo;
        this.f69846g = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.mj_template.sns.compose.widget.a4(this.f69845f, this.f69846g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.mj_template.sns.compose.widget.a4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        n0.v2 v2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f69844e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.maas.model.MJTemplateInfo mJTemplateInfo = this.f69845f;
            java.lang.String previewImageWxAMURL = mJTemplateInfo.getPreviewImageWxAMURL();
            kotlin.jvm.internal.o.f(previewImageWxAMURL, "getPreviewImageWxAMURL(...)");
            java.lang.String previewImageGifURL = mJTemplateInfo.getPreviewImageGifURL();
            kotlin.jvm.internal.o.f(previewImageGifURL, "getPreviewImageGifURL(...)");
            n0.v2 v2Var2 = this.f69846g;
            this.f69843d = v2Var2;
            this.f69844e = 1;
            obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new lz0.c(previewImageGifURL, previewImageWxAMURL, null), this);
            if (obj == aVar) {
                return aVar;
            }
            v2Var = v2Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v2Var = (n0.v2) this.f69843d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        v2Var.setValue((com.tencent.mm.plugin.gif.b) obj);
        return jz5.f0.f302826a;
    }
}
