package cj5;

/* loaded from: classes.dex */
public final class g5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.k5 f42129d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(cj5.k5 k5Var) {
        super(1);
        this.f42129d = k5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cj5.k5 k5Var;
        java.util.Iterator it;
        long[] jArr;
        java.util.Iterator it6;
        java.lang.String wi6;
        java.util.ArrayList arrayList;
        java.lang.String r17;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6;
        java.lang.String str;
        java.lang.String str2;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.h0 h0Var = (wi5.h0) state.a(wi5.h0.class);
        cj5.k5 k5Var2 = this.f42129d;
        if (h0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationMainViewUIC", "InitAction");
            androidx.appcompat.app.AppCompatActivity activity = k5Var2.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
            mMActivity.addTextOptionMenu(1, k5Var2.getString(com.tencent.mm.R.string.f490441v5), new cj5.e5(k5Var2), null, com.tencent.mm.ui.fb.GREEN);
            mMActivity.getController().s0(new cj5.f5(k5Var2), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        }
        j75.d dVar = state.f298066d;
        int i17 = 0;
        int i18 = 1;
        if (dVar != null && (dVar instanceof wi5.l)) {
            wi5.l lVar = (wi5.l) dVar;
            k5Var2.getClass();
            ri5.j data = lVar.f446303b;
            kotlin.jvm.internal.o.g(data, "data");
            if (!data.f396125v && !data.f396115l1 && (P6 = k5Var2.P6()) != null && P6.getStateCenter() != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationMainViewUIC", "onItemClickListener data.type=" + data.f396110e + " position=" + lVar.f446304c);
                android.content.Intent intent = new android.content.Intent();
                java.lang.String str3 = data.f396111f;
                android.content.Intent putExtra = intent.putExtra("Chat_User", str3).putExtra("finish_direct", true).putExtra("key_record_msg_select", true);
                kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationMainViewUIC", "username=" + str3);
                if (k5Var2.f42174e.get(str3) != null) {
                    android.content.Intent putStringArrayListExtra = putExtra.putStringArrayListExtra("key_record_selected_msg_list", (java.util.ArrayList) k5Var2.f42174e.get(str3));
                    java.util.HashMap hashMap = (java.util.HashMap) k5Var2.f42175f.get(str3);
                    android.content.Intent putExtra2 = putStringArrayListExtra.putExtra("key_record_select_min_msg_id", (hashMap == null || (str2 = (java.lang.String) hashMap.get("lastSelectMinMsgId")) == null) ? -1L : java.lang.Long.parseLong(str2));
                    java.util.HashMap hashMap2 = (java.util.HashMap) k5Var2.f42175f.get(str3);
                    putExtra2.putExtra("key_record_select_msg_num", (hashMap2 == null || (str = (java.lang.String) hashMap2.get("selectMsgNum")) == null) ? 0 : java.lang.Integer.parseInt(str));
                }
                j45.l.w((com.tencent.mm.ui.MMActivity) k5Var2.getContext(), ".ui.chatting.ChattingUI", putExtra, 40, new cj5.d5(k5Var2, str3));
            }
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationMainViewUIC", "onCreate: ClickCancelMenuAction");
            k5Var2.getActivity().setResult(0);
            k5Var2.getActivity().finish();
        }
        j75.d dVar3 = state.f298066d;
        if (dVar3 != null && (dVar3 instanceof wi5.c0)) {
            k5Var2.getClass();
            java.util.HashMap hashMap3 = new java.util.HashMap();
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationMainViewUIC", k5Var2.f42173d.toString());
            java.util.Iterator it7 = k5Var2.f42173d.iterator();
            while (it7.hasNext()) {
                java.lang.String str4 = (java.lang.String) it7.next();
                if (k5Var2.f42174e.get(str4) != null) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) k5Var2.f42174e.get(str4);
                    if (((arrayList2 == null || ((arrayList2.isEmpty() ? 1 : 0) ^ i18) != i18) ? i17 : i18) != 0) {
                        kotlin.jvm.internal.o.d(str4);
                        java.util.ArrayList arrayList3 = (java.util.ArrayList) k5Var2.f42174e.get(str4);
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
                            arrayList5.add(pt0.f0.f358209b1.n(str4, jArr[i19]));
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
                            kotlin.jvm.internal.o.f(obj2, "get(...)");
                            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) obj2;
                            strArr[i38] = java.lang.String.valueOf(f9Var.I0());
                            if (com.tencent.mm.storage.z3.R4(str4)) {
                                strArr2[i38] = f9Var.isVideo() ? c01.w9.u(f9Var.J0()) : c01.w9.u(f9Var.j());
                                strArr3[i38] = c01.w9.s(f9Var.j());
                                it6 = it7;
                            } else {
                                strArr2[i38] = f9Var.isVideo() ? f9Var.J0() : f9Var.j();
                                if (com.tencent.mm.storage.z3.V3(f9Var.Q0())) {
                                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                                    it6 = it7;
                                    wi6 = com.tencent.mm.plugin.finder.service.m4.f126148a.h(f9Var.Q0());
                                } else {
                                    it6 = it7;
                                    wi6 = com.tencent.mm.storage.z3.H4(f9Var.Q0()) ? ((ki4.i0) ((bi4.y0) i95.n0.c(bi4.y0.class))).wi(f9Var.Q0()) : f9Var.Q0();
                                }
                                strArr3[i38] = wi6;
                            }
                            if (f9Var.A0() == 1) {
                                if (com.tencent.mm.storage.z3.V3(f9Var.Q0())) {
                                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                                    r17 = com.tencent.mm.plugin.finder.service.m4.f126148a.h(f9Var.Q0());
                                } else {
                                    r17 = c01.z1.r();
                                }
                                strArr3[i38] = r17;
                            }
                            if (com.tencent.mm.storage.z3.J4(f9Var.Q0())) {
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
                            iArr[i38] = f9Var.k2() ? 49 : f9Var.getType();
                            int i39 = size;
                            long j17 = 1000;
                            cj5.k5 k5Var3 = k5Var2;
                            iArr2[i38] = (int) (f9Var.getCreateTime() / j17);
                            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var.G, "msgsource", null);
                            if (d17 != null && d17.get(".msgsource.signature") != null) {
                                java.lang.String str7 = (java.lang.String) d17.get(".msgsource.signature");
                                if (str7 == null) {
                                    str7 = "";
                                }
                                strArr4[i38] = str7;
                                java.lang.String str8 = (java.lang.String) d17.get(".msgsource.realcreatetime");
                                if (str8 != null) {
                                    iArr2[i38] = com.tencent.mm.sdk.platformtools.t8.P(str8, (int) (f9Var.getCreateTime() / j17));
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
                                com.tencent.mars.xlog.Log.e("MicroMsg.SelectConversationMainViewUIC", "GetMsgProofItems exception " + e17.getMessage());
                            }
                        }
                        java.lang.String jSONArray2 = jSONArray.toString();
                        kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
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
            intent2.putExtra("selectedUserNames", k5Var4.f42173d);
            intent2.putExtra("selectDict", k5Var4.f42174e);
            intent2.putExtra("selectDictExtraData", k5Var4.f42175f);
            k5Var4.getActivity().setResult(-1, intent2);
            k5Var4.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
