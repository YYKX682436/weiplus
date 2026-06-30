package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class tm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5402xfd96e0b5 f281552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f281553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281554f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm f281555g;

    public tm(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm xmVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5402xfd96e0b5 c5402xfd96e0b5, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f281555g = xmVar;
        this.f281552d = c5402xfd96e0b5;
        this.f281553e = i17;
        this.f281554f = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2;
        java.lang.String str;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5402xfd96e0b5 c5402xfd96e0b5 = this.f281552d;
        long longValue = java.lang.Long.valueOf(c5402xfd96e0b5.f135746g.f89711b).longValue();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm xmVar = this.f281555g;
        if (xmVar.q0(longValue)) {
            java.util.ArrayList arrayList = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) xmVar.f280113d.f542241c.a(sb5.z.class))).I.f233598o;
            int i17 = 0;
            while (true) {
                int size = arrayList.size();
                f9Var = this.f281554f;
                if (i17 >= size) {
                    i17 = this.f281553e;
                    break;
                } else if (((rd5.d) arrayList.get(i17)).f475787d.f526833b.m124847x74d37ac6() == f9Var.m124847x74d37ac6()) {
                    break;
                } else {
                    i17++;
                }
            }
            am.w8 w8Var = c5402xfd96e0b5.f135747h;
            if (!w8Var.f89802b) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w8Var.f89801a)) {
                    xmVar.n0(java.lang.Long.valueOf(c5402xfd96e0b5.f135746g.f89711b).longValue(), c5402xfd96e0b5.f135747h.f89801a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.Transforming);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformComponent", "go VoiceTransTextAct refresh msgId:%s", c5402xfd96e0b5.f135746g.f89711b);
                }
                xmVar.r0();
                xmVar.y0(i17);
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w8Var.f89801a)) {
                am.w8 w8Var2 = c5402xfd96e0b5.f135747h;
                r45.pv pvVar = w8Var2.f89804d;
                if (w8Var2.f89803c == 2) {
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = c5402xfd96e0b5.f135746g.f89711b;
                    if (pvVar == null) {
                        str = "null";
                    } else {
                        str = "[errCode:" + pvVar.f464945d + " errType:" + pvVar.f464946e + " errMsg:" + pvVar.f464947f + ']';
                    }
                    objArr[1] = str;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformComponent", "go VoiceTransTextAct translateVoice fail msgId:%s cgiBackInfo:%s", objArr);
                    if (pvVar != null) {
                        if (((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(xmVar.f280113d.g(), pvVar.f464946e, pvVar.f464945d, pvVar.f464947f)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformComponent", "go VoiceTransTextAct translateVoice handleErrMsg hit");
                        }
                    }
                    yb5.d dVar = xmVar.f280113d;
                    java.lang.String string = (dVar != null ? dVar.g() : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6a);
                    yb5.d dVar2 = xmVar.f280113d;
                    if (dVar2 != null && dVar2.g() != null) {
                        yb5.d dVar3 = xmVar.f280113d;
                        db5.t7.g(dVar3 != null ? dVar3.g() : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string);
                    }
                }
                xmVar.w0(java.lang.Long.valueOf(c5402xfd96e0b5.f135746g.f89711b).longValue());
                xmVar.v0(java.lang.Long.valueOf(c5402xfd96e0b5.f135746g.f89711b).longValue());
                xmVar.f281791m = false;
                xmVar.r0();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformComponent", "go VoiceTransTextAct isCompleted msgId:%s", c5402xfd96e0b5.f135746g.f89711b);
                am.v8 v8Var = c5402xfd96e0b5.f135746g;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f27 = pt0.f0.f2(v8Var.f89716g, java.lang.Long.valueOf(v8Var.f89711b).longValue());
                if (f27 == null || f27.mo78013xfb85f7b0() != 34) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TransformComponent", "go VoiceTransTextAct msg is null or not voice msg (maybe msg is revoke)");
                } else {
                    long longValue2 = java.lang.Long.valueOf(c5402xfd96e0b5.f135746g.f89711b).longValue();
                    synchronized (xmVar) {
                        android.util.Pair pair = (android.util.Pair) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm.f281782t.get(java.lang.Long.valueOf(longValue2));
                        f9Var2 = pair == null ? null : (com.p314xaae8f345.mm.p2621x8fb0427b.f9) pair.first;
                    }
                    if (f9Var2 != null) {
                        xmVar.n0(java.lang.Long.valueOf(c5402xfd96e0b5.f135746g.f89711b).longValue(), c5402xfd96e0b5.f135747h.f89801a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.Transformed);
                        f9Var2.l1(f9Var2.F | 64);
                        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var2.m124847x74d37ac6(), f9Var2, true);
                        xmVar.v0(java.lang.Long.valueOf(c5402xfd96e0b5.f135746g.f89711b).longValue());
                        xmVar.r0();
                        xmVar.y0(i17);
                    }
                    xmVar.f281791m = false;
                }
            }
            if (34 == f9Var.mo78013xfb85f7b0()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm.f281785w.put(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wm(f9Var, i17));
            } else {
                xmVar.u0(f9Var, i17);
            }
        }
    }
}
