package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f200997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14292x9b32d532 f200998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 f200999f;

    public q3(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14292x9b32d532 c14292x9b32d532, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 b4Var) {
        this.f200997d = c19792x256d2725;
        this.f200998e = c14292x9b32d532;
        this.f200999f = b4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14292x9b32d532 c14292x9b32d532 = this.f200998e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f200997d;
        if (c19792x256d2725 == null || !c14292x9b32d532.isShown()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAfterNextLiveInfoWidget", "paly live when feed = " + c19792x256d2725 + ", view isShown = " + c14292x9b32d532.isShown());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAfterNextLiveInfoWidget", "play Live");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 b4Var = this.f200999f;
        c50.m0 m0Var = b4Var.f199359g;
        if (m0Var == null) {
            c50.q0 q0Var = (c50.q0) i95.n0.c(c50.q0.class);
            android.content.Context context = b4Var.f199353a.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            m0Var = ((v40.q) q0Var).Ai((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context);
            ((gp2.l0) m0Var).e(null);
        }
        b4Var.f199359g = m0Var;
        c50.m0 m0Var2 = b4Var.f199359g;
        if (m0Var2 != null) {
            ((gp2.l0) m0Var2).f(c50.a.f120118d, 10);
        }
        c50.m0 m0Var3 = b4Var.f199359g;
        if (m0Var3 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = this.f200997d;
            c50.m0.a(m0Var3, c19792x256d27252, this.f200998e, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o3(b4Var, c19792x256d27252), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p3(b4Var, c19792x256d27252), null, false, 48, null);
        }
    }
}
