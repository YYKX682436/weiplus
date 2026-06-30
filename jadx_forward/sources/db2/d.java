package db2;

/* loaded from: classes2.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f309471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db2.e f309472e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.util.List list, db2.e eVar) {
        super(0);
        this.f309471d = list;
        this.f309472e = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List<r45.e20> list = this.f309471d;
        for (r45.e20 e20Var : list) {
            if (e20Var.m75942xfb822ef2(0) != 0) {
                cu2.u.f303974a.b(e20Var.m75942xfb822ef2(0));
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 c5437xe8b43b11 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11();
                c5437xe8b43b11.f135780g.f87970a = e20Var.m75942xfb822ef2(0);
                c5437xe8b43b11.e();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiCheckPrefetch", "onCgiEnd: deleteItem by id " + e20Var.m75942xfb822ef2(0));
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            db2.e eVar = this.f309472e;
            if (size == eVar.f309484u.size()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCgiEnd: should trigger refresh, tabType = ");
                int i17 = eVar.f309483t;
                sb6.append(i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiCheckPrefetch", sb6.toString());
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5543xbe6908c6 c5543xbe6908c6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5543xbe6908c6();
                c5543xbe6908c6.f135867g.f88953a = i17;
                c5543xbe6908c6.e();
            }
        }
        return jz5.f0.f384359a;
    }
}
