package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class a3 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j3 f205057d;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j3 j3Var) {
        this.f205057d = j3Var;
    }

    @Override // in5.y
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        so2.j5 j5Var = (so2.j5) holder.f374658i;
        if (!(j5Var instanceof so2.k0)) {
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onItemClick position:");
        sb6.append(i17);
        sb6.append("} ");
        so2.k0 k0Var = (so2.k0) j5Var;
        sb6.append(k0Var.f491985d.f66239xf8be237e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileDraftUIC", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j3 j3Var = this.f205057d;
        rl5.r rVar = j3Var.f205367p;
        if (rVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("popupMenu");
            throw null;
        }
        rVar.a();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = j3Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4.a7((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4) a17, "draftdelete", 0, pm0.v.u(k0Var.f491985d.f66236x88be67a1), 0, null, 24, null);
        rl5.r rVar2 = j3Var.f205367p;
        if (rVar2 != null) {
            rVar2.h(view, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.g3(j3Var), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.h3(k0Var, j3Var), com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918.f294838q, com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918.f294839r);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("popupMenu");
        throw null;
    }
}
