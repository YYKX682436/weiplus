package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes7.dex */
public final class m0 implements com.p314xaae8f345.mm.p874xaefb6cc9.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f150640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f150641b;

    public m0(p3325xe03a0797.p3326xc267989b.q qVar, java.lang.String str) {
        this.f150640a = qVar;
        this.f150641b = str;
    }

    @Override // com.p314xaae8f345.mm.p874xaefb6cc9.f1
    public void a(com.p314xaae8f345.mm.p874xaefb6cc9.e1 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3325xe03a0797.p3326xc267989b.q qVar = this.f150640a;
        if (result.f150595a) {
            java.lang.String str = result.f150596b;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVA.JsApiOperateWVA", "getPkgPathFromMainProcessSuspend: got pkgPath=" + str);
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(str));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WVA.JsApiOperateWVA", "getPkgPathFromMainProcessSuspend: module not found");
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.io.IOException("pkgPath not found for packageName=" + this.f150641b))));
    }
}
