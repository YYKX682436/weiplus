package k31;

/* loaded from: classes9.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k31.a f385381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l31.b f385382e;

    public n(k31.a aVar, l31.b bVar) {
        this.f385381d = aVar;
        this.f385382e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String valueOf = java.lang.String.valueOf(this.f385381d.hashCode());
        k31.o oVar = k31.o.f385383a;
        java.util.HashMap hashMap = k31.o.f385384b;
        java.lang.String str = (java.lang.String) hashMap.get(valueOf);
        if (str == null) {
            str = "SubscribeMsgTask" + valueOf;
            hashMap.put(valueOf, str);
        }
        l31.b bVar = this.f385382e;
        bVar.hashCode();
        boolean z17 = bVar.f396848c;
        java.util.HashMap hashMap2 = k31.o.f385385c;
        if (z17 && bVar.f396847b) {
            java.util.List<l31.b> list = (java.util.List) hashMap2.get(bVar.b());
            if (list != null) {
                list.size();
            }
            if (list != null) {
                for (l31.b bVar2 : list) {
                    bVar2.hashCode();
                    bVar2.a();
                }
            }
            if (list != null) {
                list.clear();
            }
        }
        java.util.List list2 = (java.util.List) hashMap2.get(bVar.b());
        if (list2 == null || list2.isEmpty()) {
            list2 = new java.util.ArrayList();
        }
        if (list2 != null) {
            list2.add(bVar);
        }
        java.lang.String b17 = bVar.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list2);
        hashMap2.put(b17, list2);
        k31.o.f385386d.put(java.lang.Long.valueOf(bVar.hashCode()), bVar);
        ((ku5.t0) ku5.t0.f394148d).h(new k31.m(this.f385382e), str);
    }
}
