package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class m2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f163466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f163467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3 f163468c;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3 e3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f163468c = e3Var;
        this.f163466a = lVar;
        this.f163467b = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        java.lang.String jSONArray;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12161x45420d65 c12161x45420d65 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12161x45420d65) abstractC11888x1a859600;
        if (this.f163466a.mo48798x74292566() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(this.f163466a.mo48798x74292566()).f167246f = false;
        }
        if (c12161x45420d65 == null) {
            this.f163466a.a(this.f163467b, this.f163468c.o("fail"));
            return;
        }
        int i17 = c12161x45420d65.f163165d;
        if (i17 != -1) {
            if (i17 != 0) {
                this.f163466a.a(this.f163467b, this.f163468c.o("fail"));
                return;
            } else {
                this.f163466a.a(this.f163467b, this.f163468c.o("cancel"));
                return;
            }
        }
        java.util.ArrayList arrayList = c12161x45420d65.f163166e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseImage", "onActivityResult, result list is null or nil");
            this.f163466a.a(this.f163467b, this.f163468c.o("fail"));
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList.size());
        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe c11693xc4fcf5fe = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe) it.next();
            if (c11693xc4fcf5fe != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11693xc4fcf5fe.f157635d)) {
                arrayList2.add(c11693xc4fcf5fe.f157635d);
                arrayList3.add(java.lang.Long.valueOf(c11693xc4fcf5fe.f157640i));
                arrayList4.add(c11693xc4fcf5fe.f157636e);
            }
        }
        if (arrayList2.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseImage", "data is null");
            jSONArray = null;
        } else {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                jSONArray2.put(arrayList2.get(i18));
            }
            jSONArray = jSONArray2.toString();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseImage", "onActivityResult, localIds json list string = %s", jSONArray);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("tempFilePaths", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3.C(arrayList2));
        hashMap.put("tempFileSizes", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3.C(arrayList3));
        if (z65.c.a()) {
            hashMap.put("__realPaths", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3.C(arrayList4));
        }
        this.f163466a.a(this.f163467b, this.f163468c.p("ok", hashMap));
    }
}
