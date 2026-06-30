package com.tencent.mm.plugin.backup.roambackup;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.n f92657d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.n f92658e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.n f92659f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.n f92660g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.n[] f92661h;

    static {
        com.tencent.mm.plugin.backup.roambackup.n nVar = new com.tencent.mm.plugin.backup.roambackup.n("UNKNOWN", 0);
        f92657d = nVar;
        com.tencent.mm.plugin.backup.roambackup.n nVar2 = new com.tencent.mm.plugin.backup.roambackup.n("WIFI", 1);
        f92658e = nVar2;
        com.tencent.mm.plugin.backup.roambackup.n nVar3 = new com.tencent.mm.plugin.backup.roambackup.n("USB", 2);
        f92659f = nVar3;
        com.tencent.mm.plugin.backup.roambackup.n nVar4 = new com.tencent.mm.plugin.backup.roambackup.n("UDISK", 3);
        f92660g = nVar4;
        com.tencent.mm.plugin.backup.roambackup.n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        f92661h = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.backup.roambackup.n valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.backup.roambackup.n) java.lang.Enum.valueOf(com.tencent.mm.plugin.backup.roambackup.n.class, str);
    }

    public static com.tencent.mm.plugin.backup.roambackup.n[] values() {
        return (com.tencent.mm.plugin.backup.roambackup.n[]) f92661h.clone();
    }
}
