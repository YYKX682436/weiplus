package com.p314xaae8f345.p542x3306d5.p544x5897a51;

/* renamed from: com.tencent.mars.alarm.AlarmManager */
/* loaded from: classes12.dex */
public class C4439x2ac5743c extends com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c {

    /* renamed from: nativeHandle */
    protected long f17594x7b5cfd1f = 0;

    /* renamed from: callbackHandle */
    protected long f17593x429972cd = 0;

    /* renamed from: com.tencent.mars.alarm.AlarmManager$CallBack */
    /* loaded from: classes12.dex */
    public interface CallBack {
        /* renamed from: startAlarm */
        boolean m37592xa091330f(int i17, int i18, int i19);

        /* renamed from: stopAlarm */
        boolean m37593x5f7f336f(int i17);
    }

    public C4439x2ac5743c(long j17) {
        m37587x186c2010(j17);
    }

    /* renamed from: OnJniCreateAlarmManagerFromContext */
    public native void m37586x483c0c7(java.lang.Object obj);

    /* renamed from: OnJniCreateAlarmManagerFromHandle */
    public native void m37587x186c2010(long j17);

    /* renamed from: OnJniDestroyAlarmManager */
    public native void m37588x6e580230();

    /* renamed from: OnJniSetCallback */
    public native void m37589xf6496dc1(java.lang.Object obj);

    @Override // com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c
    /* renamed from: getNativeHandle */
    public long mo37556xdc4f8f95() {
        return this.f17594x7b5cfd1f;
    }

    /* renamed from: onDestroy */
    public void m37590xac79a11b() {
        m37588x6e580230();
        this.f17594x7b5cfd1f = 0L;
        this.f17593x429972cd = 0L;
    }

    /* renamed from: setCallback */
    public void m37591x6c4ebec7(com.p314xaae8f345.p542x3306d5.p544x5897a51.C4439x2ac5743c.CallBack callBack) {
        m37589xf6496dc1(callBack);
    }

    public C4439x2ac5743c(com.p314xaae8f345.p542x3306d5.app.C4443x9befcd8f c4443x9befcd8f) {
        m37586x483c0c7(c4443x9befcd8f);
    }
}
