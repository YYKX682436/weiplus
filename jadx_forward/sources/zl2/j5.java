package zl2;

/* loaded from: classes3.dex */
public final class j5 {

    /* renamed from: a, reason: collision with root package name */
    public static final zl2.j5 f555383a = new zl2.j5();

    static {
        ae2.b2.f84994a.f().getClass();
    }

    public final zl2.d5 a(long j17, r45.f82 f82Var) {
        java.util.LinkedList m75941xfb821914;
        if (f82Var != null && (m75941xfb821914 = f82Var.m75941xfb821914(1)) != null) {
            for (r45.uw4 uw4Var : kz5.n0.F0(m75941xfb821914, new zl2.f5())) {
                if (j17 == uw4Var.m75942xfb822ef2(0) && uw4Var.m75933x41a8a7f2(1)) {
                    return zl2.d5.f555257e;
                }
            }
        }
        return zl2.d5.f555256d;
    }

    public final java.util.LinkedList b() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_QUOTA_CONSUME_SHOW_STRING_SYNC, ""));
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                linkedList.add(new zl2.c5(optJSONObject.optLong("noticeAmount"), optJSONObject.optLong("curTime")));
            }
        } catch (org.json.JSONException unused) {
        }
        return linkedList;
    }

    public final boolean c(long j17) {
        java.util.Iterator it = b().iterator();
        while (it.hasNext()) {
            if (((zl2.c5) it.next()).f555237a == j17) {
                return !android.text.format.DateUtils.isToday(r1.f555238b);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r18, r45.ql1 r19, boolean r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.j5.d(android.content.Context, r45.ql1, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(long j17) {
        java.lang.Object obj;
        java.util.LinkedList<zl2.c5> b17 = b();
        java.util.Iterator it = b17.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((zl2.c5) obj).f555237a == j17) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        zl2.c5 c5Var = (zl2.c5) obj;
        if (c5Var != null) {
            c5Var.f555237a = j17;
            c5Var.f555238b = java.lang.System.currentTimeMillis();
        } else {
            b17.add(new zl2.c5(j17, java.lang.System.currentTimeMillis()));
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (zl2.c5 c5Var2 : b17) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("noticeAmount", c5Var2.f555237a);
            jSONObject.put("curTime", c5Var2.f555238b);
            jSONArray.put(jSONObject);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("QuotaUtil", "updateQuotaToastConfig noticeAmount: " + j17 + " config: " + jSONArray);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_QUOTA_CONSUME_SHOW_STRING_SYNC, jSONArray.toString());
    }
}
