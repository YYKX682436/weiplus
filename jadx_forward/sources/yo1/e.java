package yo1;

/* loaded from: classes4.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f545647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fo1.n f545648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12864xc0eb7555 f545649f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, fo1.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12864xc0eb7555 activityC12864xc0eb7555) {
        super(0);
        this.f545647d = u3Var;
        this.f545648e = nVar;
        this.f545649f = activityC12864xc0eb7555;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        this.f545647d.dismiss();
        fo1.n nVar = this.f545648e;
        int ordinal = nVar.ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12864xc0eb7555 activityC12864xc0eb7555 = this.f545649f;
        if (ordinal == 1) {
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.mym;
        } else {
            if (ordinal != 3) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, nVar);
                activityC12864xc0eb7555.setResult(-1, intent);
                activityC12864xc0eb7555.finish();
                return jz5.f0.f384359a;
            }
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.mzv;
        }
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activityC12864xc0eb7555);
        e4Var.d(i17);
        e4Var.b(com.p314xaae8f345.mm.R.raw.f79077x2e716e0d);
        e4Var.c();
        return jz5.f0.f384359a;
    }
}
