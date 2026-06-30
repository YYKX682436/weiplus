package uy3;

/* loaded from: classes8.dex */
public final class m0 implements uy3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f513511a;

    /* renamed from: b, reason: collision with root package name */
    public final uy3.v f513512b;

    /* renamed from: c, reason: collision with root package name */
    public long f513513c;

    /* renamed from: d, reason: collision with root package name */
    public long f513514d;

    /* renamed from: e, reason: collision with root package name */
    public long f513515e;

    /* renamed from: f, reason: collision with root package name */
    public uy3.l0 f513516f;

    public m0(java.lang.String session, uy3.v vVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        this.f513511a = session;
        this.f513512b = vVar;
    }

    @Override // uy3.v
    public void a(android.content.DialogInterface dialogInterface, int i17) {
        uy3.v vVar = this.f513512b;
        if (vVar != null) {
            vVar.a(dialogInterface, i17);
        }
    }

    @Override // uy3.v
    /* renamed from: onCancel */
    public void mo68684x3d6f0539(android.content.DialogInterface dialogInterface) {
        uy3.v vVar = this.f513512b;
        if (vVar != null) {
            vVar.mo68684x3d6f0539(dialogInterface);
        }
    }

    @Override // uy3.v
    /* renamed from: onShow */
    public void mo68685xc39f557c(android.content.DialogInterface dialogInterface) {
        uy3.v vVar = this.f513512b;
        if (vVar != null) {
            vVar.mo68685xc39f557c(dialogInterface);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        uy3.l0 l0Var = this.f513516f;
        if (l0Var != null) {
            l0Var.f513506f = currentTimeMillis - this.f513513c;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this.f513511a;
        objArr[1] = l0Var != null ? java.lang.Long.valueOf(l0Var.f513506f) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxDialogViewListenerImpl", "onShow session: %s, cost: %s", objArr);
        uy3.l0 l0Var2 = this.f513516f;
        if (l0Var2 != null) {
            l0Var2.a();
        }
    }
}
