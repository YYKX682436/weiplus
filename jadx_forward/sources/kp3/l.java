package kp3;

/* loaded from: classes14.dex */
public final class l implements ju3.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kp3.x f392539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17013x966ea0d1 f392540b;

    public l(kp3.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17013x966ea0d1 c17013x966ea0d1) {
        this.f392539a = xVar;
        this.f392540b = c17013x966ea0d1;
    }

    @Override // ju3.y
    public void a(byte[] data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        kp3.x xVar = this.f392539a;
        if (xVar.f392588n.get() || xVar.f392587m.get() || xVar.f392586i.get() || xVar.f392583f == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new kp3.r(xVar, data), "PalmPrintProcess");
    }

    @Override // ju3.y
    public void b(android.util.Size previewSize) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewSize, "previewSize");
        kp3.x xVar = this.f392539a;
        xVar.f392585h = previewSize;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[onFirstFrameReady], previewSize:" + previewSize + ", MIN_PREVIEW_SIZE_HEIGHT:800");
        if (previewSize.getHeight() <= 0 || previewSize.getWidth() <= 0) {
            xVar.f392588n.set(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17013x966ea0d1 c17013x966ea0d1 = xVar.f392584g;
            if (c17013x966ea0d1 != null) {
                c17013x966ea0d1.f();
            }
            jp3.g.f382533a.i(xVar.m158354x19263085(), 80002, "ERR_PALM_INIT_CAMERA", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            return;
        }
        if (previewSize.getHeight() >= 800) {
            xVar.f392588n.set(false);
            xVar.Q6(1);
            return;
        }
        xVar.f392588n.set(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17013x966ea0d1 c17013x966ea0d12 = xVar.f392584g;
        if (c17013x966ea0d12 != null) {
            c17013x966ea0d12.f();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17013x966ea0d1 c17013x966ea0d13 = this.f392540b;
        android.content.Context context = c17013x966ea0d13.getContext();
        java.lang.String r17 = i65.a.r(c17013x966ea0d13.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.m4b);
        kp3.k kVar = new kp3.k(xVar);
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintHelper", "[showAlert] error, context is null! errMsg:" + r17);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.a(false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r17)) {
            r17 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571924to);
        }
        u1Var.g(r17);
        u1Var.l(new jp3.f(kVar));
        u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
        u1Var.q(false);
    }
}
