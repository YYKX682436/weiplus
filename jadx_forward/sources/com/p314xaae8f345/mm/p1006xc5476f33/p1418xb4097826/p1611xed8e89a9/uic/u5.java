package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class u5 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce f205789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f205790b;

    public u5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce c14889x51ce1ce, so2.j5 j5Var) {
        this.f205789a = c14889x51ce1ce;
        this.f205790b = j5Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[5];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce c14889x51ce1ce = this.f205789a;
        android.app.Activity context = c14889x51ce1ce.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        lVarArr[0] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f216918q : null);
        android.app.Activity context2 = c14889x51ce1ce.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        lVarArr[1] = new jz5.l("finder_context_id", java.lang.String.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216915p));
        android.app.Activity context3 = c14889x51ce1ce.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        lVarArr[2] = new jz5.l("finder_tab_context_id", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216920s);
        r45.nw1 m59258xd0557130 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) this.f205790b).getFeedObject().m59258xd0557130();
        lVarArr[3] = new jz5.l("live_enter_status", m59258xd0557130 != null ? java.lang.Integer.valueOf(m59258xd0557130.m75939xb282bd08(2)) : null);
        lVarArr[4] = new jz5.l("share_username", "");
        return kz5.c1.k(lVarArr);
    }
}
