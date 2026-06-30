package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6;

/* loaded from: classes7.dex */
public class w0 implements nh1.b {
    @Override // nh1.b
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var).mo32091x9a3f0ba2();
        if (mo32091x9a3f0ba2 == null || mo32091x9a3f0ba2.C0() == null) {
            return;
        }
        if (com.p159x477cd522.p160x333422.V8.m16079x8fcbeb09()) {
            mo32091x9a3f0ba2.C0().getF229341e().mo14660x738236e6("(function(){if(!stopV8Tracing)return false;return stopV8Tracing();})()", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.v0(this, context));
            java.util.List d17 = d(mo32091x9a3f0ba2);
            if (d17 != null) {
                java.util.Iterator it = ((java.util.ArrayList) d17).iterator();
                while (it.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0) it.next()).mo14660x738236e6("(function(){if(!stopV8Tracing)return false;return stopV8Tracing();})()", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.v0(this, context));
                }
                return;
            }
            return;
        }
        mo32091x9a3f0ba2.C0().getF229341e().mo14660x738236e6("(function(){if(!startV8Tracing)return false;return startV8Tracing();})()", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.t0(this, context));
        java.util.List d18 = d(mo32091x9a3f0ba2);
        if (d18 != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) d18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.V8Tracing", "hy: trigger worker v8 tracing: %d", java.lang.Integer.valueOf(arrayList.size()));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0) it6.next()).mo14660x738236e6("(function(){if(!startV8Tracing)return false;return startV8Tracing();})()", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.t0(this, context));
            }
        }
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        return com.p159x477cd522.p160x333422.V8.m16079x8fcbeb09() ? "Stop V8 Tracing" : "Start V8 Tracing";
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(str).f167255o;
    }

    public final java.util.List d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        if (c11510xdd90c2f2.C0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.V8Tracing", "hy: service released. abort walking through workers");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9 c17 = c11510xdd90c2f2.C0().c1();
        if (c17 != null) {
            return c17.d();
        }
        return null;
    }
}
