package fi2;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi2.d f344338d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(fi2.d dVar) {
        super(0);
        this.f344338d = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fi2.d dVar = this.f344338d;
        android.content.Context context = dVar.f344344a.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new ci2.d(context, dVar.f344344a, dVar);
    }
}
