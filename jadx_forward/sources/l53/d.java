package l53;

/* loaded from: classes8.dex */
public final class d implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l53.i f398174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398176c;

    public d(l53.i iVar, java.lang.String str, android.content.Context context) {
        this.f398174a = iVar;
        this.f398175b = str;
        this.f398176c = context;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        l53.a aVar;
        l53.i iVar = this.f398174a;
        if (i17 != 0 || i18 != 0 || (fVar = oVar.f152244b.f152233a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, doShareCgi failed errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + "  filePath = " + iVar.f398193a.f404838c);
            l53.a aVar2 = iVar.f398195c;
            if (aVar2 != null) {
                aVar2.a("doShareCgi error");
                return;
            }
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.videougc.AddWxagVideoResponse");
        q33.b bVar = (q33.b) fVar;
        java.lang.String str2 = bVar.f441470g;
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, doShareCgi failed share_url is null");
            l53.a aVar3 = iVar.f398195c;
            if (aVar3 != null) {
                aVar3.a("share_url is null");
                return;
            }
            return;
        }
        java.lang.String str3 = bVar.f441470g;
        if (str3 == null) {
            str3 = "";
        }
        m33.k1 videoFile = iVar.f398193a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoFile, "videoFile");
        java.lang.String shareThumbUrl = this.f398175b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareThumbUrl, "shareThumbUrl");
        if (l53.c.f398173a == null) {
            l53.c.f398173a = new java.util.HashMap();
        }
        l53.b bVar2 = new l53.b(videoFile, str3, shareThumbUrl);
        java.util.HashMap hashMap = l53.c.f398173a;
        if (hashMap != null) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(videoFile.f404838c);
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        }
        int i19 = iVar.f398194b;
        android.content.Context context = this.f398176c;
        if (i19 == 1) {
            iVar.c(context, str3, shareThumbUrl);
            return;
        }
        if (i19 == 2) {
            iVar.d(context, str3, shareThumbUrl);
        } else if (i19 == 3 && (aVar = iVar.f398195c) != null) {
            aVar.b(str3, shareThumbUrl);
        }
    }
}
