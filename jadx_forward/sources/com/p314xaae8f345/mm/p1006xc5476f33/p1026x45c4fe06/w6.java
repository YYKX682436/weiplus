package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class w6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3 {

    /* renamed from: b, reason: collision with root package name */
    public final u65.a f172481b = new u65.a(2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x6(this));

    /* renamed from: c, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t1 f172482c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f172483d;

    public w6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f172483d = o6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3
    public void a() {
        if (this.f172482c != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w1) this.f172482c).a();
        }
        this.f172481b.a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3
    public java.lang.String b() {
        return "installFileSystem";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3
    public void c() {
        this.f172482c = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.d2.a(this.f172483d, new yz5.l() { // from class: com.tencent.mm.plugin.appbrand.w6$$a
            @Override // yz5.l
            /* renamed from: invoke */
            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w6.this.f172481b.b();
                return jz5.f0.f384359a;
            }
        });
        this.f172483d.o(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.w6$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w6 w6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w6.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = w6Var.f172483d;
                java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = o6Var.E;
                boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.f167695n3;
                concurrentLinkedDeque.add(o6Var.C2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.h.class));
                w6Var.f172481b.b();
            }
        });
    }
}
