package ow;

/* loaded from: classes11.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ow.o f430793d = new ow.o();

    public o() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object value = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(value);
        if (m143898xd4a2fc34 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrandEcsNotifyCacheMgr", "[BRS]flutterBSInitNotifyData success");
            ow.t.f430799b = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BrandEcsNotifyCacheMgr", "[BRS]flutterBSInitNotifyData failure", m143898xd4a2fc34);
            ow.t.f430799b = false;
        }
        ow.t.f430801d = false;
        return jz5.f0.f384359a;
    }
}
