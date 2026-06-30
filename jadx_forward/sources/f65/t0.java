package f65;

/* loaded from: classes12.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f341511e;

    public t0(java.lang.String str, long j17) {
        this.f341510d = str;
        this.f341511e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        f65.y0 y0Var = f65.y0.f341552a;
        f65.s0 s0Var = f65.s0.f341507d;
        java.lang.String str2 = this.f341510d;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7000x9f9cdd79 a17 = f65.y0.a(y0Var, f65.y0.c(y0Var, str2, s0Var));
        f65.w[] wVarArr = f65.w.f341530d;
        a17.f143156k = 2L;
        a17.f143159n = a17.b("MsgId", java.lang.String.valueOf(this.f341511e), true);
        t21.v2 h17 = t21.d3.h(str2);
        if (h17 != null) {
            java.lang.String str3 = this.f341510d;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(h17.h(), h17.f496549n);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.f())) {
                str = "getService(...)";
                a17.f143154i = com.p314xaae8f345.mm.vfs.w6.k(h17.f());
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.S)) {
                i95.m c17 = i95.n0.c(tg3.u0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                str = "getService(...)";
                a17.f143154i = com.p314xaae8f345.mm.vfs.w6.k(tg3.u0.e8((tg3.u0) c17, k17, bm5.f0.f104104s, str3, false, 8, null));
            } else {
                str = "getService(...)";
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.h()) && h17.f496549n > 0 && k17 != null) {
                    i95.m c18 = i95.n0.c(c35.m.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, str);
                    a17.f143154i = com.p314xaae8f345.mm.vfs.w6.k(c35.m.p8((c35.m) c18, k17, false, 2, null));
                }
            }
            i95.m c19 = i95.n0.c(tg3.u0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, str);
            a17.f143155j = com.p314xaae8f345.mm.vfs.w6.k(tg3.u0.e8((tg3.u0) c19, k17, bm5.f0.f104104s, str3, false, 8, null));
        }
        org.json.JSONObject jSONObject = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f143158m) ? new org.json.JSONObject() : new org.json.JSONObject(a17.f143158m);
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("key_multi_send_report_info").getString(str2, null);
        if (string != null) {
            t15.a aVar = new t15.a();
            aVar.m126728xdc93280d(string);
            jSONObject.put("send_group_id", aVar.j());
            jSONObject.put("send_select_img_count", aVar.l());
            jSONObject.put("send_select_video_count", aVar.n());
            jSONObject.put("send_room_size", aVar.k());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("key_multi_send_report_info").remove(str2);
        }
        f65.y0.b(y0Var, str2, jSONObject);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        a17.f143158m = a17.b("ExtraInfo", r26.i0.u(jSONObject2, ',', ';', false, 4, null), true);
        a17.k();
        ((q04.r) f65.y0.f341553b).Ri(19, str2);
    }
}
