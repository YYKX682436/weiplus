package jy4;

/* loaded from: classes11.dex */
public class w implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.p0 f384080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w60.k f384081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f384082f;

    public w(jy4.x xVar, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var, w60.k kVar, java.lang.String str) {
        this.f384080d = p0Var;
        this.f384081e = kVar;
        this.f384082f = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p944x882e457a.p0 p0Var = this.f384080d;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SubCoreWebWX.PushLoginMainDeviceMsgListener", "errType:%d errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            p0Var.f152259a.f459100q = null;
            return 0;
        }
        w60.k kVar = this.f384081e;
        int K = ((com.p314xaae8f345.mm.p957x53236a1b.k0) kVar).K();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((com.p314xaae8f345.mm.p957x53236a1b.k0) kVar).Q())) {
            p0Var.f152259a.f459100q = null;
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreWebWX.PushLoginMainDeviceMsgListener", "INetSceneGetA8Key ScanQrcodeExtDeviceLoginEvent");
        if (K == 24) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5970x9c4a2d5d c5970x9c4a2d5d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5970x9c4a2d5d();
            java.lang.String str2 = this.f384082f;
            am.ys ysVar = c5970x9c4a2d5d.f136268g;
            ysVar.f90008a = str2;
            ysVar.f90009b = 1;
            c5970x9c4a2d5d.e();
        }
        p0Var.f152259a.f459100q = null;
        return 0;
    }
}
