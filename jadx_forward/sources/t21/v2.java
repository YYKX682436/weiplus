package t21;

/* loaded from: classes12.dex */
public class v2 {
    public long K;
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String O;
    public r45.xz6 Q;
    public java.lang.String S;
    public int T;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f496534a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f496536b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f496538c0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f496553r;
    public java.lang.String B = "";
    public java.lang.String C = "";
    public java.lang.String D = "";
    public boolean P = false;
    public java.lang.String R = "";
    public int U = -1;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f496533a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f496535b = "";

    /* renamed from: c, reason: collision with root package name */
    public long f496537c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f496539d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f496540e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f496541f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f496542g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f496543h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f496544i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f496545j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f496546k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f496547l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f496548m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f496549n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f496550o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f496551p = 0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f496552q = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f496554s = "";

    /* renamed from: t, reason: collision with root package name */
    public int f496555t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f496556u = 0;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f496557v = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f496558w = "";

    /* renamed from: x, reason: collision with root package name */
    public int f496559x = 0;

    /* renamed from: y, reason: collision with root package name */
    public long f496560y = 0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f496561z = "";
    public java.lang.String A = "";
    public r45.uf6 E = new r45.uf6();
    public java.lang.String F = "";
    public int G = 0;
    public r45.vh4 H = new r45.vh4();
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public int f496532J = 0;

    public v2() {
        this.Q = null;
        this.Q = null;
    }

    public static java.lang.String c(java.lang.String str) {
        try {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msg", null);
            return d17 != null ? (java.lang.String) d17.get(".msg.videomsg.$cdnvideourl") : "";
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public void a(android.database.Cursor cursor) {
        this.f496533a = cursor.getString(0);
        this.f496535b = cursor.getString(1);
        this.f496537c = cursor.getLong(2);
        this.f496539d = cursor.getInt(3);
        this.f496540e = cursor.getInt(4);
        this.f496541f = cursor.getInt(5);
        this.f496542g = cursor.getInt(6);
        this.f496543h = cursor.getInt(7);
        this.f496544i = cursor.getInt(8);
        this.f496545j = cursor.getLong(9);
        this.f496546k = cursor.getLong(10);
        this.f496547l = cursor.getLong(11);
        this.f496548m = cursor.getInt(12);
        this.f496549n = cursor.getLong(13);
        this.f496550o = cursor.getInt(14);
        this.f496551p = cursor.getInt(15);
        this.f496552q = cursor.getString(16);
        this.f496554s = cursor.getString(17);
        this.f496555t = cursor.getInt(18);
        this.f496556u = cursor.getInt(19);
        this.f496557v = cursor.getString(20);
        this.f496558w = cursor.getString(21);
        this.f496559x = cursor.getInt(22);
        this.f496560y = cursor.getLong(23);
        this.f496561z = cursor.getString(24);
        this.A = cursor.getString(25);
        byte[] blob = cursor.getBlob(26);
        r45.uf6 uf6Var = new r45.uf6();
        this.E = uf6Var;
        try {
            uf6Var.mo11468x92b714fd(blob);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoInfo", e17, "", new java.lang.Object[0]);
        }
        this.F = cursor.getString(27);
        this.G = cursor.getInt(28);
        byte[] blob2 = cursor.getBlob(29);
        r45.vh4 vh4Var = new r45.vh4();
        this.H = vh4Var;
        try {
            vh4Var.mo11468x92b714fd(blob2);
        } catch (java.lang.Exception unused) {
        }
        this.I = cursor.getInt(30);
        this.f496532J = cursor.getInt(31);
        this.K = cursor.getInt(32);
        this.M = cursor.getString(33);
        this.N = cursor.getString(34);
        this.S = cursor.getString(35);
        this.T = cursor.getInt(36);
        this.O = cursor.getString(37);
        this.B = cursor.getString(38);
        this.C = cursor.getString(39);
        this.D = cursor.getString(40);
        byte[] blob3 = cursor.getBlob(41);
        r45.xz6 xz6Var = new r45.xz6();
        this.Q = xz6Var;
        try {
            xz6Var.mo11468x92b714fd(blob3);
        } catch (java.lang.Exception unused2) {
        }
        this.R = cursor.getString(42);
        this.f496553r = cursor.getString(43);
        this.L = cursor.getString(44);
    }

    public android.content.ContentValues b() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.U & 1) != 0) {
            contentValues.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37650x1214b17, d());
        }
        if ((this.U & 2) != 0) {
            java.lang.String str = this.f496535b;
            if (str == null) {
                str = "";
            }
            contentValues.put("clientid", str);
        }
        if ((this.U & 4) != 0) {
            contentValues.put("msgsvrid", java.lang.Long.valueOf(this.f496537c));
        }
        if ((this.U & 8) != 0) {
            contentValues.put("netoffset", java.lang.Integer.valueOf(this.f496539d));
        }
        if ((this.U & 16) != 0) {
            contentValues.put("filenowsize", java.lang.Integer.valueOf(this.f496540e));
        }
        if ((this.U & 32) != 0) {
            contentValues.put("totallen", java.lang.Integer.valueOf(this.f496541f));
        }
        if ((this.U & 64) != 0) {
            contentValues.put("thumbnetoffset", java.lang.Integer.valueOf(this.f496542g));
        }
        if ((this.U & 128) != 0) {
            contentValues.put("thumblen", java.lang.Integer.valueOf(this.f496543h));
        }
        if ((this.U & 256) != 0) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f496544i));
        }
        if ((this.U & 512) != 0) {
            contentValues.put("createtime", java.lang.Long.valueOf(this.f496545j));
        }
        if ((this.U & 1024) != 0) {
            contentValues.put("lastmodifytime", java.lang.Long.valueOf(this.f496546k));
        }
        if ((this.U & 2048) != 0) {
            contentValues.put("downloadtime", java.lang.Long.valueOf(this.f496547l));
        }
        if ((this.U & 4096) != 0) {
            contentValues.put("videolength", java.lang.Integer.valueOf(this.f496548m));
        }
        if ((this.U & 8192) != 0) {
            contentValues.put("msglocalid", java.lang.Long.valueOf(this.f496549n));
        }
        if ((this.U & 16384) != 0) {
            contentValues.put("nettimes", java.lang.Integer.valueOf(this.f496550o));
        }
        if ((this.U & 32768) != 0) {
            contentValues.put("cameratype", java.lang.Integer.valueOf(this.f496551p));
        }
        if ((this.U & 65536) != 0) {
            contentValues.put("user", h());
        }
        if ((this.U & 131072) != 0) {
            contentValues.put("human", e());
        }
        if ((this.U & 262144) != 0) {
            contentValues.put("reserved1", java.lang.Integer.valueOf(this.f496555t));
        }
        if ((this.U & 524288) != 0) {
            contentValues.put("reserved2", java.lang.Integer.valueOf(this.f496556u));
        }
        if ((this.U & 1048576) != 0) {
            contentValues.put("reserved3", f());
        }
        if ((this.U & 2097152) != 0) {
            contentValues.put("reserved4", g());
        }
        if ((this.U & 4194304) != 0) {
            contentValues.put("videofuncflag", java.lang.Integer.valueOf(this.f496559x));
        }
        if ((this.U & 8388608) != 0) {
            contentValues.put("masssendid", java.lang.Long.valueOf(this.f496560y));
        }
        if ((this.U & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) != 0) {
            contentValues.put("masssendlist", this.f496561z);
        }
        if ((this.U & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432) != 0) {
            contentValues.put("videomd5", this.A);
        }
        if ((this.U & 67108864) != 0) {
            byte[] bArr = new byte[0];
            try {
                bArr = this.E.mo14344x5f01b1f6();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoInfo", e17, "", new java.lang.Object[0]);
            }
            contentValues.put("streamvideo", bArr);
        }
        if ((this.U & 134217728) != 0) {
            contentValues.put("statextstr", this.F);
        }
        if ((this.U & 268435456) != 0) {
            contentValues.put("downloadscene", java.lang.Integer.valueOf(this.G));
        }
        if ((this.U & com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965) != 0) {
            byte[] bArr2 = new byte[0];
            try {
                bArr2 = this.H.mo14344x5f01b1f6();
            } catch (java.lang.Exception unused) {
            }
            contentValues.put("mmsightextinfo", bArr2);
        }
        if ((this.U & 1) != 0) {
            contentValues.put("preloadsize", java.lang.Integer.valueOf(this.I));
        }
        if ((this.U & 2) != 0) {
            contentValues.put("videoformat", java.lang.Integer.valueOf(this.f496532J));
        }
        if (this.V) {
            contentValues.put("forward_msg_local_id", java.lang.Long.valueOf(this.K));
        }
        if (this.W) {
            contentValues.put("msg_uuid", this.M);
        }
        if (this.X) {
            contentValues.put("share_app_info", this.N);
        }
        if (this.Y) {
            contentValues.put("origin_file_name", this.S);
        }
        if (this.Z) {
            contentValues.put("had_clicked_video", java.lang.Boolean.valueOf(this.T == 1));
        }
        if (this.P) {
            contentValues.put("media_id", this.O);
        }
        if (!android.text.TextUtils.isEmpty(this.B)) {
            contentValues.put("media_flag", this.B);
        }
        if (!android.text.TextUtils.isEmpty(this.C)) {
            contentValues.put("video_path", this.C);
        }
        if (!android.text.TextUtils.isEmpty(this.D)) {
            contentValues.put("media_cdnid", this.D);
        }
        r45.xz6 xz6Var = this.Q;
        if (xz6Var != null) {
            byte[] bArr3 = new byte[0];
            try {
                bArr3 = xz6Var.mo14344x5f01b1f6();
            } catch (java.lang.Exception unused2) {
            }
            contentValues.put("video_wxa_info", bArr3);
        }
        if (this.f496534a0) {
            contentValues.put("weapp_source_username", this.R);
        }
        if (this.f496536b0) {
            contentValues.put("msg_talker", this.f496553r);
        }
        if (this.f496538c0) {
            contentValues.put("forward_msg_talker", this.L);
        }
        return contentValues;
    }

    public java.lang.String d() {
        java.lang.String str = this.f496533a;
        return str == null ? "" : str;
    }

    public java.lang.String e() {
        java.lang.String str = this.f496554s;
        return str == null ? "" : str;
    }

    public java.lang.String f() {
        java.lang.String str = this.f496557v;
        return str == null ? "" : str;
    }

    public java.lang.String g() {
        java.lang.String str = this.f496558w;
        return str == null ? "" : str;
    }

    public java.lang.String h() {
        java.lang.String str = this.f496552q;
        return str == null ? "" : str;
    }

    public boolean i() {
        int i17 = this.f496544i;
        if (i17 != 199 && i17 != 199 && i17 != 143) {
            return false;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_video_info_error_repair, true) && !android.text.TextUtils.isEmpty(this.C) && !android.text.TextUtils.isEmpty(this.f496533a) && this.f496533a.contains("sns_table")) {
            if (com.p314xaae8f345.mm.vfs.w6.k(this.C) <= 0) {
                return false;
            }
            if (this.f496541f > 0 && com.p314xaae8f345.mm.vfs.w6.k(this.C) < this.f496541f) {
                return false;
            }
        }
        return true;
    }

    public boolean j() {
        int i17 = this.f496544i;
        return i17 == 121 || i17 == 122 || i17 == 120 || i17 == 123;
    }

    public boolean k() {
        int i17 = this.f496544i;
        return i17 == 140 || i17 == 141 || i17 == 142 || i17 == 144;
    }

    public void l(com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5) {
        if (c16564xb55e1d5 != null) {
            this.K = c16564xb55e1d5.f231013d;
            this.V = true;
            this.L = c16564xb55e1d5.a();
            this.f496538c0 = true;
        }
    }

    public void m(long j17) {
        this.f496549n = j17;
    }

    public void n(java.lang.String str) {
        this.f496553r = str;
        this.f496536b0 = true;
    }

    public void o(java.lang.String str) {
        this.S = str;
        this.Y = true;
    }

    public void p(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        if (this.E == null) {
            this.E = new r45.uf6();
        }
        r45.uf6 uf6Var = this.E;
        uf6Var.f468870h = str2;
        uf6Var.f468867e = i17;
        uf6Var.f468866d = str;
        uf6Var.f468868f = str3;
        uf6Var.f468869g = str4;
        uf6Var.f468872m = str5;
        uf6Var.f468873n = str6;
    }

    /* renamed from: toString */
    public java.lang.String m165717x9616526c() {
        return "VideoInfo{fileName='" + this.f496533a + "', clientId='" + this.f496535b + "', msgSvrId=" + this.f496537c + ", netOffset=" + this.f496539d + ", fileNowSize=" + this.f496540e + ", totalLen=" + this.f496541f + ", thumbNetOffset=" + this.f496542g + ", thumbLen=" + this.f496543h + ", status=" + this.f496544i + ", createTime=" + this.f496545j + ", lastModifyTime=" + this.f496546k + ", priorityTime=" + this.f496547l + ", videoLength=" + this.f496548m + ", msgLocalId=" + this.f496549n + ", netTimes=" + this.f496550o + ", cameraType=" + this.f496551p + ", user='" + this.f496552q + "', human='" + this.f496554s + "', msgTalker=" + this.f496553r + ", isExport=" + this.f496555t + ", isUseCdn=" + this.f496556u + ", importPath='" + this.f496557v + "', recvXml='" + this.f496558w + "', videoFuncFlag=" + this.f496559x + ", massSendId=" + this.f496560y + ", massSendList='" + this.f496561z + "', videoMD5='" + this.A + "', streamVideoProto=" + this.E + ", statextstr='" + this.F + "', downloadScene=" + this.G + ", mmSightExtInfo=" + this.H + ", preloadSize=" + this.I + ", videoFormat=" + this.f496532J + ", flag=" + this.U + ", mediaId=" + this.O + ", videoFlag=" + this.B + ", videoPath=" + this.C + ", cdnId=" + this.D + ", forwardMsgLocalId=" + this.K + ", forwardMsgTalker=" + this.L + ", extCommonInfoXml= null}";
    }
}
