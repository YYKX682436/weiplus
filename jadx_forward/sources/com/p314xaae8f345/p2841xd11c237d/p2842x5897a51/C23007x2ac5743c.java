package com.p314xaae8f345.p2841xd11c237d.p2842x5897a51;

/* renamed from: com.tencent.paymars.alarm.AlarmManager */
/* loaded from: classes12.dex */
public class C23007x2ac5743c extends com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c {

    /* renamed from: nativeHandle */
    protected long f40075x7b5cfd1f = 0;

    /* renamed from: callbackHandle */
    protected long f40074x429972cd = 0;

    /* renamed from: com.tencent.paymars.alarm.AlarmManager$CallBack */
    /* loaded from: classes12.dex */
    public interface CallBack {
        /* renamed from: startAlarm */
        boolean m84244xa091330f(int i17, int i18, int i19);

        /* renamed from: stopAlarm */
        boolean m84245x5f7f336f(int i17);
    }

    public C23007x2ac5743c(long j17) {
        m84238x186c2010(j17);
    }

    /* renamed from: OnJniCreateAlarmManagerFromContext */
    public native void m84237x483c0c7(java.lang.Object obj);

    /* renamed from: OnJniCreateAlarmManagerFromHandle */
    public native void m84238x186c2010(long j17);

    /* renamed from: OnJniDestroyAlarmManager */
    public native void m84239x6e580230();

    /* renamed from: OnJniSetCallback */
    public native void m84240xf6496dc1(java.lang.Object obj);

    @Override // com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c
    /* renamed from: getNativeHandle */
    public long mo84241xdc4f8f95() {
        return this.f40075x7b5cfd1f;
    }

    /* renamed from: onDestroy */
    public void m84242xac79a11b() {
        m84239x6e580230();
        this.f40075x7b5cfd1f = 0L;
        this.f40074x429972cd = 0L;
    }

    /* renamed from: setCallback */
    public void m84243x6c4ebec7(com.p314xaae8f345.p2841xd11c237d.p2842x5897a51.C23007x2ac5743c.CallBack callBack) {
        m84240xf6496dc1(callBack);
    }

    public C23007x2ac5743c(com.p314xaae8f345.p2841xd11c237d.app.C23011x9befcd8f c23011x9befcd8f) {
        m84237x483c0c7(c23011x9befcd8f);
    }
}
