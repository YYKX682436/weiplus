package sb3;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f486964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f486965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sb3.c f486966f;

    public a(sb3.c cVar, java.util.Set set, java.lang.ref.WeakReference weakReference) {
        this.f486966f = cVar;
        this.f486964d = set;
        this.f486965e = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            for (java.lang.String str : this.f486964d) {
                if (this.f486965e.get() == null || this.f486966f.f486971d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AsyncSoundPool", "context = null or soundPool is stopped");
                    this.f486966f.f486968a.release();
                    this.f486966f.f486969b.clear();
                    ((java.util.HashMap) this.f486966f.f486970c).clear();
                    return;
                }
                android.content.res.AssetFileDescriptor openFd = ((android.content.Context) this.f486965e.get()).getResources().getAssets().openFd(str);
                sb3.c cVar = this.f486966f;
                cVar.f486969b.put(str, java.lang.Integer.valueOf(cVar.f486968a.load(openFd, 0)));
                openFd.close();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AsyncSoundPool", "load sound file error:" + e17.getMessage());
        }
    }
}
