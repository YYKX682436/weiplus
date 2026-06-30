package ib2;

/* loaded from: classes2.dex */
public final class z implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ib2.i0 f371713a;

    public z(ib2.i0 i0Var) {
        this.f371713a = i0Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    /* renamed from: onLoadMore */
    public boolean mo15402x1318b45a() {
        ib2.i0 i0Var = this.f371713a;
        i0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPaidCollectionPresenter", "requestLoadMore CgiFinderGetTopicFeed");
        so2.q6 q6Var = new so2.q6(null, 0, 0L, null, 0L, 0, null, null, 255, null);
        r45.vx0 vx0Var = i0Var.f371657f;
        int m75939xb282bd08 = vx0Var != null ? vx0Var.m75939xb282bd08(21) : 0;
        q6Var.f492089b = m75939xb282bd08;
        if (m75939xb282bd08 <= 0) {
            q6Var.f492089b = 16;
        }
        r45.vx0 vx0Var2 = i0Var.f371657f;
        q6Var.f492092e = vx0Var2 != null ? vx0Var2.m75942xfb822ef2(0) : 0L;
        q6Var.f492088a = i0Var.f371658g;
        p3325xe03a0797.p3326xc267989b.l.d(i0Var.f371656e, null, null, new ib2.g0(i0Var, q6Var, null), 3, null);
        return true;
    }
}
