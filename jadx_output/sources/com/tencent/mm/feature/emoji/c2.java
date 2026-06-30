package com.tencent.mm.feature.emoji;

/* loaded from: classes12.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f66196a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f66197b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f66198c;

    /* renamed from: d, reason: collision with root package name */
    public final qr.i f66199d;

    public c2(java.lang.String str, java.lang.String str2, java.lang.String str3, qr.i iVar) {
        this.f66196a = str;
        this.f66197b = str2;
        this.f66198c = str3;
        this.f66199d = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.tencent.mm.feature.emoji.c2 r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.emoji.c2.a(com.tencent.mm.feature.emoji.c2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.vfs.w6.j(str)) {
                try {
                    com.tencent.mm.vfs.w6.h(str);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.EmojiUploadAndPrepareTask", "cleanup error: " + e17.getMessage());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.tencent.mm.storage.emotion.EmojiInfo r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.emoji.c2.c(com.tencent.mm.storage.emotion.EmojiInfo, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
