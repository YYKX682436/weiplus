package fn4;

/* loaded from: classes11.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f346127d;

    public o0(fn4.r0 r0Var, java.lang.String str) {
        this.f346127d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = this.f346127d;
        com.p314xaae8f345.mm.vfs.w6.f(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryPreloadMgr", "DeleteVideoFolderTask %s %d", str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
