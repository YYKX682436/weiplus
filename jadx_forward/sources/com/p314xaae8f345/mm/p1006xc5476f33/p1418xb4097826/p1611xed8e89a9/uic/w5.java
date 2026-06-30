package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class w5 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce f205848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.v5 f205849e;

    public w5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce c14889x51ce1ce, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.v5 v5Var) {
        this.f205848d = c14889x51ce1ce;
        this.f205849e = v5Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34 m58666xf0438b47;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34 m58666xf0438b472;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = holder.f374658i;
        org.json.JSONObject jSONObject = null;
        so2.j5 j5Var = obj instanceof so2.j5 ? (so2.j5) obj : null;
        if (j5Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce c14889x51ce1ce = this.f205848d;
        if (abstractC14490x69736cb5 != null) {
            jSONObject = abstractC14490x69736cb5.e2();
            jSONObject.put("tab_seat", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14881xed239a47.f204946t.a(c14889x51ce1ce.m80379x76847179(), abstractC14490x69736cb5.getFeedObject().getProfileTabScene()));
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c14889x51ce1ce.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            int i18 = 1;
            if (activity.getIntent().getIntExtra("key_click_avatar_type", 0) != 1 && activity.getIntent().getIntExtra("key_enter_profile_type", 0) != 11) {
                i18 = activity.getIntent().getBooleanExtra("key_is_from_slide", false) ? 2 : 3;
            }
            jSONObject.put("enter_profile_method", i18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce c14889x51ce1ce2 = this.f205848d;
        m58666xf0438b47 = c14889x51ce1ce2.m58666xf0438b47();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.v5 v5Var = this.f205849e;
        int a07 = v5Var.a0();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 b07 = v5Var.b0();
        m58666xf0438b472 = c14889x51ce1ce.m58666xf0438b47();
        c14889x51ce1ce2.m58687x89035827(m58666xf0438b47, j5Var, i17, holder, a07, b07, m58666xf0438b472.m56388xcaeb60d0(), jSONObject, 2);
    }
}
