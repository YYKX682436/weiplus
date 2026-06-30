package com.tencent.mm.feature.ecs.nirvana.accessibility;

/* loaded from: classes15.dex */
public class a implements com.tencent.mm.feature.ecs.nirvana.accessibility.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.accessibility.h f65643a;

    public a(com.tencent.mm.feature.ecs.nirvana.accessibility.h hVar) {
        this.f65643a = hVar;
    }

    public void a(org.json.JSONObject jSONObject) {
        com.tencent.mm.feature.ecs.nirvana.accessibility.h hVar = this.f65643a;
        hVar.getClass();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("actions");
        if (optJSONArray != null) {
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                if (optJSONObject != null) {
                    com.tencent.mm.feature.ecs.nirvana.accessibility.e a17 = hVar.a(optJSONObject.optInt(dm.i4.COL_ID));
                    a17.f65650c = optJSONObject.optInt("overrideId");
                    a17.f65651d = optJSONObject.optString("label");
                    a17.f65652e = optJSONObject.optString("hint");
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0358, code lost:
    
        if (((r11 & 8) != 0 ? 1 : r7) != 0) goto L151;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x036f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.util.List r19) {
        /*
            Method dump skipped, instructions count: 1281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.ecs.nirvana.accessibility.a.b(java.util.List):void");
    }
}
