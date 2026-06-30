package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/q6;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "mb-impl_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
final class q6 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r callback) {
        android.os.Bundle data = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        int i17 = data.getInt("appStatus", 0);
        long j17 = data.getLong("processStartTime", 0L);
        java.lang.String string = data.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "");
        if (i17 != 0 && j17 != 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            if (!(string.length() == 0)) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushPreloadFeatureService", "preload scene " + string + " cost " + elapsedRealtime + " with appStatus " + i17);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, string);
                jSONObject.put("appStatus", i17);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                je3.i.x2(je3.k.f380831e, "PreloadMBDone", (int) elapsedRealtime, r26.i0.u(jSONObject2, ',', ';', false, 4, null), 0.0f, 8, null);
                bf3.g0.f101160a.a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushPreloadFeatureService", "preload done, mark preload scene");
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229369a) {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229377i.length() == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229377i = string;
                    }
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushPreloadFeatureService", "preload mb error");
    }
}
