package zp0;

/* loaded from: classes7.dex */
public final class b implements zp0.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f556460a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f556461b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f556462c;

    /* renamed from: d, reason: collision with root package name */
    public final int f556463d;

    public b(java.lang.String eggKey, java.lang.String eggId, java.lang.String sceneId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eggKey, "eggKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eggId, "eggId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneId, "sceneId");
        this.f556460a = eggKey;
        this.f556461b = eggId;
        this.f556462c = sceneId;
        this.f556463d = i17;
    }

    @Override // zp0.e
    public java.util.Map b() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("eggKey", this.f556460a);
        hashMap.put("eggId", this.f556461b);
        hashMap.put("sceneId", this.f556462c);
        hashMap.put("stopReason", java.lang.Integer.valueOf(this.f556463d));
        return hashMap;
    }

    @Override // zp0.e
    /* renamed from: getName */
    public java.lang.String mo174917xfb82e301() {
        return "onEasterEggForceStop";
    }
}
