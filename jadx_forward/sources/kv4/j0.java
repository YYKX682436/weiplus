package kv4;

/* loaded from: classes5.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv4.l0 f394238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(kv4.l0 l0Var) {
        super(1);
        this.f394238d = l0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        e06.k range = (e06.k) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(range, "range");
        kv4.l0 l0Var = this.f394238d;
        java.util.List list = l0Var.f394244b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (((rv4.c0) ((mv4.j) obj2)).b()) {
                arrayList.add(obj2);
            }
        }
        int i17 = range.f327742d;
        if (i17 < 0) {
            i17 = 0;
        }
        int i18 = range.f327743e;
        int size = i18 < 0 ? arrayList.size() : i18 + 1;
        int size2 = arrayList.size();
        java.util.List list2 = l0Var.f394244b;
        if (i17 >= size2 || size > arrayList.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("[FTSNativeGlobalTeach] FTSTeachVerticalEntryViewItem", "expose check skip total:" + list2.size() + " visible:" + arrayList.size() + " start:" + i17 + " end:" + size);
        } else {
            list2.size();
            arrayList.size();
            java.util.Iterator it = arrayList.subList(i17, size).iterator();
            while (it.hasNext()) {
                ((rv4.c0) ((mv4.j) it.next())).w();
            }
        }
        return jz5.f0.f384359a;
    }
}
