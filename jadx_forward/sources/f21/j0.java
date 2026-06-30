package f21;

/* loaded from: classes8.dex */
public class j0 extends l75.s0 implements rz.p {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f340461e = {"CREATE TABLE IF NOT EXISTS packageinfo ( id int  PRIMARY KEY, version int  , name text  , size int  , packname text  , status int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) ", "CREATE TABLE IF NOT EXISTS packageinfo2 ( localId text  PRIMARY KEY , id int  , version int  , name text  , size int  , packname text  , status int  , type int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f340462d;

    public j0(l75.k0 k0Var) {
        this.f340462d = k0Var;
    }

    public f21.i0[] D0(int i17) {
        android.database.Cursor f17 = this.f340462d.f("select packageinfo2.localId,packageinfo2.id,packageinfo2.version,packageinfo2.name,packageinfo2.size,packageinfo2.packname,packageinfo2.status,packageinfo2.type,packageinfo2.reserved1,packageinfo2.reserved2,packageinfo2.reserved3,packageinfo2.reserved4 from packageinfo2   where packageinfo2.type=" + i17, null, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            f21.i0 i0Var = new f21.i0();
            i0Var.a(f17);
            arrayList.add(i0Var);
        }
        f17.close();
        return (f21.i0[]) arrayList.toArray(new f21.i0[arrayList.size()]);
    }

    public boolean J0(f21.i0 i0Var) {
        if (i0Var == null) {
            return false;
        }
        i0Var.f340457l = -1;
        if (((int) this.f340462d.l("packageinfo2", dm.i4.f66867x2a5c95c7, i0Var.b())) == -1) {
            return false;
        }
        m145262xf35bbb4();
        return true;
    }

    public void L0(int i17, int i18) {
        com.p314xaae8f345.mm.vfs.w6.h(zz1.a.a() + u0(i17, i18));
        f21.i0 z07 = z0(i17, i18);
        if (z07 != null) {
            z07.f340451f = 5;
            f21.r0.Bi().P0(z07);
        }
    }

    public boolean P0(f21.i0 i0Var) {
        iz5.a.g(null, i0Var != null);
        android.content.ContentValues b17 = i0Var.b();
        if (b17.size() > 0) {
            if (this.f340462d.p("packageinfo2", b17, "id= ? and type =?", new java.lang.String[]{i0Var.f340446a + "", i0Var.f340452g + ""}) > 0) {
                m145262xf35bbb4();
                return true;
            }
        }
        m145262xf35bbb4();
        return false;
    }

    public boolean m0(int i17) {
        boolean A = this.f340462d.A("packageinfo2", "update packageinfo2 set status = 2 where status = 1 and type = " + i17 + ";");
        m145262xf35bbb4();
        return A;
    }

    public boolean n0(int i17) {
        if (this.f340462d.mo70514xb06685ab("packageinfo2", "type =?", new java.lang.String[]{"" + i17}) <= 0) {
            return false;
        }
        m145262xf35bbb4();
        return true;
    }

    public java.lang.String s0(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PackageInfoStorage", "genCustomChattingBgPath() called with: username = [" + str + "], portrait = [" + z17 + "]");
        if (z17) {
            return zz1.a.a() + str + "_chatting_bg_vertical.jpg";
        }
        return zz1.a.a() + str + "_chatting_bg_horizontal.jpg";
    }

    public java.lang.String u0(int i17, int i18) {
        if (i18 == 1) {
            return i17 + "_session_bg.zip";
        }
        if (i18 == 2) {
            return i17 + "_emoji_art.temp";
        }
        if (i18 == 5) {
            return "brand_i18n.apk";
        }
        if (i18 == 7) {
            return i17 + "_configlist.cfg";
        }
        if (i18 == 9) {
            return "_speex_upload.cfg";
        }
        if (i18 == 12) {
            return "_rcpt_addr";
        }
        if (i18 == 23) {
            return "permissioncfg.cfg";
        }
        if (i18 == 26) {
            return "ipcallCountryCodeConfig.cfg";
        }
        if (i18 == 36) {
            return i17 + "_sensewhere.xml";
        }
        switch (i18) {
            case 18:
                return z0(i17, i18).f340447b + "_feature.zip";
            case 19:
                return "_report_reason.temp";
            case 20:
                return "_pluginDesc.cfg";
            case 21:
                return "_trace_config.cfg";
            default:
                return "";
        }
    }

    public java.lang.String y0(int i17, int i18) {
        if (i18 != 1) {
            if (i18 != 18) {
                return "";
            }
            return zz1.a.a() + u0(i17, i18).replace(".zip", "");
        }
        java.lang.String str = zz1.a.a() + i17 + "_session_bg/";
        try {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            boolean z17 = false;
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (m17.a()) {
                z17 = m17.f294799a.F(m17.f294800b);
            }
            if (!z17) {
                com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
                if (m18.a()) {
                    m18.f294799a.r(m18.f294800b);
                }
            }
        } catch (java.lang.Exception e17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PackageInfoStorage", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PackageInfoStorage", "can not create dir, dir = " + str);
        }
        return str;
    }

    public f21.i0 z0(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select packageinfo2.localId,packageinfo2.id,packageinfo2.version,packageinfo2.name,packageinfo2.size,packageinfo2.packname,packageinfo2.status,packageinfo2.type,packageinfo2.reserved1,packageinfo2.reserved2,packageinfo2.reserved3,packageinfo2.reserved4 from packageinfo2   where packageinfo2.id = \"");
        java.lang.String str = "" + i17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("\" and packageinfo2.type = \"");
        java.lang.String str2 = "" + i18;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str2);
        sb6.append(str2);
        sb6.append("\"");
        f21.i0 i0Var = null;
        android.database.Cursor f17 = this.f340462d.f(sb6.toString(), null, 2);
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            i0Var = new f21.i0();
            i0Var.a(f17);
        }
        f17.close();
        return i0Var;
    }
}
