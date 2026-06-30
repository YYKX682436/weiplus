package wh;

/* loaded from: classes7.dex */
public abstract class f {
    public static void a(java.lang.String tag, java.lang.String splitTag, java.lang.String text, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 8) != 0) {
            i17 = 15000;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(splitTag, "splitTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        if (text.length() <= i17) {
            oj.j.c(tag, text, new java.lang.Object[0]);
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) r26.p0.x0(text, i17);
        int size = arrayList.size();
        java.util.Iterator it = arrayList.iterator();
        int i19 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            oj.j.c(tag, "\nLOG_SPLIT of " + splitTag + '(' + i27 + '/' + size + ") <<BGN\n" + ((java.lang.String) next) + "\nLOG_SPLIT of " + splitTag + '(' + i19 + '/' + size + ") END>>\n", new java.lang.Object[0]);
            i19 = i27;
        }
    }
}
