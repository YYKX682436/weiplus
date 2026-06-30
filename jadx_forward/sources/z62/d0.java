package z62;

/* loaded from: classes8.dex */
public final class d0 implements ga0.e {
    @Override // ga0.e
    public com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c B9(bw5.a40 localStarData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localStarData, "localStarData");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
        c16601x7ed0e40c.v0().set(1, localStarData.b().m11606x7531c8a2());
        if (localStarData.b().f107274r[9]) {
            if (localStarData.b().b().f117572d == 3) {
                if (localStarData.b().b().f117578m[5]) {
                    r45.lr4 v07 = c16601x7ed0e40c.v0();
                    bw5.zk0 b17 = localStarData.b().b();
                    bw5.el0 el0Var = b17.f117578m[5] ? b17.f117575g : new bw5.el0();
                    v07.set(5, el0Var.f108484g[2] ? el0Var.f108482e : "");
                    r45.lr4 v08 = c16601x7ed0e40c.v0();
                    bw5.zk0 b18 = localStarData.b().b();
                    bw5.el0 el0Var2 = b18.f117578m[5] ? b18.f117575g : new bw5.el0();
                    v08.set(10, el0Var2.f108484g[1] ? el0Var2.f108481d : "");
                    r45.lr4 v09 = c16601x7ed0e40c.v0();
                    bw5.zk0 b19 = localStarData.b().b();
                    bw5.el0 el0Var3 = b19.f117578m[5] ? b19.f117575g : new bw5.el0();
                    v09.set(0, el0Var3.f108484g[3] ? el0Var3.f108483f : "");
                }
            } else if (localStarData.b().b().f117572d == 2 && localStarData.b().b().f117578m[4]) {
                r45.lr4 v010 = c16601x7ed0e40c.v0();
                bw5.zk0 b27 = localStarData.b().b();
                bw5.gl0 gl0Var = b27.f117578m[4] ? b27.f117574f : new bw5.gl0();
                v010.set(5, gl0Var.f109437g[2] ? gl0Var.f109435e : "");
                r45.lr4 v011 = c16601x7ed0e40c.v0();
                bw5.zk0 b28 = localStarData.b().b();
                bw5.gl0 gl0Var2 = b28.f117578m[4] ? b28.f117574f : new bw5.gl0();
                v011.set(10, gl0Var2.f109437g[1] ? gl0Var2.f109434d : "");
                r45.lr4 v012 = c16601x7ed0e40c.v0();
                bw5.zk0 b29 = localStarData.b().b();
                bw5.gl0 gl0Var3 = b29.f117578m[4] ? b29.f117574f : new bw5.gl0();
                v012.set(0, gl0Var3.f109437g[3] ? gl0Var3.f109436f : "");
            }
        }
        return c16601x7ed0e40c;
    }

    @Override // ga0.e
    public bw5.a40 b4(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfo, "multiTaskInfo");
        bw5.a40 a40Var = new bw5.a40();
        bw5.bl0 bl0Var = new bw5.bl0();
        bw5.zk0 zk0Var = new bw5.zk0();
        int i17 = multiTaskInfo.f66793x2262335f;
        boolean[] zArr = zk0Var.f117578m;
        if (i17 == 25) {
            zk0Var.f117572d = 3;
            zArr[1] = true;
            bw5.el0 el0Var = new bw5.el0();
            el0Var.f108481d = multiTaskInfo.v0().m75945x2fec8307(10);
            boolean[] zArr2 = el0Var.f108484g;
            zArr2[1] = true;
            el0Var.f108482e = multiTaskInfo.v0().m75945x2fec8307(5);
            zArr2[2] = true;
            el0Var.f108483f = multiTaskInfo.v0().m75945x2fec8307(0);
            zArr2[3] = true;
            zk0Var.f117575g = el0Var;
            zArr[5] = true;
        } else if (i17 == 27) {
            zk0Var.f117572d = 2;
            zArr[1] = true;
            bw5.gl0 gl0Var = new bw5.gl0();
            gl0Var.f109434d = multiTaskInfo.v0().m75945x2fec8307(10);
            boolean[] zArr3 = gl0Var.f109437g;
            zArr3[1] = true;
            gl0Var.f109435e = multiTaskInfo.v0().m75945x2fec8307(5);
            zArr3[2] = true;
            gl0Var.f109436f = multiTaskInfo.v0().m75945x2fec8307(0);
            zArr3[3] = true;
            zk0Var.f117574f = gl0Var;
            zArr[4] = true;
        }
        bl0Var.f107271o = zk0Var;
        bl0Var.f107274r[9] = true;
        a40Var.f106541d = bl0Var;
        a40Var.f106544g[1] = true;
        return a40Var;
    }

    @Override // ga0.e
    public java.lang.Class get(int i17) {
        if (i17 == 25) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tb0.class;
        }
        if (i17 != 27) {
            return null;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rp.class;
    }
}
