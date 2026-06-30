package je1;

/* loaded from: classes15.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.AbstractC12251x248fbcf6 f380725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f380726e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.AbstractC12251x248fbcf6 abstractC12251x248fbcf6, java.util.concurrent.CountDownLatch countDownLatch) {
        super(1);
        this.f380725d = abstractC12251x248fbcf6;
        this.f380726e = countDownLatch;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        he1.k result = (he1.k) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        boolean z17 = result instanceof he1.j;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.AbstractC12251x248fbcf6 abstractC12251x248fbcf6 = this.f380725d;
        if (z17) {
            abstractC12251x248fbcf6.f165009m = true;
            java.lang.String str = ((he1.j) result).f362417a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            abstractC12251x248fbcf6.f165008i = str;
            abstractC12251x248fbcf6.f165006g = 0;
            abstractC12251x248fbcf6.f165007h = "ok";
        } else if (result instanceof he1.i) {
            abstractC12251x248fbcf6.f165009m = false;
            he1.i iVar = (he1.i) result;
            abstractC12251x248fbcf6.f165006g = iVar.f362415a;
            java.lang.String str2 = iVar.f362416b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
            abstractC12251x248fbcf6.f165007h = str2;
        }
        this.f380726e.countDown();
        return jz5.f0.f384359a;
    }
}
