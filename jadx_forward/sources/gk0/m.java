package gk0;

/* loaded from: classes3.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d75.c f353974e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, d75.c cVar) {
        super(0);
        this.f353973d = str;
        this.f353974e = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gk0.n0.K0.getClass();
        java.util.HashMap hashMap = (java.util.HashMap) ((jz5.n) gk0.m0.f353976b).mo141623x754a37bb();
        java.lang.String str = this.f353973d;
        java.lang.Object obj = hashMap.get(str);
        if (obj == null) {
            obj = new java.util.HashSet();
            hashMap.put(str, obj);
        }
        java.util.HashSet hashSet = (java.util.HashSet) obj;
        d75.c cVar = this.f353974e;
        hashSet.remove(cVar);
        hashSet.add(cVar);
        return jz5.f0.f384359a;
    }
}
