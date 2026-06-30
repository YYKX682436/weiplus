package i53;

/* loaded from: classes8.dex */
public final class l4 {
    public final p43.a a(m33.k1 k1Var, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(k1Var.f404838c);
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        java.lang.String a17 = kk.k.a(r6Var);
        java.lang.String str3 = k1Var.f404836a + '_' + a17 + ".mp4";
        android.graphics.Bitmap createVideoThumbnail = android.media.ThumbnailUtils.createVideoThumbnail(k1Var.f404838c, 2);
        java.lang.String str4 = str + ("cover_" + a17 + ".png");
        java.lang.String str5 = str + str3;
        if (createVideoThumbnail != null && !createVideoThumbnail.isRecycled()) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(createVideoThumbnail, 100, android.graphics.Bitmap.CompressFormat.PNG, str4, true);
            } catch (java.io.IOException unused) {
            }
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o oVar = (com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class);
        java.lang.String str6 = k1Var.f404838c;
        ((be0.e) oVar).getClass();
        int a18 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str6, true).a();
        if (com.p314xaae8f345.mm.vfs.w6.d(k1Var.f404838c, str5, false) == -1) {
            return null;
        }
        p43.a aVar = new p43.a();
        aVar.f67902xf9dbbe9c = a17;
        aVar.f67906x13fe5d2b = str2;
        aVar.f67895x28d45f97 = k1Var.f404836a;
        aVar.f67896x453d1e07 = k1Var.f404837b;
        aVar.f67903xf1e9b966 = str5;
        aVar.f67904x4326f700 = k1Var.f404838c;
        aVar.f67897x109ca377 = str4;
        aVar.f67901x6985322e = k1Var.f404839d;
        aVar.f67898xac3be4e = java.lang.System.currentTimeMillis();
        aVar.f67900x4f407658 = a18;
        aVar.f67905x29dd02d3 = k1Var.f404840e;
        aVar.f67899x225aa2b6 = k1Var.f404841f;
        return aVar;
    }

    public final void b(java.util.List videoList, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoList, "videoList");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(videoList, 10));
        java.util.Iterator it = videoList.iterator();
        while (it.hasNext()) {
            p43.a aVar = (p43.a) it.next();
            q33.c cVar = new q33.c();
            cVar.f441471d = aVar.f67902xf9dbbe9c;
            cVar.f441473f = aVar.f67895x28d45f97;
            cVar.f441472e = aVar.f67901x6985322e;
            arrayList.add(cVar);
        }
        q33.d dVar = new q33.d();
        dVar.f441474d = i17;
        dVar.f441475e = new java.util.LinkedList(arrayList);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = dVar;
        lVar.f152198b = new q33.e();
        lVar.f152199c = "/cgi-bin/mmgame-bin/reportlocalwxagvideo";
        lVar.f152200d = 25686;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new i53.j4(dVar));
    }
}
