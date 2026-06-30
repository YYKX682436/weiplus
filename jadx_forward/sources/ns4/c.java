package ns4;

/* loaded from: classes8.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.s f420992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ns4.d f420993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ns4.a f420994f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ns4.s sVar, ns4.d dVar, ns4.a aVar) {
        super(0);
        this.f420992d = sVar;
        this.f420993e = dVar;
        this.f420994f = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ns4.s sVar = this.f420992d;
        int b17 = i65.a.b(sVar.f421169a, 12) * 2;
        ns4.a aVar = this.f420994f;
        this.f420993e.f421022e = aVar.f3639x46306858.getWidth();
        android.view.View view = sVar.f421177i;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
            throw null;
        }
        aVar.f3639x46306858.getLayoutParams().width = ((view.getWidth() - i65.a.b(sVar.f421169a, 32)) - b17) / 3;
        aVar.f3639x46306858.requestLayout();
        return jz5.f0.f384359a;
    }
}
