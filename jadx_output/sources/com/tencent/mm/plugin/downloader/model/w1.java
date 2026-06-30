package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class w1 implements k02.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f97190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h02.a f97191b;

    public w1(vz.z1 z1Var, h02.a aVar) {
        this.f97190a = z1Var;
        this.f97191b = aVar;
    }

    @Override // k02.k
    public void a() {
        vz.z1 z1Var = this.f97190a;
        if (z1Var != null) {
            z1Var.a("", com.tencent.mm.plugin.downloader.model.j1.b("pause"));
        }
    }

    @Override // k02.k
    public void b() {
        vz.z1 z1Var = this.f97190a;
        if (z1Var != null) {
            com.tencent.mm.plugin.downloader.model.j1.g(this.f97191b, false, false, false, null);
            z1Var.a("", com.tencent.mm.plugin.downloader.model.j1.b("resume"));
        }
    }

    @Override // k02.k
    public void c() {
        vz.z1 z1Var = this.f97190a;
        if (z1Var != null) {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.r0 i17 = com.tencent.mm.plugin.downloader.model.r0.i();
            h02.a aVar = this.f97191b;
            i17.t(aVar.field_downloadId);
            m02.s sVar = (m02.s) i95.n0.c(m02.s.class);
            java.lang.String str = aVar.field_appId;
            ((l02.q) sVar).getClass();
            com.tencent.mm.plugin.downloader_app.model.s0.e(str);
            z1Var.a("", com.tencent.mm.plugin.downloader.model.j1.b("cancelTask"));
        }
    }

    @Override // k02.k
    public void d() {
        vz.z1 z1Var = this.f97190a;
        if (z1Var != null) {
            z1Var.a("", com.tencent.mm.plugin.downloader.model.j1.b("pause"));
        }
    }
}
