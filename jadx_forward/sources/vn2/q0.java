package vn2;

/* loaded from: classes2.dex */
public final class q0 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bo2.a f519896a;

    public q0(bo2.a aVar) {
        this.f519896a = aVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        bo2.a aVar;
        xn2.a aVar2;
        if (i17 != -1 || intent == null || (aVar = this.f519896a) == null || (aVar2 = (xn2.a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.b1) aVar).f202437a.get()) == null) {
            return;
        }
        long longExtra = intent.getLongExtra("key_see_later_data_key", 0L);
        xn2.p0 p0Var = (xn2.p0) aVar2;
        jz5.l lVar = vn2.u0.f519926g;
        if (lVar == null || longExtra != ((java.lang.Number) lVar.f384366d).longValue()) {
            return;
        }
        p0Var.j().i((java.util.List) lVar.f384367e, null);
        vn2.u0.f519926g = null;
    }
}
