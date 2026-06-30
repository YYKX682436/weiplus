package ah4;

/* loaded from: classes13.dex */
public class o implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ah4.p f86538a;

    public o(ah4.p pVar) {
        this.f86538a = pVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MicRecoder", "pcm data too low");
            return;
        }
        ah4.p pVar = this.f86538a;
        pVar.getClass();
        for (int i18 = 0; i18 < i17 / 2; i18++) {
            int i19 = i18 * 2;
            short s17 = (short) ((bArr[i19 + 1] << 8) | (bArr[i19] & 255));
            if (s17 > pVar.f86540f) {
                pVar.f86540f = s17;
            }
        }
        int m71572x2743a8 = pVar.f86539e.m71572x2743a8(bArr, (short) i17);
        if (m71572x2743a8 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MicRecoder", "send failed, ret: " + m71572x2743a8);
        }
    }
}
