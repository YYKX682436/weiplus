package cr0;

/* loaded from: classes12.dex */
public final class r3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f303269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303271f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303272g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(0);
        this.f303269d = i17;
        this.f303270e = str;
        this.f303271f = str2;
        this.f303272g = str3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> m46636xc3ec362e = this.f303269d == 0 ? cr0.w3.f303333a.a().m46636xc3ec362e() : cr0.w3.f303333a.a().m46637x2db8acb0();
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795.f29664x233c02ec.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m46636xc3ec362e, "<this>");
        java.util.Map c17 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(m46636xc3ec362e);
        java.lang.String str = this.f303270e;
        java.lang.Object obj = c17.get(str);
        if (obj == null) {
            obj = new java.util.LinkedHashMap();
            c17.put(str, obj);
        }
        java.util.Map map = (java.util.Map) obj;
        java.util.Map c18 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(map);
        java.lang.String str2 = this.f303271f;
        java.lang.Object obj2 = map.get(str2);
        if (obj2 == null) {
            obj2 = 0L;
        }
        c18.put(str2, java.lang.Long.valueOf(((java.lang.Number) obj2).longValue() + java.lang.Long.parseLong(this.f303272g)));
        cr0.w3 w3Var = cr0.w3.f303333a;
        if (w3Var.a().getAccBeginTime() <= 0) {
            w3Var.a().m46641xc5e2f917(java.lang.System.currentTimeMillis());
        }
        return jz5.f0.f384359a;
    }
}
