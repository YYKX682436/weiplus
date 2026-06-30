package ns2;

/* loaded from: classes2.dex */
public abstract class o implements ns2.l {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f420947a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f420948b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f420949c;

    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, java.util.List list, java.util.List list2, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        componentCallbacksC1101xa17d4670 = (i17 & 2) != 0 ? null : componentCallbacksC1101xa17d4670;
        list = (i17 & 4) != 0 ? null : list;
        list2 = (i17 & 8) != 0 ? null : list2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f420947a = activity;
        this.f420948b = componentCallbacksC1101xa17d4670;
        this.f420949c = new java.util.ArrayList();
        b(list2, list);
    }

    public void b(java.util.List list, java.util.List list2) {
        android.view.View findViewById;
        java.util.List list3 = this.f420949c;
        if (list != null) {
            ((java.util.ArrayList) list3).addAll(list);
        }
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f420948b;
                if (componentCallbacksC1101xa17d4670 != null) {
                    android.view.View m7474xfb86a31b = componentCallbacksC1101xa17d4670.m7474xfb86a31b();
                    findViewById = m7474xfb86a31b != null ? m7474xfb86a31b.findViewById(intValue) : null;
                } else {
                    findViewById = this.f420947a.findViewById(intValue);
                }
                if (findViewById != null) {
                    ((java.util.ArrayList) list3).add(findViewById);
                }
            }
        }
    }
}
