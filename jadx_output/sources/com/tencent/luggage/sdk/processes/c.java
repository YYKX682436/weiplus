package com.tencent.luggage.sdk.processes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.processes.c f47630d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.processes.c f47631e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.processes.c f47632f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.processes.c f47633g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.processes.c f47634h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.luggage.sdk.processes.c[] f47635i;

    static {
        com.tencent.luggage.sdk.processes.c cVar = new com.tencent.luggage.sdk.processes.c("KILL_TYPE_SILENT", 0);
        f47630d = cVar;
        com.tencent.luggage.sdk.processes.c cVar2 = new com.tencent.luggage.sdk.processes.c("KILL_TYPE_NOTIFY_ACCOUNT_RELEASE", 1);
        f47631e = cVar2;
        com.tencent.luggage.sdk.processes.c cVar3 = new com.tencent.luggage.sdk.processes.c("KILL_TYPE_SILENT_IF_INACTIVE", 2);
        f47632f = cVar3;
        com.tencent.luggage.sdk.processes.c cVar4 = new com.tencent.luggage.sdk.processes.c("KILL_TYPE_SILENT_ACCOUNT_LOGOUT", 3);
        f47633g = cVar4;
        com.tencent.luggage.sdk.processes.c cVar5 = new com.tencent.luggage.sdk.processes.c("KILL_TYPE_API_FORCE_KILL_ALL", 4);
        f47634h = cVar5;
        com.tencent.luggage.sdk.processes.c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        f47635i = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static com.tencent.luggage.sdk.processes.c valueOf(java.lang.String str) {
        return (com.tencent.luggage.sdk.processes.c) java.lang.Enum.valueOf(com.tencent.luggage.sdk.processes.c.class, str);
    }

    public static com.tencent.luggage.sdk.processes.c[] values() {
        return (com.tencent.luggage.sdk.processes.c[]) f47635i.clone();
    }
}
