package com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui;

@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI */
/* loaded from: classes8.dex */
public class ActivityC16931x24037f86 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: p1, reason: collision with root package name */
    public static java.util.List f236363p1;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 A;
    public java.lang.String C;
    public java.lang.String D;
    public db5.d5 E;
    public java.lang.String P;
    public java.util.List Q;
    public java.util.List R;
    public final java.lang.String S;
    public final java.lang.String T;
    public final java.lang.String U;
    public boolean V;
    public boolean W;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 X;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 Y;
    public final ks3.y Z;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ScrollView f236365d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed f236366e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f236367f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f236368g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f236369h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed f236370i;

    /* renamed from: l1, reason: collision with root package name */
    public final android.view.View.OnClickListener f236371l1;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f236372m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f236373n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed f236374o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f236375p;

    /* renamed from: p0, reason: collision with root package name */
    public final android.view.View.OnClickListener f236376p0;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.EditText f236377q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f236378r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f236379s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f236380t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f236381u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.EditText f236382v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f236383w;

    /* renamed from: x, reason: collision with root package name */
    public ks3.z f236384x;

    /* renamed from: x0, reason: collision with root package name */
    public final android.view.View.OnClickListener f236385x0;

    /* renamed from: y, reason: collision with root package name */
    public os3.v1 f236386y;

    /* renamed from: y0, reason: collision with root package name */
    public final android.view.MenuItem.OnMenuItemClickListener f236387y0;

    /* renamed from: z, reason: collision with root package name */
    public final os3.p3 f236388z = new os3.p3(this);
    public int B = 1;
    public final boolean F = true;
    public final boolean G = true;
    public final java.lang.String H = "(function() { \nvar imgList = document.getElementsByTagName('img');var result = ''; \nfor (var i = 0; i < imgList.length; i++) {var img = imgList[i];var info = img.id + '@@' + img.src;result += info + '&&'}return result;})()";
    public final java.lang.String I = "document.getElementById('history').innerHTML";

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f236364J = "<div id=\"htmlContent\" contenteditable=\"true\" >";
    public final java.lang.String K = "</div>";
    public java.lang.String L = null;
    public int M = 20;
    public final java.util.Map N = new java.util.HashMap();

    public ActivityC16931x24037f86() {
        hs3.s sVar = (hs3.s) ((ks3.t) i95.n0.c(ks3.t.class));
        sVar.getClass();
        gm0.j1.b().c();
        if (sVar.f366130e == null) {
            sVar.f366130e = new ks3.q0();
        }
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = "weixin://get_img_info/";
        this.T = "weixin://get_mail_content/";
        this.U = "weixin://img_onclick/";
        this.V = false;
        this.W = false;
        this.X = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new os3.d0(this), true);
        this.Y = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new os3.e0(this), true);
        this.Z = new os3.f0(this);
        this.f236376p0 = new os3.s(this);
        this.f236385x0 = new os3.v(this);
        this.f236387y0 = new os3.y(this);
        this.f236371l1 = new os3.b0(this);
    }

    public static boolean T6(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86, boolean z17) {
        if (z17 && activityC16931x24037f86.f236366e.m67777xeb5f5875().size() == 0 && activityC16931x24037f86.f236370i.m67777xeb5f5875().size() == 0 && activityC16931x24037f86.f236374o.m67777xeb5f5875().size() == 0 && !activityC16931x24037f86.f236366e.d() && !activityC16931x24037f86.f236370i.d() && !activityC16931x24037f86.f236374o.d()) {
            return false;
        }
        int i17 = activityC16931x24037f86.M;
        if (i17 == 20) {
            if (activityC16931x24037f86.f236377q.getText().toString().trim().length() == 0 && activityC16931x24037f86.f236386y.e().size() == 0 && activityC16931x24037f86.f236382v.getText().length() == 0) {
                return false;
            }
        } else if (i17 == 21 && activityC16931x24037f86.f236377q.getText().toString().trim().length() == 0 && activityC16931x24037f86.f236386y.e().size() == 0) {
            return false;
        }
        return true;
    }

    public static java.lang.String U6(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        activityC16931x24037f86.getClass();
        activityC16931x24037f86.D = "SendMail_" + java.lang.System.currentTimeMillis();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("mail_id", activityC16931x24037f86.C);
        int i17 = activityC16931x24037f86.B;
        int i18 = 2;
        if (i17 != 2) {
            i18 = 3;
            if (i17 != 3) {
                i18 = 1;
            }
        }
        bundle.putInt("mail_send_type", i18);
        java.lang.String obj = activityC16931x24037f86.f236377q.getText().toString();
        if (obj.trim().length() <= 0) {
            java.lang.String X6 = activityC16931x24037f86.X6();
            int i19 = activityC16931x24037f86.M;
            if (i19 == 20) {
                if (X6.length() > 0) {
                    obj = X6.substring(0, X6.length() <= 40 ? X6.length() : 40);
                }
                obj = activityC16931x24037f86.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574249hk5);
            } else {
                if (i19 == 21 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(X6)) {
                    obj = X6.substring(0, X6.length() <= 40 ? X6.length() : 40);
                }
                obj = activityC16931x24037f86.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574249hk5);
            }
        }
        bundle.putString("mail_subject", obj);
        bundle.putString("mail_content", activityC16931x24037f86.X6());
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        android.os.Bundle bundle2 = new android.os.Bundle();
        java.lang.String str5 = ks3.k0.f393236g;
        java.lang.String str6 = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), js3.c.class)).f149939d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Mail.ComposeUI", "bindMail is null");
            dp.a.m125853x26a183b(activityC16931x24037f86, com.p314xaae8f345.mm.R.C30867xcad56011.hjo, 1).show();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC16931x24037f86.A;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            return activityC16931x24037f86.D;
        }
        java.lang.String str7 = "item_addr";
        bundle2.putString("item_addr", str6);
        arrayList.add(bundle2);
        bundle.putParcelableArrayList("mail_from_list", arrayList);
        java.lang.String str8 = "mail_to_list";
        bundle.putParcelableArrayList("mail_to_list", activityC16931x24037f86.a7(activityC16931x24037f86.f236366e.m67777xeb5f5875()));
        java.lang.String str9 = "mail_cc_list";
        bundle.putParcelableArrayList("mail_cc_list", activityC16931x24037f86.a7(activityC16931x24037f86.f236370i.m67777xeb5f5875()));
        java.lang.String str10 = "mail_bcc_list";
        bundle.putParcelableArrayList("mail_bcc_list", activityC16931x24037f86.a7(activityC16931x24037f86.f236374o.m67777xeb5f5875()));
        java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList3 = new java.util.ArrayList<>();
        java.util.Iterator it = activityC16931x24037f86.f236386y.e().iterator();
        while (true) {
            str = "attach_path";
            str2 = str10;
            str3 = str9;
            if (!it.hasNext()) {
                break;
            }
            java.util.Iterator it6 = it;
            ks3.v0 v0Var = (ks3.v0) it.next();
            java.lang.String str11 = str8;
            android.os.Bundle bundle3 = new android.os.Bundle();
            java.lang.String str12 = str7;
            bundle3.putString("attach_fileId", v0Var.f393293i);
            bundle3.putString("attach_name", v0Var.f393289e);
            bundle3.putString("attach_path", v0Var.f393288d);
            bundle3.putInt("attach_size", (int) v0Var.f393290f);
            if (((java.util.HashMap) activityC16931x24037f86.N).containsKey(v0Var.f393289e)) {
                arrayList3.add(bundle3);
            } else {
                arrayList2.add(bundle3);
            }
            str8 = str11;
            str10 = str2;
            str9 = str3;
            it = it6;
            str7 = str12;
        }
        java.lang.String str13 = str8;
        java.lang.String str14 = str7;
        bundle.putParcelableArrayList("mail_normal_attach", arrayList2);
        bundle.putParcelableArrayList("mail_image_attach", arrayList3);
        java.lang.String str15 = activityC16931x24037f86.D;
        ks3.z0 z0Var = new ks3.z0();
        z0Var.f393326d = bundle.getInt("mail_send_type");
        z0Var.f393335p = bundle.getString("mail_id");
        z0Var.f393331i = bundle.getString("mail_subject");
        java.lang.String string = bundle.getString("mail_content");
        z0Var.f393332m = string;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.NormalMailAppService", "parseSendMailContent before content:%s", string);
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("mail_image_attach");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            java.util.Iterator it7 = parcelableArrayList.iterator();
            while (it7.hasNext()) {
                android.os.Bundle bundle4 = (android.os.Bundle) it7.next();
                java.lang.String string2 = bundle4.getString("attach_fileId", "");
                java.util.Iterator it8 = it7;
                java.lang.String string3 = bundle4.getString("attach_name", "");
                java.lang.String string4 = bundle4.getString(str, "");
                z0Var.f393332m = z0Var.f393332m.replaceAll(java.lang.String.format("src=\"%s\"", "file://" + string4), java.lang.String.format("src=\"/attach/preview?bizid=50&fileid=%s&name=%s\"", string2, string3));
                it7 = it8;
                str = str;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.NormalMailAppService", "parseSendMailContent after content:%s", z0Var.f393332m);
        z0Var.f393336q = true;
        java.util.ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("mail_from_list");
        if (parcelableArrayList2 == null || parcelableArrayList2.isEmpty()) {
            str4 = str14;
        } else {
            ks3.x0 x0Var = new ks3.x0();
            z0Var.f393327e = x0Var;
            x0Var.f393305f = gm0.j1.b().h();
            str4 = str14;
            z0Var.f393327e.f393304e = ((android.os.Bundle) parcelableArrayList2.get(0)).getString(str4);
            z0Var.f393327e.f393303d = ((android.os.Bundle) parcelableArrayList2.get(0)).getString(ya.b.f77485x2838ac37);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.NormalMailAppService", "from addr %s", z0Var.f393327e.f393304e);
        }
        java.util.ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(str13);
        if (parcelableArrayList3 != null && !parcelableArrayList3.isEmpty()) {
            java.util.Iterator it9 = parcelableArrayList3.iterator();
            while (it9.hasNext()) {
                android.os.Bundle bundle5 = (android.os.Bundle) it9.next();
                ks3.x0 x0Var2 = new ks3.x0();
                x0Var2.f393304e = bundle5.getString(str4);
                x0Var2.f393303d = bundle5.getString(ya.b.f77485x2838ac37);
                z0Var.f393328f.add(x0Var2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.NormalMailAppService", "to addr %s", x0Var2.f393304e);
            }
        }
        java.util.ArrayList parcelableArrayList4 = bundle.getParcelableArrayList(str3);
        if (parcelableArrayList4 != null && !parcelableArrayList4.isEmpty()) {
            java.util.Iterator it10 = parcelableArrayList4.iterator();
            while (it10.hasNext()) {
                android.os.Bundle bundle6 = (android.os.Bundle) it10.next();
                ks3.x0 x0Var3 = new ks3.x0();
                x0Var3.f393304e = bundle6.getString(str4);
                x0Var3.f393303d = bundle6.getString(ya.b.f77485x2838ac37);
                z0Var.f393329g.add(x0Var3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.NormalMailAppService", "cc addr %s", x0Var3.f393304e);
            }
        }
        java.util.ArrayList parcelableArrayList5 = bundle.getParcelableArrayList(str2);
        if (parcelableArrayList5 != null && !parcelableArrayList5.isEmpty()) {
            java.util.Iterator it11 = parcelableArrayList5.iterator();
            while (it11.hasNext()) {
                android.os.Bundle bundle7 = (android.os.Bundle) it11.next();
                ks3.x0 x0Var4 = new ks3.x0();
                x0Var4.f393304e = bundle7.getString(str4);
                x0Var4.f393303d = bundle7.getString(ya.b.f77485x2838ac37);
                z0Var.f393330h.add(x0Var4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.NormalMailAppService", "bcc addr %s", x0Var4.f393304e);
            }
        }
        java.util.ArrayList parcelableArrayList6 = bundle.getParcelableArrayList("mail_normal_attach");
        if (parcelableArrayList6 != null && !parcelableArrayList6.isEmpty()) {
            java.util.Iterator it12 = parcelableArrayList6.iterator();
            while (it12.hasNext()) {
                android.os.Bundle bundle8 = (android.os.Bundle) it12.next();
                ks3.w0 w0Var = new ks3.w0();
                w0Var.f393295d = bundle8.getString("attach_fileId");
                w0Var.f393300i = bundle8.getString("attach_key");
                w0Var.f393296e = bundle8.getString("attach_name");
                w0Var.f393297f = bundle8.getInt("attach_size");
                w0Var.f393299h = bundle8.getString("attach_download_url");
                w0Var.f393298g = bundle8.getString("attach_type");
                z0Var.f393333n.add(w0Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.NormalMailAppService", "attach %s,%s,%s", w0Var.f393295d, w0Var.f393296e, w0Var.f393299h);
            }
        }
        java.util.ArrayList parcelableArrayList7 = bundle.getParcelableArrayList("mail_big_attach");
        if (parcelableArrayList7 != null && !parcelableArrayList7.isEmpty()) {
            java.util.Iterator it13 = parcelableArrayList7.iterator();
            while (it13.hasNext()) {
                android.os.Bundle bundle9 = (android.os.Bundle) it13.next();
                ks3.w0 w0Var2 = new ks3.w0();
                w0Var2.f393295d = bundle9.getString("attach_fileId");
                w0Var2.f393300i = bundle9.getString("attach_key");
                w0Var2.f393296e = bundle9.getString("attach_name");
                w0Var2.f393297f = bundle9.getInt("attach_size");
                w0Var2.f393299h = bundle9.getString("attach_download_url");
                w0Var2.f393298g = bundle9.getString("attach_type");
                z0Var.f393334o.add(w0Var2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.NormalMailAppService", "big attach %s,%s,%s", w0Var2.f393295d, w0Var2.f393296e, w0Var2.f393299h);
            }
        }
        gm0.j1.d().g(new ms3.e(str15, z0Var));
        return activityC16931x24037f86.D;
    }

    public final void V6() {
        this.f236366e.clearFocus();
        this.f236370i.clearFocus();
        this.f236374o.clearFocus();
    }

    public final void W6(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.ComposeUI", "comfirmToUpload() called with: path = [" + str + "], title = [" + str2 + "]");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (r6Var.m()) {
            if (((java.util.HashMap) this.f236386y.f429759h).containsKey(str)) {
                db5.e1.i(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.hkp, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
                return;
            }
            int C = (int) r6Var.C();
            if (C > 20971520) {
                db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.hkq, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, null);
            } else {
                db5.e1.u(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hks, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(C)), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new os3.c0(this, C, r6Var, str, str2), null);
            }
        }
    }

    public final java.lang.String X6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(this.f236382v.getText().toString());
        zg0.q3 q3Var = (zg0.q3) i95.n0.c(zg0.q3.class);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f236383w;
        ((yg0.s4) q3Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.i(c22633x83752a59, this.T, this.I, true);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.P)) {
            java.lang.String str = this.P;
            java.lang.String str2 = this.f236364J;
            int indexOf = str.indexOf(str2);
            java.lang.String str3 = this.P;
            java.lang.String str4 = this.K;
            int lastIndexOf = str3.lastIndexOf(str4);
            if (indexOf == -1 || lastIndexOf == -1) {
                sb6.append("\n");
                sb6.append(this.P);
            } else {
                java.lang.String substring = this.P.substring(indexOf + str2.length(), lastIndexOf + str4.length());
                sb6.append("\n");
                sb6.append(substring);
            }
        }
        return sb6.toString();
    }

    public final void Y6() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f236383w;
        if (c22633x83752a59 != null) {
            c22633x83752a59.clearFocus();
            com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf999 = this.f236383w.mo120153xd15cf999();
            mo120153xd15cf999.E(true);
            mo120153xd15cf999.h(true);
            this.f236383w.mo74800x23d27c02(new os3.r0(this, null));
            this.f236383w.mo81410x6fd49b97(new os3.q0(this, null));
            this.f236383w.setOnTouchListener(new os3.q(this));
        }
    }

    public final java.util.List Z6(java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (strArr != null) {
            for (java.lang.String str : strArr) {
                ks3.u uVar = null;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    java.lang.String trim = str.trim();
                    int lastIndexOf = trim.trim().lastIndexOf(" ");
                    if (lastIndexOf != -1) {
                        uVar = new ks3.u();
                        uVar.f393283e = trim.substring(0, lastIndexOf);
                        uVar.f393284f = trim.substring(lastIndexOf + 1);
                    }
                }
                if (uVar != null) {
                    arrayList.add(uVar);
                }
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList a7(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ks3.u uVar = (ks3.u) it.next();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("item_addr", uVar.f393284f);
            bundle.putString(ya.b.f77485x2838ac37, uVar.f393283e);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final void b7() {
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        java.lang.String m17 = lp0.b.m();
        java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
        ((ub0.r) oVar).getClass();
        if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.l(this, m17, str, 3)) {
            return;
        }
        dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.igw), 1).show();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cbg;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x015f  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86.mo43517x10010bd5():void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String b17;
        if (i18 != -1) {
            return;
        }
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed c16936x21d2caed = this.f236366e;
            java.util.List<ks3.u> list = f236363p1;
            if (list != null) {
                c16936x21d2caed.m67782x75ed00cb(list);
            }
            mo26063x7b383410();
            return;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed c16936x21d2caed2 = this.f236370i;
            java.util.List<ks3.u> list2 = f236363p1;
            if (list2 != null) {
                c16936x21d2caed2.m67782x75ed00cb(list2);
            }
            mo26063x7b383410();
            return;
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed c16936x21d2caed3 = this.f236374o;
            java.util.List<ks3.u> list3 = f236363p1;
            if (list3 != null) {
                c16936x21d2caed3.m67782x75ed00cb(list3);
            }
            mo26063x7b383410();
            return;
        }
        if (i17 == 3) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            java.lang.String a17 = g83.a.a();
            ((ub0.r) oVar).getClass();
            java.lang.String b18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.b(this, intent, a17);
            if (b18 == null) {
                return;
            }
            W6(b18, "");
            V6();
            return;
        }
        if (i17 == 4) {
            if (intent == null || (b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.i1.b(this, intent, g83.a.a())) == null || b17.length() <= 0) {
                return;
            }
            W6(b17, "");
            V6();
            return;
        }
        if (i17 == 6 && intent != null) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("selected_file_lst");
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("selected_file_title_lst");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(stringArrayListExtra) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(stringArrayListExtra2)) {
                return;
            }
            W6(stringArrayListExtra.get(0), stringArrayListExtra2.get(0));
            V6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.L = this.f236364J + "%s" + this.K;
        this.V = false;
        this.B = getIntent().getIntExtra("composeType", 1);
        java.lang.String stringExtra = getIntent().getStringExtra("mailid");
        this.C = stringExtra;
        if (stringExtra == null) {
            this.C = "";
        }
        this.M = getIntent().getIntExtra("mail_mode", 20);
        mo43517x10010bd5();
        ks3.z zVar = ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().f393239b;
        this.f236384x = zVar;
        zVar.b(this.Z);
        this.f236384x.d();
        this.Y.c(180000L, 180000L);
        gm0.j1.d().a(11166, this);
        this.f39316x876ccafe = getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getBoolean("settings_landscape_mode", false);
        this.W = this.f39316x876ccafe || getIntent().getBooleanExtra("KEY_SUPPORT_ORIENTATION", false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (f236363p1 != null) {
            f236363p1 = null;
        }
        this.f236386y.a();
        os3.v1 v1Var = this.f236386y;
        v1Var.getClass();
        gm0.j1.n().f354821b.q(11665, v1Var);
        this.f236384x.f(this.Z);
        os3.p3 p3Var = this.f236388z;
        p3Var.getClass();
        gm0.j1.n().f354821b.q(138, p3Var);
        gm0.j1.d().q(11166, this);
        this.Y.d();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f236387y0;
        mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
        os3.y yVar = (os3.y) onMenuItemClickListener;
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86 = yVar.f429785d;
        if ((T6(activityC16931x24037f86, false) && activityC16931x24037f86.M == 20) || activityC16931x24037f86.M == 21) {
            db5.e1.A(activityC16931x24037f86.mo55332x76847179(), activityC16931x24037f86.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574248hk4), "", activityC16931x24037f86.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hk6), activityC16931x24037f86.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new os3.x(yVar), null);
            return true;
        }
        activityC16931x24037f86.setResult(0);
        activityC16931x24037f86.finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        mo48674x36654fab();
        this.X.d();
        db5.d5 d5Var = this.E;
        if (d5Var != null) {
            d5Var.dismiss();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.ComposeUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.ComposeUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 16) {
            return;
        }
        if (iArr[0] == 0) {
            b7();
        } else {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh8), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new os3.w(this), null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.X.c(1500L, 1500L);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.ComposeUI", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (!((ms3.e) m1Var).f412521f.equals(this.D)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Mail.ComposeUI", "not current request, ignore");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.A;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjo);
            }
            dp.a.m125854x26a183b(this, str, 1).show();
            return;
        }
        dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.hjq, 1).show();
        ks3.i iVar = ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().f393240c;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(iVar.f393219a.f393279a + iVar.a(this.C, this.B));
        if (r6Var.m()) {
            r6Var.l();
        }
        this.f236384x.c(this.f236366e.m67777xeb5f5875());
        this.f236384x.c(this.f236370i.m67777xeb5f5875());
        this.f236384x.c(this.f236374o.m67777xeb5f5875());
        setResult(-1);
        finish();
    }
}
