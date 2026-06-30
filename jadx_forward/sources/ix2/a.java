package ix2;

/* loaded from: classes15.dex */
public final class a extends lr.z {
    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // lr.z, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public lr.s0 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == 1) {
            android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.agh, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new lr.b1(inflate, this.f402153g);
        }
        android.view.View inflate2 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.agh, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        return new lr.b1(inflate2, this.f402153g);
    }
}
