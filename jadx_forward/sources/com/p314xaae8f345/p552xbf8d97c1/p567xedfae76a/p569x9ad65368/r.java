package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class r extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.f {

    /* renamed from: e, reason: collision with root package name */
    public boolean f134400e;

    /* renamed from: f, reason: collision with root package name */
    public final android.app.Application f134401f;

    public r(android.app.Application app) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(app, "app");
        this.f134401f = app;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.g
    public void E2(java.lang.String scene, java.lang.String targetProcess, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetProcess, "targetProcess");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v vVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.f134416f;
        java.lang.String a17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.a(vVar);
        try {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0 d0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k;
            oj.j.a(d0Var.b(), "receive kill target: " + i17 + '-' + targetProcess, new java.lang.Object[0]);
            boolean b17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.b(vVar, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.f134413c, scene, targetProcess, java.lang.Integer.valueOf(i17));
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(targetProcess, oj.m.b(this.f134401f)) && android.os.Process.myPid() == i17) {
                android.app.Application context = this.f134401f;
                java.lang.String statefulName = (6 & 2) != 0 ? "" : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statefulName, "statefulName");
                int myPid = android.os.Process.myPid();
                java.lang.String b18 = oj.m.b(context);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "MatrixUtil.getProcessName(context)");
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea c4689x7ffeacea = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea(myPid, b18, statefulName, false);
                if (!b17 || !this.f134400e) {
                    com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134318f.a().postDelayed(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.q(this, c4689x7ffeacea), java.util.concurrent.TimeUnit.SECONDS.toMillis(10L));
                    return;
                }
                this.f134400e = true;
                d0Var.getClass();
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j jVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134362f;
                if (jVar != null) {
                    jVar.g4(c4689x7ffeacea);
                }
                oj.j.b(d0Var.b(), "rescued once !!!", new java.lang.Object[0]);
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d(a17, th6, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.g
    public void J8(java.lang.String scene, java.lang.String targetProcess, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetProcess, "targetProcess");
        java.lang.String a17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.f134416f);
        try {
            java.util.ArrayList arrayList = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.f134414d;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z17);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                yz5.r rVar = (yz5.r) it.next();
                java.lang.String b17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.b();
                try {
                    rVar.C(scene, targetProcess, valueOf, valueOf2);
                } catch (java.lang.Throwable th6) {
                    oj.j.d(b17, th6, "", new java.lang.Object[0]);
                }
            }
        } catch (java.lang.Throwable th7) {
            oj.j.d(a17, th7, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.g
    public void c5(java.lang.String scene, java.lang.String stateName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateName, "stateName");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v vVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.f134416f;
        java.lang.String a17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.a(vVar);
        try {
            oj.j.c(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.a(vVar), "subordinate received state " + stateName + ", " + z17, new java.lang.Object[0]);
            if (z17) {
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9.f19976x233c02ec.getClass();
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9 c4684xa6b8b6c9 = (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9) com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9.m41090x31dedea1().get(stateName);
                if (c4684xa6b8b6c9 != null) {
                    com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9.m41088xe9acff39(c4684xa6b8b6c9);
                }
            } else {
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9.f19976x233c02ec.getClass();
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9 c4684xa6b8b6c92 = (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9) com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9.m41090x31dedea1().get(stateName);
                if (c4684xa6b8b6c92 != null) {
                    com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9.m41087x4bf2e755(c4684xa6b8b6c92);
                }
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d(a17, th6, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.g
    public com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403 y5() {
        java.lang.String a17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.f134416f);
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403 c4720x9bbc2403 = new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403(null, null, null, null, null, new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null), new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null), null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de, null);
        try {
            return com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403.f134628p.b();
        } catch (java.lang.Throwable th6) {
            oj.j.d(a17, th6, "", new java.lang.Object[0]);
            return c4720x9bbc2403;
        }
    }
}
