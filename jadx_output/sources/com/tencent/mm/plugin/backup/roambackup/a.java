package com.tencent.mm.plugin.backup.roambackup;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.a f92560d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.a f92561e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.a[] f92562f;

    static {
        com.tencent.mm.plugin.backup.roambackup.a aVar = new com.tencent.mm.plugin.backup.roambackup.a("DeviceMetaCorrupted", 0);
        f92560d = aVar;
        com.tencent.mm.plugin.backup.roambackup.a aVar2 = new com.tencent.mm.plugin.backup.roambackup.a("Deleting", 1);
        f92561e = aVar2;
        com.tencent.mm.plugin.backup.roambackup.a[] aVarArr = {aVar, aVar2};
        f92562f = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.backup.roambackup.a valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.backup.roambackup.a) java.lang.Enum.valueOf(com.tencent.mm.plugin.backup.roambackup.a.class, str);
    }

    public static com.tencent.mm.plugin.backup.roambackup.a[] values() {
        return (com.tencent.mm.plugin.backup.roambackup.a[]) f92562f.clone();
    }
}
