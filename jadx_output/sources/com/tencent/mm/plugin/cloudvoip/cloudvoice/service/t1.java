package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes13.dex */
public class t1 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f96096a;

    public t1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var) {
        this.f96096a = p0Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j
    public void a(int i17, java.nio.ByteBuffer byteBuffer, int i18, int i19, int i27) {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = this.f96096a;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c0 c0Var = (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c0) p0Var.T1.get(java.lang.Integer.valueOf(i17));
        long nanoTime = java.lang.System.nanoTime() / 1000;
        if (c0Var == null) {
            p0Var.l(i17, i18, i19);
        }
        if (byteBuffer == null) {
            return;
        }
        try {
            byteBuffer.flip();
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr);
            int i28 = i18 * i19;
            int i29 = i28 / 4;
            byte[] bArr2 = new byte[remaining];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, i28);
            for (int i37 = 0; i37 < i29; i37++) {
                int i38 = (i37 * 2) + i28;
                bArr2[i38] = bArr[i28 + i37];
                bArr2[i38 + 1] = bArr[i28 + i29 + i37];
            }
            c0Var.c(bArr2, nanoTime);
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "Failed to encode video %s", e17);
        }
    }
}
