package cm2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final cm2.a f43328a = new cm2.a();

    public static java.lang.String i(cm2.a aVar, r45.nw1 nw1Var, java.lang.String source, boolean z17, int i17, java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String string;
        r45.i72 i72Var;
        r45.i72 i72Var2;
        if ((i17 & 1) != 0) {
            source = "";
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        aVar.getClass();
        kotlin.jvm.internal.o.g(source, "source");
        if (z17) {
            string = nw1Var != null ? nw1Var.getString(29) : null;
            if (string == null) {
                return "";
            }
        } else {
            if (nw1Var == null || (i72Var2 = (r45.i72) nw1Var.getCustom(44)) == null || (str = i72Var2.getString(10)) == null) {
                str = "";
            }
            if (nw1Var == null || (i72Var = (r45.i72) nw1Var.getCustom(44)) == null || (str2 = i72Var.getString(11)) == null) {
                str2 = "";
            }
            if (str.length() > 0) {
                if (str2.length() > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.DataUtil", source + " encode player url:" + str);
                    return str;
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(source);
            sb6.append(" normal player url:");
            sb6.append(nw1Var != null ? nw1Var.getString(29) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.DataUtil", sb6.toString());
            if (nw1Var == null || (string = nw1Var.getString(29)) == null) {
                return "";
            }
        }
        return string;
    }

    public final boolean a(r45.nw1 nw1Var, java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        long j17 = nw1Var != null ? nw1Var.getLong(0) : 0L;
        r45.td2 td2Var = nw1Var != null ? (r45.td2) nw1Var.getCustom(27) : null;
        ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
        r45.q84 a17 = ne2.l.f336545a.a(j17, td2Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(source);
        sb6.append(" chargeLiveCanPlay feed:");
        sb6.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.getLong(0)) : null);
        sb6.append(" freeTimeInfo:");
        sb6.append(r(a17));
        com.tencent.mars.xlog.Log.i("MicroMsg.DataUtil", sb6.toString());
        return (a17.getInteger(1) > 0 && !a17.getBoolean(5)) || a17.getBoolean(4);
    }

    public final boolean b(r45.ce0 ce0Var) {
        return ce0Var != null && ce0Var.getBoolean(8);
    }

    public final r45.ud0 c(r45.y23 y23Var) {
        java.lang.Object obj;
        com.tencent.mm.protobuf.g byteString;
        kotlin.jvm.internal.o.g(y23Var, "<this>");
        java.util.LinkedList list = y23Var.getList(28);
        kotlin.jvm.internal.o.f(list, "getShow_box_items(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            boolean z17 = false;
            if (((r45.p56) obj).getInteger(0) == 5) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        r45.p56 p56Var = (r45.p56) obj;
        if (p56Var == null || (byteString = p56Var.getByteString(1)) == null) {
            return null;
        }
        r45.ud0 ud0Var = new r45.ud0();
        ud0Var.parseFrom(byteString.g());
        return ud0Var;
    }

    public final r45.y64 d(r45.y23 y23Var) {
        java.lang.Object obj;
        com.tencent.mm.protobuf.g byteString;
        kotlin.jvm.internal.o.g(y23Var, "<this>");
        java.util.LinkedList list = y23Var.getList(28);
        kotlin.jvm.internal.o.f(list, "getShow_box_items(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            boolean z17 = false;
            if (((r45.p56) obj).getInteger(0) == 1) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        r45.p56 p56Var = (r45.p56) obj;
        if (p56Var == null || (byteString = p56Var.getByteString(1)) == null) {
            return null;
        }
        r45.y64 y64Var = new r45.y64();
        y64Var.parseFrom(byteString.g());
        return y64Var;
    }

    public final java.lang.String e(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append("[" + f43328a.x((com.tencent.mm.protocal.protobuf.FinderObject) obj, i17) + ']');
            i17 = i18;
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String f(r45.b53 item) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[offset:");
        sb6.append(item.getInteger(0));
        sb6.append(",msgList:(");
        r45.r71 r71Var = (r45.r71) item.getCustom(1);
        java.util.LinkedList list = r71Var != null ? r71Var.getList(2) : null;
        java.lang.String str2 = "";
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            int i17 = 0;
            for (java.lang.Object obj : list) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.t12 t12Var = (r45.t12) obj;
                sb7.append(i17 + ",type:" + t12Var.getInteger(3) + ",sec:" + t12Var.getInteger(17) + ",nickname:" + t12Var.getString(0) + ",content:" + t12Var.getString(2) + "; \n");
                i17 = i18;
            }
            str = sb7.toString();
            kotlin.jvm.internal.o.f(str, "toString(...)");
        }
        sb6.append(str);
        sb6.append("),appMsgList:(");
        r45.r71 r71Var2 = (r45.r71) item.getCustom(1);
        java.util.LinkedList list2 = r71Var2 != null ? r71Var2.getList(14) : null;
        if (list2 != null && !list2.isEmpty()) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            int i19 = 0;
            for (java.lang.Object obj2 : list2) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.ch1 ch1Var = (r45.ch1) obj2;
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                sb9.append(i19);
                sb9.append(",type:");
                sb9.append(ch1Var.getInteger(1));
                sb9.append(",from user:");
                r45.xn1 xn1Var = (r45.xn1) ch1Var.getCustom(13);
                sb9.append((xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getNickname());
                sb9.append("; ");
                sb8.append(sb9.toString());
                i19 = i27;
            }
            str2 = sb8.toString();
            kotlin.jvm.internal.o.f(str2, "toString(...)");
        }
        sb6.append(str2);
        sb6.append(")]");
        return sb6.toString();
    }

    public final java.lang.String g(java.util.List msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        if (msgList.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        for (java.lang.Object obj : msgList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append("{" + i17 + ',' + f43328a.f((r45.b53) obj) + "}\n");
            i17 = i18;
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String h(r45.t71 msgInfo) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("interval_in_second:");
        sb6.append(msgInfo.getInteger(5));
        sb6.append(",detail:");
        java.util.LinkedList list = msgInfo.getList(1);
        kotlin.jvm.internal.o.f(list, "getItems(...)");
        sb6.append(g(list));
        sb6.append(",continue_flag:");
        sb6.append(msgInfo.getInteger(4));
        sb6.append(",mic_info:");
        r45.wz1 wz1Var = (r45.wz1) msgInfo.getCustom(2);
        if ((wz1Var != null ? wz1Var.getList(6) : null) == null || wz1Var.getList(6).isEmpty()) {
            str = "null";
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.util.LinkedList list2 = wz1Var.getList(6);
            if (list2 != null) {
                int i17 = 0;
                for (java.lang.Object obj : list2) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    sb7.append("[" + i17 + ',' + ((r45.uz1) obj).getString(2) + ']');
                    i17 = i18;
                }
            }
            str = sb7.toString();
            kotlin.jvm.internal.o.f(str, "toString(...)");
        }
        sb6.append(str);
        return sb6.toString();
    }

    public final int j(r45.td2 td2Var, int i17) {
        int e17 = c01.id.e();
        int i18 = 0;
        if (i17 != 1) {
            if (i17 == 2) {
                if (e17 != 0) {
                    int integer = (td2Var != null ? td2Var.getInteger(3) : e17) - e17;
                    if (integer >= 0) {
                        i18 = integer;
                    }
                } else if (td2Var != null) {
                    i18 = td2Var.getInteger(1);
                }
            }
        } else if (td2Var != null) {
            i18 = td2Var.getInteger(1);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveUrlOption", "getTimeLimit type:" + i17 + ",result:" + i18 + ",info:" + p(td2Var) + ",serverTime:" + e17 + '!');
        return i18;
    }

    public final java.lang.String k(r45.hn1 hn1Var) {
        r45.hf5 hf5Var;
        r45.re2 re2Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = null;
        sb6.append(hn1Var != null ? java.lang.Integer.valueOf(hn1Var.getInteger(0)) : null);
        sb6.append(',');
        sb6.append(hn1Var != null ? java.lang.Integer.valueOf(hn1Var.getInteger(1)) : null);
        sb6.append(",whiteList:");
        sb6.append((hn1Var == null || (re2Var = (r45.re2) hn1Var.getCustom(2)) == null) ? null : q(re2Var));
        sb6.append(",previewInfo:");
        if (hn1Var != null && (hf5Var = (r45.hf5) hn1Var.getCustom(3)) != null) {
            str = s(hf5Var);
        }
        sb6.append(str);
        return sb6.toString();
    }

    public final java.lang.String l(r45.o52 o52Var) {
        if (o52Var == null) {
            return "PurchaseInfo:NULL!";
        }
        return "PurchaseInfo:[" + o52Var.getInteger(0) + ',' + o52Var.getBoolean(1) + ',' + o52Var.getInteger(2) + ',' + o52Var.getLong(3) + ',' + o52Var.getInteger(4) + ",prompt_wording:" + o52Var.getString(7) + ']';
    }

    public final java.lang.String m(r45.i72 i72Var) {
        if (i72Var == null) {
            return "FinderLiveReplayInfo:NULL!";
        }
        return "FinderLiveReplayInfo:{" + i72Var.getInteger(0) + ',' + i72Var.getLong(1) + ',' + i72Var.getInteger(2) + ',' + i72Var.getInteger(3) + ',' + n((r45.j72) i72Var.getCustom(5)) + ',' + o((r45.k72) i72Var.getCustom(6)) + '}';
    }

    public final java.lang.String n(r45.j72 j72Var) {
        java.lang.String sb6;
        if (j72Var == null) {
            return "NULL!";
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("{");
        sb7.append(j72Var.getLong(3));
        sb7.append(',');
        sb7.append(j72Var.getInteger(5));
        sb7.append(',');
        sb7.append(j72Var.getString(4));
        sb7.append(',');
        sb7.append(j72Var.getInteger(2));
        sb7.append(',');
        sb7.append(j72Var.getInteger(1));
        sb7.append(',');
        java.util.LinkedList<r45.gv> list = j72Var.getList(0);
        if (list == null) {
            sb6 = "CdnTransInfoList:NULL!";
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("CdnTransInfoList:[");
            for (r45.gv gvVar : list) {
                sb8.append(gvVar == null ? "CdnTransInfo:NULL!" : "[" + gvVar.f375542m + ',' + gvVar.f375541i + ',' + gvVar.f375537e + ',' + gvVar.f375543n + ']');
            }
            sb8.append("]");
            sb6 = sb8.toString();
            kotlin.jvm.internal.o.d(sb6);
        }
        sb7.append(sb6);
        sb7.append('}');
        return sb7.toString();
    }

    public final java.lang.String o(r45.k72 k72Var) {
        if (k72Var != null) {
            java.util.LinkedList list = k72Var.getList(0);
            if (!(list == null || list.isEmpty())) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveReplayTransitionPreloadInfo:");
                java.util.LinkedList<r45.gn1> list2 = k72Var.getList(0);
                kotlin.jvm.internal.o.f(list2, "getPreload_infos(...)");
                for (r45.gn1 gn1Var : list2) {
                    sb6.append("{level:" + gn1Var.getInteger(0) + ",tag:" + gn1Var.getString(8) + ',' + gn1Var.getLong(7) + ',' + gn1Var.getInteger(2) + '/' + gn1Var.getInteger(3) + '(' + gn1Var.getInteger(5) + '/' + gn1Var.getInteger(6) + ")}");
                }
                java.lang.String sb7 = sb6.toString();
                kotlin.jvm.internal.o.d(sb7);
                return sb7;
            }
        }
        return "FinderLiveReplayTransitionPreloadInfo:EMPTY!";
    }

    public final java.lang.String p(r45.td2 td2Var) {
        if (td2Var == null) {
            return "FinderLiveUrlOption:NULL!";
        }
        return "FinderLiveUrlOption:[" + td2Var.getInteger(1) + ',' + td2Var.getInteger(3) + ']';
    }

    public final java.lang.String q(r45.re2 re2Var) {
        java.lang.String sb6;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(re2Var != null ? re2Var.getList(2) : null);
        sb7.append("(room list:");
        sb7.append(re2Var != null ? re2Var.getList(0) : null);
        sb7.append(",user list:");
        sb7.append(re2Var != null ? re2Var.getList(1) : null);
        sb7.append(",audience list:");
        java.util.LinkedList list = re2Var != null ? re2Var.getList(3) : null;
        if (list == null || list.isEmpty()) {
            sb6 = "";
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                sb8.append(((r45.il1) it.next()).getString(1) + ';');
            }
            sb6 = sb8.toString();
            kotlin.jvm.internal.o.d(sb6);
        }
        sb7.append(sb6);
        sb7.append(')');
        return sb7.toString();
    }

    public final java.lang.String r(r45.q84 q84Var) {
        if (q84Var == null) {
            return "LiveFreeTimeInfo:NULL!";
        }
        return "LiveFreeTimeInfo:" + q84Var.getInteger(0) + ',' + q84Var.getInteger(1) + ',' + q84Var.getInteger(2) + ',' + q84Var.getInteger(3) + ',' + q84Var.getBoolean(4) + ',' + q84Var.getBoolean(5) + '!';
    }

    public final java.lang.String s(r45.hf5 hf5Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type:");
        sb6.append(hf5Var != null ? java.lang.Integer.valueOf(hf5Var.getInteger(0)) : null);
        sb6.append(",duration:");
        sb6.append(hf5Var != null ? java.lang.Integer.valueOf(hf5Var.getInteger(2)) : null);
        sb6.append('-');
        sb6.append(hf5Var != null ? java.lang.Integer.valueOf(hf5Var.getInteger(1)) : null);
        return sb6.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
    
        if ((r9.length() > 0) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c0, code lost:
    
        if ((r9.length() > 0) != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(com.tencent.mm.protocal.protobuf.FinderObject r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cm2.a.t(com.tencent.mm.protocal.protobuf.FinderObject):boolean");
    }

    public final boolean u(r45.nw1 nw1Var, java.lang.String source, long j17) {
        kotlin.jvm.internal.o.g(source, "source");
        if (!((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).qk(nw1Var)) {
            return true;
        }
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        r45.td2 td2Var = nw1Var != null ? (r45.td2) nw1Var.getCustom(27) : null;
        ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
        r45.q84 a17 = ne2.l.f336545a.a(j17, td2Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(source);
        sb6.append(" liveCanPlay feed:");
        sb6.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.getLong(0)) : null);
        sb6.append('(');
        sb6.append(j17);
        sb6.append(") freeTimeInfo:");
        sb6.append(r(a17));
        com.tencent.mars.xlog.Log.i("MicroMsg.DataUtil", sb6.toString());
        return (a17.getInteger(1) > 0 && !a17.getBoolean(5)) || a17.getBoolean(4);
    }

    public final void v(km2.m liveData, com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        mm2.c1 c1Var = (mm2.c1) liveData.f309130e.a(mm2.c1.class);
        if (i17 != c1Var.f328801f2) {
            com.tencent.mars.xlog.Log.i(c1Var.f328800f, "liveMode " + i17);
        }
        c1Var.f328801f2 = i17;
        ((mm2.c1) liveData.f309130e.a(mm2.c1.class)).a9(finderObject);
        mm2.c1 c1Var2 = (mm2.c1) liveData.f309130e.a(mm2.c1.class);
        java.lang.String username = finderObject.getUsername();
        if (username == null) {
            username = "";
        }
        c1Var2.f328852o = username;
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        if (liveInfo != null) {
            ((mm2.e1) liveData.f309130e.a(mm2.e1.class)).m7(liveInfo);
            ((mm2.c1) liveData.f309130e.a(mm2.c1.class)).A1 = (r45.ba4) liveInfo.getCustom(53);
            r45.ma4 ma4Var = (r45.ma4) liveInfo.getCustom(23);
            if (ma4Var != null) {
                ((mm2.e1) liveData.f309130e.a(mm2.e1.class)).f328987q = ma4Var;
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("toFinderLiveReplayData", "parseFinderObject liveSdkInfo is null!");
            }
            mm2.c1 c1Var3 = (mm2.c1) liveData.f309130e.a(mm2.c1.class);
            r45.i72 i72Var = (r45.i72) liveInfo.getCustom(44);
            c1Var3.f328873r2 = i72Var != null ? i72Var.getInteger(0) : ((mm2.c1) liveData.f309130e.a(mm2.c1.class)).f328873r2;
        }
        ((mm2.e1) liveData.f309130e.a(mm2.e1.class)).q7(finderObject.getId());
        mm2.e1 e1Var = (mm2.e1) liveData.f309130e.a(mm2.e1.class);
        r45.dm2 object_extend = finderObject.getObject_extend();
        e1Var.f328984n = object_extend != null ? object_extend.getString(62) : null;
        mm2.e1 e1Var2 = (mm2.e1) liveData.f309130e.a(mm2.e1.class);
        java.lang.String objectNonceId = finderObject.getObjectNonceId();
        if (objectNonceId == null) {
            objectNonceId = "";
        }
        e1Var2.f328992v = objectNonceId;
        mm2.e1 e1Var3 = (mm2.e1) liveData.f309130e.a(mm2.e1.class);
        java.lang.String sessionBuffer = finderObject.getSessionBuffer();
        if (sessionBuffer == null) {
            sessionBuffer = "";
        }
        e1Var3.f328993w = sessionBuffer;
        mm2.e1 e1Var4 = (mm2.e1) liveData.f309130e.a(mm2.e1.class);
        java.lang.String nickname = finderObject.getNickname();
        e1Var4.f328994x = nickname != null ? nickname : "";
        ((mm2.e1) liveData.f309130e.a(mm2.e1.class)).r7(java.lang.String.valueOf(finderObject.hashCode()));
    }

    public final boolean w(r45.ce0 ce0Var) {
        return ce0Var != null && ce0Var.getInteger(6) == 1;
    }

    public final java.lang.String x(com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(pm0.v.u(finderObject != null ? finderObject.getId() : 0L));
        sb6.append(',');
        sb6.append((finderObject == null || (objectDesc = finderObject.getObjectDesc()) == null) ? null : objectDesc.getDescription());
        sb6.append(',');
        sb6.append(finderObject != null ? finderObject.getNickname() : null);
        sb6.append(',');
        sb6.append(y(finderObject != null ? finderObject.getLiveInfo() : null));
        sb6.append(",pos:");
        sb6.append(i17);
        return sb6.toString();
    }

    public final java.lang.String y(r45.nw1 nw1Var) {
        if (nw1Var == null) {
            return "LiveInfo:NULL!";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveId:");
        sb6.append(pm0.v.u(nw1Var.getLong(0)));
        sb6.append(" live_status:");
        sb6.append(nw1Var.getInteger(2));
        sb6.append(" replay_status:");
        sb6.append(nw1Var.getInteger(31));
        sb6.append(" replay_url is empty:");
        java.lang.String string = nw1Var.getString(29);
        sb6.append(string == null || string.length() == 0);
        sb6.append(',');
        sb6.append(m((r45.i72) nw1Var.getCustom(44)));
        sb6.append(", status_desc:");
        sb6.append(nw1Var.getString(49));
        sb6.append(',');
        sb6.append(l((r45.o52) nw1Var.getCustom(28)));
        sb6.append(',');
        sb6.append(p((r45.td2) nw1Var.getCustom(27)));
        sb6.append(",newOnlineInfo:");
        r45.o94 o94Var = (r45.o94) nw1Var.getCustom(73);
        sb6.append(o94Var != null ? o94Var.toJSON() : null);
        sb6.append(';');
        return sb6.toString();
    }

    public final so2.j5 z(r45.l92 l92Var) {
        kotlin.jvm.internal.o.g(l92Var, "<this>");
        com.tencent.mm.protobuf.g byteString = l92Var.getByteString(1);
        if (byteString == null) {
            return null;
        }
        int integer = l92Var.getInteger(0);
        if (integer == 0) {
            r45.y23 y23Var = new r45.y23();
            try {
                y23Var.parseFrom(byteString.g());
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                y23Var = null;
            }
            if (y23Var != null) {
                return new cm2.m0(y23Var);
            }
            return null;
        }
        if (integer == 2) {
            r45.ov2 ov2Var = new r45.ov2();
            try {
                ov2Var.parseFrom(byteString.g());
            } catch (java.lang.Exception e18) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                ov2Var = null;
            }
            if (ov2Var != null) {
                return new cm2.k0(ov2Var);
            }
            return null;
        }
        if (integer != 3) {
            return null;
        }
        r45.hw0 hw0Var = new r45.hw0();
        try {
            hw0Var.parseFrom(byteString.g());
        } catch (java.lang.Exception e19) {
            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e19);
            hw0Var = null;
        }
        if (hw0Var != null) {
            return new cm2.i0(hw0Var);
        }
        return null;
    }
}
