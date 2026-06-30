package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public abstract class v2 {
    public static final java.lang.String a(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "<this>");
        return "syncNum=" + c(intent) + ", from=" + intent.getStringExtra("notify_from") + ", func=" + b(intent) + ", act=" + intent.getStringExtra("notify_action");
    }

    public static final int b(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "<this>");
        return intent.getIntExtra("notify_respType", 0);
    }

    public static final long c(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "<this>");
        return intent.getLongExtra("notfiy_sync_num", 0L);
    }
}
