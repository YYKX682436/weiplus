package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$finishLoadMore$1 */
/* loaded from: classes10.dex */
public final class C14626x3d279077 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f204112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback f204113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f204114f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f204115g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14626x3d279077(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback blockListViewCallback, java.util.List list, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        super(0);
        this.f204112d = z17;
        this.f204113e = blockListViewCallback;
        this.f204114f = list;
        this.f204115g = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f204112d;
        java.util.List list = this.f204114f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback blockListViewCallback = this.f204113e;
        if (z17) {
            blockListViewCallback.f204105d.f204100f.clear();
            blockListViewCallback.f204105d.f204100f.addAll(list);
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = blockListViewCallback.f204109h;
            if (c22801x87cbdc00 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc00.P(0);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = blockListViewCallback.f204108g;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
        } else {
            blockListViewCallback.f204105d.f204100f.addAll(list);
            ym5.s3 s3Var = new ym5.s3(1);
            s3Var.f545055g = false;
            s3Var.f545054f = !list.isEmpty();
            s3Var.f545056h = list.size();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = blockListViewCallback.f204108g;
            if (c1163xf1deaba42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c1163xf1deaba42.mo7946xf939df19();
            if (mo7946xf939df192 != null) {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = blockListViewCallback.f204111m;
                java.lang.Integer valueOf = c22848x6ddd90cf != null ? java.lang.Integer.valueOf(c22848x6ddd90cf.a0() + this.f204115g.f391649d) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                mo7946xf939df192.m8153xd399a4d9(valueOf.intValue(), list.size());
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = blockListViewCallback.f204109h;
            if (c22801x87cbdc002 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc002.mo56054xc12c74c0(s3Var);
        }
        blockListViewCallback.o();
        return jz5.f0.f384359a;
    }
}
