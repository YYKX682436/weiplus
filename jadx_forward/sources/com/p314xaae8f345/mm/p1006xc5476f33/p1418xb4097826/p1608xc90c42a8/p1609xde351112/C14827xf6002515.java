package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$msgUpdateListener$1$callback$1 */
/* loaded from: classes10.dex */
final class C14827xf6002515 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter f204711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5508x3c9dcded f204712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f204713f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f204714g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14827xf6002515(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter notifyPresenter, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5508x3c9dcded c5508x3c9dcded, long j17, long j18) {
        super(0);
        this.f204711d = notifyPresenter;
        this.f204712e = c5508x3c9dcded;
        this.f204713f = j17;
        this.f204714g = j18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter notifyPresenter = this.f204711d;
        ir2.a1 a1Var = notifyPresenter.f204697t;
        java.lang.Throwable th6 = null;
        java.lang.String str2 = com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46636x3b6977b0;
        if (a1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46636x3b6977b0);
            throw null;
        }
        java.util.Iterator it = ((java.util.ArrayList) a1Var.f375624d).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                java.lang.Throwable th7 = th6;
                kz5.c0.p();
                throw th7;
            }
            so2.i iVar = (so2.i) next;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5508x3c9dcded c5508x3c9dcded = this.f204712e;
            am.lc lcVar = c5508x3c9dcded.f135839g;
            int i19 = lcVar.f88772d;
            int i27 = notifyPresenter.f204688h;
            if (i19 == 2) {
                java.lang.String str3 = lcVar.f88773e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter.B, "msgUpdateListener: FollowEvent index " + i17 + " tabIndex" + i27 + ", finderUsername=" + str3);
                if (str3 == null || str3.length() == 0) {
                    break;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, iVar.f491944d.f66131xdec927b)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback = notifyPresenter.f204699v;
                    if (notifyViewCallback == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                        throw th6;
                    }
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = notifyViewCallback.f204729g;
                    if (c22801x87cbdc00 != null && (m82555x4905e9fa2 = c22801x87cbdc00.m82555x4905e9fa()) != null && (mo7946xf939df192 = m82555x4905e9fa2.mo7946xf939df19()) != null) {
                        mo7946xf939df192.m8148xed6e4d18(i17, 2);
                    }
                }
                str = str2;
            } else {
                dm.pd pdVar = iVar.f491944d;
                str = str2;
                if (pdVar.f66095xc8a07680 == this.f204713f || pdVar.f66124x65f321b == this.f204714g) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter.B, "msgUpdateListener event index " + i17 + " tabIndex" + i27);
                    am.lc lcVar2 = c5508x3c9dcded.f135839g;
                    int i28 = lcVar2.f88772d;
                    dm.pd pdVar2 = iVar.f491944d;
                    if (i28 == 0) {
                        ir2.a1 a1Var2 = notifyPresenter.f204697t;
                        if (a1Var2 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                            throw null;
                        }
                        pf5.e.m158343xd39de650(a1Var2, null, null, new ir2.z0(pdVar2.f66095xc8a07680, null, null, false, a1Var2, null), 3, null);
                    } else if (i28 == 1) {
                        pdVar2.w0(lcVar2.f88771c);
                        ir2.a1 a1Var3 = notifyPresenter.f204697t;
                        if (a1Var3 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                            throw null;
                        }
                        ((java.util.ArrayList) a1Var3.f375624d).set(i17, iVar);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback2 = notifyPresenter.f204699v;
                        if (notifyViewCallback2 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                            throw null;
                        }
                        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = notifyViewCallback2.f204729g;
                        if (c22801x87cbdc002 != null && (m82555x4905e9fa = c22801x87cbdc002.m82555x4905e9fa()) != null && (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) != null) {
                            mo7946xf939df19.m8148xed6e4d18(i17, 1);
                        }
                    } else {
                        continue;
                    }
                }
            }
            i17 = i18;
            str2 = str;
            th6 = null;
        }
        return jz5.f0.f384359a;
    }
}
