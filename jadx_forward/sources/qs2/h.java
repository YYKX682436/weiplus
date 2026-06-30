package qs2;

/* loaded from: classes5.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f447823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f447824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f447825f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qs2.q f447826g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f447827h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f447828i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z17, android.content.Context context, android.content.Intent intent, qs2.q qVar, long j17, long j18) {
        super(0);
        this.f447823d = z17;
        this.f447824e = context;
        this.f447825f = intent;
        this.f447826g = qVar;
        this.f447827h = j17;
        this.f447828i = j18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f447823d;
        android.content.Context context = this.f447824e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
            p2Var.W(p2Var.i(context, 27, false));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
            p2Var2.W(p2Var2.i(context, 16, false));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.B(4);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).hk(context, this.f447825f);
        qs2.q qVar = this.f447826g;
        long j17 = this.f447827h;
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        qVar.wj(true, j17, Ri, this.f447828i, false, this.f447823d);
        return jz5.f0.f384359a;
    }
}
