package zs3;

@j95.b
/* loaded from: classes9.dex */
public final class z extends jm0.o implements mc0.k {
    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(bt3.y0.class);
    }

    public java.lang.String Zi(java.lang.String str, java.lang.String str2, r45.bq0 protoItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(protoItem, "protoItem");
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String g17 = bt3.g2.g(str, str2, protoItem);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "buildRecordAppMsgXML(...)");
        return g17;
    }

    public final void aj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        zz.b bj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(str, f9Var.mo78013xfb85f7b0(), null, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgFeatureService", "recordCheckDup:%s ret:%s hitCache:%s copyResult:%s replaceResult:%s", str, java.lang.Integer.valueOf(bj6.f559224a), java.lang.Boolean.valueOf(bj6.f559225b), java.lang.Boolean.valueOf(bj6.f559227d), java.lang.Long.valueOf(bj6.f559228e));
    }

    public dn.m bj(java.lang.String taskName, java.lang.String fullPath, r45.gp0 favDataItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskName, "taskName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullPath, "fullPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favDataItem, "favDataItem");
        dn.m mVar = new dn.m();
        mVar.f323318d = taskName;
        mVar.f69601xaca5bdda = favDataItem.T;
        mVar.f323319e = false;
        mVar.f69609xd84b8349 = 2;
        mVar.f69620xeb1a61d6 = favDataItem.f456951l1;
        mVar.f69593x419c9c3d = favDataItem.Z;
        mVar.f69595x6d25b0d9 = fullPath;
        if (favDataItem.I != 5 || favDataItem.f456968s2 == 0) {
            java.lang.String str = favDataItem.f456953m;
            if (!(str == null || r26.n0.N(str))) {
                java.lang.String str2 = favDataItem.f456945h;
                if (!(str2 == null || r26.n0.N(str2))) {
                    mVar.f69592xf1ebe47b = 1;
                    mVar.f69575xf11df5f5 = favDataItem.f456953m;
                    mVar.f69591xf9dbbe9c = favDataItem.f456945h;
                }
            }
            mVar.f69592xf1ebe47b = 19;
            mVar.f69582x4e093552 = favDataItem.f456942f2;
            mVar.f69575xf11df5f5 = favDataItem.f456946h2;
            mVar.f323344z = favDataItem.f456938d2;
            mVar.f69591xf9dbbe9c = "";
        } else {
            java.lang.String str3 = favDataItem.f456938d2;
            if (str3 == null || r26.n0.N(str3)) {
                mVar.f69592xf1ebe47b = 3;
                mVar.f69575xf11df5f5 = favDataItem.f456953m;
                mVar.f69591xf9dbbe9c = favDataItem.f456945h;
            } else {
                mVar.f69592xf1ebe47b = 19;
                mVar.f69582x4e093552 = favDataItem.f456942f2;
                mVar.f69575xf11df5f5 = favDataItem.f456946h2;
                mVar.f323344z = favDataItem.f456938d2;
                mVar.f69591xf9dbbe9c = "";
            }
        }
        return mVar;
    }

    public void cj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        boolean z18;
        pt0.f0.f439742b1.getClass();
        if (!((java.lang.Boolean) ((jz5.n) pt0.e0.f439736k).mo141623x754a37bb()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgFeatureService", "c2c path is close");
            return;
        }
        if (f9Var != null) {
            java.lang.String mj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), false);
            if (com.p314xaae8f345.mm.vfs.w6.j(mj6)) {
                java.lang.String a17 = bm5.d0.a(f9Var, bm5.f0.f104097i, false, true, 2, null);
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, mj6)) {
                    boolean x17 = com.p314xaae8f345.mm.vfs.w6.x(mj6, a17, true);
                    aj(f9Var, a17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgFeatureService", "move old recordMsg thumb to c2c file success: " + x17 + ", src[" + mj6 + "] -> dst[" + a17 + "], talker: " + f9Var.Q0() + ", localId: " + f9Var.m124847x74d37ac6() + ", svrId: " + f9Var.I0());
                }
            }
            java.lang.String b17 = bm5.z.b(bm5.y.f104289i.a(f9Var, bm5.f0.f104107v), false, true, 1, null);
            if (com.p314xaae8f345.mm.vfs.w6.j(b17)) {
                java.lang.String Q0 = f9Var.Q0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
                byte[] bytes = Q0.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                java.lang.String g17 = kk.k.g(bytes);
                java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(b17, false);
                if (s17 != null) {
                    java.util.Iterator it = s17.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) it.next();
                        java.lang.String name = x1Var.f294765b;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("temp_");
                        sb6.append(g17);
                        sb6.append('_');
                        java.lang.String str = g17;
                        java.util.Iterator it6 = it;
                        sb6.append(f9Var.m124847x74d37ac6());
                        sb6.append('_');
                        if (r26.i0.y(name, sb6.toString(), false)) {
                            java.lang.String name2 = x1Var.f294765b;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name2, "name");
                            z18 = false;
                            java.lang.String w17 = r26.i0.w(r26.n0.W(name2, "temp_"), "_" + f9Var.m124847x74d37ac6() + '_', "_" + f9Var.I0() + '_', false);
                            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(w17, name2)) {
                                java.lang.String b18 = bm5.z.b(bm5.y.f104289i.a(f9Var, bm5.f0.f104107v), true, false, 2, null);
                                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, b18)) {
                                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(b17, name2);
                                    com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(b18, w17);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgFeatureService", "move c2c temp dir, src[" + r6Var.o() + "] -> dst[" + r6Var2 + "], talker: " + f9Var.Q0() + ", localId: " + f9Var.m124847x74d37ac6() + ", svrId: " + f9Var.I0() + ", ret: " + com.p314xaae8f345.mm.vfs.w6.x(r6Var.o(), r6Var2.o(), true));
                                    java.lang.String o17 = r6Var2.o();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                                    aj(f9Var, o17);
                                }
                            }
                        } else {
                            z18 = false;
                        }
                        g17 = str;
                        it = it6;
                    }
                }
            }
        }
    }

    public java.lang.String fj(s15.h dataItem, java.lang.String str, long j17, long j18, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataItem, "dataItem");
        int i18 = dataItem.f384955d;
        java.lang.String s17 = bt3.g2.s(dataItem.m75945x2fec8307(i18 + 3), dataItem.m75939xb282bd08(i18 + 2), dataItem.m75945x2fec8307(i18 + 0), dataItem.n(), str, j17, j18, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(s17, "getDataPath(...)");
        return s17;
    }

    public java.lang.Object hj(oc0.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ys3.i iVar = (ys3.i) i95.n0.c(ys3.i.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar);
        if (!jm0.g.class.isAssignableFrom(bt3.y0.class)) {
            throw new java.lang.IllegalArgumentException(ys3.i.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(iVar.getViewModel(), new jm0.e(iVar)).a(bt3.y0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return ((bt3.y0) ((jm0.g) a17)).a7(bVar, interfaceC29045xdcb5ca57);
    }
}
