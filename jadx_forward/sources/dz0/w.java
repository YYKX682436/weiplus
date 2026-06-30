package dz0;

/* loaded from: classes5.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz0.x f326577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 f326578e;

    public w(dz0.x xVar, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356) {
        this.f326577d = xVar;
        this.f326578e = c4116xf4b2c356;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz0.x xVar = this.f326577d;
        java.util.List list = (java.util.List) xVar.f326585c.mo3195x754a37bb();
        java.lang.Object obj = null;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356 = this.f326578e;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) next).m33856x92013dca(), c4116xf4b2c356.m33856x92013dca())) {
                    obj = next;
                    break;
                }
            }
            obj = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) obj;
        }
        if (obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "updateMusicInfo: insert other music");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(c4116xf4b2c356);
            java.util.List list2 = (java.util.List) xVar.f326585c.mo3195x754a37bb();
            if (list2 != null) {
                arrayList.addAll(list2);
            }
            p012xc85e97e9.p093xedfae76a.j0 j0Var = xVar.f326583a;
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList) {
                if (hashSet.add(((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) obj2).m33856x92013dca())) {
                    arrayList2.add(obj2);
                }
            }
            j0Var.mo7808x76db6cb1(arrayList2);
        }
        xVar.f326584b.mo523x53d8522f(c4116xf4b2c356);
    }
}
