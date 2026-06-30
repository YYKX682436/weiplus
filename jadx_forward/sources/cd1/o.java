package cd1;

/* loaded from: classes15.dex */
public class o {

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f122172l = {0, 0};

    /* renamed from: m, reason: collision with root package name */
    public static long f122173m = -1;

    /* renamed from: n, reason: collision with root package name */
    public static final cd1.o f122174n;

    /* renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f122176b;

    /* renamed from: c, reason: collision with root package name */
    public int f122177c;

    /* renamed from: j, reason: collision with root package name */
    public android.os.ResultReceiver f122184j;

    /* renamed from: k, reason: collision with root package name */
    public android.nfc.cardemulation.HostApduService f122185k;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f122175a = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f122178d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f122179e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f122180f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f122181g = false;

    /* renamed from: h, reason: collision with root package name */
    public final fd1.a f122182h = new cd1.m(this, null);

    /* renamed from: i, reason: collision with root package name */
    public final fd1.b f122183i = new cd1.n(this, null);

    static {
        f122174n = null;
        f122174n = new cd1.o();
    }

    public static void a(cd1.o oVar, byte[] bArr, boolean z17, android.nfc.cardemulation.HostApduService hostApduService) {
        synchronized (oVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEServiceMgr", "HCECOMMAND sendResponseCommandToSystem isDefaultCommand: %b, hasCommandNotResponded: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(oVar.f122179e));
            if (oVar.f122179e) {
                oVar.f122179e = false;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEServiceMgr", "HCECOMMAND send response command time: %d, cost: %d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(currentTimeMillis - f122173m));
                if (hostApduService != null) {
                    hostApduService.sendResponseApdu(bArr);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HCEServiceMgr", "sendResponseCommandToSystem hceService is null");
                }
                if (z17) {
                    java.lang.String str = oVar.f122175a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEReportManager", "reportHCEtimeExceeded appId: %s", str);
                    ((ch1.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c.class, true))).b(14838, str);
                }
            }
        }
    }

    public void b(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("key_time_limit", 1500);
        this.f122177c = intExtra;
        if (intExtra < 1500) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEServiceMgr", "HCEService timeLimit: %d smaller than: %d and set a valid value", java.lang.Integer.valueOf(intExtra), 1500);
            this.f122177c = 1500;
        }
        int i17 = this.f122177c;
        if (i17 > 60000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEServiceMgr", "HCEService timeLimit: %d, bigger than: %d and set a valid value", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8));
            this.f122177c = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEServiceMgr", "HCEService valid timeLimit: %d", java.lang.Integer.valueOf(this.f122177c));
    }

    public void c(int i17, java.lang.String str, android.os.Bundle bundle) {
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEServiceMgr", "genCallHCEService type = %d", java.lang.Integer.valueOf(i17));
        if (i17 == 13) {
            h();
            android.nfc.cardemulation.HostApduService hostApduService = this.f122185k;
            if (hostApduService != null) {
                hostApduService.stopSelf();
                return;
            }
            return;
        }
        fd1.a aVar = this.f122182h;
        if (i17 == 31) {
            if (aVar != null) {
                java.lang.String string = bundle.getString("key_apdu_command");
                cd1.m mVar = (cd1.m) aVar;
                mVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEServiceMgr", "HCECOMMAND send to AppBrand, appId: %s, command: %s", str, string);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HCEServiceMgr", "HCECOMMAND invalid appId or command when send request command to AppBrand");
                    return;
                }
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("key_apdu_command", string);
                cd1.o oVar = mVar.f122170a;
                oVar.g(str, 31, bundle2);
                oVar.f122179e = true;
                if (!oVar.f122180f) {
                    oVar.f122180f = true;
                    oVar.f122181g = false;
                    f122173m = java.lang.System.currentTimeMillis();
                    ik1.h0.a().b(new cd1.l(mVar), oVar.f122177c);
                    return;
                }
                if (oVar.f122181g) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HCEServiceMgr", "HCECOMMAND TimeExceeded, just return default command");
                    a(oVar, f122172l, true, oVar.f122185k);
                    oVar.f122181g = false;
                    return;
                }
                return;
            }
            return;
        }
        if (i17 != 32) {
            fd1.b bVar = this.f122183i;
            switch (i17) {
                case 21:
                    if (bVar != null) {
                        ((cd1.n) bVar).getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEServiceMgr", "HCELifeCycle AppBrandUI onCreate");
                        return;
                    }
                    return;
                case 22:
                    if (bVar != null) {
                        cd1.n nVar = (cd1.n) bVar;
                        nVar.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEServiceMgr", "HCELifeCycle AppBrandUI onResume");
                        cd1.o oVar2 = nVar.f122171a;
                        if (oVar2.f122178d) {
                            oVar2.f();
                            oVar2.f122178d = false;
                            return;
                        }
                        return;
                    }
                    return;
                case 23:
                    if (bVar != null) {
                        cd1.n nVar2 = (cd1.n) bVar;
                        nVar2.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEServiceMgr", "HCELifeCycle AppBrandUI onPause");
                        cd1.o oVar3 = nVar2.f122171a;
                        oVar3.h();
                        oVar3.f122178d = true;
                        return;
                    }
                    return;
                case 24:
                    if (bVar != null) {
                        ((cd1.n) bVar).getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEServiceMgr", "HCELifeCycle AppBrandUI onDestroy");
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        if (aVar != null) {
            java.lang.String string2 = bundle.getString("key_apdu_command");
            cd1.o oVar4 = ((cd1.m) aVar).f122170a;
            java.lang.String str3 = oVar4.f122175a;
            if (str3 == null || !str3.equals(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HCEServiceMgr", "HCECOMMAND not the same appId, or invalid response command, mAppId: %s, appId: %s, responseCommand: %s", oVar4.f122175a, str, string2);
                return;
            }
            byte[] decode = android.util.Base64.decode(string2, 2);
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = str;
            objArr[1] = string2;
            java.util.regex.Pattern pattern = cd1.p.f122186a;
            if (decode == null || decode.length == 0) {
                str2 = "";
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                for (byte b17 : decode) {
                    int i18 = b17 & 15;
                    int i19 = 48;
                    int i27 = i18 + (i18 < 10 ? 48 : 55);
                    int i28 = (b17 & 240) >> 4;
                    if (i28 >= 10) {
                        i19 = 55;
                    }
                    sb6.append(i28 + i19);
                    sb6.append(i27);
                }
                str2 = sb6.toString();
            }
            objArr[2] = str2;
            objArr[3] = java.lang.Boolean.valueOf(oVar4.f122179e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEServiceMgr", "HCECOMMAND response from AppBrand, appId: %s, command in base64: %s, send to system: %s, hasCommandNotResponded: %b", objArr);
            a(oVar4, decode, false, oVar4.f122185k);
        }
    }

    public java.util.List d(android.content.Context context) {
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(context);
        if (defaultAdapter != null) {
            return android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter).getAidsForService(new android.content.ComponentName(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.hce.C12193x5bbe54ab.class), "payment");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HCEServiceMgr", "NfcAdapter is null when get registered aid list");
        return new java.util.ArrayList();
    }

    public void e(boolean z17) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (z17) {
            bundle.putInt("errCode", 0);
            bundle.putString("errMsg", "");
        } else {
            bundle.putInt("errCode", 13006);
            bundle.putString("errMsg", "register aids failed");
        }
        g(this.f122175a, 12, bundle);
    }

    public void f() {
        android.nfc.cardemulation.HostApduService hostApduService;
        if (this.f122176b == null || (hostApduService = this.f122185k) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HCEServiceMgr", "mAidList is null, or mHceService is null fail to register");
            return;
        }
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(hostApduService);
        if (defaultAdapter == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HCEServiceMgr", "NfcAdapter is null when register aids");
            return;
        }
        android.nfc.cardemulation.CardEmulation cardEmulation = android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter);
        if (cardEmulation != null) {
            try {
                android.nfc.cardemulation.HostApduService hostApduService2 = this.f122185k;
                android.content.ComponentName componentName = new android.content.ComponentName(hostApduService2, hostApduService2.getClass());
                boolean registerAidsForService = cardEmulation.registerAidsForService(componentName, "payment", this.f122176b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEServiceMgr", "register aids result: %b", java.lang.Boolean.valueOf(registerAidsForService));
                if (!registerAidsForService) {
                    e(false);
                    return;
                }
                e(true);
                java.util.List<java.lang.String> aidsForService = cardEmulation.getAidsForService(componentName, "payment");
                if (aidsForService == null || aidsForService.size() <= 0) {
                    return;
                }
                for (int i17 = 0; i17 < aidsForService.size(); i17++) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HCEServiceMgr", "dynamicAIDList aid=" + aidsForService.get(i17));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HCEServiceMgr", e17, "HCEService register aid exception", new java.lang.Object[0]);
                e(false);
            }
        }
    }

    public void g(java.lang.String str, int i17, android.os.Bundle bundle) {
        bundle.putString("key_appid", str);
        bundle.putInt("key_event_type", i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEServiceMgr", "HCE EVENT mm to AppBrand");
        android.os.ResultReceiver resultReceiver = this.f122184j;
        if (resultReceiver != null) {
            resultReceiver.send(10002, bundle);
        }
    }

    public void h() {
        android.nfc.cardemulation.CardEmulation cardEmulation;
        java.util.ArrayList arrayList;
        android.nfc.cardemulation.HostApduService hostApduService = this.f122185k;
        if (hostApduService == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HCEServiceMgr", "mHceService is null fail to unregisterAids");
            return;
        }
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(hostApduService);
        if (defaultAdapter == null || (cardEmulation = android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter)) == null) {
            return;
        }
        java.util.List<java.lang.String> d17 = d(this.f122185k);
        if (d17 != null && (arrayList = this.f122176b) != null) {
            d17.removeAll(arrayList);
            if (!d17.isEmpty()) {
                android.nfc.cardemulation.HostApduService hostApduService2 = this.f122185k;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEServiceMgr", "register with merged AID result: %b", java.lang.Boolean.valueOf(cardEmulation.registerAidsForService(new android.content.ComponentName(hostApduService2, hostApduService2.getClass()), "payment", d17)));
                return;
            }
        }
        android.nfc.cardemulation.HostApduService hostApduService3 = this.f122185k;
        android.content.ComponentName componentName = new android.content.ComponentName(hostApduService3, hostApduService3.getClass());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEServiceMgr", "HCEService unregister aids");
        cardEmulation.removeAidsForService(componentName, "payment");
    }
}
