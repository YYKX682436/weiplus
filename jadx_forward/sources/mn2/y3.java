package mn2;

/* loaded from: classes4.dex */
public final class y3 {
    public y3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        long[] jArr = new long[3];
        ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37761x660d22b0(mediaId, jArr);
        long j17 = jArr[0];
        long j18 = jArr[1];
        if (j17 == j18 && j18 == jArr[2]) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.VideoDownloader", "[checkFinishValid] mediaId=" + mediaId + ' ' + jArr[0] + ':' + jArr[1] + ':' + jArr[2]);
        return false;
    }
}
