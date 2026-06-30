package cl;

/* loaded from: classes7.dex */
public class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.eclipsesource.mmv8.V8Function f42683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42684e;

    public l2(cl.m2 m2Var, com.eclipsesource.mmv8.V8Function v8Function, cl.q0 q0Var) {
        this.f42683d = v8Function;
        this.f42684e = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.eclipsesource.mmv8.V8Function v8Function = this.f42683d;
        if (v8Function.isReleased()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.V8DirectApiSharedBufferLock", "hy: called a released task");
        } else {
            v8Function.call(this.f42684e.f().getGlobalObject(), null);
            v8Function.release();
        }
    }
}
