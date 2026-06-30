package wo4;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final wo4.a f529774a = new wo4.a();

    public final boolean a(java.lang.String src, java.lang.String dest) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(src, "src");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        try {
            if (!com.p314xaae8f345.mm.vfs.w6.j(src)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimpleAudioExtractor", "src empty :".concat(src));
                return false;
            }
            com.p314xaae8f345.mm.vfs.w6.h(dest);
            com.p314xaae8f345.mm.vfs.w6.e(dest);
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(src);
            gp.c cVar = new gp.c();
            cVar.k(src);
            int d17 = cVar.d();
            int i17 = 0;
            while (true) {
                if (i17 >= d17) {
                    i17 = -1;
                    break;
                }
                android.media.MediaFormat e17 = cVar.e(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getTrackFormat(...)");
                java.lang.String string = e17.getString("mime");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                if (r26.n0.B(string, "audio", false)) {
                    break;
                }
                i17++;
            }
            if (i17 == -1) {
                return false;
            }
            android.media.MediaFormat e18 = cVar.e(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e18, "getTrackFormat(...)");
            java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(dest, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i18);
            android.media.MediaMuxer mediaMuxer = new android.media.MediaMuxer(i18, 0);
            mediaMuxer.addTrack(e18);
            mediaMuxer.start();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimpleAudioExtractor", "[extract] src = " + src + ",length:" + k17);
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(1048576);
            cVar.i(i17);
            java.lang.System.currentTimeMillis();
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            while (true) {
                int f17 = cVar.f(allocate, 0);
                if (f17 < 0) {
                    mediaMuxer.stop();
                    mediaMuxer.release();
                    cVar.g();
                    java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.mm.vfs.w6.k(dest);
                    return true;
                }
                bufferInfo.offset = 0;
                bufferInfo.size = f17;
                bufferInfo.presentationTimeUs = cVar.b();
                bufferInfo.flags = cVar.f355695a.getSampleFlags();
                mediaMuxer.writeSampleData(0, allocate, bufferInfo);
                cVar.a();
            }
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SimpleAudioExtractor", "extract aac error:" + e19.getMessage());
            return false;
        }
    }
}
