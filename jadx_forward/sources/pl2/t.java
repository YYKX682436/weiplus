package pl2;

/* loaded from: classes3.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f438194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pl2.w f438195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pl2.x f438196f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f438197g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.util.HashSet hashSet, pl2.w wVar, pl2.x xVar, java.util.ArrayList arrayList) {
        super(0);
        this.f438194d = hashSet;
        this.f438195e = wVar;
        this.f438196f = xVar;
        this.f438197g = arrayList;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashSet hashSet = this.f438194d;
        java.util.Iterator it = hashSet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            pl2.w wVar = this.f438195e;
            if (!hasNext) {
                wVar.f438212i.clear();
                wVar.f438212i.addAll(hashSet);
                return jz5.f0.f384359a;
            }
            int intValue = ((java.lang.Number) it.next()).intValue();
            if (!wVar.f438212i.contains(java.lang.Integer.valueOf(intValue))) {
                android.app.Activity context = this.f438196f.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class)).f438220m.d(intValue, (pl2.a) kz5.n0.a0(this.f438197g, intValue), 2);
            }
        }
    }
}
