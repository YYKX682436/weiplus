package cj5;

/* loaded from: classes.dex */
public final class g5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.k5 f123662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(cj5.k5 k5Var) {
        super(1);
        this.f123662d = k5Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        cj5.k5 k5Var;
        java.util.Iterator it;
        long[] jArr;
        java.util.Iterator it6;
        java.lang.String wi6;
        java.util.ArrayList arrayList;
        java.lang.String r17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6;
        java.lang.String str;
        java.lang.String str2;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.h0 h0Var = (wi5.h0) state.a(wi5.h0.class);
        cj5.k5 k5Var2 = this.f123662d;
        if (h0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationMainViewUIC", "InitAction");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = k5Var2.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
            abstractActivityC21394xb3d2c0cf.m78494xd9193382(1, k5Var2.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new cj5.e5(k5Var2), null, com.p314xaae8f345.mm.ui.fb.GREEN);
            abstractActivityC21394xb3d2c0cf.mo78514x143f1b92().s0(new cj5.f5(k5Var2), com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
        }
        j75.d dVar = state.f379599d;
        int i17 = 0;
        int i18 = 1;
        if (dVar != null && (dVar instanceof wi5.l)) {
            wi5.l lVar = (wi5.l) dVar;
            k5Var2.getClass();
            ri5.j data = lVar.f527836b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
            if (!data.f477658v && !data.f477648l1 && (P6 = k5Var2.P6()) != null && P6.m67437x4bd5310() != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationMainViewUIC", "onItemClickListener data.type=" + data.f477643e + " position=" + lVar.f527837c);
                android.content.Intent intent = new android.content.Intent();
                java.lang.String str3 = data.f477644f;
                android.content.Intent putExtra = intent.putExtra("Chat_User", str3).putExtra("finish_direct", true).putExtra("key_record_msg_select", true);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationMainViewUIC", "username=" + str3);
                if (k5Var2.f123707e.get(str3) != null) {
                    android.content.Intent putStringArrayListExtra = putExtra.putStringArrayListExtra("key_record_selected_msg_list", (java.util.ArrayList) k5Var2.f123707e.get(str3));
                    java.util.HashMap hashMap = (java.util.HashMap) k5Var2.f123708f.get(str3);
                    android.content.Intent putExtra2 = putStringArrayListExtra.putExtra("key_record_select_min_msg_id", (hashMap == null || (str2 = (java.lang.String) hashMap.get("lastSelectMinMsgId")) == null) ? -1L : java.lang.Long.parseLong(str2));
                    java.util.HashMap hashMap2 = (java.util.HashMap) k5Var2.f123708f.get(str3);
                    putExtra2.putExtra("key_record_select_msg_num", (hashMap2 == null || (str = (java.lang.String) hashMap2.get("selectMsgNum")) == null) ? 0 : java.lang.Integer.parseInt(str));
                }
                j45.l.w((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) k5Var2.m80379x76847179(), ".ui.chatting.ChattingUI", putExtra, 40, new cj5.d5(k5Var2, str3));
            }
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wi5.b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationMainViewUIC", "onCreate: ClickCancelMenuAction");
            k5Var2.m158354x19263085().setResult(0);
            k5Var2.m158354x19263085().finish();
        }
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof wi5.c0)) {
            k5Var2.getClass();
            java.util.HashMap hashMap3 = new java.util.HashMap();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationMainViewUIC", k5Var2.f123706d.toString());
            java.util.Iterator it7 = k5Var2.f123706d.iterator();
            while (it7.hasNext()) {
                java.lang.String str4 = (java.lang.String) it7.next();
                if (k5Var2.f123707e.get(str4) != null) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) k5Var2.f123707e.get(str4);
                    if (((arrayList2 == null || ((arrayList2.isEmpty() ? 1 : 0) ^ i18) != i18) ? i17 : i18) != 0) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
                        java.util.ArrayList arrayList3 = (java.util.ArrayList) k5Var2.f123707e.get(str4);
                        if (arrayList3 != null) {
                            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
                            java.util.Iterator it8 = arrayList3.iterator();
                            while (it8.hasNext()) {
                                arrayList4.add(java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) it8.next())));
                            }
                            jArr = kz5.n0.T0(arrayList4);
                        } else {
                            jArr = new long[i17];
                        }
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        int length = jArr.length;
                        for (int i19 = i17; i19 < length; i19++) {
                            arrayList5.add(pt0.f0.f439742b1.n(str4, jArr[i19]));
                        }
                        int size = arrayList5.size();
                        java.lang.String[] strArr = new java.lang.String[size];
                        for (int i27 = i17; i27 < size; i27++) {
                            strArr[i27] = null;
                        }
                        java.lang.String[] strArr2 = new java.lang.String[size];
                        for (int i28 = i17; i28 < size; i28++) {
                            strArr2[i28] = null;
                        }
                        java.lang.String[] strArr3 = new java.lang.String[size];
                        for (int i29 = i17; i29 < size; i29++) {
                            strArr3[i29] = null;
                        }
                        java.lang.String[] strArr4 = new java.lang.String[size];
                        for (int i37 = i17; i37 < size; i37++) {
                            strArr4[i37] = null;
                        }
                        int[] iArr = new int[size];
                        int[] iArr2 = new int[size];
                        int i38 = 0;
                        while (i38 < size) {
                            java.lang.Object obj2 = arrayList5.get(i38);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj2;
                            strArr[i38] = java.lang.String.valueOf(f9Var.I0());
                            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str4)) {
                                strArr2[i38] = f9Var.m78014x7b98c171() ? c01.w9.u(f9Var.J0()) : c01.w9.u(f9Var.j());
                                strArr3[i38] = c01.w9.s(f9Var.j());
                                it6 = it7;
                            } else {
                                strArr2[i38] = f9Var.m78014x7b98c171() ? f9Var.J0() : f9Var.j();
                                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(f9Var.Q0())) {
                                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                                    it6 = it7;
                                    wi6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a.h(f9Var.Q0());
                                } else {
                                    it6 = it7;
                                    wi6 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(f9Var.Q0()) ? ((ki4.i0) ((bi4.y0) i95.n0.c(bi4.y0.class))).wi(f9Var.Q0()) : f9Var.Q0();
                                }
                                strArr3[i38] = wi6;
                            }
                            if (f9Var.A0() == 1) {
                                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(f9Var.Q0())) {
                                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                                    r17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a.h(f9Var.Q0());
                                } else {
                                    r17 = c01.z1.r();
                                }
                                strArr3[i38] = r17;
                            }
                            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.J4(f9Var.Q0())) {
                                arrayList = arrayList5;
                                strArr3[i38] = f9Var.A0() == 1 ? ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).Di() : ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).Zi(f9Var.Q0());
                            } else {
                                arrayList = arrayList5;
                            }
                            java.lang.String str5 = strArr2[i38];
                            if (str5 == null) {
                                str5 = "";
                            }
                            strArr2[i38] = str5;
                            java.lang.String str6 = strArr3[i38];
                            if (str6 == null) {
                                str6 = "";
                            }
                            strArr3[i38] = str6;
                            iArr[i38] = f9Var.k2() ? 49 : f9Var.mo78013xfb85f7b0();
                            int i39 = size;
                            long j17 = 1000;
                            cj5.k5 k5Var3 = k5Var2;
                            iArr2[i38] = (int) (f9Var.mo78012x3fdd41df() / j17);
                            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.G, "msgsource", null);
                            if (d17 != null && d17.get(".msgsource.signature") != null) {
                                java.lang.String str7 = (java.lang.String) d17.get(".msgsource.signature");
                                if (str7 == null) {
                                    str7 = "";
                                }
                                strArr4[i38] = str7;
                                java.lang.String str8 = (java.lang.String) d17.get(".msgsource.realcreatetime");
                                if (str8 != null) {
                                    iArr2[i38] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str8, (int) (f9Var.mo78012x3fdd41df() / j17));
                                }
                            }
                            i38++;
                            size = i39;
                            arrayList5 = arrayList;
                            it7 = it6;
                            k5Var2 = k5Var3;
                        }
                        k5Var = k5Var2;
                        it = it7;
                        int i47 = size;
                        org.json.JSONArray jSONArray = new org.json.JSONArray();
                        for (int i48 = 0; i48 < i47; i48++) {
                            try {
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                jSONObject.put("newMsgId", strArr[i48]);
                                jSONObject.put("content", strArr2[i48]);
                                jSONObject.put("sender", strArr3[i48]);
                                jSONObject.put("msgType", iArr[i48]);
                                jSONObject.put("msgTime", iArr2[i48]);
                                jSONObject.put("msgSignature", strArr4[i48]);
                                jSONArray.put(jSONObject);
                            } catch (org.json.JSONException e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectConversationMainViewUIC", "GetMsgProofItems exception " + e17.getMessage());
                            }
                        }
                        java.lang.String jSONArray2 = jSONArray.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
                        hashMap3.put(str4, jSONArray2);
                        it7 = it;
                        k5Var2 = k5Var;
                        i17 = 0;
                        i18 = 1;
                    }
                }
                k5Var = k5Var2;
                it = it7;
                it7 = it;
                k5Var2 = k5Var;
                i17 = 0;
                i18 = 1;
            }
            cj5.k5 k5Var4 = k5Var2;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("result", hashMap3);
            intent2.putExtra("selectedUserNames", k5Var4.f123706d);
            intent2.putExtra("selectDict", k5Var4.f123707e);
            intent2.putExtra("selectDictExtraData", k5Var4.f123708f);
            k5Var4.m158354x19263085().setResult(-1, intent2);
            k5Var4.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
