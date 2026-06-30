package rv0;

/* loaded from: classes5.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.d f481460d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rv0.d dVar) {
        super(1);
        this.f481460d = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        rv0.d dVar = this.f481460d;
        return floatValue > 0.0f ? j65.q.a(dVar.getContext()).getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562569cn1, null) : j65.q.a(dVar.getContext()).getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cni, null);
    }
}
