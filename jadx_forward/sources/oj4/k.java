package oj4;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pj4.g2 f427350d;

    public k(pj4.g2 g2Var) {
        this.f427350d = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pj4.r rVar;
        long j17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("commit postInfo:");
        pj4.g2 g2Var = this.f427350d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g2Var, "<this>");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("TextStatusPostInfo[rowId:");
        sb7.append(g2Var.f436602n);
        sb7.append(",useDefaultBackground:");
        sb7.append(g2Var.f436597f);
        sb7.append(",uploadFilePath:");
        sb7.append(g2Var.f436598g);
        sb7.append(",thumbPath:");
        sb7.append(g2Var.f436599h);
        sb7.append(",excludeUserNames:");
        sb7.append(g2Var.f436596e);
        sb7.append(",textStatusExtInfo:[");
        pj4.b0 textStatusExtInfo = g2Var.f436595d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textStatusExtInfo, "textStatusExtInfo");
        sb7.append(bk4.l.b(textStatusExtInfo));
        sb7.append(" mod_status_option:");
        sb7.append(g2Var.f436608t);
        sb7.append("]]");
        sb6.append(sb7.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadPackHelper", sb6.toString());
        long j18 = g2Var.f436602n;
        oj4.l lVar = oj4.l.f427351a;
        if (j18 <= 0) {
            java.lang.String str = g2Var.f436609u;
            if (str == null || str.length() == 0) {
                rVar = null;
            } else {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new pj4.r().mo11468x92b714fd(android.util.Base64.decode(g2Var.f436609u, 0));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.PrivateInfo");
                rVar = (pj4.r) mo11468x92b714fd;
            }
            ai4.m0 m0Var = ai4.m0.f86706a;
            java.lang.String a17 = en1.a.a();
            java.lang.String str2 = g2Var.f436606r;
            pj4.b0 b0Var = g2Var.f436595d;
            java.lang.String str3 = g2Var.f436607s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b0Var);
            long g17 = ai4.b.g(m0Var, a17, str2, b0Var, 3, str3, 0L, 0.0f, null, rVar, false, ag1.b.f37x366c91de, null);
            java.lang.String str4 = g2Var.f436606r;
            java.lang.String str5 = str4 == null ? "" : str4;
            if (str4 == null || str4.length() == 0) {
                mj4.h i17 = m0Var.G().i(en1.a.a(), g2Var.f436595d.f436515q);
                str5 = i17 != null ? ((mj4.k) i17).l() : "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadPackHelper", "copyPostInfoToLocal: ".concat(str5));
            int i18 = g2Var.f436595d.f436507f;
            bk4.n nVar = bk4.n.f103046a;
            if (i18 == 1) {
                j17 = g17;
                if (com.p314xaae8f345.mm.vfs.w6.j(g2Var.f436599h)) {
                    java.lang.String g18 = nVar.g("thumb", str5, "");
                    long d17 = com.p314xaae8f345.mm.vfs.w6.d(g2Var.f436599h, g18, false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadPackHelper", "copyPostInfoToLocal:" + d17 + ", img thumb " + g2Var.f436599h + " to " + g18);
                    if (d17 <= 0) {
                        lVar.d(g2Var.f436599h, g18);
                    }
                }
                if (com.p314xaae8f345.mm.vfs.w6.j(g2Var.f436598g)) {
                    java.lang.String g19 = nVar.g("image", str5, "");
                    long d18 = com.p314xaae8f345.mm.vfs.w6.d(g2Var.f436598g, g19, false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadPackHelper", "copyPostInfoToLocal:" + d18 + ", img file " + g2Var.f436598g + " to " + g19);
                    if (d18 > 0) {
                        g2Var.f436598g = g19;
                    } else if (lVar.d(g2Var.f436598g, g19)) {
                        g2Var.f436598g = g19;
                    }
                }
            } else if (i18 != 2) {
                java.lang.String g27 = nVar.g("thumb", str5, "");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadPackHelper", "copyPostInfoToLocal: delete old thumb " + com.p314xaae8f345.mm.vfs.w6.h(g27) + ", " + g27);
                j17 = g17;
            } else {
                if (com.p314xaae8f345.mm.vfs.w6.j(g2Var.f436599h)) {
                    java.lang.String g28 = nVar.g("thumb", str5, "");
                    j17 = g17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadPackHelper", "copyPostInfoToLocal:" + com.p314xaae8f345.mm.vfs.w6.d(g2Var.f436599h, g28, false) + ", video thumb " + g2Var.f436599h + " to " + g28);
                } else {
                    j17 = g17;
                }
                if (com.p314xaae8f345.mm.vfs.w6.j(g2Var.f436598g)) {
                    java.lang.String g29 = nVar.g("video", str5, "");
                    long d19 = com.p314xaae8f345.mm.vfs.w6.d(g2Var.f436598g, g29, false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadPackHelper", "copyPostInfoToLocal:" + d19 + ", video file " + g2Var.f436598g + " to " + g29);
                    if (d19 > 0) {
                        g2Var.f436598g = g29;
                    }
                }
            }
            if (g2Var.f436608t != 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.d8 d8Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078.f255099u2;
                java.lang.Object mo141623x754a37bb = ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078.f255100v2).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).putString(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078.f255101w2, java.lang.String.valueOf(j17));
            }
            g2Var.f436602n = j17;
            if (lVar.c(g2Var)) {
                g2Var.f436603o = true;
            }
            oj4.j.f427348a.g(g2Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadPackHelper", "commit: check postNow=" + lVar.c(g2Var));
        if (lVar.c(g2Var)) {
            pm0.v.X(new oj4.a(new oj4.b(g2Var)));
            return;
        }
        oj4.n nVar2 = new oj4.n(g2Var);
        oj4.m mVar = new oj4.m(java.lang.System.currentTimeMillis(), nVar2);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("doUpload: rowId=");
        pj4.g2 g2Var2 = nVar2.f427354a;
        sb8.append(g2Var2.f436602n);
        sb8.append(", statusId=");
        sb8.append(g2Var2.f436606r);
        sb8.append(", createTime=");
        sb8.append(g2Var2.f436595d.f436515q);
        sb8.append(", mediaType=");
        pj4.b0 b0Var2 = g2Var2.f436595d;
        sb8.append(b0Var2 != null ? java.lang.Integer.valueOf(b0Var2.f436507f) : null);
        sb8.append(", uploadFile=");
        sb8.append(g2Var2.f436598g);
        sb8.append(", thumbFile=");
        sb8.append(g2Var2.f436599h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadTask", sb8.toString());
        pj4.b0 b0Var3 = g2Var2.f436595d;
        int i19 = b0Var3 != null ? b0Var3.f436507f : 1;
        java.lang.String str6 = g2Var2.f436598g;
        java.lang.String str7 = g2Var2.f436599h;
        if (str6 == null || r26.n0.N(str6)) {
            return;
        }
        if (str7 == null || r26.n0.N(str7)) {
            return;
        }
        oj4.d dVar = new oj4.d(mVar);
        if (i19 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusUploader", "uploadImage");
            dn.m mVar2 = new dn.m();
            mVar2.f323318d = "task_TextStatusUploader_2";
            mVar2.f323320f = dVar;
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            mVar2.f69601xaca5bdda = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str6.getBytes());
            mVar2.f69595x6d25b0d9 = str6;
            mVar2.f69619xe9ed65f6 = str7;
            mVar2.f69618x114ef53e = "";
            mVar2.f69606xccdbf540 = true;
            mVar2.f69592xf1ebe47b = 20304;
            mVar2.f69580x454032b6 = 256;
            mVar2.f69584x89a4c0cf = 2;
            mVar2.A = 60;
            mVar2.B = 300;
            mVar2.f69609xd84b8349 = 2;
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusUploader", "isVideo");
        dn.m mVar3 = new dn.m();
        mVar3.f323318d = "task_TextStatusUploader_1";
        mVar3.f323320f = dVar;
        char[] cArr2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        mVar3.f69601xaca5bdda = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str6.getBytes());
        mVar3.f69595x6d25b0d9 = str6;
        mVar3.f69619xe9ed65f6 = str7;
        mVar3.f69618x114ef53e = "";
        mVar3.f69606xccdbf540 = true;
        mVar3.f69592xf1ebe47b = 20302;
        mVar3.f69580x454032b6 = 256;
        mVar3.Z = 8;
        mVar3.f69584x89a4c0cf = 2;
        mVar3.A = 600;
        mVar3.B = 1200;
        mVar3.f69609xd84b8349 = 2;
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar3);
    }
}
