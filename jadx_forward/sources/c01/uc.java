package c01;

/* loaded from: classes11.dex */
public class uc {

    /* renamed from: c, reason: collision with root package name */
    public static final c01.uc f119047c = new c01.uc();

    /* renamed from: d, reason: collision with root package name */
    public static boolean f119048d = false;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f119049a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_account_history", 0);

    /* renamed from: b, reason: collision with root package name */
    public final android.content.SharedPreferences f119050b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_account_switch", 0);

    public void a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        android.content.SharedPreferences sharedPreferences = this.f119050b;
        java.util.Set<java.lang.String> stringSet = sharedPreferences.getStringSet("first_switch_group", null);
        if (stringSet == null) {
            stringSet = new java.util.HashSet<>();
        }
        if (!stringSet.contains(str) && stringSet.size() < 5) {
            stringSet.add(str);
        }
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove("first_switch_group").apply();
        edit.putStringSet("first_switch_group", stringSet).commit();
    }

    public void b(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, str2) || str.equals(str2)) {
            return;
        }
        android.content.SharedPreferences sharedPreferences = this.f119050b;
        java.util.Set<java.lang.String> stringSet = sharedPreferences.getStringSet("first_switch_group", null);
        if (stringSet == null) {
            stringSet = new java.util.HashSet<>();
        }
        if (!stringSet.contains(str) || stringSet.size() >= 5) {
            java.util.Iterator<java.lang.String> it = stringSet.iterator();
            while (it.hasNext()) {
                j(it.next());
            }
            stringSet.clear();
            stringSet.add(str);
            stringSet.add(str2);
        } else {
            stringSet.add(str2);
        }
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove("first_switch_group").apply();
        edit.putStringSet("first_switch_group", stringSet).commit();
    }

    public java.lang.String c(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences sharedPreferences = this.f119049a;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwitchAccountInfo", "get %s, %s", str, str2);
            if (sharedPreferences.contains(str)) {
                java.lang.String str3 = new java.lang.String(android.util.Base64.decode(sharedPreferences.getString(str, ""), 0));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwitchAccountInfo", "get json str %s", str3);
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str3);
                    if (jSONObject.has(str2)) {
                        return jSONObject.getString(str2);
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SwitchAccountInfo", "account info about %s is not found!", str);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SwitchAccountInfo", "get account info %s about %s failed, error: %s", str2, str, e17.getMessage());
        }
        return "";
    }

    public java.util.Set d() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Set<java.lang.String> stringSet = this.f119050b.getStringSet("first_switch_group", null);
        if (stringSet != null && !stringSet.isEmpty()) {
            hashSet.addAll(stringSet);
        }
        return hashSet;
    }

    public java.lang.String e() {
        java.util.Set d17 = d();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = ((java.util.HashSet) d17).iterator();
        while (it.hasNext()) {
            java.lang.String c17 = c((java.lang.String) it.next(), "last_login_uin");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (c17 == null) {
                c17 = "0";
            }
            linkedList.add(c17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwitchAccountInfo", "switch users %s", linkedList);
        return android.text.TextUtils.join(";", linkedList);
    }

    public java.lang.String f() {
        java.util.Set d17 = d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = ((java.util.HashSet) d17).iterator();
        while (it.hasNext()) {
            sb6.append((java.lang.String) it.next());
            sb6.append(';');
        }
        if (sb6.length() > 0) {
            sb6.deleteCharAt(sb6.length() - 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwitchAccountInfo", "switch users %s", sb6.toString());
        return sb6.toString();
    }

    public void g(java.lang.String str, java.util.Map map) {
        org.json.JSONObject jSONObject;
        android.content.SharedPreferences sharedPreferences = this.f119049a;
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    if (sharedPreferences.contains(str)) {
                        java.lang.String string = sharedPreferences.getString(str, "");
                        jSONObject = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) ? new org.json.JSONObject(new java.lang.String(android.util.Base64.decode(string, 0))) : new org.json.JSONObject();
                    } else {
                        jSONObject = new org.json.JSONObject();
                    }
                    for (java.lang.String str2 : map.keySet()) {
                        jSONObject.put(str2, map.get(str2));
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwitchAccountInfo", "put json str %s", jSONObject.toString());
                    sharedPreferences.edit().putString(str, android.util.Base64.encodeToString(jSONObject.toString().getBytes(), 0)).commit();
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SwitchAccountInfo", "save account info about %s failed, error: %s", str, e17.getMessage());
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwitchAccountInfo", "kv map is null or empty!");
    }

    public void h(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.json.JSONObject jSONObject;
        android.content.SharedPreferences sharedPreferences = this.f119049a;
        try {
            if (sharedPreferences.contains(str)) {
                java.lang.String string = sharedPreferences.getString(str, "");
                jSONObject = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) ? new org.json.JSONObject(new java.lang.String(android.util.Base64.decode(string, 0))) : new org.json.JSONObject();
            } else {
                jSONObject = new org.json.JSONObject();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str2, str3)) {
                return;
            }
            jSONObject.put(str2, str3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwitchAccountInfo", "put key %s, jsonStr %s", str2, jSONObject.toString());
            sharedPreferences.edit().putString(str, android.util.Base64.encodeToString(jSONObject.toString().getBytes(), 0)).commit();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SwitchAccountInfo", "save account info %s about %s failed, error: %s", str2, str, e17.getMessage());
        }
    }

    public void i(java.lang.String str) {
        java.util.Set<java.lang.String> stringSet;
        android.content.SharedPreferences sharedPreferences = this.f119050b;
        java.util.Set<java.lang.String> stringSet2 = sharedPreferences.getStringSet("first_switch_group", null);
        if ((stringSet2 == null ? false : stringSet2.contains(str)) && (stringSet = sharedPreferences.getStringSet("first_switch_group", null)) != null) {
            stringSet.remove(str);
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove("first_switch_group").apply();
            edit.putStringSet("first_switch_group", stringSet).commit();
        }
        if (this.f119049a.contains(str)) {
            j(str);
        }
    }

    public void j(java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = this.f119049a;
        if (sharedPreferences.contains(str)) {
            try {
                com.p314xaae8f345.mm.vfs.w6.h(c(str, "last_avatar_path"));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SwitchAccountInfo", "remove avatar file error %s", e17.getMessage());
            }
            sharedPreferences.edit().remove(str).commit();
        }
    }
}
