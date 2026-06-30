package c61;

/* loaded from: classes10.dex */
public final class e7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f120490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f120491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f120492c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f120493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f120494e;

    public e7(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.lang.Object obj, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2) {
        this.f120490a = c0Var;
        this.f120491b = obj;
        this.f120492c = j17;
        this.f120493d = h0Var;
        this.f120494e = c0Var2;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        if ((i17 == 0 && fVar.f152149b == 0) || hc2.p.b(i17, fVar.f152149b)) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            if (c19792x256d2725 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f120493d;
                bu2.j.f106067a.n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 1), bu2.i.f106064l);
                h0Var.f391656d = c19792x256d2725;
            }
        } else {
            int i18 = fVar.f152149b;
            if (i18 == -4011 || i18 == -4033 || i18 == -4036) {
                this.f120490a.f391645d = true;
            }
        }
        java.lang.Object obj2 = this.f120491b;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f120494e;
        synchronized (obj2) {
            c0Var.f391645d = true;
            obj2.notify();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommonFeatureService", "tryGetFinderObject " + this.f120492c + ", finish");
        return jz5.f0.f384359a;
    }
}
