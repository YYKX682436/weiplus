package c01;

/* loaded from: classes11.dex */
public abstract class h9 {
    public static android.content.SharedPreferences a() {
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("auth_info_key_prefs", 4);
        if (!sharedPreferences.getBoolean("key_auth_info_prefs_created", false)) {
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(148L, 12L, 1L, true);
            com.tencent.mm.storage.j3 j3Var = new com.tencent.mm.storage.j3(com.tencent.mm.storage.v3.f196273a + "autoauth.cfg");
            if (!j3Var.f195043c && j3Var.a(3) != null) {
                android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean("key_auth_info_prefs_created", true);
                edit.putInt("key_auth_update_version", ((java.lang.Integer) j3Var.a(1)).intValue());
                edit.putInt("_auth_uin", ((java.lang.Integer) j3Var.a(2)).intValue());
                edit.putString("_auth_key", (java.lang.String) j3Var.a(3));
                edit.putString("server_id", (java.lang.String) j3Var.a(4));
                java.lang.String str = (java.lang.String) j3Var.a(5);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    edit.putString("server_index_buffer", str);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MMReqRespAuthComm", "summerauth auth_info_key_prefs not exit! use autoauthcfg now commit[%b] create[%b], ver[%d], uin[%d], aak[%s], sid[%s]", java.lang.Boolean.valueOf(edit.commit()), java.lang.Boolean.valueOf(sharedPreferences.getBoolean("key_auth_info_prefs_created", false)), java.lang.Integer.valueOf(sharedPreferences.getInt("key_auth_update_version", 0)), java.lang.Integer.valueOf(sharedPreferences.getInt("_auth_uin", 0)), sharedPreferences.getString("_auth_key", ""), sharedPreferences.getString("server_id", ""));
                fVar.idkeyStat(148L, 51L, 1L, true);
                return sharedPreferences;
            }
            android.content.SharedPreferences sharedPreferences2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("auto_auth_key_prefs", 4);
            android.content.SharedPreferences.Editor edit2 = sharedPreferences.edit();
            if (com.tencent.mm.sdk.platformtools.t8.K0(sharedPreferences2.getString("_auth_key", ""))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMReqRespAuthComm", "summerauth auth_info_key_prefs not exit! neither autoauthcfg nor oldAAKsp existed just install! stack[%s]", new com.tencent.mm.sdk.platformtools.z3());
            } else {
                edit2.putBoolean("key_auth_info_prefs_created", true);
                edit2.putInt("key_auth_update_version", sharedPreferences2.getInt("key_auth_update_version", 0));
                edit2.putInt("_auth_uin", sharedPreferences2.getInt("_auth_uin", 0));
                edit2.putString("_auth_key", sharedPreferences2.getString("_auth_key", ""));
                edit2.putString("server_id", com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("server_id_prefs", 4).getString("server_id", ""));
                com.tencent.mars.xlog.Log.i("MicroMsg.MMReqRespAuthComm", "summerauth auth_info_key_prefs not exit! use oldAAKsp now commit[%b] create[%b], ver[%d], uin[%d], aak[%s], sid[%s]", java.lang.Boolean.valueOf(edit2.commit()), java.lang.Boolean.valueOf(sharedPreferences.getBoolean("key_auth_info_prefs_created", false)), java.lang.Integer.valueOf(sharedPreferences.getInt("key_auth_update_version", 0)), java.lang.Integer.valueOf(sharedPreferences.getInt("_auth_uin", 0)), sharedPreferences.getString("_auth_key", ""), sharedPreferences.getString("server_id", ""));
            }
        }
        return sharedPreferences;
    }
}
