package ak1;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f87099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f87100f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ak1.b f87101g;

    public c(java.lang.String str, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, ak1.b bVar) {
        this.f87098d = str;
        this.f87099e = linkedList;
        this.f87100f = linkedList2;
        this.f87101g = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ak1.e eVar = ak1.e.f87105a;
        java.lang.String str = this.f87098d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        ak1.e.f87108d = str;
        java.util.LinkedList linkedList = this.f87099e;
        if (linkedList != null && !linkedList.isEmpty()) {
            java.util.ArrayList arrayList = ak1.e.f87106b;
            arrayList.addAll(linkedList);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r45.ie0 ie0Var = (r45.ie0) it.next();
                ak1.e eVar2 = ak1.e.f87105a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandVoipDeviceListCache", "model_id:%s, name:%s, sn:%s, status:%d", ie0Var.f458494d, ie0Var.f458496f, ie0Var.f458495e, java.lang.Integer.valueOf(ie0Var.f458497g));
            }
        }
        java.util.LinkedList linkedList2 = this.f87100f;
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            ak1.e.f87107c.addAll(linkedList2);
            java.util.Iterator it6 = linkedList2.iterator();
            while (it6.hasNext()) {
                r45.g27 g27Var = (r45.g27) it6.next();
                ak1.e eVar3 = ak1.e.f87105a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandVoipDeviceListCache", "template_name:%s, template_id:%s, status:%d", g27Var.f456377e, g27Var.f456376d, java.lang.Integer.valueOf(g27Var.f456379g));
            }
        }
        this.f87101g.a();
    }
}
