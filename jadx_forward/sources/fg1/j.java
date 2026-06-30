package fg1;

/* loaded from: classes7.dex */
public final class j {
    public j(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i18 = i17 / 1000;
        int i19 = (i18 / 60) % 60;
        sb6.setLength(0);
        java.lang.String formatter = new java.util.Formatter(sb6, java.util.Locale.getDefault()).format("%02d:%02d:%02d", java.lang.Integer.valueOf(i18 / 3600), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18 % 60)).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(formatter, "toString(...)");
        return formatter;
    }

    public final long b(java.lang.String str) {
        java.util.Collection collection;
        java.lang.String valueOf = java.lang.String.valueOf(str);
        if (r26.n0.P(valueOf, ".", 0, false, 6, null) != -1) {
            valueOf = valueOf.substring(0, r26.n0.P(valueOf, ".", 0, false, 6, null));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(valueOf, "substring(...)");
        }
        java.util.List g17 = new r26.t(":").g(valueOf, 0);
        if (!g17.isEmpty()) {
            java.util.ListIterator listIterator = g17.listIterator(g17.size());
            while (listIterator.hasPrevious()) {
                if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                    collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = kz5.p0.f395529d;
        java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
        if (strArr.length == 3) {
            return ((java.lang.Long.parseLong(strArr[0]) * 3600) + (java.lang.Long.parseLong(strArr[1]) * 60) + java.lang.Long.parseLong(strArr[2])) * 1000;
        }
        throw new java.lang.IllegalArgumentException("Can't parse time string: ".concat(valueOf).toString());
    }
}
