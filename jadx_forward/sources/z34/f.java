package z34;

/* loaded from: classes13.dex */
public class f implements z34.h {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f551527b;

    /* renamed from: c, reason: collision with root package name */
    public int f551528c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final z34.i f551529d;

    public f(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        this.f551527b = bArr;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
        int min = java.lang.Math.min(bArr.length - this.f551528c, 16);
        java.lang.System.arraycopy(bArr, this.f551528c, bArr2, 0, min);
        this.f551528c += min;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
        if (min != 16) {
            throw new z34.g("Error reading elf header (read " + min + "bytes, expected to read 16bytes).");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMagicNumber", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
        byte[] bArr3 = {bArr2[0], bArr2[1], bArr2[2], bArr2[3]};
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMagicNumber", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
        if (!java.util.Arrays.equals(bArr3, z34.h.f551530a)) {
            throw new z34.g("Bad magic number for file.");
        }
        this.f551529d = new z34.e(this);
    }

    public static /* synthetic */ byte[] a(z34.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
        byte[] bArr = fVar.f551527b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
        return bArr;
    }
}
