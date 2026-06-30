package u01;

/* loaded from: classes9.dex */
public final class d implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p945xdb1a454a.p946x138a4df7.C11117x314d89f3 f504986a;

    public d(com.p314xaae8f345.mm.p945xdb1a454a.p946x138a4df7.C11117x314d89f3 c11117x314d89f3) {
        this.f504986a = c11117x314d89f3;
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizSubscribeMsgSettingPagePresenter", "updateSubscribeMsgListAsync onError errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
    }

    @Override // e31.l
    public void e(java.lang.String bizUsername, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSubscribeMsgSettingPagePresenter", "updateSubscribeMsgListAsync onSuccess");
        com.p314xaae8f345.mm.p945xdb1a454a.p946x138a4df7.C11117x314d89f3 c11117x314d89f3 = this.f504986a;
        c11117x314d89f3.getClass();
        java.util.ArrayList<com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3> arrayList = result.f153318h;
        if (arrayList != null) {
            for (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 : arrayList) {
                com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d32 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) c11117x314d89f3.f152392e.get(c11159x8f55e6d3.f153336f);
                if (c11159x8f55e6d32 != null) {
                    c11159x8f55e6d32.f153340m = c11159x8f55e6d3.f153340m;
                }
            }
        }
    }
}
