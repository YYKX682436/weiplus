package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public class j3 implements ku5.n {
    public j3(com.p314xaae8f345.mm.p642xad8b531f.p3 p3Var) {
    }

    @Override // ku5.n
    public void a(java.lang.Thread thread, java.lang.String str, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadBootDelegate", "[onInterrupt] name=" + str + " id=" + j17);
    }

    @Override // ku5.n
    public void b(java.lang.Thread thread, java.lang.String str, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadBootDelegate", "[onThreadExit] name=" + str + " id=" + j17);
    }

    @Override // ku5.n
    public void c(java.lang.Thread thread, java.lang.String str, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadBootDelegate", "[onThreadStart] name=" + str + " id=" + j17);
    }
}
