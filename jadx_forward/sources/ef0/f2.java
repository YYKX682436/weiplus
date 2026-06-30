package ef0;

@j95.b
/* loaded from: classes11.dex */
public final class f2 extends i95.w implements qk.h8 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f333741d;

    public boolean Ai(java.lang.String str) {
        if (str == null) {
            return false;
        }
        ((qk.o8) i95.n0.c(qk.o8.class)).getClass();
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        il4.l lVar = il4.l.f373675a;
        return ((java.util.List) ((jz5.n) il4.l.f373676b).mo141623x754a37bb()).contains(lowerCase);
    }

    public void Bi(java.lang.String key, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(31890, key, java.lang.Integer.valueOf(i17), str != null ? r26.i0.u(str, ',', ';', false, 4, null) : "", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public void Di(qk.aa likeRequest, qk.ba baVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(likeRequest, "likeRequest");
        bw5.g80 g80Var = likeRequest.f445546b;
        java.lang.String m11970xcc16feb8 = g80Var.m11970xcc16feb8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m11970xcc16feb8, "getListenId(...)");
        if (m11970xcc16feb8.length() > 0) {
            rk4.k kVar = g80Var.f109258f ? rk4.k.f478305e : rk4.k.f478304d;
            java.lang.String m11970xcc16feb82 = g80Var.m11970xcc16feb8();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m11970xcc16feb82, "getListenId(...)");
            bw5.ar0 i17 = bw5.ar0.i(g80Var.f109266q);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i17, "forNumber(...)");
            bw5.yq0 yq0Var = kVar == rk4.k.f478305e ? bw5.yq0.TingReportAction_CancelLike : bw5.yq0.TingReportAction_Like;
            jm4.i4 Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
            if (Zi != null) {
                ef0.x1 x1Var = new ef0.x1(i17, m11970xcc16feb82);
                jm4.x1 x1Var2 = new jm4.x1();
                x1Var2.f381974d = x1Var;
                p3380x6a61f93.p3381xf512d0a5.C30432x21b2b547.m168824x21b310ed(((jm4.k4) Zi).m105978x2737f10(), yq0Var.f117159d, i17.f106955d, x1Var2);
            }
        }
        new vk4.e(g80Var).l().q(new ef0.w1(this, likeRequest, baVar, g80Var));
    }

    public boolean Ni(bw5.l80 info, il4.e tingItemExt) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItemExt, "tingItemExt");
        java.lang.String m12386x5000ed37 = info.m12386x5000ed37();
        if (m12386x5000ed37 == null || r26.n0.N(m12386x5000ed37)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingCommonService", "playLocalFile but filePath is empty!");
            return false;
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new ef0.c2(this, info, tingItemExt, null), 2, null);
        return true;
    }

    public bw5.l80 wi(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        bw5.l80 l80Var = new bw5.l80();
        l80Var.f111216d = str == null ? "" : str;
        boolean z17 = true;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        android.util.ArrayMap arrayMap = l80Var.f111227r;
        arrayMap.put(1, bool);
        if (str2 == null) {
            str2 = "";
        }
        l80Var.f111218f = str2;
        arrayMap.put(3, bool);
        if (str3 == null) {
            str3 = "";
        }
        l80Var.f111220h = str3;
        arrayMap.put(5, bool);
        if (str4 != null && str4.length() != 0) {
            z17 = false;
        }
        if (z17) {
            if (str == null) {
                str = "";
            }
            java.lang.String e17 = kk.k.e(str);
            if (e17 == null) {
                e17 = "";
            }
            l80Var.f111219g = e17;
            arrayMap.put(4, bool);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("buildListenLocalFileInfo1 md5: ");
            sb6.append(l80Var.m12387x6e095e9(4) ? l80Var.f111219g : "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingCommonService", sb6.toString());
        } else {
            l80Var.f111219g = str4;
            arrayMap.put(4, bool);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("buildListenLocalFileInfo2 md5: ");
            sb7.append(l80Var.m12387x6e095e9(4) ? l80Var.f111219g : "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingCommonService", sb7.toString());
        }
        return l80Var;
    }
}
