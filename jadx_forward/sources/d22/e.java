package d22;

/* loaded from: classes12.dex */
public final class e implements d22.p {
    @Override // d22.p
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 b(d22.v context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            return ((d22.d) context).f307366q;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.emoji.MMEmoticonBrowsePageCreator", th6, "unable to cast browseContext", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // d22.p
    public java.lang.String c() {
        return "EmotionMsgBrowseLogicData";
    }

    @Override // d22.p
    public java.lang.String d(d22.v context) {
        java.lang.String str = "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            d22.d dVar = (d22.d) context;
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = dVar.f307364o;
            if (c21053xdbf1e5f4 != null) {
                r45.ri0 ri0Var = new r45.ri0();
                if (c21053xdbf1e5f4 != null) {
                    ri0Var.f466419d = c21053xdbf1e5f4.mo42933xb5885648();
                    ri0Var.f466425m = c21053xdbf1e5f4.f68663x861009b5;
                    ri0Var.f466422g = c21053xdbf1e5f4.f68657xb76d85ab;
                    ri0Var.f466428p = c21053xdbf1e5f4.f68641x3342accf;
                    ri0Var.f466429q = c21053xdbf1e5f4.f68646xa8f07416;
                    ri0Var.f466430r = c21053xdbf1e5f4.f68644xbc38602c;
                    ri0Var.f466420e = c21053xdbf1e5f4.f68654xf47770e7;
                    ri0Var.f466424i = c21053xdbf1e5f4.f68642xf11e6e15;
                    ri0Var.f466427o = c21053xdbf1e5f4.f68660x7650f4b9;
                    ri0Var.f466426n = c21053xdbf1e5f4.f68661x765114aa;
                    ri0Var.f466423h = c21053xdbf1e5f4.f68659x5efe714f;
                    ri0Var.f466433u = c21053xdbf1e5f4.f68670x419d19a;
                    ri0Var.f466431s = c21053xdbf1e5f4.f68669x3e1919e;
                    ri0Var.f466421f = c21053xdbf1e5f4.f68686x7b284d5e;
                    ri0Var.f466434v = c21053xdbf1e5f4.H2;
                }
                str = android.util.Base64.encodeToString(ri0Var.mo14344x5f01b1f6(), 2);
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("emojiInfo", str);
            linkedHashMap.put("emotionScene", java.lang.Integer.valueOf(dVar.f445688a));
            linkedHashMap.put("requestID", dVar.c());
            linkedHashMap.put("enterTime", java.lang.Long.valueOf(dVar.f445691d));
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = dVar.f307364o;
            if (c21053xdbf1e5f42 != null) {
                if (c21053xdbf1e5f42.f68683x1d5dc4d == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.MMEmoticonBrowsePageCreator", "has uniquestore " + c21053xdbf1e5f42.mo42933xb5885648());
                }
                if (c21053xdbf1e5f42.f68683x1d5dc4d == 1 && android.text.TextUtils.isEmpty(c21053xdbf1e5f42.f68657xb76d85ab)) {
                    linkedHashMap.put("storeUnique", 1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.MMEmoticonBrowsePageCreator", "uniquestore liteapp " + c21053xdbf1e5f42.mo42933xb5885648());
                }
            }
            java.lang.String gVar = new cl0.g(linkedHashMap).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
            return gVar;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.emoji.MMEmoticonBrowsePageCreator", th6, "unable to cast browseContext", new java.lang.Object[0]);
            return "";
        }
    }

    @Override // d22.p
    public java.lang.String e() {
        return "pages/view/emoticon";
    }

    @Override // d22.p
    public void f(d22.v liteAppContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppContext, "liteAppContext");
    }

    @Override // d22.p
    public java.lang.Object g(d22.v context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!(context instanceof d22.d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.MMEmoticonBrowsePageCreator", "unable to cast browseContext");
            return null;
        }
        d22.d dVar = (d22.d) context;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = dVar.f307364o;
        if (c21053xdbf1e5f4 == null) {
            return null;
        }
        d22.k0 k0Var = new d22.k0(c21053xdbf1e5f4);
        k0Var.f445756a = dVar.f445688a;
        k0Var.f445759d = java.lang.String.valueOf(dVar.f307365p);
        k0Var.f445757b = dVar.f307364o;
        k0Var.f445758c = dVar.f445540i;
        java.lang.String str = dVar.f445544m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        k0Var.f445761f = str;
        k0Var.f445762g = dVar.f445541j;
        java.lang.String str2 = dVar.f445542k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
        k0Var.f445763h = str2;
        k0Var.f445760e = dVar.f445543l;
        return k0Var;
    }

    @Override // d22.p
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s i(d22.v context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
        if (!(context instanceof d22.d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.MMEmoticonBrowsePageCreator", "unable to cast browseContext");
            return sVar;
        }
        d22.d dVar = (d22.d) context;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = dVar.f307364o;
        if (c21053xdbf1e5f4 != null) {
            d22.k0 k0Var = new d22.k0(c21053xdbf1e5f4);
            k0Var.f445756a = dVar.f445688a;
            k0Var.f445759d = java.lang.String.valueOf(dVar.f307365p);
            k0Var.f445757b = dVar.f307364o;
            k0Var.f445758c = dVar.f445540i;
            java.lang.String str = dVar.f445544m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            k0Var.f445761f = str;
            k0Var.f445762g = dVar.f445541j;
            java.lang.String str2 = dVar.f445542k;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
            k0Var.f445763h = str2;
            k0Var.f445760e = dVar.f445543l;
            sVar.f225700d = k0Var;
        }
        return sVar;
    }

    @Override // d22.p
    public java.lang.String j() {
        return "wxalite70a1e8c60370e23abcc1bde4e2c32f6f";
    }

    @Override // d22.p
    public void k(android.content.Context viewContext, d22.v liteAppContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewContext, "viewContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppContext, "liteAppContext");
    }

    @Override // d22.p
    public boolean l() {
        return false;
    }

    @Override // d22.p
    public boolean n(d22.v context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return true;
    }
}
