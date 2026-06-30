package pf3;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final pf3.d f435345a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f435346b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f435347c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f435348d;

    public b(pf3.d opLayer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opLayer, "opLayer");
        this.f435345a = opLayer;
        this.f435346b = new java.util.LinkedHashSet();
        this.f435347c = new java.util.LinkedHashSet();
        this.f435348d = new java.util.LinkedHashSet();
    }

    public final void a(pf3.d layer) {
        pf3.d dVar;
        java.util.Map map;
        java.util.Iterator it;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layer, "layer");
        java.util.Map map2 = layer.f435354p;
        java.util.Iterator it6 = ((java.util.LinkedHashMap) map2).entrySet().iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            dVar = this.f435345a;
            map = layer.f435355q;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            android.view.View view = (android.view.View) entry.getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            java.util.Iterator it7 = it6;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/media/common/BaseOperationLayer$VisibilityRefreshTask", "execute", "(Lcom/tencent/mm/plugin/media/common/BaseOperationLayer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/media/common/BaseOperationLayer$VisibilityRefreshTask", "execute", "(Lcom/tencent/mm/plugin/media/common/BaseOperationLayer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setEnabled(true);
            yz5.l lVar = (yz5.l) ((java.util.LinkedHashMap) map).get(str);
            if (lVar != null) {
                lVar.mo146xb9724478(8);
            }
            dVar.O("GONE " + str, new java.lang.Object[0]);
            it6 = it7;
        }
        java.util.Iterator it8 = this.f435346b.iterator();
        while (it8.hasNext()) {
            android.view.View view2 = (android.view.View) it8.next();
            java.lang.String V = layer.V(view2);
            if (map2.containsKey(V)) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                it = it8;
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/media/common/BaseOperationLayer$VisibilityRefreshTask", "execute", "(Lcom/tencent/mm/plugin/media/common/BaseOperationLayer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/media/common/BaseOperationLayer$VisibilityRefreshTask", "execute", "(Lcom/tencent/mm/plugin/media/common/BaseOperationLayer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yz5.l lVar2 = (yz5.l) ((java.util.LinkedHashMap) map).get(V);
                if (lVar2 != null) {
                    lVar2.mo146xb9724478(0);
                }
                dVar.O("VISIBLE " + V, new java.lang.Object[0]);
            } else {
                it = it8;
            }
            it8 = it;
        }
        for (android.view.View view3 : this.f435348d) {
            java.lang.String V2 = layer.V(view3);
            if (map2.containsKey(V2)) {
                view3.setEnabled(false);
                dVar.O("DISABLED " + V2, new java.lang.Object[0]);
            }
        }
        for (android.view.View view4 : this.f435347c) {
            java.lang.String V3 = layer.V(view4);
            if (map2.containsKey(V3)) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/media/common/BaseOperationLayer$VisibilityRefreshTask", "execute", "(Lcom/tencent/mm/plugin/media/common/BaseOperationLayer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/media/common/BaseOperationLayer$VisibilityRefreshTask", "execute", "(Lcom/tencent/mm/plugin/media/common/BaseOperationLayer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yz5.l lVar3 = (yz5.l) ((java.util.LinkedHashMap) map).get(V3);
                if (lVar3 != null) {
                    lVar3.mo146xb9724478(4);
                }
                dVar.O("INVISIBLE " + V3, new java.lang.Object[0]);
            }
        }
    }

    public final void b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f435347c.add(view);
    }

    public final void c(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f435346b.add(view);
    }
}
