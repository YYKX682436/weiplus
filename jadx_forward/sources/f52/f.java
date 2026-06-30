package f52;

/* loaded from: classes15.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public f52.e f341165a;

    public static void a(r45.c2 c2Var, r45.b2 b2Var, boolean z17) {
        if (b2Var == null) {
            return;
        }
        r45.vk6 vk6Var = new r45.vk6();
        vk6Var.f469859d = z17;
        vk6Var.f469860e.addLast(b2Var);
        if (c2Var == null) {
            c2Var = new r45.c2();
        }
        c2Var.f452769d.addLast(vk6Var);
    }

    public static nm5.b c(r45.c2 c2Var, r45.b2 b2Var) {
        if (c2Var != null) {
            java.util.LinkedList linkedList = c2Var.f452769d;
            if (!linkedList.isEmpty() && b2Var != null) {
                for (int size = linkedList.size() - 1; size >= 0; size--) {
                    r45.vk6 vk6Var = (r45.vk6) linkedList.get(size);
                    if (vk6Var != null) {
                        java.util.LinkedList linkedList2 = vk6Var.f469860e;
                        if (linkedList2.isEmpty()) {
                            continue;
                        } else {
                            for (int size2 = linkedList2.size() - 1; size2 >= 0; size2--) {
                                r45.b2 b2Var2 = (r45.b2) linkedList2.get(size2);
                                if (b2Var2 != null && f52.g.a(b2Var.f451967d, b2Var2.f451967d)) {
                                    return nm5.j.c(vk6Var, java.lang.Integer.valueOf(size));
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void f(r45.c2 c2Var, r45.b2 b2Var) {
        boolean isEmpty = c2Var.f452769d.isEmpty();
        java.util.LinkedList linkedList = c2Var.f452769d;
        r45.vk6 vk6Var = !isEmpty ? (r45.vk6) linkedList.getLast() : null;
        if (vk6Var == null) {
            vk6Var = new r45.vk6();
            linkedList.addLast(vk6Var);
        }
        vk6Var.f469860e.addLast(b2Var);
    }

    public static nm5.b g(r45.c2 c2Var, java.lang.String str, int i17) {
        java.util.LinkedList linkedList;
        int size;
        if (!android.text.TextUtils.isEmpty(str) && c2Var != null && (size = (linkedList = c2Var.f452769d).size()) > 0) {
            int i18 = -1;
            int i19 = -1;
            for (int i27 = size - 1; i27 >= 0; i27--) {
                r45.vk6 vk6Var = (r45.vk6) linkedList.get(i27);
                int size2 = vk6Var.f469860e.size() - 1;
                while (true) {
                    if (size2 >= 0) {
                        r45.bn6 bn6Var = ((r45.b2) vk6Var.f469860e.get(size2)).f451967d;
                        java.lang.String str2 = bn6Var.f452433d;
                        int i28 = bn6Var.f452434e;
                        if (str.equals(str2)) {
                            i18 = i27;
                            i19 = size2;
                            break;
                        }
                        size2--;
                    }
                }
            }
            return i18 == -1 ? nm5.j.c(-1, -1) : nm5.j.c(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
        return nm5.j.c(-1, -1);
    }

    public final r45.b2 b(r45.c2 c2Var) {
        if (c2Var == null) {
            return null;
        }
        java.util.LinkedList linkedList = c2Var.f452769d;
        r45.vk6 vk6Var = !linkedList.isEmpty() ? (r45.vk6) linkedList.getLast() : null;
        if (vk6Var == null) {
            return null;
        }
        java.util.LinkedList linkedList2 = vk6Var.f469860e;
        if (linkedList2.isEmpty()) {
            return null;
        }
        return (r45.b2) linkedList2.getLast();
    }

    public final boolean d(r45.c2 c2Var) {
        if (c2Var == null) {
            return false;
        }
        java.util.LinkedList linkedList = c2Var.f452769d;
        r45.vk6 vk6Var = !linkedList.isEmpty() ? (r45.vk6) linkedList.getLast() : null;
        return vk6Var != null && vk6Var.f469859d;
    }

    public final void e(r45.c2 c2Var, int i17, r45.b2 b2Var) {
        java.util.LinkedList linkedList;
        if (c2Var == null) {
            return;
        }
        java.util.LinkedList linkedList2 = c2Var.f452769d;
        r45.vk6 vk6Var = (r45.vk6) linkedList2.getLast();
        int size = vk6Var.f469860e.size();
        if (i17 < 0 || i17 >= size) {
            return;
        }
        while (true) {
            size--;
            linkedList = vk6Var.f469860e;
            if (size < i17) {
                break;
            }
            r45.b2 b2Var2 = (r45.b2) linkedList.remove(size);
            f52.e eVar = this.f341165a;
            if (eVar != null) {
                b2Var2.f451967d.f452435f = b2Var.f451967d.f452435f;
                ((a52.c) eVar).a(b2Var2, b2Var);
            }
        }
        if (!linkedList.isEmpty() || linkedList2.isEmpty()) {
            return;
        }
        linkedList2.removeLast();
    }
}
