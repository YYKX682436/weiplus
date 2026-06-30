package pk2;

/* loaded from: classes3.dex */
public final class t3 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437795i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f437796j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437795i = "";
        this.f437796j = kz5.c0.k(new pk2.q3(helper, i17));
    }

    @Override // qk2.f
    public java.util.List g() {
        return this.f437796j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437795i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 bottomSheet, java.lang.Integer num) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        android.view.View findViewById = bottomSheet.f213492f.findViewById(com.p314xaae8f345.mm.R.id.qli);
        if (findViewById != null) {
            findViewById.setOnClickListener(new pk2.s3(o9Var, this));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AnchorRecommendSettingsOption", "addItem: click recommend setting fail, view is null");
        }
    }
}
