package hc2;

/* loaded from: classes2.dex */
public abstract class g0 {
    public static final r45.f1 a(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        java.util.LinkedList<r45.wf6> m76521x7528c3fb;
        java.lang.Object obj;
        if (c19786x6a1e2862 == null || (m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb()) == null) {
            return null;
        }
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            r45.wf6 wf6Var = (r45.wf6) obj;
            boolean z17 = true;
            if (wf6Var.m75939xb282bd08(1) != 8 || wf6Var.m75939xb282bd08(2) != 10) {
                z17 = false;
            }
            if (z17) {
                break;
            }
        }
        r45.wf6 wf6Var2 = (r45.wf6) obj;
        if (wf6Var2 != null) {
            return (r45.f1) wf6Var2.m75936x14adae67(13);
        }
        return null;
    }

    public static final r45.f1 b(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 w17;
        if (c19792x256d2725 == null || (w17 = hc2.o0.w(c19792x256d2725)) == null) {
            return null;
        }
        return a(w17);
    }

    public static final jz5.l c(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0;
        java.lang.String m77225xe7ed3fec;
        if (c19786x6a1e2862 != null && (m76506x42318aa0 = c19786x6a1e2862.m76506x42318aa0()) != null && (m77225xe7ed3fec = m76506x42318aa0.m77225xe7ed3fec()) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", "[getOpParams] necessaryParams:".concat(m77225xe7ed3fec));
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(m77225xe7ed3fec);
                return new jz5.l(java.lang.Integer.valueOf(jSONObject.optInt("op_switch", 0)), java.lang.Integer.valueOf(jSONObject.optInt("hide_flag", 0)));
            } catch (org.json.JSONException unused) {
            }
        }
        return new jz5.l(0, 0);
    }

    public static final java.lang.String d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c19786x6a1e2862, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jump_id=");
        sb6.append(c19786x6a1e2862.m76501xf2fd2296());
        sb6.append("#jump_type=");
        sb6.append(c19786x6a1e2862.m76503x92bc3c07());
        sb6.append("#business_type=");
        sb6.append(c19786x6a1e2862.m76480xe2ee1ca3());
        sb6.append("#wording=");
        sb6.append(c19786x6a1e2862.m76523x98b23862());
        sb6.append("#style=");
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m76521x7528c3fb, 10));
        for (r45.wf6 wf6Var : m76521x7528c3fb) {
            arrayList.add("pos=" + wf6Var.m75939xb282bd08(1) + "#style=" + wf6Var.m75939xb282bd08(2) + "#screen=" + wf6Var.m75939xb282bd08(0) + "#delayAppearTime=" + wf6Var.m75939xb282bd08(11) + "#appearTime=" + wf6Var.m75939xb282bd08(14) + "#disappearTime=" + wf6Var.m75939xb282bd08(15) + "#condition=" + wf6Var.m75939xb282bd08(20));
        }
        sb6.append(arrayList);
        return sb6.toString();
    }

    public static final boolean e(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, android.content.Context context, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (c19786x6a1e2862 == null) {
            return false;
        }
        xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
        p0Var.f534789r = 8;
        p0Var.f534790s = 10;
        p0Var.f534780i = "timeline";
        p0Var.I = num;
        xc2.y2.f534876a.h(context, p0Var, 1, null);
        return true;
    }

    public static final boolean f(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, in5.s0 holder, java.lang.Integer num) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 w17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c19792x256d2725, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (!hc2.o0.G(c19792x256d2725) || (w17 = hc2.o0.w(c19792x256d2725)) == null) {
            return false;
        }
        xc2.p0 p0Var = new xc2.p0(w17);
        p0Var.f534789r = 8;
        p0Var.f534790s = 10;
        p0Var.f534780i = "timeline";
        p0Var.I = num;
        xc2.y2 y2Var = xc2.y2.f534876a;
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        y2Var.h(context, p0Var, 1, holder);
        return true;
    }

    public static final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 g(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        byte[] decode = android.util.Base64.decode(str, 2);
        try {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 m76475xaf65a0fc = com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862.m76475xaf65a0fc();
            m76475xaf65a0fc.mo11468x92b714fd(decode);
            return m76475xaf65a0fc;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderExt", "parse accountJumpInfo failed: %s", e17);
            return null;
        }
    }
}
