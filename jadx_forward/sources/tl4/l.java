package tl4;

/* loaded from: classes11.dex */
public final class l extends com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 implements jm4.m2, jm4.b2 {

    /* renamed from: d, reason: collision with root package name */
    public final bw5.eq0 f501853d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 f501854e;

    /* renamed from: f, reason: collision with root package name */
    public int f501855f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.jq0 f501856g;

    public l(bw5.eq0 appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f501853d = appId;
        this.f501855f = -1;
    }

    public final void a(b66.g gVar) {
        java.lang.String str = "attachPlayApp playApp: %s, appId: " + this.f501853d;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(gVar != null ? gVar.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingPlayAppNotificationModule", str, objArr);
        this.f501854e = new com.p314xaae8f345.p3118xeeebfacc.C26845xac206036(gVar);
    }
}
