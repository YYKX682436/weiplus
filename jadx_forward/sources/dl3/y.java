package dl3;

/* loaded from: classes13.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl3.a0 f316884d;

    public y(dl3.a0 a0Var) {
        this.f316884d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        this.f316884d.f316806e.getClass();
        if (gl3.e.d()) {
            ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
            z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1906x5a0af82.ipc.n.i();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
            z17 = false;
        }
        if (z17) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h3v), 0).show();
        }
    }
}
