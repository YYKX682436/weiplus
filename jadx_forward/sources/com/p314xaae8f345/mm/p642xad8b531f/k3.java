package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public class k3 implements ku5.m {
    public k3(com.p314xaae8f345.mm.p642xad8b531f.p3 p3Var) {
    }

    @Override // ku5.m
    public void a(java.lang.String str, int i17, java.lang.Throwable th6) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ThreadBootDelegate", str + "@" + i17 + " " + th6);
    }

    @Override // ku5.m
    public void b(java.lang.String str, int i17, java.lang.String str2, boolean z17) {
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ThreadBootDelegate", "[rejected] " + str + " pool=" + str2);
    }

    @Override // ku5.m
    public void c(java.lang.String str, int i17, int i18, long j17, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ThreadBootDelegate", "[wait] " + str + "@" + i17 + " runningCount=" + i18 + " waitFor=" + (j17 / 100000) + "ms pool=" + str2);
    }

    @Override // ku5.m
    public void d(java.lang.String str, int i17, ku5.q qVar, long j17, long j18, java.lang.String str2, boolean z17) {
        if (qVar == ku5.q.CREATED) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("====== ");
            sb6.append(str);
            sb6.append("@");
            sb6.append(i17);
            sb6.append(" state=");
            sb6.append(qVar);
            sb6.append(" delay=");
            sb6.append(j17 >= 0 ? j17 / 1000000 : 0L);
            sb6.append("ms");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadBootDelegate", sb6.toString());
            return;
        }
        if (qVar == ku5.q.RUNNING) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadBootDelegate", ">>>>>> " + str + "@" + i17 + " state=" + qVar + " pool=" + str2);
            return;
        }
        if (qVar == ku5.q.COMPLETE) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadBootDelegate", "<<<<<< " + str + "@" + i17 + " state=" + qVar + " cost=" + j17 + "ms pool=" + str2);
            return;
        }
        if (qVar == ku5.q.CANCEL) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadBootDelegate", "|||||| " + str + "@" + i17 + " state=" + qVar);
            return;
        }
        if (qVar == ku5.q.THROW) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadBootDelegate", "****** " + str + "@" + i17 + " state=" + qVar);
        }
    }

    @Override // ku5.m
    /* renamed from: shutdown */
    public void mo8887xf5e80656() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ThreadBootDelegate", "shutdown");
    }
}
