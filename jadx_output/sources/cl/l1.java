package cl;

/* loaded from: classes7.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.q1 f42682d;

    public l1(cl.q1 q1Var) {
        this.f42682d = q1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.eclipsesource.mmv8.MultiContextV8 multiContextV8 = this.f42682d.f42743a;
        if (multiContextV8 == null) {
            com.tencent.mars.xlog.Log.w("V8DebuggerHelper", "V8DebuggerHelper v8 null，multiThread problem!");
        } else {
            multiContextV8.debugDestroy();
        }
    }
}
