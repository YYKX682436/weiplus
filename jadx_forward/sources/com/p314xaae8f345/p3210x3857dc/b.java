package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f301741b = "";

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.p3210x3857dc.b f301742c;

    /* renamed from: a, reason: collision with root package name */
    public java.util.Map f301743a = new java.util.HashMap();

    public static synchronized com.p314xaae8f345.p3210x3857dc.b m() {
        com.p314xaae8f345.p3210x3857dc.b bVar;
        synchronized (com.p314xaae8f345.p3210x3857dc.b.class) {
            if (f301742c == null) {
                com.p314xaae8f345.p3210x3857dc.b bVar2 = new com.p314xaae8f345.p3210x3857dc.b();
                f301742c = bVar2;
                bVar2.q();
            }
            bVar = f301742c;
        }
        return bVar;
    }

    public boolean a(by5.h hVar, java.util.Map map, java.lang.String[] strArr) {
        java.lang.String str = hVar.f118005b;
        java.lang.String str2 = hVar.f118006c;
        if (str.equals("executeCommand")) {
            java.lang.String[] s17 = s(hVar.f118006c);
            if (s17 == null || s17.length < 2) {
                return false;
            }
            str = s17[0];
            str2 = s17[1];
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        java.util.Map k17 = k(str, map);
        if (k17 == null || k17.isEmpty()) {
            k17 = new java.util.HashMap();
            map.put(str, k17);
        }
        boolean z17 = false;
        for (java.lang.String str3 : strArr) {
            java.lang.String trim = str3.trim();
            if (trim != null && !trim.isEmpty() && !k17.containsKey(trim)) {
                k17.put(trim, str2);
                z17 = true;
            }
        }
        return z17;
    }

    public synchronized void b(by5.h[] hVarArr, java.lang.String str, boolean z17) {
        java.lang.String str2;
        if (str == null) {
            by5.c4.f(n(), "applyCommandInternal, invalid configVersion");
            return;
        }
        by5.c4.f(n(), "applyCommandInternal, configVersion:" + str + ", isRecheck:" + z17);
        e();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (hVarArr != null && hVarArr.length != 0) {
            for (int i17 = 0; i17 < hVarArr.length; i17++) {
                by5.h hVar = hVarArr[i17];
                if (hVar != null && (!z17 || !"revertToVersion".equals(hVar.f118005b))) {
                    by5.c4.f(n(), ">>> applyCommand, command[" + i17 + "]:" + hVarArr[i17]);
                    if (!hVarArr[i17].f118004a.a(false, false, "CommandCfg")) {
                        by5.c4.g(n(), "<<< applyCommand, command[" + i17 + "] not match");
                    } else if (by5.f.a(hVarArr[i17]).f301738a) {
                        by5.c4.f(n(), "<<< applyCommand, command[" + i17 + "] handled");
                    } else {
                        by5.h hVar2 = hVarArr[i17];
                        if (hVar2.f118006c != null && (str2 = hVar2.f118007d) != null && !str2.isEmpty()) {
                            boolean a17 = a(hVarArr[i17], hashMap, hVarArr[i17].f118007d.split(","));
                            by5.c4.g(n(), "<<< applyCommand, apply command[" + i17 + "]:" + a17);
                        }
                    }
                }
            }
            t(str, hashMap);
            return;
        }
        by5.c4.g(n(), "applyCommandInternal, empty new command configs");
        t(str, hashMap);
    }

    public synchronized void c(java.util.Map map, android.content.SharedPreferences sharedPreferences) {
        java.util.Map<java.lang.String, ?> all = sharedPreferences.getAll();
        if (all != null && all.size() != 0) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, ?>> it = all.entrySet().iterator();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (it.hasNext()) {
                arrayList.add(it.next().getKey());
            }
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                java.lang.String str = (java.lang.String) it6.next();
                if (!"cStrTAGConfigVer".equalsIgnoreCase(str) && !"cStrTAGConfigSdkVer".equalsIgnoreCase(str) && !"cStrSpKeyConfigsReady".equalsIgnoreCase(str) && !map.containsKey(str)) {
                    edit.remove(str);
                }
            }
            edit.commit();
            by5.c4.f(n(), "clearOldCommandConfigs, remained section B size:" + sharedPreferences.getAll().size());
        }
    }

    public synchronized java.lang.String d() {
        java.lang.StringBuilder sb6;
        sb6 = new java.lang.StringBuilder(512);
        java.util.Set<java.lang.String> keySet = this.f301743a.keySet();
        sb6.append(" config version = " + f301741b + "\n");
        sb6.append(" config sdk version = 0\n");
        if (keySet == null) {
            return sb6.toString();
        }
        for (java.lang.String str : keySet) {
            if (!android.text.TextUtils.isEmpty(str)) {
                synchronized (this) {
                }
            }
        }
        return sb6.toString();
        java.lang.String u17 = u(k(str, this.f301743a));
        if (u17 == null) {
            u17 = "";
        }
        sb6.append(" [" + str + "] = ");
        sb6.append(u17);
        sb6.append("\n");
    }

    public synchronized void e() {
        if (!r(p())) {
            by5.c4.f(n(), "forkSectionBToSectionAIfNeed, section B not ready, ignore");
            return;
        }
        android.content.SharedPreferences.Editor edit = o().edit();
        edit.putString("cStrSpKeyConfigsReady", "false");
        edit.commit();
        android.content.SharedPreferences p17 = p();
        java.util.Map<java.lang.String, ?> all = p17.getAll();
        if (all != null && all.size() != 0) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, ?>> it = all.entrySet().iterator();
            while (it.hasNext()) {
                java.lang.String key = it.next().getKey();
                java.lang.String string = p17.getString(key, "");
                if (key != null && !key.equalsIgnoreCase("cStrSpKeyConfigsReady")) {
                    edit.putString(key, java.lang.String.valueOf(string));
                }
            }
            edit.putString("cStrSpKeyConfigsReady", "true");
            edit.commit();
            by5.c4.f(n(), "forkSectionBToSectionAIfNeed, forked section A size:" + o().getAll().size());
        }
        by5.c4.f(n(), "forkSectionBToSectionAIfNeed, empty command configs");
        edit.putString("cStrSpKeyConfigsReady", "true");
        edit.commit();
        by5.c4.f(n(), "forkSectionBToSectionAIfNeed, forked section A size:" + o().getAll().size());
    }

    public synchronized java.lang.String f(java.lang.String str) {
        java.lang.String m120126xba60370d;
        m120126xba60370d = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120126xba60370d();
        if (android.text.TextUtils.isEmpty(m120126xba60370d)) {
            m120126xba60370d = "tools";
        }
        return g(str, m120126xba60370d);
    }

    public synchronized java.lang.String g(java.lang.String str, java.lang.String str2) {
        return j(str, str2);
    }

    public synchronized boolean h(java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String j17 = j(str, str2);
        if (android.text.TextUtils.isEmpty(j17)) {
            return z17;
        }
        if ("true".equalsIgnoreCase(j17)) {
            return true;
        }
        if ("false".equalsIgnoreCase(j17)) {
            return false;
        }
        return z17;
    }

    public synchronized int i(java.lang.String str, java.lang.String str2, int i17) {
        java.lang.String j17 = j(str, str2);
        if (android.text.TextUtils.isEmpty(j17)) {
            return i17;
        }
        by5.z e17 = by5.a0.e(j17);
        if (!e17.f118148a) {
            return i17;
        }
        return e17.b();
    }

    public synchronized java.lang.String j(java.lang.String str, java.lang.String str2) {
        java.util.Map k17;
        synchronized (this) {
            k17 = k(str, this.f301743a);
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120126xba60370d();
            if (android.text.TextUtils.isEmpty(str2)) {
                str2 = "tools";
            }
        }
        if (k17 != null && str2 != null) {
            java.lang.String str3 = (java.lang.String) k17.get(str2);
            if (android.text.TextUtils.isEmpty(str3) || !str3.contains("[") || !str3.contains("]")) {
                return str3;
            }
            return by5.p0.a(str3);
        }
        return "";
    }

    public synchronized java.util.Map k(java.lang.String str, java.util.Map map) {
        if (str != null) {
            if (!str.isEmpty()) {
                java.lang.Object obj = map.get(str);
                if (obj instanceof java.util.HashMap) {
                    return (java.util.Map) obj;
                }
                return new java.util.HashMap();
            }
        }
        return new java.util.HashMap();
    }

    public com.p314xaae8f345.p3210x3857dc.c1 l(java.lang.String str) {
        java.lang.String g17 = g("setfullscreenvideo", str);
        com.p314xaae8f345.p3210x3857dc.c1 c1Var = com.p314xaae8f345.p3210x3857dc.c1.HOOK_EVALUTE_JS;
        if (g17 == null || g17.isEmpty()) {
            return c1Var;
        }
        try {
            return com.p314xaae8f345.p3210x3857dc.c1.m120238xdce0328(g17);
        } catch (java.lang.Throwable th6) {
            by5.c4.d(n(), "convertFullscreenVideo error", th6);
            return c1Var;
        }
    }

    public java.lang.String n() {
        return "CommandCfg";
    }

    public android.content.SharedPreferences o() {
        return by5.d4.a("XWEB.CMDCFG", true);
    }

    public android.content.SharedPreferences p() {
        return by5.d4.a("XWEB.CMDCFG.LATEST", true);
    }

    public synchronized void q() {
        java.lang.String str;
        java.lang.String str2;
        by5.c4.f(n(), "initCommandConfigs start");
        this.f301743a.clear();
        android.content.SharedPreferences p17 = p();
        if (r(p17)) {
            by5.c4.f(n(), "initCommandConfigs, section B is ready");
            by5.s0.e(1749L, 48L, 1L);
        } else {
            p17 = o();
            if (r(p17)) {
                by5.c4.f(n(), "initCommandConfigs, section A is ready");
                by5.s0.e(1749L, 47L, 1L);
            } else {
                by5.c4.g(n(), "initCommandConfigs, section A and B both not ready!!!");
                by5.s0.e(1749L, 46L, 1L);
            }
        }
        f301741b = p17.getString("cStrTAGConfigVer", "");
        java.util.Map<java.lang.String, ?> all = p17.getAll();
        if (all != null && all.size() != 0) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, ?>> it = all.entrySet().iterator();
            while (it.hasNext()) {
                java.lang.String key = it.next().getKey();
                java.lang.String string = p17.getString(key, "");
                if (key != null && string != null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    if (!string.isEmpty()) {
                        for (java.lang.String str3 : string.split("~~~")) {
                            if (str3 != null && !str3.isEmpty()) {
                                java.lang.String[] split = str3.split("```");
                                if (split.length == 2 && (str = split[0]) != null && (str2 = split[1]) != null) {
                                    hashMap.put(str, str2);
                                }
                            }
                        }
                    }
                    if (hashMap.size() == 0) {
                        this.f301743a.put(key, string);
                    } else {
                        this.f301743a.put(key, hashMap);
                    }
                }
            }
            by5.c4.f(n(), "initCommandConfigs end, config version:" + f301741b + ", config map size:" + this.f301743a.size());
            return;
        }
        by5.c4.f(n(), "initCommandConfigs end, empty command configs");
    }

    public final boolean r(android.content.SharedPreferences sharedPreferences) {
        java.lang.String string;
        return sharedPreferences != null && sharedPreferences.contains("cStrSpKeyConfigsReady") && (string = sharedPreferences.getString("cStrSpKeyConfigsReady", "")) != null && string.equalsIgnoreCase("true");
    }

    public java.lang.String[] s(java.lang.String str) {
        java.lang.String[] strArr = new java.lang.String[2];
        if (str == null || !str.contains(":")) {
            return null;
        }
        int indexOf = str.indexOf(58);
        strArr[0] = str.substring(0, indexOf);
        if (str.length() - 1 <= indexOf) {
            strArr[1] = "";
        } else {
            strArr[1] = str.substring(indexOf + 1);
        }
        return strArr;
    }

    public synchronized void t(java.lang.String str, java.util.Map map) {
        java.lang.Object value;
        android.content.SharedPreferences.Editor edit = p().edit();
        edit.putString("cStrSpKeyConfigsReady", "false");
        edit.commit();
        c(map, p());
        edit.putString("cStrTAGConfigVer", str);
        edit.putString("cStrTAGConfigSdkVer", java.lang.String.valueOf(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61212x34eb0d19));
        if (map != null && map.isEmpty()) {
            by5.c4.g(n(), "saveCommandConfigs, new command configs is empty");
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && !((java.lang.String) entry.getKey()).isEmpty() && (value = entry.getValue()) != null) {
                if (value instanceof java.util.Map) {
                    try {
                        java.util.Map map2 = (java.util.Map) value;
                        if (map2 != null) {
                            edit.putString((java.lang.String) entry.getKey(), u(map2));
                        }
                    } catch (java.lang.Throwable unused) {
                        edit.putString((java.lang.String) entry.getKey(), value.toString());
                        by5.c4.f(n(), "saveCommandConfigs error, command:" + ((java.lang.String) entry.getKey()) + ", map:" + value);
                    }
                } else {
                    edit.putString((java.lang.String) entry.getKey(), value.toString());
                }
            }
        }
        edit.putString("cStrSpKeyConfigsReady", "true");
        boolean commit = edit.commit();
        if (commit) {
            f301741b = str;
            this.f301743a = map;
        }
        by5.c4.f(n(), "saveCommandConfigs, result:" + commit + ", sp size:" + p().getAll().size());
    }

    public java.lang.String u(java.util.Map map) {
        if (map == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (sb6.length() != 0) {
                sb6.append("~~~");
            }
            sb6.append((java.lang.String) entry.getKey());
            sb6.append("```");
            sb6.append((java.lang.String) entry.getValue());
        }
        return sb6.toString();
    }
}
