package bb2;

/* loaded from: classes2.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f100380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f100381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100382f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(long j17, bb2.w1 w1Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f100380d = j17;
        this.f100381e = w1Var;
        this.f100382f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bb2.e1(this.f100380d, this.f100381e, this.f100382f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bb2.e1 e1Var = (bb2.e1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        e1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String u17 = pm0.v.u(this.f100380d);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f100381e.f100585q;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("comment_id", u17);
        jSONObject.put("report_json", this.f100382f);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        concurrentHashMap.put(u17, jSONObject2);
        return jz5.f0.f384359a;
    }
}
