package t82;

/* loaded from: classes12.dex */
public final class r extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f497936d;

    /* renamed from: e, reason: collision with root package name */
    public w82.k f497937e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f497938f;

    /* renamed from: g, reason: collision with root package name */
    public int f497939g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f497938f = t82.o.f497931d;
        this.f497939g = -1;
    }

    public final void O6(boolean z17) {
        w82.k kVar = this.f497937e;
        if (kVar != null) {
            kVar.b(z17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMoreFooter");
            throw null;
        }
    }

    public final void P6() {
        w82.k kVar = this.f497937e;
        if (kVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMoreFooter");
            throw null;
        }
        kVar.c();
        this.f497936d = false;
        this.f497938f.mo146xb9724478(16);
    }

    public final t82.d Q6() {
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(t82.d.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (t82.d) a17;
    }

    public final void R6(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(Q6().S6());
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.f(m80379x76847179(), "", arrayList, false);
        if (i17 == 4106) {
            this.f497938f.mo146xb9724478(5);
        } else {
            this.f497938f.mo146xb9724478(7);
        }
    }

    public final void S6(android.content.Intent intent, int i17) {
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("custom_send_text") : null;
        java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[handleResultTransmitSuccess] customText = " + stringExtra + ", toUsers = " + stringExtra2);
        if (i17 != 4106) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(Q6().S6());
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.b(m80379x76847179(), arrayList, stringExtra, stringExtra2, "MicroMsg.FavFinderFilterUI");
            this.f497938f.mo146xb9724478(8);
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (this.f497939g == -1) {
            this.f497938f.mo146xb9724478(5);
            return;
        }
        o72.r2 P6 = Q6().P6(this.f497939g);
        if (P6 == null) {
            this.f497938f.mo146xb9724478(5);
            return;
        }
        arrayList2.add(P6);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.b(m80379x76847179(), arrayList2, stringExtra, stringExtra2, "MicroMsg.FavFinderFilterUI");
        this.f497938f.mo146xb9724478(6);
    }

    public final void T6(android.view.View view, int i17, long j17, int[] touchLoc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(touchLoc, "touchLoc");
        rl5.r rVar = new rl5.r(m80379x76847179(), view);
        rVar.C = true;
        o72.r2 P6 = Q6().P6(i17);
        if (P6 == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("card_fav_type", java.lang.Integer.valueOf(P6.f67657x2262335f));
        hashMap.put("card_clk_type", 1);
        v82.a.f515599a.a("fav_page_card_operation", "view_clk", hashMap);
        rVar.f478888y = new t82.p(P6, this);
        this.f497939g = i17;
        rVar.f478887x = new t82.q(this, hashMap);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i18 = iArr[0];
        rVar.n((i18 + view.getWidth()) / 2, iArr[1]);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "onActivityResult requestCode: %d, resultCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            if (i17 == 4105) {
                R6(i17);
                return;
            } else {
                if (i17 != 4106) {
                    return;
                }
                R6(i17);
                return;
            }
        }
        if (i17 == 4105) {
            S6(intent, i17);
        } else {
            if (i17 != 4106) {
                return;
            }
            S6(intent, i17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        w82.k kVar = new w82.k();
        this.f497937e = kVar;
        kVar.a(mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.dtg));
        w82.k kVar2 = this.f497937e;
        if (kVar2 != null) {
            kVar2.f525436k = new t82.n(this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMoreFooter");
            throw null;
        }
    }
}
