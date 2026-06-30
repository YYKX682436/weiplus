package wq4;

/* loaded from: classes14.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f530222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f530223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f530224f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f530225g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 f530226h;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f65, int i17, int i18, int i19, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f530226h = c18924x4c862f65;
        this.f530222d = i17;
        this.f530223e = i18;
        this.f530224f = i19;
        this.f530225g = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f65 = this.f530226h;
        int i17 = c18924x4c862f65.f258600o;
        int i18 = this.f530223e;
        int i19 = this.f530222d;
        if (i19 != i17 || i18 != c18924x4c862f65.f258601p) {
            c18924x4c862f65.f258598m.J(i19, i18);
            c18924x4c862f65.f258600o = i19;
            c18924x4c862f65.f258601p = i18;
        }
        p05.l4 l4Var = c18924x4c862f65.f258598m;
        byte[] bArr = c18924x4c862f65.f258599n;
        l4Var.x(bArr, this.f530222d, this.f530223e, bArr, 5, this.f530224f);
        this.f530225g.countDown();
    }
}
