package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$newLoadDataAndRefresh$1 */
/* loaded from: classes10.dex */
public final class C14795xfd173f79 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter f204594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f204595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f204596f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f204597g;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$newLoadDataAndRefresh$1$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    final class AnonymousClass1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter f204598d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f204599e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ java.util.ArrayList f204600f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f204601g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter notifyPresenter, int i17, java.util.ArrayList arrayList, boolean z17) {
            super(0);
            this.f204598d = notifyPresenter;
            this.f204599e = i17;
            this.f204600f = arrayList;
            this.f204601g = z17;
        }

        @Override // yz5.a
        /* renamed from: invoke */
        public java.lang.Object mo152xb9724478() {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter notifyPresenter = this.f204598d;
            int i17 = this.f204599e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback g17 = notifyPresenter.g(i17);
            if (g17 != null) {
                g17.t(this.f204600f, this.f204601g, false, i17);
            }
            return jz5.f0.f384359a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14795xfd173f79(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter notifyPresenter, java.util.ArrayList arrayList, int i17, boolean z17) {
        super(0);
        this.f204594d = notifyPresenter;
        this.f204595e = arrayList;
        this.f204596f = i17;
        this.f204597g = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter notifyPresenter = this.f204594d;
        java.lang.String str = notifyPresenter.f204540g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tobe mergeData from db data from DB:");
        java.util.ArrayList arrayList = this.f204595e;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161 c14783xc2c8f161 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.f204535a;
        int i17 = this.f204596f;
        long a17 = uptimeMillis - c14783xc2c8f161.a(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        pm0.v.V(a17 >= ((java.lang.Number) t70Var.F2().r()).longValue() ? 0L : ((java.lang.Number) t70Var.F2().r()).longValue() - a17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14795xfd173f79.AnonymousClass1(notifyPresenter, i17, arrayList, this.f204597g));
        return jz5.f0.f384359a;
    }
}
