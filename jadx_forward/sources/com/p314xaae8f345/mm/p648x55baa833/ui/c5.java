package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public class c5 extends o65.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a f145607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc f145608f;

    public c5(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc activityC10348x266bd9bc, java.lang.String str, com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a aVar) {
        this.f145608f = activityC10348x266bd9bc;
        this.f145606d = str;
        this.f145607e = aVar;
    }

    @Override // o65.b
    public void a(int i17, int i18, java.lang.String str, o65.b bVar) {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc activityC10348x266bd9bc = this.f145608f;
        if (i18 == 0) {
            dp.a.m125854x26a183b(activityC10348x266bd9bc, activityC10348x266bd9bc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572119z7), 0).show();
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(activityC10348x266bd9bc.f145358o);
            if (z07 != null) {
                z07.f69088x37548063 = activityC10348x266bd9bc.f145358o;
                z07.f69109x43482a3c = this.f145606d;
                ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo9952xce0038c9(z07, new java.lang.String[0]);
                activityC10348x266bd9bc.finish();
                return;
            }
            return;
        }
        this.f145607e.a();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC10348x266bd9bc.mo55332x76847179();
        java.lang.String str2 = this.f424758c;
        java.lang.String string = activityC10348x266bd9bc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571924to);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = string;
        }
        dp.a.m125854x26a183b(mo55332x76847179, str2, 1).show();
    }
}
