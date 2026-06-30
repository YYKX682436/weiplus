package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class bg {
    public bg(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(org.json.JSONObject obj, java.lang.String key, java.lang.Object obj2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        try {
            obj.put(key, obj2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WASnapshotConfigProvider", e17, "put with key(" + key + ')', new java.lang.Object[0]);
        }
    }
}
