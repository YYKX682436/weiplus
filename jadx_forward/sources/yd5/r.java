package yd5;

/* loaded from: classes9.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2621x8fb0427b.f9 f542681b = null;

    /* renamed from: c, reason: collision with root package name */
    public static long f542682c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static w21.u0 f542683d = null;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f542684e = "";

    /* renamed from: f, reason: collision with root package name */
    public static boolean f542685f;

    /* renamed from: a, reason: collision with root package name */
    public static final yd5.r f542680a = new yd5.r();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f542686g = new java.util.ArrayList();

    public final void a() {
        long j17;
        long j18;
        long longValue;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = f542681b;
        if (f9Var == null) {
            return;
        }
        java.util.List list = f542686g;
        float f17 = 1.0f;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        arrayList.add(new jz5.l(java.lang.Float.valueOf(1.0f), java.lang.Long.valueOf(f542682c)));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("oper_user_type", java.lang.Integer.valueOf(f9Var.A0() > 0 ? 2 : 1));
        hashMap.put("msgid", java.lang.String.valueOf(f9Var.m124847x74d37ac6()));
        hashMap.put("chat_type", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f542684e) ? 2 : 1));
        w21.u0 u0Var = f542683d;
        long j19 = 0;
        hashMap.put("chat_voice_message_duration_total", java.lang.Long.valueOf(u0Var != null ? u0Var.f524013b : 0L));
        hashMap.put("chat_voice_msg_speed_origin_duration", java.lang.Long.valueOf(arrayList.isEmpty() ? f542682c : ((java.lang.Number) ((jz5.l) kz5.n0.X(list)).f384367e).longValue()));
        if (arrayList.isEmpty()) {
            j17 = 0;
        } else {
            java.util.Iterator it = arrayList.iterator();
            j17 = 0;
            long j27 = 0;
            while (it.hasNext()) {
                jz5.l lVar = (jz5.l) it.next();
                if (j27 > j19) {
                    j17 += ((java.lang.Number) lVar.f384367e).longValue() - j27;
                }
                if (((java.lang.Number) lVar.f384366d).floatValue() > 1.0f) {
                    j27 = ((java.lang.Number) lVar.f384367e).longValue();
                    j19 = 0;
                } else {
                    j19 = 0;
                    j27 = 0;
                }
            }
        }
        hashMap.put("chat_voice_msg_speed_up_duration", java.lang.Long.valueOf(j17));
        if (arrayList.size() < 2) {
            j18 = 0;
        } else {
            java.util.Iterator it6 = arrayList.iterator();
            j18 = 0;
            loop2: while (true) {
                while (it6.hasNext()) {
                    jz5.l lVar2 = (jz5.l) it6.next();
                    if (longValue > 0) {
                        j18 += ((java.lang.Number) lVar2.f384367e).longValue() - longValue;
                    }
                    longValue = (((java.lang.Number) lVar2.f384366d).floatValue() > 1.0f ? 1 : (((java.lang.Number) lVar2.f384366d).floatValue() == 1.0f ? 0 : -1)) == 0 ? ((java.lang.Number) lVar2.f384367e).longValue() : 0L;
                }
            }
        }
        hashMap.put("chat_voice_msg_speed_reset_duration", java.lang.Long.valueOf(j18));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_voice_message_end", hashMap, 33749);
        if (f542685f) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("oper_user_type", java.lang.Integer.valueOf(f9Var.A0() > 0 ? 2 : 1));
            w21.u0 u0Var2 = f542683d;
            hashMap2.put("chat_voice_message_duration_total", java.lang.Long.valueOf(u0Var2 != null ? u0Var2.f524013b : 0L));
            hashMap2.put("msgid", java.lang.String.valueOf(f9Var.m124847x74d37ac6()));
            hashMap2.put("chat_type", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f542684e) ? 2 : 1));
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator it7 = arrayList.iterator();
            long j28 = 0;
            while (it7.hasNext()) {
                jz5.l lVar3 = (jz5.l) it7.next();
                if (!linkedHashMap.containsKey(java.lang.Float.valueOf(f17))) {
                    linkedHashMap.put(java.lang.Float.valueOf(f17), 0L);
                }
                java.lang.Float valueOf = java.lang.Float.valueOf(f17);
                java.lang.Object obj = linkedHashMap.get(java.lang.Float.valueOf(f17));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                linkedHashMap.put(valueOf, java.lang.Long.valueOf(((java.lang.Number) obj).longValue() + (((java.lang.Number) lVar3.f384367e).longValue() - j28)));
                j28 = ((java.lang.Number) lVar3.f384367e).longValue();
                f17 = ((java.lang.Number) lVar3.f384366d).floatValue();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedHashMap.size());
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(((java.lang.Number) entry.getKey()).floatValue());
                sb6.append(':');
                sb6.append(((java.lang.Number) entry.getValue()).longValue());
                arrayList2.add(sb6.toString());
            }
            hashMap2.put("chat_voice_message_duration_played", kz5.n0.g0(arrayList2, "#", null, null, 0, null, null, 62, null));
            hashMap2.put("bg_play_trigger_type", 1);
            hashMap2.put("chat_username", f542684e);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_voice_msg_bg_play", hashMap2, 33749);
        }
        f542682c = 0L;
        f542681b = null;
        f542683d = null;
        f542684e = "";
        f542685f = false;
        ((java.util.ArrayList) list).clear();
    }

    public final void b(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("msgid", java.lang.String.valueOf(f9Var.m124847x74d37ac6()));
        hashMap.put("chat_type", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str3) ? 2 : 1));
        hashMap.put("chat_username", str3);
        hashMap.put("oper_user_type", java.lang.Integer.valueOf(f9Var.A0() <= 0 ? 1 : 2));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(str, str2, hashMap, 33749);
    }

    public final void c(java.lang.String str, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = f542681b;
        if (f9Var == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("oper_user_type", java.lang.Integer.valueOf(f9Var.A0() > 0 ? 2 : 1));
        hashMap.put("chat_voice_message_duration_played", java.lang.Long.valueOf(f542682c));
        w21.u0 u0Var = f542683d;
        hashMap.put("chat_voice_message_duration_total", java.lang.Long.valueOf(u0Var != null ? u0Var.f524013b : 0L));
        hashMap.put("msgid", java.lang.String.valueOf(f9Var.m124847x74d37ac6()));
        hashMap.put("chat_type", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f542684e) ? 2 : 1));
        hashMap.put("chat_name", f542684e);
        if (z17) {
            hashMap.put("bg_play_trigger_type", 1);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(str, z18 ? "view_exp" : "view_clk", hashMap, 33749);
    }
}
