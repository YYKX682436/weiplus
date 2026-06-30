package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class t implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f263991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.u f263992e;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.u uVar, sd.b bVar) {
        this.f263992e = uVar;
        this.f263991d = bVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == (this.f263992e.hashCode() & 65535)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            if (intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("card_list");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (stringExtra == null) {
                    stringExtra = "";
                }
                hashMap.put("card_list", stringExtra);
            }
            sd.b bVar = this.f263991d;
            if (i18 == -1) {
                bVar.d(hashMap);
                return;
            }
            if ((intent != null ? intent.getIntExtra("result_code", 2) : 2) == 2) {
                bVar.b("fail", hashMap);
            } else {
                bVar.b("cancel", hashMap);
            }
        }
    }
}
