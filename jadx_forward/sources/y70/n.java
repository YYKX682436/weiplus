package y70;

/* loaded from: classes12.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d75.c f541220e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, d75.c cVar) {
        super(0);
        this.f541219d = str;
        this.f541220e = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashMap b17 = v70.b0.f515133m.b();
        java.lang.String str = this.f541219d;
        java.lang.Object obj = b17.get(str);
        if (obj == null) {
            obj = new java.util.HashSet();
            b17.put(str, obj);
        }
        java.util.HashSet hashSet = (java.util.HashSet) obj;
        d75.c cVar = this.f541220e;
        hashSet.remove(cVar);
        hashSet.add(cVar);
        return jz5.f0.f384359a;
    }
}
