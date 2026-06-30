package ju1;

/* loaded from: classes9.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju1.i f383250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tt f383251e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ju1.i iVar, r45.tt ttVar) {
        super(0);
        this.f383250d = iVar;
        this.f383251e = ttVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ju1.i iVar = this.f383250d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5 c13081x70323a5 = iVar.f383269n;
        if (c13081x70323a5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgIv");
            throw null;
        }
        c13081x70323a5.f177007e = i65.a.b(c13081x70323a5.getContext(), 32);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5 c13081x70323a52 = iVar.f383269n;
        if (c13081x70323a52 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgIv");
            throw null;
        }
        c13081x70323a52.f177006d = iVar.f383262d;
        c13081x70323a52.getLayoutParams().height = iVar.f383262d;
        if (c13081x70323a52 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgIv");
            throw null;
        }
        c13081x70323a52.setVisibility(0);
        android.widget.ImageView imageView = iVar.f383270o;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shadowBgIv");
            throw null;
        }
        imageView.setVisibility(0);
        r45.tt ttVar = this.f383251e;
        java.lang.String str = ttVar.f468303i;
        if (str == null || str.length() == 0) {
            java.lang.String str2 = ttVar.f468302h;
            if (!(str2 == null || str2.length() == 0)) {
                if (c13081x70323a52 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgIv");
                    throw null;
                }
                c13081x70323a52.setImageDrawable(ju1.e.a(android.graphics.Color.parseColor(ttVar.f468302h)));
            }
        } else {
            if (c13081x70323a52 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgIv");
                throw null;
            }
            ju1.e.b(c13081x70323a52, ttVar.f468303i, iVar.f383263e, iVar.f383262d);
        }
        return jz5.f0.f384359a;
    }
}
