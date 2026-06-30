package hy2;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f f367593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f367594e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f c15485xead19c2f, boolean z17) {
        this.f367593d = c15485xead19c2f;
        this.f367594e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = this.f367593d.f218265f.iterator();
        while (it.hasNext()) {
            hy2.e eVar = (hy2.e) ((iz2.a) it.next());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onEnjoyFinderOverLimit ");
            hy2.f fVar = eVar.f367587a;
            sb6.append(fVar.f367588d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeFloatPageUIC", sb6.toString());
            if (!fVar.f367588d) {
                jz2.x0.f384287a.b(fVar.m158354x19263085());
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_is_curfew", this.f367594e);
                intent.putExtra("key_finder_teen_mode_scene", fVar.f367590f);
                intent.setClass(fVar.m158354x19263085(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14095xead19c0c.class);
                fVar.m158354x19263085().startActivityForResult(intent, 11111);
            }
        }
    }
}
