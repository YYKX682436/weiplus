package com.tencent.mm.plugin.appbrand.pip;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.pip.l f87503d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.pip.l f87504e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.pip.l f87505f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.l[] f87506g;

    static {
        com.tencent.mm.plugin.appbrand.pip.l lVar = new com.tencent.mm.plugin.appbrand.pip.l("SUCCESS", 0);
        f87503d = lVar;
        com.tencent.mm.plugin.appbrand.pip.l lVar2 = new com.tencent.mm.plugin.appbrand.pip.l("FAIL_SINCE_IS_EXITING", 1);
        f87504e = lVar2;
        com.tencent.mm.plugin.appbrand.pip.l lVar3 = new com.tencent.mm.plugin.appbrand.pip.l("FAIL_SINCE_NOT_IN_PIP", 2);
        f87505f = lVar3;
        com.tencent.mm.plugin.appbrand.pip.l[] lVarArr = {lVar, lVar2, lVar3};
        f87506g = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.appbrand.pip.l valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.pip.l) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.pip.l.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.pip.l[] values() {
        return (com.tencent.mm.plugin.appbrand.pip.l[]) f87506g.clone();
    }
}
