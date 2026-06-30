package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class i4 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.q f203260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p4 f203261e;

    public i4(vp2.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p4 p4Var) {
        this.f203260d = qVar;
        this.f203261e = p4Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.lang.String str;
        java.lang.Class cls;
        java.lang.String str2;
        so2.j5 j5Var;
        java.lang.String str3;
        int i18;
        java.lang.String num;
        java.lang.String m75945x2fec8307;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int a07 = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) adapter).a0();
        if (i17 < a07) {
            return;
        }
        int i19 = i17 - a07;
        vp2.q qVar = this.f203260d;
        java.lang.Object obj = qVar.f520484e.get(i19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        so2.j5 j5Var2 = (so2.j5) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p4 p4Var = this.f203261e;
        r45.qt2 qt2Var = p4Var.f203419i;
        java.lang.String str4 = (qt2Var == null || (m75945x2fec8307 = qt2Var.m75945x2fec8307(2)) == null) ? "" : m75945x2fec8307;
        tp2.f fVar = p4Var.f203418h;
        if (fVar != null) {
            java.util.ArrayList arrayList = qVar.f520484e;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("main_page_position", "5");
            bundle.putInt("card_index", i19);
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            rq2.w wVar = (rq2.w) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rq2.w.class);
            if (wVar != null) {
                bundle.putLong("pull_liveid", wVar.f480443o);
                bundle.putString("pull_commentsence", wVar.f480444p);
            }
            str = "main_page_position";
            cls = rq2.w.class;
            str2 = "pull_liveid";
            j5Var = j5Var2;
            str3 = "pull_commentsence";
            i18 = i19;
            tp2.f.d(fVar, j5Var2, i17, i19, view, arrayList, str4, 0, bundle, this.f203260d, null, 0L, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.mc.f34455x366c91de, null);
        } else {
            str = "main_page_position";
            cls = rq2.w.class;
            str2 = "pull_liveid";
            j5Var = j5Var2;
            str3 = "pull_commentsence";
            i18 = i19;
        }
        android.content.Context context2 = view.getContext();
        android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        if (activity != null) {
            pf5.z zVar2 = pf5.z.f435481a;
            boolean z17 = activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
            if (!z17) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity;
            rq2.w wVar2 = (rq2.w) zVar2.a(activityC0065xcd7aa112).a(cls);
            if (wVar2 != null) {
                so2.j5 j5Var3 = j5Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var3 : null;
                if (abstractC14490x69736cb5 != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.putOpt(str2, java.lang.Long.valueOf(wVar2.f480443o));
                    jSONObject.putOpt(str3, wVar2.f480444p);
                    jSONObject.putOpt(str, 5);
                    ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                    long j17 = i18;
                    ml2.x1 x1Var = ml2.x1.f409740n;
                    if (!z17) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar2.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                    java.lang.String str5 = (nyVar == null || (num = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) ? "" : num;
                    java.lang.String jSONObject2 = jSONObject.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                    j0Var.sj(abstractC14490x69736cb5, j17, x1Var, str5, "", "", jSONObject2);
                }
            }
        }
    }
}
