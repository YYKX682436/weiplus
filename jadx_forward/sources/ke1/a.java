package ke1;

/* loaded from: classes15.dex */
public final class a implements ke1.b {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f388457b = kz5.b1.e(new jz5.l("yaoxingka_kunshan", "com.tencent.mm.kun_shan_yao_xing_ka_enable"));

    /* renamed from: a, reason: collision with root package name */
    public kb.c f388458a;

    @Override // ke1.b
    public he1.k a() {
        try {
            kb.c cVar = this.f388458a;
            if (cVar == null) {
                return new he1.i(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261, "Honor wallet service not available");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.HonorVendor", "getCardList");
            return l(((kb.a) cVar).j());
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "getCardList RemoteException: " + e17.getMessage());
            return new he1.i(10013, "getCardList RemoteException: " + e17.getMessage());
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "getCardList error: " + e18.getMessage());
            return new he1.i(10014, "getCardList failed: " + e18.getMessage());
        }
    }

    @Override // ke1.b
    public he1.k b(he1.f command) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(command, "command");
        java.lang.String str = command.f362405i;
        java.lang.String str2 = command.f362404h;
        java.lang.String str3 = command.f362403g;
        java.lang.String str4 = command.f362400d;
        java.lang.String str5 = command.f362399c;
        try {
            kb.c cVar = this.f388458a;
            if (cVar == null) {
                return new he1.i(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261, "Honor wallet service not available");
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("issuerID", str5);
            hashMap.put("orderNo", str4);
            hashMap.put("operation", str3);
            hashMap.put("sign", command.f362401e);
            hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, command.f362402f);
            boolean z17 = true;
            if (str2.length() > 0) {
                hashMap.put("entrustId", str2);
            }
            if (str.length() > 0) {
                hashMap.put("paymentMode", str);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.HonorVendor", "issueCard, issuerID=" + str5 + ", orderNo=" + str4 + ", operation=" + str3);
            he1.k l17 = l(((kb.a) cVar).k(hashMap));
            if (!(l17 instanceof he1.j)) {
                return l17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.HonorVendor", "issueCard success, querying cardNo via queryTrafficCardInfo");
            he1.k m17 = m(cVar, str5);
            if (!(m17 instanceof he1.j)) {
                if (!(m17 instanceof he1.i)) {
                    throw new jz5.j();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.TransitCard.HonorVendor", "queryCardNoAfterIssue failed: " + ((he1.i) m17).f362416b);
                return l17;
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(((he1.j) l17).f362417a);
                java.lang.String optString = new org.json.JSONObject(((he1.j) m17).f362417a).optString("cardNo", "");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                if (optString.length() <= 0) {
                    z17 = false;
                }
                if (z17) {
                    jSONObject.put("cardNo", optString);
                }
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                return new he1.j(jSONObject2);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "merge cardNo error: " + e17.getMessage());
                return (he1.j) l17;
            }
        } catch (android.os.RemoteException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "issueCard RemoteException: " + e18.getMessage());
            return new he1.i(10013, "issueCard RemoteException: " + e18.getMessage());
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "issueCard error: " + e19.getMessage());
            return new he1.i(10007, "issueCard failed: " + e19.getMessage());
        }
    }

    @Override // ke1.b
    public he1.k c(he1.a command) {
        he1.k iVar;
        android.content.Context context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(command, "command");
        java.util.Map map = f388457b;
        java.lang.String str = command.f362389c;
        java.lang.String str2 = (java.lang.String) map.get(str);
        if (str2 == null) {
            try {
                kb.c cVar = this.f388458a;
                if (cVar == null) {
                    return new he1.i(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261, "Honor wallet service not available");
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("issuerID", str);
                hashMap.put("serviceID", command.c());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.HonorVendor", "checkServiceStatus, params=" + hashMap);
                return l(((kb.a) cVar).d(hashMap));
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "checkServiceStatus RemoteException: " + e17.getMessage());
                return new he1.i(10013, "checkServiceStatus RemoteException: " + e17.getMessage());
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "checkServiceStatus error: " + e18.getMessage());
                return new he1.i(10014, "checkServiceStatus failed: " + e18.getMessage());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.HonorVendor", "checkServiceStatus, issuerID=" + str + " found in metadata map, checking feature via PackageManager");
        try {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "checkFeatureViaMetadata, Honor wallet not installed");
            return new he1.i(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261, "Honor wallet not installed");
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "checkFeatureViaMetadata error: " + e19.getMessage());
            iVar = new he1.i(10014, "checkFeatureViaMetadata failed: " + e19.getMessage());
        }
        if (context == null) {
            return new he1.i(10014, "Application context is null");
        }
        android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.hihonor.wallet", 128);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(applicationInfo, "getApplicationInfo(...)");
        android.os.Bundle bundle = applicationInfo.metaData;
        boolean z17 = bundle != null ? bundle.getBoolean(str2, false) : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.HonorVendor", "checkFeatureViaMetadata, issuerID=" + str + ", metadataKey=" + str2 + ", supported=" + z17);
        if (z17) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("resultCd", 0);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            iVar = new he1.j(jSONObject2);
        } else {
            iVar = new he1.i(10005, "Honor wallet does not support issuerID=" + str + " (metadata=" + str2 + ')');
        }
        return iVar;
    }

    @Override // ke1.b
    public he1.k d() {
        try {
            kb.c cVar = this.f388458a;
            if (cVar == null) {
                return new he1.i(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261, "Honor wallet service not available");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.HonorVendor", "queryCplc");
            return l(((kb.a) cVar).l());
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "queryCplc RemoteException: " + e17.getMessage());
            return new he1.i(10013, "queryCplc RemoteException: " + e17.getMessage());
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "queryCplc error: " + e18.getMessage());
            return new he1.i(10014, "queryCplc failed: " + e18.getMessage());
        }
    }

    @Override // ke1.b
    public he1.k e(he1.g command) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(command, "command");
        java.lang.String str = command.f362411g;
        java.lang.String str2 = command.f362408d;
        java.lang.String str3 = command.f362407c;
        try {
            kb.c cVar = this.f388458a;
            if (cVar == null) {
                return new he1.i(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261, "Honor wallet service not available");
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("issuerID", str3);
            hashMap.put("orderNo", str2);
            hashMap.put("operation", str);
            hashMap.put("sign", command.f362409e);
            hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, command.f362410f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.HonorVendor", "recharge, issuerID=" + str3 + ", orderNo=" + str2 + ", operation=" + str);
            return l(((kb.a) cVar).w(hashMap));
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "recharge RemoteException: " + e17.getMessage());
            return new he1.i(10013, "recharge RemoteException: " + e17.getMessage());
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "recharge error: " + e18.getMessage());
            return new he1.i(10008, "recharge failed: " + e18.getMessage());
        }
    }

    @Override // ke1.b
    public he1.k f(he1.b command) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(command, "command");
        java.lang.String str = command.f362395g;
        java.lang.String str2 = command.f362392d;
        java.lang.String str3 = command.f362391c;
        try {
            kb.c cVar = this.f388458a;
            if (cVar == null) {
                return new he1.i(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261, "Honor wallet service not available");
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("issuerID", str3);
            hashMap.put("orderNo", str2);
            hashMap.put("sign", command.f362393e);
            hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, command.f362394f);
            if (str.length() > 0) {
                hashMap.put("refundAccountNumber", str);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.HonorVendor", "deleteCard, issuerID=" + str3 + ", orderNo=" + str2);
            return l(((kb.a) cVar).e(hashMap));
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "deleteCard RemoteException: " + e17.getMessage());
            return new he1.i(10013, "deleteCard RemoteException: " + e17.getMessage());
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "deleteCard error: " + e18.getMessage());
            return new he1.i(10009, "deleteCard failed: " + e18.getMessage());
        }
    }

    @Override // ke1.b
    public he1.k g(he1.d command) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(command, "command");
        java.lang.String str = command.f362397c;
        try {
            kb.c cVar = this.f388458a;
            if (cVar == null) {
                return new he1.i(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261, "Honor wallet service not available");
            }
            int j17 = j(command.f362398d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.HonorVendor", "queryCardInfo, issuerID=" + str + ", dataType=" + j17);
            he1.k l17 = l(((kb.a) cVar).p(str, j17, "", ""));
            return l17 instanceof he1.j ? new he1.j(k(((he1.j) l17).f362417a)) : l17;
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "queryCardInfo RemoteException: " + e17.getMessage());
            return new he1.i(10013, "queryCardInfo RemoteException: " + e17.getMessage());
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "queryCardInfo error: " + e18.getMessage());
            return new he1.i(10014, "queryCardInfo failed: " + e18.getMessage());
        }
    }

    @Override // ke1.b
    public void h(android.os.IBinder binder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binder, "binder");
        int i17 = kb.b.f387718d;
        android.os.IInterface queryLocalInterface = binder.queryLocalInterface("com.hihonor.wallet.sdk.ISmartcardOpenService");
        this.f388458a = (queryLocalInterface == null || !(queryLocalInterface instanceof kb.c)) ? new kb.a(binder) : (kb.c) queryLocalInterface;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.HonorVendor", "init, binder: " + binder);
    }

    @Override // ke1.b
    public java.lang.String i() {
        return "Honor";
    }

    public final int j(java.util.List list) {
        int i17;
        java.util.Iterator it = list.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            switch (str.hashCode()) {
                case -1367605007:
                    if (str.equals("cardNo")) {
                        i17 = 1;
                        break;
                    }
                    break;
                case -339185956:
                    if (str.equals("balance")) {
                        i17 = 2;
                        break;
                    }
                    break;
                case 473140612:
                    if (str.equals("transactionRecords")) {
                        i17 = 8;
                        break;
                    }
                    break;
                case 1080754660:
                    if (str.equals("validateDate")) {
                        i17 = 4;
                        break;
                    }
                    break;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.TransitCard.HonorVendor", "convertFieldsToDataType, unknown field: ".concat(str));
            i17 = 0;
            i18 |= i17;
        }
        return i18;
    }

    public final java.lang.String k(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            java.lang.Object opt = jSONObject.opt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            if (opt != null) {
                jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, opt);
            }
            java.lang.String jSONObject3 = jSONObject2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject3);
            return jSONObject3;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "extractDataField error: " + e17.getMessage());
            return str;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final he1.k l(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke1.a.l(java.lang.String):he1.k");
    }

    public final he1.k m(kb.c cVar, java.lang.String str) {
        he1.i iVar;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.HonorVendor", "queryCardNoAfterIssue, issuerID=" + str + ", dataType=1");
            return l(((kb.a) cVar).p(str, 1, "", ""));
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "queryCardNoAfterIssue RemoteException: " + e17.getMessage());
            iVar = new he1.i(10013, "queryCardNoAfterIssue RemoteException: " + e17.getMessage());
            return iVar;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.HonorVendor", "queryCardNoAfterIssue error: " + e18.getMessage());
            iVar = new he1.i(10014, "queryCardNoAfterIssue failed: " + e18.getMessage());
            return iVar;
        }
    }

    @Override // ke1.b
    /* renamed from: release */
    public void mo142521x41012807() {
        this.f388458a = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.HonorVendor", "release");
    }
}
