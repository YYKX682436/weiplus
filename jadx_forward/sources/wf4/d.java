package wf4;

/* loaded from: classes12.dex */
public class d implements wf4.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf4.g f527186a;

    public d(wf4.g gVar) {
        this.f527186a = gVar;
    }

    @Override // wf4.q
    public void b(final java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "ilink get onFinish resultText is null? : %s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)));
        ik1.h0.b(new java.lang.Runnable() { // from class: wf4.d$$a
            @Override // java.lang.Runnable
            public final void run() {
                wf4.d dVar = wf4.d.this;
                java.lang.String str2 = str;
                if (dVar.f527186a.f527212n) {
                    return;
                }
                dVar.f527186a.f527210i = false;
                dVar.f527186a.b();
                wf4.g gVar = dVar.f527186a;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                wf4.g gVar2 = dVar.f527186a;
                gVar.A = (int) (currentTimeMillis - gVar2.f527223y);
                gVar2.C = true;
                gVar2.c(str2, wf4.f.FINISH, null);
            }
        });
    }

    @Override // wf4.q
    public void d(final int i17, final int i18, final java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ExtTranslateVoiceEventListener", "ilink get onError errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        ik1.h0.b(new java.lang.Runnable() { // from class: wf4.d$$b
            @Override // java.lang.Runnable
            public final void run() {
                wf4.d dVar = wf4.d.this;
                int i19 = i18;
                int i27 = i17;
                java.lang.String str2 = str;
                if (dVar.f527186a.f527212n) {
                    return;
                }
                dVar.f527186a.f527210i = false;
                wf4.g gVar = dVar.f527186a;
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
