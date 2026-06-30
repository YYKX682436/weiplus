package i2;

/* loaded from: classes14.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i2.c f369379d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i2.c cVar) {
        super(0);
        this.f369379d = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        i2.c cVar = this.f369379d;
        java.util.Locale textLocale = cVar.f369380a.f369389c.getTextLocale();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return new c2.a(textLocale, cVar.f369383d.e());
    }
}
