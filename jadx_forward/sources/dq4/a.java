package dq4;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final dq4.a f323900a = new dq4.a();

    public final java.lang.String a(gp.c cVar, java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        byteBuffer.clear();
        byteBuffer.position(0);
        int i27 = 0;
        while (cVar != null) {
            try {
                if (cVar.c() < 0) {
                    break;
                }
                int f17 = cVar.f(byteBuffer, i27 + 7);
                if (f17 > 2) {
                    int i28 = f17 + 7;
                    di3.a.a(byteBuffer, i27, i28, i17, i18, i19);
                    i27 += i28;
                }
                cVar.a();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("AudioUtil", e17, "loadAudioTrackData error:" + e17.getMessage(), new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioUtil", "[" + hashCode() + "]load audio track size:" + i27 + " cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        dw3.c0 c0Var = dw3.c0.f325715a;
        t21.o2.Bi().getClass();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb7.append(gm0.j1.u().d());
        sb7.append("tmp/audio");
        java.lang.String i29 = com.p314xaae8f345.mm.vfs.w6.i(sb7.toString(), true);
        if (!com.p314xaae8f345.mm.vfs.w6.j(i29)) {
            com.p314xaae8f345.mm.vfs.w6.u(i29);
        }
        sb6.append(i29 + '/' + java.lang.System.currentTimeMillis());
        sb6.append(".mp3");
        java.lang.String sb8 = sb6.toString();
        java.io.OutputStream K = com.p314xaae8f345.mm.vfs.w6.K(sb8, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(K, "openWrite(...)");
        byte[] bArr = new byte[i27];
        byteBuffer.position(0);
        byteBuffer.get(bArr);
        try {
            try {
                K.write(bArr);
                K.flush();
            } catch (java.lang.Throwable th6) {
                K.close();
                throw th6;
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("AudioUtil", e18, "saveBuffer2File error:" + e18.getMessage(), new java.lang.Object[0]);
        }
        K.close();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioUtil", "[" + hashCode() + "]save acc to path:" + sb8);
        return sb8;
    }
}
