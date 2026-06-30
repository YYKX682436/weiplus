package z53;

/* loaded from: classes5.dex */
public final class l implements u53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f551790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f551791b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f551792c;

    public l(yz5.p pVar, java.util.List list, java.util.HashMap hashMap) {
        this.f551790a = pVar;
        this.f551791b = list;
        this.f551792c = hashMap;
    }

    @Override // u53.x
    public final void a(java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
        java.util.Iterator it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            yz5.p pVar = this.f551790a;
            java.util.List list = this.f551791b;
            if (!hasNext) {
                pVar.mo149xb9724478(java.lang.Boolean.TRUE, list);
                return;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!((y53.m) ((u53.u) entry.getValue())).B) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameLife.ConversationLogic", "invalid contact, bind conversation failed!");
                pVar.mo149xb9724478(java.lang.Boolean.FALSE, list);
                return;
            }
            java.util.List<z53.i> list2 = (java.util.List) this.f551792c.get(entry.getKey());
            if (list2 != null) {
                for (z53.i iVar : list2) {
                    java.lang.Object value = entry.getValue();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelife.contact.GameLifeContact");
                    y53.m mVar = (y53.m) value;
                    iVar.getClass();
                    iVar.F = mVar;
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 v07 = mVar.v0();
                    iVar.H = v07.g2();
                    java.lang.CharSequence charSequence = v07.J2;
                    if (charSequence == null) {
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        java.lang.String str = iVar.H;
                        ((ke0.e) xVar).getClass();
                        charSequence = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str);
                    }
                    iVar.G = charSequence;
                }
            }
        }
    }
}
