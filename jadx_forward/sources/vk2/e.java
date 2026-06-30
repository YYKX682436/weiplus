package vk2;

/* loaded from: classes3.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f519291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vk2.h f519292e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, vk2.h hVar) {
        super(0);
        this.f519291d = context;
        this.f519292e = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f519291d;
        int b17 = i65.a.b(context, 400);
        vk2.h hVar = this.f519292e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = hVar.f519297m;
        if (c1163xf1deaba4 != null) {
            return new wk2.j(context, b17, c1163xf1deaba4, hVar.f519300p, hVar.f519295h);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
        throw null;
    }
}
