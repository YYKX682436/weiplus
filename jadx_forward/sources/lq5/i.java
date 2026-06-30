package lq5;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f402015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c f402016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f402017f;

    public i(int i17, com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c c22936xbad5951c, java.util.List list) {
        this.f402015d = i17;
        this.f402016e = c22936xbad5951c;
        this.f402017f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f402015d;
        if (i17 >= 0 && i17 <= this.f402016e.m83474xb747914f()) {
            com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c c22936xbad5951c = this.f402016e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c22936xbad5951c, arrayList.toArray(), "com/tencent/mm/wepicker/WePicker$setData$1$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            c22936xbad5951c.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c22936xbad5951c, "com/tencent/mm/wepicker/WePicker$setData$1$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            return;
        }
        if (i17 < this.f402017f.size()) {
            com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c c22936xbad5951c2 = this.f402016e;
            int showSize = (i17 + c22936xbad5951c2.getShowSize()) - 1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(showSize));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c22936xbad5951c2, arrayList2.toArray(), "com/tencent/mm/wepicker/WePicker$setData$1$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            c22936xbad5951c2.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c22936xbad5951c2, "com/tencent/mm/wepicker/WePicker$setData$1$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }
}
