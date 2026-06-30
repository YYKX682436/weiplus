package r10;

/* loaded from: classes9.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pq.a f450120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f450121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y02.h0 f450122f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f450123g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f450124h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(pq.a aVar, yz5.q qVar, y02.h0 h0Var, java.lang.String str, yz5.l lVar) {
        super(1);
        this.f450120d = aVar;
        this.f450121e = qVar;
        this.f450122f = h0Var;
        this.f450123g = str;
        this.f450124h = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p733x34264a.C10545xf0ca44c1 result = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p733x34264a.C10545xf0ca44c1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        boolean z17 = result.f147384d;
        pq.a aVar = this.f450120d;
        if (z17) {
            try {
                org.json.JSONObject d17 = aVar.d();
                if (d17 == null) {
                    d17 = new org.json.JSONObject();
                }
                d17.put("isTeenMode", result.f147385e ? 1 : 0);
                aVar.b(d17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ECS_O.service", e17, "hy: merge extraData error", new java.lang.Object[0]);
            }
        }
        this.f450121e.mo147xb9724478(this.f450122f, aVar, new r10.o(this.f450123g, this.f450124h));
        return jz5.f0.f384359a;
    }
}
