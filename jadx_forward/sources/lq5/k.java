package lq5;

/* loaded from: classes8.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c f402020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f402021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f402022f;

    public k(com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c c22936xbad5951c, java.util.List list, int i17) {
        this.f402020d = c22936xbad5951c;
        this.f402021e = list;
        this.f402022f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List list = this.f402021e;
        com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c c22936xbad5951c = this.f402020d;
        c22936xbad5951c.mo7960x6cab2c8d(new lq5.h(list, c22936xbad5951c.getShowSize(), c22936xbad5951c.getTextColor(), c22936xbad5951c.getTextSideColor(), c22936xbad5951c.getTextSelectMedium(), c22936xbad5951c.getTextSize(), c22936xbad5951c.f295862g2, new lq5.j(c22936xbad5951c, this.f402021e)));
        int i17 = this.f402022f;
        if (i17 < 0) {
            i17 = 0;
        }
        com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c c22936xbad5951c2 = this.f402020d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c22936xbad5951c2, arrayList.toArray(), "com/tencent/mm/wepicker/WePicker$setData$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        c22936xbad5951c2.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c22936xbad5951c2, "com/tencent/mm/wepicker/WePicker$setData$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        yz5.l lVar = c22936xbad5951c.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(i17));
        }
    }
}
