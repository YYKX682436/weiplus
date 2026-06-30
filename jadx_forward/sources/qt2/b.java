package qt2;

/* loaded from: classes2.dex */
public final class b implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qt2.e f448080a;

    public b(qt2.e eVar) {
        this.f448080a = eVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        qt2.u uVar;
        int i17;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        so2.j5 j5Var;
        qt2.e eVar = this.f448080a;
        android.app.Activity context = eVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = eVar.m158358x197d1fc6();
        if (m158358x197d1fc6 == null || (uVar = (qt2.u) pf5.z.f435481a.b(m158358x197d1fc6).e(qt2.u.class)) == null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = eVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            uVar = (qt2.u) pf5.z.f435481a.a(activity).e(qt2.u.class);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = uVar != null ? uVar.P6().q0(uVar.f448147g, false) : null;
        in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
        in5.c cVar = s0Var != null ? (in5.c) s0Var.f374658i : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar : null;
        long j17 = 0;
        long mo2128x1ed62e84 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L;
        if (uVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = uVar.f448145e;
            if (abstractC13919x46aff122 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
                throw null;
            }
            java.util.ArrayList m56388xcaeb60d0 = abstractC13919x46aff122.m56388xcaeb60d0();
            if (m56388xcaeb60d0 != null) {
                java.util.Iterator it = m56388xcaeb60d0.iterator();
                i17 = 0;
                while (it.hasNext()) {
                    if (((so2.j5) it.next()).mo2128x1ed62e84() == mo2128x1ed62e84) {
                        break;
                    }
                    i17++;
                }
            }
        }
        i17 = -1;
        if (i17 >= 0 && uVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff1222 = uVar.f448145e;
            if (abstractC13919x46aff1222 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
                throw null;
            }
            java.util.List m56388xcaeb60d02 = abstractC13919x46aff1222.m56388xcaeb60d0();
            if (m56388xcaeb60d02 != null && (j5Var = (so2.j5) kz5.n0.a0(m56388xcaeb60d02, i17 + 1)) != null) {
                j17 = j5Var.mo2128x1ed62e84();
            }
        }
        long j18 = j17;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        r45.jt2 jt2Var = eVar.f448094s;
        if (jt2Var == null || (str2 = jt2Var.m75945x2fec8307(1)) == null) {
            str2 = "";
        }
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, str2);
        r45.jt2 jt2Var2 = eVar.f448094s;
        jSONObject.put("play_progress", jt2Var2 != null ? jt2Var2.m75939xb282bd08(0) : 0);
        jSONObject.put("next_objectid", pm0.v.u(j18));
        r45.jt2 jt2Var3 = eVar.f448094s;
        if (jt2Var3 == null || (m75941xfb8219142 = jt2Var3.m75941xfb821914(2)) == null) {
            str3 = "";
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
            java.util.Iterator it6 = m75941xfb8219142.iterator();
            while (it6.hasNext()) {
                arrayList.add(((r45.g53) it6.next()).m75945x2fec8307(0));
            }
            str3 = kz5.n0.g0(arrayList, "|", null, null, 0, null, null, 62, null);
        }
        jSONObject.put("username_list", str3);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a, V6, abstractC14490x69736cb5, 86, r26.i0.t(jSONObject2, ",", ";", false), null, null, 48, null);
        jz5.l[] lVarArr = new jz5.l[9];
        if (V6 == null || (str4 = V6.m75945x2fec8307(0)) == null) {
            str4 = "";
        }
        lVarArr[0] = new jz5.l("behaviour_session_id", str4);
        if (V6 == null || (str5 = V6.m75945x2fec8307(1)) == null) {
            str5 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str5);
        if (V6 == null || (str6 = V6.m75945x2fec8307(2)) == null) {
            str6 = "";
        }
        lVarArr[2] = new jz5.l("finder_tab_context_id", str6);
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6 != null ? V6.m75939xb282bd08(5) : 0));
        lVarArr[4] = new jz5.l("feed_id", pm0.v.u(mo2128x1ed62e84));
        lVarArr[5] = new jz5.l("next_feedid", pm0.v.u(j18));
        r45.jt2 jt2Var4 = eVar.f448094s;
        if (jt2Var4 == null || (str7 = jt2Var4.m75945x2fec8307(1)) == null) {
            str7 = "";
        }
        lVarArr[6] = new jz5.l("recommendation_text", str7);
        r45.jt2 jt2Var5 = eVar.f448094s;
        lVarArr[7] = new jz5.l("avatar_cnt", java.lang.Integer.valueOf((jt2Var5 == null || (m75941xfb821914 = jt2Var5.m75941xfb821914(2)) == null) ? 0 : m75941xfb821914.size()));
        r45.jt2 jt2Var6 = eVar.f448094s;
        lVarArr[8] = new jz5.l("expose_playpercent", java.lang.Integer.valueOf(jt2Var6 != null ? jt2Var6.m75939xb282bd08(0) : 0));
        return kz5.c1.k(lVarArr);
    }
}
