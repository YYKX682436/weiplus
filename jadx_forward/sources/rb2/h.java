package rb2;

/* loaded from: classes2.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f475169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475171f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, in5.s0 s0Var, so2.y0 y0Var) {
        super(2);
        this.f475169d = c0Var;
        this.f475170e = s0Var;
        this.f475171f = y0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).longValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f475169d;
        if (!c0Var.f391645d) {
            c0Var.f391645d = true;
            android.content.Context context = this.f475170e.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            so2.y0 y0Var = this.f475171f;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u) a17).X6(y0Var.f492236d.f68959xf9a02e3e, y0Var, longValue);
        }
        return jz5.f0.f384359a;
    }
}
