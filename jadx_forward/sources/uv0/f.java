package uv0;

/* loaded from: classes5.dex */
public final class f extends gv0.b {

    /* renamed from: h, reason: collision with root package name */
    public final yo0.i f512861h;

    /* renamed from: i, reason: collision with root package name */
    public vv0.k f512862i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yz5.p onItemClickListener) {
        super(null, onItemClickListener, 0L, 5, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClickListener, "onItemClickListener");
        yo0.f fVar = new yo0.f();
        fVar.f545611b = true;
        fVar.f545610a = true;
        this.f512861h = fVar.a();
        vv0.k kVar = vv0.k.f521916f;
        this.f512862i = vv0.k.f521916f;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        java.lang.Object a07 = kz5.n0.a0(this.f357503d, i17);
        vv0.k kVar = vv0.k.f521916f;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a07, vv0.k.f521917g)) {
            uv0.d dVar = uv0.e.f512857e;
            return 0;
        }
        uv0.d dVar2 = uv0.e.f512857e;
        return 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        uv0.e eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        uv0.e.f512857e.getClass();
        uv0.e[] m170581xcee59d22 = uv0.e.m170581xcee59d22();
        int length = m170581xcee59d22.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                eVar = null;
                break;
            }
            eVar = m170581xcee59d22[i18];
            if (eVar.f512860d == i17) {
                break;
            }
            i18++;
        }
        if (eVar == null) {
            eVar = uv0.e.f512858f;
        }
        int ordinal = eVar.ordinal();
        if (ordinal == 0) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dfj, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new uv0.c(this, inflate);
        }
        if (ordinal != 1) {
            throw new jz5.j();
        }
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new uv0.b(this, new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10957x69a14ea6(context, null, 0, 6, null));
    }

    public final void z(vv0.k value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        vv0.k kVar = vv0.k.f521916f;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(value, vv0.k.f521917g) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f512862i, value)) {
            return;
        }
        vv0.k kVar2 = this.f512862i;
        java.util.ArrayList arrayList = this.f357503d;
        int indexOf = arrayList.indexOf(kVar2);
        int indexOf2 = arrayList.indexOf(value);
        this.f512862i = value;
        m8147xed6e4d18(0);
        m8147xed6e4d18(indexOf);
        m8147xed6e4d18(indexOf2);
    }
}
