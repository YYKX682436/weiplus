package i13;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final i13.l f368830c = new i13.l(null);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f368831d = jz5.h.b(i13.k.f368828d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f368832a = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f368833b = new java.util.HashSet();

    public n(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(i13.c item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.util.HashSet hashSet = this.f368833b;
        java.lang.String str = item.f368808d;
        if (!hashSet.contains(str)) {
            this.f368832a.offer(item);
            hashSet.add(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ForceNotifyItemMgr", "add info failed, historyIdSet contains " + str);
        }
    }
}
