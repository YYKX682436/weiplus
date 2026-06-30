package k90;

@j95.b
/* loaded from: classes12.dex */
public final class b extends i95.w implements tg3.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f387041d = new java.util.concurrent.CopyOnWriteArraySet();

    public static void Bi(k90.b bVar, bm5.f0 f0Var, oi3.g gVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, bm5.y yVar, java.lang.String str, java.lang.String str2, boolean z17, int i17, java.lang.Object obj) {
        bm5.v vVar;
        bm5.f0 f0Var2 = (i17 & 1) != 0 ? null : f0Var;
        oi3.g gVar2 = (i17 & 2) != 0 ? null : gVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (i17 & 4) != 0 ? null : f9Var;
        bm5.y yVar2 = (i17 & 8) != 0 ? null : yVar;
        bVar.getClass();
        if (f0Var2 == bm5.f0.f104095g || f0Var2 == bm5.f0.f104103r) {
            return;
        }
        if (f9Var2 != null) {
            vVar = bm5.w.a(f9Var2);
        } else if (gVar2 != null) {
            vVar = bm5.w.b(gVar2);
        } else if (yVar2 == null || (vVar = yVar2.f104296f) == null) {
            vVar = bm5.v.f104283p;
        }
        if ((((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).pj(vVar) || ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).hj()) && z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str)) {
            if (gVar2 == null && f9Var2 == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.C2CFileFeatureService", "file is same with oldPath: " + str);
            ((ku5.t0) ku5.t0.f394148d).h(new k90.a(pt0.f0.f439742b1.p(new java.lang.Throwable()), bVar, f9Var2, gVar2, yVar2, str), "msg_c2c_error_report");
        }
    }

    public final void Ai(java.lang.String str, boolean z17) {
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CFileFeatureService", str);
        }
    }

    public void Di(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).getClass();
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 S1 = m11.b1.Di().S1(msgInfo);
        boolean z17 = true;
        if (S1 == null || S1.f404166a <= 0) {
            str = "";
        } else {
            str = S1.f404170e;
            if (S1.j()) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                m11.b0 C1 = m11.b1.Di().C1(java.lang.Long.valueOf(S1.f404182q));
                if (C1.f404166a == S1.f404182q) {
                    str = C1.f404171f;
                }
            }
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        bm5.x xVar = bm5.y.f104289i;
        bm5.v vVar = bm5.v.f104276f;
        bm5.f0 f0Var = bm5.f0.f104096h;
        java.lang.String h17 = bm5.z.h(xVar.c("", 0L, 0L, 0L, str, vVar, f0Var), null, false, 3, null);
        java.lang.String h18 = bm5.z.h(xVar.b(msgInfo, f0Var, str), null, false, 3, null);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h17, h18) && com.p314xaae8f345.mm.vfs.w6.j(h17) && com.p314xaae8f345.mm.vfs.w6.j(h18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CImgPathFeatureService", "found same with oldMidPath: " + h17 + ", delete c2cMidPath: " + h18);
            com.p314xaae8f345.mm.vfs.w6.h(h18);
        }
    }

    public void Ni(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        vf0.c cVar = (vf0.c) ((c35.m) i95.n0.c(c35.m.class));
        cVar.getClass();
        bm5.f0 f0Var = bm5.f0.f104097i;
        java.lang.String aj6 = cVar.aj(f0Var, msgInfo.z0());
        bm5.x xVar = bm5.y.f104289i;
        java.lang.String h17 = bm5.z.h(xVar.b(msgInfo, f0Var, msgInfo.z0()), null, false, 3, null);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aj6, h17) && com.p314xaae8f345.mm.vfs.w6.j(aj6) && com.p314xaae8f345.mm.vfs.w6.j(h17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CVideoPathFeatureService", "found same with oldThumbPath: " + aj6 + ", delete c2cThumbPath: " + h17);
            com.p314xaae8f345.mm.vfs.w6.h(h17);
        }
        bm5.f0 f0Var2 = bm5.f0.f104104s;
        java.lang.String aj7 = cVar.aj(f0Var2, msgInfo.z0());
        java.lang.String h18 = bm5.z.h(xVar.b(msgInfo, f0Var2, msgInfo.z0()), null, false, 3, null);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aj7, h18) && com.p314xaae8f345.mm.vfs.w6.j(aj7) && com.p314xaae8f345.mm.vfs.w6.j(h18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CVideoPathFeatureService", "found same with oldVideoPath: " + aj7 + ", delete c2cVideoPath: " + h18);
            com.p314xaae8f345.mm.vfs.w6.h(h18);
        }
    }

    public java.lang.String Ri(bm5.y c2CFileDescriptor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c2CFileDescriptor, "c2CFileDescriptor");
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5 z5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5.class))).getClass();
        h12.b0.a();
        java.lang.String str = c2CFileDescriptor.f104295e;
        if (str == null) {
            str = "";
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) z5Var).getClass();
        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
        java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(n22.m.g(), "", str);
        return p17 == null ? "" : p17;
    }

    public java.lang.String Ui(bm5.y yVar, java.lang.String str, boolean z17) {
        java.lang.String str2;
        boolean z18;
        java.lang.String r17;
        if (yVar == null) {
            return "";
        }
        if (yVar.f104297g == bm5.f0.f104097i) {
            return z17 ? bm5.z.c(yVar, null, true) : bm5.z.i(yVar, null, null, false, 7, null);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e eVar = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi();
        long j17 = yVar.f104292b;
        java.lang.String str3 = yVar.f104291a;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = eVar.J0(j17, str3);
        java.lang.String str4 = J0 != null ? J0.f68099xfeae815 : null;
        if (str4 == null) {
            str4 = "";
        }
        if (str4.length() == 0) {
            java.lang.String str5 = str == null ? "" : str;
            java.lang.String str6 = yVar.f104295e;
            if (str6 == null || str6.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.C2CFileFeatureService", "getFileFullPath: Unable to get path. fileName: " + str6 + ", suffix: " + str5);
            } else {
                str4 = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).mj(str6, str5);
            }
        }
        java.lang.String str7 = str4;
        if (str == null || r26.n0.N(str)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(str3, j17);
            if (k17 != null) {
                v05.b bVar = new v05.b();
                java.lang.String j18 = k17.j();
                if (j18 == null) {
                    j18 = "";
                }
                bVar.m126728xdc93280d(j18);
                v05.a aVar = (v05.a) bVar.m75936x14adae67(bVar.f513848e + 8);
                if (aVar != null && (r17 = aVar.r()) != null) {
                    str2 = r17;
                }
            }
            str2 = "";
        } else {
            str2 = str;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k18 = pt0.f0.f439742b1.k(str3, j17);
        if (k18 != null) {
            v05.b bVar2 = new v05.b();
            java.lang.String j19 = k18.j();
            bVar2.m126728xdc93280d(j19 != null ? j19 : "");
            e40.u uVar = (e40.u) i95.n0.c(e40.u.class);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(bVar2.m75939xb282bd08(bVar2.f449898d + 6));
            ((bf5.o) uVar).getClass();
            ez.v0 v0Var = ez.v0.f339310a;
            if (valueOf != null) {
                valueOf.intValue();
                if (valueOf.intValue() == 130) {
                    z18 = true;
                    if (((java.lang.Boolean) ((jz5.n) pt0.e0.f439738m).mo141623x754a37bb()).booleanValue() && !z18) {
                        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(bm5.z.i(yVar, str2, null, false, 6, null));
                        if (!r6Var.m()) {
                            return str7;
                        }
                        java.lang.String o17 = r6Var.o();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o17);
                        return o17;
                    }
                    if (com.p314xaae8f345.mm.vfs.w6.j(str7) && bm5.c0.f104083a.b(yVar) == 0) {
                        java.lang.String i17 = bm5.z.i(yVar, str2, null, false, 6, null);
                        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(i17);
                        java.lang.String str8 = a17.f294812f;
                        if (str8 != null) {
                            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str8, false, false);
                            if (!str8.equals(l17)) {
                                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                            }
                        }
                        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                        return !(m17.a() ? m17.f294799a.F(m17.f294800b) : false) ? bm5.z.c(yVar, str2, true) : i17;
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.C2CFileFeatureService", "checkIfForceC2CPath: Unable to get msgInfo, talker: " + str3 + ", msgId: " + j17);
        }
        z18 = false;
        if (((java.lang.Boolean) ((jz5.n) pt0.e0.f439738m).mo141623x754a37bb()).booleanValue()) {
        }
        return com.p314xaae8f345.mm.vfs.w6.j(str7) ? str7 : str7;
    }

    public java.lang.String Vi(bm5.y yVar, java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        m11.b0 b0Var;
        bm5.y c2CFileDescriptor = yVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c2CFileDescriptor, "c2CFileDescriptor");
        java.lang.String str3 = c2CFileDescriptor.f104295e;
        if ((str3 == null || str3.length() == 0) && (!z18 || !pt0.f0.f439742b1.f())) {
            bm5.f0 f0Var = bm5.f0.f104096h;
            long j17 = c2CFileDescriptor.f104292b;
            java.lang.String str4 = c2CFileDescriptor.f104291a;
            bm5.f0 f0Var2 = c2CFileDescriptor.f104297g;
            if (f0Var2 == f0Var || f0Var2 == bm5.f0.f104099n || f0Var2 == bm5.f0.f104095g) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(str4, j17);
                if (k17 != null) {
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    b0Var = m11.b1.Di().S1(k17);
                } else {
                    b0Var = null;
                }
                java.lang.String str5 = b0Var != null ? b0Var.f404170e : null;
                if (str5 == null) {
                    str5 = "";
                }
                if (f0Var2 == bm5.f0.f104095g) {
                    if (b0Var != null && b0Var.j()) {
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        m11.b0 C1 = m11.b1.Di().C1(java.lang.Long.valueOf(b0Var.f404182q));
                        if (C1.f404166a == b0Var.f404182q) {
                            str5 = C1.f404170e;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "getBigImgPath(...)");
                        }
                    }
                }
                c2CFileDescriptor = bm5.y.f104289i.c(c2CFileDescriptor.f104291a, c2CFileDescriptor.f104292b, c2CFileDescriptor.f104293c, c2CFileDescriptor.f104294d, str5, c2CFileDescriptor.f104296f, c2CFileDescriptor.f104297g);
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 k18 = pt0.f0.f439742b1.k(str4, j17);
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(bm5.z.d(c2CFileDescriptor, k18 != null ? k18.z0() : null, false, 2, null));
                java.lang.String str6 = a17.f294812f;
                if (str6 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str6, false, false);
                    if (!str6.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                java.lang.String str7 = a17.f294812f;
                int lastIndexOf = str7.lastIndexOf("/");
                if (lastIndexOf >= 0) {
                    str7 = str7.substring(lastIndexOf + 1);
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str7, "getName(...)");
                c2CFileDescriptor = bm5.y.f104289i.c(c2CFileDescriptor.f104291a, c2CFileDescriptor.f104292b, c2CFileDescriptor.f104293c, c2CFileDescriptor.f104294d, str7, c2CFileDescriptor.f104296f, c2CFileDescriptor.f104297g);
            }
        }
        bm5.y yVar2 = c2CFileDescriptor;
        java.lang.String hj6 = hj(yVar2.f104295e, str, str2, z17);
        bm5.f0 f0Var3 = bm5.f0.f104098m;
        bm5.f0 f0Var4 = yVar2.f104297g;
        if (f0Var4 == f0Var3 && !r26.i0.n(hj6, "hd", false)) {
            hj6 = hj6.concat("hd");
        } else if ((f0Var4 == bm5.f0.f104099n || f0Var4 == bm5.f0.f104100o) && !r26.i0.n(hj6, "_hevc", false)) {
            hj6 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Bi(hj6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hj6, "getHevcPath(...)");
        } else if ((f0Var4 == bm5.f0.f104101p || f0Var4 == bm5.f0.f104102q) && !r26.i0.n(hj6, "_lp", false)) {
            hj6 = hj6.concat("_lp");
        }
        java.lang.String str8 = hj6;
        java.lang.String aj6 = ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).aj(yVar2, str8, z18, z17);
        java.lang.String str9 = aj6 == null ? str8 : aj6;
        Ai("[f14]getFullPath, businessType: " + yVar2.f104296f + ", resType: " + f0Var4 + ", oldPath: " + str8 + ", newPath: " + str9 + ", talker: " + yVar2.f104291a + ", msgId: " + yVar2.f104292b + ", msgSvrId: " + yVar2.f104293c + ", name: " + yVar2.f104295e + ", prefix: " + str + ", ext: " + str2 + ", forWrite: " + z18 + ", mkDir: " + z17, z18);
        Bi(this, yVar2.f104297g, null, null, yVar2, str9, str8, z18, 6, null);
        return str9;
    }

    public java.lang.String Zi(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, bm5.f0 f0Var, java.lang.String str) {
        java.lang.String str2;
        java.lang.String fj6 = fj(str);
        if (f0Var == bm5.f0.f104098m && !r26.i0.n(fj6, "hd", false)) {
            fj6 = fj6.concat("hd");
        } else if ((f0Var == bm5.f0.f104099n || f0Var == bm5.f0.f104100o) && !r26.i0.n(fj6, "_hevc", false)) {
            fj6 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Bi(fj6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fj6, "getHevcPath(...)");
        } else if ((f0Var == bm5.f0.f104101p || f0Var == bm5.f0.f104102q) && !r26.i0.n(fj6, "_lp", false)) {
            fj6 = fj6.concat("_lp");
        }
        java.lang.String str3 = fj6;
        if (f0Var == null || (str2 = ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).bj(f0Var, f9Var, str3, false, true)) == null) {
            str2 = str3;
        }
        java.util.Objects.toString(f9Var != null ? bm5.w.a(f9Var) : null);
        java.util.Objects.toString(f0Var);
        java.util.Objects.toString(f0Var);
        Bi(this, f0Var, null, f9Var, null, str2, str3, false, 10, null);
        return str2;
    }

    public java.lang.String aj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, bm5.f0 f0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return bj(f9Var, f0Var, str, str2, str3, true, false);
    }

    public java.lang.String bj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, bm5.f0 f0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18) {
        java.lang.String bj6;
        java.lang.String hj6 = hj(str, str2, str3, z17);
        if (f0Var == bm5.f0.f104098m && !r26.i0.n(hj6, "hd", false)) {
            hj6 = hj6.concat("hd");
        } else if ((f0Var == bm5.f0.f104099n || f0Var == bm5.f0.f104100o) && !r26.i0.n(hj6, "_hevc", false)) {
            hj6 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Bi(hj6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hj6, "getHevcPath(...)");
        } else if ((f0Var == bm5.f0.f104101p || f0Var == bm5.f0.f104102q) && !r26.i0.n(hj6, "_lp", false)) {
            hj6 = hj6.concat("_lp");
        }
        java.lang.String str4 = hj6;
        java.lang.String str5 = (f0Var == null || (bj6 = ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).bj(f0Var, f9Var, str4, z18, z17)) == null) ? str4 : bj6;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[f1]getFullPath, businessType: ");
        sb6.append(f9Var != null ? bm5.w.a(f9Var) : null);
        sb6.append(", resType: ");
        sb6.append(f0Var);
        sb6.append(", oldPath: ");
        sb6.append(str4);
        sb6.append(", newPath: ");
        sb6.append(str5);
        sb6.append(", talker: ");
        sb6.append(f9Var != null ? f9Var.Q0() : null);
        sb6.append(", msgType: ");
        sb6.append(f9Var != null ? java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()) : null);
        sb6.append(", msgId: ");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
        sb6.append(", msgSvrId: ");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.I0()) : null);
        sb6.append(", resType: ");
        sb6.append(f0Var);
        sb6.append(", name: ");
        sb6.append(str);
        sb6.append(", prefix: ");
        sb6.append(str2);
        sb6.append(", ext: ");
        sb6.append(str3);
        sb6.append(", forWrite: ");
        sb6.append(z18);
        sb6.append(", mkDir: ");
        sb6.append(z17);
        Ai(sb6.toString(), z18);
        Bi(this, f0Var, null, f9Var, null, str5, str4, z18, 10, null);
        return str5;
    }

    public java.lang.String cj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, bm5.f0 f0Var, java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String str3;
        if (str2 == null) {
            str2 = fj(str);
        }
        if (f0Var == bm5.f0.f104098m && !r26.i0.n(str2, "hd", false)) {
            str2 = str2.concat("hd");
        } else if ((f0Var == bm5.f0.f104099n || f0Var == bm5.f0.f104100o) && !r26.i0.n(str2, "_hevc", false)) {
            str2 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Bi(str2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getHevcPath(...)");
        } else if ((f0Var == bm5.f0.f104101p || f0Var == bm5.f0.f104102q) && !r26.i0.n(str2, "_lp", false)) {
            str2 = str2.concat("_lp");
        }
        java.lang.String str4 = str2;
        if (f0Var == null || (str3 = ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).bj(f0Var, f9Var, str4, z17, true)) == null) {
            str3 = str4;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[f3]getFullPath, businessType: ");
        sb6.append(f9Var != null ? bm5.w.a(f9Var) : null);
        sb6.append(", resType: ");
        sb6.append(f0Var);
        sb6.append(", oldPath: ");
        sb6.append(str4);
        sb6.append(", newPath: ");
        sb6.append(str3);
        sb6.append(", talker: ");
        sb6.append(f9Var != null ? f9Var.Q0() : null);
        sb6.append(", msgType: ");
        sb6.append(f9Var != null ? java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()) : null);
        sb6.append(", msgId: ");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
        sb6.append(", msgSvrId: ");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.I0()) : null);
        sb6.append(", resType: ");
        sb6.append(f0Var);
        sb6.append(", name: ");
        sb6.append(str);
        sb6.append(", forWrite: ");
        sb6.append(z17);
        sb6.append(", mkDir: true");
        Ai(sb6.toString(), z17);
        Bi(this, f0Var, null, f9Var, null, str3, str4, z17, 10, null);
        return str3;
    }

    public final java.lang.String fj(java.lang.String str) {
        java.lang.String str2 = "";
        if (str == null || str.length() == 0) {
            return "";
        }
        java.lang.String b17 = g83.a.b();
        java.lang.String str3 = "th_";
        if (r26.i0.y(str, "SERVERID://", false)) {
            java.lang.String substring = str.substring(11);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            try {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                java.lang.String str4 = m11.b1.Di().X1(java.lang.Long.parseLong(substring)).f404170e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getBigImgPath(...)");
                str2 = str4;
            } catch (java.lang.NumberFormatException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.C2CFileFeatureService", "read img buf failed: " + e17.getMessage());
                return "";
            }
        } else if (r26.i0.y(str, "THUMBNAIL_DIRPATH://", false)) {
            str2 = str.substring(23);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "substring(...)");
        } else if (r26.i0.y(str, "THUMBNAIL_APPMSG_DIR://", false)) {
            str2 = str.substring(29);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "substring(...)");
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            b17 = m11.b1.Di().k1();
            str3 = "msgth_";
        }
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.h1.a(g83.a.a(), b17, str3, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? str : str2, "", 1, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "defGenPathWithOld(...)");
        return a17;
    }

    public final java.lang.String hj(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7 = str;
        if (str7 == null || str.length() == 0) {
            return "";
        }
        if (r26.i0.y(str7, "SERVERID://", false)) {
            java.lang.String substring = str7.substring(11);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            try {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                str4 = m11.b1.Di().X1(java.lang.Long.parseLong(substring)).f404170e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getBigImgPath(...)");
            } catch (java.lang.NumberFormatException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.C2CFileFeatureService", "read img buf failed: " + e17.getMessage());
                return "";
            }
        } else {
            str4 = "";
        }
        java.lang.String b17 = g83.a.b();
        if (r26.i0.y(str7, "THUMBNAIL_DIRPATH://", false)) {
            str7 = str7.substring(23);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str7, "substring(...)");
            str5 = "th_";
        } else if (r26.i0.y(str7, "THUMBNAIL_APPMSG_DIR://", false)) {
            str7 = str7.substring(29);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str7, "substring(...)");
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            b17 = m11.b1.Di().k1();
            str5 = "msgth_";
        } else {
            str5 = str2;
        }
        if (str5 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str5, "msgth_")) {
            str6 = b17;
        } else {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            str6 = m11.b1.Di().k1();
        }
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.h1.a(g83.a.a(), str6, str5, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) ? str7 : str4, str3, 1, z17);
        return a17 == null ? "" : a17;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String ij(oi3.g r17, bm5.f0 r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k90.b.ij(oi3.g, bm5.f0, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String mj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r12, java.lang.String r13, boolean r14) {
        /*
            r11 = this;
            java.lang.String r6 = r11.nj(r13, r14)
            java.lang.Class<xs.w0> r0 = xs.w0.class
            i95.m r0 = i95.n0.c(r0)
            xs.w0 r0 = (xs.w0) r0
            bm5.f0 r7 = bm5.f0.f104097i
            a80.b r0 = (a80.b) r0
            r4 = 0
            r1 = r7
            r2 = r12
            r3 = r6
            r5 = r14
            java.lang.String r0 = r0.bj(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L22
            if (r6 != 0) goto L20
            java.lang.String r0 = ""
            goto L22
        L20:
            r10 = r6
            goto L23
        L22:
            r10 = r0
        L23:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[f6]getFullThumbPath, businessType: "
            r0.<init>(r1)
            r1 = 0
            if (r12 == 0) goto L32
            bm5.v r2 = bm5.w.a(r12)
            goto L33
        L32:
            r2 = r1
        L33:
            r0.append(r2)
            java.lang.String r2 = ", resType: "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r2 = ", oldPath: "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r2 = ", newPath: "
            r0.append(r2)
            r0.append(r10)
            java.lang.String r2 = ", talker: "
            r0.append(r2)
            if (r12 == 0) goto L5a
            java.lang.String r2 = r12.Q0()
            goto L5b
        L5a:
            r2 = r1
        L5b:
            r0.append(r2)
            java.lang.String r2 = ", msgType: "
            r0.append(r2)
            if (r12 == 0) goto L6e
            int r2 = r12.mo78013xfb85f7b0()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L6f
        L6e:
            r2 = r1
        L6f:
            r0.append(r2)
            java.lang.String r2 = ", msgId: "
            r0.append(r2)
            if (r12 == 0) goto L82
            long r2 = r12.m124847x74d37ac6()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L83
        L82:
            r2 = r1
        L83:
            r0.append(r2)
            java.lang.String r2 = ", msgSvrId: "
            r0.append(r2)
            if (r12 == 0) goto L95
            long r1 = r12.I0()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L95:
            r0.append(r1)
            java.lang.String r1 = ", uri: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = ", forWrite: false, mkDir: "
            r0.append(r13)
            r0.append(r14)
            r1 = 0
            r2 = 0
            r4 = 0
            r8 = 11
            r9 = 0
            r7 = 0
            r0 = r11
            r3 = r12
            r5 = r10
            Bi(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k90.b.mj(com.tencent.mm.storage.f9, java.lang.String, boolean):java.lang.String");
    }

    public final java.lang.String nj(java.lang.String str, boolean z17) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int length = str.length() - 1;
        int i17 = 0;
        boolean z18 = false;
        while (i17 <= length) {
            boolean z19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(str.charAt(!z18 ? i17 : length), 32) <= 0;
            if (z18) {
                if (!z19) {
                    break;
                }
                length--;
            } else if (z19) {
                i17++;
            } else {
                z18 = true;
            }
        }
        java.lang.String obj = str.subSequence(i17, length + 1).toString();
        if (r26.i0.A(obj, "THUMBNAIL://", false, 2, null)) {
            java.lang.String substring = obj.substring(12);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            try {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                obj = m11.b1.Di().C1(java.lang.Long.valueOf(java.lang.Long.parseLong(substring))).f404172g;
            } catch (java.lang.NumberFormatException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.C2CFileFeatureService", "read img buf failed: " + e17.getMessage());
                return null;
            }
        } else if (r26.i0.y(obj, "THUMBNAIL_DIRPATH://", false)) {
            obj = obj.substring(20);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "substring(...)");
            if (r26.i0.y(obj, "th_", false)) {
                java.lang.String substring2 = obj.substring(3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                return hj(substring2, "th_", "", z17);
            }
        }
        return hj(obj, "", "", z17);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String oj(oi3.g r12, java.lang.String r13, boolean r14, boolean r15) {
        /*
            r11 = this;
            java.lang.String r6 = r11.nj(r13, r14)
            java.lang.Class<xs.w0> r0 = xs.w0.class
            i95.m r0 = i95.n0.c(r0)
            xs.w0 r0 = (xs.w0) r0
            bm5.f0 r1 = bm5.f0.f104097i
            a80.b r0 = (a80.b) r0
            r0.getClass()
            bm5.x r2 = bm5.y.f104289i
            bm5.y r2 = r2.d(r12, r1)
            java.lang.String r0 = r0.aj(r2, r6, r15, r14)
            if (r0 != 0) goto L26
            if (r6 != 0) goto L24
            java.lang.String r0 = ""
            goto L26
        L24:
            r10 = r6
            goto L27
        L26:
            r10 = r0
        L27:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[f7]getFullThumbPath, businessType: "
            r0.<init>(r2)
            r2 = 0
            if (r12 == 0) goto L36
            bm5.v r3 = bm5.w.b(r12)
            goto L37
        L36:
            r3 = r2
        L37:
            r0.append(r3)
            java.lang.String r3 = ", resType: "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = ", oldPath: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", newPath: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ", talker: "
            r0.append(r1)
            if (r12 == 0) goto L62
            int r1 = r12.f427150d
            int r1 = r1 + 3
            java.lang.String r1 = r12.m75945x2fec8307(r1)
            goto L63
        L62:
            r1 = r2
        L63:
            r0.append(r1)
            java.lang.String r1 = ", msgType: "
            r0.append(r1)
            if (r12 == 0) goto L7a
            int r1 = r12.f427150d
            int r1 = r1 + 4
            int r1 = r12.m75939xb282bd08(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L7b
        L7a:
            r1 = r2
        L7b:
            r0.append(r1)
            java.lang.String r1 = ", msgId: "
            r0.append(r1)
            if (r12 == 0) goto L92
            int r1 = r12.f427150d
            int r1 = r1 + 0
            long r3 = r12.m75942xfb822ef2(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L93
        L92:
            r1 = r2
        L93:
            r0.append(r1)
            java.lang.String r1 = ", msgSvrId: "
            r0.append(r1)
            if (r12 == 0) goto La9
            int r1 = r12.f427150d
            int r1 = r1 + 1
            long r1 = r12.m75942xfb822ef2(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        La9:
            r0.append(r2)
            java.lang.String r1 = ", uri: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = ", forWrite: "
            r0.append(r13)
            r0.append(r15)
            java.lang.String r13 = ", mkDir: "
            r0.append(r13)
            r0.append(r14)
            java.lang.String r13 = r0.toString()
            r11.Ai(r13, r15)
            r1 = 0
            r3 = 0
            r4 = 0
            r8 = 13
            r9 = 0
            r0 = r11
            r2 = r12
            r5 = r10
            r7 = r15
            Bi(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k90.b.oj(oi3.g, java.lang.String, boolean, boolean):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0123, code lost:
    
        if (r26 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016d, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0144, code lost:
    
        if (r26 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016b, code lost:
    
        if (r26 == null) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String pj(bm5.y r24, java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k90.b.pj(bm5.y, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String qj(bm5.y r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k90.b.qj(bm5.y, boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String rj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r13, bm5.f0 r14, java.lang.String r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k90.b.rj(com.tencent.mm.storage.f9, bm5.f0, java.lang.String, boolean):java.lang.String");
    }

    public java.lang.String sj(oi3.g gVar, bm5.f0 resType, java.lang.String str, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resType, "resType");
        return qj(bm5.y.f104289i.e(gVar, resType, str), z17);
    }

    public java.lang.String tj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, boolean z17) {
        return qj(bm5.y.f104289i.b(f9Var, bm5.f0.f104105t, str), z17);
    }

    public java.lang.String uj(oi3.g gVar, java.lang.String str, boolean z17) {
        return qj(bm5.y.f104289i.e(gVar, bm5.f0.f104105t, str), z17);
    }

    public java.lang.String vj(bm5.y yVar, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
        java.lang.String wi6 = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).wi(yVar, str, null, z17, z17, c19772x1c2cd081);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[f9]getVoiceFullPath, businessType: ");
        sb6.append(yVar != null ? yVar.f104296f : null);
        sb6.append(", resType: ");
        sb6.append(yVar != null ? yVar.f104297g : null);
        sb6.append(", newVoicePath: ");
        sb6.append(wi6);
        sb6.append(", oldVoicePath: ");
        sb6.append(c19772x1c2cd081.f38869x6ac9171);
        sb6.append(", talker: ");
        sb6.append(yVar != null ? yVar.f104291a : null);
        sb6.append(", msgId: ");
        sb6.append(yVar != null ? java.lang.Long.valueOf(yVar.f104292b) : null);
        sb6.append(", msgSvrId: ");
        sb6.append(yVar != null ? java.lang.Long.valueOf(yVar.f104293c) : null);
        sb6.append(", forWrite: ");
        sb6.append(z17);
        Ai(sb6.toString(), z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wi6);
        Bi(this, null, null, null, yVar, wi6, c19772x1c2cd081.f38869x6ac9171, z17, 7, null);
        return wi6;
    }

    public java.lang.String wi(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        int O = r26.n0.O(str, '/', 0, false, 6, null);
        if (O < 0) {
            return "tmp_" + str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = O + 1;
        java.lang.String substring = str.substring(0, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        sb6.append(substring);
        sb6.append("tmp_");
        java.lang.String substring2 = str.substring(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
        sb6.append(substring2);
        return sb6.toString();
    }

    public java.lang.String wj(bm5.y yVar, java.lang.String str, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
        java.lang.String wi6 = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).wi(yVar, str, null, z17, z18, c19772x1c2cd081);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[f10]getVoiceFullPath, businessType: ");
        sb6.append(yVar != null ? yVar.f104296f : null);
        sb6.append(", resType: ");
        sb6.append(yVar != null ? yVar.f104297g : null);
        sb6.append(", newVoicePath: ");
        sb6.append(wi6);
        sb6.append(", oldVoicePath: ");
        sb6.append(c19772x1c2cd081.f38869x6ac9171);
        sb6.append(", talker: ");
        sb6.append(yVar != null ? yVar.f104291a : null);
        sb6.append(", msgId: ");
        sb6.append(yVar != null ? java.lang.Long.valueOf(yVar.f104292b) : null);
        sb6.append(", msgSvrId: ");
        sb6.append(yVar != null ? java.lang.Long.valueOf(yVar.f104293c) : null);
        sb6.append(", forWrite: ");
        sb6.append(z17);
        Ai(sb6.toString(), z18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wi6);
        Bi(this, null, null, null, yVar, wi6, c19772x1c2cd081.f38869x6ac9171, z17, 7, null);
        return wi6;
    }

    public java.lang.String xj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
        cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
        bm5.x xVar = bm5.y.f104289i;
        bm5.f0 f0Var = bm5.f0.f104106u;
        java.lang.String wi6 = ((bv.p0) h1Var).wi(xVar.a(f9Var, f0Var), str, str2, true, z17, c19772x1c2cd081);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[f12]getVoiceFullPath, businessType: ");
        sb6.append(f9Var != null ? bm5.w.a(f9Var) : null);
        sb6.append(", resType: ");
        sb6.append(f0Var);
        sb6.append(", newVoicePath: ");
        sb6.append(wi6);
        sb6.append(", oldVoicePath: ");
        sb6.append(c19772x1c2cd081.f38869x6ac9171);
        sb6.append(", talker: ");
        sb6.append(f9Var != null ? f9Var.Q0() : null);
        sb6.append(", msgType: ");
        sb6.append(f9Var != null ? java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()) : null);
        sb6.append(", msgId: ");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
        sb6.append(", msgSvrId: ");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.I0()) : null);
        sb6.append(", forWrite: ");
        sb6.append(z17);
        Ai(sb6.toString(), z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wi6);
        Bi(this, null, null, f9Var, null, wi6, c19772x1c2cd081.f38869x6ac9171, z17, 11, null);
        return wi6;
    }

    public java.lang.String yj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
        cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
        bm5.x xVar = bm5.y.f104289i;
        bm5.f0 f0Var = bm5.f0.f104106u;
        java.lang.String wi6 = ((bv.p0) h1Var).wi(xVar.a(f9Var, f0Var), str, null, z17, z17, c19772x1c2cd081);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[f11]getVoiceFullPath, businessType: ");
        sb6.append(f9Var != null ? bm5.w.a(f9Var) : null);
        sb6.append(", resType: ");
        sb6.append(f0Var);
        sb6.append(", newVoicePath: ");
        sb6.append(wi6);
        sb6.append(", oldVoicePath: ");
        sb6.append(c19772x1c2cd081.f38869x6ac9171);
        sb6.append(", talker: ");
        sb6.append(f9Var != null ? f9Var.Q0() : null);
        sb6.append(", msgType: ");
        sb6.append(f9Var != null ? java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()) : null);
        sb6.append(", msgId: ");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
        sb6.append(", msgSvrId: ");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.I0()) : null);
        sb6.append(", forWrite: ");
        sb6.append(z17);
        Ai(sb6.toString(), z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wi6);
        Bi(this, null, null, f9Var, null, wi6, c19772x1c2cd081.f38869x6ac9171, z17, 11, null);
        return wi6;
    }

    public boolean zj(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int O = r26.n0.O(str, '/', 0, false, 6, null);
        if (O >= 0) {
            str = str.substring(O + 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
        }
        return r26.i0.A(str, "tmp_", false, 2, null);
    }
}
