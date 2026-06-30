package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* loaded from: classes9.dex */
public class b extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.c f262669a;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.c cVar) {
        this.f262669a = cVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        boolean equals = "com.tencent.mm.gwallet.ACTION_PAY_RESPONSE".equals(action);
        mt4.d dVar = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.c cVar = this.f262669a;
        if (equals) {
            mt4.c cVar2 = cVar.f262677e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f fVar = cVar.f262673a;
            cVar2.getClass();
            int intExtra = intent.getIntExtra("RESPONSE_CODE", 0);
            java.lang.String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
            java.lang.String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
            if (intExtra == 0) {
                java.util.Objects.toString(intent.getExtras());
                if (stringExtra == null || stringExtra2 == null) {
                    cVar2.b("BUG: either purchaseData or dataSignature is null.");
                    nt4.f a17 = nt4.f.a(5);
                    if (fVar != null) {
                        fVar.a(a17, null);
                    }
                } else {
                    try {
                        mt4.e eVar = new mt4.e("inapp", stringExtra, stringExtra2);
                        java.lang.String str = eVar.f412837c;
                        if (fVar != null) {
                            fVar.a(nt4.f.a(0), eVar);
                        }
                        dVar = new mt4.d(str, eVar);
                    } catch (org.json.JSONException e17) {
                        cVar2.b("Failed to parse purchase data.");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IabResolver", e17, "", new java.lang.Object[0]);
                        nt4.f a18 = nt4.f.a(5);
                        if (fVar != null) {
                            fVar.a(a18, null);
                        }
                    }
                }
            } else {
                cVar2.b("Purchase failed. Response: " + intExtra);
                nt4.f a19 = nt4.f.a(intExtra);
                if (fVar != null) {
                    fVar.a(a19, null);
                }
            }
            cVar.f262678f = dVar;
            return;
        }
        if ("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE".equals(action)) {
            boolean booleanExtra = intent.getBooleanExtra("is_direct", true);
            mt4.c cVar3 = cVar.f262677e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.a(this, booleanExtra);
            cVar3.getClass();
            mt4.d dVar2 = new mt4.d();
            int a27 = cVar3.a(intent);
            java.lang.String.valueOf(a27);
            if (a27 != 0) {
                aVar.a(nt4.f.a(a27), null);
                return;
            }
            if (!intent.hasExtra("INAPP_PURCHASE_ITEM_LIST") || !intent.hasExtra("INAPP_PURCHASE_DATA_LIST") || !intent.hasExtra("INAPP_DATA_SIGNATURE_LIST")) {
                cVar3.b("Bundle returned from getPurchases() doesn't contain required fields.");
                aVar.a(nt4.f.a(5), null);
                return;
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("INAPP_PURCHASE_ITEM_LIST");
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("INAPP_PURCHASE_DATA_LIST");
            java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("INAPP_DATA_SIGNATURE_LIST");
            for (int i17 = 0; i17 < stringArrayListExtra2.size(); i17++) {
                try {
                    java.lang.String str2 = stringArrayListExtra2.get(i17);
                    java.lang.String str3 = stringArrayListExtra3.get(i17);
                    stringArrayListExtra.get(i17);
                    mt4.e eVar2 = new mt4.e("inapp", str2, str3);
                    if (android.text.TextUtils.isEmpty(eVar2.f412839e)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.IabResolver", "In-app billing warning: BUG: empty/null token!");
                    }
                    ((java.util.HashMap) dVar2.f412834a).put(eVar2.f412837c, eVar2);
                } catch (org.json.JSONException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IabResolver", e18, "", new java.lang.Object[0]);
                    aVar.a(nt4.f.a(5), dVar2);
                    return;
                }
            }
            aVar.a(nt4.f.a(0), dVar2);
        }
    }
}
