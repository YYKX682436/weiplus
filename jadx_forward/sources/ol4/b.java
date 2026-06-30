package ol4;

/* loaded from: classes14.dex */
public final class b implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f427683d;

    public b(ol4.q qVar) {
        this.f427683d = qVar;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener
    /* renamed from: onStateChange */
    public final void mo53282x4799dc42(int i17, int i18) {
        boolean z17;
        java.lang.String str;
        boolean z18;
        java.lang.String str2;
        ol4.q qVar = this.f427683d;
        boolean z19 = qVar.f427728q;
        java.lang.String str3 = qVar.f427730s;
        if (z19 && i18 < 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "OnPlayerStateChange,preState:" + i17 + ", curState:" + i18 + ", hasDownloadComplete skip.");
            return;
        }
        int i19 = 4;
        if (i18 == 4) {
            i19 = 2;
        } else if (i18 == 5) {
            i19 = i17 == 6 ? 6 : 3;
        } else if (i18 == 6) {
            i19 = 5;
        } else if (i18 != 7) {
            i19 = (i18 == 9 && !qVar.f427721j) ? 11 : -1;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isPreload: ");
        bw5.lp0 lp0Var = qVar.f427716e;
        if (lp0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var.c().f108990i);
        sb6.append(", isPrepared: ");
        bw5.lp0 lp0Var2 = qVar.f427716e;
        if (lp0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var2.c().A);
        sb6.append(", title: ");
        bw5.lp0 lp0Var3 = qVar.f427716e;
        if (lp0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var3.d().m13171x7531c8a2());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "OnPlayerStateChange, " + sb6.toString() + ", preState:" + i17 + ", curState:" + i18 + ", event:" + i19 + ", callback " + qVar.f427715d);
        if (i19 > 0) {
            if (2 == i19) {
                pl4.k kVar = qVar.f427732u;
                long j17 = kVar != null ? kVar.f438256g : 0L;
                boolean z27 = (kVar == null || (str2 = kVar.f438252c) == null || !(r26.n0.N(str2) ^ true)) ? false : true;
                pl4.k kVar2 = qVar.f427732u;
                boolean z28 = kVar2 != null ? kVar2.f438257h : false;
                if (!z28) {
                    if (kVar2 != null ? kVar2.f438259j : false) {
                        z18 = true;
                        kk4.c cVar = qVar.f427713b;
                        int mo100924x2d67b867 = (int) ((kk4.f0) cVar).mo100924x2d67b867(103);
                        int mo100924x2d67b8672 = (int) ((kk4.f0) cVar).mo100924x2d67b867(105);
                        boolean z29 = z27;
                        int mo100924x2d67b8673 = (int) ((kk4.f0) cVar).mo100924x2d67b867(101);
                        boolean z37 = !qVar.s() && ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).bj();
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("decryptTotalTimeBeforePlay", j17);
                        jSONObject.put("isEncrypt", z29);
                        jSONObject.put("hitCache", z28);
                        jSONObject.put("downloadCompleteOnReady", z18);
                        jSONObject.put("channelNum", mo100924x2d67b867);
                        jSONObject.put("sampleRate", mo100924x2d67b8672);
                        jSONObject.put("bitRate", mo100924x2d67b8673);
                        jSONObject.put("isEnableHearingAid", z37);
                        java.lang.String jSONObject2 = jSONObject.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                        str = r26.i0.u(jSONObject2, ',', ';', false, 4, null);
                    }
                }
                z18 = false;
                kk4.c cVar2 = qVar.f427713b;
                int mo100924x2d67b8674 = (int) ((kk4.f0) cVar2).mo100924x2d67b867(103);
                int mo100924x2d67b86722 = (int) ((kk4.f0) cVar2).mo100924x2d67b867(105);
                boolean z292 = z27;
                int mo100924x2d67b86732 = (int) ((kk4.f0) cVar2).mo100924x2d67b867(101);
                if (qVar.s()) {
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("decryptTotalTimeBeforePlay", j17);
                jSONObject3.put("isEncrypt", z292);
                jSONObject3.put("hitCache", z28);
                jSONObject3.put("downloadCompleteOnReady", z18);
                jSONObject3.put("channelNum", mo100924x2d67b8674);
                jSONObject3.put("sampleRate", mo100924x2d67b86722);
                jSONObject3.put("bitRate", mo100924x2d67b86732);
                jSONObject3.put("isEnableHearingAid", z37);
                java.lang.String jSONObject22 = jSONObject3.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject22, "toString(...)");
                str = r26.i0.u(jSONObject22, ',', ';', false, 4, null);
            } else {
                str = null;
            }
            ll4.a aVar = qVar.f427715d;
            if (aVar != null) {
                ((kl4.n) aVar).b(i19, str);
            }
            if (i18 == 9) {
                z17 = false;
                qVar.r(false);
                if (!qVar.f427729r && i17 == 6 && i18 == 5) {
                    qVar.f427729r = z17;
                    ll4.a aVar2 = qVar.f427715d;
                    if (aVar2 != null) {
                        ll4.a.a(aVar2, 10, null, 2, null);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z17 = false;
        if (!qVar.f427729r) {
        }
    }
}
