package zp0;

/* loaded from: classes7.dex */
public final class d implements zp0.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f556467a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f556468b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f556469c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f556470d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f556471e;

    public d(java.lang.String eggKey, java.lang.String eggId, java.lang.String sceneId, boolean z17, java.lang.String extString) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eggKey, "eggKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eggId, "eggId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneId, "sceneId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extString, "extString");
        this.f556467a = eggKey;
        this.f556468b = eggId;
        this.f556469c = sceneId;
        this.f556470d = z17;
        this.f556471e = extString;
    }

    @Override // zp0.e
    public java.util.Map b() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("eggKey", this.f556467a);
        hashMap.put("eggId", this.f556468b);
        hashMap.put("sceneId", this.f556469c);
        hashMap.put("animationType", java.lang.Integer.valueOf(this.f556470d ? 2 : 1));
        hashMap.put("extString", this.f556471e);
        return hashMap;
    }

    @Override // zp0.e
    /* renamed from: getName */
    public java.lang.String mo174917xfb82e301() {
        return "onEasterEggPlayAnimation";
    }
}
