package com.tencent.mm.feature.emoji;

@j95.b
/* loaded from: classes4.dex */
public final class n4 extends i95.w implements com.tencent.mm.feature.emoji.api.s6 {

    /* renamed from: d, reason: collision with root package name */
    public final wr.j f66406d = new wr.j();

    public java.lang.String wi(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        kotlin.jvm.internal.o.g(iEmojiInfo, "iEmojiInfo");
        wr.j jVar = this.f66406d;
        jVar.getClass();
        java.lang.String d17 = jVar.d(iEmojiInfo);
        if (d17 != null) {
            return d17;
        }
        wr.k e17 = jVar.e(iEmojiInfo);
        if (e17.f448753a.length() > 0) {
            com.tencent.mm.feature.emoji.api.t6 t6Var = (com.tencent.mm.feature.emoji.api.t6) i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class);
            java.lang.String md52 = iEmojiInfo.getMd5();
            kotlin.jvm.internal.o.f(md52, "getMd5(...)");
            java.lang.String Ui = ((com.tencent.mm.feature.emoji.r4) t6Var).Ui(md52, e17.f448753a);
            if (com.tencent.mm.vfs.w6.j(Ui)) {
                com.tencent.mars.xlog.Log.i("EmoticonThumbImageMgr", "get existing external downloaded thumb path. md5: " + iEmojiInfo.getMd5());
                return Ui;
            }
        }
        return null;
    }
}
