package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class kq extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f216513i = {"NotificationCenterLike", "NotificationCenterComment", "NotificationCenterFollow"};

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f216514m = {"MemberNotificationCenterLike", "MemberNotificationCenterComment", "MemberNotificationCenterJoin"};

    /* renamed from: d, reason: collision with root package name */
    public int f216515d;

    /* renamed from: e, reason: collision with root package name */
    public int f216516e;

    /* renamed from: f, reason: collision with root package name */
    public int f216517f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback f216518g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter f216519h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f216515d = -1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b3y;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter notifyPresenter = this.f216519h;
        if (notifyPresenter != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14770x86109c20 c14770x86109c20 = notifyPresenter.f204700w;
            if (c14770x86109c20 != null) {
                c14770x86109c20.e(i17, i18, intent);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("msgOperateVM");
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback;
        java.lang.String str;
        java.lang.StringBuilder sb6;
        super.mo739xfd763ae1(bundle);
        pf5.u uVar = pf5.u.f435469a;
        this.f216516e = ((ey2.f2) uVar.e(c61.l7.class).a(ey2.f2.class)).N6("FinderNotifyUIC", 1, xy2.c.e(m80379x76847179()));
        int i17 = (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp) uVar.b(m80379x76847179()).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp.class)).f215950w == 1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15031xc8d49129.f210110w : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15031xc8d49129.f210109v)[this.f216515d];
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc6);
        java.lang.Object obj = (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp) uVar.b(m80379x76847179()).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp.class)).f215950w == 1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15031xc8d49129.f210108u : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15031xc8d49129.f210107t).get(this.f216515d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        this.f216519h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter(m158358x197d1fc6, 1, i17, (int[]) obj, this.f216515d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp) uVar.b(m80379x76847179()).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp.class)).f215950w);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc62);
        android.view.View m80380x71e92c1d = m80380x71e92c1d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter notifyPresenter = this.f216519h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(notifyPresenter);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback(m158358x197d1fc62, m80380x71e92c1d, notifyPresenter, this.f216515d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter notifyPresenter2 = this.f216519h;
        if (notifyPresenter2 != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onAttach ");
            int i18 = notifyPresenter2.f204685e;
            sb7.append(i18);
            sb7.append(' ');
            sb7.append(notifyPresenter2.f204686f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter.B, sb7.toString());
            notifyPresenter2.f204699v = notifyViewCallback2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback3 = notifyPresenter2.f204699v;
            if (notifyViewCallback3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            notifyPresenter2.f204700w = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14770x86109c20(notifyViewCallback3.mo978x19263085(), i18);
            notifyPresenter2.f204702y.mo48813x58998cd();
            notifyPresenter2.A.mo48813x58998cd();
            notifyPresenter2.f204703z.mo48813x58998cd();
            boolean b17 = bq.q0.f105046t.b();
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment = notifyPresenter2.f204684d;
            if (b17) {
                int i19 = notifyPresenter2.f204685e;
                int i27 = notifyPresenter2.f204686f;
                int[] iArr = notifyPresenter2.f204687g;
                notifyViewCallback = notifyViewCallback2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback4 = notifyPresenter2.f204699v;
                if (notifyViewCallback4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14859x45ba311f c14859x45ba311f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14859x45ba311f(i19, i27, iArr, xy2.c.e(notifyViewCallback4.mo978x19263085()), notifyPresenter2.f204689i);
                int i28 = notifyPresenter2.f204685e;
                int i29 = notifyPresenter2.f204686f;
                int[] iArr2 = notifyPresenter2.f204687g;
                str = "FinderNotifyUIC";
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback5 = notifyPresenter2.f204699v;
                if (notifyViewCallback5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14859x45ba311f c14859x45ba311f2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14859x45ba311f(i28, i29, iArr2, xy2.c.e(notifyViewCallback5.mo978x19263085()), notifyPresenter2.f204689i);
                int i37 = notifyPresenter2.f204685e;
                int i38 = notifyPresenter2.f204686f;
                int[] iArr3 = notifyPresenter2.f204687g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback6 = notifyPresenter2.f204699v;
                if (notifyViewCallback6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14859x45ba311f c14859x45ba311f3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14859x45ba311f(i37, i38, iArr3, xy2.c.e(notifyViewCallback6.mo978x19263085()), notifyPresenter2.f204689i);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback7 = notifyPresenter2.f204699v;
                if (notifyViewCallback7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = notifyViewCallback7.f204729g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
                p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.b(fragment).a(ir2.a1.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.newloader.Loader<T of com.tencent.mm.plugin.finder.newloader.Loader.LoaderBuilder>");
                ir2.a1 a1Var = (ir2.a1) a17;
                a1Var.f375626f = c14859x45ba311f;
                a1Var.f375627g = null;
                a1Var.f375628h = c14859x45ba311f2;
                a1Var.f375629i = c14859x45ba311f3;
                a1Var.f375630m = null;
                a1Var.f375631n = c22801x87cbdc00;
                notifyPresenter2.f204697t = a1Var;
                notifyPresenter2.f();
            } else {
                notifyViewCallback = notifyViewCallback2;
                str = "FinderNotifyUIC";
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback8 = notifyPresenter2.f204699v;
                if (notifyViewCallback8 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14860x3da4763a c14860x3da4763a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14860x3da4763a(notifyPresenter2.f204687g, i18, xy2.c.e(notifyViewCallback8.mo978x19263085()), notifyPresenter2.f204689i);
                c14860x3da4763a.f204810i = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
                c14860x3da4763a.f204811m = 20;
                notifyPresenter2.f204701x = c14860x3da4763a;
                int i39 = notifyPresenter2.f204685e;
                int i47 = notifyPresenter2.f204686f;
                int[] iArr4 = notifyPresenter2.f204687g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback9 = notifyPresenter2.f204699v;
                if (notifyViewCallback9 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14859x45ba311f c14859x45ba311f4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14859x45ba311f(i39, i47, iArr4, xy2.c.e(notifyViewCallback9.mo978x19263085()), notifyPresenter2.f204689i);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14860x3da4763a c14860x3da4763a2 = notifyPresenter2.f204701x;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14860x3da4763a2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback10 = notifyPresenter2.f204699v;
                if (notifyViewCallback10 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = notifyViewCallback10.f204729g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
                p012xc85e97e9.p093xedfae76a.c1 a18 = pf5.z.f435481a.b(fragment).a(ir2.a1.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a18, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.newloader.Loader<T of com.tencent.mm.plugin.finder.newloader.Loader.LoaderBuilder>");
                ir2.a1 a1Var2 = (ir2.a1) a18;
                a1Var2.f375626f = c14860x3da4763a;
                a1Var2.f375627g = null;
                a1Var2.f375628h = c14859x45ba311f4;
                a1Var2.f375629i = c14860x3da4763a2;
                a1Var2.f375630m = null;
                a1Var2.f375631n = c22801x87cbdc002;
                notifyPresenter2.f204697t = a1Var2;
                notifyPresenter2.f();
                ir2.a1 a1Var3 = notifyPresenter2.f204697t;
                if (a1Var3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46636x3b6977b0);
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback11 = notifyPresenter2.f204699v;
                if (notifyViewCallback11 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) notifyViewCallback11.mo978x19263085();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback12 = notifyPresenter2.f204699v;
                if (notifyViewCallback12 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                notifyPresenter2.f204698u = new no2.c(i18, a1Var3, abstractActivityC21394xb3d2c0cf, notifyViewCallback12.f204729g);
            }
        } else {
            notifyViewCallback = notifyViewCallback2;
            str = "FinderNotifyUIC";
        }
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        int i48 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp.class)).f215950w;
        java.lang.String[] strArr = f216514m;
        java.lang.String[] strArr2 = f216513i;
        r45.f03 b07 = nk6.b0((i48 == 1 ? strArr : strArr2)[this.f216515d], xy2.c.e(m80379x76847179()));
        this.f216517f = b07 != null ? b07.f455421e : 0;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc63 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc63);
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = m158358x197d1fc63.mo7430x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7430x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        zx2.i b76 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp) zVar.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo7430x19263085).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp.class)).b7(this.f216515d);
        if ((b76 instanceof gy2.b) && b07 != null) {
            if (this.f216517f > 9999) {
                sb6 = new java.lang.StringBuilder("+");
                sb6.append(this.f216517f / 10000);
                sb6.append((char) 19975);
            } else {
                sb6 = new java.lang.StringBuilder("+");
                sb6.append(this.f216517f);
            }
            java.lang.String sb8 = sb6.toString();
            if (this.f216517f > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setRedDot " + this.f216515d + ':' + sb8);
                ((gy2.b) b76).r(sb8, false);
            } else {
                ((gy2.b) b76).r(sb8, false);
            }
        }
        notifyViewCallback.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter notifyPresenter3 = this.f216519h;
        if (notifyPresenter3 != null) {
            if (this.f216516e == this.f216515d) {
                notifyPresenter3.f204691n = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter.B, "loadFirstScreen:");
            ir2.a1 a1Var4 = notifyPresenter3.f204697t;
            if (a1Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46636x3b6977b0);
                throw null;
            }
            pf5.e.m158343xd39de650(a1Var4, null, null, new ir2.m0(a1Var4, null), 3, null);
            notifyPresenter3.g();
        }
        android.app.Activity context2 = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String w76 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp.class)).w7(this.f216515d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb S0 = zy2.ia.S0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), w76, xy2.c.e(m80379x76847179()), false, false, 12, null);
        r45.f03 b08 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0(w76, xy2.c.e(m80379x76847179()));
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc64 = m158358x197d1fc6();
        if (S0 != null && b08 != null && m158358x197d1fc64 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630852 = m158358x197d1fc64.mo7430x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7430x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo7430x192630852).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.i(x2Var, "5", S0, b08, 1, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
            if (this.f216516e == this.f216515d) {
                p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630853 = m158358x197d1fc64.mo7430x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7430x192630853, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo7430x192630853).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.i(x2Var, "5", S0, b08, 3, nyVar2 != null ? nyVar2.V6() : null, 1, null, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
            }
        }
        if (this.f216517f > 0) {
            zy2.fa nk7 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
            android.app.Activity context3 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
            if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp.class)).f215950w != 1) {
                strArr = strArr2;
            }
            nk7.y(strArr[this.f216515d], xy2.c.e(m80379x76847179()));
        }
        this.f216518g = notifyViewCallback;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter notifyPresenter = this.f216519h;
        if (notifyPresenter != null) {
            notifyPresenter.mo979x3f5eee52();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        super.mo2281xb01dfb57();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback = this.f216518g;
        if (notifyViewCallback == null || (c22848x6ddd90cf = notifyViewCallback.f204738s) == null) {
            return;
        }
        c22848x6ddd90cf.z0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter notifyPresenter = this.f216519h;
        if (notifyPresenter != null) {
            notifyPresenter.f204694q = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback = this.f216518g;
        if (notifyViewCallback == null || (c22848x6ddd90cf = notifyViewCallback.f204738s) == null) {
            return;
        }
        c22848x6ddd90cf.A0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter notifyPresenter = this.f216519h;
        if (notifyPresenter != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.f204682a.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.f204683b.f138973q = java.lang.System.currentTimeMillis() - notifyPresenter.f204694q;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
        super.mo58275xd317978f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNotifyUIC", "onUserVisibleFocused:  " + this.f216515d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter notifyPresenter = this.f216519h;
        if (notifyPresenter == null) {
            return;
        }
        notifyPresenter.f204691n = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
        super.mo58437xaa858cb6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNotifyUIC", "onUserVisibleUnFocused:  " + this.f216515d);
    }
}
