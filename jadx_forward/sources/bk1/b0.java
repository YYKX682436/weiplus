package bk1;

/* loaded from: classes4.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jc7 f102823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f102824e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(r45.jc7 jc7Var, java.lang.ref.WeakReference weakReference) {
        super(0);
        this.f102823d = jc7Var;
        this.f102824e = weakReference;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List list;
        r45.jc7 jc7Var = this.f102823d;
        java.util.LinkedList wxa_item_list = jc7Var.f459240d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wxa_item_list, "wxa_item_list");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = wxa_item_list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            list = kz5.p0.f395529d;
            bk1.y yVar = null;
            if (!hasNext) {
                break;
            }
            r45.zf7 zf7Var = (r45.zf7) it.next();
            java.lang.String str = zf7Var.f473521d;
            java.util.List list2 = zf7Var.f473522e;
            k91.v5 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij().n1(str, new java.lang.String[0]);
            if (n17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaAppGetUserAuthorizeScopeListWithAttrs", "doFetch, wxaAttrs of " + str + " is null");
            } else {
                if (list2 != null) {
                    list = list2;
                }
                yVar = new bk1.y(n17, list, zf7Var.f473523f);
            }
            if (yVar != null) {
                arrayList.add(yVar);
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        java.lang.ref.WeakReference weakReference = this.f102824e;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaAppGetUserAuthorizeScopeListWithAttrs", "doFetch, userAuthScopeList is empty");
            p3325xe03a0797.p3326xc267989b.q qVar = (p3325xe03a0797.p3326xc267989b.q) weakReference.get();
            if (qVar != null) {
                ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            }
        } else {
            p3325xe03a0797.p3326xc267989b.q qVar2 = (p3325xe03a0797.p3326xc267989b.q) weakReference.get();
            if (qVar2 != null) {
                int i17 = jc7Var.f459241e;
                java.util.List list3 = jc7Var.f459242f;
                if (list3 != null) {
                    list = list3;
                }
                ((p3325xe03a0797.p3326xc267989b.r) qVar2).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new bk1.f0(i17, arrayList, list)));
            }
        }
        return jz5.f0.f384359a;
    }
}
