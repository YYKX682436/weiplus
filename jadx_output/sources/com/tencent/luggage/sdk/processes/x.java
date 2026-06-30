package com.tencent.luggage.sdk.processes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.processes.x f47699d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.processes.x f47700e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.luggage.sdk.processes.x[] f47701f;

    static {
        com.tencent.luggage.sdk.processes.x xVar = new com.tencent.luggage.sdk.processes.x("CREATE_NEW", 0);
        f47699d = xVar;
        com.tencent.luggage.sdk.processes.x xVar2 = new com.tencent.luggage.sdk.processes.x("RESUME_EXISTED", 1);
        f47700e = xVar2;
        com.tencent.luggage.sdk.processes.x[] xVarArr = {xVar, xVar2};
        f47701f = xVarArr;
        rz5.b.a(xVarArr);
    }

    public x(java.lang.String str, int i17) {
    }

    public static com.tencent.luggage.sdk.processes.x valueOf(java.lang.String str) {
        return (com.tencent.luggage.sdk.processes.x) java.lang.Enum.valueOf(com.tencent.luggage.sdk.processes.x.class, str);
    }

    public static com.tencent.luggage.sdk.processes.x[] values() {
        return (com.tencent.luggage.sdk.processes.x[]) f47701f.clone();
    }
}
