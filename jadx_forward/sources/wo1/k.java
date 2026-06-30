package wo1;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12856xc25e966b f529504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f529505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f529506f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12856xc25e966b c12856xc25e966b, java.util.List list, java.util.concurrent.CountDownLatch countDownLatch) {
        super(1);
        this.f529504d = c12856xc25e966b;
        this.f529505e = list;
        this.f529506f = countDownLatch;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        this.f529504d.m53987x5cd917c7(this.f529505e, (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f) obj);
        this.f529506f.countDown();
        return jz5.f0.f384359a;
    }
}
