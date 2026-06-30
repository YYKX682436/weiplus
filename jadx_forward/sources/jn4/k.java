package jn4;

/* loaded from: classes11.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f382344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn4.m f382345e;

    public k(jn4.m mVar, java.lang.String str) {
        this.f382345e = mVar;
        this.f382344d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        java.lang.String str = "-t " + java.lang.String.valueOf(64);
        java.lang.String str2 = this.f382344d;
        java.util.ArrayList arrayList = (java.util.ArrayList) jn4.o.d(new java.lang.String[]{"ping", "-c 1", str, str2});
        int size = arrayList.size();
        jn4.m mVar = this.f382345e;
        if (size != 2) {
            mVar.c(str2, "failed to ping: \n" + str2, 0);
            return;
        }
        java.lang.String str3 = (java.lang.String) arrayList.get(0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            mVar.c(str2, "failed to ping: \n" + str2, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTraceRoute", "runcommand err");
            return;
        }
        int c17 = jn4.o.c(str3);
        if (c17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTraceRoute", "failed to touch server:" + str2);
            mVar.c(str2, "failed to touch server: " + str2 + "\n", 0);
            return;
        }
        java.lang.String obj = arrayList.get(1).toString();
        java.lang.String b17 = jn4.o.b(str3, true);
        mVar.c(str2, (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17) ? java.lang.String.format("server: %s, TTL: %d, Time = %sms", str2, java.lang.Integer.valueOf(c17), b17) : !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj) ? java.lang.String.format("server: %s, TTL: %d, Time = %sms", str2, java.lang.Integer.valueOf(c17), obj) : java.lang.String.format("server: %s, TTL: %d, Time = %sms", str2, java.lang.Integer.valueOf(c17), com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a)) + "\n", 0);
        int i17 = (64 - c17) + 5;
        int i18 = i17 >= 0 ? i17 : 64;
        for (int i19 = 1; i19 < i18; i19++) {
            synchronized (mVar) {
                z17 = mVar.f382349a;
            }
            if (z17) {
                return;
            }
            jn4.j jVar = new jn4.j(mVar, str2, i19);
            jn4.p pVar = jn4.m.f382348j;
            if (pVar != null) {
                pVar.execute(jVar);
            }
        }
    }
}
