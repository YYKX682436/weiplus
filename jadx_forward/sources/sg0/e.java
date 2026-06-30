package sg0;

@j95.b
/* loaded from: classes11.dex */
public final class e extends i95.w implements tg0.f1 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f489235d = "";

    public void Ai(android.content.Context context, int i17, int i18, java.util.Map extras) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extras, "extras");
        Ui(i17, i18, tg0.e1.f500595e, extras);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75.class);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
        intent.putExtra("entrance", i18);
        java.util.Map t17 = kz5.c1.t(extras);
        t17.remove("reportInfoFor33399");
        java.lang.Object obj = extras.get("imgPath");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str != null) {
            if (str.length() > 0) {
                intent.putExtra("image_url", str);
                t17.remove("imgPath");
            }
        }
        java.lang.Object obj2 = extras.get("base64ImageData");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str2 != null) {
            if (str2.length() > 0) {
                if (r26.n0.L(str2, ";base64,", 0, false, 6, null) >= 0) {
                    str2 = str2.substring(r26.n0.L(str2, ";base64,", 0, false, 6, null) + 8);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "substring(...)");
                }
                byte[] decode = android.util.Base64.decode(str2, 0);
                android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p786x600aa8b.e.a(decode, 0, decode.length);
                intent.putExtra("image_url", a17 != null ? zv4.f.f557993a.d(a17, true) : null);
                t17.remove("base64ImageData");
            }
        }
        java.lang.Object obj3 = extras.get("imageUrl");
        java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str3 != null) {
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("(mmecoa\\.qpic\\.cn)|(mmbiz\\.qpic\\.cn)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
            if (compile.matcher(str3).find()) {
                java.util.Map k17 = kz5.c1.k(new jz5.l("dataType", 3), new jz5.l("url", str3));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CircleSearch.ReuseImageInfoForMp", "reuse image info, " + str3 + '}');
                t17.put("reuseImageInfo", k17);
            }
            if (!r26.i0.y(str3, "http", false) || str3.length() > 256) {
                t17.remove("imageUrl");
            }
        }
        if (t17.containsKey("reuseImageInfo")) {
            java.lang.Object obj4 = ((java.util.LinkedHashMap) t17).get("reuseImageInfo");
            java.util.Map map = obj4 instanceof java.util.Map ? (java.util.Map) obj4 : null;
            if (map != null) {
                intent.putExtra("reuse_image_info", java.lang.String.valueOf(ri.l0.a(map)));
            }
            t17.remove("reuseImageInfo");
        }
        intent.putExtra("extras", java.lang.String.valueOf(ri.l0.a(t17)));
        if (context instanceof android.app.Activity) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/websearch/CircleToSearchFeatureService", "enterCircleToSearchUI", "(Landroid/content/Context;IILjava/util/Map;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/feature/websearch/CircleToSearchFeatureService", "enterCircleToSearchUI", "(Landroid/content/Context;IILjava/util/Map;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        intent.addFlags(268435456);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/feature/websearch/CircleToSearchFeatureService", "enterCircleToSearchUI", "(Landroid/content/Context;IILjava/util/Map;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/websearch/CircleToSearchFeatureService", "enterCircleToSearchUI", "(Landroid/content/Context;IILjava/util/Map;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public int Bi(int i17, int i18) {
        if (i18 == 1) {
            return com.p314xaae8f345.mm.R.raw.f79767x4e69e538;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(sg0.c.f489219d, false) ? com.p314xaae8f345.mm.R.raw.f79767x4e69e538 : com.p314xaae8f345.mm.R.raw.f79900xa7cf43ca;
    }

    public java.lang.String Di(int i17, int i18) {
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572774cg4);
        h62.d dVar = (h62.d) e0Var;
        dVar.getClass();
        java.lang.String bj6 = dVar.bj("clicfg_circle_to_search_business_name", string, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bj6, "getExpt(...)");
        return bj6;
    }

    public boolean Ni(int i17, int i18) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0) >= 80212018 && !su4.r2.l()) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(new sg0.d(i17, i18), 0) == 1;
        }
        return false;
    }

    public void Ri(int i17, int i18, tg0.e1 actionType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        Ui(i17, i18, actionType, kz5.q0.f395534d);
    }

    public void Ui(int i17, int i18, tg0.e1 actionType, java.util.Map extras) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extras, "extras");
        java.lang.Object obj = extras.get("searchScene");
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        int i19 = 0;
        int intValue = num != null ? num.intValue() : 0;
        if (intValue <= 0) {
            intValue = zv4.f.f557993a.a(i17);
        }
        int ordinal = actionType.ordinal();
        if (ordinal == 0) {
            this.f489235d = "";
        } else if (ordinal == 1) {
            java.lang.Object obj2 = extras.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            java.lang.String str2 = str != null ? str : "";
            if (str2.length() == 0) {
                str2 = su4.r2.f(intValue);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "genSessionId(...)");
            }
            this.f489235d = str2;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6374x19de00c c6374x19de00c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6374x19de00c();
        c6374x19de00c.f137214d = c6374x19de00c.b("sessionid", this.f489235d, true);
        c6374x19de00c.f137215e = intValue;
        c6374x19de00c.f137216f = i18;
        c6374x19de00c.f137217g = java.lang.System.currentTimeMillis();
        switch (actionType.ordinal()) {
            case 0:
                i19 = 2001;
                break;
            case 1:
                i19 = 3000;
                break;
            case 2:
                i19 = 2000;
                break;
            case 3:
                i19 = 3224;
                break;
            case 4:
                i19 = 6815;
                break;
            case 5:
                i19 = 6816;
                break;
            case 6:
                i19 = 6823;
                break;
        }
        c6374x19de00c.f137218h = i19;
        java.lang.Object obj3 = extras.get("reportInfoFor33399");
        java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str3 != null) {
            c6374x19de00c.f137219i = c6374x19de00c.b("action_value", fp.s0.b(str3, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6), true);
        }
        c6374x19de00c.k();
        su4.k3.m(c6374x19de00c);
    }

    public void wi(android.content.Context context, int i17, int i18, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            Ai(context, i17, i18, kz5.b1.e(new jz5.l("imgPath", str)));
            return;
        }
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
        e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.o3w);
        e4Var.c();
    }
}
