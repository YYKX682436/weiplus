package com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log;

/* renamed from: com.tencent.cloud.component.common.ai.log.AiLog */
/* loaded from: classes14.dex */
public class C2903x3c4dddc {

    /* renamed from: ASSERT */
    public static final int f9860x73a36746 = 7;

    /* renamed from: DEBUG */
    public static final int f9861x3de9e33 = 3;

    /* renamed from: ERROR */
    public static final int f9862x3f2d9e8 = 6;

    /* renamed from: INFO */
    public static final int f9863x225cae = 4;
    public static final java.lang.String TAG = "AiLog";

    /* renamed from: VERBOSE */
    public static final int f9864x3fb90562 = 2;

    /* renamed from: WARN */
    public static final int f9865x288a86 = 5;

    /* renamed from: isInit */
    public static boolean f9866xb9a4415a;

    /* renamed from: logger */
    public static com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.C2905x9a9793f8 f9867xbe97f590;

    /* renamed from: assertInitLogger */
    public static boolean m21629xc4e9aaa6() {
        return f9866xb9a4415a;
    }

    /* renamed from: asset */
    public static void m21631x58ceaf0(java.lang.String str, java.lang.String str2) {
        if (f9867xbe97f590 == null || !m21629xc4e9aaa6()) {
            return;
        }
        f9867xbe97f590.m21683x58ceaf0(str, str2);
    }

    /* renamed from: debug */
    public static void m21634x5b09653(java.lang.String str, java.lang.String str2) {
        if (f9867xbe97f590 == null || !m21629xc4e9aaa6()) {
            return;
        }
        f9867xbe97f590.m21686x5b09653(str, str2);
    }

    /* renamed from: error */
    public static void m21637x5c4d208(java.lang.String str, java.lang.String str2) {
        if (f9867xbe97f590 == null || !m21629xc4e9aaa6()) {
            return;
        }
        f9867xbe97f590.m21689x5c4d208(str, str2);
    }

    /* renamed from: info */
    public static void m21640x3164ae(java.lang.String str, java.lang.String str2) {
        if (f9867xbe97f590 == null || !m21629xc4e9aaa6()) {
            return;
        }
        f9867xbe97f590.m21692x3164ae(str, str2);
    }

    /* renamed from: init */
    public static void m21642x316510(com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.C2905x9a9793f8 c2905x9a9793f8) {
        if (c2905x9a9793f8 == null) {
            throw new java.lang.IllegalStateException("init AiLogger is null!");
        }
        f9867xbe97f590 = c2905x9a9793f8;
        f9866xb9a4415a = true;
    }

    /* renamed from: release */
    public static void m21643x41012807() {
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.C2905x9a9793f8 c2905x9a9793f8 = f9867xbe97f590;
        if (c2905x9a9793f8 != null) {
            c2905x9a9793f8.m21694x41012807();
        }
    }

    /* renamed from: verbose */
    public static void m21645x14ed7982(java.lang.String str, java.lang.String str2) {
        if (f9867xbe97f590 == null || !m21629xc4e9aaa6()) {
            return;
        }
        f9867xbe97f590.m21696x14ed7982(str, str2);
    }

    /* renamed from: warn */
    public static void m21648x379286(java.lang.String str, java.lang.String str2) {
        if (f9867xbe97f590 == null || !m21629xc4e9aaa6()) {
            return;
        }
        f9867xbe97f590.m21699x379286(str, str2);
    }

    /* renamed from: asset */
    public static void m21630x58ceaf0(java.lang.String str) {
        if (f9867xbe97f590 == null || !m21629xc4e9aaa6()) {
            return;
        }
        f9867xbe97f590.m21682x58ceaf0(str);
    }

    /* renamed from: debug */
    public static void m21633x5b09653(java.lang.String str) {
        if (f9867xbe97f590 == null || !m21629xc4e9aaa6()) {
            return;
        }
        f9867xbe97f590.m21685x5b09653(str);
    }

    /* renamed from: error */
    public static void m21636x5c4d208(java.lang.String str) {
        if (f9867xbe97f590 == null || !m21629xc4e9aaa6()) {
            return;
        }
        f9867xbe97f590.m21688x5c4d208(str);
    }

    /* renamed from: info */
    public static void m21639x3164ae(java.lang.String str) {
        if (f9867xbe97f590 == null || !m21629xc4e9aaa6()) {
            return;
        }
        f9867xbe97f590.m21691x3164ae(str);
    }

    /* renamed from: verbose */
    public static void m21644x14ed7982(java.lang.String str) {
        if (f9867xbe97f590 == null || !m21629xc4e9aaa6()) {
            return;
        }
        f9867xbe97f590.m21695x14ed7982(str);
    }

    /* renamed from: warn */
    public static void m21647x379286(java.lang.String str) {
        if (f9867xbe97f590 == null || !m21629xc4e9aaa6()) {
            return;
        }
        f9867xbe97f590.m21698x379286(str);
    }

    /* renamed from: asset */
    public static void m21632x58ceaf0(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (f9867xbe97f590 == null || !m21629xc4e9aaa6()) {
            return;
        }
        f9867xbe97f590.m21684x58ceaf0(str, str2, objArr);
    }

    /* renamed from: debug */
    public static void m21635x5b09653(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (f9867xbe97f590 == null || !m21629xc4e9aaa6()) {
            return;
        }
        f9867xbe97f590.m21687x5b09653(str, str2, objArr);
    }

    /* renamed from: error */
    public static void m21638x5c4d208(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (f9867xbe97f590 == null || !m21629xc4e9aaa6()) {
            return;
        }
        f9867xbe97f590.m21690x5c4d208(str, str2, objArr);
    }

    /* renamed from: info */
    public static void m21641x3164ae(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (f9867xbe97f590 == null || !m21629xc4e9aaa6()) {
            return;
        }
        f9867xbe97f590.m21693x3164ae(str, str2, objArr);
    }

    /* renamed from: verbose */
    public static void m21646x14ed7982(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (f9867xbe97f590 == null || !m21629xc4e9aaa6()) {
            return;
        }
        f9867xbe97f590.m21697x14ed7982(str, str2, objArr);
    }

    /* renamed from: warn */
    public static void m21649x379286(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (f9867xbe97f590 == null || !m21629xc4e9aaa6()) {
            return;
        }
        f9867xbe97f590.m21700x379286(str, str2, objArr);
    }
}
