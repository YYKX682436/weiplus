package t21;

/* loaded from: classes12.dex */
public class w2 implements wf0.w1 {

    /* renamed from: c, reason: collision with root package name */
    public static final kk.l f496589c = new kk.l(20);

    /* renamed from: a, reason: collision with root package name */
    public final l75.k0 f496590a;

    /* renamed from: b, reason: collision with root package name */
    public final l75.v0 f496591b;

    public w2(l75.k0 k0Var) {
        t21.x2 x2Var = new t21.x2(this);
        this.f496591b = x2Var;
        x2Var.a(new t21.C30216x6a43366(), android.os.Looper.getMainLooper());
        this.f496590a = k0Var;
        t21.b3.f496239a.forEach(new java.util.function.Consumer() { // from class: t21.w2$$b
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                java.lang.String[] strArr;
                t21.a3 a3Var = (t21.a3) obj;
                t21.w2 w2Var = t21.w2.this;
                w2Var.getClass();
                qt0.b bVar = qt0.b.f448024a;
                l75.k0 k0Var2 = w2Var.f496590a;
                java.lang.String str = a3Var.f496234a;
                java.util.ArrayList arrayList = t21.b3.f496239a;
                if ("videoinfo2".equals(str)) {
                    strArr = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS video_msgTalker_msgSvrId_index ON " + str + " ( msg_talker,msgsvrid )", "CREATE INDEX IF NOT EXISTS video_msgTalker_msgId_index ON " + str + " ( msg_talker,msglocalid )"};
                } else {
                    strArr = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS " + str + "video_msgTalker_msgSvrId_index ON " + str + " ( msg_talker,msgsvrid )", "CREATE INDEX IF NOT EXISTS " + str + "video_msgTalker_msgId_index ON " + str + " ( msg_talker,msglocalid )"};
                }
                bVar.b(new qt0.e(k0Var2, strArr, a3Var.f496234a, "videoinfo", 1));
            }
        });
    }

    public static int E(java.lang.String str, int i17, byte[] bArr) {
        int a17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoInfoStorage", "ERR:" + fp.k.c() + " invalid fileName");
            a17 = fp.k.a();
        } else if (i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoInfoStorage", "ERR:" + fp.k.c() + "[" + str + "]  invalid startOffset:" + i17);
            a17 = fp.k.a();
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
                fp.j jVar = new fp.j();
                java.io.RandomAccessFile randomAccessFile = null;
                try {
                    try {
                        randomAccessFile = com.p314xaae8f345.mm.vfs.w6.A(com.p314xaae8f345.mm.vfs.z7.a(str), true);
                        jVar.a();
                        randomAccessFile.seek(i17);
                        jVar.a();
                        randomAccessFile.write(bArr, 0, bArr.length);
                        jVar.a();
                        int filePointer = (int) randomAccessFile.getFilePointer();
                        jVar.a();
                        try {
                            randomAccessFile.close();
                        } catch (java.lang.Exception unused) {
                        }
                        fp.k.c();
                        fp.k.c();
                        return filePointer;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoInfoStorage", "ERR:" + fp.k.c() + "[" + str + "] \t\tOffset:" + i17 + " failed:[" + e17.getMessage() + "]");
                        int a18 = 0 - fp.k.a();
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (java.lang.Exception unused2) {
                            }
                        }
                        return a18;
                    }
                } catch (java.lang.Throwable th6) {
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (java.lang.Exception unused3) {
                        }
                    }
                    throw th6;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoInfoStorage", "ERR:" + fp.k.c() + "[" + str + "]  invalid writeBuf");
            a17 = fp.k.a();
        }
        return 0 - a17;
    }

    public static java.lang.String[] a(java.lang.String str) {
        return new java.lang.String[]{"CREATE TABLE IF NOT EXISTS " + str + " ( filename text  PRIMARY KEY , clientid text  , msgsvrid int  , netoffset int  , filenowsize int  , totallen int  , thumbnetoffset int  , thumblen int  , status int  , createtime long  , lastmodifytime long  , downloadtime long  , videolength int  , msglocalid int  , nettimes int  , cameratype int  , user text  , human text  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  , videofuncflag int ,masssendid long ,masssendlist text,videomd5 text, streamvideo byte[], statextstr text, downloadscene int, mmsightextinfo byte[], preloadsize int, videoformat int, forward_msg_local_id int,msg_uuid text)", "CREATE INDEX IF NOT EXISTS " + str + "video_status_index ON " + str + " ( status,downloadtime )", "CREATE INDEX IF NOT EXISTS " + str + "massSendIdIndex ON " + str + " ( masssendid )", "CREATE INDEX IF NOT EXISTS " + str + "LastModifyTimeIndex ON " + str + " ( lastmodifytime )", "CREATE TABLE IF NOT EXISTS " + str + "VideoHash  (size int , CreateTime long, hash text ,  cdnxml text, orgpath text);", "CREATE INDEX IF NOT EXISTS " + str + "VideoHashSizeIndex ON VideoHash ( size  )", "CREATE INDEX IF NOT EXISTS " + str + "VideoHashTimeIndex ON VideoHash ( CreateTime  )", "alter table " + str + " add share_app_info text ;", "alter table " + str + " add origin_file_name text ;", "alter table " + str + " add had_clicked_video int ;", "alter table " + str + " add media_id text ;", "alter table " + str + " add media_flag text ;", "alter table " + str + " add video_path text ;", "alter table " + str + " add media_cdnid text ;", "alter table " + str + " add video_wxa_info BLOB ;", "alter table " + str + " add weapp_source_username text ;", "alter table " + str + " add msg_talker text ;", "alter table " + str + " add forward_msg_talker text ;", "CREATE INDEX IF NOT EXISTS  " + str + "_MediaIdIndex ON " + str + " ( media_id  )"};
    }

    public static java.lang.String e(java.lang.String str) {
        return t21.c3.a(str);
    }

    public static java.lang.String p() {
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        com.p314xaae8f345.mm.vfs.r6 h07 = lp0.b.h0("media");
        if (!h07.m()) {
            h07.J();
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(h07.o() + "/video");
        if (!r6Var.m()) {
            r6Var.J();
        }
        return r6Var.o();
    }

    public static java.lang.String q(java.lang.String str) {
        return "select " + str + ".filename," + str + ".clientid," + str + ".msgsvrid," + str + ".netoffset," + str + ".filenowsize," + str + ".totallen," + str + ".thumbnetoffset," + str + ".thumblen," + str + ".status," + str + ".createtime," + str + ".lastmodifytime," + str + ".downloadtime," + str + ".videolength," + str + ".msglocalid," + str + ".nettimes," + str + ".cameratype," + str + ".user," + str + ".human," + str + ".reserved1," + str + ".reserved2," + str + ".reserved3," + str + ".reserved4," + str + ".videofuncflag," + str + ".masssendid," + str + ".masssendlist," + str + ".videomd5," + str + ".streamvideo," + str + ".statextstr," + str + ".downloadscene," + str + ".mmsightextinfo," + str + ".preloadsize," + str + ".videoformat," + str + ".forward_msg_local_id," + str + ".msg_uuid," + str + ".share_app_info," + str + ".origin_file_name," + str + ".had_clicked_video," + str + ".media_id," + str + ".media_flag," + str + ".video_path," + str + ".media_cdnid," + str + ".video_wxa_info," + str + ".weapp_source_username," + str + ".msg_talker," + str + ".forward_msg_talker from " + str + "  ";
    }

    public static java.lang.String r(java.lang.String str, java.lang.String[] strArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select ");
        for (java.lang.String str2 : strArr) {
            sb6.append(str + "." + str2 + ",");
        }
        sb6.deleteCharAt(sb6.length() - 1);
        sb6.append(" from " + str + "  ");
        return sb6.toString();
    }

    public static java.lang.String s(java.lang.String str) {
        return "select " + str + ".filename,downloadtime from " + str + "  ";
    }

    public static int t(java.lang.String str) {
        int C;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return -1;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (r6Var.m() && (C = (int) r6Var.C()) > 0) {
            return C;
        }
        return 0;
    }

    public static t21.z2 y(java.lang.String str, int i17, int i18) {
        t21.z2 z2Var = new t21.z2();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoInfoStorage", "ERR:" + fp.k.c() + " invalid fileName");
            z2Var.f496608d = 0 - fp.k.a();
            return z2Var;
        }
        if (i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoInfoStorage", "ERR:" + fp.k.c() + "[" + str + "]  invalid readOffset:" + i17);
            z2Var.f496608d = 0 - fp.k.a();
            return z2Var;
        }
        if (i18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoInfoStorage", "ERR:" + fp.k.c() + "[" + str + "]  invalid readLen");
            z2Var.f496608d = 0 - fp.k.a();
            return z2Var;
        }
        fp.j jVar = new fp.j();
        z2Var.f496605a = new byte[i18];
        java.io.RandomAccessFile randomAccessFile = null;
        try {
            try {
                randomAccessFile = com.p314xaae8f345.mm.vfs.w6.A(com.p314xaae8f345.mm.vfs.z7.a(str), false);
                jVar.a();
                randomAccessFile.seek(i17);
                jVar.a();
                int read = randomAccessFile.read(z2Var.f496605a, 0, i18);
                jVar.a();
                jVar.a();
                if (read < 0) {
                    read = 0;
                }
                z2Var.f496606b = read;
                z2Var.f496607c = read + i17;
                try {
                    randomAccessFile.close();
                } catch (java.lang.Exception unused) {
                }
                fp.k.c();
                fp.k.c();
                return z2Var;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoInfoStorage", "ERR:" + fp.k.c() + "[" + str + "] \t\tOffset:" + z2Var.f496607c + " failed:[" + e17.getMessage() + "]");
                z2Var.f496608d = 0 - fp.k.a();
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (java.lang.Exception unused2) {
                    }
                }
                return z2Var;
            }
        } catch (java.lang.Throwable th6) {
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (java.lang.Exception unused3) {
                }
            }
            throw th6;
        }
    }

    public void A(wf0.u1 u1Var) {
        this.f496591b.j(u1Var);
    }

    public boolean B(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        long j17;
        if (ih.a.h("clicfg_video_service_ignore_hash", true) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return false;
        }
        java.lang.String str4 = str2 + "##" + str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoInfoStorage", "saveVideoHash path:%s xml:%s stack:%s", str, str4, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoInfoStorage", "saveVideoHash failed , path:%s xml:%s", str, str4);
        } else {
            int[] f17 = f(str);
            if (f17 != null && f17.length >= 33) {
                int i17 = f17[32];
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                for (int i18 = 0; i18 < 32; i18++) {
                    stringBuffer.append(java.lang.Integer.toHexString(f17[i18]));
                }
                java.lang.String str5 = "select cdnxml from VideoHash where size = " + i17 + " and hash = \"" + stringBuffer.toString() + "\"";
                l75.k0 k0Var = this.f496590a;
                android.database.Cursor f18 = k0Var.f(str5, null, 2);
                java.util.Vector vector = new java.util.Vector();
                while (f18.moveToNext()) {
                    vector.add(f18.getString(0));
                    vector.size();
                    vector.get(vector.size() - 1);
                }
                f18.close();
                if (vector.size() == 1 && str4.equals(vector.get(0))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoInfoStorage", "saveVideoHash Check exist now return,time:%d,  path:%s,hash:%s, xml:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), str, stringBuffer.toString(), str4);
                    return true;
                }
                if (vector.size() >= 1) {
                    j17 = currentTimeMillis;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12696, 102, java.lang.Integer.valueOf(i17), "", "", java.lang.Integer.valueOf(vector.size()));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoInfoStorage", "saveVideoHash Err Check  xml diff OR  select more than one row,  rowCount:%d size:%d ", java.lang.Integer.valueOf(vector.size()), java.lang.Integer.valueOf(i17));
                    k0Var.A("VideoHash", "delete from VideoHash where size = " + i17 + " and hash = \"" + stringBuffer.toString() + "\"");
                } else {
                    j17 = currentTimeMillis;
                }
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("size", java.lang.Integer.valueOf(i17));
                contentValues.put("CreateTime", java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
                contentValues.put("hash", stringBuffer.toString());
                contentValues.put("cdnxml", str4);
                contentValues.put("orgpath", str);
                long l17 = k0Var.l("VideoHash", "", contentValues);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoInfoStorage", "summersafecdn saveVideoHash time:%d insert:%d path:%s hash:%s xml:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17), java.lang.Long.valueOf(l17), str, stringBuffer, str4);
                if (l17 < 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12696, 103, java.lang.Integer.valueOf(i17));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoInfoStorage", "saveVideoHash insert failed :%d  path:%s", java.lang.Long.valueOf(l17), str);
                }
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoInfoStorage", "saveVideoHash  readHash failed :%s", str);
        }
        return false;
    }

    public boolean C(t21.v2 v2Var) {
        iz5.a.g(null, v2Var != null);
        iz5.a.g(null, v2Var.d().length() > 0);
        z(v2Var.O);
        if (android.text.TextUtils.isEmpty(v2Var.L)) {
            v2Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(v2Var.K, ""));
        }
        if (android.text.TextUtils.isEmpty(v2Var.f496553r)) {
            v2Var.n("");
        }
        pt0.p.G6(v2Var.f496549n, v2Var.f496553r);
        pt0.p.G6(v2Var.K, v2Var.L);
        android.content.ContentValues b17 = v2Var.b();
        if (b17.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoInfoStorage", "update failed, no values set");
        } else {
            if (this.f496590a.p(t21.b3.a(v2Var.d()), b17, "filename= ?", new java.lang.String[]{v2Var.d()}) > 0) {
                wf0.t1 t1Var = wf0.t1.NORMAL;
                int i17 = v2Var.f496544i;
                if (i17 == 112) {
                    t1Var = wf0.t1.DOWNLOAD;
                } else if (i17 == 103 || i17 == 104) {
                    t1Var = wf0.t1.UPLOAD;
                }
                wf0.r1 r1Var = new wf0.r1(v2Var.d(), wf0.s1.UPDATE, t1Var, v2Var.f496559x, v2Var.f496560y);
                l75.v0 v0Var = this.f496591b;
                v0Var.d(r1Var);
                v0Var.c();
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoInfoStorage", "update failed, fileName:%s", v2Var.d());
        }
        return false;
    }

    public boolean D(java.lang.String str, long j17) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("totallen", java.lang.Long.valueOf(j17));
        return this.f496590a.p(t21.b3.a(str), contentValues, "filename= ?", new java.lang.String[]{str}) > 0;
    }

    public void b(wf0.u1 u1Var, android.os.Looper looper) {
        this.f496591b.a(u1Var, looper);
    }

    public boolean c(java.lang.String str, java.lang.String str2) {
        z(str2);
        if (this.f496590a.mo70514xb06685ab(t21.b3.a(str), "filename= ?", new java.lang.String[]{"" + str}) <= 0) {
            return false;
        }
        wf0.r1 r1Var = new wf0.r1(str, wf0.s1.DELETE, wf0.t1.NORMAL, 1, -1L);
        l75.v0 v0Var = this.f496591b;
        v0Var.d(r1Var);
        v0Var.c();
        return true;
    }

    public boolean d(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoInfoStorage", "deleteSnsAdByMediaId >> media is no valid");
            return false;
        }
        z(str);
        int mo70514xb06685ab = this.f496590a.mo70514xb06685ab("videoinfo2", "media_id= ?", new java.lang.String[]{str});
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoInfoStorage", "deleteSnsAdByMediaId >> %s, %d", str, java.lang.Integer.valueOf(mo70514xb06685ab));
        return mo70514xb06685ab > 0;
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0092: MOVE (r6 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:34:0x0092 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] f(java.lang.String r17) {
        /*
            r16 = this;
            r1 = r17
            r0 = 33
            int[] r0 = new int[r0]
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = com.p314xaae8f345.mm.vfs.w6.k(r17)
            int r4 = (int) r4
            r5 = 102400(0x19000, float:1.43493E-40)
            java.lang.String r8 = "MicroMsg.VideoInfoStorage"
            r9 = 1
            r10 = 0
            if (r4 < r5) goto L99
            r11 = 1073741824(0x40000000, float:2.0)
            if (r4 < r11) goto L20
            goto L99
        L20:
            r5 = 32
            r0[r5] = r4
            int r11 = r4 + (-20480)
            int r11 = r11 / r5
            r12 = 512(0x200, float:7.17E-43)
            byte[] r13 = new byte[r12]
            com.tencent.mm.vfs.z7 r14 = com.p314xaae8f345.mm.vfs.z7.a(r17)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
            java.io.RandomAccessFile r14 = com.p314xaae8f345.mm.vfs.w6.A(r14, r10)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
            r15 = r10
        L34:
            if (r15 >= r5) goto L50
            int r5 = r15 * r11
            int r5 = r5 + 10240
            long r6 = (long) r5
            r14.seek(r6)     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L91
            r14.readFully(r13)     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L91
            int r5 = kk.m.a(r13, r10, r10, r12)     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L91
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = r5 % r6
            r5 = r5 | r6
            r0[r15] = r5     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L91
            int r15 = r15 + 1
            r5 = 32
            goto L34
        L50:
            r14.close()     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L91
            java.lang.String r5 = "genVideoHash finish time:%d size:%d path:%s"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L91
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L91
            long r11 = r11 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L91
            r6[r10] = r2     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L91
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L91
            r6[r9] = r2     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L91
            r2 = 2
            r6[r2] = r1     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L91
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r5, r6)     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L91
            r14.close()     // Catch: java.lang.Exception -> L72
        L72:
            return r0
        L73:
            r0 = move-exception
            goto L7a
        L75:
            r0 = move-exception
            r6 = 0
            goto L93
        L78:
            r0 = move-exception
            r14 = 0
        L7a:
            java.lang.String r2 = "genVideoHash path:%s e:%s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L91
            r3[r10] = r1     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(r0)     // Catch: java.lang.Throwable -> L91
            r3[r9] = r0     // Catch: java.lang.Throwable -> L91
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r8, r2, r3)     // Catch: java.lang.Throwable -> L91
            if (r14 == 0) goto L8f
            r14.close()     // Catch: java.lang.Exception -> L8f
        L8f:
            r1 = 0
            return r1
        L91:
            r0 = move-exception
            r6 = r14
        L93:
            if (r6 == 0) goto L98
            r6.close()     // Catch: java.lang.Exception -> L98
        L98:
            throw r0
        L99:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "genVideoHash file size :%d , give up. :%s "
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r8, r1, r0)
            com.tencent.mm.plugin.report.service.g0 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            if (r4 >= r5) goto Lb0
            r2 = 10
            goto Lb2
        Lb0:
            r2 = 20
        Lb2:
            int r2 = r2 + 101
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r10] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1[r9] = r2
            r2 = 12696(0x3198, float:1.7791E-41)
            r0.d(r2, r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.w2.f(java.lang.String):int[]");
    }

    public t21.v2 g(java.lang.String str) {
        t21.v2 v2Var;
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(q(t21.b3.a(str)));
            sb6.append(" where ");
            sb6.append(t21.b3.a(str));
            sb6.append(".filename = '");
            java.lang.String str2 = "" + str;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str2);
            sb6.append(str2);
            sb6.append("'");
            android.database.Cursor f17 = this.f496590a.f(sb6.toString(), null, 2);
            if (f17 == null) {
                return null;
            }
            if (f17.moveToFirst()) {
                v2Var = new t21.v2();
                v2Var.a(f17);
            } else {
                v2Var = null;
            }
            f17.close();
            return v2Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoInfoStorage", e17, "getByFileName error[%s]", e17.toString());
            return null;
        }
    }

    public java.util.List h(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str == null || android.text.TextUtils.isEmpty(str)) {
            try {
                return f9Var.I0() > 0 ? l(f9Var) : j(f9Var);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoInfoStorage", e17, "getByMsg error[%s]", e17.toString());
                return arrayList;
            }
        }
        t21.v2 g17 = g(str);
        if (g17 != null) {
            arrayList.add(g17);
        }
        return arrayList;
    }

    public java.lang.String[] i(java.lang.String str, int i17) {
        java.lang.String str2;
        l75.k0 k0Var;
        long j17;
        int[] iArr;
        int i18;
        if (ih.a.h("clicfg_video_service_ignore_hash", true)) {
            return null;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoInfoStorage", "checkVideoHash in fullCheckRatio:%s path:%s stack:%s", valueOf, str, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str3 = "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoInfoStorage", "checkVideoHash failed , path:%s ", str);
        } else {
            int[] f17 = f(str);
            if (f17 == null || f17.length < 33) {
                str2 = "";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoInfoStorage", "checkVideoHash  readHash failed :%s", str);
            } else {
                java.lang.String str4 = "delete from VideoHash where CreateTime < " + (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - 432000);
                l75.k0 k0Var2 = this.f496590a;
                java.lang.String str5 = "VideoHash";
                k0Var2.A("VideoHash", str4);
                int i19 = f17[32];
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                int i27 = 0;
                for (int i28 = 32; i27 < i28; i28 = 32) {
                    stringBuffer.append(java.lang.Integer.toHexString(f17[i27]));
                    i27++;
                }
                int length = stringBuffer.length();
                java.util.Vector vector = new java.util.Vector();
                java.util.Vector vector2 = new java.util.Vector();
                java.util.Vector vector3 = new java.util.Vector();
                java.util.Vector vector4 = new java.util.Vector();
                str2 = "";
                android.database.Cursor B = k0Var2.B("select size, CreateTime, hash, cdnxml, orgpath from VideoHash where size = " + i19, null);
                int i29 = -1;
                while (true) {
                    k0Var = k0Var2;
                    if (!B.moveToNext()) {
                        break;
                    }
                    long j18 = B.getLong(1);
                    java.lang.String string = B.getString(2);
                    java.lang.String str6 = str5;
                    java.lang.String string2 = B.getString(3);
                    java.lang.String string3 = B.getString(4);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                        j17 = currentTimeMillis;
                        iArr = f17;
                        i18 = length;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12696, 104, java.lang.Integer.valueOf(i19));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoInfoStorage", "checkVideoHash select error [%s][%s]", string, string2);
                    } else {
                        iArr = f17;
                        if (length != string.length()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12696, 105, java.lang.Integer.valueOf(i19));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoInfoStorage", "checkVideoHash err length file:%d cursor:%d", java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(string.length()));
                            j17 = currentTimeMillis;
                            i18 = length;
                        } else {
                            j17 = currentTimeMillis;
                            int i37 = 0;
                            int i38 = 0;
                            while (i38 < length) {
                                int i39 = length;
                                if (stringBuffer.charAt(i38) == string.charAt(i38)) {
                                    i37++;
                                }
                                i38++;
                                length = i39;
                            }
                            i18 = length;
                            if (i29 < 0 || vector3.size() <= i29 || ((java.lang.Integer) vector3.get(i29)).intValue() < i37) {
                                i29 = vector3.size();
                            }
                            vector3.add(java.lang.Integer.valueOf(i37));
                            vector.add(string2);
                            vector2.add(string3);
                            vector4.add(java.lang.Long.valueOf(j18));
                            vector3.get(i29);
                            vector3.size();
                        }
                    }
                    k0Var2 = k0Var;
                    str5 = str6;
                    f17 = iArr;
                    currentTimeMillis = j17;
                    length = i18;
                }
                long j19 = currentTimeMillis;
                int[] iArr2 = f17;
                java.lang.String str7 = str5;
                B.close();
                if (i29 < 0 || vector3.size() <= 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12696, 201, java.lang.Integer.valueOf(i19));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoInfoStorage", "checkVideoHash cursor empty maxHitIndex:%d vector:%d", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(vector3.size()));
                } else {
                    int intValue = ((java.lang.Integer) vector3.get(i29)).intValue();
                    int i47 = (intValue * 100) / 256;
                    if (i47 < 77) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12696, 202, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(intValue), 0, java.lang.Integer.valueOf(vector4.size()));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoInfoStorage", "checkVideoHash NotEnoughHit. time:%d hit:%d percentMatch:%s arr:%d path:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j19), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(iArr2.length - 1), str);
                    } else {
                        java.lang.String str8 = (java.lang.String) vector.get(i29);
                        java.lang.String str9 = str8 == null ? str2 : str8;
                        int i48 = 0;
                        for (int i49 = 0; i49 < vector3.size(); i49++) {
                            if (i49 != i29 && ((java.lang.Integer) vector3.get(i49)).intValue() >= intValue && str9.hashCode() != ((java.lang.String) vector.get(i49)).hashCode()) {
                                i48++;
                            }
                        }
                        if (i48 > 0) {
                            k0Var.A(str7, "delete from VideoHash where size = " + i19);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12696, 203, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(intValue), 0, java.lang.Integer.valueOf(vector4.size()), 0, "", "", "", java.lang.Integer.valueOf(i48));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoInfoStorage", "checkVideoHash Not ONE hash hit this path, give up duplicate:%s path:%s", java.lang.Integer.valueOf(i48), str);
                        } else {
                            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - j19;
                            long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) vector4.get(i29), 0L);
                            java.lang.String format = java.lang.String.format("%s,%s,%s,%s,%s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(intValue), java.lang.Long.valueOf(k17), java.lang.Integer.valueOf(vector4.size()), java.lang.Long.valueOf(currentTimeMillis2));
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                            g0Var.d(12696, 300, format);
                            g0Var.d(12696, java.lang.Integer.valueOf(i47 + 3000), format);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoInfoStorage", "checkVideoHash Succ time:%s hit:%s match:%s%% savetime:%s path:%s xml:%s orgpath:%s", java.lang.Long.valueOf(currentTimeMillis2), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(i47), java.lang.Long.valueOf(k17), str, str9, vector2.get(i29));
                            java.lang.String str10 = (java.lang.String) vector2.get(i29);
                            long currentTimeMillis3 = java.lang.System.currentTimeMillis() % 1000;
                            boolean z18 = currentTimeMillis3 < ((long) (i17 * 10)) || i47 < 90;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoInfoStorage", "checkVideoHashByteDiff should:%s now:%s ratio:%s percentMatch:%s debuger:%s", java.lang.Boolean.valueOf(z18), java.lang.Long.valueOf(currentTimeMillis3), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i47), java.lang.Boolean.valueOf(z65.c.a()));
                            if (z18 || z65.c.a()) {
                                s75.d.c(new t21.y2(this, str, str10, format), "checkVideoHashByteDiff", 1);
                            }
                            str3 = str9;
                        }
                    }
                }
            }
            str3 = str2;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return null;
        }
        return str3.split("##");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        if (r7.moveToNext() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0053, code lost:
    
        if (r7.moveToFirst() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0055, code lost:
    
        r1 = new t21.v2();
        r1.a(r7);
        r0.add(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List j(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r7) {
        /*
            r6 = this;
            java.lang.String r0 = ".msglocalid = "
            java.lang.String r1 = ".msg_talker = '"
            r2 = 0
            java.lang.String r3 = t21.b3.b(r7)     // Catch: java.lang.Exception -> L6a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6a
            r4.<init>()     // Catch: java.lang.Exception -> L6a
            java.lang.String r5 = q(r3)     // Catch: java.lang.Exception -> L6a
            r4.append(r5)     // Catch: java.lang.Exception -> L6a
            java.lang.String r5 = " where "
            r4.append(r5)     // Catch: java.lang.Exception -> L6a
            r4.append(r3)     // Catch: java.lang.Exception -> L6a
            r4.append(r1)     // Catch: java.lang.Exception -> L6a
            java.lang.String r1 = r7.Q0()     // Catch: java.lang.Exception -> L6a
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(r1)     // Catch: java.lang.Exception -> L6a
            r4.append(r1)     // Catch: java.lang.Exception -> L6a
            java.lang.String r1 = "' AND "
            r4.append(r1)     // Catch: java.lang.Exception -> L6a
            r4.append(r3)     // Catch: java.lang.Exception -> L6a
            r4.append(r0)     // Catch: java.lang.Exception -> L6a
            long r0 = r7.m124847x74d37ac6()     // Catch: java.lang.Exception -> L6a
            r4.append(r0)     // Catch: java.lang.Exception -> L6a
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Exception -> L6a
            l75.k0 r0 = r6.f496590a     // Catch: java.lang.Exception -> L6a
            r1 = 2
            android.database.Cursor r7 = r0.f(r7, r2, r1)     // Catch: java.lang.Exception -> L6a
            if (r7 != 0) goto L4a
            return r2
        L4a:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L6a
            r0.<init>()     // Catch: java.lang.Exception -> L6a
            boolean r1 = r7.moveToFirst()     // Catch: java.lang.Exception -> L6a
            if (r1 == 0) goto L66
        L55:
            t21.v2 r1 = new t21.v2     // Catch: java.lang.Exception -> L6a
            r1.<init>()     // Catch: java.lang.Exception -> L6a
            r1.a(r7)     // Catch: java.lang.Exception -> L6a
            r0.add(r1)     // Catch: java.lang.Exception -> L6a
            boolean r1 = r7.moveToNext()     // Catch: java.lang.Exception -> L6a
            if (r1 != 0) goto L55
        L66:
            r7.close()     // Catch: java.lang.Exception -> L6a
            return r0
        L6a:
            r7 = move-exception
            java.lang.String r0 = r7.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.VideoInfoStorage"
            java.lang.String r3 = "getByFileName error[%s]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r7, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.w2.j(com.tencent.mm.storage.f9):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r9.moveToFirst() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        r1 = new t21.v2();
        r1.a(r9);
        r0.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        if (r9.moveToNext() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k(oi3.g r9) {
        /*
            r8 = this;
            java.lang.String r0 = ".msglocalid = "
            java.lang.String r1 = ".msg_talker = '"
            r2 = 0
            r3 = 0
            int r4 = r9.f427150d     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            int r4 = r4 + 3
            java.lang.String r4 = r9.m75945x2fec8307(r4)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            int r5 = r9.f427150d
            java.lang.String r4 = t21.b3.c(r4)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.<init>()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            java.lang.String r7 = q(r4)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.append(r7)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            java.lang.String r7 = " where "
            r6.append(r7)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.append(r4)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.append(r1)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            int r1 = r5 + 3
            java.lang.String r1 = r9.m75945x2fec8307(r1)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(r1)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.append(r1)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            java.lang.String r1 = "' AND "
            r6.append(r1)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.append(r4)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.append(r0)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            int r5 = r5 + r2
            long r0 = r9.m75942xfb822ef2(r5)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.append(r0)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            java.lang.String r9 = r6.toString()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            l75.k0 r0 = r8.f496590a     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r1 = 2
            android.database.Cursor r9 = r0.f(r9, r3, r1)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            if (r9 != 0) goto L5d
            if (r9 == 0) goto L5c
            r9.close()
        L5c:
            return r3
        L5d:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> La2
            r0.<init>()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> La2
            boolean r1 = r9.moveToFirst()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> La2
            if (r1 == 0) goto L79
        L68:
            t21.v2 r1 = new t21.v2     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> La2
            r1.<init>()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> La2
            r1.a(r9)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> La2
            r0.add(r1)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> La2
            boolean r1 = r9.moveToNext()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> La2
            if (r1 != 0) goto L68
        L79:
            r9.close()
            return r0
        L7d:
            r0 = move-exception
            goto L8c
        L7f:
            r0 = move-exception
            goto La4
        L81:
            r0 = move-exception
            goto L8b
        L83:
            r0 = r9
            goto La4
        L85:
            r0 = r9
            goto L8b
        L87:
            r9 = move-exception
            goto L83
        L89:
            r9 = move-exception
            goto L85
        L8b:
            r9 = r3
        L8c:
            java.lang.String r1 = "MicroMsg.VideoInfoStorage"
            java.lang.String r4 = "getMsgByLocalId(SimpleMsgInfo) error[%s]"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> La2
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> La2
            r5[r2] = r6     // Catch: java.lang.Throwable -> La2
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r0, r4, r5)     // Catch: java.lang.Throwable -> La2
            if (r9 == 0) goto La1
            r9.close()
        La1:
            return r3
        La2:
            r0 = move-exception
            r3 = r9
        La4:
            if (r3 == 0) goto La9
            r3.close()
        La9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.w2.k(oi3.g):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        if (r7.moveToNext() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0053, code lost:
    
        if (r7.moveToFirst() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0055, code lost:
    
        r1 = new t21.v2();
        r1.a(r7);
        r0.add(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List l(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r7) {
        /*
            r6 = this;
            java.lang.String r0 = ".msgsvrid = "
            java.lang.String r1 = ".msg_talker = '"
            r2 = 0
            java.lang.String r3 = t21.b3.b(r7)     // Catch: java.lang.Exception -> L6a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6a
            r4.<init>()     // Catch: java.lang.Exception -> L6a
            java.lang.String r5 = q(r3)     // Catch: java.lang.Exception -> L6a
            r4.append(r5)     // Catch: java.lang.Exception -> L6a
            java.lang.String r5 = " where "
            r4.append(r5)     // Catch: java.lang.Exception -> L6a
            r4.append(r3)     // Catch: java.lang.Exception -> L6a
            r4.append(r1)     // Catch: java.lang.Exception -> L6a
            java.lang.String r1 = r7.Q0()     // Catch: java.lang.Exception -> L6a
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(r1)     // Catch: java.lang.Exception -> L6a
            r4.append(r1)     // Catch: java.lang.Exception -> L6a
            java.lang.String r1 = "' AND "
            r4.append(r1)     // Catch: java.lang.Exception -> L6a
            r4.append(r3)     // Catch: java.lang.Exception -> L6a
            r4.append(r0)     // Catch: java.lang.Exception -> L6a
            long r0 = r7.I0()     // Catch: java.lang.Exception -> L6a
            r4.append(r0)     // Catch: java.lang.Exception -> L6a
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Exception -> L6a
            l75.k0 r0 = r6.f496590a     // Catch: java.lang.Exception -> L6a
            r1 = 2
            android.database.Cursor r7 = r0.f(r7, r2, r1)     // Catch: java.lang.Exception -> L6a
            if (r7 != 0) goto L4a
            return r2
        L4a:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L6a
            r0.<init>()     // Catch: java.lang.Exception -> L6a
            boolean r1 = r7.moveToFirst()     // Catch: java.lang.Exception -> L6a
            if (r1 == 0) goto L66
        L55:
            t21.v2 r1 = new t21.v2     // Catch: java.lang.Exception -> L6a
            r1.<init>()     // Catch: java.lang.Exception -> L6a
            r1.a(r7)     // Catch: java.lang.Exception -> L6a
            r0.add(r1)     // Catch: java.lang.Exception -> L6a
            boolean r1 = r7.moveToNext()     // Catch: java.lang.Exception -> L6a
            if (r1 != 0) goto L55
        L66:
            r7.close()     // Catch: java.lang.Exception -> L6a
            return r0
        L6a:
            r7 = move-exception
            java.lang.String r0 = r7.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.VideoInfoStorage"
            java.lang.String r3 = "getByFileName error[%s]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r7, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.w2.l(com.tencent.mm.storage.f9):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r9.moveToFirst() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        r1 = new t21.v2();
        r1.a(r9);
        r0.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        if (r9.moveToNext() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m(oi3.g r9) {
        /*
            r8 = this;
            java.lang.String r0 = ".msgsvrid = "
            java.lang.String r1 = ".msg_talker = '"
            r2 = 1
            r3 = 0
            int r4 = r9.f427150d     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            int r4 = r4 + 3
            java.lang.String r4 = r9.m75945x2fec8307(r4)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            int r5 = r9.f427150d
            java.lang.String r4 = t21.b3.c(r4)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.<init>()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            java.lang.String r7 = q(r4)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.append(r7)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            java.lang.String r7 = " where "
            r6.append(r7)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.append(r4)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.append(r1)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            int r1 = r5 + 3
            java.lang.String r1 = r9.m75945x2fec8307(r1)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(r1)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.append(r1)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            java.lang.String r1 = "' AND "
            r6.append(r1)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.append(r4)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.append(r0)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            int r5 = r5 + r2
            long r0 = r9.m75942xfb822ef2(r5)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.append(r0)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            java.lang.String r9 = r6.toString()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            l75.k0 r0 = r8.f496590a     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r1 = 2
            android.database.Cursor r9 = r0.f(r9, r3, r1)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            if (r9 != 0) goto L5d
            if (r9 == 0) goto L5c
            r9.close()
        L5c:
            return r3
        L5d:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> La2
            r0.<init>()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> La2
            boolean r1 = r9.moveToFirst()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> La2
            if (r1 == 0) goto L79
        L68:
            t21.v2 r1 = new t21.v2     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> La2
            r1.<init>()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> La2
            r1.a(r9)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> La2
            r0.add(r1)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> La2
            boolean r1 = r9.moveToNext()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> La2
            if (r1 != 0) goto L68
        L79:
            r9.close()
            return r0
        L7d:
            r0 = move-exception
            goto L8c
        L7f:
            r0 = move-exception
            goto La4
        L81:
            r0 = move-exception
            goto L8b
        L83:
            r0 = r9
            goto La4
        L85:
            r0 = r9
            goto L8b
        L87:
            r9 = move-exception
            goto L83
        L89:
            r9 = move-exception
            goto L85
        L8b:
            r9 = r3
        L8c:
            java.lang.String r1 = "MicroMsg.VideoInfoStorage"
            java.lang.String r4 = "getMsgBySvrId(SimpleMsgInfo) error[%s]"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La2
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> La2
            r6 = 0
            r2[r6] = r5     // Catch: java.lang.Throwable -> La2
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r0, r4, r2)     // Catch: java.lang.Throwable -> La2
            if (r9 == 0) goto La1
            r9.close()
        La1:
            return r3
        La2:
            r0 = move-exception
            r3 = r9
        La4:
            if (r3 == 0) goto La9
            r3.close()
        La9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.w2.m(oi3.g):java.util.List");
    }

    public java.util.List n(int i17) {
        java.lang.String str;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = t21.b3.f496239a.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = ((t21.a3) it.next()).f496234a;
            if (i17 <= 0) {
                str = " ) ";
            } else {
                str = " LIMIT " + i17 + " )";
            }
            java.lang.String str3 = (((" SELECT * FROM ( " + s(str2) + " WHERE status=122" + str) + " UNION SELECT * FROM ( ") + s(str2) + " WHERE status=120" + str) + " ORDER BY downloadtime DESC";
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            android.database.Cursor cursor = null;
            try {
                cursor = this.f496590a.f(str3, null, 2);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    linkedList.addAll(linkedList2);
                }
                do {
                    linkedList2.add(cursor.getString(0));
                } while (cursor.moveToNext());
                cursor.close();
                linkedList.addAll(linkedList2);
            } catch (java.lang.Throwable th6) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th6;
            }
        }
        return linkedList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0075, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0052, code lost:
    
        if (r4.moveToFirst() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        r2 = new t21.v2();
        r2.a(r4);
        r3.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0063, code lost:
    
        if (r4.moveToNext() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List o(int r9, int r10, long r11) {
        /*
            r8 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.ArrayList r1 = t21.b3.f496239a
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L82
            java.lang.Object r2 = r1.next()
            t21.a3 r2 = (t21.a3) r2
            java.lang.String r2 = r2.f496234a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = q(r2)
            r3.append(r2)
            java.lang.String r2 = " where status="
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = " AND preloadsize > 0 AND lastmodifytime <= "
            r3.append(r2)
            r3.append(r11)
            java.lang.String r2 = " ORDER BY createtime LIMIT "
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r3.toString()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r4 = 0
            l75.k0 r5 = r8.f496590a     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r6 = 2
            android.database.Cursor r4 = r5.f(r2, r4, r6)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            boolean r2 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r2 == 0) goto L75
        L54:
            t21.v2 r2 = new t21.v2     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r2.<init>()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r2.a(r4)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r3.add(r2)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            boolean r2 = r4.moveToNext()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r2 != 0) goto L54
            goto L75
        L66:
            r9 = move-exception
            goto L7c
        L68:
            r2 = move-exception
            java.lang.String r5 = "MicroMsg.VideoInfoStorage"
            java.lang.String r6 = "getNeedDeletePreloadVideo error"
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L66
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r5, r2, r6, r7)     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L78
        L75:
            r4.close()
        L78:
            r0.addAll(r3)
            goto Lb
        L7c:
            if (r4 == 0) goto L81
            r4.close()
        L81:
            throw r9
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.w2.o(int, int, long):java.util.List");
    }

    public java.util.List u(int i17) {
        java.lang.String str;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = t21.b3.f496239a.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = ((t21.a3) it.next()).f496234a;
            if (i17 <= 0) {
                str = "";
            } else {
                str = " LIMIT " + i17;
            }
            java.lang.String str3 = s(str2) + " WHERE status=112 ORDER BY downloadtime DESC " + str;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            android.database.Cursor cursor = null;
            try {
                cursor = this.f496590a.f(str3, null, 2);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    linkedList.addAll(linkedList2);
                }
                do {
                    linkedList2.add(cursor.getString(0));
                } while (cursor.moveToNext());
                cursor.close();
                linkedList.addAll(linkedList2);
            } catch (java.lang.Throwable th6) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th6;
            }
        }
        return linkedList;
    }

    public java.util.List v(int i17) {
        java.lang.String str;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = t21.b3.f496239a.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = ((t21.a3) it.next()).f496234a;
            if (i17 <= 0) {
                str = " ) ";
            } else {
                str = " LIMIT " + i17 + " )";
            }
            java.lang.String str3 = (((" SELECT * FROM ( " + s(str2) + " WHERE status=103" + str) + " UNION SELECT * FROM ( ") + s(str2) + " WHERE status=104" + str) + " ORDER BY downloadtime DESC";
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            android.database.Cursor cursor = null;
            try {
                cursor = this.f496590a.f(str3, null, 2);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    linkedList.addAll(linkedList2);
                }
                do {
                    linkedList2.add(cursor.getString(0));
                } while (cursor.moveToNext());
                cursor.close();
                linkedList.addAll(linkedList2);
            } catch (java.lang.Throwable th6) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th6;
            }
        }
        return linkedList;
    }

    public android.database.Cursor w(int i17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        l75.k0 k0Var = this.f496590a;
        if (k0Var == null) {
            return null;
        }
        return k0Var.d(false, "videoinfo2", new java.lang.String[]{com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37650x1214b17, "forward_msg_local_id", "msglocalid", "msgsvrid"}, "msg_talker IS NULL", new java.lang.String[0], null, null, null, i17 + "", c26987xeef691ab);
    }

    public boolean x(t21.v2 v2Var, boolean z17) {
        if (v2Var == null) {
            return false;
        }
        if (android.text.TextUtils.isEmpty(v2Var.L)) {
            v2Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(v2Var.K, ""));
        }
        if (android.text.TextUtils.isEmpty(v2Var.f496553r)) {
            v2Var.n("");
        }
        pt0.p.G6(v2Var.f496549n, v2Var.f496553r);
        pt0.p.G6(v2Var.K, v2Var.L);
        z(v2Var.O);
        v2Var.U = -1;
        android.content.ContentValues b17 = v2Var.b();
        if (((int) this.f496590a.l(t21.b3.a(v2Var.d()), com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37650x1214b17, b17)) == -1) {
            return false;
        }
        if (!z17) {
            return true;
        }
        wf0.r1 r1Var = new wf0.r1(v2Var.d(), wf0.s1.INSERT, wf0.t1.NORMAL, v2Var.f496559x, v2Var.f496560y);
        l75.v0 v0Var = this.f496591b;
        v0Var.d(r1Var);
        v0Var.c();
        return true;
    }

    public void z(java.lang.String str) {
        kk.l lVar = f496589c;
        if (lVar.get(str) != null) {
            lVar.m77803xc84af884(str);
        }
    }
}
