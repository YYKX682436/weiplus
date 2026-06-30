package com.tencent.mm.modelvideoh265toh264;

/* loaded from: classes10.dex */
public class p extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Point f71717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelvideoh265toh264.r f71718b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.modelvideoh265toh264.r rVar, java.lang.String str) {
        super(str);
        this.f71718b = rVar;
        this.f71717a = null;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17;
        int i18;
        long j17;
        if (message.what == 1) {
            byte[] bArr = (byte[]) message.obj;
            boolean z17 = message.arg1 == 1;
            long j18 = message.arg2;
            com.tencent.mm.modelvideoh265toh264.r rVar = this.f71718b;
            if (rVar.f71736m != null) {
                com.tencent.mm.modelvideoh265toh264.g gVar = (com.tencent.mm.modelvideoh265toh264.g) rVar.f71742s;
                this.f71717a = new android.graphics.Point(gVar.f71682e.getInteger("width"), gVar.f71682e.getInteger("height"));
                android.media.MediaFormat mediaFormat = rVar.f71744u;
                if (mediaFormat != null) {
                    i17 = mediaFormat.getInteger("width");
                    i18 = rVar.f71744u.getInteger("height");
                } else {
                    i17 = 0;
                    i18 = 0;
                }
                com.tencent.mm.modelvideoh265toh264.e eVar = rVar.f71736m;
                android.graphics.Point point = this.f71717a;
                int i19 = point.x;
                int i27 = point.y;
                com.tencent.mm.modelvideoh265toh264.g gVar2 = (com.tencent.mm.modelvideoh265toh264.g) rVar.f71742s;
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "src color format: %s", java.lang.Integer.valueOf(gVar2.f71690m));
                int i28 = gVar2.f71690m != 19 ? 1 : 2;
                eVar.getClass();
                if (z17 || bArr == null) {
                    eVar.c(eVar.f71675u, true, j18);
                } else {
                    int i29 = eVar.f71658d;
                    int i37 = eVar.f71657c;
                    boolean z18 = (i19 == i37 && i27 == i29) ? false : true;
                    if (eVar.f71675u == null) {
                        eVar.f71675u = new byte[((i37 * i29) * 3) >> 1];
                    }
                    if (eVar.f71675u.length != bArr.length) {
                        eVar.f71675u = new byte[bArr.length];
                    }
                    if (eVar.f71659e != 19 || z18) {
                        int i38 = i28;
                        j17 = j18;
                        com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.yuv420pTo420XXAndScaleLock(bArr, i38, eVar.f71675u, eVar.f71676v, i17, i18, i19, i27, i37, i29);
                    } else {
                        java.lang.System.arraycopy(bArr, 0, eVar.f71675u, 0, bArr.length);
                        j17 = j18;
                    }
                    eVar.f71661g++;
                    eVar.c(eVar.f71675u, false, j17);
                }
                com.tencent.mm.modelvideoh265toh264.c cVar = com.tencent.mm.modelvideoh265toh264.c.f71653d;
                synchronized (cVar) {
                    cVar.k(bArr);
                }
            }
        }
    }
}
