package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes8.dex */
public class w3 extends com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f270645e = {"wxf109da3e26cf89f1", "wxc56bba830743541e", "wx41dd4f6ef137bd0b"};

    public w3(java.util.List list) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R;
        java.util.List linkedList = new java.util.LinkedList(list);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.v93();
        lVar.f152198b = new r45.w93();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getappinfolist";
        lVar.f152200d = 451;
        boolean z17 = false;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f270623d = a17;
        r45.v93 v93Var = (r45.v93) a17.f152243a.f152217a;
        java.util.LinkedList d17 = d(linkedList);
        v93Var.f469535e = d17;
        v93Var.f469534d = d17.size();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList) && (R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("key_open_sdk_pkg")) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                linkedList2.add(R.u((java.lang.String) it.next(), ""));
            }
            java.util.Iterator it6 = linkedList2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) it6.next())) {
                    z17 = true;
                    break;
                }
            }
            if (z17) {
                linkedList3 = d(linkedList2);
            }
        }
        v93Var.f469537g = linkedList3;
        v93Var.f469536f = linkedList3.size();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3
    public void a(byte[] bArr) {
        if (bArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetAppInfoList", "buf is null");
            return;
        }
        try {
            this.f270623d.f152244b.mo13863x347f4535(bArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetAppInfoList", "parse error: " + e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetAppInfoList", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3
    public int b() {
        return 7;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3
    public byte[] c() {
        try {
            return ((com.p314xaae8f345.mm.p944x882e457a.m) this.f270623d.mo47979x2d63726f()).mo13852xc3d7db06();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetAppInfoList", "toProtBuf failed: " + e17.getMessage());
            return null;
        }
    }

    public final java.util.LinkedList d(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list == null) {
            return linkedList;
        }
        int size = list.size();
        java.lang.String[] strArr = new java.lang.String[size];
        list.toArray(strArr);
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.String str = strArr[i17];
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                linkedList.add(x51.j1.i(str));
            }
        }
        return linkedList;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar;
        boolean z17;
        java.lang.String str2;
        java.lang.String str3;
        boolean z18;
        boolean mo9952xce0038c9;
        java.lang.String str4;
        java.lang.String str5;
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetAppInfoList", "errType = " + i18 + ", errCode = " + i19);
            return;
        }
        java.util.LinkedList linkedList = ((r45.w93) this.f270623d.f152244b.f152233a).f470519e;
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.ej ejVar = (r45.ej) it.next();
            if (ejVar != null) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(ejVar.f455077d, false, false);
                if (j17 == null) {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar2 = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m();
                    mVar2.f67370x28d45f97 = ejVar.f455077d;
                    mVar = mVar2;
                    z17 = true;
                } else {
                    mVar = j17;
                    z17 = false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetAppInfoList", "appid:[%s], appinfoflag:[%d] AppSupportContentType:%d", ejVar.f455077d, java.lang.Integer.valueOf(ejVar.f455092v), java.lang.Long.valueOf(ejVar.C));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetAppInfoList", "appId=%s, appName=%s, status=%s, appInfoFlag=%s", mVar.f67370x28d45f97, mVar.f67372x453d1e07, java.lang.Integer.valueOf(mVar.f67391x10a0fed7), java.lang.Integer.valueOf(mVar.f67371xa2e856b6));
                if (!mVar.G0() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67372x453d1e07)) {
                    mVar.f67372x453d1e07 = ejVar.f455078e;
                }
                if (!mVar.G0() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67373x634ac1e1)) {
                    mVar.f67373x634ac1e1 = ejVar.f455080g;
                }
                if (!mVar.G0() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67375x634ac3bb)) {
                    mVar.f67375x634ac3bb = ejVar.f455082i;
                }
                mVar.f67366xc9d6017c = ejVar.f455079f;
                mVar.f67367xdf182e4c = ejVar.f455081h;
                mVar.f67368xdf183026 = ejVar.f455083m;
                mVar.f67380x32aac1e7 = ejVar.f455087q;
                mVar.f67386xa1e9e82c = ejVar.f455088r;
                java.lang.String str6 = ejVar.f455089s;
                if (str6 == null || str6.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUtil", "getDbSignature, svrSign is null");
                    str2 = null;
                } else {
                    str2 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.e(str6);
                }
                mVar.f67390xda9bc3b3 = str2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetAppInfoList", "get signature, server sig : %s, gen sig: %s pkd: %s", ejVar.f455089s, str2, ejVar.f455088r);
                java.lang.String str7 = ejVar.f455090t;
                mVar.f67378x454032b6 = str7;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7) && (mVar.f67378x454032b6.startsWith("1") || mVar.f67378x454032b6.startsWith("6"))) {
                    mVar.f67378x454032b6 = "," + mVar.f67378x454032b6;
                }
                mVar.f67371xa2e856b6 = ejVar.f455092v;
                mVar.f67379x119cf7dc = ejVar.f455093w;
                mVar.I = ejVar.f455091u;
                mVar.A = true;
                mVar.f67380x32aac1e7 = ejVar.f455087q;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ejVar.f455096z) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ejVar.A)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetAppInfoList", "get app download url and download md5 : [%s], [%s], [%s]", mVar.f67372x453d1e07, ejVar.f455096z, ejVar.A);
                    mVar.z0(ejVar.f455096z);
                    mVar.y0(ejVar.A);
                }
                mVar.A0(ejVar.B);
                mVar.f67392x8851807b = ejVar.C;
                int i27 = ejVar.f455094x;
                if (i27 > mVar.K) {
                    mVar.L = 1;
                    mVar.A = true;
                }
                mVar.K = i27;
                mVar.A = true;
                java.util.LinkedList<r45.z7> linkedList2 = ejVar.E;
                if (linkedList2 == null || linkedList2.isEmpty()) {
                    str3 = "";
                } else {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    for (r45.z7 z7Var : linkedList2) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            str4 = z7Var.f473290e;
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetAppInfoList", "convertPackInfosToJson failed:" + e17.getMessage());
                        }
                        if (str4 != null && str4.length() != 0) {
                            str5 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.e(str4);
                            jSONObject.put("PackageName", z7Var.f473289d);
                            jSONObject.put("AndroidSignature", str5);
                            jSONArray.put(jSONObject);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetAppInfoList", "convertPackInfosToJson pgk: " + z7Var.f473289d + ", sig: " + z7Var.f473290e + ", dbSig: " + str5);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUtil", "getDbSignature, svrSign is null");
                        str5 = null;
                        jSONObject.put("PackageName", z7Var.f473289d);
                        jSONObject.put("AndroidSignature", str5);
                        jSONArray.put(jSONObject);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetAppInfoList", "convertPackInfosToJson pgk: " + z7Var.f473289d + ", sig: " + z7Var.f473290e + ", dbSig: " + str5);
                    }
                    str3 = jSONArray.toString();
                }
                mVar.f67385x9b127804 = str3;
                java.lang.String str8 = ejVar.f455088r;
                boolean z19 = str8 == null || str8.length() == 0 || str8.length() == 0;
                if (z19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetAppInfoList", "no android app, packageName = " + ejVar.f455088r + "appid: " + mVar.f67370x28d45f97);
                }
                if (mVar.k()) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n0.c(mVar.f67370x28d45f97);
                }
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z Ri = zo3.p.Ri();
                java.lang.String[] strArr = f270645e;
                if (z17) {
                    mVar.f67391x10a0fed7 = z19 ? 3 : 4;
                    mVar.f67383x15b870c = java.lang.System.currentTimeMillis();
                    mVar.f67369x5e556d3a = ejVar.f455085o;
                    if (mVar.f67370x28d45f97 != null) {
                        int i28 = 0;
                        while (true) {
                            if (i28 >= 3) {
                                break;
                            }
                            if (mVar.f67370x28d45f97.equals(strArr[i28])) {
                                mVar.f67391x10a0fed7 = -1;
                                break;
                            }
                            i28++;
                        }
                    }
                    if (Ri.mo880xb970c2b9(mVar)) {
                        zo3.p.Di().a(mVar.f67370x28d45f97, 1);
                        zo3.p.Di().a(mVar.f67370x28d45f97, 2);
                        zo3.p.Di().a(mVar.f67370x28d45f97, 3);
                        zo3.p.Di().a(mVar.f67370x28d45f97, 4);
                        zo3.p.Di().a(mVar.f67370x28d45f97, 5);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetAppInfoList", "onGYNetEnd : insert fail");
                    }
                } else {
                    mVar.f67391x10a0fed7 = z19 ? 3 : mVar.f67391x10a0fed7;
                    if (mVar.f67370x28d45f97 != null) {
                        int i29 = 0;
                        while (true) {
                            if (i29 >= 3) {
                                break;
                            }
                            if (mVar.f67370x28d45f97.equals(strArr[i29])) {
                                mVar.f67391x10a0fed7 = -1;
                                break;
                            }
                            i29++;
                        }
                    }
                    java.lang.String str9 = mVar.f67369x5e556d3a;
                    if (str9 == null || str9.length() == 0) {
                        z18 = true;
                    } else {
                        java.lang.String str10 = ejVar.f455095y;
                        z18 = (str10 == null || str10.length() == 0) ? false : !mVar.f67369x5e556d3a.equals(ejVar.f455085o);
                    }
                    if (z18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetAppInfoList", "oldIcon = %s, newIcon = %s", mVar.f67369x5e556d3a, ejVar.f455085o);
                        mVar.f67369x5e556d3a = ejVar.f455085o;
                        mo9952xce0038c9 = Ri.mo9952xce0038c9(mVar, new java.lang.String[0]);
                        zo3.p.Di().a(mVar.f67370x28d45f97, 1);
                        zo3.p.Di().a(mVar.f67370x28d45f97, 2);
                        zo3.p.Di().a(mVar.f67370x28d45f97, 3);
                        zo3.p.Di().a(mVar.f67370x28d45f97, 4);
                        zo3.p.Di().a(mVar.f67370x28d45f97, 5);
                    } else {
                        mo9952xce0038c9 = Ri.mo9952xce0038c9(mVar, new java.lang.String[0]);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetAppInfoList", "update appinfo " + mo9952xce0038c9 + ", appid = " + ejVar.f455077d);
                }
            }
        }
    }
}
