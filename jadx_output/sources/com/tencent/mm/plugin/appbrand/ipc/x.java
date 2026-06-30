package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes7.dex */
public final class x implements com.tencent.mm.ipcinvoker.r, im5.a {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f78441d;

    /* renamed from: e, reason: collision with root package name */
    public im5.b f78442e;

    public x(yz5.a block, im5.b bVar) {
        kotlin.jvm.internal.o.g(block, "block");
        this.f78441d = block;
        this.f78442e = bVar;
        if (bVar != null) {
            bVar.keep(this);
        }
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        yz5.a aVar = this.f78441d;
        if (aVar != null) {
            aVar.invoke();
        }
        dead();
    }

    @Override // im5.a
    public void dead() {
        this.f78441d = null;
        im5.b bVar = this.f78442e;
        com.tencent.mm.plugin.appbrand.utils.n2 n2Var = bVar instanceof com.tencent.mm.plugin.appbrand.utils.n2 ? (com.tencent.mm.plugin.appbrand.utils.n2) bVar : null;
        if (n2Var != null) {
            n2Var.n2(this);
        }
        this.f78442e = null;
    }
}
