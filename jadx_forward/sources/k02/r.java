package k02;

/* loaded from: classes8.dex */
public final class r implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f384633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f384634b;

    public r(java.lang.String str, int i17) {
        this.f384633a = str;
        this.f384634b = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        c02.h hVar;
        c02.h hVar2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.downloader.game.dl.protobuf.GetCloudGameRetainConfResponse");
        c02.o oVar2 = (c02.o) fVar;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameDetainManager", "gamelog cgiGetCloudGameRetainConf CGI return, errType = " + i17 + ", errCode = " + str);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("response.detain_config_switch  = ");
        c02.c cVar = oVar2.f119146d;
        java.lang.Integer num = null;
        sb6.append(cVar != null ? java.lang.Boolean.valueOf(cVar.f119121d) : null);
        sb6.append("   response.user_record  = ");
        java.util.LinkedList linkedList = oVar2.f119147e;
        sb6.append(linkedList);
        sb6.append("  downloaderMaxDetainTime = ");
        c02.c cVar2 = oVar2.f119146d;
        if (cVar2 != null && (hVar2 = cVar2.f119123f) != null) {
            num = java.lang.Integer.valueOf(hVar2.f119132d);
        }
        sb6.append(num);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameDetainManager", sb6.toString());
        c02.c cVar3 = oVar2.f119146d;
        if (cVar3 == null || !cVar3.f119121d || (hVar = cVar3.f119123f) == null) {
            return;
        }
        if (hVar.f119132d > (linkedList != null ? linkedList.size() : 0)) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            int i19 = this.f384634b == 0 ? 2 : 3;
            java.lang.String appId = this.f384633a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            c02.l lVar2 = new c02.l();
            lVar2.f119138d = appId;
            lVar.f152197a = lVar2;
            lVar.f152198b = new c02.m();
            lVar.f152199c = "/cgi-bin/mmgame-bin/getcloudgamedownloadinfo";
            lVar.f152200d = 4786;
            com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.h0.a(lVar.a(), new k02.q(null, context, null, appId, i19));
        }
    }
}
