package com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2255xac8f1cfd;

/* renamed from: com.tencent.mm.plugin.talkroom.component.TalkRoomService */
/* loaded from: classes7.dex */
public class ServiceC18547xe2b108ee extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public ah4.y f253980d;

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomService", "" + java.lang.Thread.currentThread().getId());
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        java.util.Objects.toString(java.lang.Thread.currentThread());
        return this.f253980d;
    }

    @Override // android.app.Service
    public void onCreate() {
        java.util.Objects.toString(java.lang.Thread.currentThread());
        super.onCreate();
        if (this.f253980d == null) {
            this.f253980d = new ah4.y();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        java.util.Objects.toString(java.lang.Thread.currentThread());
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        java.util.Objects.toString(java.lang.Thread.currentThread());
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        java.util.Objects.toString(java.lang.Thread.currentThread());
        return super.onUnbind(intent);
    }
}
