package nd4;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final nd4.e f418009a = new nd4.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f418010b = new java.util.HashMap();

    public final android.view.View a(java.lang.Class clazz, android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("obtainView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.HashMap hashMap = f418010b;
        java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(clazz.getName());
        if (!(arrayList != null && (arrayList.isEmpty() ^ true))) {
            java.lang.Object newInstance = clazz.getConstructor(android.content.Context.class).newInstance(context);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newInstance, "newInstance(...)");
            android.view.View view = (android.view.View) newInstance;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("obtainView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
            return view;
        }
        java.lang.Object obj = hashMap.get(clazz.getName());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        java.lang.Object remove = ((java.util.ArrayList) obj).remove(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(remove, "null cannot be cast to non-null type T of com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool.obtainView");
        android.view.View view2 = (android.view.View) remove;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("obtainView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
        return view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("recycleView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
        if (view == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recycleView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
            return;
        }
        if (view.getParent() != null) {
            android.view.ViewParent parent = view.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(view);
        }
        if (view instanceof nd4.d) {
            ((nd4.d) view).mo71016x6761d4f();
        }
        java.lang.String name = view.getClass().getName();
        java.util.HashMap hashMap = f418010b;
        if (!hashMap.containsKey(name)) {
            hashMap.put(name, new java.util.ArrayList());
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(name);
        if (arrayList != null) {
            arrayList.add(view);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recycleView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
    }
}
