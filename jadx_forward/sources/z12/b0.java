package z12;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f550813a;

    /* renamed from: b, reason: collision with root package name */
    public final int f550814b;

    public b0(java.lang.String str, int i17) {
        this.f550813a = str;
        this.f550814b = i17;
    }

    public final void a(yz5.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        int i17 = this.f550814b;
        java.lang.String str = this.f550813a;
        if (str != null || i17 != 0) {
            new z12.m(str, i17).l().K(new z12.a0(this, callback));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.StoreEmoticonGetDesignerAcctInfoCgi", "No valid request info provided");
            callback.mo149xb9724478(null, str);
        }
    }
}
