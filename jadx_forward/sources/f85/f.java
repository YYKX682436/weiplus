package f85;

/* loaded from: classes10.dex */
public final class f implements f85.e {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f341765a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f341766b;

    public f(yz5.a getOldTime, yz5.a getNewTime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getOldTime, "getOldTime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getNewTime, "getNewTime");
        this.f341765a = getOldTime;
        this.f341766b = getNewTime;
    }

    @Override // f85.e
    public boolean a() {
        long longValue = ((java.lang.Number) this.f341765a.mo152xb9724478()).longValue();
        yz5.a aVar = this.f341766b;
        ((java.lang.Number) aVar.mo152xb9724478()).longValue();
        return longValue == 0 || ((java.lang.Number) aVar.mo152xb9724478()).longValue() > longValue;
    }
}
