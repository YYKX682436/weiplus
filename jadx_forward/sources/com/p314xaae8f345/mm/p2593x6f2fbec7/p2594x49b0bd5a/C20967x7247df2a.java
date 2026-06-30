package com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a;

/* renamed from: com.tencent.mm.sandbox.monitor.ExceptionMonitorMMService */
/* loaded from: classes11.dex */
public class C20967x7247df2a extends com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5 implements com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.j {

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k f273816i = null;

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public java.lang.String b() {
        return "MicroMsg.ExceptionMonitorMMService";
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public android.os.IBinder c(android.content.Intent intent) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public void d() {
        super.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitorMMService", "onCreate()");
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k kVar = new com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k(2);
        this.f273816i = kVar;
        kVar.b(this);
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public void e() {
        super.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitorMMService", "onDestroy()");
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k kVar = this.f273816i;
        if (kVar != null) {
            q65.d.b(kVar.hashCode(), kVar);
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k.f273826b.mo50300x3fa464aa(com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k.f273827c);
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k.f273828d = false;
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k.f273825a = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitor", "onDestroy");
            this.f273816i = null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public void f(android.content.Intent intent, int i17) {
        super.f(intent, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitorMMService", "onStart()");
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k kVar = this.f273816i;
        if (kVar == null || kVar == null) {
            return;
        }
        kVar.a(intent);
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public int g(android.content.Intent intent, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitorMMService", "onStartCommand()");
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k kVar = this.f273816i;
        if (kVar == null || kVar == null) {
            return 1;
        }
        kVar.a(intent);
        return 1;
    }
}
