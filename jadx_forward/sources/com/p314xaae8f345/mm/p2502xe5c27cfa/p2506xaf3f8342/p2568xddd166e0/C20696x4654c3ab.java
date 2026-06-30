package com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2568xddd166e0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/serialize/RepairerConfigUseNewSerialize;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.repairer.config.serialize.RepairerConfigUseNewSerialize */
/* loaded from: classes.dex */
public final class C20696x4654c3ab extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_UseNewSerialize";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "使用新序列化解析方案（修改后需手动点击更新才能生效）";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.p314xaae8f345.mm.p2502xe5c27cfa.p2587x5e0f67f.C20921x541526db.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        int i18 = 1;
        if (!((i17 == 788529167 || i17 == 788529166) || z65.c.a()) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.v8.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h)) {
            i18 = 0;
        }
        return java.lang.Integer.valueOf(i18);
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_serialize_use_new";
    }

    @Override // q55.i, q55.d
    public java.util.List n() {
        return kz5.c0.i("旧方案", "新方案");
    }
}
