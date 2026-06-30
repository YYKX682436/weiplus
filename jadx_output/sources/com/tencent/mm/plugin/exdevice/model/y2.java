package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes11.dex */
public class y2 extends com.tencent.mm.sdk.event.n implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f99111d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.autogen.events.GetA8KeyRedirectEvent f99112e;

    public y2() {
        super(0);
    }

    public final void b() {
        java.lang.Runnable runnable;
        com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent = this.f99112e;
        if (getA8KeyRedirectEvent == null || (runnable = getA8KeyRedirectEvent.f192364d) == null) {
            return;
        }
        getA8KeyRedirectEvent.f54377h.f6554a = 1;
        runnable.run();
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.ref.WeakReference weakReference;
        com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent = (com.tencent.mm.autogen.events.GetA8KeyRedirectEvent) iEvent;
        if (!(getA8KeyRedirectEvent instanceof com.tencent.mm.autogen.events.GetA8KeyRedirectEvent)) {
            com.tencent.mars.xlog.Log.f("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "mismatched event");
            return false;
        }
        this.f99112e = getA8KeyRedirectEvent;
        am.df dfVar = getA8KeyRedirectEvent.f54376g;
        java.lang.String str = dfVar.f6447b;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "action = %s, key = %s", java.lang.Integer.valueOf(dfVar.f6446a), str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        am.df dfVar2 = this.f99112e.f54376g;
        if (dfVar2.f6446a != 15 || (weakReference = dfVar2.f6448c) == null || !(weakReference.get() instanceof android.app.Activity)) {
            return false;
        }
        gm0.j1.n().f273288b.a(com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH, this);
        com.tencent.mm.plugin.exdevice.model.n2 n2Var = new com.tencent.mm.plugin.exdevice.model.n2(str);
        gm0.j1.n().f273288b.g(n2Var);
        this.f99111d = db5.e1.R((android.content.Context) this.f99112e.f54376g.f6448c.get(), ((android.content.Context) this.f99112e.f54376g.f6448c.get()).getString(com.tencent.mm.R.string.f490573yv), ((android.content.Context) this.f99112e.f54376g.f6448c.get()).getString(com.tencent.mm.R.string.i_b), true, true, new com.tencent.mm.plugin.exdevice.model.x2(this, n2Var));
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        r45.uw5 uw5Var;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        r45.ov3 ov3Var;
        java.lang.String str8;
        r45.d74 d74Var;
        com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent;
        am.df dfVar;
        java.lang.ref.WeakReference weakReference;
        java.lang.Runnable runnable;
        java.lang.Runnable runnable2;
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "onSceneEnd errType = " + i17 + ", errCode = " + i18 + ",errMsg = " + str);
        android.app.ProgressDialog progressDialog = this.f99111d;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f99111d.dismiss();
        }
        if (m1Var == null) {
            b();
            return;
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "scene.getType() = %s", java.lang.Integer.valueOf(m1Var.getType()));
            b();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "scene.getType() = %s", java.lang.Integer.valueOf(m1Var.getType()));
        if (m1Var.getType() == 540) {
            gm0.j1.n().f273288b.q(com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH, this);
            com.tencent.mm.modelbase.o oVar = ((com.tencent.mm.plugin.exdevice.model.n2) m1Var).f99001e;
            r45.uw5 uw5Var2 = (oVar == null || (fVar = oVar.f70711b.f70700a) == null) ? null : (r45.uw5) fVar;
            if (uw5Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "resp == null");
                b();
                return;
            }
            r45.nv3 nv3Var = uw5Var2.f387697e;
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "deviceId = %s, deviceType = %s", nv3Var.f381692e, nv3Var.f381691d);
            r45.ov3 ov3Var2 = uw5Var2.f387698f;
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "AuthKey = %s, BrandName = %s, CloseStrategy = %s, ConnProto = %s, ConnStrategy = %s, Mac = %s", ov3Var2.f382539e, ov3Var2.f382538d, java.lang.Integer.valueOf(ov3Var2.f382543i), ov3Var2.f382541g, java.lang.Integer.valueOf(ov3Var2.f382542h), ov3Var2.f382540f);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.b7 b7Var = uw5Var2.f387701i;
            if (b7Var != null) {
                str2 = b7Var.f370579d;
                if (str2 == null) {
                    str2 = "";
                }
                str3 = b7Var.f370581f;
                if (str3 == null) {
                    str3 = "";
                }
                java.util.LinkedList linkedList2 = b7Var.f370580e;
                if (linkedList2 != null) {
                    linkedList = linkedList2;
                }
            } else {
                str2 = "";
                str3 = str2;
            }
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            if (linkedList.size() > 0) {
                for (int i19 = 0; i19 < linkedList.size(); i19++) {
                    r45.ce6 ce6Var = (r45.ce6) linkedList.get(i19);
                    if (ce6Var.f371510d.contains(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT)) {
                        arrayList.add(ce6Var.f371511e);
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "resp.BindTicket = %s", uw5Var2.f387699g);
            if (uw5Var2.f387700h == 1) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("device_scan_mode", "SCAN_CATALOG");
                boolean z17 = ov3Var2.f382541g.contains("3") || ov3Var2.f382541g.contains("1");
                boolean contains = ov3Var2.f382541g.contains("4");
                if (z17 && contains) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "Category connect proto can not be blue&wifi at the same time...");
                    return;
                }
                if (z17) {
                    intent.putExtra("device_scan_conn_proto", "blue");
                } else if (contains) {
                    intent.putExtra("device_scan_conn_proto", "wifi");
                }
                intent.putExtra(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, nv3Var.f381692e);
                intent.putExtra("device_type", nv3Var.f381691d);
                intent.putExtra("device_title", ov3Var2.f382550s);
                intent.putExtra("device_desc", ov3Var2.f382551t);
                intent.putExtra("device_icon_url", ov3Var2.f382548q);
                intent.putExtra("device_category_id", ov3Var2.f382552u);
                intent.putExtra("device_brand_name", ov3Var2.f382538d);
                intent.putExtra("bind_ticket", uw5Var2.f387699g);
                intent.putExtra("device_ble_simple_proto", ov3Var2.f382555x);
                intent.putExtra("device_airkiss_key", str2);
                intent.putExtra("device_airkiss_title", str3);
                intent.putStringArrayListExtra("device_airkiss_steps", arrayList);
                j45.l.j((android.content.Context) this.f99112e.f54376g.f6448c.get(), "exdevice", ".ui.ExdeviceBindDeviceGuideUI", intent, null);
                com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent2 = this.f99112e;
                if (getA8KeyRedirectEvent2 == null || (runnable2 = getA8KeyRedirectEvent2.f192364d) == null) {
                    return;
                }
                getA8KeyRedirectEvent2.f54377h.f6554a = 2;
                runnable2.run();
                return;
            }
            r45.tn4 tn4Var = uw5Var2.f387696d;
            if (tn4Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "mContact == null");
                b();
                return;
            }
            com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent3 = this.f99112e;
            if (getA8KeyRedirectEvent3 != null && (runnable = getA8KeyRedirectEvent3.f192364d) != null) {
                getA8KeyRedirectEvent3.f54377h.f6554a = 2;
                runnable.run();
            }
            java.lang.String g17 = x51.j1.g(tn4Var.f386589d);
            java.lang.String str9 = tn4Var.Z;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str9 == null) {
                str9 = "";
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(g17) && com.tencent.mm.sdk.platformtools.t8.K0(str9)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "processModContact user is null user:%s enuser:%s", g17, str9);
                str4 = "bind_ticket";
            } else {
                str4 = "bind_ticket";
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "processModContact : %s", g17);
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(g17, true);
                if (n17 == null || !g17.equals(n17.J0())) {
                    com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3(g17);
                    uw5Var = uw5Var2;
                    z3Var.k1(tn4Var.f386586J);
                    str5 = "device_icon_url";
                    z3Var.setType(tn4Var.f386596m & tn4Var.f386597n);
                    str6 = "device_desc";
                    str7 = "device_title";
                    z3Var.W1(tn4Var.U1 & tn4Var.V1);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str9)) {
                        z3Var.K1(str9);
                    } else if (n17 != null && ((int) n17.E2) > 0) {
                        z3Var.K1(n17.J0());
                    }
                    z3Var.E2 = n17 == null ? 0L : (int) n17.E2;
                    z3Var.M1(x51.j1.g(tn4Var.f386590e));
                    z3Var.R1(x51.j1.g(tn4Var.f386591f));
                    z3Var.S1(x51.j1.g(tn4Var.f386592g));
                    z3Var.g3(tn4Var.f386593h);
                    z3Var.M2(tn4Var.f386604s);
                    z3Var.D1(x51.j1.g(tn4Var.f386607v));
                    z3Var.J2(tn4Var.f386608w);
                    z3Var.Z2(tn4Var.B);
                    z3Var.c3(com.tencent.mm.storage.ha.q(tn4Var.S, tn4Var.f386612y, tn4Var.f386615z));
                    z3Var.h3(tn4Var.A);
                    z3Var.Z1(tn4Var.D);
                    z3Var.o3(tn4Var.E);
                    z3Var.j3(tn4Var.G);
                    z3Var.a2(tn4Var.M);
                    z3Var.b2(tn4Var.L);
                    if (c01.e2.Y(tn4Var.H)) {
                        z3Var.p3(tn4Var.H);
                    }
                    z3Var.K2((int) com.tencent.mm.sdk.platformtools.t8.i1());
                    z3Var.n1(x51.j1.g(tn4Var.f386599p));
                    z3Var.o1(x51.j1.g(tn4Var.f386603r));
                    z3Var.p1(x51.j1.g(tn4Var.f386602q));
                    z3Var.d3(tn4Var.D1);
                    z3Var.e3(tn4Var.E1);
                    if (n17 != null) {
                        java.lang.String str10 = n17.f236591z1;
                        if (str10 == null) {
                            str10 = "";
                        }
                        java.lang.String str11 = tn4Var.E1;
                        if (str11 == null) {
                            str11 = "";
                        }
                        if (!str10.equals(str11)) {
                            com.tencent.mm.vfs.w6.h(i21.q.h().b(g17));
                        }
                    }
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().j(g17);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(z3Var.d1())) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "dkinit dealModContactExtInfo failed invalid contact");
                        ov3Var = ov3Var2;
                        str8 = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID;
                    } else {
                        java.lang.String d17 = z3Var.d1();
                        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
                        com.tencent.mm.modelavatar.g.e(d17, tn4Var, z3Var);
                        r45.cb6 cb6Var = tn4Var.R;
                        if (z3Var.d1().endsWith("@chatroom") || cb6Var == null) {
                            ov3Var = ov3Var2;
                            str8 = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID;
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "SnsFlag modcontact " + cb6Var.f371428d + " " + tn4Var.f386589d);
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SnsBg modcontact ");
                            sb6.append(cb6Var.f371429e);
                            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", sb6.toString());
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("SnsBgId modcontact ");
                            ov3Var = ov3Var2;
                            str8 = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID;
                            sb7.append(cb6Var.f371430f);
                            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", sb7.toString());
                            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "SnsBgId modcontact " + cb6Var.f371431g);
                            if (p94.w0.c() != null) {
                                ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).z1(z3Var.d1(), cb6Var);
                            }
                        }
                        java.lang.String r17 = c01.z1.r();
                        if (r17 != null && !r17.equals(d17)) {
                            dm.h1 h1Var = (dm.h1) ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Ai(d17);
                            h1Var.field_username = d17;
                            h1Var.field_brandList = tn4Var.V;
                            r45.va0 va0Var = tn4Var.W;
                            if (va0Var != null) {
                                h1Var.field_brandFlag = va0Var.f388021d;
                                h1Var.field_brandInfo = va0Var.f388023f;
                                h1Var.field_brandIconURL = va0Var.f388024g;
                                h1Var.field_extInfo = va0Var.f388022e;
                                h1Var.field_attrSyncVersion = null;
                                h1Var.field_incrementUpdateTime = 0L;
                            }
                            rv.t2 t2Var = (rv.t2) h1Var;
                            if (!((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Di(t2Var)) {
                                ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Bi(t2Var);
                            }
                            z3Var.D2(h1Var.field_type);
                        }
                    }
                    z3Var.z1(tn4Var.C1);
                    r45.b5 b5Var = tn4Var.f386601p1;
                    if (b5Var != null && (d74Var = b5Var.f370529d) != null) {
                        z3Var.W2(d74Var.f372202e);
                        z3Var.X2(tn4Var.f386601p1.f370529d.f372201d);
                        z3Var.Y2(tn4Var.f386601p1.f370529d.f372203f);
                    }
                    if (c01.e2.D(g17)) {
                        z3Var.U2();
                    }
                    if (z3Var.k2()) {
                        z3Var.setType(z3Var.getType() & (-65));
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str9)) {
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(z3Var);
                    } else {
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q0(str9, z3Var);
                    }
                    if (n17 != null && (n17.getType() & 2048) != (z3Var.getType() & 2048)) {
                        if ((z3Var.getType() & 2048) != 0) {
                            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().S(z3Var.d1());
                        } else {
                            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().V(z3Var.d1());
                        }
                    }
                    java.lang.String g18 = x51.j1.g(tn4Var.f386589d);
                    getA8KeyRedirectEvent = this.f99112e;
                    if (getA8KeyRedirectEvent != null || (dfVar = getA8KeyRedirectEvent.f54376g) == null || (weakReference = dfVar.f6448c) == null || weakReference.get() == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "a8KeyRedirectEvent null");
                    }
                    com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(g18, true);
                    if (n18 != null) {
                        r45.ov3 ov3Var3 = ov3Var;
                        if (ov3Var3.f382554w == 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "Jump to ContactInfoUI.");
                            android.content.Intent intent2 = new android.content.Intent();
                            intent2.putExtra("Contact_User", g18);
                            intent2.putExtra("KIsHardDevice", true);
                            intent2.putExtra("KHardDeviceBindTicket", uw5Var.f387699g);
                            intent2.putExtra(str8, nv3Var.f381692e);
                            intent2.putExtra("device_type", nv3Var.f381691d);
                            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent2, (android.content.Context) this.f99112e.f54376g.f6448c.get());
                            return;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "Jump to DeviceProfileUI.");
                        android.content.Context context = (android.content.Context) this.f99112e.f54376g.f6448c.get();
                        android.content.Intent intent3 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI.class);
                        if (!(context instanceof android.app.Activity)) {
                            intent3.addFlags(268435456);
                        }
                        intent3.putExtra(str8, nv3Var.f381692e);
                        intent3.putExtra("device_type", nv3Var.f381691d);
                        intent3.putExtra("device_mac", ov3Var3.f382540f);
                        intent3.putExtra("device_brand_name", ov3Var3.f382538d);
                        intent3.putExtra("device_alias", ov3Var3.f382547p);
                        intent3.putExtra(str6, ov3Var3.f382551t);
                        intent3.putExtra(str7, ov3Var3.f382550s);
                        intent3.putExtra(str5, ov3Var3.f382548q);
                        intent3.putExtra("device_jump_url", ov3Var3.f382549r);
                        intent3.putExtra(str4, uw5Var.f387699g);
                        intent3.putExtra("device_has_bound", com.tencent.mm.plugin.exdevice.model.l3.Ui().d1(n18.d1(), nv3Var.f381692e) != null);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent3);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/model/SearchDeviceGetA8KeyRedirectListener", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(context, "com/tencent/mm/plugin/exdevice/model/SearchDeviceGetA8KeyRedirectListener", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "cat's replace user with stranger");
            }
            uw5Var = uw5Var2;
            str7 = "device_title";
            ov3Var = ov3Var2;
            str8 = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID;
            str6 = "device_desc";
            str5 = "device_icon_url";
            java.lang.String g182 = x51.j1.g(tn4Var.f386589d);
            getA8KeyRedirectEvent = this.f99112e;
            if (getA8KeyRedirectEvent != null) {
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "a8KeyRedirectEvent null");
        }
    }
}
