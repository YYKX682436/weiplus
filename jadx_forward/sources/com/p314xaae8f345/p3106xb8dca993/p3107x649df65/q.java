package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public class q {

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f297176b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p3106xb8dca993.p3107x649df65.n f297177c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3106xb8dca993.p3107x649df65.o f297178d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f297175a = false;

    /* renamed from: e, reason: collision with root package name */
    public android.content.ServiceConnection f297179e = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.r1(this);

    public q(android.content.Context context) {
        this.f297176b = context;
    }

    public void a() {
        try {
            if (!this.f297175a || this.f297179e == null || this.f297176b == null) {
                return;
            }
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.c("HSDID start to unbind did service");
            this.f297175a = false;
            this.f297176b.unbindService(this.f297179e);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.a("HSDID error:" + e17.getMessage());
        }
    }

    public void a(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.o oVar) {
        try {
            this.f297178d = oVar;
            android.content.Intent intent = new android.content.Intent("com.asus.msa.action.ACCESS_DID");
            android.content.ComponentName componentName = new android.content.ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService");
            android.content.Intent intent2 = new android.content.Intent(intent);
            intent2.setComponent(componentName);
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.c("HSDID start to bind did service");
            boolean bindService = this.f297176b.bindService(intent2, this.f297179e, (this.f297176b.getApplicationInfo().targetSdkVersion < 34 || android.os.Build.VERSION.SDK_INT < 34) ? 1 : 513);
            this.f297175a = bindService;
            if (bindService) {
                return;
            }
            this.f297178d.b();
        } catch (java.lang.Exception unused) {
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z17) {
        if (z17) {
            try {
                this.f297178d.a(this.f297177c);
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.a("HSDID notify did bind status error :" + e17.getMessage());
                return;
            }
        }
        this.f297178d.b();
    }
}
