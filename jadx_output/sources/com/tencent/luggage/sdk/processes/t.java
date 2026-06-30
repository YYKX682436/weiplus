package com.tencent.luggage.sdk.processes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.processes.t f47692d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.processes.t f47693e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.processes.t f47694f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.luggage.sdk.processes.t[] f47695g;

    static {
        com.tencent.luggage.sdk.processes.t tVar = new com.tencent.luggage.sdk.processes.t(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        f47692d = tVar;
        com.tencent.luggage.sdk.processes.t tVar2 = new com.tencent.luggage.sdk.processes.t("PRE_RENDERED", 1);
        f47693e = tVar2;
        com.tencent.luggage.sdk.processes.t tVar3 = new com.tencent.luggage.sdk.processes.t("RUNNING", 2);
        f47694f = tVar3;
        com.tencent.luggage.sdk.processes.t[] tVarArr = {tVar, tVar2, tVar3};
        f47695g = tVarArr;
        rz5.b.a(tVarArr);
    }

    public t(java.lang.String str, int i17) {
    }

    public static com.tencent.luggage.sdk.processes.t valueOf(java.lang.String str) {
        return (com.tencent.luggage.sdk.processes.t) java.lang.Enum.valueOf(com.tencent.luggage.sdk.processes.t.class, str);
    }

    public static com.tencent.luggage.sdk.processes.t[] values() {
        return (com.tencent.luggage.sdk.processes.t[]) f47695g.clone();
    }
}
