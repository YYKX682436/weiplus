package bf2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final bf2.c f101131a = new bf2.c();

    public static /* synthetic */ void b(bf2.c cVar, gk2.e eVar, int i17, int i18, java.lang.String str, int i19, int i27, java.lang.Object obj) {
        int i28 = (i27 & 4) != 0 ? -1 : i18;
        if ((i27 & 8) != 0) {
            str = "";
        }
        cVar.a(eVar, i17, i28, str, (i27 & 16) != 0 ? -1 : i19);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject c(bf2.c r13, gk2.e r14, int r15, int r16, java.lang.String r17, int r18, java.lang.String r19, int r20, int r21, java.lang.String r22, int r23, int r24, java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bf2.c.c(bf2.c, gk2.e, int, int, java.lang.String, int, java.lang.String, int, int, java.lang.String, int, int, java.lang.Object):org.json.JSONObject");
    }

    public final void a(gk2.e liveData, int i17, int i18, java.lang.String extra, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", i17);
        if (i18 > 0) {
            jSONObject.put("type", i18);
        }
        if (extra.length() > 0) {
            jSONObject.put("extra", extra);
        }
        if (i19 > 0) {
            jSONObject.put("advertisement_type", i19);
        }
        jSONObject.put("user_type", ((mm2.c1) liveData.a(mm2.c1.class)).T ? 1 : 2);
        if (((mm2.c1) liveData.a(mm2.c1.class)).S) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.f5((zy2.zb) c17, ml2.z4.W, jSONObject.toString(), null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 29L, jSONObject.toString(), null, 4, null);
        }
    }
}
