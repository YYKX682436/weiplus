package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/tencent/mm/modelbase/f;", "Lr45/n81;", "cgiBack", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/modelbase/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$doScene$2 */
/* loaded from: classes10.dex */
public final class C14729x13a055e9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter f204372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f204373e;

    @qz5.f(c = "com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$doScene$2$1", f = "FinderMsgContract.kt", l = {}, m = "invokeSuspend")
    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/y0;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$doScene$2$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    final class AnonymousClass1 extends qz5.l implements yz5.p {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter f204374d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter msgPresenter, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
            super(2, interfaceC29045xdcb5ca57);
            this.f204374d = msgPresenter;
        }

        @Override // qz5.a
        /* renamed from: create */
        public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14729x13a055e9.AnonymousClass1(this.f204374d, interfaceC29045xdcb5ca57);
        }

        @Override // yz5.p
        /* renamed from: invoke */
        public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14729x13a055e9.AnonymousClass1 anonymousClass1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14729x13a055e9.AnonymousClass1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
            jz5.f0 f0Var = jz5.f0.f384359a;
            anonymousClass1.mo150x989b7ca4(f0Var);
            return f0Var;
        }

        @Override // qz5.a
        /* renamed from: invokeSuspend */
        public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
            pz5.a aVar = pz5.a.f440719d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter msgPresenter = this.f204374d;
            final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback = msgPresenter.f204360h;
            if (msgViewCallback != null) {
                final boolean isEmpty = msgPresenter.f204361i.isEmpty();
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$doScene$2$1$1$runnable$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z17 = isEmpty;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback2 = msgViewCallback;
                        if (z17) {
                            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14752x6c10ad9a(msgViewCallback2.m130335x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573430el4), msgViewCallback2, true, msgViewCallback2.m130335x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30)));
                        }
                        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = msgViewCallback2.f204396m;
                        if (c22801x87cbdc00 != null) {
                            c22801x87cbdc00.P(0);
                        } else {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                            throw null;
                        }
                    }
                };
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a.getClass();
                long j17 = uptimeMillis - com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204354b;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                if (j17 >= ((java.lang.Number) t70Var.F2().r()).longValue()) {
                    runnable.run();
                } else {
                    long longValue = ((java.lang.Number) t70Var.F2().r()).longValue() - j17;
                    java.util.regex.Pattern pattern = pm0.v.f438335a;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, longValue);
                }
            }
            return jz5.f0.f384359a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14729x13a055e9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter msgPresenter, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        super(1);
        this.f204372d = msgPresenter;
        this.f204373e = y0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter msgPresenter = this.f204372d;
        java.lang.String str = msgPresenter.f204359g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
        sb6.append(", errCode ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
        sb6.append(" errMsg ");
        sb6.append(fVar != null ? fVar.f152150c : null);
        sb6.append(" requestScene ");
        sb6.append(msgPresenter.f204357e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f204373e;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14729x13a055e9.AnonymousClass1(msgPresenter, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
