package e43;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e43.e f330894a = new e43.e();

    public final java.util.List a(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        while (it.hasNext()) {
            w33.c cVar = (w33.c) it.next();
            java.lang.String str = cVar.f524243b.f524249b;
            if (!(str == null || str.length() == 0)) {
                int i28 = cVar.f524245d;
                if (i28 == 1) {
                    i17++;
                    i28 = i17;
                } else if (i28 == 101) {
                    i28 = i18 + 101;
                    i18++;
                } else if (i28 == 201) {
                    i28 = i19 + 201;
                    i19++;
                } else if (i28 == 701) {
                    i28 = i27 + 701;
                    i27++;
                }
                jz5.l topTip = cVar.f524242a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topTip, "topTip");
                w33.e user = cVar.f524243b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(user, "user");
                arrayList.add(new w33.c(topTip, user, cVar.f524244c, i28));
            }
        }
        return arrayList;
    }
}
