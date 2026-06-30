package i33;

/* loaded from: classes10.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.a0 f369827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f369828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f369829f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f369830g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f369831h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f369832i;

    public z(i33.a0 a0Var, java.util.Set set, boolean z17, boolean z18, java.util.Set set2, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        this.f369827d = a0Var;
        this.f369828e = set;
        this.f369829f = z17;
        this.f369830g = z18;
        this.f369831h = set2;
        this.f369832i = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14;
        i33.a0 a0Var = this.f369827d;
        yz5.a aVar = a0Var.f369678g;
        e33.b0 b0Var = aVar != null ? (e33.b0) aVar.mo152xb9724478() : null;
        java.lang.String str = a0Var.f369677f;
        if (b0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "removeDeleted: ui failed");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = b0Var.f328664g;
        boolean removeAll = arrayList.removeAll(this.f369828e);
        boolean z17 = this.f369830g;
        boolean z18 = this.f369829f;
        if (z18) {
            i33.l1.x3(a0Var, ((v23.b) ((java.util.ArrayList) a0Var.f369682n).get(0)).f514419a, true, null, 4, null);
        } else if (z17) {
            java.util.ArrayList arrayList2 = b0Var.f328663f;
            java.util.Set set = this.f369831h;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumAdapter", "removeMediaItems: removeSelect=%s, removeMedia=%s, delete count=%s, MediaItems size=%s, SelectItems size=%s", java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(arrayList2.removeAll(set)), java.lang.Integer.valueOf(set.size()), java.lang.Integer.valueOf(arrayList2.size()), java.lang.Integer.valueOf(arrayList.size()));
            b0Var.m8146xced61ae5();
        }
        yz5.a aVar2 = a0Var.f369680i;
        if (aVar2 != null && (c15655x4db85b14 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14) aVar2.mo152xb9724478()) != null) {
            c15655x4db85b14.b(a0Var.f369682n, a0Var.f369684p);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "removeDeleted: ui " + z18 + ", " + z17 + ", " + this.f369832i.f391645d + ", " + removeAll + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
    }
}
