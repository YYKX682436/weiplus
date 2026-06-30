package zf4;

/* loaded from: classes13.dex */
public abstract class r {
    public static boolean a(java.lang.String str) {
        if (str == null) {
            return false;
        }
        zf4.q c17 = c(str);
        if (c17 == null) {
            return true;
        }
        int i17 = c17.f68512x36ef078a;
        if (i17 != 0) {
            pt0.f0.P7(c17.f68519x22628ff0, i17);
        }
        zf4.l.Bi().d(str);
        zf4.b0 Bi = zf4.l.Bi();
        java.lang.String b17 = b(str, false);
        java.util.HashMap hashMap = (java.util.HashMap) Bi.f554183e;
        zf4.i iVar = (zf4.i) hashMap.get(b17);
        if (iVar != null) {
            java.io.RandomAccessFile randomAccessFile = iVar.f554202a;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                    iVar.f554202a = null;
                } catch (java.io.IOException unused) {
                }
            }
            hashMap.remove(b17);
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(b(str, false));
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        return m17.a() && m17.f294799a.d(m17.f294800b);
    }

    public static java.lang.String b(java.lang.String str, boolean z17) {
        c01.d9.b().getClass();
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.h1.c(ys3.l.a(), "recbiz_", str, ".rec", 2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
            return null;
        }
        if (z17) {
            return c17;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(c17);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a()) {
            m17.f294799a.F(m17.f294800b);
        }
        return c17;
    }

    public static zf4.q c(java.lang.String str) {
        zf4.q qVar;
        android.database.Cursor f17 = zf4.l.Bi().f554182d.f("SELECT filename, user, msgid, offset, filenowsize, totallen, status, createtime, lastmodifytime, clientid, voicelenght, msglocalid, human, voiceformat, nettimes, reserved1, reserved2 FROM VoiceRemindInfo WHERE filename= ?", new java.lang.String[]{str}, 2);
        if (f17.moveToFirst()) {
            qVar = new zf4.q();
            qVar.mo9015xbf5d97fd(f17);
        } else {
            qVar = null;
        }
        f17.close();
        return qVar;
    }

    public static zf4.i d(java.lang.String str) {
        zf4.b0 Bi = zf4.l.Bi();
        java.lang.String b17 = b(str, false);
        java.util.HashMap hashMap = (java.util.HashMap) Bi.f554183e;
        if (hashMap.get(b17) == null) {
            hashMap.put(b17, new zf4.i(b17));
        }
        return (zf4.i) hashMap.get(b17);
    }

    public static boolean e(java.lang.String str) {
        if (str == null) {
            return false;
        }
        zf4.q c17 = c(str);
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceRemindLogic", "Set error failed file:".concat(str));
            return false;
        }
        c17.f68517x10a0fed7 = 98;
        c17.f68510x8de42782 = java.lang.System.currentTimeMillis() / 1000;
        c17.U = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e;
        boolean f17 = f(c17);
        if (c17.f68512x36ef078a == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f68519x22628ff0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceRemindLogic", "setError failed msg id:" + c17.f68512x36ef078a + " user:" + c17.f68519x22628ff0);
            return f17;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(c17.f68519x22628ff0, c17.f68512x36ef078a);
        Li.m124849x5361953a(c17.f68512x36ef078a);
        Li.r1(5);
        Li.u1(c17.f68519x22628ff0);
        Li.d1(zf4.p.a(c17.f68509x293941a8, -1L, true));
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(Li.m124847x74d37ac6(), Li, true);
        return f17;
    }

    public static boolean f(zf4.q qVar) {
        if (qVar == null || qVar.U == -1) {
            return false;
        }
        zf4.b0 Bi = zf4.l.Bi();
        java.lang.String str = qVar.f68507xf1f75bac;
        Bi.getClass();
        iz5.a.g(null, str.length() > 0);
        android.content.ContentValues mo9763xeb27878e = qVar.mo9763xeb27878e();
        if (mo9763xeb27878e.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceRemindStorage", "update failed, no values set");
            return false;
        }
        if (Bi.f554182d.p("VoiceRemindInfo", mo9763xeb27878e, "filename= ?", new java.lang.String[]{str}) <= 0) {
            return false;
        }
        Bi.m145262xf35bbb4();
        return true;
    }
}
