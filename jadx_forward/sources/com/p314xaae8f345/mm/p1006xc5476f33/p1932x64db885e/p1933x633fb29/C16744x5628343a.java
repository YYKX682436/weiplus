package com.p314xaae8f345.mm.p1006xc5476f33.p1932x64db885e.p1933x633fb29;

/* renamed from: com.tencent.mm.plugin.nfc_open.model.ApduEngineFuncListener */
/* loaded from: classes8.dex */
public class C16744x5628343a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5159xfddea0d4> {
    public C16744x5628343a() {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f39173x3fe91575 = 1620532420;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5159xfddea0d4 c5159xfddea0d4) {
        am.o oVar;
        java.lang.String jSONObject;
        org.json.JSONObject jSONObject2;
        boolean b17;
        java.lang.String[] strArr;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5159xfddea0d4 c5159xfddea0d42 = c5159xfddea0d4;
        int i17 = 0;
        if (!(c5159xfddea0d42 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5159xfddea0d4) || (oVar = c5159xfddea0d42.f135508g) == null) {
            return false;
        }
        int i18 = oVar.f89026a;
        android.content.Context context = oVar.f89027b;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (i18 != 4008) {
            am.o oVar2 = c5159xfddea0d42.f135508g;
            switch (i18) {
                case 4001:
                    bundle.putInt("status", yn3.a.c().d(context));
                    break;
                case 4002:
                    int a17 = yn3.a.c().a(context);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApduEngineFuncListener", "NFC connect status: %d", java.lang.Integer.valueOf(a17));
                    bundle.putInt("status", a17);
                    break;
                case com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7529x7d0fa359 /* 4003 */:
                    java.lang.String str = oVar2.f89028c;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        try {
                            wn3.a aVar = new wn3.a(str);
                            yn3.a c17 = yn3.a.c();
                            c17.getClass();
                            xn3.a aVar2 = new xn3.a(1, "def", aVar);
                            c17.b(aVar2);
                            bundle.putString("result", aVar2.f537128g.m174178x9616526c());
                            break;
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ApduEngineFuncListener", "alex: execute nfc command exception");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ApduEngineFuncListener", e17, "", new java.lang.Object[0]);
                            bundle.putString("result", null);
                            break;
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ApduEngineFuncListener", "[NFC] transceive apdu is null");
                        break;
                    }
                case com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7532x3a129d88 /* 4004 */:
                    try {
                        java.lang.String str2 = oVar2.f89028c;
                        boolean z17 = oVar2.f89029d;
                        boolean z18 = oVar2.f89030e;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ApduEngineFuncListener", "[NFC] transceive apdu is null");
                            break;
                        } else {
                            java.lang.String[] split = str2.split("\\|");
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            int length = split.length;
                            int i19 = 0;
                            while (i19 < length) {
                                java.lang.String str3 = split[i19];
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ApduEngineFuncListener", "[NFC] batch transceive apduStr is null");
                                    strArr = split;
                                } else {
                                    java.lang.String[] split2 = str3.split(":");
                                    if (split2 != null && split2.length >= 2) {
                                        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split2[i17], i17);
                                        strArr = split;
                                        arrayList.add(new xn3.a(P, java.lang.String.valueOf(P), new wn3.a(split2[1])));
                                    }
                                    strArr = split;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ApduEngineFuncListener", "[NFC] transceive apdu's size is wrong");
                                }
                                i19++;
                                split = strArr;
                                i17 = 0;
                            }
                            yn3.a c18 = yn3.a.c();
                            c18.getClass();
                            java.util.Iterator it = arrayList.iterator();
                            while (it.hasNext() && (((b17 = c18.b((xn3.a) it.next())) || !z17) && (!b17 || !z18))) {
                            }
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            java.util.Iterator it6 = arrayList.iterator();
                            while (it6.hasNext()) {
                                xn3.a aVar3 = (xn3.a) it6.next();
                                if (aVar3.f537128g == null) {
                                    bundle.putString("result", sb6.toString());
                                    break;
                                } else {
                                    sb6.append(aVar3.f537125d);
                                    sb6.append(":");
                                    sb6.append(aVar3.f537128g.m174178x9616526c());
                                    sb6.append("|");
                                }
                            }
                            bundle.putString("result", sb6.toString());
                        }
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ApduEngineFuncListener", "alex: execute nfc command exception");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ApduEngineFuncListener", e18, "", new java.lang.Object[0]);
                        bundle.putString("result", null);
                        break;
                    }
                    break;
                case com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7528x16eb0541 /* 4005 */:
                    bundle.putString(dm.i4.f66865x76d1ec5a, zn3.a.a(yn3.a.c().f537130b));
                    break;
            }
        } else {
            yn3.a c19 = yn3.a.c();
            if (c19.f537129a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ApduEngine", "lo-nfc-getInfo: tag null");
                jSONObject = null;
            } else {
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                ((java.util.HashSet) c19.f545547c).size();
                java.util.Iterator it7 = ((java.util.HashSet) c19.f545547c).iterator();
                while (it7.hasNext()) {
                    java.lang.String str4 = (java.lang.String) it7.next();
                    try {
                        if (str4.equals(android.nfc.tech.NfcA.class.getName())) {
                            jSONObject3.put(android.nfc.tech.NfcA.class.getSimpleName(), yn3.c.d(c19.f537129a));
                        } else if (str4.equals(android.nfc.tech.IsoDep.class.getName())) {
                            android.nfc.tech.IsoDep isoDep = android.nfc.tech.IsoDep.get(c19.f537129a);
                            if (isoDep == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ApduEngineIsoDep", "lo-nfc-getInfoJsonObject: get IsoDep null");
                                jSONObject2 = null;
                            } else {
                                jSONObject2 = new org.json.JSONObject();
                                jSONObject2.put("hiLayerResponse", zn3.a.a(isoDep.getHiLayerResponse()));
                                jSONObject2.put("historicalBytes", zn3.a.a(isoDep.getHistoricalBytes()));
                            }
                            jSONObject3.put(android.nfc.tech.IsoDep.class.getSimpleName(), jSONObject2);
                        }
                    } catch (org.json.JSONException e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ApduEngine", "lo-nfc-getInfo: exp:+" + e19.getLocalizedMessage());
                        jSONObject = jSONObject3.toString();
                    }
                }
                java.lang.System.currentTimeMillis();
                jSONObject3.toString();
                jSONObject = jSONObject3.toString();
            }
            bundle.putString("info", jSONObject);
        }
        c5159xfddea0d42.f135509h.f89121a = bundle;
        return false;
    }
}
