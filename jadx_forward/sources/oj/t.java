package oj;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f427252a;

    public t(java.util.List list) {
        this.f427252a = list;
    }

    /* renamed from: equals */
    public boolean m151474xb2c87fbf(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof oj.t) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427252a, ((oj.t) obj).f427252a);
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m151475x8cdac1b() {
        java.util.List list = this.f427252a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m151476x9616526c() {
        java.lang.String str = "\n";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n");
        java.lang.String str2 = "%8s %8s %8s %8s %8s %8s %8s %8s %8s %8s     %s";
        java.lang.String format = java.lang.String.format("%8s %8s %8s %8s %8s %8s %8s %8s %8s %8s     %s", java.util.Arrays.copyOf(new java.lang.Object[]{"PSS", "RSS", "SIZE", "SWAP_PSS", "SH_C", "SH_D", "PRI_C", "PRI_D", "COUNT", "PERM", "NAME"}, 11));
        java.lang.String str3 = "java.lang.String.format(format, *args)";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "java.lang.String.format(format, *args)");
        sb6.append(format);
        sb6.append("\n");
        java.lang.String format2 = java.lang.String.format("%8s %8s %8s %8s %8s %8s %8s %8s %8s %8s     %s", java.util.Arrays.copyOf(new java.lang.Object[]{"----", "----", "----", "----", "----", "----", "----", "----", "----", "----", "----"}, 11));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "java.lang.String.format(format, *args)");
        sb6.append(format2);
        sb6.append("\n");
        java.util.List list = this.f427252a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        for (java.util.Iterator it = list.iterator(); it.hasNext(); it = it) {
            oj.d0 d0Var = (oj.d0) it.next();
            java.lang.String str4 = d0Var.f427221a;
            java.lang.String str5 = d0Var.f427222b;
            long j17 = d0Var.f427223c;
            long j18 = d0Var.f427224d;
            long j19 = d0Var.f427225e;
            java.lang.String str6 = str2;
            long j27 = d0Var.f427226f;
            long j28 = d0Var.f427227g;
            java.lang.String str7 = str;
            long j29 = d0Var.f427228h;
            java.lang.String str8 = str3;
            long j37 = d0Var.f427229i;
            long j38 = d0Var.f427230j;
            java.lang.String format3 = java.lang.String.format(str6, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(d0Var.f427231k), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), java.lang.Long.valueOf(j37), java.lang.Long.valueOf(j38), java.lang.Long.valueOf(j17), str5, str4}, 11));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format3, str8);
            sb6.append(format3);
            str = str7;
            sb6.append(str);
            str2 = str6;
            str3 = str8;
        }
        java.lang.String format4 = java.lang.String.format(str2, java.util.Arrays.copyOf(new java.lang.Object[]{"----", "----", "----", "----", "----", "----", "----", "----", "----", "----", "----"}, 11));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format4, str3);
        sb6.append(format4);
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "sb.toString()");
        return sb7;
    }
}
