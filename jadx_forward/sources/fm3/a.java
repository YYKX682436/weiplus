package fm3;

/* loaded from: classes.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String folder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(folder, "folder");
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(com.p314xaae8f345.mm.vfs.w6.M(new com.p314xaae8f345.mm.vfs.r6(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(folder)), "config.conf").o()));
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                if (optJSONObject != null) {
                    java.lang.String optString = optJSONObject.optString(dm.i4.f66865x76d1ec5a);
                    org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                    java.lang.String str = folder + '/' + optString + ".pag";
                    if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
                        str = null;
                    }
                    java.lang.String str2 = "";
                    java.lang.String str3 = str == null ? "" : str;
                    java.lang.String str4 = folder + '/' + optString + ".wxam";
                    java.lang.String str5 = com.p314xaae8f345.mm.vfs.w6.j(str4) ? str4 : null;
                    if (str5 != null) {
                        str2 = str5;
                    }
                    boolean z17 = optJSONObject.optInt("is_show_in_panel", 0) == 1;
                    if (optString != null && optJSONObject2 != null) {
                        fm3.b.f345559e.getClass();
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mv.DefaultPagInfo", e17, "fillPagInfoList", new java.lang.Object[0]);
        }
    }
}
