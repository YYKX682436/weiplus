package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public abstract class a {
    public static final void a() {
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94438d.a();
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94439e.a();
        ts1.p.f421613b.a();
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94446b.a();
        com.tencent.mm.vfs.w6.g(nu4.b0.P.u(), true);
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94447c.a();
        com.tencent.mm.vfs.w6.g(nu4.b0.Q.u(), true);
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94448d.a();
        com.tencent.mm.vfs.w6.g(nu4.b0.R.u(), true);
        nu4.b0 f17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.f94371a.f();
        synchronized (f17.H) {
            java.util.HashMap hashMap = f17.H;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(hashMap.size()));
            for (java.lang.Object obj : hashMap.entrySet()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                f17.x0(((java.lang.Number) entry.getValue()).intValue()).destroy();
                linkedHashMap.put(jz5.f0.f302826a, ((java.util.Map.Entry) obj).getValue());
            }
            f17.H.clear();
        }
        f17.I.clear();
        com.tencent.mm.vfs.w6.g(nu4.b0.S.u(), true);
        yq1.z.f464496g.a();
        yq1.z.f464497h.a();
        yq1.z.f464498i.a();
        ys1.f.f465142b.a();
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.g().d();
        ((com.tencent.mm.sdk.platformtools.v3) ((jz5.n) ku4.b.C).getValue()).a();
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.f94207c.clear();
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.f94205a.clear();
        ku4.z.f312539a.f().d();
        java.util.Iterator it = ((java.util.List) ((jz5.n) ku4.z.f312546h).getValue()).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.service.n6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.n6.class)).e6((java.lang.String) it.next(), 0);
        }
        zs1.c.f475233a.d().d();
        ts1.u.f421618a.a();
    }
}
