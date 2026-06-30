package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class m8 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f216675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f216676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f216677f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f216678g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q8 f216679h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f216680i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f216681m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f216682n;

    public m8(android.content.Context context, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, r45.mb4 mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q8 q8Var, in5.s0 s0Var, java.lang.String str, long j17) {
        this.f216675d = context;
        this.f216676e = jSONObject;
        this.f216677f = abstractC14490x69736cb5;
        this.f216678g = mb4Var;
        this.f216679h = q8Var;
        this.f216680i = s0Var;
        this.f216681m = str;
        this.f216682n = j17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0024. Please report as an issue. */
    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.vfs.x1 m17;
        int itemId = menuItem.getItemId();
        r45.mb4 mb4Var = this.f216678g;
        android.content.Context context = this.f216675d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q8 q8Var = this.f216679h;
        in5.s0 holder = this.f216680i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed = this.f216677f;
        lu2.j jVar = lu2.j.f402909a;
        switch (itemId) {
            case 1:
                android.content.Context context2 = this.f216675d;
                java.lang.String jSONObject = this.f216676e.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                lu2.j.b(jVar, context2, jSONObject, null, 4, null);
                return;
            case 2:
                java.lang.String str = this.f216681m;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(str);
                dp.a.m125854x26a183b(holder.f374654e, "debug info " + str, 1).show();
                return;
            case 3:
                android.content.Context context3 = this.f216675d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("后台配置:\n");
                r45.b21 enhanceTriggerConfig = feed.getFeedObject().getEnhanceTriggerConfig();
                sb6.append(enhanceTriggerConfig != null ? enhanceTriggerConfig.mo12245xcc313de3() : null);
                lu2.j.b(jVar, context3, sb6.toString(), null, 4, null);
                return;
            case 4:
                if (mb4Var != null) {
                    android.content.Context context4 = this.f216675d;
                    mn2.g4 c17 = ds2.h.f324399a.c(this.f216682n, mb4Var, false);
                    lu2.j.b(jVar, context4, "path:" + c17.mo148083xfb83cc9b() + " \nsize:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(com.p314xaae8f345.mm.vfs.w6.k(c17.mo148083xfb83cc9b())) + "\nmediaId:" + c17.f411535e.m75945x2fec8307(9) + "\nurl=" + mb4Var.m75945x2fec8307(0) + " \n" + ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10219xa23d6ecc(c17.mo148083xfb83cc9b()) + " \nisH265:" + ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10228x8998e7bb(c17.mo148083xfb83cc9b()), null, 4, null);
                    return;
                }
                return;
            case 5:
                if (mb4Var != null) {
                    mn2.g4 c18 = ds2.h.f324399a.c(feed.mo2128x1ed62e84(), mb4Var, false);
                    java.lang.String str2 = "path:" + c18.mo148083xfb83cc9b() + " \nsize:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(com.p314xaae8f345.mm.vfs.w6.k(c18.mo148083xfb83cc9b())) + "\nmediaId:" + c18.f411535e.m75945x2fec8307(9) + "\nurl=" + mb4Var.m75945x2fec8307(0);
                    android.content.Intent intent = new android.content.Intent();
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c c11280xa65cf99c = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c();
                    c11280xa65cf99c.m48460x4ab94e43(c18.mo148083xfb83cc9b());
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
                    c11286x34a5504.f33122xe4128443 = c11280xa65cf99c;
                    com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(c18.mo148083xfb83cc9b());
                    java.lang.String str3 = a17.f294812f;
                    if (str3 != null) {
                        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                        if (!a17.f294812f.equals(l17)) {
                            a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                        }
                    }
                    java.lang.String str4 = a17.f294812f;
                    int lastIndexOf = str4.lastIndexOf("/");
                    if (lastIndexOf >= 0) {
                        str4 = str4.substring(lastIndexOf + 1);
                    }
                    c11286x34a5504.f33130x6942258 = str4;
                    com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                    long j17 = 0;
                    if (m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) {
                        j17 = m17.f294766c;
                    }
                    c11286x34a5504.f33121x993583fc = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(j17);
                    intent.putExtra("Select_Conv_Type", 3);
                    intent.putExtra("select_is_ret", true);
                    intent.putExtra("Retr_Msg_Type", 2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                    j45.l.x((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context, ".ui.transmit.SelectConversationUI", intent, 1004, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.l8(c11286x34a5504, str2));
                    return;
                }
                return;
            case 6:
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("friendLikeCount=" + feed.getFeedObject().getFeedObject().m76779xf67fd084() + " incFriendLikeCount=" + feed.getFeedObject().getFeedObject().m76785x6e4908f2() + '\n');
                java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> m76793xbd916e4b = feed.getFeedObject().getFeedObject().m76793xbd916e4b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76793xbd916e4b, "getLikeList(...)");
                for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 : m76793xbd916e4b) {
                    sb7.append(c19781xd1c47b87.m76084x8010e5e4());
                    sb7.append("=");
                    sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v(c19781xd1c47b87.m76064x3febcdbf()));
                    sb7.append("\n");
                }
                android.content.Context context5 = this.f216675d;
                java.lang.String sb8 = sb7.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
                lu2.j.b(jVar, context5, sb8, null, 4, null);
                return;
            case 7:
            default:
                return;
            case 8:
                if (mb4Var != null) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = feed.getFeedObject().getFeedObject();
                    q8Var.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObject, "feedObject");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    java.util.LinkedList<r45.vf2> m75941xfb821914 = mb4Var.m75941xfb821914(44);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getHdr_spec(...)");
                    for (r45.vf2 vf2Var : m75941xfb821914) {
                        java.lang.String m75945x2fec8307 = vf2Var.m75945x2fec8307(0);
                        if (m75945x2fec8307 == null) {
                            m75945x2fec8307 = "unknown-hdr";
                        }
                        linkedList.add(m75945x2fec8307);
                        linkedList2.add(yr2.l.b(vf2Var));
                    }
                    java.util.LinkedList m75941xfb8219142 = mb4Var.m75941xfb821914(15);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getSpec(...)");
                    java.util.Iterator it = m75941xfb8219142.iterator();
                    while (true) {
                        java.lang.String str5 = "unknown-sdr";
                        if (it.hasNext()) {
                            r45.vf2 vf2Var2 = (r45.vf2) it.next();
                            java.lang.String m75945x2fec83072 = vf2Var2.m75945x2fec8307(0);
                            if (m75945x2fec83072 != null) {
                                str5 = m75945x2fec83072;
                            }
                            linkedList.add(str5);
                            linkedList2.add(yr2.l.b(vf2Var2));
                        } else {
                            java.util.LinkedList<r45.jb1> m75941xfb8219143 = mb4Var.m75941xfb821914(43);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getHls_spec(...)");
                            for (r45.jb1 jb1Var : m75941xfb8219143) {
                                java.lang.String m75945x2fec83073 = jb1Var.m75945x2fec8307(0);
                                if (m75945x2fec83073 == null) {
                                    m75945x2fec83073 = "unknown-sdr";
                                }
                                linkedList.add(m75945x2fec83073);
                                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("Spec[");
                                sb9.append(jb1Var.m75945x2fec8307(0));
                                sb9.append(' ');
                                sb9.append(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jb1Var.m75945x2fec8307(3), "h266") ? "6" : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jb1Var.m75945x2fec8307(3), "h264") ? "4" : "5");
                                sb9.append("  ");
                                sb9.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(jb1Var.m75939xb282bd08(1)));
                                sb9.append(' ');
                                sb9.append(jb1Var.m75939xb282bd08(2));
                                sb9.append("  ");
                                sb9.append(jb1Var.m75939xb282bd08(13));
                                sb9.append(']');
                                linkedList2.add(sb9.toString());
                            }
                            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                            h0Var.f391656d = lu2.j.c(jVar, context, linkedList2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q8.Q6(holder), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p8(linkedList, holder, h0Var), 24, null);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderDebugUIC", "handleSelectSpec :" + hc2.o0.n(feedObject, true));
                        }
                    }
                }
                return;
            case 9:
                q8Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.e_k);
                if (c15196x85976f5f != null && (c15196x85976f5f.getVideoView() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd)) {
                    cw2.da videoView = c15196x85976f5f.getVideoView();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(videoView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy");
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                    java.lang.StringBuilder sb11 = new java.lang.StringBuilder("position:");
                    cw2.p6 p6Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView).T;
                    sb11.append(p6Var.f305464b);
                    sb10.append(sb11.toString());
                    sb10.append("\n");
                    sb10.append("decodeType:" + p6Var.f305465c);
                    sb10.append("\n");
                    sb10.append("preloadType:" + p6Var.f305466d);
                    sb10.append("\n");
                    sb10.append("firstFrameTime:" + p6Var.f305467e);
                    sb10.append("\n");
                    sb10.append("viewType:" + p6Var.f305469g);
                    sb10.append("\n");
                    sb10.append("specType:" + p6Var.f305470h);
                    sb10.append("\n");
                    jz5.o oVar = (jz5.o) ((c61.l7) i95.n0.c(c61.l7.class)).ek().f546234r.get(p6Var.f305463a);
                    sb10.append("preloadMaxBitRate:" + (oVar != null ? (int) ((java.lang.Number) oVar.f384376f).longValue() : 0));
                    sb10.append("\n");
                    sb10.append("videoBitRate:" + p6Var.f305471i);
                    sb10.append("\n");
                    ((c61.l7) i95.n0.c(c61.l7.class)).Uj().getClass();
                    long j18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274322t;
                    long e17 = ((c61.l7) i95.n0.c(c61.l7.class)).Uj().e();
                    long j19 = ((c61.l7) i95.n0.c(c61.l7.class)).Uj().f394651d;
                    long j27 = ((c61.l7) i95.n0.c(c61.l7.class)).Uj().f394651d;
                    sb10.append("global rx:" + j18);
                    sb10.append("\n");
                    sb10.append("cdn    rx:" + e17 + " gap:" + (j18 - e17));
                    sb10.append("\n");
                    sb10.append("finder rx:" + j19 + " gap:" + (e17 - j19));
                    sb10.append("\n");
                    sb10.append("report rx:" + j27 + " gap:" + (j19 - j27));
                    android.app.Activity m80379x76847179 = q8Var.m80379x76847179();
                    java.lang.String sb12 = sb10.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb12, "toString(...)");
                    lu2.j.b(jVar, m80379x76847179, sb12, null, 4, null);
                }
                return;
            case 10:
                q8Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
                gs2.c cVar = gs2.c.f356605a;
                java.util.List list = gs2.d.f356610a;
                int d17 = kz5.b1.d(kz5.d0.q(list, 10));
                if (d17 < 16) {
                    d17 = 16;
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
                for (java.lang.Object obj : list) {
                    linkedHashMap.put(((gs2.b) obj).f356601a, obj);
                }
                java.util.List S0 = kz5.n0.S0(linkedHashMap.keySet());
                lu2.j.c(jVar, context, S0, "组件优先级", null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o8(linkedHashMap, S0, context, q8Var, holder, feed), 24, null);
                return;
            case 11:
                q8Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n8 n8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n8(context, holder);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                android.widget.EditText editText = new android.widget.EditText(context);
                editText.setGravity(3);
                editText.setTextSize(1, 14.0f);
                editText.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
                editText.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
                editText.setTypeface(android.graphics.Typeface.MONOSPACE);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.j_);
                editText.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                db5.e1.r(context, "视频号测试", editText, "确定", "取消", new lu2.g(n8Var, editText), lu2.f.f402904d);
                return;
            case 12:
                lu2.j.b(jVar, this.f216675d, bd2.b.f100777a.i(this.f216675d, this.f216677f, 0L, 58), null, 4, null);
                return;
        }
    }
}
