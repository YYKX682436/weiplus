package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29;

/* loaded from: classes5.dex */
public class c implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f256900o = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a + "voice_temp.silk";

    /* renamed from: d, reason: collision with root package name */
    public final z21.v f256901d;

    /* renamed from: e, reason: collision with root package name */
    public z21.j0 f256902e;

    /* renamed from: f, reason: collision with root package name */
    public final e70.a0 f256903f;

    /* renamed from: g, reason: collision with root package name */
    public final int f256904g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f256905h;

    /* renamed from: i, reason: collision with root package name */
    public final z21.a0 f256906i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f256907m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f256908n;

    public c(z21.a0 a0Var, int i17, z21.v vVar) {
        this.f256903f = null;
        this.f256904g = 0;
        this.f256905h = "";
        this.f256907m = false;
        this.f256908n = false;
        this.f256906i = a0Var;
        this.f256901d = vVar;
    }

    public void a(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceInputAddr2", "continuable: %s, cancel fromUI = %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        c(z17, z18);
    }

    public void b() {
        if (this.f256908n) {
            z21.j0 j0Var = this.f256902e;
            if (j0Var == null || !j0Var.e()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.b(this, 13, 131, -1));
            } else {
                this.f256902e.k();
            }
        }
    }

    public final void c(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceInputAddr2", "reset continuable = %s, sendLastScene = %s.", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (z17) {
            this.f256908n = true;
            return;
        }
        this.f256908n = false;
        z21.j0 j0Var = this.f256902e;
        if (j0Var != null) {
            j0Var.f551166p = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceInputAddr2", "reset call stop, sendLastScene: %s.", java.lang.Boolean.valueOf(z18));
            if (z18) {
                this.f256902e.c();
            }
        }
        this.f256902e = null;
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceInputAddr2", "start trans, time: %s.", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        z21.j0 j0Var = new z21.j0(null, this.f256901d, f256900o, this.f256906i, this.f256903f, 20, this.f256904g);
        this.f256902e = j0Var;
        j0Var.f551172v = java.lang.System.currentTimeMillis();
        java.lang.String str = this.f256905h;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.i4(str)) {
            this.f256902e.f551174x = str;
        }
        if (this.f256902e.e()) {
            this.f256902e.k();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.b(this, 13, 131, -1));
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        z21.a aVar = (z21.a) m1Var;
        aVar.J();
        aVar.K();
        aVar.L();
        java.lang.System.currentTimeMillis();
        m1Var.hashCode();
    }

    public c(z21.a0 a0Var, int i17, int i18, java.lang.String str, e70.a0 a0Var2, z21.v vVar) {
        this.f256903f = null;
        this.f256904g = 0;
        this.f256905h = "";
        this.f256907m = false;
        this.f256908n = false;
        this.f256906i = a0Var;
        this.f256904g = i18;
        this.f256905h = str;
        this.f256903f = a0Var2;
        this.f256901d = vVar;
    }
}
