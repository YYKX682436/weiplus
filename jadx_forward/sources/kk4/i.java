package kk4;

/* loaded from: classes15.dex */
public class i implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.v f390087d;

    public i(kk4.v vVar) {
        this.f390087d = vVar;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener
    /* renamed from: onCompletion */
    public void mo53280xa6db431b(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        kk4.v vVar = this.f390087d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f390109a, "onCompletion");
        yz5.l lVar = vVar.f390128t;
        if (lVar != null) {
            lVar.mo146xb9724478(vVar);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener
    /* renamed from: onError */
    public void mo53281xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, int i18, long j17, long j18) {
        nk4.s sVar;
        kk4.v vVar = this.f390087d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f390109a, "onError errorType:" + i17 + " errorCode:" + i18 + ' ' + vVar.w());
        jk4.a aVar = vVar.L;
        aVar.f381673j = i17;
        aVar.f381674k = i18;
        vVar.r();
        dn.o oVar = vVar.f390114f;
        kk4.v.q(vVar, oVar instanceof ck4.b ? (ck4.b) oVar : null, false, 2, null);
        dn.o oVar2 = vVar.f390114f;
        ck4.b bVar = oVar2 instanceof ck4.b ? (ck4.b) oVar2 : null;
        if (bVar == null || (sVar = vVar.f390121m) == null) {
            return;
        }
        ((kw2.m0) sVar).u(new nk4.n(bVar.f124067d2, i18, android.os.SystemClock.uptimeMillis(), null));
    }

    /* renamed from: onInfo */
    public void mo53278xc39adf2d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, long j17, long j18, java.lang.Object obj) {
        nk4.s sVar;
        ck4.b bVar;
        yz5.l lVar;
        nk4.s sVar2;
        kk4.v vVar = this.f390087d;
        if (i17 == 105) {
            dn.o oVar = vVar.f390114f;
            if (!(oVar instanceof ck4.b) || (sVar = vVar.f390121m) == null) {
                return;
            }
            bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
            ((kw2.m0) sVar).p(new nk4.j(bVar != null ? bVar.f124067d2 : 0L, android.os.SystemClock.uptimeMillis(), null, 4, null));
            return;
        }
        if (i17 == 106) {
            vVar.T = true;
            jk4.a aVar = vVar.L;
            long j19 = aVar.f381664a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            aVar.f381665b = android.os.SystemClock.elapsedRealtime() - j19;
            if (interfaceC26164x73fc6bc6 != null && (lVar = vVar.f390127s) != null) {
                lVar.mo146xb9724478(interfaceC26164x73fc6bc6);
            }
            dn.o oVar2 = vVar.f390114f;
            if (oVar2 instanceof ck4.b) {
                nk4.s sVar3 = vVar.f390121m;
                if (sVar3 != null) {
                    ck4.b bVar2 = oVar2 instanceof ck4.b ? (ck4.b) oVar2 : null;
                    long j27 = bVar2 != null ? bVar2.f124067d2 : 0L;
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    int i18 = vVar.f390122n;
                    kk4.c cVar = vVar.f390110b;
                    ((kw2.m0) sVar3).q(new nk4.k(j27, uptimeMillis, i18, cVar != null ? ((kk4.f0) cVar).f390065h : 0L, null, 16, null));
                }
                nk4.s sVar4 = vVar.f390121m;
                if (sVar4 != null) {
                    dn.o oVar3 = vVar.f390114f;
                    bVar = oVar3 instanceof ck4.b ? (ck4.b) oVar3 : null;
                    long j28 = bVar != null ? bVar.f124067d2 : 0L;
                    long uptimeMillis2 = android.os.SystemClock.uptimeMillis();
                    int i19 = vVar.f390122n;
                    kk4.c cVar2 = vVar.f390110b;
                    ((kw2.m0) sVar4).r(new nk4.k(j28, uptimeMillis2, i19, cVar2 != null ? ((kk4.f0) cVar2).f390065h : 0L, null, 16, null));
                    return;
                }
                return;
            }
            return;
        }
        if (i17 == 151) {
            dn.o oVar4 = vVar.f390114f;
            if (!(oVar4 instanceof ck4.b) || (sVar2 = vVar.f390121m) == null) {
                return;
            }
            bVar = oVar4 instanceof ck4.b ? (ck4.b) oVar4 : null;
            ((kw2.m0) sVar2).z(new nk4.b(bVar != null ? bVar.f124067d2 : 0L, android.os.SystemClock.uptimeMillis(), null, 4, null));
            return;
        }
        if (i17 == 204) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f390109a, "onInfo#videoDecodeType:" + j17);
            vVar.f390122n = (int) j17;
            return;
        }
        if (i17 != 200) {
            if (i17 != 201) {
                return;
            }
            yz5.l lVar2 = vVar.f390130v;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(vVar);
            }
            jk4.a aVar2 = vVar.L;
            long j29 = aVar2.f381669f;
            if (j29 > 0) {
                aVar2.f381667d++;
                long j37 = aVar2.f381668e;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                aVar2.f381668e = j37 + (android.os.SystemClock.elapsedRealtime() - j29);
            }
            aVar2.f381669f = 0L;
            dn.o oVar5 = vVar.f390114f;
            kk4.v.q(vVar, oVar5 instanceof ck4.b ? (ck4.b) oVar5 : null, false, 2, null);
            return;
        }
        yz5.l lVar3 = vVar.f390129u;
        if (lVar3 != null) {
            lVar3.mo146xb9724478(vVar);
        }
        jk4.a aVar3 = vVar.L;
        aVar3.getClass();
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        aVar3.f381669f = android.os.SystemClock.elapsedRealtime();
        dn.o oVar6 = vVar.f390114f;
        ck4.b bVar3 = oVar6 instanceof ck4.b ? (ck4.b) oVar6 : null;
        if (bVar3 == null) {
            vVar.getClass();
            return;
        }
        java.lang.Runnable runnable = vVar.R;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = vVar.Q;
        if (runnable != null) {
            n3Var.mo50300x3fa464aa(runnable);
            vVar.R = null;
        }
        kk4.l lVar4 = new kk4.l(vVar, bVar3, bVar3);
        vVar.R = lVar4;
        n3Var.mo50297x7c4d7ca2(lVar4, (!vVar.T || vVar.S) ? 1000L : 500L);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
    /* renamed from: onPrepared */
    public void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        nk4.s sVar;
        kk4.v vVar = this.f390087d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f390109a, "onPrepared");
        long j17 = vVar.P;
        if (j17 > 0) {
            if (j17 < (interfaceC26164x73fc6bc6 != null ? interfaceC26164x73fc6bc6.mo100917x37a7fa50() : 0L) - 1000) {
                kk4.b.f(vVar, (int) vVar.P, true, null, 4, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f390109a, "seek to play " + vVar.P + ' ' + vVar.w());
                vVar.P = -1L;
            }
        }
        dn.o oVar = vVar.f390114f;
        boolean z17 = oVar instanceof ck4.b;
        if (z17 && (sVar = vVar.f390121m) != null) {
            ck4.b bVar = z17 ? (ck4.b) oVar : null;
            long j18 = bVar != null ? bVar.f124067d2 : 0L;
            kk4.c cVar = vVar.f390110b;
            ((kw2.m0) sVar).x(new nk4.q(j18, cVar != null ? ((kk4.f0) cVar).f390065h : 0L, android.os.SystemClock.uptimeMillis(), null));
        }
        if (vVar.f390119k) {
            vVar.x(0);
        }
        yz5.l lVar = vVar.f390125q;
        if (lVar != null) {
            lVar.mo146xb9724478(interfaceC26164x73fc6bc6);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener
    /* renamed from: onSeekComplete */
    public void mo53284xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        kk4.v vVar = this.f390087d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f390109a, "onSeekComplete");
        yz5.l lVar = vVar.I;
        if (lVar != null) {
            lVar.mo146xb9724478(interfaceC26164x73fc6bc6);
        }
        vVar.I = null;
        yz5.a aVar = vVar.f390108J;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        vVar.S = false;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener
    /* renamed from: onStateChange */
    public void mo53282x4799dc42(int i17, int i18) {
        kk4.g0 g0Var;
        nk4.s sVar;
        kk4.g0 g0Var2;
        nk4.s sVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390087d.f390109a, "onStateChange() preState:" + i17 + " curState:" + i18 + ' ' + this.f390087d.w());
        this.f390087d.f390112d = i18;
        if (i18 == 1 || i18 == 9) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390087d.f390109a, "onStateChange() player stop or idle " + this.f390087d.w());
            pk4.w wVar = this.f390087d.f390117i;
            if (wVar != null) {
                ((qk4.d) wVar).a();
            }
            this.f390087d.f390117i = null;
        }
        if (i18 == 5) {
            kk4.v vVar = this.f390087d;
            vVar.getClass();
            pm0.v.X(new kk4.m(vVar));
            kk4.v vVar2 = this.f390087d;
            dn.o oVar = vVar2.f390114f;
            boolean z17 = oVar instanceof ck4.b;
            if (z17 && (sVar2 = vVar2.f390121m) != null) {
                ck4.b bVar = z17 ? (ck4.b) oVar : null;
                ((kw2.m0) sVar2).A(new nk4.b(bVar != null ? bVar.f124067d2 : 0L, android.os.SystemClock.uptimeMillis(), null, 4, null));
            }
            kk4.v vVar3 = this.f390087d;
            if (vVar3.f390111c != null && (g0Var2 = vVar3.f390132x) != null) {
                ((ea2.c0) g0Var2).f332079a.t7();
            }
        }
        if (i18 == 6) {
            kk4.v vVar4 = this.f390087d;
            dn.o oVar2 = vVar4.f390114f;
            boolean z18 = oVar2 instanceof ck4.b;
            if (z18 && (sVar = vVar4.f390121m) != null) {
                ck4.b bVar2 = z18 ? (ck4.b) oVar2 : null;
                ((kw2.m0) sVar).t(new nk4.m(bVar2 != null ? bVar2.f124067d2 : 0L, android.os.SystemClock.uptimeMillis(), null, null, 8, null));
            }
            kk4.v vVar5 = this.f390087d;
            if (vVar5.f390111c != null && (g0Var = vVar5.f390132x) != null) {
                ((ea2.c0) g0Var).f332079a.t7();
            }
        }
        if (this.f390087d.s()) {
            this.f390087d.N();
        } else {
            this.f390087d.R();
        }
        kk4.v vVar6 = this.f390087d;
        yz5.p pVar = vVar6.K;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(vVar6.v(i17)), java.lang.Integer.valueOf(this.f390087d.v(i18)));
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener
    /* renamed from: onVideoSizeChanged */
    public void mo53285xdc9583f7(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, long j17, long j18) {
        yz5.p pVar = this.f390087d.f390126r;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        }
    }
}
