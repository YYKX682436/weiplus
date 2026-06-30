package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FavFragment;", "Lcom/tencent/mm/plugin/finder/ui/SettingFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FavFragment */
/* loaded from: classes.dex */
public final class C15006x3f652e6b extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractC15091x20e3bca0 {
    public C15006x3f652e6b() {
        super("    收藏   ", 2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractC15091x20e3bca0
    public java.util.ArrayList z0() {
        java.lang.Object obj;
        java.util.Set stringSet = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("finder_debug_settings_fav").getStringSet("fav_1", kz5.r0.f395535d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringSet);
        java.util.HashSet hashSet = new java.util.HashSet(stringSet);
        java.util.List y07 = y0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : kz5.n0.D0(hashSet)) {
            java.util.Iterator it = y07.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((lb2.j) obj).f399282d, str)) {
                    break;
                }
            }
            lb2.j jVar = (lb2.j) obj;
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }
}
