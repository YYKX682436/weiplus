package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class h0 implements p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9 f266313d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9 activityC19314x5b64dca9) {
        this.f266313d = activityC19314x5b64dca9;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: getContext */
    public oz5.l mo48699x76847179() {
        return oz5.m.f431862d;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: resumeWith */
    public void mo48700xdecd0e93(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "optRecord finish");
        boolean z17 = obj instanceof qc0.m1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9 activityC19314x5b64dca9 = this.f266313d;
        if (z17) {
            final qc0.m1 m1Var = (qc0.m1) obj;
            if (m1Var.f442944b != -1 || m1Var.f442945c != 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_pick_local_media_show_memory_warning", activityC19314x5b64dca9.f265169s);
                activityC19314x5b64dca9.setResult(m1Var.f442944b, intent);
                activityC19314x5b64dca9.finish();
                return;
            }
            qc0.l1 a17 = m1Var.a();
            boolean a18 = a17.a();
            final java.lang.String str = a17.f442929b;
            if (a18) {
                final android.content.Intent intent2 = new android.content.Intent();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "picture_picturePath file is not exist! path:%s", str);
                    intent2.putExtra("key_pick_local_pic_fail_reason", "can't get the image's filePath!");
                    activityC19314x5b64dca9.setResult(1, intent2);
                    activityC19314x5b64dca9.finish();
                    return;
                }
                com.p314xaae8f345.mm.vfs.z7 a19 = com.p314xaae8f345.mm.vfs.z7.a(str);
                java.lang.String str2 = a19.f294812f;
                if (str2 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a19 = new com.p314xaae8f345.mm.vfs.z7(a19.f294810d, a19.f294811e, l17, a19.f294813g, a19.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a19, null);
                if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
                    dw4.a.a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.ui.tools.h0$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.h0.this;
                            h0Var.getClass();
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.String str3 = str;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.d(str3);
                            d17.f264281t = true;
                            d17.f264275n = 1;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(d17);
                            arrayList.add(d17.f264269e);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "filepath is : %s, local id is : %s", str3, d17.f264269e);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9 activityC19314x5b64dca92 = h0Var.f266313d;
                            java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(activityC19314x5b64dca92.f265166p, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3.f34476x24728b) ? com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.g(arrayList) : com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.h(arrayList);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", g17);
                            android.content.Intent intent3 = intent2;
                            intent3.putExtra("key_pick_local_media_local_ids", g17);
                            intent3.putExtra("key_pick_local_media_callback_type", 2);
                            intent3.putExtra("key_pick_local_media_show_memory_warning", activityC19314x5b64dca92.f265169s);
                            intent3.putExtra("key_pick_local_pic_source_type", activityC19314x5b64dca92.f265167q ? "camera" : com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37635xb5a3973f);
                            activityC19314x5b64dca92.setResult(m1Var.f442944b, intent3);
                            activityC19314x5b64dca92.finish();
                        }
                    });
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "picture filePath is not nil, but couldn't access the picture! The reason might be no permissions! path:%s", str);
                intent2.putExtra("key_pick_local_pic_fail_reason", "can't have access to the image!");
                activityC19314x5b64dca9.setResult(1, intent2);
                activityC19314x5b64dca9.finish();
                return;
            }
            activityC19314x5b64dca9.f265164n = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", str);
            if (!activityC19314x5b64dca9.c7(activityC19314x5b64dca9.f265165o)) {
                java.lang.String str3 = a17.f442930c;
                if (activityC19314x5b64dca9.c7(str3)) {
                    activityC19314x5b64dca9.f265165o = str3;
                }
            }
            com.p314xaae8f345.mm.vfs.r6 r6Var = android.text.TextUtils.isEmpty(activityC19314x5b64dca9.f265164n) ? null : new com.p314xaae8f345.mm.vfs.r6(activityC19314x5b64dca9.f265164n);
            if (r6Var != null && r6Var.m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "video file is exist! path:%s", activityC19314x5b64dca9.f265164n);
                activityC19314x5b64dca9.W6(activityC19314x5b64dca9.f265164n);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "video file is not exist! path:%s", activityC19314x5b64dca9.f265164n);
        }
        android.content.Intent intent3 = new android.content.Intent();
        intent3.putExtra("key_pick_local_media_show_memory_warning", activityC19314x5b64dca9.f265169s);
        activityC19314x5b64dca9.setResult(1, intent3);
        activityC19314x5b64dca9.finish();
    }
}
