package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes9.dex */
public final class v extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.d(intent);
        java.lang.String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -2128145023) {
                if (hashCode == -1454123155 && action.equals("android.intent.action.SCREEN_ON")) {
                    com.tencent.mm.feature.performance.scheduler.x xVar = com.tencent.mm.feature.performance.scheduler.y.f67720h;
                    java.util.ArrayList arrayList = com.tencent.mm.feature.performance.scheduler.y.f67721i;
                    java.lang.String action2 = intent.getAction();
                    kotlin.jvm.internal.o.d(action2);
                    com.tencent.mm.feature.performance.scheduler.x.a(xVar, arrayList, true, action2);
                }
            } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                com.tencent.mm.feature.performance.scheduler.x xVar2 = com.tencent.mm.feature.performance.scheduler.y.f67720h;
                java.util.ArrayList arrayList2 = com.tencent.mm.feature.performance.scheduler.y.f67721i;
                java.lang.String action3 = intent.getAction();
                kotlin.jvm.internal.o.d(action3);
                com.tencent.mm.feature.performance.scheduler.x.a(xVar2, arrayList2, false, action3);
            }
        }
        com.tencent.mm.feature.performance.scheduler.d.a(java.lang.String.valueOf(intent.getAction()));
    }
}
