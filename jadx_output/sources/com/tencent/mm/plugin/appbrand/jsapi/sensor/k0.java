package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes13.dex */
public class k0 {

    /* renamed from: d, reason: collision with root package name */
    public static int f83022d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f83023a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.utils.k2 f83024b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Runnable f83025c;

    public k0(com.tencent.mm.plugin.appbrand.jsapi.sensor.h0 h0Var) {
        int ua6 = com.tencent.mm.plugin.appbrand.jsapi.sensor.f0.f83003e.ua();
        f83022d = ua6;
        this.f83025c = new com.tencent.mm.plugin.appbrand.jsapi.sensor.h0(this);
        this.f83024b = new com.tencent.mm.plugin.appbrand.utils.k2(ua6, new com.tencent.mm.plugin.appbrand.jsapi.sensor.i0(this));
    }

    public boolean a(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        boolean isEmpty;
        com.tencent.mm.plugin.appbrand.jsapi.sensor.f0 f0Var = com.tencent.mm.plugin.appbrand.jsapi.sensor.f0.f83003e;
        if (f0Var.W4()) {
            if (n5Var == null || lVar == null || !f0Var.sa(lVar, n5Var)) {
                return false;
            }
            n5Var.k();
            n5Var.m();
            return true;
        }
        if (n5Var == null || lVar == null || !f0Var.sa(lVar, n5Var)) {
            return false;
        }
        synchronized (this.f83023a) {
            isEmpty = this.f83023a.isEmpty();
            if (this.f83023a.isEmpty()) {
                ((java.util.LinkedList) this.f83023a).add(n5Var);
            } else if (((com.tencent.mm.plugin.appbrand.jsapi.n5) ((java.util.LinkedList) this.f83023a).get(0)).equals(n5Var)) {
                ((java.util.LinkedList) this.f83023a).add(0, n5Var);
                ((java.util.LinkedList) this.f83023a).remove(1);
            } else {
                ((java.util.LinkedList) this.f83023a).remove(n5Var);
                ((java.util.LinkedList) this.f83023a).add(n5Var);
            }
        }
        if (!isEmpty || this.f83024b.a(new java.lang.Object[0])) {
            return true;
        }
        n5Var.k();
        ik1.h0.a().b(this.f83025c, f83022d);
        return true;
    }
}
