package ah4;

/* loaded from: classes13.dex */
public class o implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ah4.p f5005a;

    public o(ah4.p pVar) {
        this.f5005a = pVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MicRecoder", "pcm data too low");
            return;
        }
        ah4.p pVar = this.f5005a;
        pVar.getClass();
        for (int i18 = 0; i18 < i17 / 2; i18++) {
            int i19 = i18 * 2;
            short s17 = (short) ((bArr[i19 + 1] << 8) | (bArr[i19] & 255));
            if (s17 > pVar.f5007f) {
                pVar.f5007f = s17;
            }
        }
        int Send = pVar.f5006e.Send(bArr, (short) i17);
        if (Send < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MicRecoder", "send failed, ret: " + Send);
        }
    }
}
