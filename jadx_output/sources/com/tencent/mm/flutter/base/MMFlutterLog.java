package com.tencent.mm.flutter.base;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/flutter/base/MMFlutterLog;", "", "()V", "Companion", "mm_foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MMFlutterLog {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.mm.flutter.base.MMFlutterLog.Companion INSTANCE = new com.tencent.mm.flutter.base.MMFlutterLog.Companion(null);
    private byte _hellAccFlag_;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0087 ¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/flutter/base/MMFlutterLog$Companion;", "", "", "getLogHandler", "mm_foundation_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes10.dex */
    public static final class Companion {
        public Companion(kotlin.jvm.internal.i iVar) {
        }

        public final long getLogHandler() {
            return com.tencent.mm.flutter.base.MMFlutterLog.getLogHandler();
        }
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("mm_foundation_lib");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/flutter/base/MMFlutterLog", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/flutter/base/MMFlutterLog", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static final native long getLogHandler();
}
