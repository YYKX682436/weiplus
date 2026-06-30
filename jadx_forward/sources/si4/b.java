package si4;

/* loaded from: classes8.dex */
public final class b implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27542x81456939.markStatusReadCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489848c;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f489846a = str;
        this.f489847b = str2;
        this.f489848c = str3;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27542x81456939.markStatusReadCallback
    /* renamed from: complete */
    public final void mo117442xdc453139(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6 c27514xcee7dad6) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportStatusReadToBackend resp: result=");
        sb6.append(c27514xcee7dad6 != null ? java.lang.Boolean.valueOf(c27514xcee7dad6.m116897x2d64eb13()) : null);
        sb6.append(", errCode=");
        sb6.append(c27514xcee7dad6 != null ? java.lang.Integer.valueOf(c27514xcee7dad6.m116895x130a215f()) : null);
        sb6.append(", errMsg=");
        sb6.append(c27514xcee7dad6 != null ? c27514xcee7dad6.m116896xcf10fdcf() : null);
        sb6.append(", ");
        sb6.append(this.f489846a);
        sb6.append(", ");
        sb6.append(this.f489847b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", sb6.toString());
        boolean z17 = false;
        if (c27514xcee7dad6 != null && c27514xcee7dad6.m116897x2d64eb13()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap.KeySetView) si4.c.f489849c).remove(this.f489848c);
    }
}
