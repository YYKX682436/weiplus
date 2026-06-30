package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class f2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f98887d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f98888e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f98889f;

    /* renamed from: g, reason: collision with root package name */
    public final long f98890g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f98891h;

    /* renamed from: i, reason: collision with root package name */
    public final long f98892i;

    public f2(long j17, java.lang.String str, java.lang.String str2, long j18) {
        this.f98890g = j17;
        this.f98891h = str;
        this.f98889f = str2;
        this.f98892i = j18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f98887d = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ki();
        lVar.f70665b = new r45.li();
        lVar.f70666c = "/cgi-bin/mmoc-bin/hardware/bindunauthdevice";
        lVar.f70667d = 1262;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f98888e = a17;
        r45.ki kiVar = (r45.ki) a17.f70710a.f70684a;
        kiVar.f378707f = a42.i.g(this.f98890g);
        kiVar.f378706e = this.f98891h;
        kiVar.f378705d = this.f98889f;
        kiVar.f378708g = this.f98892i;
        return dispatch(sVar, this.f98888e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1262;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.String str2;
        java.lang.String str3;
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindUnauthDevice", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + str);
        if (i18 == 0 && i19 == 0) {
            r45.li liVar = (r45.li) this.f98888e.f70711b.f70700a;
            r45.nv3 nv3Var = liVar.f379496d;
            if (nv3Var != null) {
                str2 = nv3Var.f381692e;
                str3 = nv3Var.f381691d;
            } else {
                str2 = null;
                str3 = null;
            }
            if (com.tencent.mm.plugin.exdevice.model.l3.Ui().d1(str3, str2) != null) {
                z17 = com.tencent.mm.plugin.exdevice.model.l3.Ui().y0(str2, str3);
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindUnauthDevice", "delete local deviceinfo : %s, ret : %b", str3, java.lang.Boolean.valueOf(z17));
            } else {
                z17 = true;
            }
            v32.b bVar = new v32.b();
            bVar.field_connProto = this.f98889f;
            bVar.field_connStrategy = 1;
            bVar.field_closeStrategy = 1;
            bVar.field_url = "";
            com.tencent.mm.plugin.exdevice.model.q0.a(bVar, nv3Var, liVar.f379497e);
            if (bVar.field_mac == 0) {
                bVar.field_mac = this.f98890g;
            }
            if (z17) {
                com.tencent.mm.plugin.exdevice.model.l3.Ui().insert(bVar);
            } else {
                com.tencent.mm.plugin.exdevice.model.l3.Ui().i1(bVar);
            }
        }
        this.f98887d.onSceneEnd(i18, i19, str, this);
    }
}
