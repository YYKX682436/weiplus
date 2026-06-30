package com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3;

@j95.b
/* loaded from: classes9.dex */
public class a extends i95.w implements vg3.f3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f230154d = new java.util.concurrent.ConcurrentHashMap();

    public boolean Ai(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.Map map) {
        vg3.a Bi = Bi(f9Var.mo78013xfb85f7b0());
        if (Bi != null) {
            return Bi.c(p0Var, f9Var, map);
        }
        return true;
    }

    public final vg3.a Bi(int i17) {
        vg3.a aVar = (vg3.a) this.f230154d.get(java.lang.Integer.valueOf(i17));
        if (aVar != null) {
            return aVar;
        }
        for (fs.q qVar : ((fs.c) fs.g.f(vg3.a5.class)).all()) {
            if (qVar.mo210xb7045565(java.lang.Integer.valueOf(i17))) {
                return (vg3.a) qVar.get();
            }
        }
        return null;
    }

    public void wi(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.Map map) {
        vg3.a Bi = Bi(f9Var.mo78013xfb85f7b0());
        if (Bi != null) {
            Bi.b(p0Var, f9Var, map);
        }
    }
}
