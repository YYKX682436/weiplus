package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class du extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f215697d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f215698e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f215699f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f215700g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f215701h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f215702i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f215697d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zt(this));
        this.f215698e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.wt(this));
        this.f215699f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.au(this));
        this.f215700g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.cu(this));
        this.f215701h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vt(this));
        this.f215702i = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bu(this));
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14065xa37006af O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.du duVar) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14065xa37006af) ((jz5.n) duVar.f215697d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b5_;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 == 16666) {
            if (i18 != -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiRelativeListUIC", "map search result : cancel");
                return;
            }
            android.os.Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("KLocationIntent") : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parcelableExtra, "null cannot be cast to non-null type com.tencent.mm.pluginsdk.location.LocationIntent");
            com.p314xaae8f345.mm.p2470x93e71c27.p2473x714f9fb5.C19584xa6c132d1 c19584xa6c132d1 = (com.p314xaae8f345.mm.p2470x93e71c27.p2473x714f9fb5.C19584xa6c132d1) parcelableExtra;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiRelativeListUIC", "locationIntent: " + c19584xa6c132d1.a());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(c19584xa6c132d1.f270279p);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("extra_poi_list", arrayList);
            if (((java.lang.Boolean) ((jz5.n) this.f215698e).mo141623x754a37bb()).booleanValue()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Vk(m80379x76847179(), intent2);
            } else {
                m80379x76847179().setResult(-1, intent2);
            }
            m80379x76847179().finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        jz5.g gVar = this.f215700g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co coVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co) ((jz5.n) gVar).mo141623x754a37bb();
        jz5.g gVar2 = this.f215699f;
        coVar.T((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tn) ((jz5.n) gVar2).mo141623x754a37bb());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tn) ((jz5.n) gVar2).mo141623x754a37bb()).m((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co) ((jz5.n) gVar).mo141623x754a37bb());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tn) ((jz5.n) this.f215699f).mo141623x754a37bb()).mo979x3f5eee52();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.mo2282x953457f1(i17, permissions, grantResults);
        if (grantResults.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiRelativeListUIC", "onRequestPermissionsResult grantResults length 0");
        } else if (i17 == 64) {
            if (grantResults[0] == 0) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co) ((jz5.n) this.f215700g).mo141623x754a37bb()).X();
            } else {
                db5.e1.C(m158354x19263085(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.hht), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.apj), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xt(this), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yt.f218147d);
            }
        }
    }
}
