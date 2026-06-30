package gb0;

@j95.b
/* loaded from: classes8.dex */
public final class i extends i95.w implements j30.m {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f351484d = "MicroMsg.GetOpenDeviceInfoService";

    public final boolean Ai(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2) {
        java.util.LinkedList linkedList;
        if (f9Var == null) {
            return false;
        }
        java.lang.String str = c10597xb1f0d2.f148123h;
        boolean z17 = c10597xb1f0d2.f148127o;
        if ((z17 || str != null) && !(z17 && ((linkedList = c10597xb1f0d2.f148129q) == null || linkedList.isEmpty()))) {
            return com.p314xaae8f345.mm.ui.p2650x55bb7a46.qc.f284157a.b(f9Var.mo78013xfb85f7b0(), f9Var, f9Var.j(), c10597xb1f0d2);
        }
        return false;
    }

    public void Bi(android.content.Context context, long j17, java.lang.String str, com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (c10597xb1f0d2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f351484d, "deviceInfo is null, " + j17 + ", " + str);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.ui.chatting.ChattingSendDataToDeviceForOpenMsgUI");
        intent.putExtra("Retr_Msg_Id", j17);
        intent.putExtra("Retr_MsgTalker", str);
        intent.addFlags(268435456);
        intent.putExtra("NetworkDeviceInfo", c10597xb1f0d2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/openmsg/service/GetOpenDeviceInfoService", "openDevice", "(Landroid/content/Context;JLjava/lang/String;Lcom/tencent/mm/feature/exdevice/NetworkDeviceInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/openmsg/service/GetOpenDeviceInfoService", "openDevice", "(Landroid/content/Context;JLjava/lang/String;Lcom/tencent/mm/feature/exdevice/NetworkDeviceInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public java.util.ArrayList wi(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a564 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
        am.b6 b6Var = c5348xb8e1a564.f135674g;
        b6Var.f87752a = j17;
        b6Var.f87753b = str;
        b6Var.f87755d = -1;
        c5348xb8e1a564.e();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(str, j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("haveDeviceEvent result.isOk:");
        am.c6 c6Var = c5348xb8e1a564.f135675h;
        sb6.append(c6Var.f87869a);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f351484d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        if (c6Var.f87869a) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5346xb93c92b5 c5346xb93c92b5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5346xb93c92b5();
            am.x5 x5Var = c5346xb93c92b5.f135670g;
            x5Var.f89879a = j17;
            x5Var.f89883e = str;
            c5346xb93c92b5.e();
            am.y5 y5Var = c5346xb93c92b5.f135671h;
            if (y5Var.f89969c) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.List list = y5Var.f89967a;
                if (list != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.String>?>");
                    java.util.ArrayList arrayList4 = (java.util.ArrayList) list;
                    int size = arrayList4.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 = new com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2();
                        java.lang.Object obj = arrayList4.get(i17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                        c10597xb1f0d2.f148120e = (java.lang.String) ((java.util.Map) obj).get("deviceType");
                        java.lang.Object obj2 = arrayList4.get(i17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                        c10597xb1f0d2.f148119d = (java.lang.String) ((java.util.Map) obj2).get("deviceID");
                        java.lang.Object obj3 = arrayList4.get(i17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
                        c10597xb1f0d2.f148121f = (java.lang.String) ((java.util.Map) obj3).get("displayName");
                        java.lang.Object obj4 = arrayList4.get(i17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj4);
                        c10597xb1f0d2.f148122g = (java.lang.String) ((java.util.Map) obj4).get("iconUrl");
                        java.lang.Object obj5 = arrayList4.get(i17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj5);
                        c10597xb1f0d2.f148123h = (java.lang.String) ((java.util.Map) obj5).get("ability");
                        java.lang.Object obj6 = arrayList4.get(i17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj6);
                        c10597xb1f0d2.f148124i = (java.lang.String) ((java.util.Map) obj6).get("abilityInf");
                        c10597xb1f0d2.f148125m = "send_data_idle";
                        if (Ai(k17, c10597xb1f0d2)) {
                            arrayList3.add(c10597xb1f0d2);
                        }
                    }
                }
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ob8);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                if (y5Var.f89968b != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "iotDeviceInfo size =" + ((java.util.ArrayList) y5Var.f89968b).size());
                    java.util.List list2 = y5Var.f89968b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(list2, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.protocal.protobuf.MMIotDeviceInfo>");
                    java.util.Iterator it = ((java.util.ArrayList) list2).iterator();
                    while (it.hasNext()) {
                        r45.pf4 pf4Var = (r45.pf4) it.next();
                        com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d22 = new com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2();
                        c10597xb1f0d22.f148119d = pf4Var.f464537e;
                        c10597xb1f0d22.f148128p = pf4Var.f464536d;
                        c10597xb1f0d22.f148121f = pf4Var.f464538f;
                        c10597xb1f0d22.f148122g = pf4Var.f464539g;
                        c10597xb1f0d22.f148129q = pf4Var.f464540h;
                        c10597xb1f0d22.f148127o = true;
                        if (Ai(k17, c10597xb1f0d22)) {
                            int i18 = c10597xb1f0d22.f148128p;
                            if (i18 == 1) {
                                arrayList.add(c10597xb1f0d22);
                            } else if (i18 == 2) {
                                c10597xb1f0d22.f148121f += ' ' + string;
                                arrayList2.add(c10597xb1f0d22);
                            }
                        }
                    }
                }
                arrayList.addAll(arrayList2);
                arrayList.addAll(arrayList3);
                return arrayList;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "get no device");
        return new java.util.ArrayList();
    }
}
