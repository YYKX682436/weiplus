package wq4;

/* loaded from: classes14.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f530220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 f530221e;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f65, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f530221e = c18924x4c862f65;
        this.f530220d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f65 = this.f530221e;
        int i17 = c18924x4c862f65.f258600o;
        int i18 = c18924x4c862f65.f258601p;
        byte[] bArr = new byte[i17 * i18 * 2];
        c18924x4c862f65.f258599n = bArr;
        c18924x4c862f65.f258598m.x(bArr, i17, i18, bArr, 5, 0);
        this.f530220d.countDown();
    }
}
