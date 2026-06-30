package cd0;

/* loaded from: classes5.dex */
public final class a0 implements xg3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f40520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f40521e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40522f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40523g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f40524h;

    public a0(com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2, java.lang.ref.WeakReference weakReference) {
        this.f40521e = f9Var;
        this.f40522f = str;
        this.f40523g = str2;
        this.f40524h = weakReference;
    }

    public final void a() {
        this.f40520d = true;
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).za(this);
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        com.tencent.mm.ui.widget.dialog.u3 u3Var2;
        if (m0Var == null || l0Var == null || this.f40520d) {
            return;
        }
        java.util.ArrayList<com.tencent.mm.storage.f9> msgList = l0Var.f454412c;
        kotlin.jvm.internal.o.f(msgList, "msgList");
        for (com.tencent.mm.storage.f9 f9Var : msgList) {
            com.tencent.mm.storage.f9 f9Var2 = this.f40521e;
            if (f9Var2 != null && f9Var.getMsgId() == f9Var2.getMsgId()) {
                com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(f9Var.Q0(), f9Var.getMsgId());
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reqRevoke() onNotifyChange msgId=");
                sb6.append(n17 != null ? java.lang.Long.valueOf(n17.getMsgId()) : null);
                sb6.append(" status:");
                sb6.append(n17 != null ? java.lang.Integer.valueOf(n17.P0()) : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgHandler", sb6.toString());
                if (n17 != null && n17.P0() == 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgHandler", "reqRevoke() STATE_SENT msgId=" + f9Var2.getMsgId());
                    a();
                    cd0.b0.f40525a.b(n17, this.f40522f, this.f40523g);
                    return;
                }
                if (n17 != null && n17.P0() == 5) {
                    java.lang.ref.WeakReference weakReference = cd0.b0.f40526b;
                    if (weakReference != null && (u3Var = (com.tencent.mm.ui.widget.dialog.u3) weakReference.get()) != null) {
                        u3Var.dismiss();
                    }
                    yb5.d dVar = (yb5.d) this.f40524h.get();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("reqRevoke() STATE_FAILED msgId=");
                    sb7.append(f9Var2.getMsgId());
                    sb7.append(" chattingContext is null:");
                    sb7.append(dVar == null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgHandler", sb7.toString());
                    if (dVar != null) {
                        db5.t7.i(dVar.g(), dVar.s().getString(com.tencent.mm.R.string.b5r), com.tencent.mm.R.raw.icons_filled_error);
                    }
                    a();
                    cd0.c0.f40528a.a(n17, 3);
                    return;
                }
                if ((n17 != null && n17.P0() == 0) && f9Var2.getMsgId() <= 0) {
                    java.lang.ref.WeakReference weakReference2 = cd0.b0.f40526b;
                    if (weakReference2 != null && (u3Var2 = (com.tencent.mm.ui.widget.dialog.u3) weakReference2.get()) != null) {
                        u3Var2.dismiss();
                    }
                    a();
                    com.tencent.mars.xlog.Log.e("MicroMsg.RevokeMsgHandler", "reqRevoke() STATE_UNKNOWN msgId=" + f9Var2.getMsgId());
                    return;
                }
            }
        }
    }
}
