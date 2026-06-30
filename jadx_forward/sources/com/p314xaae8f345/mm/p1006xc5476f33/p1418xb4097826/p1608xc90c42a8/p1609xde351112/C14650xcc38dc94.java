package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

/* JADX INFO: Access modifiers changed from: package-private */
@qz5.f(c = "com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$5", f = "FinderFollowListContract.kt", l = {}, m = "invokeSuspend")
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "count", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$5 */
/* loaded from: classes2.dex */
public final class C14650xcc38dc94 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f204168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback f204169e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14650xcc38dc94(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback followListViewCallback, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f204169e = followListViewCallback;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14650xcc38dc94 c14650xcc38dc94 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14650xcc38dc94(this.f204169e, interfaceC29045xdcb5ca57);
        c14650xcc38dc94.f204168d = ((java.lang.Number) obj).intValue();
        return c14650xcc38dc94;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14650xcc38dc94 c14650xcc38dc94 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14650xcc38dc94) mo148xaf65a0fc(java.lang.Integer.valueOf(((java.lang.Number) obj).intValue()), (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        c14650xcc38dc94.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        int i17 = this.f204168d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback followListViewCallback = this.f204169e;
        java.lang.String string = followListViewCallback.m130335x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8z, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = followListViewCallback.f204153d;
        abstractActivityC21394xb3d2c0cf.mo54450xbf7c1df6(string);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            abstractActivityC21394xb3d2c0cf.mo54449x3f86539a(followListViewCallback.m130335x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f6s));
        }
        if (i17 == 0) {
            android.widget.TextView textView = followListViewCallback.f204157h;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
                throw null;
            }
            textView.setVisibility(0);
            android.widget.TextView textView2 = followListViewCallback.f204157h;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
                throw null;
            }
            textView2.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cxi));
        } else {
            android.widget.TextView textView3 = followListViewCallback.f204157h;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
                throw null;
            }
            textView3.setVisibility(8);
        }
        return jz5.f0.f384359a;
    }
}
