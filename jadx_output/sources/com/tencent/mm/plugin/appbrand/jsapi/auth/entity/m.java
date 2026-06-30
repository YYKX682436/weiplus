package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m f79514e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m f79515f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m f79516g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m[] f79517h;

    /* renamed from: d, reason: collision with root package name */
    public final int f79518d;

    static {
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m mVar = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m("NO_ACTION", 0, 1);
        f79514e = mVar;
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m mVar2 = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m("CREATE_FAIL", 1, 2);
        f79515f = mVar2;
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m mVar3 = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m("CREATE_SUCCESS", 2, 3);
        f79516g = mVar3;
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m[] mVarArr = {mVar, mVar2, mVar3};
        f79517h = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17, int i18) {
        this.f79518d = i18;
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m[] values() {
        return (com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m[]) f79517h.clone();
    }
}
