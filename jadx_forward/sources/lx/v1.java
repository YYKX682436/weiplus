package lx;

/* loaded from: classes.dex */
public final class v1 implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f403509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f403510b;

    public v1(boolean z17, java.lang.ref.WeakReference weakReference) {
        this.f403509a = z17;
        this.f403510b = weakReference;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p2845xc516c4b6.biz.C23168x382cce3a c23168x382cce3a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(err_msg, "err_msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMeTabPlugin", "openPublish success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
        if (!this.f403509a || (c23168x382cce3a = (com.p314xaae8f345.p2845xc516c4b6.biz.C23168x382cce3a) this.f403510b.get()) == null) {
            return;
        }
        c23168x382cce3a.m85123x44841f42(lx.u1.f403499d);
    }
}
