package t00;

/* loaded from: classes.dex */
public final class a1 implements t00.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f495796a = hashCode();

    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.f495877y;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenMyAddressEcsActionHandler", "context is null");
            callback.a();
        } else {
            c00.w2 w2Var = (c00.w2) i95.n0.c(c00.w2.class);
            ((b30.k) w2Var).Ai(context, this.f495796a, data, new t00.z0(this, data, callback));
        }
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
