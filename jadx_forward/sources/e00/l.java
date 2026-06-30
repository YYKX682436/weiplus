package e00;

/* loaded from: classes9.dex */
public abstract class l {
    public static final byte[] a(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        try {
            return n51.d.a(str, 2);
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Cgi", str + " toBase64Bytes: " + e17.getMessage());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final bw5.u8 b(r45.br2 r10) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e00.l.b(r45.br2):bw5.u8");
    }

    public static final bw5.u8 c(w05.b bVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bVar, "<this>");
        bw5.u8 u8Var = new bw5.u8();
        u8Var.f115305d = bVar.n();
        boolean[] zArr = u8Var.f115317p1;
        zArr[1] = true;
        u8Var.f115306e = bVar.m173058x93d5ac12();
        zArr[2] = true;
        u8Var.f115307f = bVar.p();
        zArr[3] = true;
        u8Var.f115308g = bVar.o();
        zArr[4] = true;
        u8Var.f115309h = bVar.u();
        zArr[5] = true;
        u8Var.f115310i = bVar.m173056x74292566();
        zArr[6] = true;
        u8Var.o(bVar.y());
        u8Var.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(bVar.F()));
        u8Var.f115314o = bVar.m173057x66e287ae();
        zArr[9] = true;
        u8Var.f115315p = bVar.G();
        zArr[10] = true;
        u8Var.f115318q = bVar.w();
        zArr[11] = true;
        u8Var.f115319r = bVar.Q();
        zArr[12] = true;
        u8Var.p(bVar.z());
        u8Var.q(bVar.B());
        u8Var.f115322u = bVar.S();
        zArr[15] = true;
        u8Var.f115325x = bVar.l();
        zArr[18] = true;
        u8Var.f115327y = bVar.R();
        zArr[19] = true;
        u8Var.f115329z = bVar.A();
        zArr[20] = true;
        u8Var.A = bVar.s();
        zArr[21] = true;
        u8Var.B = bVar.r();
        zArr[22] = true;
        u8Var.C = bVar.P();
        zArr[23] = true;
        u8Var.D = bVar.O();
        zArr[24] = true;
        u8Var.E = bVar.q();
        zArr[25] = true;
        u8Var.F = bVar.N();
        zArr[26] = true;
        u8Var.G = bVar.Z();
        zArr[27] = true;
        u8Var.H = bVar.e0();
        zArr[28] = true;
        u8Var.I = bVar.t();
        zArr[29] = true;
        u8Var.f115304J = bVar.k();
        zArr[30] = true;
        u8Var.K = bVar.H();
        zArr[31] = true;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList T = bVar.T();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(T, 10));
        java.util.Iterator it = T.iterator();
        while (it.hasNext()) {
            arrayList.add(a((java.lang.String) it.next()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (((byte[]) next) != null) {
                arrayList2.add(next);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            byte[] bArr = (byte[]) it7.next();
            bw5.o5 o5Var = new bw5.o5();
            o5Var.mo11468x92b714fd(bArr);
            arrayList3.add(o5Var);
        }
        linkedList.addAll(arrayList3);
        u8Var.L = linkedList;
        zArr[32] = true;
        u8Var.M = bVar.C();
        zArr[33] = true;
        u8Var.N = bVar.E();
        zArr[34] = true;
        u8Var.P = bVar.f0();
        zArr[35] = true;
        u8Var.Q = bVar.j();
        zArr[36] = true;
        u8Var.R = bVar.I();
        zArr[37] = true;
        u8Var.S = bVar.J();
        zArr[38] = true;
        u8Var.T = bVar.b0();
        zArr[39] = true;
        u8Var.U = bVar.c0();
        zArr[40] = true;
        u8Var.V = bVar.V();
        zArr[41] = true;
        u8Var.W = bVar.W();
        zArr[42] = true;
        u8Var.X = bVar.d0();
        zArr[43] = true;
        u8Var.Y = bVar.a0();
        zArr[44] = true;
        u8Var.Z = bVar.Y();
        zArr[45] = true;
        u8Var.f115316p0 = bVar.U();
        zArr[46] = true;
        u8Var.f115326x0 = bVar.x();
        zArr[47] = true;
        bw5.a9 a9Var = null;
        if (bVar.K().length() > 0) {
            bw5.a9 a9Var2 = new bw5.a9();
            try {
                a9Var2.mo11468x92b714fd(n51.d.a(bVar.K(), 2));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                a9Var2 = null;
            }
            u8Var.f115328y0 = a9Var2;
            zArr[48] = true;
        }
        if (bVar.L().length() > 0) {
            bw5.a9 a9Var3 = new bw5.a9();
            try {
                a9Var3.mo11468x92b714fd(n51.d.a(bVar.L(), 2));
                a9Var = a9Var3;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
            }
            u8Var.f115311l1 = a9Var;
            zArr[49] = true;
        }
        return u8Var;
    }

    public static final bw5.g9 d(bw5.ue0 ue0Var) {
        java.lang.String str;
        java.util.LinkedList linkedList;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ue0Var, "<this>");
        bw5.g9 g9Var = new bw5.g9();
        bw5.v5 v5Var = ue0Var.f115407g[2] ? ue0Var.f115405e : new bw5.v5();
        g9Var.f109275d = ue0Var.b();
        boolean[] zArr = g9Var.R;
        zArr[1] = true;
        bw5.t5 b17 = v5Var.b();
        g9Var.f109276e = b17 != null ? b17.A[1] ? b17.f114780d : "" : null;
        zArr[2] = true;
        bw5.t5 b18 = v5Var.b();
        g9Var.f109277f = b18.A[2] ? b18.f114781e : "";
        zArr[3] = true;
        java.util.LinkedList<bw5.u5> linkedList2 = v5Var.f115680e;
        if (linkedList2 == null || (str = java.lang.Integer.valueOf(linkedList2.size()).toString()) == null) {
            str = "0";
        }
        g9Var.f109278g = str;
        zArr[4] = true;
        g9Var.f109283o = v5Var.c().d().m12798x74292946();
        zArr[9] = true;
        g9Var.f109284p = v5Var.c().d().m12799xfb83cc9b();
        zArr[10] = true;
        bw5.q7 d17 = v5Var.c().d();
        g9Var.f109285q = d17.f113520o[3] ? d17.f113514f : "";
        zArr[11] = true;
        g9Var.f109279h = v5Var.c().f().m13091x74292946();
        zArr[5] = true;
        g9Var.f109280i = v5Var.c().f().m13092xfb83cc9b();
        zArr[6] = true;
        g9Var.f109281m = v5Var.c().f().b();
        zArr[7] = true;
        bw5.t5 b19 = v5Var.b();
        g9Var.f109287s = b19.A[4] ? b19.f114783g : "";
        zArr[14] = true;
        if (linkedList2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
            for (bw5.u5 u5Var : linkedList2) {
                arrayList.add(u5Var.f115272h[2] ? u5Var.f115269e : "");
            }
            linkedList = new java.util.LinkedList(arrayList);
        } else {
            linkedList = new java.util.LinkedList();
        }
        g9Var.f109288t = linkedList;
        zArr[15] = true;
        bw5.t5 b27 = v5Var.b();
        java.lang.String str3 = b27.A[6] ? b27.f114785i : "";
        if (str3 == null || str3.length() == 0) {
            str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lv9);
        } else {
            bw5.t5 b28 = v5Var.b();
            str2 = b28.A[6] ? b28.f114785i : "";
        }
        g9Var.f109290v = str2;
        zArr[17] = true;
        bw5.t5 b29 = v5Var.b();
        g9Var.f109291w = b29.A[5] ? b29.f114784h : "";
        zArr[18] = true;
        g9Var.f109292x = v5Var.b().f114789p ? "1" : "";
        zArr[19] = true;
        bw5.t5 b37 = v5Var.b();
        g9Var.A = b37.A[13] ? b37.f114792s : "";
        zArr[22] = true;
        bw5.t5 b38 = v5Var.b();
        g9Var.B = b38.A[14] ? b38.f114793t : "";
        zArr[23] = true;
        bw5.t5 b39 = v5Var.b();
        g9Var.f109294z = b39.A[12] ? b39.f114791r : "";
        zArr[21] = true;
        bw5.t5 b47 = v5Var.b();
        g9Var.f109293y = b47.A[11] ? b47.f114790q : "";
        zArr[20] = true;
        bw5.t5 b48 = v5Var.b();
        g9Var.C = b48.A[16] ? b48.f114795v : "";
        zArr[24] = true;
        bw5.s5 b49 = v5Var.b().b();
        g9Var.D = b49 != null ? b49.f114342r[2] ? b49.f114332e : "" : null;
        zArr[25] = true;
        g9Var.E = b49 != null ? b49.f114342r[3] ? b49.f114333f : "" : null;
        zArr[26] = true;
        g9Var.F = b49 != null ? b49.f114342r[1] ? b49.f114331d : "" : null;
        zArr[27] = true;
        g9Var.G = b49 != null ? b49.f114342r[4] ? b49.f114334g : "" : null;
        zArr[28] = true;
        g9Var.H = b49 != null ? b49.f114342r[5] ? b49.f114335h : "" : null;
        zArr[29] = true;
        g9Var.I = b49 != null ? b49.f114342r[6] ? b49.f114336i : "" : null;
        zArr[30] = true;
        g9Var.f109274J = b49 != null ? b49.f114342r[7] ? b49.f114337m : "" : null;
        zArr[31] = true;
        g9Var.K = b49 != null ? b49.f114338n : 0;
        zArr[32] = true;
        g9Var.L = b49 != null ? b49.f114339o : 0;
        zArr[33] = true;
        g9Var.M = b49 != null ? b49.f114340p : 0;
        zArr[34] = true;
        g9Var.N = b49 != null ? b49.f114341q : 0;
        zArr[35] = true;
        bw5.t5 b57 = v5Var.b();
        g9Var.P = b57.A[25] ? b57.f114798y : "";
        zArr[36] = true;
        bw5.t5 b58 = v5Var.b();
        g9Var.Q = b58.A[26] ? b58.f114799z : "";
        zArr[37] = true;
        return g9Var;
    }

    public static final bw5.g9 e(s15.k kVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        bw5.g9 g9Var = new bw5.g9();
        g9Var.f109275d = kVar.m163597x93d5ac12();
        boolean[] zArr = g9Var.R;
        zArr[1] = true;
        g9Var.f109276e = kVar.k();
        zArr[2] = true;
        g9Var.f109277f = kVar.m163598x8010e5e4();
        zArr[3] = true;
        g9Var.f109278g = kVar.o();
        zArr[4] = true;
        g9Var.f109279h = kVar.m163596x74292566();
        zArr[5] = true;
        g9Var.f109280i = kVar.m163599xfb83cc9b();
        zArr[6] = true;
        g9Var.f109281m = kVar.j();
        zArr[7] = true;
        g9Var.f109282n = kVar.B();
        zArr[8] = true;
        g9Var.f109283o = kVar.r();
        zArr[9] = true;
        g9Var.f109284p = kVar.s();
        zArr[10] = true;
        g9Var.f109285q = kVar.t();
        zArr[11] = true;
        g9Var.f109286r = kVar.w();
        zArr[12] = true;
        g9Var.f109287s = kVar.G();
        zArr[14] = true;
        g9Var.l(kVar.q());
        g9Var.f109290v = kVar.A();
        zArr[17] = true;
        g9Var.f109291w = kVar.H();
        zArr[18] = true;
        g9Var.f109292x = kVar.S();
        zArr[19] = true;
        g9Var.f109293y = kVar.u();
        zArr[20] = true;
        g9Var.f109294z = kVar.n();
        zArr[21] = true;
        g9Var.B = kVar.I();
        zArr[23] = true;
        g9Var.A = kVar.l();
        zArr[22] = true;
        g9Var.C = kVar.p();
        zArr[24] = true;
        g9Var.f109288t = kVar.x();
        zArr[15] = true;
        g9Var.D = kVar.C();
        zArr[25] = true;
        g9Var.E = kVar.E();
        zArr[26] = true;
        g9Var.F = kVar.F();
        zArr[27] = true;
        g9Var.G = kVar.P();
        zArr[28] = true;
        g9Var.H = kVar.Q();
        zArr[29] = true;
        g9Var.I = kVar.K();
        zArr[30] = true;
        g9Var.f109274J = kVar.L();
        zArr[31] = true;
        g9Var.K = kVar.R();
        zArr[32] = true;
        g9Var.L = kVar.O();
        zArr[33] = true;
        g9Var.M = kVar.N();
        zArr[34] = true;
        g9Var.N = kVar.J();
        zArr[35] = true;
        g9Var.P = kVar.y();
        zArr[36] = true;
        g9Var.Q = kVar.z();
        zArr[37] = true;
        return g9Var;
    }

    public static final bw5.g9 f(w05.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<this>");
        bw5.g9 g9Var = new bw5.g9();
        g9Var.f109275d = aVar.m173053x93d5ac12();
        boolean[] zArr = g9Var.R;
        zArr[1] = true;
        g9Var.f109276e = aVar.k();
        zArr[2] = true;
        g9Var.f109277f = aVar.m173054x8010e5e4();
        zArr[3] = true;
        g9Var.f109278g = aVar.o();
        zArr[4] = true;
        g9Var.f109279h = aVar.m173051x74292566();
        zArr[5] = true;
        g9Var.f109280i = aVar.m173055xfb83cc9b();
        zArr[6] = true;
        g9Var.f109281m = aVar.j();
        zArr[7] = true;
        g9Var.f109282n = aVar.B();
        zArr[8] = true;
        g9Var.f109283o = aVar.r();
        zArr[9] = true;
        g9Var.f109284p = aVar.s();
        zArr[10] = true;
        g9Var.f109285q = aVar.t();
        zArr[11] = true;
        g9Var.f109286r = aVar.w();
        zArr[12] = true;
        g9Var.f109287s = aVar.G();
        zArr[14] = true;
        g9Var.l(aVar.q());
        g9Var.f109290v = aVar.A();
        zArr[17] = true;
        g9Var.f109291w = aVar.H();
        zArr[18] = true;
        g9Var.f109292x = aVar.R();
        zArr[19] = true;
        g9Var.f109293y = aVar.u();
        zArr[20] = true;
        g9Var.f109294z = aVar.n();
        zArr[21] = true;
        g9Var.B = aVar.m173052x730bcac6();
        zArr[23] = true;
        g9Var.A = aVar.l();
        zArr[22] = true;
        g9Var.C = aVar.p();
        zArr[24] = true;
        g9Var.f109288t = aVar.x();
        zArr[15] = true;
        g9Var.D = aVar.C();
        zArr[25] = true;
        g9Var.E = aVar.E();
        zArr[26] = true;
        g9Var.F = aVar.F();
        zArr[27] = true;
        g9Var.G = aVar.O();
        zArr[28] = true;
        g9Var.H = aVar.P();
        zArr[29] = true;
        g9Var.I = aVar.J();
        zArr[30] = true;
        g9Var.f109274J = aVar.K();
        zArr[31] = true;
        g9Var.K = aVar.Q();
        zArr[32] = true;
        g9Var.L = aVar.N();
        zArr[33] = true;
        g9Var.M = aVar.L();
        zArr[34] = true;
        g9Var.N = aVar.I();
        zArr[35] = true;
        g9Var.P = aVar.y();
        zArr[36] = true;
        g9Var.Q = aVar.z();
        zArr[37] = true;
        return g9Var;
    }

    public static final r45.br2 g(bw5.u8 u8Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(u8Var, "<this>");
        r45.br2 br2Var = new r45.br2();
        br2Var.set(0, u8Var.c());
        br2Var.set(1, u8Var.m13096x93d5ac12());
        boolean[] zArr = u8Var.f115317p1;
        br2Var.set(2, zArr[3] ? u8Var.f115307f : "");
        br2Var.set(3, zArr[4] ? u8Var.f115308g : "");
        br2Var.set(4, zArr[5] ? u8Var.f115309h : "");
        br2Var.set(5, zArr[6] ? u8Var.f115310i : "");
        br2Var.set(6, u8Var.f());
        br2Var.set(7, java.lang.String.valueOf(u8Var.f115313n));
        br2Var.set(8, zArr[9] ? u8Var.f115314o : "");
        br2Var.set(9, u8Var.i());
        br2Var.set(10, java.lang.Integer.valueOf(u8Var.f115318q));
        br2Var.set(11, java.lang.Integer.valueOf(u8Var.f115319r));
        br2Var.set(12, zArr[13] ? u8Var.f115320s : "");
        br2Var.set(13, zArr[14] ? u8Var.f115321t : "");
        br2Var.set(14, zArr[15] ? u8Var.f115322u : "");
        br2Var.set(15, java.lang.Integer.valueOf(u8Var.f115323v));
        br2Var.set(16, java.lang.Long.valueOf(u8Var.f115324w));
        br2Var.set(17, zArr[18] ? u8Var.f115325x : "");
        br2Var.set(18, zArr[19] ? u8Var.f115327y : "");
        br2Var.set(19, zArr[20] ? u8Var.f115329z : "");
        br2Var.set(20, zArr[21] ? u8Var.A : "");
        br2Var.set(21, java.lang.Float.valueOf(u8Var.B));
        br2Var.set(22, zArr[23] ? u8Var.C : "");
        br2Var.set(23, java.lang.Float.valueOf(u8Var.D));
        br2Var.set(24, u8Var.d());
        br2Var.set(25, u8Var.l());
        br2Var.set(26, u8Var.n());
        br2Var.set(27, java.lang.Boolean.valueOf(u8Var.H));
        br2Var.set(28, zArr[29] ? u8Var.I : "");
        br2Var.set(29, u8Var.b());
        br2Var.set(30, zArr[31] ? u8Var.K : "");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList<bw5.o5> linkedList2 = u8Var.L;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList2, "getShowBoxItemList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
        for (bw5.o5 o5Var : linkedList2) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o5Var);
            r45.p56 p56Var = new r45.p56();
            byte[] mo14344x5f01b1f6 = o5Var.mo14344x5f01b1f6();
            if (mo14344x5f01b1f6 != null) {
                try {
                    p56Var.mo11468x92b714fd(mo14344x5f01b1f6);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            arrayList.add(p56Var);
        }
        linkedList.addAll(arrayList);
        br2Var.set(31, linkedList);
        br2Var.set(32, u8Var.g());
        br2Var.set(33, zArr[34] ? u8Var.N : "");
        br2Var.set(34, zArr[35] ? u8Var.P : "");
        br2Var.set(35, zArr[36] ? u8Var.Q : "");
        br2Var.set(36, zArr[37] ? u8Var.R : "");
        br2Var.set(37, zArr[38] ? u8Var.S : "");
        br2Var.set(38, zArr[39] ? u8Var.T : "");
        br2Var.set(39, zArr[40] ? u8Var.U : "");
        br2Var.set(40, zArr[41] ? u8Var.V : "");
        br2Var.set(41, zArr[42] ? u8Var.W : "");
        br2Var.set(42, java.lang.Integer.valueOf(u8Var.X));
        br2Var.set(43, java.lang.Integer.valueOf(u8Var.Y));
        br2Var.set(44, java.lang.Integer.valueOf(u8Var.Z));
        br2Var.set(45, java.lang.Integer.valueOf(u8Var.f115316p0));
        br2Var.set(46, u8Var.e());
        if (u8Var.j() != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u8Var.j().f106620d, "getTexts(...)");
            if (!r1.isEmpty()) {
                br2Var.set(47, new java.lang.String(n51.d.b(u8Var.j().mo14344x5f01b1f6(), 2), r26.c.f450398a));
            }
        }
        if (u8Var.k() != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u8Var.k().f106620d, "getTexts(...)");
            if (!r1.isEmpty()) {
                br2Var.set(48, new java.lang.String(n51.d.b(u8Var.k().mo14344x5f01b1f6(), 2), r26.c.f450398a));
            }
        }
        return br2Var;
    }
}
