package pp1;

/* loaded from: classes14.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f438975d;

    public v(pp1.z zVar) {
        this.f438975d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pp1.z zVar = this.f438975d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = zVar.f438981f;
        if (c12917x19ac03e7 != null && c12917x19ac03e7.A) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12916x4253bec6 c12916x4253bec6 = zVar.f438979d;
            if (c12916x4253bec6 != null) {
                int size = zVar.f438984i.size() - 1;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(size));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c12916x4253bec6, arrayList.toArray(), "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2$onFloatBallInfoChanged$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                c12916x4253bec6.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(c12916x4253bec6, "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2$onFloatBallInfoChanged$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12916x4253bec6 c12916x4253bec62 = zVar.f438979d;
            if (c12916x4253bec62 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(c12916x4253bec62, arrayList2.toArray(), "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2$onFloatBallInfoChanged$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                c12916x4253bec62.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(c12916x4253bec62, "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2$onFloatBallInfoChanged$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        pp1.z.c(zVar);
    }
}
