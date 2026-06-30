package tn3;

/* loaded from: classes8.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (b(context)) {
            return "";
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_voice_input_wetype_guide_config_new, "{}", true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("{}", Zi)) {
            return "";
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(Zi).getJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "getJSONObject(...)");
            java.lang.String str = "simplified_chinese";
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m()) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n()) {
                    str = "traditional_chinese";
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j()) {
                    str = "english";
                }
            }
            java.lang.String string = jSONObject.getString(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) ? string : "";
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTips.NewTipsIdVoiceInputWetypeFilter", "getVoiceToTextAfterSendText, fail, reason:${e.message}");
            return "";
        }
    }

    public final boolean b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageManager, "getPackageManager(...)");
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN", (android.net.Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage("com.tencent.wetype");
        return packageManager.resolveActivity(intent, 0) != null;
    }

    public final boolean c() {
        java.util.List<android.view.inputmethod.InputMethodInfo> enabledInputMethodList;
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager == null || (enabledInputMethodList = inputMethodManager.getEnabledInputMethodList()) == null) {
            return false;
        }
        for (android.view.inputmethod.InputMethodInfo inputMethodInfo : enabledInputMethodList) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(inputMethodInfo.getId(), "com.tencent.wetype/.plugin.hld.WxHldService") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(inputMethodInfo.getId(), "com.tencent.wetype/com.tencent.wetype.plugin.hld.WxHldService")) {
                return true;
            }
        }
        return false;
    }
}
