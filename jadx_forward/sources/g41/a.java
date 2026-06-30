package g41;

/* loaded from: classes5.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g41.f f350235d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g41.f fVar) {
        super(0);
        this.f350235d = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f350235d.f350242a;
        if (view != null) {
            return (com.p314xaae8f345.mm.p980x69aca1b.p982x5b09653.C11206x8495c06e) view.findViewById(com.p314xaae8f345.mm.R.id.sfa);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("floatingView");
        throw null;
    }
}
