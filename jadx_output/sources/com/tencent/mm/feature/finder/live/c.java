package com.tencent.mm.feature.finder.live;

@j95.b
/* loaded from: classes10.dex */
public final class c extends i95.w implements s40.p0 {
    public void Ai(java.lang.String scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.y4 y4Var = ml2.j0.f327583i;
        y4Var.getClass();
        y4Var.f328286a = scene;
    }

    public void wi(java.lang.String str, java.lang.String str2) {
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.u1 u1Var = ml2.u1.f328094w;
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("liveId", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("feedId", str2);
        linkedHashMap.put("share_id", "");
        zy2.zb.I8(zbVar, u1Var, linkedHashMap, null, null, null, null, false, 124, null);
    }
}
