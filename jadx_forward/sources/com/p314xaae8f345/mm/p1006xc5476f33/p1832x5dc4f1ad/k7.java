package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

@j95.b
/* loaded from: classes7.dex */
public final class k7 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.r4 {
    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class))).bj("MagicPermissionConfig", com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.j7.f229574a);
    }

    public java.util.LinkedList wi(java.lang.String bizName, java.lang.String module) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(module, "module");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPermissionConfig", "getPerMissionBlackList biz:%s,module:%s", bizName, module);
        java.util.Locale locale = java.util.Locale.getDefault();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = bizName.toLowerCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.T9((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) c17, "MagicPermissionConfig", null, 2, null).b();
        java.lang.String str = "/" + module + '/' + lowerCase + "/blacklist.json";
        java.util.LinkedList linkedList = new java.util.LinkedList();
        ik1.b0 b0Var = new ik1.b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49307xcc440832 = b17.mo49307xcc440832("/" + module + "/blacklist.json", b0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49307xcc440832, "readFile(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
        if (mo49307xcc440832 == j1Var) {
            byte[] a17 = ik1.f.a((java.nio.ByteBuffer) b0Var.f373357a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "arrayOfByteBuffer(...)");
            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
            org.json.JSONArray jSONArray = new org.json.JSONArray(new java.lang.String(a17, UTF_8));
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String string = jSONArray.getString(i17);
                linkedList.add(string);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPermissionConfig", "global black bizName %s jsapi:%s", bizName, string);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49307xcc4408322 = b17.mo49307xcc440832(str, b0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49307xcc4408322, "readFile(...)");
        if (mo49307xcc4408322 == j1Var) {
            byte[] a18 = ik1.f.a((java.nio.ByteBuffer) b0Var.f373357a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "arrayOfByteBuffer(...)");
            java.nio.charset.Charset UTF_82 = java.nio.charset.StandardCharsets.UTF_8;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_82, "UTF_8");
            org.json.JSONArray jSONArray2 = new org.json.JSONArray(new java.lang.String(a18, UTF_82));
            int length2 = jSONArray2.length();
            for (int i18 = 0; i18 < length2; i18++) {
                java.lang.String string2 = jSONArray2.getString(i18);
                if (!linkedList.contains(string2)) {
                    linkedList.add(string2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPermissionConfig", "biz black bizName %s jsapi:%s", bizName, string2);
                }
            }
        }
        return linkedList;
    }
}
