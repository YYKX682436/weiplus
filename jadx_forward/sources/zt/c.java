package zt;

/* loaded from: classes3.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f557063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d75.c f557064e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, d75.c cVar) {
        super(0);
        this.f557063d = str;
        this.f557064e = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.g gVar = ot.g.f429841m;
        java.util.HashMap hashMap = (java.util.HashMap) ((jz5.n) ot.g.f429841m).mo141623x754a37bb();
        java.lang.String str = this.f557063d;
        java.lang.Object obj = hashMap.get(str);
        if (obj == null) {
            obj = new java.util.HashSet();
            hashMap.put(str, obj);
        }
        java.util.HashSet hashSet = (java.util.HashSet) obj;
        d75.c cVar = this.f557064e;
        hashSet.remove(cVar);
        hashSet.add(cVar);
        return jz5.f0.f384359a;
    }
}
