package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e;

/* loaded from: classes7.dex */
public final class j implements m31.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12183x2c92285e f163877a;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12183x2c92285e c12183x2c92285e) {
        this.f163877a = c12183x2c92285e;
    }

    public void a(android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String string = z17 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jnj) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jnk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        ul1.j jVar = this.f163877a.f163835n;
        if (jVar != null) {
            jVar.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12183x2c92285e c12183x2c92285e = this.f163877a;
        ul1.j jVar2 = new ul1.j(context, false);
        jVar2.a(string);
        jVar2.setFocusable(false);
        jVar2.b(1500L);
        c12183x2c92285e.f163835n = jVar2;
    }
}
