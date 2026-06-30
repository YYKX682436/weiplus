package i04;

@j95.b
/* loaded from: classes8.dex */
public final class i extends i95.w implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3, j04.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f368081d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f368082e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f368083f;

    /* renamed from: g, reason: collision with root package name */
    public i04.n f368084g;

    /* renamed from: h, reason: collision with root package name */
    public bx1.r f368085h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f368086i;

    /* renamed from: m, reason: collision with root package name */
    public org.json.JSONArray f368087m;

    public i() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(xu5.b.a("mtimer"), this);
        n3Var.m77789xc5a5549d(false);
        this.f368082e = n3Var;
        this.f368087m = new org.json.JSONArray();
    }

    public final bx1.r Ai() {
        if (gm0.j1.a()) {
            m134976x2690a4ac();
        }
        return this.f368085h;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi() {
        if (gm0.j1.a()) {
            m134976x2690a4ac();
        }
        return this.f368083f;
    }

    public final i04.n Di() {
        i04.n nVar = this.f368084g;
        if (nVar != null) {
            return nVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("userTimeSlicing");
        throw null;
    }

    public final synchronized boolean Ni(java.lang.String str) {
        java.lang.Object a17;
        bx1.r Ai;
        a17 = i04.j.a(this.f368087m, str);
        if (a17 != null && (Ai = Ai()) != null) {
            ((ax1.b0) Ai).Ai("MTimerReport", "unsetTask", a17, bx1.u.f117843e);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi = Bi();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Bi);
        Bi.remove(str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi2 = Bi();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Bi2);
        Bi2.D("_mtimer_list", this.f368087m.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTimer", "unset key:%s keyList:%d", str, java.lang.Integer.valueOf(this.f368087m.length()));
        return a17 != null;
    }

    public boolean Ri(java.lang.String sessionId, int i17, j04.f callback, boolean z17, boolean z18) {
        java.lang.Object obj;
        java.util.ArrayList arrayList;
        boolean z19;
        long a17;
        double random;
        double d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (!this.f368086i) {
            return false;
        }
        java.util.Iterator it = this.f368081d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((i04.f) obj).f368071a, sessionId)) {
                break;
            }
        }
        if (obj != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MTimer", "set sessionId:%s is duplicate", sessionId);
            return false;
        }
        i04.f wi6 = wi(sessionId, callback);
        if (wi6 == null) {
            i04.n Di = Di();
            long c17 = (c01.id.c() + java.util.TimeZone.getDefault().getRawOffset()) % 86400000;
            long j17 = (3600000 * i17) + c17;
            if (!z17) {
                c17 = 0;
            } else if (j17 > 86400000) {
                j17 = 86400000;
            }
            int i18 = (c17 > ((long) Di.f368099f) ? 1 : (c17 == ((long) Di.f368099f) ? 0 : -1)) < 0 && (((long) Di.f368098e) > c17 ? 1 : (((long) Di.f368098e) == c17 ? 0 : -1)) <= 0 ? (int) ((c17 - Di.f368098e) / Di.f368096c) : -1;
            int i19 = i18;
            while (true) {
                arrayList = Di.f368097d;
                if (i18 == -1 || i19 >= arrayList.size()) {
                    break;
                }
                i19++;
                if (!((i04.m) arrayList.get(i18)).f368092a) {
                    z19 = true;
                    break;
                }
                i18 = (i18 + 1) % arrayList.size();
            }
            z19 = false;
            if (z19) {
                int i27 = Di.f368096c;
                if (z17) {
                    a17 = Di.a() + ((i04.m) arrayList.get(i18)).f368093b;
                    random = java.lang.Math.random();
                } else {
                    a17 = ((i04.m) arrayList.get(i18)).f368093b + Di.a() + 86400000;
                    random = java.lang.Math.random();
                }
                d17 = i27;
            } else {
                a17 = Di.a() + c17;
                random = java.lang.Math.random();
                d17 = j17 - c17;
            }
            wi6 = new i04.f(sessionId, i17, callback, a17 + ((int) (random * d17)), z18);
        }
        this.f368081d.add(wi6);
        synchronized (this) {
            if (this.f368086i) {
                java.lang.String jSONObject = wi6.a().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi = Bi();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Bi);
                Bi.D(wi6.f368071a, jSONObject);
                bx1.r Ai = Ai();
                if (Ai != null) {
                    ((ax1.b0) Ai).Ai("MTimerReport", "setTask", jSONObject, bx1.u.f117843e);
                }
                i04.j.a(this.f368087m, wi6.f368071a);
                this.f368087m.put(wi6.f368071a);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi2 = Bi();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Bi2);
                Bi2.D("_mtimer_list", this.f368087m.toString());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTimer", "saveKV sessionId:%s keyList:%d", wi6.f368071a, java.lang.Integer.valueOf(this.f368087m.length()));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTimer", "set sessionId:%s time:%d, sessionIdList:%d", sessionId, java.lang.Long.valueOf(wi6.f368074d), java.lang.Integer.valueOf(this.f368081d.size()));
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message msg) {
        java.lang.String str;
        int i17;
        java.util.Iterator it;
        java.lang.String str2;
        long j17;
        int i18;
        boolean z17;
        int i19;
        long rawOffset;
        double random;
        int i27;
        long j18;
        i04.i iVar = this;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (msg.what == 1 && iVar.f368086i) {
            long c17 = c01.id.c();
            java.util.Iterator it6 = iVar.f368081d.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it6, "iterator(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (true) {
                str = "MTimerReport";
                if (!it6.hasNext()) {
                    break;
                }
                i04.f fVar = (i04.f) it6.next();
                if (fVar.f368074d <= c17) {
                    java.lang.String jSONObject = fVar.a().put("currentTime", c17).toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTimer", "executeTask taskStr:%s, currentTime:%d", jSONObject, java.lang.Long.valueOf(c17));
                    bx1.r Ai = Ai();
                    if (Ai != null) {
                        ((ax1.b0) Ai).wi("MTimerReport", "executeTask", jSONObject);
                    }
                    bx1.r Ai2 = Ai();
                    if (Ai2 != null) {
                        ((ax1.b0) Ai2).wi("MTimerReport", "executeTaskTime", java.lang.Long.valueOf(c17));
                    }
                    ((ku5.t0) ku5.t0.f394148d).g(new i04.h(fVar, fVar.f368071a, fVar.f368074d, c17));
                    arrayList.add(fVar);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTimer", "postTask %d, executeList size:%d, task size:%d", java.lang.Long.valueOf(c17), java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(iVar.f368081d.size()));
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                i04.f task = (i04.f) it7.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
                if (iVar.f368086i) {
                    long c18 = c01.id.c();
                    if (c18 - task.f368074d >= Di().f368096c) {
                        i04.n Di = Di();
                        str2 = str;
                        long rawOffset2 = (java.util.TimeZone.getDefault().getRawOffset() + c18) % 86400000;
                        it = it7;
                        long rawOffset3 = (task.f368074d + java.util.TimeZone.getDefault().getRawOffset()) % 86400000;
                        int i28 = 0;
                        boolean z18 = false;
                        while (true) {
                            if (!(((long) Di.f368098e) <= rawOffset3 && rawOffset3 <= rawOffset2)) {
                                break;
                            }
                            java.util.ArrayList arrayList2 = Di.f368097d;
                            if (i28 > arrayList2.size()) {
                                break;
                            }
                            long j19 = rawOffset2;
                            j17 = c18;
                            int i29 = (int) ((rawOffset3 - Di.f368098e) / Di.f368096c);
                            if (i29 >= arrayList2.size()) {
                                break;
                            }
                            if (i29 > -1 && i29 < arrayList2.size()) {
                                ((i04.m) arrayList2.get(i29)).f368092a = true;
                                z18 = true;
                            }
                            i28++;
                            rawOffset3 += Di.f368096c;
                            rawOffset2 = j19;
                            c18 = j17;
                        }
                        j17 = c18;
                        if (z18) {
                            Di.f368095b.D("time_zone", Di.b());
                        }
                    } else {
                        it = it7;
                        str2 = str;
                        j17 = c18;
                    }
                    i04.n Di2 = Di();
                    int i37 = task.f368072b;
                    long parseLong = java.lang.Long.parseLong(Di2.f368094a) + c01.id.c();
                    java.util.ArrayList arrayList3 = Di2.f368097d;
                    int size = (int) (parseLong % arrayList3.size());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTimer", "calcNextTime defaultIndex:%d", java.lang.Integer.valueOf(size));
                    if (i37 != 24) {
                        j18 = c01.id.c() + (i37 * 3600000);
                    } else {
                        int i38 = 0;
                        while (true) {
                            if (i38 >= arrayList3.size()) {
                                i18 = i38;
                                z17 = false;
                                break;
                            }
                            i38++;
                            if (!((i04.m) arrayList3.get(size)).f368092a) {
                                i18 = i38;
                                z17 = true;
                                break;
                            }
                            size = (size + 1) % arrayList3.size();
                        }
                        if (z17) {
                            long c19 = c01.id.c() + 86400000;
                            i19 = i18;
                            rawOffset = (c19 - ((java.util.TimeZone.getDefault().getRawOffset() + c19) % 86400000)) + ((i04.m) arrayList3.get(size)).f368093b;
                            random = java.lang.Math.random();
                            i27 = Di2.f368096c;
                        } else {
                            i19 = i18;
                            long c27 = c01.id.c() + 86400000;
                            rawOffset = (c27 - ((java.util.TimeZone.getDefault().getRawOffset() + c27) % 86400000)) + Di2.f368099f;
                            random = java.lang.Math.random() * 3600 * 1000;
                            i27 = Di2.f368100g;
                        }
                        long j27 = ((int) (random * i27)) + rawOffset;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTimer", "calcNextTime:%d, interval:%d, isFind:%b, index:%d, count:%d", java.lang.Long.valueOf(j27), java.lang.Integer.valueOf(i37), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i19));
                        j18 = j27;
                    }
                    task.f368074d = j18;
                    java.lang.String jSONObject2 = task.a().toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi = Bi();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Bi);
                    Bi.D(task.f368071a, jSONObject2);
                    long j28 = (task.f368074d - j17) / 3600000;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(task.a().put("nextInterval", j28).toString());
                    sb6.append('#');
                    i04.n Di3 = Di();
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    java.util.Iterator it8 = Di3.f368097d.iterator();
                    int i39 = 0;
                    while (it8.hasNext()) {
                        java.lang.Object next = it8.next();
                        int i47 = i39 + 1;
                        if (i39 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        stringBuffer.append("[" + i39 + ',' + ((i04.m) next).f368092a + ']');
                        i39 = i47;
                    }
                    java.lang.String stringBuffer2 = stringBuffer.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringBuffer2, "toString(...)");
                    sb6.append(stringBuffer2);
                    java.lang.String sb7 = sb6.toString();
                    bx1.r Ai3 = Ai();
                    if (Ai3 != null) {
                        str = str2;
                        ((ax1.b0) Ai3).wi(str, dm.i4.f66874x4c6b1f55, sb7);
                    } else {
                        str = str2;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTimer", "updateState:%s", sb7);
                } else {
                    it = it7;
                }
                iVar = this;
                it7 = it;
            }
            i04.n Di4 = Di();
            long c28 = (c01.id.c() + java.util.TimeZone.getDefault().getRawOffset()) % 86400000;
            boolean z19 = c28 <= ((long) Di4.f368099f) && ((long) Di4.f368098e) <= c28;
            java.util.ArrayList arrayList4 = Di4.f368097d;
            if (!z19 || (i17 = (int) ((c28 - Di4.f368098e) / Di4.f368096c)) <= -1 || i17 >= arrayList4.size()) {
                i17 = -1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTimer", "canEnableZone index:%d", java.lang.Integer.valueOf(i17));
            if (i17 != -1) {
                ((i04.m) arrayList4.get(i17)).f368092a = false;
                Di4.f368095b.D("time_zone", Di4.b());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTimer", "handleMessage nextTime:%d, :%s", java.lang.Long.valueOf(u04.d.f505010c), toString());
        this.f368082e.mo50307xb9e94560(1, u04.d.f505010c);
        return true;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String j17 = gm0.j1.b().j();
        this.f368085h = (bx1.r) i95.n0.c(bx1.r.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTimer", "onAccountInitialized uin:%s", j17);
        this.f368083f = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mtimer_" + j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi = Bi();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Bi);
        this.f368084g = new i04.n(j17, Bi);
        this.f368086i = true;
        i04.n Di = Di();
        java.lang.String string = Di.f368095b.getString(Di.f368094a + "_time_zone", "");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string);
        java.util.ArrayList arrayList = Di.f368097d;
        if (K0) {
            for (int i17 = Di.f368098e; i17 <= Di.f368099f; i17 += Di.f368096c) {
                arrayList.add(new i04.m(false, i17));
            }
        } else if (string != null) {
            org.json.JSONArray jSONArray = new org.json.JSONArray(string);
            int length = jSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                if (jSONObject != null) {
                    arrayList.add(new i04.m(jSONObject.getBoolean("disable"), jSONObject.getInt("time")));
                }
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi2 = Bi();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Bi2);
        java.lang.String string2 = Bi2.getString("_mtimer_list", "");
        bx1.r Ai = Ai();
        if (Ai != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            ((ax1.b0) Ai).wi("MTimerReport", "initOfflineTask", string2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTimer", "tastListJson:%s", string2);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
            try {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                this.f368087m = new org.json.JSONArray(string2);
                org.json.JSONArray jSONArray2 = new org.json.JSONArray(string2);
                int length2 = jSONArray2.length();
                for (int i19 = 0; i19 < length2; i19++) {
                    java.lang.String string3 = jSONArray2.getString(i19);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3) && !arrayList2.contains(string3)) {
                        arrayList2.add(string3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
                        i04.f wi6 = wi(string3, null);
                        if (wi6 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTimer", "sessionId:%s, taskList add task", string3);
                            this.f368081d.add(wi6);
                            bx1.r Ai2 = Ai();
                            if (Ai2 != null) {
                                java.lang.String jSONObject2 = wi6.a().toString();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                                ((ax1.b0) Ai2).Ai("MTimerReport", "setTask", jSONObject2, bx1.u.f117843e);
                            }
                        }
                    }
                }
                this.f368087m = new org.json.JSONArray((java.util.Collection) arrayList2);
                if (jSONArray2.length() != this.f368087m.length()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MTimer", "new tastListJson:%s", this.f368087m.toString());
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MTimer", e17, "init error", new java.lang.Object[0]);
            }
        }
        this.f368082e.mo50307xb9e94560(1, 1L);
        ((i04.i) ((j04.e) i95.n0.c(j04.e.class))).Ri("mtimer_test", 24, new i04.g(), true, true);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f368086i = false;
    }

    public final i04.f wi(java.lang.String str, j04.f fVar) {
        if (!this.f368086i) {
            return null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi = Bi();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Bi);
        java.lang.String string = Bi.getString(str, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTimer", "getKV sessionId:%s json:%s", str, string);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            Ni(str);
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(string);
        i04.e eVar = i04.f.f368070f;
        if (fVar != null) {
            return eVar.a(jSONObject, fVar);
        }
        if (jSONObject.getBoolean("o")) {
            i04.f a17 = eVar.a(jSONObject, fVar);
            if (a17 != null) {
                return a17;
            }
            Ni(str);
        }
        return null;
    }
}
