package xr;

/* loaded from: classes8.dex */
public class c implements n23.m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f537668a;

    /* renamed from: b, reason: collision with root package name */
    public final xr.b f537669b;

    /* renamed from: c, reason: collision with root package name */
    public final qk.n7 f537670c;

    public c(java.util.List list, qk.n7 n7Var, xr.b bVar) {
        this.f537670c = n7Var;
        this.f537669b = bVar;
        this.f537668a = list;
    }

    public final java.lang.String a(java.lang.String str) {
        return ".addmsg" + str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c4, code lost:
    
        r2 = c(r1.f66759xf1091605, r1.f66765x602814dd);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgFetcher", "[fetchInternal] addMsgDefault is null? %s", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d7, code lost:
    
        if (r2 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d9, code lost:
    
        r1.f66759xf1091605 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e6, code lost:
    
        if (r1.f66758x27886e88 <= (c01.id.a() / 1000)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e8, code lost:
    
        r3 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00eb, code lost:
    
        r1.f66777x10a0fed7 = r3;
        com.p314xaae8f345.mm.p2621x8fb0427b.x7.f277864d.z0(r1.f66769xf47740ff, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f4, code lost:
    
        if (r2 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fc, code lost:
    
        if (r9.f537668a.remove(r1) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010b, code lost:
    
        if (r9.f537668a.remove(r1) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x010d, code lost:
    
        r9.f537669b.b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fe, code lost:
    
        r9.f537669b.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ea, code lost:
    
        r3 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.c.b():void");
    }

    public final r45.j4 c(r45.j4 j4Var, java.lang.String str) {
        if (j4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FunctionMsg.FunctionMsgFetcher", "null == raw");
            return null;
        }
        int indexOf = str.indexOf("<addmsg");
        if (indexOf == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FunctionMsg.FunctionMsgFetcher", "msgContent not start with <addmsg! content is null?%s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)));
            return null;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str.substring(indexOf), "addmsg", null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (d17.containsKey(a(".msgid"))) {
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(a(".msgid")), 0);
            j4Var.f459090d = P;
            sb6.append("msgid:" + P);
        }
        if (d17.containsKey(a(".newmsgid"))) {
            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(a(".newmsgid")), 0L);
            j4Var.f459101r = V;
            sb6.append(" newMsgId:" + V);
        }
        if (d17.containsKey(a(".msgseq"))) {
            int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(a(".msgseq")), 0);
            j4Var.f459102s = P2;
            sb6.append(" msgSeq:" + P2);
        }
        if (d17.containsKey(a(".fromusername"))) {
            java.lang.String str2 = (java.lang.String) d17.get(a(".fromusername"));
            j4Var.f459091e = x51.j1.i(str2);
            sb6.append(" fromUsername:" + str2);
        }
        if (d17.containsKey(a(".tousername"))) {
            java.lang.String str3 = (java.lang.String) d17.get(a(".tousername"));
            j4Var.f459092f = x51.j1.i(str3);
            sb6.append(" toUsername:" + str3);
        }
        if (d17.containsKey(a(".msgtype"))) {
            int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(a(".msgtype")), 0);
            j4Var.f459093g = P3;
            sb6.append(" msgType:" + P3);
        }
        if (d17.containsKey(a(".status"))) {
            int P4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(a(".status")), 0);
            j4Var.f459095i = P4;
            sb6.append(" status:" + P4);
        }
        if (d17.containsKey(a(".content"))) {
            j4Var.f459094h = x51.j1.i(u46.k.g(str.substring(str.indexOf("<content>") + 9, str.indexOf("</content>"))));
            sb6.append(" msgContent:*");
        } else {
            sb6.append(" msgContent:null");
            j4Var.f459094h = null;
        }
        if (d17.containsKey(a(".msgsource"))) {
            j4Var.f459099p = u46.k.g(str.substring(str.indexOf("<msgsource>") + 11, str.indexOf("</msgsource>")));
            sb6.append(" msgSource:*");
        }
        if (d17.containsKey(a(".pushcontent"))) {
            j4Var.f459100q = u46.k.g(str.substring(str.indexOf("<pushcontent>") + 13, str.indexOf("</pushcontent>")));
            sb6.append(" pushContent:*");
        }
        if (d17.containsKey(a(".imgstatus"))) {
            int P5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(a(".imgstatus")), 0);
            j4Var.f459096m = P5;
            sb6.append(" ImgStatus:" + P5);
        }
        if (d17.containsKey(a(".imgbuf"))) {
            j4Var.f459097n = x51.j1.h((java.lang.String) d17.get(a(".imgbuf")), true);
            sb6.append(" imgBuf:*");
        }
        if (d17.containsKey(a(".createtime"))) {
            int P6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(a(".createtime")), 0);
            j4Var.f459098o = P6;
            sb6.append(" createTime:" + P6);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgFetcher", "[mergeAddMsg] result:%s", sb6.toString());
        return j4Var;
    }

    public void d(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        n23.a aVar;
        int i19;
        if (m1Var.mo808xfb85f7b0() != 825) {
            return;
        }
        java.util.List list = this.f537668a;
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FunctionMsg.FunctionMsgFetcher", "[onSceneEnd] mFetchItemList is null.");
            return;
        }
        m23.a aVar2 = (m23.a) m1Var;
        r45.gg3 gg3Var = aVar2.f404618f;
        qk.h6 h6Var = (qk.h6) aVar2.f404621i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgFetcher", "[onSceneEnd] size:%s errCode:%s errMsg:%s functionMsgId:%s", java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(i18), str, h6Var.f66769xf47740ff);
        java.util.HashMap hashMap = n45.c.f416618a;
        java.lang.String cgiKey = h6Var.f66762x4b6e43c0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiKey, "cgiKey");
        java.util.HashMap hashMap2 = n45.c.f416620c;
        synchronized (hashMap2) {
            aVar = (n23.a) hashMap2.get(cgiKey);
            if (aVar == null) {
                aVar = n45.c.f416619b;
            }
        }
        aVar.a(i18);
        if (this.f537668a.contains(h6Var)) {
            if (i18 != 0 || ((i18 == 0 && gg3Var == null) || ((gg3Var != null && gg3Var.f456747d == 2) || (gg3Var != null && gg3Var.f456747d == 1)))) {
                java.lang.Object[] objArr = new java.lang.Object[4];
                objArr[0] = h6Var.f66769xf47740ff;
                objArr[1] = java.lang.Long.valueOf(h6Var.f66772x13c6891a);
                objArr[2] = java.lang.Long.valueOf(h6Var.f66779x8987ca93);
                objArr[3] = java.lang.Integer.valueOf(gg3Var == null ? -1 : gg3Var.f456747d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgFetcher", "functionMsgId: %s, fetch failed, mark as fetch failed, preVersion: %s, version: %s op:%s", objArr);
                int i27 = h6Var.f66774x73c8dbac;
                if (i27 < h6Var.f66775x8869eb6f) {
                    java.lang.Object[] objArr2 = new java.lang.Object[4];
                    objArr2[0] = java.lang.Integer.valueOf(i27);
                    objArr2[1] = h6Var.f66769xf47740ff;
                    objArr2[2] = java.lang.Integer.valueOf(h6Var.f66776x2f6714e8);
                    objArr2[3] = java.lang.Boolean.valueOf(gg3Var == null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgFetcher", "[handleFailureFetch] has retryCount:%s id:%s retryInterval:%s response is null?%s", objArr2);
                    if (gg3Var != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgFetcher", "[handleFailureFetch] opCode:%s actionTime:%s", java.lang.Integer.valueOf(gg3Var.f456747d), java.lang.Integer.valueOf(gg3Var.f456751h));
                        int i28 = gg3Var.f456747d;
                        if (i28 == 2) {
                            h6Var.f66758x27886e88 = gg3Var.f456751h;
                            h6Var.f66774x73c8dbac++;
                            h6Var.f66777x10a0fed7 = -1;
                        } else if (i28 == 1) {
                            h6Var.f66777x10a0fed7 = 3;
                            h6Var.f66774x73c8dbac = h6Var.f66775x8869eb6f;
                        } else {
                            h6Var.f66777x10a0fed7 = 3;
                        }
                        java.lang.String str2 = gg3Var.f456750g;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                            h6Var.f66764x5ae6efa9 = str2;
                        }
                    } else {
                        h6Var.f66777x10a0fed7 = -1;
                        h6Var.f66758x27886e88 = (c01.id.a() / 1000) + h6Var.f66776x2f6714e8;
                        h6Var.f66774x73c8dbac++;
                    }
                } else {
                    h6Var.f66777x10a0fed7 = 3;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.x7 x7Var = com.p314xaae8f345.mm.p2621x8fb0427b.x7.f277864d;
                x7Var.z0(h6Var.f66769xf47740ff, h6Var);
                if (h6Var.f66777x10a0fed7 != 3) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(h6Var.f66773x44eeef4, h6Var.f66767x33ceb83c, 1L, false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgFetcher", "[handleFailureFetch] maybe has to retry fetch! delay:%sms retryCount:%s", java.lang.Long.valueOf((h6Var.f66758x27886e88 - (c01.id.a() / 1000)) * 1000), java.lang.Integer.valueOf(h6Var.f66774x73c8dbac));
                } else {
                    r45.j4 c17 = c(h6Var.f66759xf1091605, h6Var.f66765x602814dd);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgFetcher", "[handleFailFetch] addMsgDefault is null? %s", c17);
                    if (c17 != null) {
                        h6Var.f66759xf1091605 = c17;
                    }
                    int i29 = c17 == null ? 3 : 2;
                    h6Var.f66777x10a0fed7 = i29;
                    if (3 == i29) {
                        h6Var.f66779x8987ca93 = h6Var.f66772x13c6891a;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(h6Var.f66773x44eeef4, h6Var.f66768xe6788770, 1L, false);
                    }
                    x7Var.z0(h6Var.f66769xf47740ff, h6Var);
                }
            } else if (gg3Var != null && i18 == 0 && ((i19 = gg3Var.f456747d) == 3 || i19 == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgFetcher", "functionMsgId: %s fetch success, response.version: %s, fetchItem.version: %s ActionTime:%s OpCode:%s", h6Var.f66769xf47740ff, java.lang.Long.valueOf(gg3Var.f456748e), java.lang.Long.valueOf(h6Var.f66779x8987ca93), java.lang.Integer.valueOf(gg3Var.f456751h), java.lang.Integer.valueOf(gg3Var.f456747d));
                h6Var.f66777x10a0fed7 = gg3Var.f456747d == 3 ? -2 : 2;
                h6Var.f66761xe40d67b3 = gg3Var.f456752i;
                h6Var.f66758x27886e88 = gg3Var.f456751h;
                r45.j4 j4Var = gg3Var.f456749f;
                if (j4Var != null) {
                    h6Var.f66759xf1091605 = j4Var;
                }
                if (!gg3Var.f456753m.isEmpty()) {
                    java.util.LinkedList linkedList = gg3Var.f456753m;
                    r45.l4 l4Var = new r45.l4();
                    l4Var.f460654d.addAll(linkedList);
                    h6Var.f66760x3019ab0e = l4Var;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.x7.f277864d.z0(h6Var.f66769xf47740ff, h6Var);
            }
            int i37 = h6Var.f66777x10a0fed7;
            if ((i37 == 2 || i37 == -2) && this.f537668a.remove(h6Var)) {
                this.f537669b.a(h6Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(h6Var.f66773x44eeef4, h6Var.f66778x8d6cefe1, 1L, false);
            } else if (this.f537668a.remove(h6Var)) {
                this.f537669b.b(h6Var);
            }
        }
    }
}
