package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes5.dex */
public final class h6 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ev2 f183759e;

    public h6(android.content.Context context, r45.ev2 ev2Var) {
        this.f183758d = context;
        this.f183759e = ev2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        android.content.Context context = this.f183758d;
        if (i18 == -1) {
            db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
            arrayList = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>(0);
            }
        }
        long j17 = i18 == -1 ? 1L : 2L;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        r45.ev2 ev2Var = this.f183759e;
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ";");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "listToString(...)");
        o3Var.Pj(ev2Var, j17, c17, arrayList.size(), V6);
    }
}
