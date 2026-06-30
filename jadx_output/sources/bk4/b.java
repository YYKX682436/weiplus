package bk4;

/* loaded from: classes11.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final int a(long j17, java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        int size = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                i17 = -1;
                break;
            }
            if (((pj4.n1) list.get(i17)).f355205m == j17) {
                break;
            }
            i17++;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.HistoryItemLoader", "getIndexByKey: index=" + i17 + ", key=" + j17 + ", listSize=" + list.size());
        return i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r20, android.content.Context r22) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bk4.b.b(long, android.content.Context):void");
    }
}
