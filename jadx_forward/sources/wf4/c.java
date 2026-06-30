package wf4;

/* loaded from: classes12.dex */
public class c implements wf4.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf4.g f527179a;

    public c(wf4.g gVar) {
        this.f527179a = gVar;
    }

    @Override // wf4.q
    public void b(final java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "ilink upload onFinish resultText is null? : %s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)));
        ik1.h0.b(new java.lang.Runnable() { // from class: wf4.c$$b
            @Override // java.lang.Runnable
            public final void run() {
                wf4.c cVar = wf4.c.this;
                java.lang.String str2 = str;
                if (cVar.f527179a.f527212n) {
                    return;
                }
                cVar.f527179a.b();
                wf4.g gVar = cVar.f527179a;
                gVar.A = 0;
                gVar.C = true;
                gVar.c(str2, wf4.f.FINISH, null);
            }
        });
    }

    @Override // wf4.q
    public void d(final int i17, final int i18, final java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ExtTranslateVoiceEventListener", "ilink upload onError errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        ik1.h0.b(new java.lang.Runnable() { // from class: wf4.c$$a
            @Override // java.lang.Runnable
            public final void run() {
                wf4.c cVar = wf4.c.this;
                int i19 = i18;
                int i27 = i17;
                java.lang.String str2 = str;
                if (cVar.f527179a.f527212n) {
                    return;
                }
                wf4.g gVar = cVar.f527179a;
                wf4.f fVar = wf4.f.SERVER_ERROR;
                r45.pv pvVar = new r45.pv();
                pvVar.f464945d = i19;
                pvVar.f464946e = i27;
                pvVar.f464947f = str2;
                gVar.f(fVar, pvVar);
            }
        });
    }
}
