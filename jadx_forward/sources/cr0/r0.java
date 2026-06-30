package cr0;

/* loaded from: classes12.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr0.u0 f303261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f303264g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f303265h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(cr0.u0 u0Var, java.lang.String str, java.lang.String str2, long j17, long j18) {
        super(0);
        this.f303261d = u0Var;
        this.f303262e = str;
        this.f303263f = str2;
        this.f303264g = j17;
        this.f303265h = j18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cr0.b bVar = com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795.f29664x233c02ec;
        cr0.u0 u0Var = this.f303261d;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f>> m46625x1828bc7f = u0Var.c().m46625x1828bc7f();
        bVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m46625x1828bc7f, "<this>");
        java.util.Map c17 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(m46625x1828bc7f);
        java.lang.String str = this.f303262e;
        java.lang.Object obj = c17.get(str);
        if (obj == null) {
            obj = new java.util.LinkedHashMap();
            c17.put(str, obj);
        }
        java.util.Map c18 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c((java.util.Map) obj);
        java.lang.String str2 = this.f303263f;
        java.lang.Object obj2 = c18.get(str2);
        if (obj2 == null) {
            obj2 = new com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f(0, 0L, 3, null);
            c18.put(str2, obj2);
        }
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f c10871xcc6f010f = (com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f) obj2;
        c10871xcc6f010f.f150222d++;
        long j17 = c10871xcc6f010f.f150223e;
        long j18 = this.f303264g - this.f303265h;
        if (j18 < 0) {
            j18 = 0;
        }
        if (j18 >= 60000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BinderTracker", "long binderProxy calling: " + j18 + "ms, name=" + str + ", code=" + str2);
        }
        c10871xcc6f010f.f150223e = j17 + j18;
        if (u0Var.c().getAccBeginTime() <= 0) {
            u0Var.c().m46630xc5e2f917(java.lang.System.currentTimeMillis());
        }
        return jz5.f0.f384359a;
    }
}
