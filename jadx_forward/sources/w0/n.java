package w0;

/* loaded from: classes14.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0.p f523381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f523382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w0.l f523383f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w0.p pVar, java.lang.Object obj, w0.l lVar) {
        super(1);
        this.f523381d = pVar;
        this.f523382e = obj;
        this.f523383f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(DisposableEffect, "$this$DisposableEffect");
        w0.p pVar = this.f523381d;
        java.util.Map map = pVar.f523390b;
        java.lang.Object obj2 = this.f523382e;
        if (!(!map.containsKey(obj2))) {
            throw new java.lang.IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
        }
        pVar.f523389a.remove(obj2);
        java.util.Map map2 = pVar.f523390b;
        w0.l lVar = this.f523383f;
        map2.put(obj2, lVar);
        return new w0.m(lVar, pVar, obj2);
    }
}
