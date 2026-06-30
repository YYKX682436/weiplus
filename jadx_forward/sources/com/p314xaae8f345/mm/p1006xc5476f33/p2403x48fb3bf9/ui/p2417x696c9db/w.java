package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f268534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f268535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f268536f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f268537g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9 f268538h;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9 activityC19314x5b64dca9, java.util.ArrayList arrayList, boolean z17, java.util.List list, int i17) {
        this.f268538h = activityC19314x5b64dca9;
        this.f268534d = arrayList;
        this.f268535e = z17;
        this.f268536f = list;
        this.f268537g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String g17;
        java.util.Iterator it;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9 activityC19314x5b64dca9 = this.f268538h;
        boolean z17 = activityC19314x5b64dca9.f265170t;
        boolean z18 = this.f268535e;
        if (z17) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it6 = this.f268534d.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it6.next();
                if (abstractC15633xee433078 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "it is a livephoto");
                    boolean z19 = true;
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0) abstractC15633xee433078).G != 1) {
                        it = it6;
                        aq.u0 Ai = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).Ai(abstractC15633xee433078.f219967i, abstractC15633xee433078.f219963e, abstractC15633xee433078.f219966h, activityC19314x5b64dca9.getIntent().getIntExtra("key_live_photo_max_duration", 0));
                        z19 = Ai.f94508a.f94493a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "livePhoto is no parse >> parse result :%b errCode: %s", java.lang.Boolean.valueOf(z19), Ai.m8808x9616526c());
                    } else {
                        it = it6;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "isParsedVideo == 1!");
                    }
                    if (z19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "getVideoMetaData success");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.b(abstractC15633xee433078.f219963e);
                        java.lang.String str = b17.f264269e;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(b17);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.d(abstractC15633xee433078.f219966h);
                        java.lang.String str2 = d17.f264269e;
                        d17.f264281t = z18;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(d17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "now filepath is : %s, local id is : %s videolocal id is : %s", abstractC15633xee433078.f219963e, str2, str);
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            jSONObject.put(dm.i4.f66867x2a5c95c7, str2);
                            jSONObject.put("videoLocalId", str);
                        } catch (org.json.JSONException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenFileChooserUI", e17, "", new java.lang.Object[0]);
                        }
                        jSONArray.put(jSONObject);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "getVideoMetaData fail");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 d18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.d(abstractC15633xee433078.f219966h);
                        java.lang.String str3 = d18.f264269e;
                        d18.f264281t = z18;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(d18);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "now filepath is : %s, local id is : %s", abstractC15633xee433078.f219966h, str3);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(activityC19314x5b64dca9.f265166p, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3.f34476x24728b)) {
                            jSONArray.put(str3);
                        } else {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            try {
                                jSONObject2.put(dm.i4.f66867x2a5c95c7, str3);
                            } catch (org.json.JSONException e18) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenFileChooserUI", e18, "", new java.lang.Object[0]);
                            }
                            jSONArray.put(jSONObject2);
                        }
                    }
                } else {
                    it = it6;
                    if (abstractC15633xee433078 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "it is a image not live");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 d19 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.d(abstractC15633xee433078.f219963e);
                        java.lang.String str4 = d19.f264269e;
                        d19.f264281t = z18;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(d19);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "now filepath is : %s, local id is : %s", abstractC15633xee433078.f219963e, str4);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(activityC19314x5b64dca9.f265166p, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3.f34476x24728b)) {
                            jSONArray.put(str4);
                        } else {
                            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                            try {
                                jSONObject3.put(dm.i4.f66867x2a5c95c7, str4);
                            } catch (org.json.JSONException e19) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenFileChooserUI", e19, "", new java.lang.Object[0]);
                            }
                            jSONArray.put(jSONObject3);
                        }
                    }
                }
                it6 = it;
            }
            g17 = jSONArray.toString();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str5 : this.f268536f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 d27 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.d(str5);
                java.lang.String str6 = d27.f264269e;
                d27.f264281t = z18;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(d27);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "now filepath is : %s, local id is : %s", str5, str6);
                arrayList.add(str6);
            }
            g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(activityC19314x5b64dca9.f265166p, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3.f34476x24728b) ? com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.g(arrayList) : com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.h(arrayList);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", g17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_pick_local_media_local_ids", g17);
        intent.putExtra("key_pick_local_media_show_memory_warning", activityC19314x5b64dca9.f265169s);
        intent.putExtra("key_pick_local_media_callback_type", 2);
        intent.putExtra("key_pick_local_pic_source_type", activityC19314x5b64dca9.f265167q ? "camera" : com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37635xb5a3973f);
        activityC19314x5b64dca9.setResult(this.f268537g, intent);
        activityC19314x5b64dca9.finish();
    }
}
