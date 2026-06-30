package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* loaded from: classes.dex */
public class v0 implements com.p314xaae8f345.p3210x3857dc.InterfaceC27814x36feca02 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.w0 f264889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264890b;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.w0 w0Var, java.lang.String str) {
        this.f264889a = w0Var;
        this.f264890b = str;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.InterfaceC27814x36feca02
    /* renamed from: onFinishImageBitmapToFile */
    public void mo74348xc230386f(int i17, java.lang.String str, java.lang.String str2, int i18, int i19, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPreviewImgHelper", "onFinishImageBitmapToFile result %d", java.lang.Integer.valueOf(i17));
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.x0.f264895c) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1059L, i17 == 0 ? 0L : 1L, 1L, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.w0 w0Var = this.f264889a;
        if (i17 != 0) {
            if (w0Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.o1) w0Var).a();
            }
        } else {
            ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.x0.f264896d).put(this.f264890b, str2);
            if (w0Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.o1) w0Var).b();
            }
        }
    }
}
