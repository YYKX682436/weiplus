package vd2;

/* loaded from: classes2.dex */
public final class q3 implements ss5.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f517397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517398b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517399c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517400d;

    public q3(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f517397a = j17;
        this.f517398b = str;
        this.f517399c = str2;
        this.f517400d = str3;
    }

    @Override // ss5.d0
    public void c(com.p314xaae8f345.mm.p944x882e457a.f it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) it.f152151d).m75936x14adae67(2);
        if (it.f152148a != 0 || it.f152149b != 0 || c19792x256d2725 == null) {
            vd2.t3 t3Var = vd2.t3.f517454a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpLiveUIAndDoAction failed. ");
            sb6.append(it.f152148a);
            sb6.append(", ");
            sb6.append(it.f152149b);
            sb6.append(", ");
            sb6.append(c19792x256d2725 == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderUtilApi", sb6.toString());
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e3z);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            if (it.f152149b == -4036) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.exw);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            }
            db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string, 0).show();
            return;
        }
        vd2.t3 t3Var2 = vd2.t3.f517454a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("jumpLiveUIAndDoAction liveId: ");
        r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
        sb7.append(m76794xd0557130 != null ? m76794xd0557130.m75942xfb822ef2(0) : this.f517397a);
        sb7.append(", username:");
        java.lang.String m76836x6c03c64c = c19792x256d2725.m76836x6c03c64c();
        if (m76836x6c03c64c == null && (m76836x6c03c64c = this.f517398b) == null) {
            m76836x6c03c64c = "";
        }
        sb7.append(m76836x6c03c64c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUtilApi", sb7.toString());
        bu2.j jVar = bu2.j.f106067a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0);
        bu2.i iVar = bu2.i.f106054b;
        jVar.n(a17, bu2.i.f106064l);
        java.lang.String str = this.f517399c;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        java.lang.String str2 = this.f517400d;
        if (str2 == null) {
            str2 = "";
        }
        objArr[0] = str2;
        objArr[1] = str;
        objArr[2] = java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11());
        objArr[3] = "";
        g0Var.d(21140, objArr);
    }
}
