package jt5;

/* loaded from: classes13.dex */
public abstract class a {
    public static boolean a(java.lang.String str) {
        if (!new java.io.File(str).exists()) {
            return true;
        }
        try {
            boolean a17 = kt5.a.a(str);
            if (!a17) {
                ot5.g.b("BootScriptChecker found no-elf file : " + str);
            }
            return a17;
        } catch (java.io.IOException e17) {
            ot5.g.e(e17);
            return true;
        }
    }

    public static boolean b(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (!file.exists() || file.length() > 51200) {
            return true;
        }
        try {
            java.lang.String str2 = new java.lang.String(kt5.a.b(file.getAbsolutePath()));
            boolean contains = str2.contains("applypatch ");
            ot5.g.c("RiskScanner", "BootScriptChecker script (" + str + ") content : \n" + str2);
            if (!contains) {
                ot5.g.b("BootScriptChecker found unofficial file : " + str);
            }
            return contains;
        } catch (java.lang.Exception e17) {
            ot5.g.e(e17);
            return true;
        }
    }
}
