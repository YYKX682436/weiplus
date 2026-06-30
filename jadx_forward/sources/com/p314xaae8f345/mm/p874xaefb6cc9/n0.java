package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f150653d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(java.lang.String str) {
        super(0);
        this.f150653d = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        try {
            android.widget.Toast.makeText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f150653d, 0).show();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WVA.JsApiOperateWVA", "Toast show failed: " + e17.getMessage());
        }
        return jz5.f0.f384359a;
    }
}
