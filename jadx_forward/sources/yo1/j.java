package yo1;

/* loaded from: classes5.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f545658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12865x8f6cd034 f545659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f545660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ po1.d f545661g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12865x8f6cd034 activityC12865x8f6cd034, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, po1.d dVar) {
        super(0);
        this.f545658d = u3Var;
        this.f545659e = activityC12865x8f6cd034;
        this.f545660f = c0Var;
        this.f545661g = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f545658d.dismiss();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12865x8f6cd034 activityC12865x8f6cd034 = this.f545659e;
        java.lang.String str = activityC12865x8f6cd034.f174316d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("save new device returned, isOk=");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f545660f;
        sb6.append(c0Var.f391645d);
        sb6.append('.');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (c0Var.f391645d) {
            android.content.Intent putExtra = new android.content.Intent().putExtra("deviceId", this.f545661g.f438828a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
            activityC12865x8f6cd034.setResult(-1, putExtra);
            activityC12865x8f6cd034.finish();
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC12865x8f6cd034.mo55332x76847179();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.mxt);
            e4Var.c();
        }
        return jz5.f0.f384359a;
    }
}
