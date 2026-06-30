package p012xc85e97e9.p094xbe953013.p095x38b73479;

/* loaded from: classes13.dex */
public class g extends p012xc85e97e9.p094xbe953013.p095x38b73479.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p094xbe953013.p095x38b73479.m f93210e;

    public g(p012xc85e97e9.p094xbe953013.p095x38b73479.m mVar) {
        this.f93210e = mVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        p012xc85e97e9.p094xbe953013.p095x38b73479.m mVar = this.f93210e;
        mVar.f93225h.set(true);
        java.lang.Object obj = null;
        try {
            android.os.Process.setThreadPriority(10);
            p012xc85e97e9.p094xbe953013.p095x38b73479.a aVar = (p012xc85e97e9.p094xbe953013.p095x38b73479.a) mVar;
            try {
                obj = aVar.f93208p.m7835xe53e7838();
            } catch (j3.q e17) {
                if (!aVar.f93224g.get()) {
                    throw e17;
                }
            }
            android.os.Binder.flushPendingCommands();
            return obj;
        } finally {
        }
    }
}
