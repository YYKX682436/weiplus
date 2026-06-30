package y34;

/* loaded from: classes13.dex */
public abstract class a {
    public static void a(java.nio.ByteBuffer byteBuffer, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("position", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("ensureUInt", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Unsigned");
        if (j17 < 0 || j17 > 2147483647L) {
            java.lang.ArithmeticException arithmeticException = new java.lang.ArithmeticException("unsigned integer overflow");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ensureUInt", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Unsigned");
            throw arithmeticException;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ensureUInt", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Unsigned");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("position", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        byteBuffer.position((int) j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("position", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("position", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
    }

    public static short b(java.nio.ByteBuffer byteBuffer) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("readUByte", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        short s17 = (short) (byteBuffer.get() & 255);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readUByte", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        return s17;
    }

    public static long c(java.nio.ByteBuffer byteBuffer) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("readUInt", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        long j17 = byteBuffer.getInt() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readUInt", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        return j17;
    }
}
