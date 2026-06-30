package ak1;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f5566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f5567f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ak1.b f5568g;

    public c(java.lang.String str, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, ak1.b bVar) {
        this.f5565d = str;
        this.f5566e = linkedList;
        this.f5567f = linkedList2;
        this.f5568g = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ak1.e eVar = ak1.e.f5572a;
        java.lang.String str = this.f5565d;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        ak1.e.f5575d = str;
        java.util.LinkedList linkedList = this.f5566e;
        if (linkedList != null && !linkedList.isEmpty()) {
            java.util.ArrayList arrayList = ak1.e.f5573b;
            arrayList.addAll(linkedList);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r45.ie0 ie0Var = (r45.ie0) it.next();
                ak1.e eVar2 = ak1.e.f5572a;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandVoipDeviceListCache", "model_id:%s, name:%s, sn:%s, status:%d", ie0Var.f376961d, ie0Var.f376963f, ie0Var.f376962e, java.lang.Integer.valueOf(ie0Var.f376964g));
            }
        }
        java.util.LinkedList linkedList2 = this.f5567f;
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            ak1.e.f5574c.addAll(linkedList2);
            java.util.Iterator it6 = linkedList2.iterator();
            while (it6.hasNext()) {
                r45.g27 g27Var = (r45.g27) it6.next();
                ak1.e eVar3 = ak1.e.f5572a;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandVoipDeviceListCache", "template_name:%s, template_id:%s, status:%d", g27Var.f374844e, g27Var.f374843d, java.lang.Integer.valueOf(g27Var.f374846g));
            }
        }
        this.f5568g.a();
    }
}
