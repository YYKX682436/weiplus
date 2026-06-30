package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class j3 implements ku5.n {
    public j3(com.tencent.mm.booter.p3 p3Var) {
    }

    @Override // ku5.n
    public void a(java.lang.Thread thread, java.lang.String str, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ThreadBootDelegate", "[onInterrupt] name=" + str + " id=" + j17);
    }

    @Override // ku5.n
    public void b(java.lang.Thread thread, java.lang.String str, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ThreadBootDelegate", "[onThreadExit] name=" + str + " id=" + j17);
    }

    @Override // ku5.n
    public void c(java.lang.Thread thread, java.lang.String str, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ThreadBootDelegate", "[onThreadStart] name=" + str + " id=" + j17);
    }
}
