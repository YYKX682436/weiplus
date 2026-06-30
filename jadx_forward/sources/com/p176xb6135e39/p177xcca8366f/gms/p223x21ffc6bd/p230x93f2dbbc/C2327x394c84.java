package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzjn */
/* loaded from: classes16.dex */
public final class C2327x394c84 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2330x394c87 {

    /* renamed from: _hellAccFlag_ */
    private byte f6981x7f11beae;

    /* renamed from: zzapy */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2196x394be8 f6982x6f022ea;

    /* renamed from: zzyi */
    private final android.app.AlarmManager f6983x394e50;

    /* renamed from: zzyj */
    private java.lang.Integer f6984x394e51;

    public C2327x394c84(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88 c2331x394c88) {
        super(c2331x394c88);
        this.f6983x394e50 = (android.app.AlarmManager) mo18960x76847179().getSystemService("alarm");
        this.f6982x6f022ea = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2328x394c85(this, c2331x394c88.m19275x394cb5(), c2331x394c88);
    }

    /* renamed from: getJobId */
    private final int m19252x74a75002() {
        if (this.f6984x394e51 == null) {
            java.lang.String valueOf = java.lang.String.valueOf(mo18960x76847179().getPackageName());
            this.f6984x394e51 = java.lang.Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new java.lang.String("measurement")).hashCode());
        }
        return this.f6984x394e51.intValue();
    }

    /* renamed from: zzek */
    private final android.app.PendingIntent m19253x394be6() {
        android.content.Intent className = new android.content.Intent().setClassName(mo18960x76847179(), "com.google.android.gms.measurement.AppMeasurementReceiver");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        return android.app.PendingIntent.getBroadcast(mo18960x76847179(), 0, className, 0);
    }

    /* renamed from: zzkl */
    private final void m19254x394ca1() {
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) mo18960x76847179().getSystemService("jobscheduler");
        mo18976x394c1e().m19115x394c6b().zzg("Cancelling job. JobID", java.lang.Integer.valueOf(m19252x74a75002()));
        jobScheduler.cancel(m19252x74a75002());
    }

    /* renamed from: cancel */
    public final void m19255xae7a2e7a() {
        m19257x394ba5();
        android.app.AlarmManager alarmManager = this.f6983x394e50;
        android.app.PendingIntent m19253x394be6 = m19253x394be6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(m19253x394be6);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(alarmManager, arrayList.toArray(), "com/google/android/gms/internal/measurement/zzjn", "cancel", "()V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        alarmManager.cancel((android.app.PendingIntent) arrayList.get(0));
        yj0.a.f(alarmManager, "com/google/android/gms/internal/measurement/zzjn", "cancel", "()V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        this.f6982x6f022ea.m19067xae7a2e7a();
        m19254x394ca1();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: getContext */
    public final /* bridge */ /* synthetic */ android.content.Context mo18960x76847179() {
        return super.mo18960x76847179();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzab */
    public final /* bridge */ /* synthetic */ void mo18961x394b61() {
        super.mo18961x394b61();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzbt */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.InterfaceC1991x3e2ebee mo18962x394b92() {
        return super.mo18962x394b92();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfr */
    public final /* bridge */ /* synthetic */ void mo18963x394c0c() {
        super.mo18963x394c0c();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfs */
    public final /* bridge */ /* synthetic */ void mo18964x394c0d() {
        super.mo18964x394c0d();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzft */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2178x394bd1 mo18965x394c0e() {
        return super.mo18965x394c0e();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfu */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 mo18966x394c0f() {
        return super.mo18966x394c0f();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfv */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2211x394bfc mo18967x394c10() {
        return super.mo18967x394c10();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfw */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2198x394bea mo18968x394c11() {
        return super.mo18968x394c11();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfx */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 mo18969x394c12() {
        return super.mo18969x394c12();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfy */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2293x394c5d mo18970x394c13() {
        return super.mo18970x394c13();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfz */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2212x394bfd mo18971x394c14() {
        return super.mo18971x394c14();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzga */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2214x394bff mo18972x394c1a() {
        return super.mo18972x394c1a();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgb */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96 mo18973x394c1b() {
        return super.mo18973x394c1b();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgc */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2321x394c7e mo18974x394c1c() {
        return super.mo18974x394c1c();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzgd */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20 mo18975x394c1d() {
        return super.mo18975x394c1d();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzge */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 mo18976x394c1e() {
        return super.mo18976x394c1e();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgf */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2227x394c0c mo18977x394c1f() {
        return super.mo18977x394c1f();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgg */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2189x394be1 mo18978x394c20() {
        return super.mo18978x394c20();
    }

    public final void zzh(long j17) {
        m19257x394ba5();
        if (!com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2237x394c1b.zza(mo18960x76847179())) {
            mo18976x394c1e().m19114x394c6a().log("Receiver not registered/enabled");
        }
        if (!com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2316x394c79.zza(mo18960x76847179(), false)) {
            mo18976x394c1e().m19114x394c6a().log("Service not registered/enabled");
        }
        m19255xae7a2e7a();
        mo18962x394b92().mo18537x79952707();
        if (j17 < java.lang.Math.max(0L, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6563x6f021df.get().longValue()) && !this.f6982x6f022ea.m19068x394be1()) {
            mo18976x394c1e().m19115x394c6b().log("Scheduling upload with DelayedRunnable");
            this.f6982x6f022ea.zzh(j17);
        }
        mo18976x394c1e().m19115x394c6b().log("Scheduling upload with JobScheduler");
        android.content.ComponentName componentName = new android.content.ComponentName(mo18960x76847179(), "com.google.android.gms.measurement.AppMeasurementJobService");
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) mo18960x76847179().getSystemService("jobscheduler");
        android.app.job.JobInfo.Builder builder = new android.app.job.JobInfo.Builder(m19252x74a75002(), componentName);
        builder.setMinimumLatency(j17);
        builder.setOverrideDeadline(j17 << 1);
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        builder.setExtras(persistableBundle);
        android.app.job.JobInfo build = builder.build();
        mo18976x394c1e().m19115x394c6b().zzg("Scheduling job. JobID", java.lang.Integer.valueOf(m19252x74a75002()));
        jobScheduler.schedule(build);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2330x394c87
    /* renamed from: zzhf */
    public final boolean mo19018x394c3e() {
        android.app.AlarmManager alarmManager = this.f6983x394e50;
        android.app.PendingIntent m19253x394be6 = m19253x394be6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(m19253x394be6);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(alarmManager, arrayList.toArray(), "com/google/android/gms/internal/measurement/zzjn", "zzhf", "()Z", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        alarmManager.cancel((android.app.PendingIntent) arrayList.get(0));
        yj0.a.f(alarmManager, "com/google/android/gms/internal/measurement/zzjn", "zzhf", "()Z", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        m19254x394ca1();
        return false;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2329x394c86
    /* renamed from: zziw */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2185x394bdd mo19118x394c6e() {
        return super.mo19118x394c6e();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2329x394c86
    /* renamed from: zzix */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4 mo19119x394c6f() {
        return super.mo19119x394c6f();
    }
}
