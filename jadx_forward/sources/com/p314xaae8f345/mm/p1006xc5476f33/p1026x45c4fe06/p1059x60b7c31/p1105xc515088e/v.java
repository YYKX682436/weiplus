package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e;

/* loaded from: classes15.dex */
public class v implements tl1.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.x f164291a;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.x xVar) {
        this.f164291a = xVar;
    }

    @Override // tl1.t
    public void a(boolean z17, java.lang.Object obj) {
        int[] iArr = (int[]) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.x xVar = this.f164291a;
        xVar.f501733d.h();
        if (!z17) {
            xVar.d("fail cancel", null);
            return;
        }
        if (iArr == null || iArr.length <= 0) {
            xVar.d("fail error result", null);
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i17 : iArr) {
            jSONArray.put(i17);
        }
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("current", jSONArray);
        xVar.d("ok", hashMap);
    }
}
