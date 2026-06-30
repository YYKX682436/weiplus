package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class n4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5 f187256d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5 l5Var) {
        super(3);
        this.f187256d = l5Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        jz5.f0 f0Var;
        java.lang.Object obj4;
        jz5.f0 f0Var2;
        java.lang.String key = (java.lang.String) obj;
        java.lang.String path = (java.lang.String) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.lang.String redDotDicPath = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5.H.c(path, jbVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb pbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb) this.f187256d.x().remove(redDotDicPath);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z5 A = this.f187256d.A();
        A.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotDicPath, "redDotDicPath");
        if (!(A.f187584e.length() > 0)) {
            if ((key.length() > 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(key, A.f187583d)) {
                A.f187596q = pbVar;
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(A.f187584e, redDotDicPath)) {
            A.f187596q = pbVar;
        }
        if (pbVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb.v0(pbVar, this.f187256d.f187183b, false, 2, null);
        }
        r45.oc4 oc4Var = (r45.oc4) this.f187256d.y().remove(redDotDicPath);
        this.f187256d.b(redDotDicPath, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.v5.f187455f);
        if (jbVar != null) {
            int i17 = jbVar.f65873xe412923f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.u6 B = this.f187256d.B();
            java.lang.String str = jbVar.f65882x5364c75d;
            if (str == null) {
                str = "";
            }
            B.getClass();
            if (B.f187441m) {
                B.a(str, i17);
                java.util.List f17 = B.f();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "<get-historyRecords>(...)");
                synchronized (f17) {
                    java.util.Iterator it = f17.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = it.next();
                        if (((r45.sw3) obj4).m75939xb282bd08(0) == i17) {
                            break;
                        }
                    }
                }
                r45.sw3 sw3Var = (r45.sw3) obj4;
                if (sw3Var != null) {
                    int e17 = c01.id.e();
                    if (!B.j(B.f187436h * 1000, e17 * 1000)) {
                        B.k(sw3Var);
                    }
                    java.util.LinkedList m75941xfb821914 = sw3Var.m75941xfb821914(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRecord_items(...)");
                    r45.tw3 tw3Var = (r45.tw3) kz5.n0.Z(m75941xfb821914);
                    if (tw3Var != null) {
                        tw3Var.set(2, java.lang.Integer.valueOf(tw3Var.m75939xb282bd08(2) + 1));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x6.f187528a.c(sw3Var, e17);
                    B.l("click", e17, i17, sw3Var);
                    f0Var2 = jz5.f0.f384359a;
                } else {
                    f0Var2 = null;
                }
                if (f0Var2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderRedDotFreqCtrlXStrategy", "[click] but businessType=" + i17 + " record is null!");
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(key);
        sb6.append(" entry click more than ");
        sb6.append(this.f187256d.v().m75939xb282bd08(1));
        sb6.append("s,path=");
        sb6.append(path);
        sb6.append(",tipUuid=");
        sb6.append(jbVar != null ? jbVar.f65882x5364c75d : null);
        sb6.append(",dicPath=");
        sb6.append(redDotDicPath);
        sb6.append(",remove n/m=");
        sb6.append(pbVar);
        sb6.append(",remove penalized=");
        sb6.append(oc4Var);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotFreqControlHandler", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5 l5Var = this.f187256d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l6 l6Var = l5Var.f187204w;
        if (l6Var != null) {
            l6Var.g(l5Var, l5Var.v(), this.f187256d.x(), this.f187256d.y(), this.f187256d.o(), (r21 & 32) != 0 ? null : null, (r21 & 64) != 0 ? null : null, (r21 & 128) != 0 ? null : null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5 l5Var2 = this.f187256d;
        l5Var2.getClass();
        if (path.length() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb pbVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb) l5Var2.o().get(path);
            if (pbVar2 != null) {
                r45.pc4 pc4Var = pbVar2.f69354xc9a807b9;
                if (pc4Var != null && pc4Var.m75941xfb821914(1).contains(redDotDicPath)) {
                    pbVar2.t0(redDotDicPath);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb.y0(pbVar2, "banRemove", l5Var2.f187183b, false, 4, null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotFreqControlHandler", "removeBusinessTypePenalizedPath " + redDotDicPath + '!');
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.RedDotFreqControlHandler", "removeBusinessTypePenalizedPath but " + redDotDicPath + " not exist!");
                }
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.RedDotFreqControlHandler", "removeBusinessTypePenalizedPath " + redDotDicPath + " but " + path + " 's penalized path is empty!");
            }
        }
        return jz5.f0.f384359a;
    }
}
