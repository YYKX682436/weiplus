package yb1;

/* loaded from: classes7.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb1.o f542195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f542196e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yb1.o oVar, int i17) {
        super(1);
        this.f542195d = oVar;
        this.f542196e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.concurrent.ConcurrentHashMap b17 = this.f542195d.b();
        int i17 = this.f542196e;
        b17.remove(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPageContentService", "getDocumentRootId callbackId:" + i17 + " was cancelled due to timeout.");
        return jz5.f0.f384359a;
    }
}
