package ut2;

/* loaded from: classes3.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f512408d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(android.view.View view) {
        super(0);
        this.f512408d = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f512408d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14981x40ea4ed4 c14981x40ea4ed4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14981x40ea4ed4) view.findViewById(com.p314xaae8f345.mm.R.id.l58);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14981x40ea4ed4 c14981x40ea4ed42 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14981x40ea4ed4) view.findViewById(com.p314xaae8f345.mm.R.id.bhj);
        boolean z17 = true;
        if (!zl2.r4.f555483a.w1()) {
            gk2.e eVar = gk2.e.f354004n;
            if (!(eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).T)) {
                z17 = false;
            }
        }
        if (z17) {
            c14981x40ea4ed4.setVisibility(8);
            return c14981x40ea4ed42;
        }
        c14981x40ea4ed42.setVisibility(8);
        return c14981x40ea4ed4;
    }
}
