package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class p4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15026xb84ce7c3 f211151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f211152e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15026xb84ce7c3 activityC15026xb84ce7c3, java.lang.String str) {
        super(2);
        this.f211151d = activityC15026xb84ce7c3;
        this.f211152e = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        e60.h1 result = (e60.h1) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15026xb84ce7c3 activityC15026xb84ce7c3 = this.f211151d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(activityC15026xb84ce7c3.G);
        android.app.Dialog dialog = activityC15026xb84ce7c3.F;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (booleanValue) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_result_img_path", this.f211152e);
            activityC15026xb84ce7c3.setResult(-1, intent);
            activityC15026xb84ce7c3.finish();
        } else {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o4(activityC15026xb84ce7c3));
        }
        return jz5.f0.f384359a;
    }
}
