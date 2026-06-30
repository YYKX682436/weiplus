package cm2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final cm2.a f124861a = new cm2.a();

    public static java.lang.String i(cm2.a aVar, r45.nw1 nw1Var, java.lang.String source, boolean z17, int i17, java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        r45.i72 i72Var;
        r45.i72 i72Var2;
        if ((i17 & 1) != 0) {
            source = "";
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (z17) {
            m75945x2fec8307 = nw1Var != null ? nw1Var.m75945x2fec8307(29) : null;
            if (m75945x2fec8307 == null) {
                return "";
            }
        } else {
            if (nw1Var == null || (i72Var2 = (r45.i72) nw1Var.m75936x14adae67(44)) == null || (str = i72Var2.m75945x2fec8307(10)) == null) {
                str = "";
            }
            if (nw1Var == null || (i72Var = (r45.i72) nw1Var.m75936x14adae67(44)) == null || (str2 = i72Var.m75945x2fec8307(11)) == null) {
                str2 = "";
            }
            if (str.length() > 0) {
                if (str2.length() > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DataUtil", source + " encode player url:" + str);
                    return str;
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(source);
            sb6.append(" normal player url:");
            sb6.append(nw1Var != null ? nw1Var.m75945x2fec8307(29) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DataUtil", sb6.toString());
            if (nw1Var == null || (m75945x2fec8307 = nw1Var.m75945x2fec8307(29)) == null) {
                return "";
            }
        }
        return m75945x2fec8307;
    }

    public final boolean a(r45.nw1 nw1Var, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        long m75942xfb822ef2 = nw1Var != null ? nw1Var.m75942xfb822ef2(0) : 0L;
        r45.td2 td2Var = nw1Var != null ? (r45.td2) nw1Var.m75936x14adae67(27) : null;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).getClass();
        r45.q84 a17 = ne2.l.f418078a.a(m75942xfb822ef2, td2Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(source);
        sb6.append(" chargeLiveCanPlay feed:");
        sb6.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)) : null);
        sb6.append(" freeTimeInfo:");
        sb6.append(r(a17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DataUtil", sb6.toString());
        return (a17.m75939xb282bd08(1) > 0 && !a17.m75933x41a8a7f2(5)) || a17.m75933x41a8a7f2(4);
    }

    public final boolean b(r45.ce0 ce0Var) {
        return ce0Var != null && ce0Var.m75933x41a8a7f2(8);
    }

    public final r45.ud0 c(r45.y23 y23Var) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y23Var, "<this>");
        java.util.LinkedList m75941xfb821914 = y23Var.m75941xfb821914(28);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getShow_box_items(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            boolean z17 = false;
            if (((r45.p56) obj).m75939xb282bd08(0) == 5) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        r45.p56 p56Var = (r45.p56) obj;
        if (p56Var == null || (m75934xbce7f2f = p56Var.m75934xbce7f2f(1)) == null) {
            return null;
        }
        r45.ud0 ud0Var = new r45.ud0();
        ud0Var.mo11468x92b714fd(m75934xbce7f2f.g());
        return ud0Var;
    }

    public final r45.y64 d(r45.y23 y23Var) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y23Var, "<this>");
        java.util.LinkedList m75941xfb821914 = y23Var.m75941xfb821914(28);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getShow_box_items(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            boolean z17 = false;
            if (((r45.p56) obj).m75939xb282bd08(0) == 1) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        r45.p56 p56Var = (r45.p56) obj;
        if (p56Var == null || (m75934xbce7f2f = p56Var.m75934xbce7f2f(1)) == null) {
            return null;
        }
        r45.y64 y64Var = new r45.y64();
        y64Var.mo11468x92b714fd(m75934xbce7f2f.g());
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
            sb6.append("[" + f124861a.x((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj, i17) + ']');
            i17 = i18;
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String f(r45.b53 item) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[offset:");
        sb6.append(item.m75939xb282bd08(0));
        sb6.append(",msgList:(");
        r45.r71 r71Var = (r45.r71) item.m75936x14adae67(1);
        java.util.LinkedList m75941xfb821914 = r71Var != null ? r71Var.m75941xfb821914(2) : null;
        java.lang.String str2 = "";
        if (m75941xfb821914 == null || m75941xfb821914.isEmpty()) {
            str = "";
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            int i17 = 0;
            for (java.lang.Object obj : m75941xfb821914) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.t12 t12Var = (r45.t12) obj;
                sb7.append(i17 + ",type:" + t12Var.m75939xb282bd08(3) + ",sec:" + t12Var.m75939xb282bd08(17) + ",nickname:" + t12Var.m75945x2fec8307(0) + ",content:" + t12Var.m75945x2fec8307(2) + "; \n");
                i17 = i18;
            }
            str = sb7.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        }
        sb6.append(str);
        sb6.append("),appMsgList:(");
        r45.r71 r71Var2 = (r45.r71) item.m75936x14adae67(1);
        java.util.LinkedList m75941xfb8219142 = r71Var2 != null ? r71Var2.m75941xfb821914(14) : null;
        if (m75941xfb8219142 != null && !m75941xfb8219142.isEmpty()) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            int i19 = 0;
            for (java.lang.Object obj2 : m75941xfb8219142) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.ch1 ch1Var = (r45.ch1) obj2;
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                sb9.append(i19);
                sb9.append(",type:");
                sb9.append(ch1Var.m75939xb282bd08(1));
                sb9.append(",from user:");
                r45.xn1 xn1Var = (r45.xn1) ch1Var.m75936x14adae67(13);
                sb9.append((xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76184x8010e5e4());
                sb9.append("; ");
                sb8.append(sb9.toString());
                i19 = i27;
            }
            str2 = sb8.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "toString(...)");
        }
        sb6.append(str2);
        sb6.append(")]");
        return sb6.toString();
    }

    public final java.lang.String g(java.util.List msgList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
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
            sb6.append("{" + i17 + ',' + f124861a.f((r45.b53) obj) + "}\n");
            i17 = i18;
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String h(r45.t71 msgInfo) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("interval_in_second:");
        sb6.append(msgInfo.m75939xb282bd08(5));
        sb6.append(",detail:");
        java.util.LinkedList m75941xfb821914 = msgInfo.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getItems(...)");
        sb6.append(g(m75941xfb821914));
        sb6.append(",continue_flag:");
        sb6.append(msgInfo.m75939xb282bd08(4));
        sb6.append(",mic_info:");
        r45.wz1 wz1Var = (r45.wz1) msgInfo.m75936x14adae67(2);
        if ((wz1Var != null ? wz1Var.m75941xfb821914(6) : null) == null || wz1Var.m75941xfb821914(6).isEmpty()) {
            str = "null";
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.util.LinkedList m75941xfb8219142 = wz1Var.m75941xfb821914(6);
            if (m75941xfb8219142 != null) {
                int i17 = 0;
                for (java.lang.Object obj : m75941xfb8219142) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    sb7.append("[" + i17 + ',' + ((r45.uz1) obj).m75945x2fec8307(2) + ']');
                    i17 = i18;
                }
            }
            str = sb7.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
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
                    int m75939xb282bd08 = (td2Var != null ? td2Var.m75939xb282bd08(3) : e17) - e17;
                    if (m75939xb282bd08 >= 0) {
                        i18 = m75939xb282bd08;
                    }
                } else if (td2Var != null) {
                    i18 = td2Var.m75939xb282bd08(1);
                }
            }
        } else if (td2Var != null) {
            i18 = td2Var.m75939xb282bd08(1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUrlOption", "getTimeLimit type:" + i17 + ",result:" + i18 + ",info:" + p(td2Var) + ",serverTime:" + e17 + '!');
        return i18;
    }

    public final java.lang.String k(r45.hn1 hn1Var) {
        r45.hf5 hf5Var;
        r45.re2 re2Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = null;
        sb6.append(hn1Var != null ? java.lang.Integer.valueOf(hn1Var.m75939xb282bd08(0)) : null);
        sb6.append(',');
        sb6.append(hn1Var != null ? java.lang.Integer.valueOf(hn1Var.m75939xb282bd08(1)) : null);
        sb6.append(",whiteList:");
        sb6.append((hn1Var == null || (re2Var = (r45.re2) hn1Var.m75936x14adae67(2)) == null) ? null : q(re2Var));
        sb6.append(",previewInfo:");
        if (hn1Var != null && (hf5Var = (r45.hf5) hn1Var.m75936x14adae67(3)) != null) {
            str = s(hf5Var);
        }
        sb6.append(str);
        return sb6.toString();
    }

    public final java.lang.String l(r45.o52 o52Var) {
        if (o52Var == null) {
            return "PurchaseInfo:NULL!";
        }
        return "PurchaseInfo:[" + o52Var.m75939xb282bd08(0) + ',' + o52Var.m75933x41a8a7f2(1) + ',' + o52Var.m75939xb282bd08(2) + ',' + o52Var.m75942xfb822ef2(3) + ',' + o52Var.m75939xb282bd08(4) + ",prompt_wording:" + o52Var.m75945x2fec8307(7) + ']';
    }

    public final java.lang.String m(r45.i72 i72Var) {
        if (i72Var == null) {
            return "FinderLiveReplayInfo:NULL!";
        }
        return "FinderLiveReplayInfo:{" + i72Var.m75939xb282bd08(0) + ',' + i72Var.m75942xfb822ef2(1) + ',' + i72Var.m75939xb282bd08(2) + ',' + i72Var.m75939xb282bd08(3) + ',' + n((r45.j72) i72Var.m75936x14adae67(5)) + ',' + o((r45.k72) i72Var.m75936x14adae67(6)) + '}';
    }

    public final java.lang.String n(r45.j72 j72Var) {
        java.lang.String sb6;
        if (j72Var == null) {
            return "NULL!";
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("{");
        sb7.append(j72Var.m75942xfb822ef2(3));
        sb7.append(',');
        sb7.append(j72Var.m75939xb282bd08(5));
        sb7.append(',');
        sb7.append(j72Var.m75945x2fec8307(4));
        sb7.append(',');
        sb7.append(j72Var.m75939xb282bd08(2));
        sb7.append(',');
        sb7.append(j72Var.m75939xb282bd08(1));
        sb7.append(',');
        java.util.LinkedList<r45.gv> m75941xfb821914 = j72Var.m75941xfb821914(0);
        if (m75941xfb821914 == null) {
            sb6 = "CdnTransInfoList:NULL!";
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("CdnTransInfoList:[");
            for (r45.gv gvVar : m75941xfb821914) {
                sb8.append(gvVar == null ? "CdnTransInfo:NULL!" : "[" + gvVar.f457075m + ',' + gvVar.f457074i + ',' + gvVar.f457070e + ',' + gvVar.f457076n + ']');
            }
            sb8.append("]");
            sb6 = sb8.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sb6);
        }
        sb7.append(sb6);
        sb7.append('}');
        return sb7.toString();
    }

    public final java.lang.String o(r45.k72 k72Var) {
        if (k72Var != null) {
            java.util.LinkedList m75941xfb821914 = k72Var.m75941xfb821914(0);
            if (!(m75941xfb821914 == null || m75941xfb821914.isEmpty())) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveReplayTransitionPreloadInfo:");
                java.util.LinkedList<r45.gn1> m75941xfb8219142 = k72Var.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getPreload_infos(...)");
                for (r45.gn1 gn1Var : m75941xfb8219142) {
                    sb6.append("{level:" + gn1Var.m75939xb282bd08(0) + ",tag:" + gn1Var.m75945x2fec8307(8) + ',' + gn1Var.m75942xfb822ef2(7) + ',' + gn1Var.m75939xb282bd08(2) + '/' + gn1Var.m75939xb282bd08(3) + '(' + gn1Var.m75939xb282bd08(5) + '/' + gn1Var.m75939xb282bd08(6) + ")}");
                }
                java.lang.String sb7 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sb7);
                return sb7;
            }
        }
        return "FinderLiveReplayTransitionPreloadInfo:EMPTY!";
    }

    public final java.lang.String p(r45.td2 td2Var) {
        if (td2Var == null) {
            return "FinderLiveUrlOption:NULL!";
        }
        return "FinderLiveUrlOption:[" + td2Var.m75939xb282bd08(1) + ',' + td2Var.m75939xb282bd08(3) + ']';
    }

    public final java.lang.String q(r45.re2 re2Var) {
        java.lang.String sb6;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(re2Var != null ? re2Var.m75941xfb821914(2) : null);
        sb7.append("(room list:");
        sb7.append(re2Var != null ? re2Var.m75941xfb821914(0) : null);
        sb7.append(",user list:");
        sb7.append(re2Var != null ? re2Var.m75941xfb821914(1) : null);
        sb7.append(",audience list:");
        java.util.LinkedList m75941xfb821914 = re2Var != null ? re2Var.m75941xfb821914(3) : null;
        if (m75941xfb821914 == null || m75941xfb821914.isEmpty()) {
            sb6 = "";
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            java.util.Iterator it = m75941xfb821914.iterator();
            while (it.hasNext()) {
                sb8.append(((r45.il1) it.next()).m75945x2fec8307(1) + ';');
            }
            sb6 = sb8.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sb6);
        }
        sb7.append(sb6);
        sb7.append(')');
        return sb7.toString();
    }

    public final java.lang.String r(r45.q84 q84Var) {
        if (q84Var == null) {
            return "LiveFreeTimeInfo:NULL!";
        }
        return "LiveFreeTimeInfo:" + q84Var.m75939xb282bd08(0) + ',' + q84Var.m75939xb282bd08(1) + ',' + q84Var.m75939xb282bd08(2) + ',' + q84Var.m75939xb282bd08(3) + ',' + q84Var.m75933x41a8a7f2(4) + ',' + q84Var.m75933x41a8a7f2(5) + '!';
    }

    public final java.lang.String s(r45.hf5 hf5Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type:");
        sb6.append(hf5Var != null ? java.lang.Integer.valueOf(hf5Var.m75939xb282bd08(0)) : null);
        sb6.append(",duration:");
        sb6.append(hf5Var != null ? java.lang.Integer.valueOf(hf5Var.m75939xb282bd08(2)) : null);
        sb6.append('-');
        sb6.append(hf5Var != null ? java.lang.Integer.valueOf(hf5Var.m75939xb282bd08(1)) : null);
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
    public final boolean t(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cm2.a.t(com.tencent.mm.protocal.protobuf.FinderObject):boolean");
    }

    public final boolean u(r45.nw1 nw1Var, java.lang.String source, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (!((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).qk(nw1Var)) {
            return true;
        }
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        r45.td2 td2Var = nw1Var != null ? (r45.td2) nw1Var.m75936x14adae67(27) : null;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).getClass();
        r45.q84 a17 = ne2.l.f418078a.a(j17, td2Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(source);
        sb6.append(" liveCanPlay feed:");
        sb6.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)) : null);
        sb6.append('(');
        sb6.append(j17);
        sb6.append(") freeTimeInfo:");
        sb6.append(r(a17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DataUtil", sb6.toString());
        return (a17.m75939xb282bd08(1) > 0 && !a17.m75933x41a8a7f2(5)) || a17.m75933x41a8a7f2(4);
    }

    public final void v(km2.m liveData, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject, int i17) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        mm2.c1 c1Var = (mm2.c1) liveData.f390663e.a(mm2.c1.class);
        if (i17 != c1Var.f410334f2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c1Var.f410333f, "liveMode " + i17);
        }
        c1Var.f410334f2 = i17;
        ((mm2.c1) liveData.f390663e.a(mm2.c1.class)).a9(finderObject);
        mm2.c1 c1Var2 = (mm2.c1) liveData.f390663e.a(mm2.c1.class);
        java.lang.String m76836x6c03c64c = finderObject.m76836x6c03c64c();
        if (m76836x6c03c64c == null) {
            m76836x6c03c64c = "";
        }
        c1Var2.f410385o = m76836x6c03c64c;
        r45.nw1 m76794xd0557130 = finderObject.m76794xd0557130();
        if (m76794xd0557130 != null) {
            ((mm2.e1) liveData.f390663e.a(mm2.e1.class)).m7(m76794xd0557130);
            ((mm2.c1) liveData.f390663e.a(mm2.c1.class)).A1 = (r45.ba4) m76794xd0557130.m75936x14adae67(53);
            r45.ma4 ma4Var = (r45.ma4) m76794xd0557130.m75936x14adae67(23);
            if (ma4Var != null) {
                ((mm2.e1) liveData.f390663e.a(mm2.e1.class)).f410520q = ma4Var;
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("toFinderLiveReplayData", "parseFinderObject liveSdkInfo is null!");
            }
            mm2.c1 c1Var3 = (mm2.c1) liveData.f390663e.a(mm2.c1.class);
            r45.i72 i72Var = (r45.i72) m76794xd0557130.m75936x14adae67(44);
            c1Var3.f410406r2 = i72Var != null ? i72Var.m75939xb282bd08(0) : ((mm2.c1) liveData.f390663e.a(mm2.c1.class)).f410406r2;
        }
        ((mm2.e1) liveData.f390663e.a(mm2.e1.class)).q7(finderObject.m76784x5db1b11());
        mm2.e1 e1Var = (mm2.e1) liveData.f390663e.a(mm2.e1.class);
        r45.dm2 m76806xdef68064 = finderObject.m76806xdef68064();
        e1Var.f410517n = m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(62) : null;
        mm2.e1 e1Var2 = (mm2.e1) liveData.f390663e.a(mm2.e1.class);
        java.lang.String m76803x6c285d75 = finderObject.m76803x6c285d75();
        if (m76803x6c285d75 == null) {
            m76803x6c285d75 = "";
        }
        e1Var2.f410525v = m76803x6c285d75;
        mm2.e1 e1Var3 = (mm2.e1) liveData.f390663e.a(mm2.e1.class);
        java.lang.String m76829x97edf6c0 = finderObject.m76829x97edf6c0();
        if (m76829x97edf6c0 == null) {
            m76829x97edf6c0 = "";
        }
        e1Var3.f410526w = m76829x97edf6c0;
        mm2.e1 e1Var4 = (mm2.e1) liveData.f390663e.a(mm2.e1.class);
        java.lang.String m76801x8010e5e4 = finderObject.m76801x8010e5e4();
        e1Var4.f410527x = m76801x8010e5e4 != null ? m76801x8010e5e4 : "";
        ((mm2.e1) liveData.f390663e.a(mm2.e1.class)).r7(java.lang.String.valueOf(finderObject.hashCode()));
    }

    public final boolean w(r45.ce0 ce0Var) {
        return ce0Var != null && ce0Var.m75939xb282bd08(6) == 1;
    }

    public final java.lang.String x(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, int i17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(pm0.v.u(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L));
        sb6.append(',');
        sb6.append((c19792x256d2725 == null || (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) == null) ? null : m76802x2dd01666.m76944x730bcac6());
        sb6.append(',');
        sb6.append(c19792x256d2725 != null ? c19792x256d2725.m76801x8010e5e4() : null);
        sb6.append(',');
        sb6.append(y(c19792x256d2725 != null ? c19792x256d2725.m76794xd0557130() : null));
        sb6.append(",pos:");
        sb6.append(i17);
        return sb6.toString();
    }

    public final java.lang.String y(r45.nw1 nw1Var) {
        if (nw1Var == null) {
            return "LiveInfo:NULL!";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveId:");
        sb6.append(pm0.v.u(nw1Var.m75942xfb822ef2(0)));
        sb6.append(" live_status:");
        sb6.append(nw1Var.m75939xb282bd08(2));
        sb6.append(" replay_status:");
        sb6.append(nw1Var.m75939xb282bd08(31));
        sb6.append(" replay_url is empty:");
        java.lang.String m75945x2fec8307 = nw1Var.m75945x2fec8307(29);
        sb6.append(m75945x2fec8307 == null || m75945x2fec8307.length() == 0);
        sb6.append(',');
        sb6.append(m((r45.i72) nw1Var.m75936x14adae67(44)));
        sb6.append(", status_desc:");
        sb6.append(nw1Var.m75945x2fec8307(49));
        sb6.append(',');
        sb6.append(l((r45.o52) nw1Var.m75936x14adae67(28)));
        sb6.append(',');
        sb6.append(p((r45.td2) nw1Var.m75936x14adae67(27)));
        sb6.append(",newOnlineInfo:");
        r45.o94 o94Var = (r45.o94) nw1Var.m75936x14adae67(73);
        sb6.append(o94Var != null ? o94Var.mo12245xcc313de3() : null);
        sb6.append(';');
        return sb6.toString();
    }

    public final so2.j5 z(r45.l92 l92Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l92Var, "<this>");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = l92Var.m75934xbce7f2f(1);
        if (m75934xbce7f2f == null) {
            return null;
        }
        int m75939xb282bd08 = l92Var.m75939xb282bd08(0);
        if (m75939xb282bd08 == 0) {
            r45.y23 y23Var = new r45.y23();
            try {
                y23Var.mo11468x92b714fd(m75934xbce7f2f.g());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                y23Var = null;
            }
            if (y23Var != null) {
                return new cm2.m0(y23Var);
            }
            return null;
        }
        if (m75939xb282bd08 == 2) {
            r45.ov2 ov2Var = new r45.ov2();
            try {
                ov2Var.mo11468x92b714fd(m75934xbce7f2f.g());
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
                ov2Var = null;
            }
            if (ov2Var != null) {
                return new cm2.k0(ov2Var);
            }
            return null;
        }
        if (m75939xb282bd08 != 3) {
            return null;
        }
        r45.hw0 hw0Var = new r45.hw0();
        try {
            hw0Var.mo11468x92b714fd(m75934xbce7f2f.g());
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e19);
            hw0Var = null;
        }
        if (hw0Var != null) {
            return new cm2.i0(hw0Var);
        }
        return null;
    }
}
