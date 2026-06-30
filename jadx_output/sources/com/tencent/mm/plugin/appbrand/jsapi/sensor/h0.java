package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes13.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.sensor.k0 f83010d;

    public h0(com.tencent.mm.plugin.appbrand.jsapi.sensor.k0 k0Var) {
        this.f83010d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean isEmpty;
        synchronized (this.f83010d.f83023a) {
            if (this.f83010d.f83023a.isEmpty()) {
                return;
            }
            com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var = (com.tencent.mm.plugin.appbrand.jsapi.n5) ((java.util.LinkedList) this.f83010d.f83023a).remove(0);
            ((java.util.LinkedList) this.f83010d.f83023a).size();
            n5Var.m();
            n5Var.k();
            synchronized (this.f83010d.f83023a) {
                isEmpty = this.f83010d.f83023a.isEmpty();
            }
            if (isEmpty) {
                return;
            }
            ik1.h0.a().b(this, com.tencent.mm.plugin.appbrand.jsapi.sensor.k0.f83022d);
        }
    }
}
