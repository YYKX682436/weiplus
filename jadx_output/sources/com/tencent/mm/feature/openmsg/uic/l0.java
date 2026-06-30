package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.uic.n0 f67346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.feature.openmsg.uic.n0 n0Var) {
        super(1);
        this.f67346d = n0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        com.tencent.mm.plugin.appbrand.service.k5 k5Var;
        hb0.a state = (hb0.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgDeviceUIC", "init msgId:" + state.f280014g + " talker:" + state.f280016i);
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof eb0.c)) {
            eb0.c cVar = (eb0.c) dVar;
            com.tencent.mm.storage.f9 f9Var = cVar.f250705b;
            final com.tencent.mm.feature.openmsg.uic.n0 n0Var = this.f67346d;
            n0Var.f67360e = f9Var;
            java.lang.String str = state.f280016i;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            n0Var.f67361f = str;
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
            long j17 = state.f280014g;
            am.b6 b6Var = exDeviceHaveBindNetworkDeviceEvent.f54141g;
            b6Var.f6219a = j17;
            b6Var.f6220b = state.f280016i;
            b6Var.f6222d = -1;
            exDeviceHaveBindNetworkDeviceEvent.e();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("haveDeviceEvent result.isOk:");
            am.c6 c6Var = exDeviceHaveBindNetworkDeviceEvent.f54142h;
            sb6.append(c6Var.f6336a);
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgDeviceUIC", sb6.toString());
            if (c6Var.f6336a) {
                em.a V6 = n0Var.V6();
                if (V6.f254039d == null) {
                    V6.f254039d = (android.widget.TextView) V6.f254036a.findViewById(com.tencent.mm.R.id.t3q);
                }
                V6.f254039d.setVisibility(0);
                em.a V62 = n0Var.V6();
                if (V62.f254040e == null) {
                    V62.f254040e = (androidx.core.widget.NestedScrollView) V62.f254036a.findViewById(com.tencent.mm.R.id.t3p);
                }
                V62.f254040e.setVisibility(0);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.feature.openmsg.uic.OpenMsgDeviceUIC$onCreate$1$1$deviceAdapter$1
                    @Override // in5.s
                    public in5.r getItemConvert(int type) {
                        db0.e eVar;
                        if (type != 1) {
                            if (type == 2) {
                                return new com.tencent.mm.feature.openmsg.uic.f0(com.tencent.mm.feature.openmsg.uic.n0.this);
                            }
                            if (type == 3) {
                                return new com.tencent.mm.feature.openmsg.uic.i0(com.tencent.mm.feature.openmsg.uic.n0.this);
                            }
                            throw new java.lang.Throwable("not support");
                        }
                        com.tencent.mm.feature.openmsg.uic.n0 n0Var2 = com.tencent.mm.feature.openmsg.uic.n0.this;
                        db0.j jVar = n0Var2.f67362g;
                        if (jVar != null) {
                            if (jVar.f227833c == null) {
                                jVar.f227833c = new db0.h(jVar);
                            }
                            eVar = jVar.f227833c;
                            kotlin.jvm.internal.o.d(eVar);
                        } else {
                            eVar = null;
                        }
                        return new com.tencent.mm.feature.openmsg.uic.d0(n0Var2, eVar);
                    }
                }, arrayList, false);
                em.a V63 = n0Var.V6();
                if (V63.f254042g == null) {
                    V63.f254042g = (com.tencent.mm.view.recyclerview.WxRecyclerView) V63.f254036a.findViewById(com.tencent.mm.R.id.t3o);
                }
                V63.f254042g.setAdapter(wxRecyclerAdapter);
                em.a V64 = n0Var.V6();
                if (V64.f254042g == null) {
                    V64.f254042g = (com.tencent.mm.view.recyclerview.WxRecyclerView) V64.f254036a.findViewById(com.tencent.mm.R.id.t3o);
                }
                V64.f254042g.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(n0Var.getContext(), 0, false));
                com.tencent.mm.autogen.events.ExDeviceGetNetworkDeviceInfoEvent exDeviceGetNetworkDeviceInfoEvent = new com.tencent.mm.autogen.events.ExDeviceGetNetworkDeviceInfoEvent();
                long j18 = state.f280014g;
                am.x5 x5Var = exDeviceGetNetworkDeviceInfoEvent.f54137g;
                x5Var.f8346a = j18;
                x5Var.f8350e = state.f280016i;
                exDeviceGetNetworkDeviceInfoEvent.e();
                am.y5 y5Var = exDeviceGetNetworkDeviceInfoEvent.f54138h;
                if (y5Var.f8436c) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.util.List list = y5Var.f8434a;
                    if (list != null) {
                        java.util.ArrayList arrayList5 = (java.util.ArrayList) list;
                        int size = arrayList5.size();
                        for (int i18 = 0; i18 < size; i18++) {
                            com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = new com.tencent.mm.feature.exdevice.NetworkDeviceInfo();
                            java.lang.Object obj2 = arrayList5.get(i18);
                            kotlin.jvm.internal.o.d(obj2);
                            networkDeviceInfo.f66587e = (java.lang.String) ((java.util.Map) obj2).get("deviceType");
                            java.lang.Object obj3 = arrayList5.get(i18);
                            kotlin.jvm.internal.o.d(obj3);
                            networkDeviceInfo.f66586d = (java.lang.String) ((java.util.Map) obj3).get("deviceID");
                            java.lang.Object obj4 = arrayList5.get(i18);
                            kotlin.jvm.internal.o.d(obj4);
                            networkDeviceInfo.f66588f = (java.lang.String) ((java.util.Map) obj4).get("displayName");
                            java.lang.Object obj5 = arrayList5.get(i18);
                            kotlin.jvm.internal.o.d(obj5);
                            networkDeviceInfo.f66589g = (java.lang.String) ((java.util.Map) obj5).get("iconUrl");
                            java.lang.Object obj6 = arrayList5.get(i18);
                            kotlin.jvm.internal.o.d(obj6);
                            networkDeviceInfo.f66590h = (java.lang.String) ((java.util.Map) obj6).get("ability");
                            java.lang.Object obj7 = arrayList5.get(i18);
                            kotlin.jvm.internal.o.d(obj7);
                            networkDeviceInfo.f66591i = (java.lang.String) ((java.util.Map) obj7).get("abilityInf");
                            networkDeviceInfo.f66592m = "send_data_idle";
                            if (com.tencent.mm.feature.openmsg.uic.n0.T6(n0Var, cVar.f250705b, networkDeviceInfo)) {
                                arrayList4.add(networkDeviceInfo);
                            }
                        }
                    }
                    java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ob8);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    if (y5Var.f8435b != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgDeviceUIC", "iotDeviceInfo size =" + ((java.util.ArrayList) y5Var.f8435b).size());
                        java.util.List list2 = y5Var.f8435b;
                        kotlin.jvm.internal.o.e(list2, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.protocal.protobuf.MMIotDeviceInfo>");
                        java.util.Iterator it = ((java.util.ArrayList) list2).iterator();
                        while (it.hasNext()) {
                            r45.pf4 pf4Var = (r45.pf4) it.next();
                            com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo2 = new com.tencent.mm.feature.exdevice.NetworkDeviceInfo();
                            networkDeviceInfo2.f66586d = pf4Var.f383004e;
                            networkDeviceInfo2.f66595p = pf4Var.f383003d;
                            networkDeviceInfo2.f66588f = pf4Var.f383005f;
                            networkDeviceInfo2.f66589g = pf4Var.f383006g;
                            networkDeviceInfo2.f66596q = pf4Var.f383007h;
                            networkDeviceInfo2.f66594o = true;
                            if (com.tencent.mm.feature.openmsg.uic.n0.T6(n0Var, cVar.f250705b, networkDeviceInfo2)) {
                                int i19 = networkDeviceInfo2.f66595p;
                                if (i19 == 1) {
                                    arrayList2.add(networkDeviceInfo2);
                                } else if (i19 == 2) {
                                    networkDeviceInfo2.f66588f += ' ' + string;
                                    arrayList3.add(networkDeviceInfo2);
                                }
                            }
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo3 = new com.tencent.mm.feature.exdevice.NetworkDeviceInfo();
                        networkDeviceInfo3.f66594o = true;
                        networkDeviceInfo3.f66586d = com.tencent.mm.feature.openmsg.uic.n0.f67358i;
                        networkDeviceInfo3.f66588f = n0Var.getString(com.tencent.mm.R.string.c47);
                        arrayList2.add(networkDeviceInfo3);
                    }
                    java.util.Iterator it6 = arrayList2.iterator();
                    int i27 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            i17 = 6;
                            break;
                        }
                        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo4 = (com.tencent.mm.feature.exdevice.NetworkDeviceInfo) it6.next();
                        kotlin.jvm.internal.o.d(networkDeviceInfo4);
                        arrayList.add(new com.tencent.mm.feature.openmsg.uic.e0(n0Var, networkDeviceInfo4, false, 2, null));
                        i27++;
                        i17 = 6;
                        if (i27 >= 6) {
                            break;
                        }
                    }
                    if (arrayList2.size() > i17) {
                        arrayList.add(new com.tencent.mm.feature.openmsg.uic.j0(n0Var, false, 1, null));
                    }
                    if (arrayList2.size() > 0 && arrayList3.size() > 0) {
                        arrayList.add(new com.tencent.mm.feature.openmsg.uic.g0(n0Var));
                    }
                    java.util.Iterator it7 = arrayList3.iterator();
                    int i28 = 0;
                    while (it7.hasNext()) {
                        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo5 = (com.tencent.mm.feature.exdevice.NetworkDeviceInfo) it7.next();
                        kotlin.jvm.internal.o.d(networkDeviceInfo5);
                        arrayList.add(new com.tencent.mm.feature.openmsg.uic.e0(n0Var, networkDeviceInfo5, false, 2, null));
                        i28++;
                        if (i28 >= i17) {
                            break;
                        }
                    }
                    if (n0Var.f67362g == null && (k5Var = (com.tencent.mm.plugin.appbrand.service.k5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k5.class)) != null) {
                        n0Var.f67362g = new db0.j(((zh1.p) k5Var).Ui(state.f280020p, state.f280018n, null, state.f280019o), arrayList.size());
                    }
                    if (arrayList3.size() > i17) {
                        arrayList.add(new com.tencent.mm.feature.openmsg.uic.j0(n0Var, false, 1, null));
                    }
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
            } else {
                em.a V65 = n0Var.V6();
                if (V65.f254039d == null) {
                    V65.f254039d = (android.widget.TextView) V65.f254036a.findViewById(com.tencent.mm.R.id.t3q);
                }
                V65.f254039d.setVisibility(8);
                em.a V66 = n0Var.V6();
                if (V66.f254040e == null) {
                    V66.f254040e = (androidx.core.widget.NestedScrollView) V66.f254036a.findViewById(com.tencent.mm.R.id.t3p);
                }
                V66.f254040e.setVisibility(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
