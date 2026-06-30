package com.p314xaae8f345.mm.p962x4177e4be;

/* loaded from: classes10.dex */
public class p extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Point f153250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p962x4177e4be.r f153251b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p962x4177e4be.r rVar, java.lang.String str) {
        super(str);
        this.f153251b = rVar;
        this.f153250a = null;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17;
        int i18;
        long j17;
        if (message.what == 1) {
            byte[] bArr = (byte[]) message.obj;
            boolean z17 = message.arg1 == 1;
            long j18 = message.arg2;
            com.p314xaae8f345.mm.p962x4177e4be.r rVar = this.f153251b;
            if (rVar.f153269m != null) {
                com.p314xaae8f345.mm.p962x4177e4be.g gVar = (com.p314xaae8f345.mm.p962x4177e4be.g) rVar.f153275s;
                this.f153250a = new android.graphics.Point(gVar.f153215e.getInteger("width"), gVar.f153215e.getInteger("height"));
                android.media.MediaFormat mediaFormat = rVar.f153277u;
                if (mediaFormat != null) {
                    i17 = mediaFormat.getInteger("width");
                    i18 = rVar.f153277u.getInteger("height");
                } else {
                    i17 = 0;
                    i18 = 0;
                }
                com.p314xaae8f345.mm.p962x4177e4be.e eVar = rVar.f153269m;
                android.graphics.Point point = this.f153250a;
                int i19 = point.x;
                int i27 = point.y;
                com.p314xaae8f345.mm.p962x4177e4be.g gVar2 = (com.p314xaae8f345.mm.p962x4177e4be.g) rVar.f153275s;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "src color format: %s", java.lang.Integer.valueOf(gVar2.f153223m));
                int i28 = gVar2.f153223m != 19 ? 1 : 2;
                eVar.getClass();
                if (z17 || bArr == null) {
                    eVar.c(eVar.f153208u, true, j18);
                } else {
                    int i29 = eVar.f153191d;
                    int i37 = eVar.f153190c;
                    boolean z18 = (i19 == i37 && i27 == i29) ? false : true;
                    if (eVar.f153208u == null) {
                        eVar.f153208u = new byte[((i37 * i29) * 3) >> 1];
                    }
                    if (eVar.f153208u.length != bArr.length) {
                        eVar.f153208u = new byte[bArr.length];
                    }
                    if (eVar.f153192e != 19 || z18) {
                        int i38 = i28;
                        j17 = j18;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66910x8353693d(bArr, i38, eVar.f153208u, eVar.f153209v, i17, i18, i19, i27, i37, i29);
                    } else {
                        java.lang.System.arraycopy(bArr, 0, eVar.f153208u, 0, bArr.length);
                        j17 = j18;
                    }
                    eVar.f153194g++;
                    eVar.c(eVar.f153208u, false, j17);
                }
                com.p314xaae8f345.mm.p962x4177e4be.c cVar = com.p314xaae8f345.mm.p962x4177e4be.c.f153186d;
                synchronized (cVar) {
                    cVar.k(bArr);
                }
            }
        }
    }
}
