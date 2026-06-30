package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class a1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f254456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18572xa5ae0822 f254457b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f254458c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f254459d;

    public a1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18572xa5ae0822 activityC18572xa5ae0822, java.lang.String str, int i17) {
        this.f254456a = u3Var;
        this.f254457b = activityC18572xa5ae0822;
        this.f254458c = str;
        this.f254459d = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        this.f254456a.dismiss();
        int i17 = fVar.f152149b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18572xa5ae0822 activityC18572xa5ae0822 = this.f254457b;
        if (i17 == 0 && fVar.f152148a == 0) {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18572xa5ae0822 activityC18572xa5ae08222 = this.f254457b;
            java.lang.String str = this.f254458c;
            java.lang.String str2 = activityC18572xa5ae0822.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqi) + activityC18572xa5ae0822.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jra);
            java.lang.String string = activityC18572xa5ae0822.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            ((c61.l7) b6Var).dl(activityC18572xa5ae08222, str, str2, true, string, new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.z0(activityC18572xa5ae0822, this.f254458c, this.f254459d, fVar), null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18572xa5ae0822.T6(activityC18572xa5ae0822, fVar.f152150c);
        }
        return jz5.f0.f384359a;
    }
}
