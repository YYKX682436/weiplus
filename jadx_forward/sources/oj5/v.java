package oj5;

/* loaded from: classes8.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f427427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oj5.w f427428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f427429f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oj5.b0 f427430g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f427431h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f427432i;

    public v(java.util.List list, oj5.w wVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, oj5.b0 b0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f427427d = list;
        this.f427428e = wVar;
        this.f427429f = c0Var;
        this.f427430g = b0Var;
        this.f427431h = f2Var;
        this.f427432i = c1163xf1deaba4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m143895xf1229813;
        oj5.b0 b0Var = this.f427430g;
        java.util.List<int[]> list = this.f427427d;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            for (int[] iArr : list) {
                if (this.f427429f.f391645d) {
                    return;
                }
                int i17 = iArr[1];
                java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) b0Var.f427369c.get(java.lang.Integer.valueOf(iArr[0]));
                int size = concurrentLinkedDeque != null ? concurrentLinkedDeque.size() : 0;
                if (i17 > 0 && size < i17) {
                    int i18 = i17 - size;
                    for (int i19 = 0; i19 < i18; i19++) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m8142xeac316cd = this.f427431h.m8142xeac316cd(this.f427432i, iArr[0]);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m8142xeac316cd, "createViewHolder(...)");
                        b0Var.d(m8142xeac316cd);
                    }
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("[supportPreCreateView] cost=");
            sb6.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
            sb6.append("ms types=");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (int[] iArr2 : list) {
                arrayList.add(iArr2[0] + " => " + iArr2[1]);
            }
            sb6.append(arrayList);
            sb6.append(" tag=");
            sb6.append(this.f427428e.hashCode());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicViewCacheEx", sb6.toString());
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DynamicViewCacheEx", m143898xd4a2fc34, "", new java.lang.Object[0]);
        }
    }
}
