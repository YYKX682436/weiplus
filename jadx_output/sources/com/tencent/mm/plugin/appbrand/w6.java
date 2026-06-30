package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class w6 extends com.tencent.mm.plugin.appbrand.g3 {

    /* renamed from: b, reason: collision with root package name */
    public final u65.a f90948b = new u65.a(2, new com.tencent.mm.plugin.appbrand.x6(this));

    /* renamed from: c, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.launching.t1 f90949c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f90950d;

    public w6(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f90950d = o6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public void a() {
        if (this.f90949c != null) {
            ((com.tencent.mm.plugin.appbrand.launching.w1) this.f90949c).a();
        }
        this.f90948b.a();
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public java.lang.String b() {
        return "installFileSystem";
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public void c() {
        this.f90949c = com.tencent.mm.plugin.appbrand.launching.d2.a(this.f90950d, new yz5.l() { // from class: com.tencent.mm.plugin.appbrand.w6$$a
            @Override // yz5.l
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.tencent.mm.plugin.appbrand.w6.this.f90948b.b();
                return jz5.f0.f302826a;
            }
        });
        this.f90950d.o(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.w6$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.w6 w6Var = com.tencent.mm.plugin.appbrand.w6.this;
                com.tencent.mm.plugin.appbrand.o6 o6Var = w6Var.f90950d;
                java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = o6Var.E;
                boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                concurrentLinkedDeque.add(o6Var.C2(com.tencent.mm.plugin.appbrand.jsapi.file.h.class));
                w6Var.f90948b.b();
            }
        });
    }
}
