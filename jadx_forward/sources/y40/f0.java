package y40;

/* loaded from: classes8.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.k2 f540821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y40.i0 f540822e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.k2 k2Var, y40.i0 i0Var) {
        super(0);
        this.f540821d = k2Var;
        this.f540822e = i0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d0> appmsg_list = this.f540821d.f301112e.f300914d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appmsg_list, "appmsg_list");
        for (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d0 d0Var : appmsg_list) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f540822e.f540828d, "syncAllFoldBlockMpArticle has been block key : " + d0Var.f300888d);
            r01.q3.oj().s(d0Var.f300888d, 3);
        }
        return jz5.f0.f384359a;
    }
}
