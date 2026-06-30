package bk1;

/* loaded from: classes4.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jc7 f21290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f21291e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(r45.jc7 jc7Var, java.lang.ref.WeakReference weakReference) {
        super(0);
        this.f21290d = jc7Var;
        this.f21291e = weakReference;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List list;
        r45.jc7 jc7Var = this.f21290d;
        java.util.LinkedList wxa_item_list = jc7Var.f377707d;
        kotlin.jvm.internal.o.f(wxa_item_list, "wxa_item_list");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = wxa_item_list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            list = kz5.p0.f313996d;
            bk1.y yVar = null;
            if (!hasNext) {
                break;
            }
            r45.zf7 zf7Var = (r45.zf7) it.next();
            java.lang.String str = zf7Var.f391988d;
            java.util.List list2 = zf7Var.f391989e;
            k91.v5 n17 = com.tencent.mm.plugin.appbrand.app.r9.ij().n1(str, new java.lang.String[0]);
            if (n17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WxaAppGetUserAuthorizeScopeListWithAttrs", "doFetch, wxaAttrs of " + str + " is null");
            } else {
                if (list2 != null) {
                    list = list2;
                }
                yVar = new bk1.y(n17, list, zf7Var.f391990f);
            }
            if (yVar != null) {
                arrayList.add(yVar);
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        java.lang.ref.WeakReference weakReference = this.f21291e;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxaAppGetUserAuthorizeScopeListWithAttrs", "doFetch, userAuthScopeList is empty");
            kotlinx.coroutines.q qVar = (kotlinx.coroutines.q) weakReference.get();
            if (qVar != null) {
                ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(null));
            }
        } else {
            kotlinx.coroutines.q qVar2 = (kotlinx.coroutines.q) weakReference.get();
            if (qVar2 != null) {
                int i17 = jc7Var.f377708e;
                java.util.List list3 = jc7Var.f377709f;
                if (list3 != null) {
                    list = list3;
                }
                ((kotlinx.coroutines.r) qVar2).resumeWith(kotlin.Result.m521constructorimpl(new bk1.f0(i17, arrayList, list)));
            }
        }
        return jz5.f0.f302826a;
    }
}
