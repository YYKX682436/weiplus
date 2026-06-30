package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class u1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f221279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sd.b f221280e;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x1 x1Var, java.util.Map map, sd.b bVar) {
        this.f221279d = map;
        this.f221280e = bVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.C15885x920c565c c15885x920c565c = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.C15885x920c565c) obj;
        int i17 = c15885x920c565c.f221108d.getInt("errCode");
        sd.b bVar = this.f221280e;
        java.util.Map map = this.f221279d;
        if (i17 == -4) {
            bVar.b("openBusinessView:fail invalid businessType", map);
            return;
        }
        if (i17 == -3) {
            bVar.b("openBusinessView:fail cancel", map);
            return;
        }
        if (i17 == -2) {
            bVar.b("openBusinessView:fail request CGI error", map);
        } else if (i17 != 0) {
            bVar.b("openBusinessView:fail system error", map);
        } else {
            map.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, c15885x920c565c.f221108d.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099));
            bVar.b("openBusinessView:ok", map);
        }
    }
}
