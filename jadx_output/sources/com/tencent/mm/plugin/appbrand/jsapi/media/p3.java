package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class p3 implements kotlin.coroutines.Continuation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.y3 f81990d;

    public p3(com.tencent.mm.plugin.appbrand.jsapi.media.y3 y3Var) {
        this.f81990d = y3Var;
    }

    @Override // kotlin.coroutines.Continuation
    public oz5.l getContext() {
        return oz5.m.f350329d;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult2;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult3;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult4;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult5;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult6;
        boolean z17 = obj instanceof qc0.m1;
        com.tencent.mm.plugin.appbrand.jsapi.media.y3 y3Var = this.f81990d;
        if (!z17) {
            jsApiChooseMedia$ChooseResult = y3Var.f82147d;
            jsApiChooseMedia$ChooseResult.f81647d = -2;
            jsApiChooseMedia$ChooseResult2 = y3Var.f82147d;
            y3Var.finishProcess(jsApiChooseMedia$ChooseResult2);
            return;
        }
        qc0.m1 m1Var = (qc0.m1) obj;
        y3Var.f82154n = m1Var.f361410a;
        int i17 = m1Var.f361411b;
        if (i17 == 0) {
            jsApiChooseMedia$ChooseResult5 = y3Var.f82147d;
            jsApiChooseMedia$ChooseResult5.f81647d = 0;
            jsApiChooseMedia$ChooseResult6 = y3Var.f82147d;
            y3Var.finishProcess(jsApiChooseMedia$ChooseResult6);
            return;
        }
        if (i17 != -1 || m1Var.f361412c != 0) {
            jsApiChooseMedia$ChooseResult3 = y3Var.f82147d;
            jsApiChooseMedia$ChooseResult3.f81647d = -2;
            jsApiChooseMedia$ChooseResult4 = y3Var.f82147d;
            y3Var.finishProcess(jsApiChooseMedia$ChooseResult4);
            return;
        }
        qc0.l1 a17 = m1Var.a();
        boolean a18 = a17.a();
        java.lang.String str = a17.f361396b;
        if (a18) {
            y3Var.Y(str, new android.content.Intent());
        } else {
            y3Var.X(str, a17.f361397c);
        }
    }
}
