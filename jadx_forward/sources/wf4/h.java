package wf4;

/* loaded from: classes12.dex */
public final class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf4.a f527225a;

    public h(wf4.a aVar) {
        this.f527225a = aVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        wf4.a aVar = this.f527225a;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ExtTranslateVoiceEventListenerKtHelper", "doCheckVoiceRecognizeRequest cgiBack is null");
            ((wf4.b) aVar).a(0, 0, "cgiBack is null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListenerKtHelper", "doCheckVoiceRecognizeRequest errType:" + fVar.f152148a + ", errCode:" + fVar.f152149b);
            int i17 = fVar.f152148a;
            if (i17 == 0 && fVar.f152149b == 0) {
                r45.z20 z20Var = (r45.z20) fVar.f152151d;
                if (z20Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ExtTranslateVoiceEventListenerKtHelper", "doCheckVoiceRecognizeRequest resp is null");
                    ((wf4.b) aVar).a(fVar.f152148a, fVar.f152149b, "resp is null");
                } else {
                    int m75939xb282bd08 = z20Var.m75939xb282bd08(1);
                    final java.lang.String m75945x2fec8307 = z20Var.m75945x2fec8307(2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListenerKtHelper", "doCheckVoiceRecognizeRequest checkResult:" + m75939xb282bd08 + ", resultText:" + m75945x2fec8307);
                    if (m75939xb282bd08 == 1) {
                        final wf4.b bVar = (wf4.b) aVar;
                        bVar.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "ilink check result: finish");
                        ik1.h0.b(new java.lang.Runnable() { // from class: wf4.b$$b
                            @Override // java.lang.Runnable
                            public final void run() {
                                wf4.b bVar2 = wf4.b.this;
                                java.lang.String str = m75945x2fec8307;
                                if (bVar2.f527169a.f527212n) {
                                    return;
                                }
                                bVar2.f527169a.b();
                                wf4.g gVar = bVar2.f527169a;
                                gVar.A = 0;
                                gVar.C = true;
                                wf4.f fVar2 = wf4.f.FINISH;
                                gVar.f(fVar2, null);
                                bVar2.f527169a.c(str, fVar2, null);
                            }
                        });
                    } else if (m75939xb282bd08 == 2) {
                        final wf4.b bVar2 = (wf4.b) aVar;
                        bVar2.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "ilink check result: processing");
                        ik1.h0.b(new java.lang.Runnable() { // from class: wf4.b$$d
                            @Override // java.lang.Runnable
                            public final void run() {
                                wf4.b bVar3 = wf4.b.this;
                                if (bVar3.f527169a.f527212n) {
                                    return;
                                }
                                bVar3.f527169a.f(wf4.f.GET, null);
                            }
                        });
                    } else if (m75939xb282bd08 != 3) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ExtTranslateVoiceEventListenerKtHelper", "doCheckVoiceRecognizeRequest unknown checkResult:" + m75939xb282bd08);
                        ((wf4.b) aVar).a(fVar.f152148a, fVar.f152149b, "unknown checkResult:" + m75939xb282bd08);
                    } else {
                        final wf4.b bVar3 = (wf4.b) aVar;
                        bVar3.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "ilink check result: not start");
                        ik1.h0.b(new java.lang.Runnable() { // from class: wf4.b$$e
                            @Override // java.lang.Runnable
                            public final void run() {
                                wf4.b bVar4 = wf4.b.this;
                                if (bVar4.f527169a.f527212n) {
                                    return;
                                }
                                bVar4.f527169a.f(wf4.f.UPLOAD, null);
                            }
                        });
                    }
                }
            } else if (i17 == 2) {
                final wf4.b bVar4 = (wf4.b) aVar;
                bVar4.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "ilink check result: network overtime");
                ik1.h0.b(new java.lang.Runnable() { // from class: wf4.b$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        wf4.b bVar5 = wf4.b.this;
                        if (bVar5.f527169a.f527212n) {
                            return;
                        }
                        bVar5.f527169a.f(wf4.f.NETWORK_OVERTIME, null);
                    }
                });
            } else {
                ((wf4.b) aVar).a(i17, fVar.f152149b, fVar.f152150c);
            }
        }
        return jz5.f0.f384359a;
    }
}
