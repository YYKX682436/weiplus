package vj0;

/* loaded from: classes11.dex */
public final class g implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f519180a;

    public g(android.os.Bundle bundle) {
        this.f519180a = bundle;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        vj0.i iVar = vj0.i.f519182a;
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b, null, v45.c.class, vj0.b.f519171d);
        android.os.Bundle bundle = this.f519180a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CommonLiteAppGuidanceManager", "startLiteApp fail: appid=%s  page=%s", bundle.getString("appId", ""), bundle.getString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, ""));
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        java.lang.String str;
        vj0.i iVar = vj0.i.f519182a;
        android.os.Bundle bundle = this.f519180a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        w15.a aVar = vj0.i.f519183b;
        if (aVar == null || (str = aVar.m126747x696739c()) == null) {
            str = "";
        }
        bundle.putString("BUNDLE_KEY_LAST_INFO", str);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b, bundle, v45.c.class, vj0.h.f519181d);
        vj0.i.f519184c.mo48813x58998cd();
        vj0.i.f519185d.mo48813x58998cd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonLiteAppGuidanceManager", "startLiteApp success: appid=%s  page=%s", bundle.getString("appId", ""), bundle.getString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, ""));
    }
}
