package ax2;

/* loaded from: classes10.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15394x1f635308 f96633d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15394x1f635308 c15394x1f635308) {
        super(0);
        this.f96633d = c15394x1f635308;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f96633d.f213380e;
        if (view != null) {
            return (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.i9j);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
        throw null;
    }
}
