package qk2;

/* loaded from: classes3.dex */
public abstract class d extends qk2.f {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f445957g;

    /* renamed from: h, reason: collision with root package name */
    public final int f445958h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f445957g = "MoreActionCustomItem";
        this.f445958h = -1;
    }

    public static /* synthetic */ void s(qk2.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var, java.lang.Integer num, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addButton");
        }
        if ((i17 & 2) != 0) {
            num = null;
        }
        dVar.r(e3Var, num);
    }

    @Override // qk2.f
    public boolean o() {
        return n();
    }

    public final void r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 bottomSheet, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        if (h() && zl2.r4.F1(this.f445960a.f437607b)) {
            boolean z17 = ((mm2.n0) this.f445960a.f437607b.a(mm2.n0.class)).f410806r;
            java.lang.String str = this.f445957g;
            java.lang.String str2 = "skip add " + getClass().getSimpleName() + ": blocked by coLive phase1 switch, isInviteeAnchor=" + z17 + ", allowCoLiveInitiator=false";
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2, null);
            return;
        }
        int i18 = this.f445958h;
        if (i18 != -1 && !re2.b.b(i18)) {
            java.lang.String str3 = this.f445957g;
            java.lang.String str4 = "skip add " + getClass().getSimpleName() + ": blocked by invitee perm gate, itemId=" + this.f445958h;
            int i19 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str4, null);
            return;
        }
        if (!o()) {
            java.lang.String str5 = this.f445957g;
            java.lang.String str6 = "add item " + getClass().getName() + " failed as it is not enabled";
            int i27 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, str6, null);
            return;
        }
        t(this.f445960a, bottomSheet, num);
        ll2.e eVar = ll2.e.f400666a;
        eVar.j(i(), false);
        java.lang.Integer u17 = u();
        if (u17 != null) {
            int intValue = u17.intValue();
            android.content.Context context = bottomSheet.f213492f.getContext();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context : null;
            if (activityC0065xcd7aa112 == null) {
                return;
            }
            ll2.e.l(eVar, activityC0065xcd7aa112, i(), bottomSheet.f213492f.findViewById(intValue), null, null, 24, null);
        }
    }

    public abstract void t(pk2.o9 o9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var, java.lang.Integer num);

    public java.lang.Integer u() {
        return null;
    }

    public final void v(java.lang.String itemName, android.view.View root, com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemName, "itemName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewOnClickListenerC22631x1cc07cc8, "switch");
        viewOnClickListenerC22631x1cc07cc8.setContentDescription(viewOnClickListenerC22631x1cc07cc8.f292896x ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.efy, itemName) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.efx, itemName));
    }
}
