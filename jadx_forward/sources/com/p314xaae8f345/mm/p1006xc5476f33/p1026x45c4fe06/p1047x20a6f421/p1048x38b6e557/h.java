package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557;

/* loaded from: classes5.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.o f159207d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.o oVar) {
        super(0);
        this.f159207d = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.type = android.os.Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        layoutParams.format = 1;
        layoutParams.packageName = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageName();
        layoutParams.flags = 196904;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 51;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.o oVar = this.f159207d;
        android.graphics.Point point = new android.graphics.Point(oVar.b().getMinimumWidth(), oVar.b().getMinimumHeight());
        layoutParams.x = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.o.a(oVar).x - point.x;
        layoutParams.y = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.o.a(oVar).y - point.y) - ((java.lang.Number) ((jz5.n) oVar.f159232d).mo141623x754a37bb()).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConsolePrintControlFloatWindow", "init#layoutParams, screenSize: " + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.o.a(oVar) + ", guestedViewSize: " + point + ", x: " + layoutParams.x + ", y: " + layoutParams.y);
        return layoutParams;
    }
}
