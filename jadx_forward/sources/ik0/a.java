package ik0;

/* loaded from: classes5.dex */
public final class a implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2846x2d42a4c9.InterfaceC23051x331e1551 {
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2846x2d42a4c9.InterfaceC23051x331e1551
    /* renamed from: getAutoFillContent */
    public void mo84679x78bdb611(com.p314xaae8f345.p2845xc516c4b6.p2846x2d42a4c9.EnumC23048xd3f9f64c type, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InputBarPlugin", "getAutoFillContent type: " + type + ", not supported on Android");
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.UnsupportedOperationException("AutoFill type " + type + " not supported on Android")))));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2846x2d42a4c9.InterfaceC23051x331e1551
    /* renamed from: loadShortbarEmojis */
    public java.util.List mo84680x1773246a(java.lang.String configName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configName, "configName");
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("IMEmoji");
        if (d17 == null) {
            d17 = "";
        }
        if (d17.length() == 0) {
            return kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONObject(d17).getJSONArray(configName);
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                arrayList.add(jSONArray.get(i17).toString());
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.InputBarPlugin", "loadShortbarEmojis failed to parse json from string: ".concat(d17));
            arrayList.clear();
        }
        return arrayList;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InputBarPlugin", "on attached to engine");
        com.p314xaae8f345.p2845xc516c4b6.p2846x2d42a4c9.InterfaceC23051x331e1551.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2846x2d42a4c9.InterfaceC23051x331e1551.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2846x2d42a4c9.InterfaceC23051x331e1551.Companion.m84682x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InputBarPlugin", "on detached from engine");
    }
}
