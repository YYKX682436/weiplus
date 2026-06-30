package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class m0 implements p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9 f267201d;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9 activityC19314x5b64dca9) {
        this.f267201d = activityC19314x5b64dca9;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: getContext */
    public oz5.l mo48699x76847179() {
        return oz5.m.f431862d;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: resumeWith */
    public void mo48700xdecd0e93(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "optMediaTabPicker finish");
        boolean z17 = obj instanceof qc0.m1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9 activityC19314x5b64dca9 = this.f267201d;
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
            if (!a17.a()) {
                if (!(a17.f442928a == qc0.n1.f442952f)) {
                    android.os.Bundle bundle = m1Var.f442947e;
                    java.lang.String string = bundle != null ? bundle.getString("sourceType", "unknow") : "unknow";
                    java.lang.String str = a17.f442929b;
                    activityC19314x5b64dca9.f265164n = str;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", str);
                    if (!activityC19314x5b64dca9.c7(activityC19314x5b64dca9.f265165o)) {
                        java.lang.String str2 = a17.f442930c;
                        if (activityC19314x5b64dca9.c7(str2)) {
                            activityC19314x5b64dca9.f265165o = str2;
                        }
                    }
                    com.p314xaae8f345.mm.vfs.r6 r6Var = !android.text.TextUtils.isEmpty(activityC19314x5b64dca9.f265164n) ? new com.p314xaae8f345.mm.vfs.r6(activityC19314x5b64dca9.f265164n) : null;
                    if (r6Var != null && r6Var.m()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "video file is exist! path:%s", activityC19314x5b64dca9.f265164n);
                        activityC19314x5b64dca9.X6(activityC19314x5b64dca9.f265164n, string);
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "video file is not exist! path:%s", activityC19314x5b64dca9.f265164n);
                }
            }
            dw4.a.a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.ui.tools.m0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9 activityC19314x5b64dca92;
                    boolean z18;
                    boolean z19;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.m0 m0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.m0.this;
                    m0Var.getClass();
                    android.content.Intent intent2 = new android.content.Intent();
                    qc0.m1 m1Var2 = m1Var;
                    android.os.Bundle bundle2 = m1Var2.f442947e;
                    if (bundle2 != null) {
                        intent2.putExtra("sourceType", bundle2.getString("sourceType", "unknow"));
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = m1Var2.f442946d.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        activityC19314x5b64dca92 = m0Var.f267201d;
                        if (!hasNext) {
                            break;
                        }
                        qc0.l1 l1Var = (qc0.l1) it.next();
                        java.lang.String str3 = l1Var.f442929b;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "picture_picturePath file is not exist! path:%s", str3);
                        } else {
                            com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str3);
                            java.lang.String str4 = a18.f294812f;
                            if (str4 != null) {
                                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                                if (!str4.equals(l17)) {
                                    a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
                                }
                            }
                            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
                            if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                                if (l1Var.f442928a == qc0.n1.f442952f) {
                                    if (l1Var.f442936i == 1 && com.p314xaae8f345.mm.vfs.w6.j(l1Var.f442932e)) {
                                        z18 = false;
                                        z19 = true;
                                    } else {
                                        aq.u0 Ai = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).Ai(l1Var.f442934g, l1Var.f442933f, l1Var.f442929b, activityC19314x5b64dca92.getIntent().getIntExtra("key_live_photo_max_duration", 0));
                                        z19 = Ai.f94508a.f94493a;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "livePhoto is no parse >> parse result :%b errCode: %s", java.lang.Boolean.valueOf(z19), Ai.m8808x9616526c());
                                        z18 = true;
                                    }
                                    if (z19) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "getVideoMetaData success");
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.b(z18 ? l1Var.f442933f : l1Var.f442932e);
                                        java.lang.String str5 = b17.f264269e;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(b17);
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.d(l1Var.f442929b);
                                        java.lang.String str6 = d17.f264269e;
                                        d17.f264281t = l1Var.f442935h;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(d17);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "now filepath is : %s, local id is : %s videolocal id is : %s", l1Var.f442932e, str6, str5);
                                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                                        try {
                                            jSONObject.put(dm.i4.f66867x2a5c95c7, str6);
                                            jSONObject.put("videoLocalId", str5);
                                        } catch (org.json.JSONException e17) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenFileChooserUI", e17, "", new java.lang.Object[0]);
                                        }
                                        arrayList.add(jSONObject.toString());
                                    }
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 d18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.d(str3);
                                d18.f264281t = true;
                                d18.f264275n = 1;
                                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(d18);
                                arrayList.add(d18.f264269e);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "filepath is : %s, local id is : %s", str3, d18.f264269e);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "picture filePath is not nil, but couldn't access the picture! The reason might be no permissions! path:%s", str3);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "picture localIds is empty");
                        intent2.putExtra("key_pick_local_pic_fail_reason", "picture localIds is empty!");
                        activityC19314x5b64dca92.setResult(1, intent2);
                        activityC19314x5b64dca92.finish();
                        return;
                    }
                    java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(activityC19314x5b64dca92.f265166p, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3.f34476x24728b) ? com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.g(arrayList) : com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.h(arrayList);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", g17);
                    intent2.putExtra("key_pick_local_media_local_ids", g17);
                    intent2.putExtra("key_pick_local_media_callback_type", 2);
                    intent2.putExtra("key_pick_local_media_show_memory_warning", activityC19314x5b64dca92.f265169s);
                    intent2.putExtra("key_pick_local_pic_source_type", activityC19314x5b64dca92.f265167q ? "camera" : com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37635xb5a3973f);
                    activityC19314x5b64dca92.setResult(m1Var2.f442944b, intent2);
                    activityC19314x5b64dca92.finish();
                }
            });
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_pick_local_media_show_memory_warning", activityC19314x5b64dca9.f265169s);
        activityC19314x5b64dca9.setResult(1, intent2);
        activityC19314x5b64dca9.finish();
    }
}
