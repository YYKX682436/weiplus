package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$msgUpdateListener$1$callback$1 */
/* loaded from: classes10.dex */
final class C14794xb2b5d3f3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter f204590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5508x3c9dcded f204591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f204592f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f204593g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14794xb2b5d3f3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter notifyPresenter, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5508x3c9dcded c5508x3c9dcded, long j17, long j18) {
        super(0);
        this.f204590d = notifyPresenter;
        this.f204591e = c5508x3c9dcded;
        this.f204592f = j17;
        this.f204593g = j18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Iterator it;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter notifyPresenter = this.f204590d;
        java.util.Iterator it6 = notifyPresenter.f204547q.iterator();
        int i17 = 0;
        loop0: while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) next;
            int i19 = 0;
            for (java.lang.Object obj : arrayList) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.i iVar = (so2.i) obj;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5508x3c9dcded c5508x3c9dcded = this.f204591e;
                am.lc lcVar = c5508x3c9dcded.f135839g;
                int i28 = lcVar.f88772d;
                java.util.ArrayList arrayList2 = notifyPresenter.f204545o;
                java.lang.String str = notifyPresenter.f204540g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter notifyPresenter2 = notifyPresenter;
                if (i28 == 2) {
                    java.lang.String str2 = lcVar.f88773e;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "msgUpdateListener: FollowEvent index " + i19 + " tabIndex" + i17 + ", finderUsername=" + str2);
                    if (str2 == null || str2.length() == 0) {
                        break loop0;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, iVar.f491944d.f66131xdec927b) && (c22848x6ddd90cf = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback) arrayList2.get(i17)).f204618m) != null) {
                        c22848x6ddd90cf.m8148xed6e4d18(i19, 2);
                    }
                    it = it6;
                } else {
                    dm.pd pdVar = iVar.f491944d;
                    it = it6;
                    if (pdVar.f66095xc8a07680 == this.f204592f || pdVar.f66124x65f321b == this.f204593g) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "msgUpdateListener event index " + i19 + " tabIndex" + i17);
                        am.lc lcVar2 = c5508x3c9dcded.f135839g;
                        int i29 = lcVar2.f88772d;
                        if (i29 == 0) {
                            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback) arrayList2.get(i17)).f204618m;
                            if (c22848x6ddd90cf2 != null) {
                                c22848x6ddd90cf2.m8147xed6e4d18(i19);
                            }
                        } else if (i29 == 1) {
                            iVar.f491944d.w0(lcVar2.f88771c);
                            arrayList.set(i19, iVar);
                            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback) arrayList2.get(i17)).f204618m;
                            if (c22848x6ddd90cf3 != null) {
                                c22848x6ddd90cf3.m8148xed6e4d18(i19, 1);
                            }
                        }
                    }
                }
                i19 = i27;
                notifyPresenter = notifyPresenter2;
                it6 = it;
            }
            i17 = i18;
        }
        return jz5.f0.f384359a;
    }
}
