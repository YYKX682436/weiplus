package by0;

/* loaded from: classes12.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f36329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f36330e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.api.IEmojiInfo iEmojiInfo, com.tencent.mm.vfs.r6 r6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f36329d = iEmojiInfo;
        this.f36330e = r6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new by0.f(this.f36329d, this.f36330e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((by0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte[] z17;
        int S;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.vfs.r6 r6Var = by0.g.f36331a;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f36329d;
        kotlin.jvm.internal.o.g(iEmojiInfo, "<this>");
        com.tencent.mm.vfs.r6 tempFile = this.f36330e;
        kotlin.jvm.internal.o.g(tempFile, "tempFile");
        if (iEmojiInfo.getGroup() == 17) {
            z17 = kk.f.b(h12.e.a(com.tencent.mm.sdk.platformtools.x2.f193071a, iEmojiInfo.getName()));
        } else if (iEmojiInfo.I1()) {
            android.graphics.Bitmap W = iEmojiInfo.W(com.tencent.mm.sdk.platformtools.x2.f193071a);
            kotlin.jvm.internal.o.f(W, "getStaticBitmap(...)");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            W.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            z17 = byteArrayOutputStream.toByteArray();
            kotlin.jvm.internal.o.f(z17, "toByteArray(...)");
        } else {
            ((com.tencent.mm.feature.emoji.p1) ((com.tencent.mm.feature.emoji.api.f6) i95.n0.c(com.tencent.mm.feature.emoji.api.f6.class))).getClass();
            z17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().z((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo);
        }
        if (z17 == null) {
            S = -100;
        } else {
            S = z17.length == 0 ? -101 : com.tencent.mm.vfs.w6.S(tempFile.o(), z17, 0, z17.length);
        }
        return new java.lang.Integer(S);
    }
}
