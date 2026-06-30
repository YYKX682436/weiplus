package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes13.dex */
public class t1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 f177629a;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var) {
        this.f177629a = p0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.j
    public void a(int i17, java.nio.ByteBuffer byteBuffer, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = this.f177629a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c0) p0Var.T1.get(java.lang.Integer.valueOf(i17));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "Failed to encode video %s", e17);
        }
    }
}
