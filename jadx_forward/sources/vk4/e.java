package vk4;

/* loaded from: classes2.dex */
public final class e extends com.p314xaae8f345.mm.p944x882e457a.i {
    public e(bw5.g80 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        jm4.i4 Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
        boolean[] zArr = request.f109273x;
        if (Zi != null) {
            request.f109267r = (bw5.jb0) jm4.r5.d(p3380x6a61f93.p3381xf512d0a5.C30432x21b2b547.m168840x21b9afe4(((jm4.k4) Zi).m105978x2737f10(), request.f109266q), new bw5.jb0());
            zArr[13] = true;
        }
        byte[] mo14344x5f01b1f6 = request.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        lVar.f152197a = new qk.s9(mo14344x5f01b1f6);
        lVar.f152198b = new qk.t9();
        lVar.f152199c = "/cgi-bin/mmlistenappsvr/like";
        lVar.f152200d = 7310;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tingPostLike request appScene: ");
        sb6.append(request.f109265p);
        sb6.append(", listenId: ");
        sb6.append(request.m11970xcc16feb8());
        sb6.append(", categoryId: ");
        sb6.append(zArr[4] ? request.f109257e : "");
        sb6.append(", isCancel: ");
        sb6.append(request.f109258f);
        sb6.append(", type: ");
        sb6.append(request.f109260h);
        sb6.append(", finderFeedId: ");
        sb6.append(zArr[8] ? request.f109262m : "");
        sb6.append(", qqMusicSongId: ");
        sb6.append(request.f109263n);
        sb6.append(", qqMusicMid: ");
        sb6.append(zArr[10] ? request.f109264o : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingListenPostLikeCGI", sb6.toString());
    }
}
