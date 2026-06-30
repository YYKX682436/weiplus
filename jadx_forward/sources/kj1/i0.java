package kj1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkj1/i0;", "Lcom/tencent/mm/ipcinvoker/i;", "Landroid/os/Bundle;", "Lcom/tencent/mm/plugin/appbrand/shortlink/WxaShortLinkRiskManager$UploadResult;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
public final class i0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<android.os.Bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12592x92cb95ba> {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        byte[] a17;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null) {
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12592x92cb95ba(false, null, 2, null));
                return;
            }
            return;
        }
        java.lang.String string = bundle.getString("linkUrl");
        if (android.text.TextUtils.isEmpty(bundle.getString("data_mmkv_key", ""))) {
            a17 = bundle.getByteArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        } else {
            za1.b bVar = za1.b.f552411a;
            java.lang.String string2 = bundle.getString("data_mmkv_key");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            a17 = bVar.a(string2, true);
        }
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_WxaMpShortLinkScreenshot";
        mVar.f69592xf1ebe47b = 20304;
        mVar.f69584x89a4c0cf = 2;
        mVar.f69580x454032b6 = 302;
        mVar.f69601xaca5bdda = new kk.v(gm0.j1.b().h()).longValue() + '_' + java.lang.System.currentTimeMillis() + '_' + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(string);
        mVar.f323325m = a17;
        mVar.f69606xccdbf540 = false;
        mVar.f323320f = new kj1.h0(rVar);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            return;
        }
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12592x92cb95ba(false, null, 2, null));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaShortLinkRiskManager", "cdn upload add task fail");
    }
}
