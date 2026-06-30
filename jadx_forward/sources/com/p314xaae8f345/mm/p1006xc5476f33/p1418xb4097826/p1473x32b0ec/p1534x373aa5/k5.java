package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes8.dex */
public final class k5 implements kk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14318x9be987f2 f197972a;

    public k5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14318x9be987f2 c14318x9be987f2) {
        this.f197972a = c14318x9be987f2;
    }

    @Override // kk1.c
    public final void a(java.lang.String str) {
        android.content.Context context = this.f197972a.getContext();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("forceHideShare", true);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
