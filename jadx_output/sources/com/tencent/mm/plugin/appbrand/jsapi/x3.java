package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class x3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f83903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.b4 f83904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f83905f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(yz5.l lVar, com.tencent.mm.plugin.appbrand.jsapi.b4 b4Var, yz5.l lVar2) {
        super(1);
        this.f83903d = lVar;
        this.f83904e = b4Var;
        this.f83905f = lVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        r45.gh ghVar = (r45.gh) obj;
        yz5.l lVar = this.f83903d;
        if (ghVar == null) {
            lVar.invoke("get contact fail response is null");
        } else {
            k91.w5.f305813b.getClass();
            try {
                byte[] byteArray = ghVar.toByteArray();
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("CONTENT_KEY_BATCH_SYNC_SCENE", (java.lang.Integer) 107);
                contentValues.put("CONTENT_KEY_BATCH_SYNC_PROTO", byteArray);
                com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().insert(k91.w5.f305812a, contentValues);
                z17 = true;
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("Luggage.WxaAttrsContentResolver", "batchUpdateWithProto insert failed");
                z17 = false;
            }
            if (z17) {
                java.util.List a17 = k91.w5.f305813b.a(this.f83904e.f79828c, new java.lang.String[0]);
                if (a17 != null) {
                    this.f83905f.invoke(a17);
                } else {
                    a17 = null;
                }
                if (a17 == null) {
                    lVar.invoke("get contact fail");
                }
            } else {
                lVar.invoke("update contacts fail");
            }
        }
        return jz5.f0.f302826a;
    }
}
