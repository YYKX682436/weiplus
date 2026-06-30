package zp0;

/* loaded from: classes7.dex */
public final class c implements zp0.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f556464a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f556465b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f556466c;

    public c(java.lang.String eggKey, java.lang.String eggId, java.lang.String sceneId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eggKey, "eggKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eggId, "eggId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneId, "sceneId");
        this.f556464a = eggKey;
        this.f556465b = eggId;
        this.f556466c = sceneId;
    }

    @Override // zp0.e
    public java.util.Map b() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("eggKey", this.f556464a);
        hashMap.put("eggId", this.f556465b);
        hashMap.put("sceneId", this.f556466c);
        return hashMap;
    }

    @Override // zp0.e
    /* renamed from: getName */
    public java.lang.String mo174917xfb82e301() {
        return "onEasterEggGiftClick";
    }
}
