package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f89501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI) {
        super(1);
        this.f89501d = appBrandDebugUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.weui.base.preference.CheckBoxPreference it = (com.tencent.weui.base.preference.CheckBoxPreference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ex5.g gVar = this.f89501d.f220127z;
        java.util.HashSet hashSet = gVar.f257254g;
        if (!hashSet.contains("pref_key_prefer_packed_develop_lib")) {
            hashSet.add("pref_key_prefer_packed_develop_lib");
            gVar.notifyDataSetChanged();
        }
        int i17 = com.tencent.mm.plugin.appbrand.appcache.w8.f76026a;
        it.f220100d = !com.tencent.mm.sdk.platformtools.o4.M("__appbrand_comm_lib__prefs").getBoolean("disable_develop_lib", false);
        return jz5.f0.f302826a;
    }
}
