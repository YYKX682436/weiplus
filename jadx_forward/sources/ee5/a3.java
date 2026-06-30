package ee5;

/* loaded from: classes3.dex */
public final class a3 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f333348d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f333349e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f333350f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f333351g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f333352h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f333353i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f333348d = jz5.h.b(new ee5.z2(this));
        this.f333349e = jz5.h.b(new ee5.w2(this));
        this.f333350f = "";
        this.f333352h = new java.util.ArrayList();
    }

    public final boolean O6() {
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2549xbc1609e9.C20471x6ee15e()) == 1;
    }

    public final void P6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchEduUIC", "setEduLayoutVisible >> " + i17);
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f333348d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view = (android.view.View) mo141623x754a37bb;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "setEduLayoutVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "setEduLayoutVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("detail_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f333350f = stringExtra;
        this.f333351g = m158359x1e885992().getBooleanExtra("detail_user_dismiss", false);
        this.f333353i = j62.e.g().l("clicfg_android_enable_emoji_vertical_search_and_full_search", false, true, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchEduUIC", "initData: " + this.f333350f);
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f333350f);
        java.util.ArrayList arrayList = this.f333352h;
        if (R4) {
            arrayList.add(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ich));
        }
        arrayList.add(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.icd));
        arrayList.add(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.icg));
        arrayList.add(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ice));
        arrayList.add(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ick));
        arrayList.add(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ici));
        arrayList.add(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.icj));
        arrayList.add(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.icc));
        arrayList.add(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.icf));
        arrayList.add(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p7h));
        arrayList.add(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p7f));
        arrayList.add(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p7g));
        arrayList.add(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oga));
        arrayList.add(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.og_));
        if (this.f333353i) {
            arrayList.add(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p7e));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiSearchEduUIC", "initView");
        jz5.g gVar = this.f333349e;
        java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb).mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(m158354x19263085(), 3));
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb2).N(new ee5.x2(this));
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb3).mo7960x6cab2c8d(new zd5.j(arrayList, new ee5.y2(this)));
    }
}
