package h45;

/* loaded from: classes9.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f360482e;

    public h0(java.lang.String str, yz5.a aVar) {
        this.f360481d = str;
        this.f360482e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addOutTimeCheck task:");
        java.lang.String str = this.f360481d;
        sb6.append(str);
        sb6.append(" size:");
        java.util.Map map = h45.i0.f360483a;
        java.util.Map map2 = h45.i0.f360483a;
        sb6.append(map2.size());
        sb6.append(", out time happen");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayUtil", sb6.toString());
        map2.remove(str);
        this.f360482e.mo152xb9724478();
    }
}
