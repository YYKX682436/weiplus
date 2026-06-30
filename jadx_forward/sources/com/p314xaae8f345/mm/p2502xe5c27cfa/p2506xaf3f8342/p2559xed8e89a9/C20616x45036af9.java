package com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2559xed8e89a9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/profile/RepairerConfigRecommendLabelClear;", "Lq55/a;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.repairer.config.profile.RepairerConfigRecommendLabelClear */
/* loaded from: classes.dex */
public final class C20616x45036af9 extends q55.a {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_RecommendLabelClear";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "推荐标签-清除曝光记录";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.p314xaae8f345.mm.p2502xe5c27cfa.p2587x5e0f67f.C20912x570b987d.class;
    }

    @Override // q55.a
    public void h(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_Name_ShowOuterRecommendLabels").putStringSet("MMKV_Key_ShowOuterRecommendLabels", kz5.r0.f395535d);
        android.widget.Toast.makeText(context, "已清除", 0).show();
    }
}
