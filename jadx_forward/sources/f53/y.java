package f53;

/* loaded from: classes8.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b f341230d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b) {
        this.f341230d = activityC15905x15a0ec7b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        f53.s sVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b.G;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b = this.f341230d;
        activityC15905x15a0ec7b.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15697x4d5ad03a c15697x4d5ad03a = activityC15905x15a0ec7b.f221556s;
        jSONObject.put("gamecenter_identifier", c15697x4d5ad03a != null ? c15697x4d5ad03a.f36429x9f88aca9 : null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC15905x15a0ec7b.f221545e;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
            throw null;
        }
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, c22621x7603e017.getText());
        f53.s sVar2 = activityC15905x15a0ec7b.D;
        jSONObject.put("atUserNameList", new org.json.JSONArray((java.util.Collection) sVar2.f341222c));
        java.lang.String str = activityC15905x15a0ec7b.f221558u;
        if (str == null || str.length() == 0) {
            sVar = sVar2;
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = activityC15905x15a0ec7b.f221557t;
            if (interfaceC4987x84e327cb != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("emoticonMd5", interfaceC4987x84e327cb.mo42933xb5885648());
                jSONObject3.put("productId", interfaceC4987x84e327cb.mo42930x4f4a97c4());
                jSONObject3.put("encryptUrl", interfaceC4987x84e327cb.J1());
                jSONObject3.put("aesKey", interfaceC4987x84e327cb.mo42927x1061ea06());
                jSONObject3.put("designerId", interfaceC4987x84e327cb.X0());
                jSONObject2.put("emojiInfo", jSONObject3);
                jSONArray.put(jSONObject2);
                jSONObject.put("imageArray", jSONArray);
            } else {
                jSONObject.put("imageArray", "[]");
            }
        } else {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            java.util.ArrayList d17 = kz5.c0.d(activityC15905x15a0ec7b.f221558u);
            java.lang.String str2 = g53.a.f350435a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = d17.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                f53.s sVar3 = sVar2;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str4 = g53.a.f350435a;
                sb6.append(str4);
                java.util.Iterator it6 = it;
                sb6.append("microMsg.image.");
                sb6.append(elapsedRealtime);
                sb6.append(".");
                sb6.append(str3.hashCode() & 65535);
                java.lang.String sb7 = sb6.toString();
                java.lang.String str5 = str4 + "microMsg.thumb." + elapsedRealtime + "." + (str3.hashCode() & 65535);
                if ((((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str3).m43592x7a249f0b() == 0) ? false : true) && com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str3)), new com.p314xaae8f345.mm.vfs.r6(sb7), android.graphics.Bitmap.CompressFormat.PNG)) || com.p314xaae8f345.mm.vfs.w6.d(str3, sb7, false) > 0) {
                    str3 = sb7;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.e(str3, str5);
                android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str3);
                e17.f264277p = n07.outWidth;
                e17.f264278q = n07.outHeight;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19285xc6d09416) e17).f264284w = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(str3);
                java.lang.String str6 = e17.f264269e;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(e17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCenterUtil", "now filepath is : %s, local id is : %s", str3, str6);
                arrayList2.add(str6);
                it = it6;
                sVar2 = sVar3;
            }
            sVar = sVar2;
            java.lang.String str7 = "";
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList2)) {
                org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
                try {
                    jSONStringer.array();
                    java.util.Iterator it7 = arrayList2.iterator();
                    while (it7.hasNext()) {
                        java.lang.String str8 = (java.lang.String) it7.next();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().b(str8);
                        if (b17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19285xc6d09416) {
                            jSONStringer.object();
                            jSONStringer.key(dm.i4.f66867x2a5c95c7);
                            jSONStringer.value(str8);
                            jSONStringer.key("height");
                            jSONStringer.value(b17.f264278q + "");
                            jSONStringer.key("width");
                            jSONStringer.value(b17.f264277p + "");
                            jSONStringer.key("isGif");
                            jSONStringer.value(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19285xc6d09416) b17).f264284w);
                            jSONStringer.endObject();
                        }
                    }
                    jSONStringer.endArray();
                    str7 = jSONStringer.toString();
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameCenterUtil", e18, "", new java.lang.Object[0]);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCenterUtil", "after parse to json data : %s", str7);
            jSONObject4.put("imageInfo", new org.json.JSONArray(str7));
            jSONArray2.put(jSONObject4);
            jSONObject.put("imageArray", jSONArray2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PostCommentDialogUI", "setResultAndFinish jsonData = " + jSONObject);
        if (activityC15905x15a0ec7b.B) {
            java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c;
            android.os.Bundle bundle = new android.os.Bundle();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15697x4d5ad03a c15697x4d5ad03a2 = activityC15905x15a0ec7b.f221556s;
            bundle.putString(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ParamKey.f15121xc2d3420e, c15697x4d5ad03a2 != null ? c15697x4d5ad03a2.f36429x9f88aca9 : null);
            bundle.putString("jsonData", jSONObject.toString());
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str9, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b.b.class, null);
        } else {
            m33.y0 y0Var = m33.x0.f404877a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15697x4d5ad03a c15697x4d5ad03a3 = activityC15905x15a0ec7b.f221556s;
            y0Var.a(c15697x4d5ad03a3 != null ? c15697x4d5ad03a3.f36429x9f88aca9 : null, jSONObject);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.List list = sVar.f341222c;
        java.util.ArrayList arrayList3 = (java.util.ArrayList) list;
        hashMap.put("comment_is_at", java.lang.String.valueOf(arrayList3.size() != 0 ? 1 : 2));
        hashMap.put("mention_num", java.lang.String.valueOf(arrayList3.size()));
        hashMap.put("comment_at_list", new org.json.JSONArray((java.util.Collection) list).toString());
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(activityC15905x15a0ec7b.mo55332x76847179(), 101, 2, 1, 48, 0, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.b(hashMap));
        activityC15905x15a0ec7b.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
