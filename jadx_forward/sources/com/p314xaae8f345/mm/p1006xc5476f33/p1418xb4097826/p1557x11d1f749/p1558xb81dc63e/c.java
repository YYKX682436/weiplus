package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e;

/* loaded from: classes8.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final android.os.Bundle a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, boolean z17) {
        jz5.f0 f0Var;
        r45.yj4 yj4Var = new r45.yj4();
        try {
            yj4Var.mo11468x92b714fd(c16601x7ed0e40c.f66790x225a93cf);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderVideoMultiTaskHelper", "MegaVideoFloatBallInfo parse fail", th6);
        }
        android.content.Intent intent = new android.content.Intent();
        java.util.LinkedList m75941xfb821914 = yj4Var.m75941xfb821914(6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCacheNewVideoList(...)");
        if (kz5.n0.a0(m75941xfb821914, yj4Var.m75939xb282bd08(2)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderVideoMultiTaskHelper", "onTaskBarItemClicked: currVideoPos item is null pos = " + yj4Var.m75939xb282bd08(2));
            yj4Var.set(2, 0);
        }
        yj4Var.set(0, c16601x7ed0e40c.f66791xc8a07680);
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb8219142 = yj4Var.m75941xfb821914(6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getCacheNewVideoList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb8219142) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            arrayList.add(cu2.u.f303974a.p(h90Var.a(c19792x256d2725, 1)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) kz5.n0.a0(arrayList, yj4Var.m75939xb282bd08(2));
        java.util.List c17 = abstractC14490x69736cb5 != null ? kz5.b0.c(abstractC14490x69736cb5) : new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) kz5.n0.Z(c17);
        if (abstractC14490x69736cb52 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoMultiTaskHelper", "handleClickMultiTask: case1, enter feed id=" + pm0.v.u(abstractC14490x69736cb52.getFeedObject().m59251x5db1b11()) + ", isFromMultiTask=" + z17);
            if (yj4Var.m75942xfb822ef2(7) > c01.id.c()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoMultiTaskHelper", "handleClickMultiTask: had valid cache feed");
                hc2.e0.b(intent, yj4Var.m75939xb282bd08(2), c17, yj4Var.m75934xbce7f2f(4), null);
                if (z17) {
                    bu2.j jVar = bu2.j.f106067a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = abstractC14490x69736cb52.getFeedObject();
                    bu2.i iVar = bu2.i.f106054b;
                    jVar.o(feedObject, bu2.i.f106064l);
                }
            }
            intent.putExtra("KEY_CACHE_OBJECT_ID", abstractC14490x69736cb52.getFeedObject().m59251x5db1b11());
            intent.putExtra("KEY_CACHE_OBJECT_NONCE_ID", abstractC14490x69736cb52.getFeedObject().m59276x6c285d75());
            if (z17) {
                intent.putExtra("feed_object_id", abstractC14490x69736cb52.getFeedObject().m59251x5db1b11());
                intent.putExtra("feed_object_nonceId", abstractC14490x69736cb52.getFeedObject().m59276x6c285d75());
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoMultiTaskHelper", "handleClickMultiTask: case2 enter feed id=" + pm0.v.u(yj4Var.m75942xfb822ef2(9)) + ", isFromMultiTask=" + z17);
            intent.putExtra("KEY_CACHE_OBJECT_ID", yj4Var.m75942xfb822ef2(9));
            if (z17) {
                intent.putExtra("feed_object_id", yj4Var.m75942xfb822ef2(9));
            }
        }
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).mj(4, intent);
        intent.putExtra("KEY_ROUTER_UI", 0);
        intent.putExtra("KEY_FLOAT_BALL_INFO", yj4Var.mo14344x5f01b1f6());
        intent.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", yj4Var.m75939xb282bd08(3) * 1000);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).getClass();
        intent.putExtra("KEY_VIDEO_THUMB_LOCAL_PATH", com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0.f232039a.c(c16601x7ed0e40c));
        if (z17) {
            java.lang.String Bj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(18, 2, 25, intent);
            intent.putExtra("key_extra_info", "{\"feedid\":" + c16601x7ed0e40c.f66791xc8a07680 + '}');
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
            java.lang.String field_id = c16601x7ed0e40c.f66791xc8a07680;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
            int Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).Di(field_id, c16601x7ed0e40c.f66793x2262335f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
            r45.qt2 qt2Var = new r45.qt2();
            qt2Var.set(1, Bj);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedid", c16601x7ed0e40c.f66791xc8a07680);
            jSONObject.put("feed_index", Di + 1);
            jSONObject.put("import_time", c16601x7ed0e40c.f66789xac3be4e);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, qt2Var, "float_feed", 1, jSONObject, false, null, 48, null);
        } else {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(17, 2, 4, intent);
        }
        hc2.e0.a(intent, 0, null, 3, null);
        return intent.getExtras();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        if (r2.putExtra("key_multi_task_common_info", r3.mo14344x5f01b1f6()) == null) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c r9, r45.fr4 r10, boolean r11, android.app.Activity r12) {
        /*
            r8 = this;
            java.lang.String r0 = "multiTaskInfo"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()
            if (r1 == 0) goto L10
            android.os.Bundle r9 = r8.a(r9, r11)
            goto L2e
        L10:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r1.putParcelable(r0, r9)
            java.lang.String r9 = "isFromMultiTask"
            r1.putBoolean(r9, r11)
            java.lang.String r9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a
            java.lang.Class<com.tencent.mm.plugin.finder.megavideo.multitask.a> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.a.class
            android.os.Parcelable r9 = com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(r9, r1, r0)
            android.os.Bundle r9 = (android.os.Bundle) r9
            if (r9 != 0) goto L2e
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
        L2e:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            if (r9 == 0) goto L38
            r2.putExtras(r9)
        L38:
            java.lang.String r9 = "key_multi_task_common_info"
            r0 = 2
            r1 = 3
            r7 = 0
            if (r10 == 0) goto L80
            r45.w60 r3 = new r45.w60
            r3.<init>()
            java.lang.String r4 = bm5.f1.a()
            r3.set(r1, r4)
            r3.set(r7, r10)
            r10 = r11 ^ 1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r3.set(r0, r10)
            if (r12 == 0) goto L76
            java.lang.Class<nd0.e> r10 = nd0.e.class
            i95.m r10 = i95.n0.c(r10)
            nd0.e r10 = (nd0.e) r10
            r4 = 5
            md0.e r10 = (md0.e) r10
            com.tencent.mm.protobuf.f r10 = r10.wi(r12, r4)
            r45.kr4 r10 = (r45.kr4) r10
            if (r10 == 0) goto L71
            java.lang.String r10 = r10.m75945x2fec8307(r7)
            goto L72
        L71:
            r10 = 0
        L72:
            r4 = 1
            r3.set(r4, r10)
        L76:
            byte[] r10 = r3.mo14344x5f01b1f6()
            android.content.Intent r10 = r2.putExtra(r9, r10)
            if (r10 != 0) goto L9c
        L80:
            r45.w60 r10 = new r45.w60
            r10.<init>()
            java.lang.String r3 = bm5.f1.a()
            r10.set(r1, r3)
            r1 = r11 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r10.set(r0, r1)
            byte[] r10 = r10.mo14344x5f01b1f6()
            r2.putExtra(r9, r10)
        L9c:
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            r2.addFlags(r9)
            java.lang.Class<com.tencent.mm.plugin.finder.assist.i0> r9 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class
            if (r11 == 0) goto Lb8
            i95.m r9 = i95.n0.c(r9)
            com.tencent.mm.plugin.finder.assist.i0 r9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) r9
            if (r12 == 0) goto Laf
            r10 = r12
            goto Lb1
        Laf:
            android.content.Context r10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
        Lb1:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r10)
            r9.uk(r10, r2, r7)
            goto Ld6
        Lb8:
            i95.m r9 = i95.n0.c(r9)
            java.lang.String r10 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r10)
            r0 = r9
            com.tencent.mm.plugin.finder.assist.i0 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) r0
            if (r12 == 0) goto Lc8
            r1 = r12
            goto Lcb
        Lc8:
            android.content.Context r9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r1 = r9
        Lcb:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.Ak(r0, r1, r2, r3, r4, r5, r6)
        Ld6:
            if (r11 == 0) goto Ldd
            if (r12 == 0) goto Ldd
            r12.overridePendingTransition(r7, r7)
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.c.b(com.tencent.mm.plugin.multitask.model.MultiTaskInfo, r45.fr4, boolean, android.app.Activity):void");
    }
}
