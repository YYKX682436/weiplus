package s1;

/* loaded from: classes14.dex */
public abstract class s0 {
    public static int a(s1.t0 t0Var, s1.u receiver, java.util.List measurables, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "receiver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        java.util.ArrayList arrayList = new java.util.ArrayList(measurables.size());
        int size = measurables.size();
        for (int i18 = 0; i18 < size; i18++) {
            arrayList.add(new s1.q((s1.t) measurables.get(i18), s1.v.Max, s1.w.Height));
        }
        return t0Var.d(new s1.x(receiver, receiver.mo7007x6fcfed3f()), arrayList, p2.d.b(0, i17, 0, 0, 13, null)).mo126531x1c4fb41d();
    }

    public static int b(s1.t0 t0Var, s1.u receiver, java.util.List measurables, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "receiver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        java.util.ArrayList arrayList = new java.util.ArrayList(measurables.size());
        int size = measurables.size();
        for (int i18 = 0; i18 < size; i18++) {
            arrayList.add(new s1.q((s1.t) measurables.get(i18), s1.v.Max, s1.w.Width));
        }
        return t0Var.d(new s1.x(receiver, receiver.mo7007x6fcfed3f()), arrayList, p2.d.b(0, 0, 0, i17, 7, null)).mo126532x755bd410();
    }

    public static int c(s1.t0 t0Var, s1.u receiver, java.util.List measurables, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "receiver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        java.util.ArrayList arrayList = new java.util.ArrayList(measurables.size());
        int size = measurables.size();
        for (int i18 = 0; i18 < size; i18++) {
            arrayList.add(new s1.q((s1.t) measurables.get(i18), s1.v.Min, s1.w.Height));
        }
        return t0Var.d(new s1.x(receiver, receiver.mo7007x6fcfed3f()), arrayList, p2.d.b(0, i17, 0, 0, 13, null)).mo126531x1c4fb41d();
    }

    public static int d(s1.t0 t0Var, s1.u receiver, java.util.List measurables, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "receiver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        java.util.ArrayList arrayList = new java.util.ArrayList(measurables.size());
        int size = measurables.size();
        for (int i18 = 0; i18 < size; i18++) {
            arrayList.add(new s1.q((s1.t) measurables.get(i18), s1.v.Min, s1.w.Width));
        }
        return t0Var.d(new s1.x(receiver, receiver.mo7007x6fcfed3f()), arrayList, p2.d.b(0, 0, 0, i17, 7, null)).mo126532x755bd410();
    }
}
