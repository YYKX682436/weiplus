package vw;

/* loaded from: classes8.dex */
public final class j2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i3 f522199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vw.m2 f522200e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i3 i3Var, vw.m2 m2Var) {
        super(0);
        this.f522199d = i3Var;
        this.f522200e = m2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h0> appmsg_list = this.f522199d.f299717e.f299708d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appmsg_list, "appmsg_list");
        for (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h0 h0Var : appmsg_list) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f522200e.f522217d, "syncAllFoldBlockMpArticle has been block key : " + h0Var.f299626d);
            r01.q3.oj().s(h0Var.f299626d, 3);
        }
        return jz5.f0.f384359a;
    }
}
