package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class a3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f171034d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI) {
        super(1);
        this.f171034d = appBrandDebugUI;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe it = (com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ex5.g gVar = this.f171034d.f301660z;
        java.util.HashSet hashSet = gVar.f338787g;
        if (!hashSet.contains("pref_key_prefer_packed_develop_lib")) {
            hashSet.add("pref_key_prefer_packed_develop_lib");
            gVar.notifyDataSetChanged();
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157559a;
        it.f301633d = !com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("__appbrand_comm_lib__prefs").getBoolean("disable_develop_lib", false);
        return jz5.f0.f384359a;
    }
}
