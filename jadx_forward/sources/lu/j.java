package lu;

/* loaded from: classes9.dex */
public final class j extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        s15.c cVar;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String m75945x2fec8307;
        z05.c cVar2;
        z05.c cVar3;
        java.lang.String l17;
        z05.c cVar4;
        z05.c cVar5;
        z05.c cVar6;
        z05.c cVar7;
        z05.c cVar8;
        z05.c cVar9;
        z05.c cVar10;
        z05.c cVar11;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        l15.c cVar12 = new l15.c();
        cVar12.m126728xdc93280d(simpleMsgInfo.m75945x2fec8307(simpleMsgInfo.f427150d + 13));
        v05.b k17 = cVar12.k();
        int j17 = (k17 == null || (cVar11 = (z05.c) k17.m75936x14adae67(k17.f513848e + 64)) == null) ? 0 : cVar11.j();
        int i17 = recordDataItem.f384955d;
        if (j17 > 0) {
            recordDataItem.set(i17 + 2, 1);
            java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572038wz);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getString(...)");
            recordDataItem.set(i17 + 1, g17);
        } else {
            v05.b k18 = cVar12.k();
            java.lang.String str9 = "";
            if (k18 == null || (str = k18.m75945x2fec8307(k18.f449898d + 2)) == null) {
                str = "";
            }
            recordDataItem.set(i17 + 0, str);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572122za));
            sb6.append(' ');
            v05.b k19 = cVar12.k();
            if (k19 == null || (str2 = k19.m75945x2fec8307(k19.f449898d + 2)) == null) {
                str2 = "";
            }
            sb6.append(str2);
            recordDataItem.set(i17 + 1, sb6.toString());
            recordDataItem.set(i17 + 2, 36);
            s15.x xVar = new s15.x();
            v05.b k27 = cVar12.k();
            if (k27 == null || (cVar10 = (z05.c) k27.m75936x14adae67(k27.f513848e + 64)) == null || (str3 = cVar10.m178293x5db1b11()) == null) {
                str3 = "";
            }
            xVar.o(str3);
            v05.b k28 = cVar12.k();
            if (k28 == null || (cVar9 = (z05.c) k28.m75936x14adae67(k28.f513848e + 64)) == null || (str4 = cVar9.m178294xfb83cc9b()) == null) {
                str4 = "";
            }
            xVar.t(str4);
            v05.b k29 = cVar12.k();
            if (k29 == null || (cVar8 = (z05.c) k29.m75936x14adae67(k29.f513848e + 64)) == null || (str5 = cVar8.p()) == null) {
                str5 = "";
            }
            xVar.u(str5);
            v05.b k37 = cVar12.k();
            xVar.w((k37 == null || (cVar7 = (z05.c) k37.m75936x14adae67(k37.f513848e + 64)) == null) ? 0 : cVar7.m178295x2fa78b11());
            v05.b k38 = cVar12.k();
            xVar.x((k38 == null || (cVar6 = (z05.c) k38.m75936x14adae67(k38.f513848e + 64)) == null) ? 0 : cVar6.r());
            v05.b k39 = cVar12.k();
            z05.e eVar = null;
            xVar.r((k39 == null || (cVar5 = (z05.c) k39.m75936x14adae67(k39.f513848e + 64)) == null) ? null : cVar5.n());
            v05.b k47 = cVar12.k();
            xVar.p((k47 == null || (cVar4 = (z05.c) k47.m75936x14adae67(k47.f513848e + 64)) == null) ? 0 : cVar4.k());
            v05.b k48 = cVar12.k();
            if (k48 == null || (cVar3 = (z05.c) k48.m75936x14adae67(k48.f513848e + 64)) == null || (l17 = cVar3.l()) == null) {
                cVar = null;
            } else {
                cVar = new s15.c();
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(l17);
                    cVar.o(jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56081x69307313));
                    cVar.s(jSONObject.optString("subSource"));
                    java.lang.String optString = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                    cVar.u(optString);
                    cVar.t(jSONObject.optString("thumbUrl"));
                    java.lang.String optString2 = jSONObject.optString("ratioType");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
                    cVar.r(optString2);
                    cVar.p(jSONObject.optInt("count"));
                    cVar.q(jSONObject.optInt("duration"));
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsg.LiteAppRecordBuildXmlApi", e17.getMessage());
                    cVar = new s15.c();
                }
            }
            xVar.q(cVar);
            v05.b k49 = cVar12.k();
            if (k49 != null && (cVar2 = (z05.c) k49.m75936x14adae67(k49.f513848e + 64)) != null) {
                eVar = cVar2.o();
            }
            xVar.s(eVar);
            recordDataItem.G0(xVar);
            s15.h0 h0Var = new s15.h0();
            v05.b k57 = cVar12.k();
            if (k57 == null || (str6 = k57.m75945x2fec8307(k57.f449898d + 2)) == null) {
                str6 = "";
            }
            h0Var.y(str6);
            v05.b k58 = cVar12.k();
            if (k58 == null || (str7 = k58.m75945x2fec8307(k58.f449898d + 3)) == null) {
                str7 = "";
            }
            h0Var.q(str7);
            v05.b k59 = cVar12.k();
            if (k59 == null || (str8 = k59.m75945x2fec8307(k59.f513848e + 14)) == null) {
                str8 = "";
            }
            h0Var.x(str8);
            v05.b k66 = cVar12.k();
            h0Var.s(k66 != null ? k66.m75939xb282bd08(k66.f513848e + 1) : 0);
            if ((!r26.n0.N(h0Var.m163592x7531c8a2())) || (!r26.n0.N(h0Var.j())) || (!r26.n0.N(h0Var.o())) || h0Var.l() != 0) {
                h0Var.u(1);
            }
            recordDataItem.n1(h0Var);
            v05.b k67 = cVar12.k();
            if (k67 != null && (m75945x2fec8307 = k67.m75945x2fec8307(k67.f449898d + 9)) != null) {
                str9 = m75945x2fec8307;
            }
            recordDataItem.F0(str9);
        }
        return true;
    }
}
