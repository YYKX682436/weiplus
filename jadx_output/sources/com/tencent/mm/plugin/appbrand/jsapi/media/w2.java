package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class w2 implements kotlin.coroutines.Continuation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.x2 f82111d;

    public w2(com.tencent.mm.plugin.appbrand.jsapi.media.x2 x2Var) {
        this.f82111d = x2Var;
    }

    @Override // kotlin.coroutines.Continuation
    public oz5.l getContext() {
        return oz5.m.f350329d;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object obj) {
        java.util.HashSet hashSet;
        boolean z17 = obj instanceof qc0.m1;
        com.tencent.mm.plugin.appbrand.jsapi.media.x2 x2Var = this.f82111d;
        if (!z17) {
            com.tencent.mm.plugin.appbrand.jsapi.media.d3 d3Var = x2Var.f82126d;
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult jsApiChooseImage$ChooseResult = d3Var.f81760e;
            jsApiChooseImage$ChooseResult.f81632d = 0;
            d3Var.finishProcess(jsApiChooseImage$ChooseResult);
            return;
        }
        qc0.m1 m1Var = (qc0.m1) obj;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_new_sight_media_opt_code", m1Var.f361412c);
        intent.putExtra("key_new_sight_image_path", m1Var.a() != null ? m1Var.a().f361396b : null);
        x2Var.f82126d.mmOnActivityResult(4, m1Var.f361411b, intent);
        hashSet = x2Var.f82126d.f81769q;
        hashSet.add(java.lang.Integer.valueOf(m1Var.f361410a));
    }
}
