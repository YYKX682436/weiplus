package dh4;

/* loaded from: classes13.dex */
public class x implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh4.f0 f314148d;

    public x(dh4.f0 f0Var) {
        this.f314148d = f0Var;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomServer", "onServiceConnected ");
        dh4.f0 f0Var = this.f314148d;
        if (iBinder == null) {
            f0Var.f314062x.b("enterTalkRoom bindServie or protocalInit failed", 3, -1);
            return;
        }
        int i17 = ah4.b.f86531d;
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
        f0Var.f314056r = (queryLocalInterface == null || !(queryLocalInterface instanceof ah4.c)) ? new ah4.a(iBinder) : (ah4.c) queryLocalInterface;
        if (f0Var.f314047f >= 2) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new dh4.w(this));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomServer", "onServiceDisconnected ");
    }
}
