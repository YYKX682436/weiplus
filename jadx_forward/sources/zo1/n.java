package zo1;

/* loaded from: classes5.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6 f556227d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6 activityC12866x739418c6) {
        super(1);
        this.f556227d = activityC12866x739418c6;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6 activityC12866x739418c6 = this.f556227d;
        android.content.Intent intent = activityC12866x739418c6.getIntent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9 = activityC12866x739418c6.f174320f;
        if (c12853x6acde7c9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
            throw null;
        }
        intent.putExtra("convParcelRange", c12853x6acde7c9);
        activityC12866x739418c6.setResult(-1, activityC12866x739418c6.getIntent());
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1 y1Var = booleanValue ? com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174484s : com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174483r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2 a2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.f174100a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c92 = activityC12866x739418c6.f174320f;
        if (c12853x6acde7c92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.a(a2Var, y1Var, null, null, null, c12853x6acde7c92, null, 46, null);
        activityC12866x739418c6.W6();
        return jz5.f0.f384359a;
    }
}
