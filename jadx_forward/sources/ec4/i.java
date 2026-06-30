package ec4;

/* loaded from: classes4.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec4.j f332692d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ec4.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f332692d = jVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        ec4.i iVar = new ec4.i(this.f332692d, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        return iVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        ec4.i iVar = (ec4.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        iVar.mo150x989b7ca4(f0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ec4.j jVar = this.f332692d;
        int parseInt = java.lang.Integer.parseInt(r26.i0.v(ec4.j.a(jVar), "Locall_path", "", false, 4, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMag.BackgroundVideoFinishUploader", "clearFakeVideo: " + ec4.j.a(jVar) + ", " + parseInt);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2 Hj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj();
        java.lang.String X = ca4.z0.X(ec4.j.a(jVar));
        java.lang.String b07 = ca4.z0.b0(ec4.j.a(jVar));
        java.lang.String c07 = ca4.z0.c0(ec4.j.a(jVar));
        java.lang.String Z = ca4.z0.Z(ec4.j.a(jVar));
        java.lang.String u17 = Hj.u1(ec4.j.a(jVar));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "getMediaPath(...)");
        com.p314xaae8f345.mm.vfs.w6.h(u17 + X);
        com.p314xaae8f345.mm.vfs.w6.h(u17 + b07);
        com.p314xaae8f345.mm.vfs.w6.h(u17 + c07);
        com.p314xaae8f345.mm.vfs.w6.h(u17 + Z);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMag.BackgroundVideoFinishUploader", "clearFakeVideo >> cntPath: " + u17 + ", newMediaName: " + X + ", newThumbMediaName: " + b07 + ", newGridMediaName: " + c07 + ", newSightMediaName: " + Z);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteByLocalMediaId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append((long) parseInt);
        Hj.f247598d.mo70514xb06685ab("SnsMedia", "local_id=?", new java.lang.String[]{sb6.toString()});
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteByLocalMediaId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        return f0Var;
    }
}
