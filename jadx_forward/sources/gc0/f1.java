package gc0;

/* loaded from: classes5.dex */
public abstract class f1 {
    public static final r45.b90 a(java.util.LinkedList linkedList, java.lang.String str) {
        java.lang.Object obj;
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.b90) obj).m75945x2fec8307(0), str)) {
                break;
            }
        }
        r45.b90 b90Var = (r45.b90) obj;
        if (b90Var != null) {
            return b90Var;
        }
        r45.b90 b90Var2 = new r45.b90();
        b90Var2.set(0, str);
        linkedList.add(b90Var2);
        return b90Var2;
    }

    public static final gc0.i3 b(r45.ml5 ml5Var, java.lang.String content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ml5Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        java.util.LinkedList m75941xfb821914 = ml5Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getPhone(...)");
        java.util.LinkedList m75941xfb8219142 = ml5Var.m75941xfb821914(5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getPhoneInfo(...)");
        return d(content, m75941xfb821914, m75941xfb8219142);
    }

    public static final gc0.i3 c(r45.ml5 ml5Var, java.lang.String content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ml5Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        java.util.LinkedList m75941xfb821914 = ml5Var.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRemark(...)");
        java.util.LinkedList m75941xfb8219142 = ml5Var.m75941xfb821914(4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getRemarkInfo(...)");
        return d(content, m75941xfb821914, m75941xfb8219142);
    }

    public static final gc0.i3 d(java.lang.String str, java.util.List list, java.util.LinkedList linkedList) {
        if (list.contains(str)) {
            return new gc0.i3(true, null);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.b90 b90Var = (r45.b90) it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b90Var.m75945x2fec8307(0), str)) {
                return new gc0.i3(false, b90Var);
            }
        }
        r45.b90 b90Var2 = new r45.b90();
        b90Var2.set(0, str);
        linkedList.add(b90Var2);
        return new gc0.i3(false, b90Var2);
    }
}
