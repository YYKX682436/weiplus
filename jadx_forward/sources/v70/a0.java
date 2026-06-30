package v70;

/* loaded from: classes12.dex */
public final class a0 {
    public a0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(oi3.f msgInfo) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        int i17 = msgInfo.f427150d;
        if (msgInfo.m75942xfb822ef2(i17 + 0) == 0) {
            str = "thumb_" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(msgInfo.k()) + '_' + msgInfo.n() + '_' + msgInfo.l();
        } else {
            str = "msginfo_thumb_" + msgInfo.m75942xfb822ef2(i17 + 0) + '_' + msgInfo.m75945x2fec8307(i17 + 3) + '_' + msgInfo.n() + '_' + msgInfo.l();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgDownload.MsgImgLoaderFeatureService", "[genImageKey]:[path:" + msgInfo.k() + "][key:" + str + ']');
        return str;
    }

    public final java.util.HashMap b() {
        return (java.util.HashMap) ((jz5.n) v70.b0.f515134n).mo141623x754a37bb();
    }
}
