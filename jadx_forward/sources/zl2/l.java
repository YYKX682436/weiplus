package zl2;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a */
    public static final zl2.l f555398a = new zl2.l();

    public static /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c(zl2.l lVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 1;
        }
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        return lVar.b(c19792x256d2725, i17, z17);
    }

    public final dk2.x4 a(r45.wk0 wk0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wk0Var, "<this>");
        dk2.x4 x4Var = new dk2.x4();
        r45.y74 y74Var = (r45.y74) wk0Var.m75936x14adae67(6);
        x4Var.f315852m = wk0Var.m75939xb282bd08(4);
        x4Var.f315853n = wk0Var.m75939xb282bd08(5);
        x4Var.f315849j = wk0Var.m75939xb282bd08(3);
        x4Var.f315856q = wk0Var.m75945x2fec8307(0);
        if (y74Var != null) {
            x4Var.f315850k = y74Var.m75939xb282bd08(1);
            x4Var.f315855p = (r45.kd1) y74Var.m75936x14adae67(4);
            x4Var.f315857r = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) y74Var.m75936x14adae67(5);
            x4Var.f315858s = (r45.gy0) y74Var.m75936x14adae67(6);
            x4Var.f315859t = y74Var.m75939xb282bd08(0);
            x4Var.f315862w = (r45.q92) y74Var.m75936x14adae67(7);
            java.lang.String m75945x2fec8307 = y74Var.m75945x2fec8307(2);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            x4Var.f315864y = m75945x2fec8307;
            java.lang.String m75945x2fec83072 = y74Var.m75945x2fec8307(3);
            x4Var.f315865z = m75945x2fec83072 != null ? m75945x2fec83072 : "";
        }
        x4Var.B = (r45.ta4) wk0Var.m75936x14adae67(7);
        return x4Var;
    }

    public final com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e b(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 obj, int i17, boolean z17) {
        java.lang.String str;
        int i18;
        java.lang.String str2;
        r45.cl2 cl2Var;
        r45.cl2 cl2Var2;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        r45.nw1 m76794xd0557130;
        r45.ma4 ma4Var;
        r45.q82 q82Var;
        r45.nw1 m76794xd05571302;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        r45.nw1 m76794xd05571303 = obj.m76794xd0557130();
        boolean z18 = m76794xd05571303 != null && m76794xd05571303.m75939xb282bd08(2) == 1;
        if (!z18 || (m76794xd05571302 = obj.m76794xd0557130()) == null || (str = m76794xd05571302.m75945x2fec8307(3)) == null) {
            str = "";
        }
        if (z18) {
            r45.nw1 m76794xd05571304 = obj.m76794xd0557130();
            i18 = (m76794xd05571304 == null || (q82Var = (r45.q82) m76794xd05571304.m75936x14adae67(9)) == null) ? 1 : q82Var.m75939xb282bd08(0);
        } else {
            i18 = 0;
        }
        byte[] mo14344x5f01b1f6 = (!z18 || (m76794xd0557130 = obj.m76794xd0557130()) == null || (ma4Var = (r45.ma4) m76794xd0557130.m75936x14adae67(23)) == null) ? null : ma4Var.mo14344x5f01b1f6();
        if (!z18) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("convertToLiveConfig liveId:");
            r45.nw1 m76794xd05571305 = obj.m76794xd0557130();
            sb6.append(m76794xd05571305 != null ? java.lang.Long.valueOf(m76794xd05571305.m75942xfb822ef2(0)) : null);
            sb6.append(",liveStatus:");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = obj.m76760x76845fea();
            sb6.append(m76760x76845fea != null ? java.lang.Integer.valueOf(m76760x76845fea.m76177x2220c3f4()) : null);
            sb6.append(" nickname:");
            sb6.append(obj.m76801x8010e5e4());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveDataTransferUtil", sb6.toString());
        }
        en0.g gVar = new en0.g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w0 w0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w0.f184175a;
        gVar.f336779a = i17;
        r45.nw1 m76794xd05571306 = obj.m76794xd0557130();
        gVar.f336781c = m76794xd05571306 != null ? m76794xd05571306.m75942xfb822ef2(0) : 0L;
        gVar.f336795q = obj.m76803x6c285d75();
        gVar.f336789k = obj.m76784x5db1b11();
        gVar.f336784f = obj.m76836x6c03c64c();
        zl2.q4 q4Var = zl2.q4.f555466a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = obj.m76802x2dd01666();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = (m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null) ? null : (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e);
        if (c19788xd7cfd73e != null) {
            java.lang.String m76623xd93f812f = c19788xd7cfd73e.m76623xd93f812f();
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (m76623xd93f812f == null) {
                m76623xd93f812f = "";
            }
            java.lang.String m76624x4c9b7dca = c19788xd7cfd73e.m76624x4c9b7dca();
            if (m76624x4c9b7dca == null) {
                m76624x4c9b7dca = "";
            }
            str2 = m76623xd93f812f.concat(m76624x4c9b7dca);
        } else {
            str2 = "";
        }
        gVar.f336783e = str2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = obj.m76802x2dd01666();
        gVar.f336790l = m76802x2dd016662 != null ? m76802x2dd016662.m76944x730bcac6() : null;
        gVar.f336801w = obj.m76829x97edf6c0();
        gVar.f336787i = str;
        gVar.f336788j = i18;
        gVar.f336803y = java.lang.Boolean.valueOf(z17).booleanValue();
        gVar.A = obj.m76801x8010e5e4();
        r45.nw1 m76794xd05571307 = obj.m76794xd0557130();
        gVar.B = m76794xd05571307 != null ? m76794xd05571307.m75942xfb822ef2(32) : 0L;
        gVar.C = mo14344x5f01b1f6;
        r45.nw1 m76794xd05571308 = obj.m76794xd0557130();
        gVar.E = m76794xd05571308 != null ? m76794xd05571308.m75939xb282bd08(42) : 0;
        r45.nw1 m76794xd05571309 = obj.m76794xd0557130();
        gVar.f336778J = m76794xd05571309 != null ? cm2.a.i(cm2.a.f124861a, m76794xd05571309, "convertToLiveConfig", false, 2, null) : "";
        r45.nw1 m76794xd055713010 = obj.m76794xd0557130();
        w0Var.a(gVar, "convertToLiveConfig", m76794xd055713010 != null ? (r45.rp1) m76794xd055713010.m75936x14adae67(45) : null);
        gVar.K = obj.m76752x103fd925();
        r45.dm2 m76806xdef68064 = obj.m76806xdef68064();
        gVar.L = java.lang.Boolean.valueOf((m76806xdef68064 == null || (cl2Var2 = (r45.cl2) m76806xdef68064.m75936x14adae67(4)) == null) ? false : cl2Var2.m75933x41a8a7f2(14)).booleanValue();
        r45.dm2 m76806xdef680642 = obj.m76806xdef68064();
        gVar.M = (m76806xdef680642 == null || (cl2Var = (r45.cl2) m76806xdef680642.m75936x14adae67(4)) == null) ? 0 : cl2Var.m75939xb282bd08(13);
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e a17 = gVar.a();
        r45.v74 v74Var = new r45.v74();
        v74Var.set(0, obj);
        v74Var.set(1, obj.m76794xd0557130());
        a17.f150079p0 = v74Var;
        kz2.b.f395391a.d("Finder.FinderLiveDataTransferUtil", "convertToLiveConfig " + a17);
        return a17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    public final jz5.l d(java.util.ArrayList data, so2.j5 clickFeed, boolean z17) {
        r45.nw1 m59258xd0557130;
        r45.nw1 m59258xd05571302;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickFeed, "clickFeed");
        ?? arrayList = new java.util.ArrayList();
        java.util.Iterator it = data.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            so2.j5 j5Var = (so2.j5) it.next();
            if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                if (zl2.q4.f555466a.C(abstractC14490x69736cb5)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = abstractC14490x69736cb5.getFeedObject();
                    if ((feedObject == null || (m59258xd05571302 = feedObject.m59258xd0557130()) == null || m59258xd05571302.m75939xb282bd08(2) != 2) ? false : true) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("convertToVisitorLiveData feed:");
                        sb6.append(j5Var.mo2128x1ed62e84());
                        sb6.append(",is click feed:");
                        sb6.append(j5Var.mo2128x1ed62e84() == clickFeed.mo2128x1ed62e84());
                        sb6.append(",nickname:");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                        ya2.b2 contact = abstractC14490x69736cb52.getContact();
                        java.lang.Integer num = null;
                        sb6.append(contact != null ? contact.w0() : null);
                        sb6.append(",live status:");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2 = abstractC14490x69736cb52.getFeedObject();
                        if (feedObject2 != null && (m59258xd0557130 = feedObject2.m59258xd0557130()) != null) {
                            num = java.lang.Integer.valueOf(m59258xd0557130.m75939xb282bd08(2));
                        }
                        sb6.append(num);
                        sb6.append('!');
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveDataTransferUtil", sb6.toString());
                        if (j5Var.mo2128x1ed62e84() == clickFeed.mo2128x1ed62e84()) {
                            arrayList.add(j5Var);
                        }
                    } else {
                        arrayList.add(j5Var);
                    }
                }
            }
        }
        int indexOf = arrayList.indexOf(clickFeed);
        int i17 = indexOf >= 0 ? indexOf : 0;
        if (z17 && indexOf >= 0) {
            arrayList = arrayList.subList(0, indexOf + 1);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) it6.next()).getFeedObject().getFeedObject());
        }
        return new jz5.l(arrayList2, java.lang.Integer.valueOf(i17));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(dk2.x4 r16, int r17, long r18, android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.l.e(dk2.x4, int, long, android.content.Intent):void");
    }

    public final void f(r45.wk0 wk0Var) {
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wk0Var, "<this>");
        r45.ta4 ta4Var = (r45.ta4) wk0Var.m75936x14adae67(7);
        if (ta4Var == null || (m75941xfb821914 = ta4Var.m75941xfb821914(20)) == null) {
            return;
        }
        r45.qa4 qa4Var = new r45.qa4();
        qa4Var.set(0, "EnterLive");
        qa4Var.set(1, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        m75941xfb821914.add(qa4Var);
    }

    public final void g(r45.wk0 wk0Var, java.lang.String tag) {
        r45.gy0 gy0Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wk0Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveDataTransferUtil", "EnterLiveParams.logInfo " + tag + ", contextId:" + wk0Var.m75945x2fec8307(0) + ", clickTabContextId:" + wk0Var.m75945x2fec8307(1) + ", needAnim:" + wk0Var.m75933x41a8a7f2(2) + ", tabType:" + wk0Var.m75939xb282bd08(3) + ", secondaryDeviceFlag:" + wk0Var.m75939xb282bd08(4) + ", pullMoreType:" + wk0Var.m75939xb282bd08(5));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("EnterLiveParams.logInfo ");
        sb6.append(tag);
        sb6.append(", bundleParams enterScene:");
        r45.y74 y74Var = (r45.y74) wk0Var.m75936x14adae67(6);
        sb6.append(y74Var != null ? java.lang.Integer.valueOf(y74Var.m75939xb282bd08(0)) : null);
        sb6.append(",commentScene:");
        r45.y74 y74Var2 = (r45.y74) wk0Var.m75936x14adae67(6);
        sb6.append(y74Var2 != null ? java.lang.Integer.valueOf(y74Var2.m75939xb282bd08(1)) : null);
        sb6.append(",nicknameOption:");
        r45.y74 y74Var3 = (r45.y74) wk0Var.m75936x14adae67(6);
        sb6.append(y74Var3 != null ? y74Var3.m75945x2fec8307(2) : null);
        sb6.append(",lbsTabTipsInfo:");
        r45.y74 y74Var4 = (r45.y74) wk0Var.m75936x14adae67(6);
        sb6.append(y74Var4 != null ? (r45.kd1) y74Var4.m75936x14adae67(4) : null);
        sb6.append(",targetFeedObject:");
        r45.y74 y74Var5 = (r45.y74) wk0Var.m75936x14adae67(6);
        sb6.append(pm0.v.u((y74Var5 == null || (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) y74Var5.m75936x14adae67(5)) == null) ? 0L : c19792x256d2725.m76784x5db1b11()));
        sb6.append(",byPassInfo:");
        r45.y74 y74Var6 = (r45.y74) wk0Var.m75936x14adae67(6);
        sb6.append((y74Var6 == null || (gy0Var = (r45.gy0) y74Var6.m75936x14adae67(6)) == null) ? null : java.lang.Integer.valueOf(gy0Var.m75939xb282bd08(0)));
        sb6.append(", squareExtraInfo:");
        r45.y74 y74Var7 = (r45.y74) wk0Var.m75936x14adae67(6);
        sb6.append(y74Var7 != null ? (r45.q92) y74Var7.m75936x14adae67(7) : null);
        sb6.append(", redPacketId:");
        r45.y74 y74Var8 = (r45.y74) wk0Var.m75936x14adae67(6);
        sb6.append(y74Var8 != null ? y74Var8.m75945x2fec8307(8) : null);
        sb6.append(", ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveDataTransferUtil", sb6.toString());
    }
}
