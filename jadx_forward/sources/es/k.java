package es;

/* loaded from: classes14.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static es.j f337801a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f337802b = new java.util.LinkedList();

    public static void a(boolean z17, int i17) {
        es.j jVar = f337801a;
        if (jVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.n) jVar).getClass();
            al5.a3.a(z17, i17, true);
        }
        java.util.LinkedList linkedList = f337802b;
        if (linkedList.size() <= 0) {
            kd.c.e("MicroMsg.LiteAppSwipeBackHelper", "notifySettle callback stack empty!, open:%B, speed:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
            return;
        }
        es.i iVar = (es.i) ((java.lang.ref.WeakReference) linkedList.get(0)).get();
        if (iVar == null) {
            kd.c.e("MicroMsg.LiteAppSwipeBackHelper", "notifySettle null, open:%B, speed:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
            return;
        }
        com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150 activityC10454x40355150 = (com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150) iVar;
        if (activityC10454x40355150.f146492e == null) {
            activityC10454x40355150.f146492e = es.u.a(activityC10454x40355150.getWindow(), activityC10454x40355150.mo2533x106ab264().j());
        }
        android.view.View view = activityC10454x40355150.f146492e;
        if (z17) {
            es.g.a(view, i17 <= 0 ? 260L : 130L, 0.0f, 0.0f, null);
        } else {
            es.g.a(view, i17 <= 0 ? 260L : 130L, (view.getWidth() * (-1)) / 3.5f, 0.0f, null);
        }
        kd.c.d("MicroMsg.LiteAppSwipeBackHelper", "notifySettle, open:%B speed:%d callback:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), iVar);
    }

    public static void b(float f17) {
        es.j jVar = f337801a;
        if (jVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.n) jVar).getClass();
            al5.a3.b(f17);
        }
        java.util.LinkedList linkedList = f337802b;
        if (linkedList.size() <= 0) {
            kd.c.e("MicroMsg.LiteAppSwipeBackHelper", "notifySwipe callback stack empty!, scrollParent:%f", java.lang.Float.valueOf(f17));
            return;
        }
        es.i iVar = (es.i) ((java.lang.ref.WeakReference) linkedList.get(0)).get();
        if (iVar == null) {
            kd.c.e("MicroMsg.LiteAppSwipeBackHelper", "notifySwipe null, scrollParent:%f", java.lang.Float.valueOf(f17));
            return;
        }
        com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150 activityC10454x40355150 = (com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150) iVar;
        activityC10454x40355150.m43744xb052149b(f17);
        kd.c.d("MicroMsg.LiteAppSwipeBackHelper", "notifySwipe scrollParent:%f, callback:%s ", java.lang.Float.valueOf(f17), activityC10454x40355150);
    }
}
