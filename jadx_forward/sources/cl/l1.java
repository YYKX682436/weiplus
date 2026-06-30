package cl;

/* loaded from: classes7.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.q1 f124215d;

    public l1(cl.q1 q1Var) {
        this.f124215d = q1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p159x477cd522.p160x333422.C1460x397c7778 c1460x397c7778 = this.f124215d.f124276a;
        if (c1460x397c7778 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("V8DebuggerHelper", "V8DebuggerHelper v8 null，multiThread problem!");
        } else {
            c1460x397c7778.m15869x92a86e27();
        }
    }
}
