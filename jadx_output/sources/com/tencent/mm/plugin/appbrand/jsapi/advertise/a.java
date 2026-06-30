package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes7.dex */
public final class a extends be1.z {
    @Override // be1.z
    public java.util.Map D() {
        java.util.HashMap hashMap = new java.util.HashMap();
        int Bi = ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Bi();
        hashMap.put("isFreeSimCard", java.lang.Boolean.valueOf(Bi == 3 || Bi == 4 || Bi == 5));
        return hashMap;
    }
}
