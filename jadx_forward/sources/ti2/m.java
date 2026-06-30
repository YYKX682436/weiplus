package ti2;

/* loaded from: classes10.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ti2.o f501099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f501100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ km2.q f501101f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f501102g;

    public m(ti2.o oVar, int i17, km2.q qVar, yz5.a aVar) {
        this.f501099d = oVar;
        this.f501100e = i17;
        this.f501101f = qVar;
        this.f501102g = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorLinkUserConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ti2.o oVar = this.f501099d;
        int i17 = this.f501100e;
        km2.q qVar = this.f501101f;
        gk2.e eVar = oVar.f501107e;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f501109g, "onHungupLinkUser pos: " + i17 + " nick: " + qVar.f390706d);
            si2.c cVar = oVar.f501108f;
            if (cVar != null) {
                cVar.b(i17, qVar);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f501109g, "onAcceptLinkUser pos: " + i17 + " nick: " + qVar.f390706d);
            si2.c cVar2 = oVar.f501108f;
            if (cVar2 != null) {
                cVar2.c(i17, qVar);
            }
        }
        if (this.f501101f.m()) {
            this.f501102g.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorLinkUserConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
