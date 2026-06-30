package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e;

/* loaded from: classes15.dex */
public class c extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.h f147178a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.h hVar, android.os.Handler handler) {
        super(handler);
        this.f147178a = hVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17, android.net.Uri uri) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.h hVar = this.f147178a;
        if (hVar.f147234s) {
            return;
        }
        if (android.provider.Settings.Global.getFloat(hVar.f147221f, "transition_animation_scale", 1.0f) == 0.0f) {
            h10.a[] aVarArr = h10.a.f359490d;
            hVar.f147225j |= 4;
        } else {
            h10.a[] aVarArr2 = h10.a.f359490d;
            hVar.f147225j &= -5;
        }
        int i17 = hVar.f147225j;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.l lVar = hVar.f147217b;
        lVar.f147246d = i17;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("accessibilityFeatureFlags", i17);
            lVar.d("setAccessibilityFeatures", jSONObject);
        } catch (org.json.JSONException e17) {
            io.p3284xd2ae381c.Log.e("AccessibilityChannel", "setAccessibilityFeatures error", e17);
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        onChange(z17, null);
    }
}
