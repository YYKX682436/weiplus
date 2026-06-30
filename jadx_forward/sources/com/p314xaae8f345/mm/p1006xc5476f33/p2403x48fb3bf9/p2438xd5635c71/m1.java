package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71;

/* loaded from: classes8.dex */
public final class m1 implements nw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.r1 f269395a;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.r1 r1Var) {
        this.f269395a = r1Var;
    }

    @Override // nw4.e
    public final void e(java.lang.String str, java.lang.String str2, java.util.Map map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        hashMap.put("err_msg", str2);
        if (map != null) {
            hashMap.putAll(map);
        }
        java.lang.String a17 = nw4.x2.a(str, hashMap, false, "");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WeixinWebCompt._callback(");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.a.c(str));
        sb6.append(", ");
        sb6.append(a17);
        sb6.append("['__params'])");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.r1.a(this.f269395a, sb6.toString());
    }
}
