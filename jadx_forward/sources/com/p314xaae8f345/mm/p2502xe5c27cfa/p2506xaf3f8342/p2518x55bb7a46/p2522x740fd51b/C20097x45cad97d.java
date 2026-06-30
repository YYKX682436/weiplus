package com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2522x740fd51b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/chatting/mediagroup/RepairerConfigMediaGroupUiVisibility;", "Lq55/d;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.repairer.config.chatting.mediagroup.RepairerConfigMediaGroupUiVisibility */
/* loaded from: classes.dex */
public final class C20097x45cad97d extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_MediaGroup_SenderUiVisibility";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "MediaGroup - UI 展示";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.p314xaae8f345.mm.p2502xe5c27cfa.p2587x5e0f67f.C20895xc4812460.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        boolean z17 = true;
        if (!(i17 == 788529167 || i17 == 788529166) && !z65.c.a()) {
            z17 = false;
        }
        return java.lang.Integer.valueOf(z17 ? 2 : 0);
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_mediagroup_sender_ui_visibility_2";
    }

    @Override // q55.d
    public java.util.List n() {
        return kz5.c0.i("关闭", "仅接收", "打开");
    }

    @Override // q55.d
    public java.util.List o() {
        java.util.List i17 = kz5.c0.i(0, 1, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(i17, 10));
        java.util.Iterator it = i17.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).intValue()));
        }
        return arrayList;
    }
}
