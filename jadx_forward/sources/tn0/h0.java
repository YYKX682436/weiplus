package tn0;

/* loaded from: classes10.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f502209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f502210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f502211f;

    public h0(tn0.w0 w0Var, android.graphics.SurfaceTexture surfaceTexture, java.lang.String str) {
        this.f502209d = w0Var;
        this.f502210e = surfaceTexture;
        this.f502211f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tn0.w0 w0Var = this.f502209d;
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = w0Var.X;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100970x42c875eb(new android.view.Surface(this.f502210e));
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = w0Var.X;
        if (interfaceC26164x73fc6bc62 != null) {
            interfaceC26164x73fc6bc62.mo100932x857611b5();
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc63 = w0Var.X;
        if (interfaceC26164x73fc6bc63 != null) {
            interfaceC26164x73fc6bc63.mo100957x5dd7c812(new tn0.g0(w0Var, this.f502211f));
        }
    }
}
