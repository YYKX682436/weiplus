package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e;

/* loaded from: classes15.dex */
public class a implements com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.h f147176a;

    public a(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.h hVar) {
        this.f147176a = hVar;
    }

    public void a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.h hVar = this.f147176a;
        hVar.getClass();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("actions");
        if (optJSONArray != null) {
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                if (optJSONObject != null) {
                    com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.e a17 = hVar.a(optJSONObject.optInt(dm.i4.f66865x76d1ec5a));
                    a17.f147183c = optJSONObject.optInt("overrideId");
                    a17.f147184d = optJSONObject.optString("label");
                    a17.f147185e = optJSONObject.optString("hint");
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.a.b(java.util.List):void");
    }
}
