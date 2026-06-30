package h2;

/* loaded from: classes13.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final h2.d a() {
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(localeList, "getDefault()");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = localeList.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.Locale locale = localeList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "localeList[i]");
            arrayList.add(new h2.a(locale));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i18 = 0; i18 < size2; i18++) {
            arrayList2.add(new h2.b((h2.e) arrayList.get(i18)));
        }
        return new h2.d(arrayList2);
    }
}
