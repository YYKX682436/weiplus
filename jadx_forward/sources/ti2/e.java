package ti2;

/* loaded from: classes10.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ti2.g f501082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f501083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ km2.q f501084f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f501085g;

    public e(ti2.g gVar, int i17, km2.q qVar, yz5.a aVar) {
        this.f501082d = gVar;
        this.f501083e = i17;
        this.f501084f = qVar;
        this.f501085g = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/convert/AnchorPayMicAudienceConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ti2.g gVar = this.f501082d;
        int i17 = this.f501083e;
        km2.q qVar = this.f501084f;
        gk2.e eVar = gVar.f501090e;
        java.lang.Object obj = null;
        if (eVar != null && (list = ((mm2.o4) eVar.a(mm2.o4.class)).f410860v) != null) {
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) next).f390703a, qVar.f390703a)) {
                        obj = next;
                        break;
                    }
                }
            }
            obj = (km2.q) obj;
        }
        if (obj != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorPayMicAudienceCon", "onHungupLinkUser pos: " + i17 + " nick: " + qVar.f390706d);
            si2.c cVar = gVar.f501091f;
            if (cVar != null) {
                cVar.b(i17, qVar);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorPayMicAudienceCon", "onAcceptLinkUser pos: " + i17 + " nick: " + qVar.f390706d);
            si2.c cVar2 = gVar.f501091f;
            if (cVar2 != null) {
                cVar2.c(i17, qVar);
            }
        }
        if (this.f501084f.m()) {
            this.f501085g.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/convert/AnchorPayMicAudienceConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
