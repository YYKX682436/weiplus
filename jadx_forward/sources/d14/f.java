package d14;

/* loaded from: classes11.dex */
public class f extends ih3.n implements d14.a {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Map f307270n = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.Map f307271o = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.Map f307272p = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    public static final dn.k f307273q = new d14.b();

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f307274e;

    /* renamed from: f, reason: collision with root package name */
    public long f307275f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f307276g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f307277h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f307278i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f307279m;

    public f(ih3.m mVar) {
        super(mVar);
        this.f307274e = null;
        this.f307279m = false;
    }

    public static void e(long j17, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Long.valueOf(j17);
        objArr[1] = java.lang.Long.valueOf(j18);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[2] = str == null ? "" : str;
        objArr[3] = str2 != null ? str2 : "";
        objArr[4] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "gotoRecordDetailUI msgId:%s msgSvrId:%s sendUserName:%s talker:%s xml:%s", objArr);
        ot0.q v17 = ot0.q.v(str3);
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "gotoRecordDetailUI content is null???");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("message_id", j17);
        intent.putExtra("message_talker", str2);
        intent.putExtra("record_xml", v17.f430196h0);
        intent.putExtra("record_show_share", false);
        intent.putExtra("from_scene", 2);
        intent.putExtra("prePublishId", "msg_" + java.lang.Long.toString(j18));
        intent.putExtra("preUsername", str);
        intent.putExtra("preChatName", str2);
        intent.putExtra("preChatTYPE", 2);
        j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "record", ".ui.RecordMsgDetailUI", intent, null);
    }

    public static boolean f(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f9Var.m124847x74d37ac6(), f9Var.Q0());
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) f307270n).entrySet().iterator();
        while (it.hasNext()) {
            r45.pw3 pw3Var = (r45.pw3) ((java.util.Map.Entry) it.next()).getValue();
            if (android.text.TextUtils.equals(pw3Var.f464963i, (java.lang.CharSequence) ((java.util.concurrent.ConcurrentHashMap) f307272p).get(c16564xb55e1d5))) {
                return pw3Var.f464960f && pw3Var.f464964m != 2;
            }
        }
        return false;
    }

    public static boolean h(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.Map map, java.lang.String str, java.lang.String str2, d14.a aVar) {
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        boolean z17;
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
            java.util.Objects.toString(f9Var);
            java.util.Objects.toString(map);
            java.util.Objects.toString(aVar);
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        }
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        if (aVar != null) {
            ((java.util.concurrent.ConcurrentHashMap) f307271o).put(java.lang.Long.valueOf(m124847x74d37ac6), aVar);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, "tmpl_type_profilewithrevoke")) {
            str3 = (java.lang.String) map.get(str + ".fileid");
            if (str3 == null) {
                str3 = "";
            }
            str4 = (java.lang.String) map.get(str + ".aeskey");
            if (str4 == null) {
                str4 = "";
            }
            str5 = (java.lang.String) map.get(str + ".filelength");
            if (str5 == null) {
                str5 = "";
            }
            z17 = false;
        } else {
            str3 = (java.lang.String) map.get(str + ".newformatfileid");
            if (str3 == null) {
                str3 = "";
            }
            str4 = (java.lang.String) map.get(str + ".newformataeskey");
            if (str4 == null) {
                str4 = "";
            }
            str5 = (java.lang.String) map.get(str + ".newfromatfilelength");
            if (str5 == null) {
                str5 = "";
            }
            z17 = true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            str3 = (java.lang.String) map.get(str + ".fileid");
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str6 = (java.lang.String) map.get(str + ".aeskey");
            str4 = str6 == null ? "" : str6;
            java.lang.String str7 = (java.lang.String) map.get(str + ".filelength");
            str5 = str7 == null ? "" : str7;
            z17 = false;
        }
        java.lang.String str8 = (java.lang.String) map.get(str + ".historyid");
        if (str8 == null) {
            str8 = "";
        }
        sg3.r.aj();
        if (!com.p314xaae8f345.mm.vfs.w6.j("wcf://selectrecord/downloadcache/")) {
            com.p314xaae8f345.mm.vfs.w6.u("wcf://selectrecord/downloadcache/");
        }
        java.lang.String str9 = "wcf://selectrecord/downloadcache/" + m124847x74d37ac6;
        if (com.p314xaae8f345.mm.vfs.w6.j(str9)) {
            com.p314xaae8f345.mm.vfs.w6.h(str9);
        }
        java.lang.String g17 = kk.k.g(("" + android.os.SystemClock.elapsedRealtime() + ", " + m124847x74d37ac6).getBytes());
        dn.m mVar = new dn.m();
        mVar.f323320f = f307273q;
        mVar.f323319e = false;
        mVar.f69601xaca5bdda = g17;
        mVar.f69595x6d25b0d9 = str9;
        mVar.f69620xeb1a61d6 = java.lang.Long.parseLong(str5);
        mVar.f69592xf1ebe47b = 5;
        mVar.f69591xf9dbbe9c = str3;
        mVar.f69575xf11df5f5 = str4;
        mVar.f69609xd84b8349 = 2;
        mVar.f69606xccdbf540 = false;
        mVar.f69597x853bb235 = false;
        r45.pw3 pw3Var = new r45.pw3();
        pw3Var.f464958d = m124847x74d37ac6;
        pw3Var.f464959e = str9;
        pw3Var.f464960f = z17;
        pw3Var.f464961g = f9Var.mo78012x3fdd41df();
        pw3Var.f464962h = f9Var.Q0();
        pw3Var.f464963i = str8;
        ((java.util.concurrent.ConcurrentHashMap) f307270n).put(g17, pw3Var);
        ((java.util.concurrent.ConcurrentHashMap) f307272p).put(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f9Var.m124847x74d37ac6(), f9Var.Q0()), str8);
        boolean wi6 = ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "add download cdn task : %b, msgId : %s, newWay:%s", java.lang.Boolean.valueOf(wi6), java.lang.Long.valueOf(m124847x74d37ac6), java.lang.Boolean.valueOf(z17));
        if (!wi6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "triggerErrorCallback errCode:%s errMsg:%s", 0, "add to cdn failed");
        }
        return z17;
    }

    @Override // ih3.n
    public java.lang.String a() {
        return "link_history";
    }

    @Override // ih3.n
    public java.lang.CharSequence b(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        if (map == null) {
            return null;
        }
        java.lang.String string = bundle != null ? bundle.getString("conv_talker_username") : "";
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.String string2 = bundle.getString("template_type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(string2, "tmpl_type_profile")) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(string, bundle.getLong("msg_id"));
            if (((Li.F & 262144) != 0) || f(Li)) {
                java.lang.String str4 = (java.lang.String) map.get(str + ".newformattitle");
                java.lang.String str5 = str4 != null ? str4 : "";
                return !android.text.TextUtils.isEmpty(str5) ? str5 : str3;
            }
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(str3);
        d14.d dVar = new d14.d(this, 1, null, map, bundle, string, weakReference, str, weakReference2);
        dVar.m75740x3ab833d4(true);
        spannableString.setSpan(dVar, 0, str3.length(), 33);
        return spannableString;
    }

    @Override // ih3.n
    public void c() {
        super.c();
    }

    public void g(long j17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "onClickHistory msgId:%s", java.lang.Long.valueOf(j17));
        if (this.f307279m) {
            android.app.ProgressDialog progressDialog = this.f307274e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            if (str != null) {
                e(j17, this.f307275f, this.f307277h, this.f307276g, str);
            }
        }
    }
}
