package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public abstract class u {

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.gson.u f44843d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ com.google.gson.u[] f44844e;

    static {
        com.google.gson.s sVar = new com.google.gson.s(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        f44843d = sVar;
        final java.lang.String str = "STRING";
        final int i17 = 1;
        f44844e = new com.google.gson.u[]{sVar, new com.google.gson.u(str, i17) { // from class: com.google.gson.t
        }};
    }

    public u(java.lang.String str, int i17, com.google.gson.s sVar) {
    }

    public static com.google.gson.u valueOf(java.lang.String str) {
        return (com.google.gson.u) java.lang.Enum.valueOf(com.google.gson.u.class, str);
    }

    public static com.google.gson.u[] values() {
        return (com.google.gson.u[]) f44844e.clone();
    }
}
