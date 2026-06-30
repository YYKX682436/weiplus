package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/list/BaseBizProfileFragment;", "Landroidx/fragment/app/Fragment;", "Lzy2/h5;", "<init>", "()V", "wr3/a", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BaseBizProfileFragment */
/* loaded from: classes11.dex */
public abstract class AbstractC16894x4f59e657 extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 implements zy2.h5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f235944d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 f235945e;

    /* renamed from: f, reason: collision with root package name */
    public r45.wl f235946f;

    /* renamed from: g, reason: collision with root package name */
    public as3.a0 f235947g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 f235948h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f235949i = jz5.h.b(new wr3.e(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f235950m = jz5.h.b(new wr3.d(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f235951n = jz5.h.b(new wr3.b(this));

    /* renamed from: o, reason: collision with root package name */
    public wr3.a f235952o;

    public AbstractC16894x4f59e657() {
        jz5.h.b(new wr3.c(this));
    }

    @Override // zy2.h5
    public boolean O() {
        return this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16903x22327ac;
    }

    @Override // zy2.h5
    public void P() {
    }

    public final java.lang.String j0() {
        java.lang.String str = this.f235944d;
        if (str != null) {
            return str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bizUsername");
        throw null;
    }

    public android.view.View l0() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f235949i).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final r45.wl m0() {
        r45.wl wlVar = this.f235946f;
        if (wlVar != null) {
            return wlVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBizProfileResp");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 n0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 c16893x570516c7 = this.f235945e;
        if (c16893x570516c7 != null) {
            return c16893x570516c7;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDataFetcher");
        throw null;
    }

    public final as3.a0 o0() {
        as3.a0 a0Var = this.f235947g;
        if (a0Var != null) {
            return a0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("topicFlowContract");
        throw null;
    }

    public final void p0(java.lang.String tag, yz5.l getTopicList, yz5.l setHasTopic, yz5.l addHeaderView, yz5.l removeHeaderView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getTopicList, "getTopicList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setHasTopic, "setHasTopic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addHeaderView, "addHeaderView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(removeHeaderView, "removeHeaderView");
        java.util.ArrayList arrayList = (java.util.ArrayList) getTopicList.mo146xb9724478(m0());
        if (!arrayList.isEmpty()) {
            setHasTopic.mo146xb9724478(java.lang.Boolean.TRUE);
        } else {
            setHasTopic.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        android.content.Context mo7438x76847179 = mo7438x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7438x76847179, "null cannot be cast to non-null type com.tencent.mm.plugin.profile.ui.ContactInfoUI");
        this.f235947g = new as3.a0((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2) mo7438x76847179, arrayList);
        as3.a0 o07 = o0();
        java.util.ArrayList arrayList2 = o07.f95018d;
        arrayList2.clear();
        java.util.ArrayList arrayList3 = o07.f95016b;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(new vr3.d0((r45.um) it.next()));
        }
        arrayList2.addAll(arrayList4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16917xf24b9dac c16917xf24b9dac = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16917xf24b9dac(o07.f95015a);
        c16917xf24b9dac.b(o07);
        c16917xf24b9dac.c();
        if (arrayList2.isEmpty()) {
            c16917xf24b9dac.setVisibility(8);
        } else {
            c16917xf24b9dac.setVisibility(0);
        }
        o07.f95019e = c16917xf24b9dac;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o07.f95017c, "gen topic view, visibility = " + c16917xf24b9dac.getVisibility());
        removeHeaderView.mo146xb9724478(c16917xf24b9dac);
        addHeaderView.mo146xb9724478(c16917xf24b9dac);
        o0().f95020f = new wr3.f(tag, this);
        o0().f95021g = new wr3.g(tag);
        o0().a((java.util.ArrayList) getTopicList.mo146xb9724478(m0()));
    }
}
