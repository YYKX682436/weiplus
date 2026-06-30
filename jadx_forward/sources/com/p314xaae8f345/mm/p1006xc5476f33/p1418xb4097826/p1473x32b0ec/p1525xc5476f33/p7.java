package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes10.dex */
public final class p7 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 f195371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.e2 f195372b;

    public p7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.e2 e2Var) {
        this.f195371a = x7Var;
        this.f195372b = e2Var;
    }

    public void a(km2.q linkUser) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkUser, "linkUser");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = this.f195371a;
        java.lang.String str = linkUser.f390705c;
        java.util.List list = ((mm2.o4) x7Var.P0(mm2.o4.class)).f410857s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-anchorPkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) obj).f390705c, str)) {
                        break;
                    }
                }
            }
        }
        if (obj != null) {
            qo0.c cVar = this.f195371a.f196569p;
            qo0.b bVar = qo0.b.M3;
            android.os.Bundle bundle = new android.os.Bundle();
            java.lang.String str2 = linkUser.f390705c;
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString("PARAM_FINDER_LIVE_MIC_USER_NAME", str2);
            cVar.mo46557x60d69242(bVar, bundle);
            return;
        }
        r45.xn1 xn1Var = linkUser.f390720r;
        if (xn1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f195371a.f196570q, "onAcceptItemClick user is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var2 = this.f195371a;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putByteArray("PARAM_FINDER_LIVE_BYTES_DATA", xn1Var.mo14344x5f01b1f6());
        x7Var2.f196569p.mo46557x60d69242(qo0.b.Y3, bundle2);
    }

    public void b(r45.xn1 xn1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.b2 b2Var) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = this.f195371a;
        java.lang.String str = x7Var.f196570q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onApplyItemClick userNickName: ");
        sb6.append((xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76184x8010e5e4());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (xn1Var != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("PARAM_FINDER_LIVE_BYTES_DATA", xn1Var.mo14344x5f01b1f6());
            if (b2Var != null) {
                bundle.putInt("PARAM_FINDER_LIVE_ANCHOR_APPLY_SCENE", b2Var.f197733a);
                bundle.putByteArray("PARAM_FINDER_LIVE_ANCHOR_APPLY_SCENE_BUFFER", b2Var.f197734b);
                bundle.putString("ARAM_FINDER_LIVE_ANCHOR_APPLY_CANDIDATE_REQUEST_ID", b2Var.f197735c);
            }
            x7Var.f196569p.mo46557x60d69242(qo0.b.X3, bundle);
        }
    }

    public void c(r45.xn1 xn1Var) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        qo0.c cVar = this.f195371a.f196569p;
        qo0.b bVar = qo0.b.M3;
        android.os.Bundle bundle = new android.os.Bundle();
        if (xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
            str = "";
        }
        bundle.putString("PARAM_FINDER_LIVE_MIC_USER_NAME", str);
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_NEED_TOAST_MIC", true);
        cVar.mo46557x60d69242(bVar, bundle);
    }
}
