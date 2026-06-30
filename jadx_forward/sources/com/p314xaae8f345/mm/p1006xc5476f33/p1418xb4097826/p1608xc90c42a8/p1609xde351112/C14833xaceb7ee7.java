package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$finishLoadMore$1 */
/* loaded from: classes10.dex */
final class C14833xaceb7ee7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback f204740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f204741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14833xaceb7ee7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback, java.util.List list) {
        super(0);
        this.f204740d = notifyViewCallback;
        this.f204741e = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ym5.s3 s3Var = new ym5.s3(1);
        s3Var.f545055g = false;
        java.util.List list = this.f204741e;
        s3Var.f545054f = true ^ list.isEmpty();
        s3Var.f545056h = list.size();
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f204740d.f204729g;
        if (c22801x87cbdc00 != null) {
            c22801x87cbdc00.mo56054xc12c74c0(s3Var);
        }
        return jz5.f0.f384359a;
    }
}
