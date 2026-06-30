package sf4;

/* loaded from: classes4.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 f489069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f489070e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502, android.content.Context context) {
        super(2);
        this.f489069d = c18497x85806502;
        this.f489070e = context;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.widget.CompoundButton checkBox = (android.widget.CompoundButton) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(checkBox, "checkBox");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f489069d;
        int size = c18497x85806502.f253642z.size();
        int i17 = c18497x85806502.f253635u;
        if (i17 >= 0 && i17 < size) {
            java.util.ArrayList arrayList = c18497x85806502.f253642z;
            int size2 = ((java.util.ArrayList) arrayList.get(i17)).size();
            int i18 = c18497x85806502.f253636v;
            if (i18 >= 0 && i18 < size2) {
                java.lang.Object obj3 = ((java.util.ArrayList) arrayList.get(c18497x85806502.f253635u)).get(c18497x85806502.f253636v);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
                long j17 = ((if4.f) obj3).f372776a.f69410x443468b;
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502.f253618l1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryGalleryView", "onCheckedFav " + j17 + ' ' + booleanValue);
                if (!booleanValue) {
                    c18497x85806502.m71518x1ae3a5a8().remove(java.lang.Long.valueOf(j17));
                } else if (c18497x85806502.m71518x1ae3a5a8().size() >= 9) {
                    checkBox.setChecked(false);
                    android.content.Context context = this.f489070e;
                    db5.e1.s(context, "", context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jmi));
                } else if (!c18497x85806502.m71518x1ae3a5a8().contains(java.lang.Long.valueOf(j17))) {
                    c18497x85806502.m71518x1ae3a5a8().add(java.lang.Long.valueOf(j17));
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6135xe8da49fb c6135xe8da49fb = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6135xe8da49fb();
                c6135xe8da49fb.f136405g.getClass();
                c6135xe8da49fb.e();
            }
        }
        return jz5.f0.f384359a;
    }
}
