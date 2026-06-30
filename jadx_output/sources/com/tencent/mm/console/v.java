package com.tencent.mm.console;

/* loaded from: classes2.dex */
public class v implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f64848d;

    public v(android.content.Context context) {
        this.f64848d = context;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (2812 == m1Var.getType()) {
            gm0.j1.d().q(2812, this);
            e12.a aVar = (e12.a) m1Var;
            dp.a.makeText(this.f64848d, "errType:" + i17 + ", errCode:" + i18 + ", coupon ret_code:" + aVar.f246404f + ", coupon ret_msg:" + aVar.f246405g + ".", 1).show();
        }
    }
}
