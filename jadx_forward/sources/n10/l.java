package n10;

/* loaded from: classes15.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c0 f415576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lc3.a0 f415577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n10.m f415578f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c0 c0Var, lc3.a0 a0Var, n10.m mVar) {
        super(0);
        this.f415576d = c0Var;
        this.f415577e = a0Var;
        this.f415578f = mVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.w wVar = this.f415576d.f147268d;
        n10.k kVar = new n10.k(this.f415578f);
        wVar.getClass();
        lc3.a0 params = this.f415577e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        if (wVar.f147334a != null) {
            java.lang.String optString = params.optString(ya.b.f77491x8758c4e1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TextInputMethodDispatcher", "Received '" + optString + "' message.");
            if (optString != null) {
                boolean z17 = true;
                switch (optString.hashCode()) {
                    case -1779068172:
                        if (optString.equals("TextInput.setPlatformViewClient")) {
                            try {
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                int i17 = jSONObject.getInt("platformViewId");
                                boolean optBoolean = jSONObject.optBoolean("usesVirtualDisplay", false);
                                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler textInputMethodHandler = wVar.f147334a;
                                if (textInputMethodHandler != null) {
                                    textInputMethodHandler.mo44280x9713fa5(i17, optBoolean);
                                }
                                kVar.b(null);
                                break;
                            } catch (org.json.JSONException e17) {
                                kVar.a("error", e17.getMessage(), null);
                                break;
                            }
                        }
                        break;
                    case -1015421462:
                        if (optString.equals("TextInput.setEditingState")) {
                            try {
                                org.json.JSONObject optJSONObject = params.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                                if (optJSONObject == null) {
                                    optJSONObject = new org.json.JSONObject();
                                }
                                optJSONObject.toString();
                                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler textInputMethodHandler2 = wVar.f147334a;
                                if (textInputMethodHandler2 != null) {
                                    textInputMethodHandler2.mo44279x359d2b5b(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState.m138381xb5cb93b2(optJSONObject));
                                }
                                kVar.b(null);
                                break;
                            } catch (org.json.JSONException e18) {
                                kVar.a("error", e18.getMessage(), null);
                                break;
                            }
                        }
                        break;
                    case -37561188:
                        if (optString.equals("TextInput.setClient")) {
                            try {
                                int optInt = params.optInt(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.Columns.f56764x64cb2a26);
                                org.json.JSONObject optJSONObject2 = params.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                                if (optJSONObject2 == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TextInputMethodDispatcher", "TextInput.setClient data null");
                                    optJSONObject2 = new org.json.JSONObject();
                                }
                                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                                jSONObject2.put("inputId", 1);
                                jSONObject2.put("dartWidgetId", 1);
                                jSONObject2.put("elementTag", "");
                                jSONObject2.put("keyboardType", "WxKeyboardType.Text");
                                jSONObject2.put("cursorSpacing", 1);
                                optJSONObject2.put("wxInputConfiguration", jSONObject2);
                                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler textInputMethodHandler3 = wVar.f147334a;
                                if (textInputMethodHandler3 != null) {
                                    textInputMethodHandler3.mo44277x75f4acd(optInt, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration.m138370xb5cb93b2(optJSONObject2));
                                }
                                kVar.b(null);
                                break;
                            } catch (java.lang.NoSuchFieldException e19) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextInputMethodDispatcher", optString + ' ' + e19);
                                kVar.a("error", e19.getMessage(), null);
                                break;
                            } catch (org.json.JSONException e27) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextInputMethodDispatcher", optString + ' ' + e27);
                                kVar.a("error", e27.getMessage(), null);
                                break;
                            }
                        }
                        break;
                    case 270476819:
                        if (optString.equals("TextInput.hide")) {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler textInputMethodHandler4 = wVar.f147334a;
                            if (textInputMethodHandler4 != null) {
                                textInputMethodHandler4.mo44274x30dd42();
                            }
                            kVar.b(null);
                            break;
                        }
                        break;
                    case 270803918:
                        if (optString.equals("TextInput.show")) {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler textInputMethodHandler5 = wVar.f147334a;
                            if (textInputMethodHandler5 != null) {
                                textInputMethodHandler5.mo44282x35dafd();
                            }
                            kVar.b(null);
                            break;
                        }
                        break;
                    case 649192816:
                        if (optString.equals("TextInput.sendAppPrivateCommand")) {
                            try {
                                java.lang.String string = params.getString("action");
                                java.lang.String string2 = params.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                                android.os.Bundle bundle = new android.os.Bundle();
                                if (string2 != null) {
                                    if (string2.length() <= 0) {
                                        z17 = false;
                                    }
                                    if (z17) {
                                        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, string2);
                                    }
                                }
                                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler textInputMethodHandler6 = wVar.f147334a;
                                if (textInputMethodHandler6 != null) {
                                    textInputMethodHandler6.mo44276x9a2d9221(string, bundle);
                                }
                                kVar.b(null);
                                break;
                            } catch (org.json.JSONException e28) {
                                kVar.a("error", e28.getMessage(), null);
                                break;
                            }
                        }
                        break;
                    case 1204752139:
                        if (optString.equals("TextInput.setEditableSizeAndTransform")) {
                            try {
                                org.json.JSONObject optJSONObject3 = params.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                                double d17 = optJSONObject3 != null ? optJSONObject3.getDouble("width") : 0.0d;
                                double d18 = optJSONObject3 != null ? optJSONObject3.getDouble("height") : 0.0d;
                                org.json.JSONArray jSONArray = optJSONObject3 != null ? optJSONObject3.getJSONArray("transform") : null;
                                double[] dArr = new double[16];
                                for (int i18 = 0; i18 < 16; i18++) {
                                    dArr[i18] = jSONArray != null ? jSONArray.getDouble(i18) : 0.0d;
                                }
                                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler textInputMethodHandler7 = wVar.f147334a;
                                if (textInputMethodHandler7 != null) {
                                    textInputMethodHandler7.mo44278x3608b2fc(d17, d18, dArr);
                                }
                                kVar.b(null);
                                break;
                            } catch (org.json.JSONException e29) {
                                kVar.a("error", e29.getMessage(), null);
                                break;
                            }
                        }
                        break;
                    case 1727570905:
                        if (optString.equals("TextInput.finishAutofillContext")) {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler textInputMethodHandler8 = wVar.f147334a;
                            if (textInputMethodHandler8 != null) {
                                textInputMethodHandler8.mo44273xda74508a(false);
                            }
                            kVar.b(null);
                            break;
                        }
                        break;
                    case 1904427655:
                        if (optString.equals("TextInput.clearClient")) {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler textInputMethodHandler9 = wVar.f147334a;
                            if (textInputMethodHandler9 != null) {
                                textInputMethodHandler9.mo44272x85bce878();
                            }
                            kVar.b(null);
                            break;
                        }
                        break;
                    case 2113369584:
                        if (optString.equals("TextInput.requestAutofill")) {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler textInputMethodHandler10 = wVar.f147334a;
                            if (textInputMethodHandler10 != null) {
                                textInputMethodHandler10.mo44275xf01abb61();
                            }
                            kVar.b(null);
                            break;
                        }
                        break;
                }
            }
            kVar.a("error", "notImplemented", null);
        }
        return jz5.f0.f384359a;
    }
}
