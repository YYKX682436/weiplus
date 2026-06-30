package com.tencent.mm.feature.ecs.nirvana.accessibility;

/* loaded from: classes15.dex */
public class c extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.accessibility.h f65645a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.feature.ecs.nirvana.accessibility.h hVar, android.os.Handler handler) {
        super(handler);
        this.f65645a = hVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17, android.net.Uri uri) {
        com.tencent.mm.feature.ecs.nirvana.accessibility.h hVar = this.f65645a;
        if (hVar.f65701s) {
            return;
        }
        if (android.provider.Settings.Global.getFloat(hVar.f65688f, "transition_animation_scale", 1.0f) == 0.0f) {
            h10.a[] aVarArr = h10.a.f277957d;
            hVar.f65692j |= 4;
        } else {
            h10.a[] aVarArr2 = h10.a.f277957d;
            hVar.f65692j &= -5;
        }
        int i17 = hVar.f65692j;
        com.tencent.mm.feature.ecs.nirvana.accessibility.l lVar = hVar.f65684b;
        lVar.f65713d = i17;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("accessibilityFeatureFlags", i17);
            lVar.d("setAccessibilityFeatures", jSONObject);
        } catch (org.json.JSONException e17) {
            io.flutter.Log.e("AccessibilityChannel", "setAccessibilityFeatures error", e17);
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        onChange(z17, null);
    }
}
