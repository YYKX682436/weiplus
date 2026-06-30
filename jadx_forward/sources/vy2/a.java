package vy2;

/* loaded from: classes10.dex */
public final class a extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback.UICallbackListener {

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f522987m = {"WxMessageLike", "WxMessageComment"};

    /* renamed from: d, reason: collision with root package name */
    public int f522988d;

    /* renamed from: e, reason: collision with root package name */
    public int f522989e;

    /* renamed from: f, reason: collision with root package name */
    public int f522990f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f522991g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback f522992h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter f522993i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f522988d = -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback.UICallbackListener
    public void F(dm.pd mention) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter O6() {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        if (!((m158358x197d1fc6 != null ? m158358x197d1fc6.mo7430x19263085() : null) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15083x5361f44e)) {
            return null;
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = m158358x197d1fc6();
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = m158358x197d1fc62 != null ? m158358x197d1fc62.mo7430x19263085() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7430x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderWxMsgUI");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15083x5361f44e) mo7430x19263085).f210331t;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b3y;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        java.util.List list;
        int i17;
        java.lang.StringBuilder sb6;
        super.mo739xfd763ae1(bundle);
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        this.f522989e = ((vy2.e) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(vy2.e.class)).f522994w;
        this.f522993i = O6();
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = m158358x197d1fc6 != null ? m158358x197d1fc6.mo7430x19263085() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7430x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        android.view.View m80380x71e92c1d = m80380x71e92c1d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter O6 = O6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(O6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback notifyViewCallback = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo7430x19263085, m80380x71e92c1d, O6, this, this.f522988d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter notifyPresenter = this.f522993i;
        if (notifyPresenter != null) {
            bq.p0 p0Var = bq.q0.f105046t;
            bq.q0.f105047u.clear();
            java.util.ArrayList arrayList = notifyPresenter.f204545o;
            arrayList.add(notifyViewCallback);
            if (arrayList.size() > 1) {
                kz5.g0.t(arrayList, new java.util.Comparator() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$onAttach$$inlined$sortBy$1
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                        return mz5.a.b(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback) obj).f204612d), java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback) obj2).f204612d));
                    }
                });
            }
            if (notifyPresenter.f204546p == null) {
                notifyPresenter.f204546p = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14770x86109c20(notifyViewCallback.f204616h, notifyPresenter.f204537d);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(notifyPresenter.f204540g, "onAttach " + notifyPresenter.f204538e);
        }
        notifyViewCallback.b();
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        java.lang.String[] strArr = f522987m;
        r45.f03 I0 = nk6.I0(strArr[this.f522988d]);
        this.f522990f = I0 != null ? I0.f455421e : 0;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc62);
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630852 = m158358x197d1fc62.mo7430x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7430x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        zx2.i b76 = ((vy2.e) zVar.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo7430x192630852).a(vy2.e.class)).b7(this.f522988d);
        if ((b76 instanceof gy2.b) && (i17 = this.f522990f) > 0) {
            if (i17 > 9999) {
                sb6 = new java.lang.StringBuilder("+");
                sb6.append(this.f522990f / 10000);
                sb6.append((char) 19975);
            } else {
                sb6 = new java.lang.StringBuilder("+");
                sb6.append(this.f522990f);
            }
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "setRedDot " + this.f522988d + ':' + sb7);
            ((gy2.b) b76).r(sb7, this.f522989e == this.f522988d);
        }
        int i18 = this.f522989e;
        int i19 = this.f522988d;
        if (i18 == i19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter notifyPresenter2 = this.f522993i;
            if (notifyPresenter2 != null && (list = notifyPresenter2.f204541h) != null) {
            }
            notifyViewCallback.x();
            this.f522991g = true;
        } else if (!this.f522991g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "refresh index: " + this.f522988d);
            notifyViewCallback.y();
            this.f522991g = true;
        }
        if (this.f522990f > 0) {
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N(strArr[this.f522988d]);
        }
        this.f522992h = notifyViewCallback;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        super.mo2281xb01dfb57();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback notifyViewCallback = this.f522992h;
        if (notifyViewCallback == null || (c22848x6ddd90cf = notifyViewCallback.f204618m) == null) {
            return;
        }
        c22848x6ddd90cf.z0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback notifyViewCallback = this.f522992h;
        if (notifyViewCallback == null || (c22848x6ddd90cf = notifyViewCallback.f204618m) == null) {
            return;
        }
        c22848x6ddd90cf.A0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
        java.util.List list;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "onUserVisibleFocused:" + this.f522991g + "  " + this.f522988d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter notifyPresenter = this.f522993i;
        if (notifyPresenter == null || (list = notifyPresenter.f204541h) == null) {
            return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "onUserVisibleUnFocused:" + this.f522991g + "  " + this.f522988d);
    }
}
