package ml2;

/* loaded from: classes10.dex */
public final class x5 {

    /* renamed from: a, reason: collision with root package name */
    public static final ml2.x5 f409768a = new ml2.x5();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f409769b = jz5.h.b(ml2.v5.f409683d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f409770c = jz5.h.b(ml2.w5.f409732d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f409771d = jz5.h.b(ml2.u5.f409648d);

    public final void a(long j17, int i17) {
        if (i17 == 1) {
            jz5.g gVar = f409769b;
            java.util.HashMap hashMap = (java.util.HashMap) ((jz5.n) gVar).mo141623x754a37bb();
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) ((jz5.n) gVar).mo141623x754a37bb()).get(java.lang.Long.valueOf(j17));
            hashMap.put(valueOf, java.lang.Integer.valueOf((num != null ? num : 0).intValue() + 1));
        } else if (i17 == 2) {
            jz5.g gVar2 = f409770c;
            java.util.HashMap hashMap2 = (java.util.HashMap) ((jz5.n) gVar2).mo141623x754a37bb();
            java.lang.Long valueOf2 = java.lang.Long.valueOf(j17);
            java.lang.Integer num2 = (java.lang.Integer) ((java.util.HashMap) ((jz5.n) gVar2).mo141623x754a37bb()).get(java.lang.Long.valueOf(j17));
            hashMap2.put(valueOf2, java.lang.Integer.valueOf((num2 != null ? num2 : 0).intValue() + 1));
        } else if (i17 == 3) {
            jz5.g gVar3 = f409771d;
            java.util.HashMap hashMap3 = (java.util.HashMap) ((jz5.n) gVar3).mo141623x754a37bb();
            java.lang.Long valueOf3 = java.lang.Long.valueOf(j17);
            java.lang.Integer num3 = (java.lang.Integer) ((java.util.HashMap) ((jz5.n) gVar3).mo141623x754a37bb()).get(java.lang.Long.valueOf(j17));
            hashMap3.put(valueOf3, java.lang.Integer.valueOf((num3 != null ? num3 : 0).intValue() + 1));
        }
        if (zl2.q4.f555466a.E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorUnknowHostReporter", "recordUnknowHostErrMsg liveId:" + j17 + ",source:" + i17);
        }
    }

    public final void b(boolean z17, long j17, java.lang.String nickname, int i17) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        java.lang.Integer num = i17 != 1 ? i17 != 2 ? i17 != 3 ? 0 : (java.lang.Integer) ((java.util.HashMap) ((jz5.n) f409771d).mo141623x754a37bb()).remove(java.lang.Long.valueOf(j17)) : (java.lang.Integer) ((java.util.HashMap) ((jz5.n) f409770c).mo141623x754a37bb()).remove(java.lang.Long.valueOf(j17)) : (java.lang.Integer) ((java.util.HashMap) ((jz5.n) f409769b).mo141623x754a37bb()).remove(java.lang.Long.valueOf(j17));
        if (num == null || num.intValue() <= 0) {
            return;
        }
        int c17 = ml2.t5.f409553a.c(j17, i17);
        if (c17 == 1 || c17 == 2) {
            if (z17) {
                str = "fixUnknowHost_stage" + c17 + '_' + i17;
            } else {
                str = "fixUnknowHostFail_stage" + c17 + '_' + i17;
            }
            if (z17) {
                str2 = num.toString();
            } else {
                str2 = num + ";netType:" + com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6529x68078b77 c6529x68078b77 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6529x68078b77();
            c6529x68078b77.f138820i = 4L;
            c6529x68078b77.f138815d = c6529x68078b77.b(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, str, true);
            c6529x68078b77.f138816e = 0;
            c6529x68078b77.f138817f = c6529x68078b77.b("errMsg", str2, true);
            c6529x68078b77.f138818g = c6529x68078b77.b("liveId", pm0.v.u(j17), true);
            c6529x68078b77.f138819h = c6529x68078b77.b("nickname", nickname, true);
            c6529x68078b77.k();
        }
    }
}
