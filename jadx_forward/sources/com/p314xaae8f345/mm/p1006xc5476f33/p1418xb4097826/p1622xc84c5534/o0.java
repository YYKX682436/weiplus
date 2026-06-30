package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class o0 {
    public o0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(4:181|182|(1:184)(1:187)|(8:186|156|157|158|159|(1:177)(4:163|164|165|166)|167|168))|155|156|157|158|159|(1:161)|177|167|168) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(3:138|(1:140)(1:151)|(5:142|143|144|(1:146)|148))|152|143|144|(0)|148) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02c9, code lost:
    
        if ((r5.length() == 0) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x039e, code lost:
    
        r20 = r1;
        r18 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0346 A[Catch: Exception -> 0x034d, TRY_LEAVE, TryCatch #2 {Exception -> 0x034d, blocks: (B:144:0x033e, B:146:0x0346), top: B:143:0x033e }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o0 r18, r45.qt2 r19, long r20, java.lang.String r22, int r23, java.lang.String r24, long r25, bb2.a r27, ec2.c r28, ec2.b r29, int r30, java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o0.b(com.tencent.mm.plugin.finder.report.o0, r45.qt2, long, java.lang.String, int, java.lang.String, long, bb2.a, ec2.c, ec2.b, int, java.lang.Object):void");
    }

    public final org.json.JSONObject a(int i17, java.lang.String... values) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (i17 == 4) {
            jSONObject.put("len", values[0]);
            jSONObject.put("idx_last", values[1]);
            jSONObject.put("idx_now", values[2]);
            jSONObject.put("is_video", values[3]);
            jSONObject.put("video_play_percent", values[4]);
            jSONObject.put("video_replay_count", values[5]);
            jSONObject.put("idx_type", values[6]);
        } else if (i17 == 8) {
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, values[0]);
        } else if (i17 == 10) {
            jSONObject.put("type", values[0]);
            jSONObject.put(dm.i4.f66875xa013b0d5, values[1]);
        } else if (i17 == 13) {
            jSONObject.put("type", values[0]);
        } else if (i17 == 15) {
            jSONObject.put("type", values[0]);
        } else if (i17 == 16) {
            jSONObject.put("type", values[0]);
        }
        return jSONObject;
    }

    public final void c(r45.qt2 contextObj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4 record, int i17) {
        java.lang.String m76102x6c03c64c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = record.f206692d;
        if (c14994x9b99c079 != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6506x2401cfd2 c6506x2401cfd2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6506x2401cfd2();
            c6506x2401cfd2.f138496d = c6506x2401cfd2.b("FeedId", pm0.v.u(c14994x9b99c079.m59251x5db1b11()), true);
            c6506x2401cfd2.f138497e = c14994x9b99c079.getMediaType();
            int i18 = 0;
            c6506x2401cfd2.f138498f = c6506x2401cfd2.b("SessionId", contextObj.m75945x2fec8307(0), true);
            c6506x2401cfd2.f138518z = contextObj.m75939xb282bd08(5);
            c6506x2401cfd2.f138499g = record.f206700h;
            c6506x2401cfd2.f138500h = c14994x9b99c079.m59254xf4204902();
            c6506x2401cfd2.f138501i = c14994x9b99c079.m59216x8ed22866();
            c6506x2401cfd2.f138502j = c6506x2401cfd2.b("topic", r26.i0.t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.f206740s.a(c14994x9b99c079), ",", ";", false), true);
            java.lang.String m76818x5d49e3ea = c14994x9b99c079.getFeedObject().m76818x5d49e3ea();
            java.lang.String str = "";
            if (m76818x5d49e3ea == null) {
                m76818x5d49e3ea = "";
            }
            c6506x2401cfd2.f138503k = c6506x2401cfd2.b("recommendWording", r26.i0.t(m76818x5d49e3ea, ",", ";", false), true);
            c6506x2401cfd2.f138504l = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c14994x9b99c079.m59299x6bf53a6c(), xy2.c.f(contextObj)) ? 1L : 0L;
            c6506x2401cfd2.f138505m = c14994x9b99c079.m59220x3fdd41df();
            if (c14994x9b99c079.m59262xed29dd2b().m75938x746dc8a6(1) > 0.0f && c14994x9b99c079.m59262xed29dd2b().m75938x746dc8a6(0) > 0.0f) {
                c6506x2401cfd2.f138506n = 1L;
            }
            c6506x2401cfd2.f138507o = c14994x9b99c079.m59264x7efe73ec().size();
            if (c14994x9b99c079.getMediaType() == 4 && c14994x9b99c079.m59264x7efe73ec().size() > 0) {
                c6506x2401cfd2.f138508p = c14994x9b99c079.m59264x7efe73ec().get(0).m75939xb282bd08(3);
            }
            c6506x2401cfd2.f138509q = record.f206706k - record.f206690c;
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            c6506x2401cfd2.f138510r = 5L;
            c6506x2401cfd2.f138511s = c14994x9b99c079.getFeedObject().m76820x794f1260();
            c6506x2401cfd2.f138512t = c6506x2401cfd2.b("FeedUsername", c14994x9b99c079.m59299x6bf53a6c(), true);
            c6506x2401cfd2.f138513u = c14994x9b99c079.getFeedObject().m76807x45979108();
            java.lang.String m76839x75185fc = c14994x9b99c079.getFeedObject().m76839x75185fc();
            if (m76839x75185fc == null) {
                m76839x75185fc = "";
            }
            c6506x2401cfd2.f138514v = c6506x2401cfd2.b("NoticeWording", m76839x75185fc, true);
            c6506x2401cfd2.f138515w = c14994x9b99c079.getFeedObject().m76838x997a9088();
            c6506x2401cfd2.f138516x = i17;
            java.lang.String m75945x2fec8307 = contextObj.m75945x2fec8307(1);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            c6506x2401cfd2.f138517y = c6506x2401cfd2.b("ContextId", m75945x2fec8307, true);
            c6506x2401cfd2.A = c6506x2401cfd2.b("ClickFeedId", pm0.v.u(contextObj.m75942xfb822ef2(6)), true);
            java.lang.String m75945x2fec83072 = contextObj.m75945x2fec8307(3);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            c6506x2401cfd2.B = c6506x2401cfd2.b("ClickFeedContextId", m75945x2fec83072, true);
            java.lang.String m75945x2fec83073 = contextObj.m75945x2fec8307(2);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            c6506x2401cfd2.C = c6506x2401cfd2.b("ClickTabContextId", m75945x2fec83073, true);
            c6506x2401cfd2.D = record.f206702i;
            c6506x2401cfd2.E = az2.j.f97666r.b(contextObj.m75939xb282bd08(5));
            c6506x2401cfd2.F = c6506x2401cfd2.b("SessionBuffer", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(c14994x9b99c079.m59251x5db1b11(), c14994x9b99c079.m59229xb5af1dd5(), contextObj.m75939xb282bd08(5)), true);
            java.util.LinkedList h17 = nv2.n1.f422084h.h(c14994x9b99c079.getFeedObject());
            c6506x2401cfd2.G = h17.size();
            if (h17.size() > 3) {
                c6506x2401cfd2.H = 3L;
            } else {
                c6506x2401cfd2.H = h17.size();
            }
            c6506x2401cfd2.I = c6506x2401cfd2.b("ExpoFriendLikeUserList", "", true);
            for (java.lang.Object obj : h17) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) obj;
                if (i18 <= 2) {
                    c6506x2401cfd2.I = c6506x2401cfd2.b("ExpoFriendLikeUserList", c6506x2401cfd2.I + c19781xd1c47b87.m76102x6c03c64c() + '|', true);
                }
                i18 = i19;
            }
            c6506x2401cfd2.f138495J = c14994x9b99c079.getFeedObject().m76759x57341267().size();
            java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> m76759x57341267 = c14994x9b99c079.getFeedObject().m76759x57341267();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76759x57341267, "getCommentList(...)");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b872 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) kz5.n0.Z(m76759x57341267);
            if (c19781xd1c47b872 != null && (m76102x6c03c64c = c19781xd1c47b872.m76102x6c03c64c()) != null) {
                str = m76102x6c03c64c;
            }
            c6506x2401cfd2.K = c6506x2401cfd2.b("ExpoCommentUser", str, true);
            if (c14994x9b99c079.m59316xb1cf450c()) {
                c6506x2401cfd2.L = c14994x9b99c079.getFeedObject().m76785x6e4908f2();
            }
            java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> m76759x573412672 = c14994x9b99c079.getFeedObject().m76759x57341267();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76759x573412672, "getCommentList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : m76759x573412672) {
                if (((c61.l7) i95.n0.c(c61.l7.class)).Gk(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) obj2).m76102x6c03c64c())) {
                    arrayList.add(obj2);
                }
            }
            c6506x2401cfd2.M = arrayList.size();
            c6506x2401cfd2.N = c14994x9b99c079.getFeedObject().m76759x57341267().size();
            c6506x2401cfd2.l();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6506x2401cfd2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(r45.qt2 r19, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5 r20, org.json.JSONObject r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o0.d(r45.qt2, com.tencent.mm.plugin.finder.report.f5, org.json.JSONObject, boolean):void");
    }

    public final void e(r45.qt2 contextObj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4 record) {
        java.lang.String str;
        r45.n31 m59244x27a0ce20;
        java.util.LinkedList m75941xfb821914;
        long j17;
        android.util.LongSparseArray longSparseArray;
        r45.n31 m59244x27a0ce202;
        r45.n31 m59244x27a0ce203;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6499x2d6b4cfe c6499x2d6b4cfe = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6499x2d6b4cfe();
        int i17 = 0;
        c6499x2d6b4cfe.f138424e = c6499x2d6b4cfe.b("Sessionid", contextObj.m75945x2fec8307(0), true);
        c6499x2d6b4cfe.f138425f = c6499x2d6b4cfe.b("Contextid", contextObj.m75945x2fec8307(1), true);
        c6499x2d6b4cfe.f138426g = c6499x2d6b4cfe.b("ClickTabContextid", contextObj.m75945x2fec8307(2), true);
        c6499x2d6b4cfe.f138423d = contextObj.m75939xb282bd08(5);
        c6499x2d6b4cfe.f138427h = c6499x2d6b4cfe.b("FeedId", pm0.v.u(record.f206686a), true);
        long j18 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = record.f206692d;
        c6499x2d6b4cfe.f138429j = (c14994x9b99c079 == null || (m59244x27a0ce203 = c14994x9b99c079.m59244x27a0ce20()) == null) ? 0L : m59244x27a0ce203.m75939xb282bd08(3);
        if (c14994x9b99c079 == null || (m59244x27a0ce202 = c14994x9b99c079.m59244x27a0ce20()) == null || (str = m59244x27a0ce202.m75945x2fec8307(2)) == null) {
            str = "";
        }
        c6499x2d6b4cfe.f138428i = c6499x2d6b4cfe.b("FlodUsername", str, true);
        c6499x2d6b4cfe.f138430k = c6499x2d6b4cfe.b("AllFlodFeedItems", "", true);
        if (c14994x9b99c079 != null && (m59244x27a0ce20 = c14994x9b99c079.m59244x27a0ce20()) != null && (m75941xfb821914 = m59244x27a0ce20.m75941xfb821914(1)) != null) {
            for (java.lang.Object obj : m75941xfb821914) {
                int i18 = i17 + 1;
                jz5.f0 f0Var = null;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
                in5.v0 v0Var = record.f206694e;
                in5.x0 x0Var = (v0Var == null || (longSparseArray = v0Var.f374680e) == null) ? null : (in5.x0) longSparseArray.get(c19792x256d2725.m76784x5db1b11());
                if (x0Var != null) {
                    in5.c cVar = x0Var.f374691a;
                    long mo2128x1ed62e84 = cVar.mo2128x1ed62e84();
                    long j19 = x0Var.f374692b;
                    if (j18 == mo2128x1ed62e84) {
                        c6499x2d6b4cfe.f138430k = c6499x2d6b4cfe.b("AllFlodFeedItems", c6499x2d6b4cfe.f138430k + pm0.v.u(cVar.mo2128x1ed62e84()) + ';' + i17 + ';' + j19 + ";0#", true);
                    } else {
                        c6499x2d6b4cfe.f138430k = c6499x2d6b4cfe.b("AllFlodFeedItems", c6499x2d6b4cfe.f138430k + pm0.v.u(cVar.mo2128x1ed62e84()) + ';' + i17 + ';' + j19 + ";0#", true);
                    }
                    f0Var = jz5.f0.f384359a;
                }
                if (f0Var == null) {
                    j17 = 0;
                    if (0 == c19792x256d2725.m76784x5db1b11()) {
                        c6499x2d6b4cfe.f138430k = c6499x2d6b4cfe.b("AllFlodFeedItems", c6499x2d6b4cfe.f138430k + pm0.v.u(c19792x256d2725.m76784x5db1b11()) + ';' + i17 + ";0;0#", true);
                    } else {
                        c6499x2d6b4cfe.f138430k = c6499x2d6b4cfe.b("AllFlodFeedItems", c6499x2d6b4cfe.f138430k + pm0.v.u(c19792x256d2725.m76784x5db1b11()) + ';' + i17 + ";0;0#", true);
                    }
                } else {
                    j17 = 0;
                }
                i17 = i18;
                j18 = j17;
            }
        }
        c6499x2d6b4cfe.l();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6499x2d6b4cfe);
    }

    public final void f(r45.qt2 contextObj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4 record) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = record.f206692d;
        if (c14994x9b99c079 == null || !c14994x9b99c079.getShowExtendLink()) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6486x98e6357b c6486x98e6357b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6486x98e6357b();
        c6486x98e6357b.f138276d = c6486x98e6357b.b("Feedid", pm0.v.u(c14994x9b99c079.f66939xc8a07680), true);
        c6486x98e6357b.f138277e = c6486x98e6357b.b("SessionId", contextObj.m75945x2fec8307(0), true);
        c6486x98e6357b.f138278f = c6486x98e6357b.b("Contextid", contextObj.m75945x2fec8307(1), true);
        r45.o21 m59234x84f51d21 = c14994x9b99c079.m59234x84f51d21();
        if (m59234x84f51d21 == null || (str = m59234x84f51d21.m75945x2fec8307(0)) == null) {
            str = "";
        }
        c6486x98e6357b.f138279g = c6486x98e6357b.b("Url", str, true);
        c6486x98e6357b.f138280h = 1L;
        c6486x98e6357b.f138281i = 1L;
        c6486x98e6357b.f138283k = c6486x98e6357b.b("clicktabcontextid", contextObj.m75945x2fec8307(2), true);
        c6486x98e6357b.f138284l = contextObj.m75939xb282bd08(5);
        c6486x98e6357b.f138285m = c6486x98e6357b.b("sessionBuffer", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(c14994x9b99c079.m59251x5db1b11(), record.f206688b, contextObj.m75939xb282bd08(5)), true);
        c6486x98e6357b.k();
    }
}
