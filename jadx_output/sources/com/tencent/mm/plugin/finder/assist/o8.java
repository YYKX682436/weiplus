package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class o8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.o8 f102432d = new com.tencent.mm.plugin.finder.assist.o8();

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList;
        synchronized (com.tencent.mm.plugin.finder.assist.p8.f102460a) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.ArrayList arrayList2 = com.tencent.mm.plugin.finder.assist.p8.f102461b;
            r45.nd6 nd6Var = (r45.nd6) kz5.n0.Z(arrayList2);
            long j17 = nd6Var != null ? nd6Var.getLong(2) : 0L;
            r45.nd6 nd6Var2 = (r45.nd6) kz5.n0.k0(arrayList2);
            long j18 = (nd6Var2 != null ? nd6Var2.getLong(2) : 0L) - j17;
            java.util.Iterator it = arrayList2.iterator();
            int i17 = 0;
            while (true) {
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.nd6 nd6Var3 = (r45.nd6) next;
                    if (i17 > 0) {
                        java.lang.Object obj = com.tencent.mm.plugin.finder.assist.p8.f102461b.get(i17 - 1);
                        kotlin.jvm.internal.o.f(obj, "get(...)");
                        r45.nd6 nd6Var4 = (r45.nd6) obj;
                        float f17 = j18 != 0 ? (((float) (nd6Var3.getLong(2) - nd6Var4.getLong(2))) * 100.0f) / ((float) j18) : 0.0f;
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(nd6Var3.getString(1));
                        sb7.append(':');
                        sb7.append(nd6Var3.getLong(2) - nd6Var4.getLong(2));
                        sb7.append("ms,");
                        java.lang.String format = java.lang.String.format("%.1f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f17)}, 1));
                        kotlin.jvm.internal.o.f(format, "format(...)");
                        sb7.append(format);
                        sb7.append("%\n");
                        sb6.append(sb7.toString());
                    } else {
                        sb6.append("Total Cost:" + j18 + "ms... start at " + nd6Var3.getLong(2) + "\n " + nd6Var3.getString(1) + '\n');
                    }
                    i17 = i18;
                } else {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append("end at ");
                    arrayList = com.tencent.mm.plugin.finder.assist.p8.f102461b;
                    r45.nd6 nd6Var5 = (r45.nd6) kz5.n0.k0(arrayList);
                    sb8.append(nd6Var5 != null ? java.lang.Long.valueOf(nd6Var5.getLong(2)) : null);
                    sb6.append(sb8.toString());
                    java.lang.String sb9 = sb6.toString();
                    kotlin.jvm.internal.o.f(sb9, "toString(...)");
                    com.tencent.mm.plugin.finder.assist.p8.f102462c = sb9;
                    com.tencent.mars.xlog.Log.i("Finder.LiveAnchorFlowStats", java.lang.String.valueOf(sb6));
                }
            }
        }
        com.tencent.mm.plugin.finder.assist.p8 p8Var = com.tencent.mm.plugin.finder.assist.p8.f102460a;
        arrayList.clear();
    }
}
