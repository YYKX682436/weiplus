package qx5;

/* loaded from: classes13.dex */
public abstract class u {
    public static void a(android.content.Context context, java.lang.String str, boolean z17, boolean z18, android.webkit.ValueCallback valueCallback) {
        cy5.p pVar = new cy5.p();
        qx5.r rVar = new qx5.r(str, z17, context, pVar, z18, valueCallback);
        pVar.f306426a = str;
        pVar.f306427b = rVar;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("UpdaterCheckType", "1");
        pVar.c(context, hashMap);
    }

    public static boolean b(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17) {
        if (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18.equalsIgnoreCase(str) || android.text.TextUtils.isEmpty(str)) {
            by5.a1.g(context, "开始检测所有插件更新", false);
            by5.l0.W(true);
            zx5.p.Z().S();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("UpdaterCheckType", str2);
            cy5.t tVar = new cy5.t();
            tVar.n(hashMap, "", null);
            tVar.e(new java.lang.String[0]);
        } else if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61206xd3e8e450.equalsIgnoreCase(str)) {
            a(context, com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61206xd3e8e450, z17, false, null);
        } else if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61208xfb9a50aa.equalsIgnoreCase(str)) {
            a(context, com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61208xfb9a50aa, z17, false, null);
        } else if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61209xfb9a522c.equalsIgnoreCase(str)) {
            a(context, com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61209xfb9a522c, z17, false, null);
        } else if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61211x77b31e32.equalsIgnoreCase(str)) {
            a(context, com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61211x77b31e32, z17, false, null);
        } else if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61205x7db6e06f.equalsIgnoreCase(str)) {
            a(context, com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61205x7db6e06f, z17, false, null);
        } else if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61207x493967e4.equalsIgnoreCase(str)) {
            a(context, com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61207x493967e4, z17, false, null);
        } else {
            if (!com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61210xfb9a6228.equalsIgnoreCase(str)) {
                by5.a1.g(context, "检测插件更新失败，参数错误", z17);
                return false;
            }
            a(context, com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61210xfb9a6228, z17, false, null);
        }
        return true;
    }

    public static boolean c(java.lang.String str, com.p314xaae8f345.p3210x3857dc.m mVar) {
        com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
        java.lang.String[] strArr = (str == null || str.isEmpty() || com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18.equalsIgnoreCase(str)) ? com.p314xaae8f345.p3210x3857dc.n.f301876c : new java.lang.String[]{str};
        java.lang.String j17 = u0Var.j(strArr, mVar);
        by5.c4.f("XWebDebugPluginHelper", "forceUseOfficeReader, result:" + j17 + ", useOfficeReader:" + mVar + ", ext:" + str);
        if (j17.isEmpty()) {
            return false;
        }
        com.p314xaae8f345.p3210x3857dc.g.d(strArr);
        return true;
    }

    public static java.lang.String d() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n\n>>>>>> plugin info start >>>>>>\n plugin config url = ");
        sb6.append(by5.e4.b());
        sb6.append("\n plugin config period(minutes) = ");
        sb6.append(by5.e4.c() / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8);
        sb6.append("\n\n plugin version:");
        java.util.Iterator it = ((java.util.ArrayList) cy5.m.b()).iterator();
        while (it.hasNext()) {
            cy5.h hVar = (cy5.h) it.next();
            if (hVar != null) {
                sb6.append("\n ");
                sb6.append(hVar.m());
                sb6.append(" = ");
                sb6.append(hVar.f(true));
            }
        }
        sb6.append("\n\n plugin commands:");
        com.p314xaae8f345.p3210x3857dc.c z17 = com.p314xaae8f345.p3210x3857dc.c.z();
        z17.getClass();
        try {
            str = z17.d();
        } catch (java.lang.Throwable th6) {
            by5.c4.d("CommandCfgPlugin", "getAbstractInfo error", th6);
            str = "";
        }
        if (str == null || str.isEmpty()) {
            sb6.append("\n null\n");
        } else {
            sb6.append("\n");
            sb6.append(str);
        }
        sb6.append("\n\n xfiles setting:\n disable cache = ");
        com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
        android.content.SharedPreferences e17 = by5.d4.e();
        sb6.append(e17 == null ? false : e17.getBoolean("fr_disable_cache", false));
        sb6.append("\n disable crash detect = ");
        android.content.SharedPreferences e18 = by5.d4.e();
        sb6.append(e18 == null ? false : e18.getBoolean("fr_disable_crash_detect", false));
        sb6.append("\n\n plugin scheduler:");
        java.util.Iterator it6 = ((java.util.ArrayList) cy5.m.b()).iterator();
        while (it6.hasNext()) {
            cy5.h hVar2 = (cy5.h) it6.next();
            if (hVar2 != null) {
                cy5.a a17 = cy5.b.a(hVar2.m());
                sb6.append("\n ");
                sb6.append(a17.c());
            }
        }
        cy5.a aVar = new cy5.a("");
        sb6.append("\n plugin update match gap backward(update speed) = ");
        sb6.append(aVar.d(aVar.f(false)));
        sb6.append("\n plugin update match gap forward(提前更新) = ");
        sb6.append(aVar.d(aVar.f(true)));
        sb6.append(e());
        sb6.append("\n<<<<<< plugin info end <<<<<<\n");
        return "" + sb6.toString();
    }

    public static java.lang.String e() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n\n file reader type:");
        java.lang.String[] strArr = com.p314xaae8f345.p3210x3857dc.n.f301874a;
        for (int i17 = 0; i17 < 15; i17++) {
            java.lang.String str = strArr[i17];
            sb6.append("\n ");
            sb6.append(str);
            sb6.append(":  cmd-tools-");
            sb6.append(com.p314xaae8f345.p3210x3857dc.c.z().y(str, "tools"));
            sb6.append("  cmd-appbrand-");
            sb6.append(com.p314xaae8f345.p3210x3857dc.c.z().y(str, "appbrand"));
        }
        sb6.append("\n\n use office reader:");
        java.lang.String[] strArr2 = com.p314xaae8f345.p3210x3857dc.n.f301876c;
        for (int i18 = 0; i18 < 9; i18++) {
            java.lang.String str2 = strArr2[i18];
            sb6.append("\n ");
            sb6.append(str2);
            sb6.append(": force-");
            sb6.append(com.p314xaae8f345.p3210x3857dc.t0.f302127a.b(str2));
            sb6.append("  cmd-tools-");
            sb6.append(com.p314xaae8f345.p3210x3857dc.c.z().x(str2, "tools"));
            sb6.append("  cmd-appbrand-");
            sb6.append(com.p314xaae8f345.p3210x3857dc.c.z().x(str2, "appbrand"));
            sb6.append("  cmd-mm-");
            sb6.append(com.p314xaae8f345.p3210x3857dc.c.z().x(str2, "mm"));
        }
        return sb6.toString();
    }

    public static boolean f(android.content.Context context, java.lang.String str, boolean z17, boolean z18, android.webkit.ValueCallback valueCallback) {
        java.io.File file = new java.io.File(android.os.Environment.getExternalStorageDirectory().getPath());
        if (file.listFiles() == null) {
            android.widget.Toast.makeText(context, "请确认应用权限，在权限管理打开应用的读写存储权限", 0).show();
            valueCallback.onReceiveValue(java.lang.Boolean.FALSE);
            return false;
        }
        cy5.h d17 = cy5.m.d(str);
        if (d17 == null) {
            android.widget.Toast.makeText(context, "找不到对应插件", 0).show();
            valueCallback.onReceiveValue(java.lang.Boolean.FALSE);
            return false;
        }
        java.lang.String str2 = com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61206xd3e8e450.equals(str) ? "xweb_fullscreen_video.js" : com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61209xfb9a522c.equals(str) ? "xfiles_ppt_reader.zip" : com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61208xfb9a50aa.equals(str) ? z18 ? "xfiles_pdf_reader_arm64.zip" : "xfiles_pdf_reader_arm.zip" : com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61211x77b31e32.equals(str) ? z18 ? "xfiles_word_reader_arm64.zip" : "xfiles_word_reader_arm.zip" : com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61205x7db6e06f.equals(str) ? "xfiles_excel_reader.zip" : com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61207x493967e4.equals(str) ? z18 ? "xfiles_office_reader_arm64.zip" : "xfiles_office_reader_arm.zip" : com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61210xfb9a6228.equals(str) ? "xfiles_txt_reader.zip" : "";
        new qx5.t(context, d17, -1, z17, str2, file.getPath() + "/apkxwebtest/" + str2, false, valueCallback).e(new java.lang.Void[0]);
        return true;
    }
}
