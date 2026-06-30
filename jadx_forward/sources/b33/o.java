package b33;

/* loaded from: classes8.dex */
public final class o extends b33.i implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener, xg5.b {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f99210f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 f99211g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f99210f = new java.util.ArrayList();
    }

    public final void V6(int i17, yz5.l callback) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.Iterator it = this.f99210f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (i17 == ((java.lang.Number) ((jz5.l) obj).f384366d).intValue()) {
                    break;
                }
            }
        }
        jz5.l lVar = (jz5.l) obj;
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = lVar != null ? (com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) lVar.f384367e : null;
        if (c22584xf7d97e83 == null) {
            callback.mo146xb9724478(null);
            return;
        }
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = c22584xf7d97e83.f292654p;
        if (abstractActivityC22579xbed01a37 == null) {
            c22584xf7d97e83.q0(new b33.j(callback, c22584xf7d97e83));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractActivityC22579xbed01a37, "null cannot be cast to non-null type com.tencent.mm.ui.gallery.BaseMediaTabActivity");
            callback.mo146xb9724478((com.p314xaae8f345.mm.ui.p2706xf44c7752.AbstractActivityC22408xd92d9051) abstractActivityC22579xbed01a37);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37;
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f99211g;
        boolean z17 = false;
        if (c22584xf7d97e83 != null && (abstractActivityC22579xbed01a37 = c22584xf7d97e83.f292654p) != null) {
            abstractActivityC22579xbed01a37.onBackPressed();
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaPickerUIC", "onBackPressed, consume result=" + z17);
        return z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v24, types: [com.tencent.mm.ui.vas.VASCommonFragment] */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.tab.C15641x13af06a1 c15641x13af06a1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.tab.C15641x13af06a1 c15641x13af06a12;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaPickerUIC", "onCreate");
        android.content.Intent intent = m158354x19263085().getIntent();
        int[] intArrayExtra = intent.getIntArrayExtra("MediaTabTypeList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(intArrayExtra, "null cannot be cast to non-null type kotlin.IntArray");
        int length = intArrayExtra.length;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            arrayList = this.f99210f;
            if (i17 >= length) {
                break;
            }
            int i19 = intArrayExtra[i17];
            int i27 = i18 + 1;
            android.content.Intent intent2 = new android.content.Intent();
            android.os.Bundle bundleExtra = intent.getBundleExtra("MediaTabTypeList" + i19);
            if (bundleExtra == null) {
                bundleExtra = new android.os.Bundle();
            }
            intent2.putExtras(bundleExtra);
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            if (i19 != 1) {
                if (i19 == 2) {
                    int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465.f237158t;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.tab.C15641x13af06a1 c15641x13af06a13 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.tab.C15641x13af06a1) lk5.q0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465.class, intent2, false, false, false, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.tab.C15641x13af06a1.class, 28, null);
                    c15641x13af06a13.S = true;
                    c15641x13af06a12 = c15641x13af06a13;
                } else if (i19 == 3) {
                    int i29 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.I;
                    intent2.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.class);
                    intent2.putExtra("album_show_footerbar", false);
                    intent2.putExtra("album_select_only", true);
                    intent2.putExtra("album_show_source_type", 11);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.tab.C15641x13af06a1 c15641x13af06a14 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.tab.C15641x13af06a1) lk5.q0.a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.class, intent2, false, false, false, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.tab.C15641x13af06a1.class, 28, null);
                    c15641x13af06a14.R = true;
                    c15641x13af06a14.S = true;
                    c15641x13af06a12 = c15641x13af06a14;
                } else if (i19 != 4) {
                    c15641x13af06a12 = new com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83();
                } else {
                    rr1.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1294xd2ae381c.ActivityC12992x240effab.f175591i;
                    intent2.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1294xd2ae381c.ActivityC12992x240effab.class);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.tab.C15641x13af06a1 c15641x13af06a15 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.tab.C15641x13af06a1) lk5.q0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1294xd2ae381c.ActivityC12992x240effab.class, intent2, false, false, false, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.tab.C15641x13af06a1.class, 28, null);
                    c15641x13af06a15.R = true;
                    c15641x13af06a15.S = false;
                    c15641x13af06a1 = c15641x13af06a15;
                }
                c15641x13af06a1 = c15641x13af06a12;
            } else {
                intent2.putExtra("is_multi_tab_with_record", true);
                intent2.putExtra("key_check_permission_on_create", false);
                int i37 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15657x27c936d2.f220145x2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.tab.C15641x13af06a1 c15641x13af06a16 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.tab.C15641x13af06a1) lk5.q0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15657x27c936d2.class, intent2, false, false, false, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.tab.C15641x13af06a1.class, 28, null);
                c15641x13af06a16.R = false;
                c15641x13af06a1 = c15641x13af06a16;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaPickerUIC", "index:" + i18 + " type:" + i19 + " fragment:" + c15641x13af06a1);
            arrayList.add(new jz5.l(java.lang.Integer.valueOf(i19), c15641x13af06a1));
            if (i18 == T6()) {
                this.f99211g = c15641x13af06a1;
            }
            V6(i19, new b33.k(m158359x1e885992().getIntExtra("MediaOptScene", -1), i19 != 1 ? i19 != 2 ? i19 != 3 ? iy1.c.MainUI : iy1.c.MediaTabSnsAlbumUI : iy1.c.MediaTabCaptureUI : iy1.c.MediaTabAlbumUI));
            i17++;
            i18 = i27;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d U6 = U6();
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d mo7595x9cdc264 = m158354x19263085().mo7595x9cdc264();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo7595x9cdc264, "getSupportFragmentManager(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) ((jz5.l) it.next()).f384367e);
        }
        U6.mo79164x6cab2c8d(new b33.q(mo7595x9cdc264, arrayList2));
        U6().m80853x40341e13(intArrayExtra.length - 1);
        U6().m80821xa5a25773(this);
        V6(intArrayExtra[T6()], new b33.n(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaPickerUIC", "onDestroy");
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = this.f99210f;
        jz5.l lVar = (jz5.l) arrayList.get(i17);
        if (lVar == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f99211g;
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e832 = (com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) lVar.f384367e;
        this.f99211g = c22584xf7d97e832;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c22584xf7d97e832, c22584xf7d97e83);
        java.lang.Object obj2 = lVar.f384366d;
        if (!b17) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((jz5.l) obj).f384367e, c22584xf7d97e83)) {
                        break;
                    }
                }
            }
            jz5.l lVar2 = (jz5.l) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaPickerUIC", "onPageSelected:" + ((java.lang.Number) obj2).intValue() + " unselected:" + lVar2);
            V6(lVar2 != null ? ((java.lang.Number) lVar2.f384366d).intValue() : -1, new b33.l(this));
        }
        V6(((java.lang.Number) obj2).intValue(), new b33.m(this));
    }
}
