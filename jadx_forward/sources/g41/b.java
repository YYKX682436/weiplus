package g41;

/* loaded from: classes5.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g41.f f350236d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g41.f fVar) {
        super(0);
        this.f350236d = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f350236d.f350242a;
        if (view != null) {
            return (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.sfb);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("floatingView");
        throw null;
    }
}
