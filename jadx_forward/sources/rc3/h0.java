package rc3;

/* loaded from: classes7.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475535e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(rc3.w0 w0Var, int i17) {
        super(0);
        this.f475534d = w0Var;
        this.f475535e = i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [jz5.f0, java.lang.Object] */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        hq0.k0 k0Var;
        hq0.j0 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = this.f475534d.f475624i;
        jc3.r rVar = c16416x87606a7b != null ? c16416x87606a7b.f229362s : null;
        ?? r37 = jz5.f0.f384359a;
        int i17 = this.f475535e;
        if (rVar != null) {
            jc3.s sVar = rVar instanceof jc3.s ? (jc3.s) rVar : null;
            if (sVar != null) {
                dq0.a0 a0Var = (dq0.a0) sVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onCanvasViewSurfaceAvailable id[" + i17 + ']');
                hq0.i0 t17 = a0Var.t();
                if (t17 != null && (k0Var = t17.f364531m) != null && (a17 = k0Var.a(i17)) != null) {
                    a17.f364557m = true;
                    if (a17.f364556l) {
                        hq0.i0 t18 = a0Var.t();
                        fq0.x S0 = t18 != null ? t18.S0(i17) : null;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "firstFrame before available, redraw " + i17 + ' ' + S0);
                        if (S0 != null) {
                            S0.f();
                            r1 = r37;
                        }
                        if (r1 == null) {
                            a17.f364554j = true;
                        }
                    }
                    r1 = r37;
                }
                if (r1 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onCanvasViewSurfaceAvailable but canvas not found? " + i17);
                }
            }
        } else {
            java.lang.Object obj = c16416x87606a7b != null ? c16416x87606a7b.f229361r : null;
            r1 = obj instanceof jc3.h0 ? (jc3.h0) obj : null;
            if (r1 != null) {
                r1.v9(i17);
            }
        }
        return r37;
    }
}
