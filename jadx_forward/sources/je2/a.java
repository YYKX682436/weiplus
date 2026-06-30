package je2;

/* loaded from: classes10.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(r45.ee6 configData) {
        r45.di0 di0Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configData, "configData");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("targetType:" + configData.f454901d + ",outputRect:" + configData.f454903f.f455907d + '-' + configData.f454903f.f455908e + '-' + configData.f454903f.f455909f + '-' + configData.f454903f.f455910g + ",safeRect:" + configData.f454904g.f458592d + '-' + configData.f454904g.f458593e + '-' + configData.f454904g.f458594f + '-' + configData.f454904g.f458595g + ", editorItemScale:" + configData.f454902e);
        int i17 = configData.f454901d;
        if (i17 == 1) {
            r45.ei0 ei0Var = configData.f454905h;
            r45.ji0 ji0Var = (ei0Var == null || (linkedList2 = ei0Var.f455062d) == null) ? null : (r45.ji0) kz5.n0.Z(linkedList2);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("\ttext xPercent:");
            sb7.append(ji0Var != null ? java.lang.Float.valueOf(ji0Var.f459355d) : null);
            sb7.append(",yPercent:");
            sb7.append(ji0Var != null ? java.lang.Float.valueOf(ji0Var.f459356e) : null);
            sb7.append(",scale:");
            sb7.append(ji0Var != null ? java.lang.Float.valueOf(ji0Var.f459360i) : null);
            sb6.append(sb7.toString());
        } else if (i17 == 2) {
            r45.ei0 ei0Var2 = configData.f454905h;
            r45.gi0 gi0Var = (ei0Var2 == null || (linkedList = ei0Var2.f455063e) == null) ? null : (r45.gi0) kz5.n0.Z(linkedList);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("\tpicture xPercent:");
            sb8.append(gi0Var != null ? java.lang.Float.valueOf(gi0Var.f456801d) : null);
            sb8.append(",yPercent:");
            sb8.append(gi0Var != null ? java.lang.Float.valueOf(gi0Var.f456802e) : null);
            sb8.append(",scale:");
            sb8.append(gi0Var != null ? java.lang.Float.valueOf(gi0Var.f456803f) : null);
            sb8.append(",enable scale:");
            if (gi0Var != null && (di0Var = gi0Var.f456809o) != null) {
                r5 = java.lang.Boolean.valueOf(di0Var.f454035d);
            }
            sb8.append(r5);
            sb6.append(sb8.toString());
        }
        java.lang.String sb9 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "toString(...)");
        return sb9;
    }

    public final java.lang.String b(r45.ei0 ei0Var) {
        if (ei0Var == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.LinkedList linkedList = ei0Var.f455062d;
        if (linkedList != null) {
            int i17 = 0;
            for (java.lang.Object obj : linkedList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.ji0 ji0Var = (r45.ji0) obj;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
                sb7.append(i17);
                sb7.append(':');
                sb7.append(ji0Var.f459362n);
                sb7.append(",stickerId:");
                r45.kp kpVar = ji0Var.f459367s;
                sb7.append(kpVar != null ? kpVar.f460420d : null);
                sb7.append(",xPercent:");
                sb7.append(ji0Var.f459355d);
                sb7.append(",yPercent:");
                sb7.append(ji0Var.f459356e);
                sb7.append(",scale:");
                sb7.append(ji0Var.f459360i);
                sb7.append(",width:");
                sb7.append(ji0Var.f459363o);
                sb7.append(",height:");
                sb7.append(ji0Var.f459364p);
                sb7.append(';');
                sb6.append(sb7.toString());
                i17 = i18;
            }
        }
        java.util.LinkedList linkedList2 = ei0Var.f455063e;
        if (linkedList2 != null) {
            int i19 = 0;
            for (java.lang.Object obj2 : linkedList2) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.gi0 gi0Var = (r45.gi0) obj2;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("pic");
                sb8.append(i19);
                sb8.append(':');
                sb8.append(gi0Var.f456805h);
                sb8.append(",stickerId:");
                r45.kp kpVar2 = gi0Var.f456810p;
                sb8.append(kpVar2 != null ? kpVar2.f460420d : null);
                sb8.append(",xPercent:");
                sb8.append(gi0Var.f456801d);
                sb8.append(",yPercent:");
                sb8.append(gi0Var.f456802e);
                sb8.append(",scale:");
                sb8.append(gi0Var.f456803f);
                sb8.append(",width:");
                sb8.append(gi0Var.f456807m);
                sb8.append(",height:");
                sb8.append(gi0Var.f456808n);
                sb8.append(';');
                sb6.append(sb8.toString());
                i19 = i27;
            }
        }
        java.lang.String sb9 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "toString(...)");
        return sb9;
    }

    public final java.lang.String c(java.util.LinkedList linkedList) {
        int i17 = 0;
        if (linkedList == null || linkedList.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.Object obj : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append("index:" + i17 + ",resource:" + je2.g.f380753u.d((r45.h84) obj) + ";\t");
            i17 = i18;
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String d(r45.h84 h84Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h84Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
        sb6.append(h84Var.m75945x2fec8307(0));
        sb6.append(",name:");
        sb6.append(h84Var.m75945x2fec8307(1));
        sb6.append(",thumbUrl:");
        sb6.append(h84Var.m75945x2fec8307(2));
        sb6.append(",businessData:");
        sb6.append(h84Var.m75945x2fec8307(5));
        sb6.append(",firstMediaMd5:");
        java.util.LinkedList m75941xfb821914 = h84Var.m75941xfb821914(4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMedia(...)");
        r45.g84 g84Var = (r45.g84) kz5.n0.Z(m75941xfb821914);
        sb6.append(g84Var != null ? g84Var.m75945x2fec8307(2) : null);
        java.lang.String sb7 = new java.lang.StringBuilder(sb6.toString()).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
