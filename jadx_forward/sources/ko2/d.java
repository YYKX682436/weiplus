package ko2;

/* loaded from: classes2.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f391455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f391456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f391457f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f391458g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, java.lang.String str, long j17, java.lang.String str2) {
        super(0);
        this.f391455d = context;
        this.f391456e = str;
        this.f391457f = j17;
        this.f391458g = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f391455d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ho2.g gVar = new ho2.g(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), this.f391456e, 1, 2, this.f391457f, 0L);
        gVar.t(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 0L);
        pm0.v.T(gVar.l(), new ko2.c(this.f391458g, 2, context));
        return jz5.f0.f384359a;
    }
}
