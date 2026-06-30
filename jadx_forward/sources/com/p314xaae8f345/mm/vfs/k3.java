package com.p314xaae8f345.mm.vfs;

/* loaded from: classes8.dex */
public final class k3 implements com.p314xaae8f345.mm.vfs.w5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f294560a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f294561b;

    public k3(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        this.f294560a = id6;
        this.f294561b = true;
    }

    @Override // com.p314xaae8f345.mm.vfs.w5
    public void a(com.p314xaae8f345.mm.vfs.q2 fs6, int i17, java.util.Map p17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fs6, "fs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p");
        if (this.f294561b) {
            java.lang.Object obj = p17.get("op");
            java.lang.String str2 = (java.lang.String) com.p314xaae8f345.mm.vfs.f7.f294474b.get(obj);
            if (str2 == null) {
                str2 = java.lang.String.valueOf(obj);
            }
            java.lang.String str3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p17.get("ok"), java.lang.Boolean.TRUE) ? "ok" : com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d;
            java.lang.Object obj2 = p17.get(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            java.lang.Object obj3 = p17.get("targetFS");
            java.lang.Object obj4 = p17.get("targetPath");
            java.lang.String str4 = this.f294560a;
            if (obj3 == null) {
                str = "[" + str4 + "] (" + str2 + ") " + obj2 + " : " + str3;
            } else {
                str = "[" + str4 + "] (" + str2 + ") " + obj2 + " -> " + obj4 + '(' + obj3 + ") : " + str3;
            }
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("VFS.AccessLog", str);
        }
    }
}
