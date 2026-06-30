package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.CommandLineInitUtil */
/* loaded from: classes13.dex */
public final class C29293x9bda0411 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73240x7118e671 = false;

    /* renamed from: COMMAND_LINE_FILE_PATH */
    private static final java.lang.String f73241xebb65e11 = "/data/local";

    /* renamed from: COMMAND_LINE_FILE_PATH_DEBUG_APP */
    private static final java.lang.String f73242x5ea43147 = "/data/local/tmp";

    /* renamed from: sFilenameOverrideForTesting */
    private static java.lang.String f73243xce96ff2d;

    private C29293x9bda0411() {
    }

    /* renamed from: getDebugApp */
    private static java.lang.String m152321x9c80a444(android.content.Context context) {
        if (android.provider.Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) == 1) {
            return android.provider.Settings.Global.getString(context.getContentResolver(), "debug_app");
        }
        return null;
    }

    /* renamed from: initCommandLine */
    public static void m152322x44d4deaf(java.lang.String str) {
        m152323x44d4deaf(str, null);
    }

    /* renamed from: setFilenameOverrideForTesting */
    public static void m152324x99439e5c(java.lang.String str) {
        f73243xce96ff2d = str;
    }

    /* renamed from: shouldUseDebugCommandLine */
    private static boolean m152325x9ab2e880(org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.InterfaceC29427xa0b65dec<java.lang.Boolean> interfaceC29427xa0b65dec) {
        if (interfaceC29427xa0b65dec != null && interfaceC29427xa0b65dec.get().booleanValue()) {
            return true;
        }
        android.content.Context m152349x6e669035 = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035();
        return m152349x6e669035.getPackageName().equals(m152321x9c80a444(m152349x6e669035)) || org.p3343x72743996.p3344x2e06d1.C29285x23ebd81c.m152234xd51bf6e6();
    }

    /* renamed from: initCommandLine */
    public static void m152323x44d4deaf(java.lang.String str, org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.InterfaceC29427xa0b65dec<java.lang.Boolean> interfaceC29427xa0b65dec) {
        java.lang.String str2 = f73243xce96ff2d;
        if (str2 != null) {
            str = str2;
        }
        java.io.File file = new java.io.File(f73242x5ea43147, str);
        if (!file.exists() || !m152325x9ab2e880(interfaceC29427xa0b65dec)) {
            file = new java.io.File(f73241xebb65e11, str);
        }
        org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.m152295x3ce75576(file.getPath());
    }
}
