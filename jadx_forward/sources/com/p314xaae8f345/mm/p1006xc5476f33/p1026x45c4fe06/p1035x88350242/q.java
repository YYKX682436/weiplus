package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242;

/* loaded from: classes7.dex */
public final class q implements fb1.g {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.q f158264d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.q();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f158265e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.p.f158259d);

    @Override // fb1.g
    public void F3(fb1.d scene, boolean z17, java.lang.String token) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.o.f158248a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageDatas", "markInUse, scene: " + scene.name() + ", inUse: " + z17 + ", token: " + token);
        synchronized (oVar) {
            if (!z17) {
                java.util.HashSet hashSet = (java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.o.f158257j.get(scene);
                if (hashSet != null) {
                    hashSet.remove(token);
                }
            } else {
                java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.o.f158257j;
                java.lang.Object obj = hashMap.get(scene);
                if (obj == null) {
                    obj = new java.util.HashSet();
                    hashMap.put(scene, obj);
                }
                ((java.util.HashSet) obj).add(token);
            }
        }
    }

    @Override // fb1.g
    public boolean R() {
        return true;
    }

    @Override // fb1.g
    public fb1.c ec(fb1.d scene, boolean z17, fb1.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.v vVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.v) ((java.util.Map) ((jz5.n) f158265e).mo141623x754a37bb()).get(scene);
        return vVar != null ? vVar.ec(scene, z17, hVar) : fb1.b.f342361a;
    }
}
