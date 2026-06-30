package tu0;

/* loaded from: classes5.dex */
public class i extends tu0.h {

    /* renamed from: h, reason: collision with root package name */
    public int f503619h;

    /* renamed from: i, reason: collision with root package name */
    public int f503620i;

    public final void b() {
        java.io.RandomAccessFile B = com.p314xaae8f345.mm.vfs.w6.B(this.f503618g.o(), true);
        B.seek(0L);
        int i17 = this.f503619h;
        int i18 = this.f503620i;
        long C = 36 + this.f503618g.C();
        long j17 = i17;
        long j18 = ((i17 * 16) * i18) / 8;
        B.write(new byte[]{82, 73, 70, 70, (byte) (C & 255), (byte) ((C >> 8) & 255), (byte) ((C >> 16) & 255), (byte) ((C >> 24) & 255), 87, 65, 86, 69, 102, 109, 116, 32, com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028, 0, 0, 0, 1, 0, (byte) i18, 0, (byte) (j17 & 255), (byte) ((j17 >> 8) & 255), (byte) ((j17 >> 16) & 255), (byte) ((j17 >> 24) & 255), (byte) (j18 & 255), (byte) ((j18 >> 8) & 255), (byte) ((j18 >> 16) & 255), (byte) ((j18 >> 24) & 255), (byte) (i18 * 2), 0, com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028, 0, 100, 97, 116, 97, (byte) (r5 & 255), (byte) ((r5 >> 8) & 255), (byte) ((r5 >> 16) & 255), (byte) ((r5 >> 24) & 255)});
        B.close();
    }

    @Override // tu0.h, tu0.f
    /* renamed from: close */
    public void mo167049x5a5ddf8() {
        super.mo167049x5a5ddf8();
        try {
            b();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Luggage.PCMAudioEncoder", "", e17);
        }
    }

    @Override // tu0.h, tu0.f
    /* renamed from: init */
    public boolean mo167050x316510(java.lang.String str, int i17, int i18, int i19) {
        this.f503619h = i17;
        this.f503620i = i18;
        super.mo167050x316510(str, i17, i18, i19);
        return true;
    }
}
