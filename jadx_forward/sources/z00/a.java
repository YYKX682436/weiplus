package z00;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final z00.a f550458a = new z00.a();

    public static final java.lang.String a(int i17) {
        java.lang.String str = ".msg.appmsg.mmreader.template_header.ecs_kf_template_msg_product_info";
        if (i17 != 0) {
            str = ".msg.appmsg.mmreader.template_header.ecs_kf_template_msg_product_info" + i17;
        }
        return str + ".product_card";
    }

    public final bw5.m7 a(java.util.Map map, java.lang.String str) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i17 = 0;
        do {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(".itemList");
            if (i17 != 0) {
                sb6.append(i17);
            }
            java.lang.String sb7 = sb6.toString();
            java.lang.String str2 = (java.lang.String) map.get(sb7 + ".key");
            java.lang.String str3 = (java.lang.String) map.get(sb7 + ".bypass");
            java.lang.String str4 = (java.lang.String) map.get(sb7 + ".level");
            if (str2 == null || str2.length() == 0) {
                if (str3 == null || str3.length() == 0) {
                    if (str4 == null || str4.length() == 0) {
                        break;
                    }
                }
            }
            if (!(str2 == null || str2.length() == 0)) {
                bw5.l7 l7Var = new bw5.l7();
                l7Var.f111203d = str2;
                boolean[] zArr = l7Var.f111206g;
                zArr[1] = true;
                if (!(str3 == null || str3.length() == 0)) {
                    byte[] bytes = str3.getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                    l7Var.f111204e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bytes);
                    zArr[2] = true;
                }
                l7Var.f111205f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str4, 0);
                zArr[3] = true;
                linkedList.add(l7Var);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsKfProductInfoXmlParser", "parseCgiPreloadInfo: itemList[%d] missing key, skip. prefix=%s", java.lang.Integer.valueOf(i17), str);
            }
            i17++;
        } while (i17 <= 16);
        if (linkedList.isEmpty()) {
            return null;
        }
        bw5.m7 m7Var = new bw5.m7();
        m7Var.f111630d = linkedList;
        m7Var.f111631e[1] = true;
        return m7Var;
    }
}
