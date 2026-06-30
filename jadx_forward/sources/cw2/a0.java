package cw2;

/* loaded from: classes2.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.b0 f305085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f305086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f305087f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f305088g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f305089h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener f305090i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(cw2.b0 b0Var, long j17, int i17, float f17, boolean z17, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener iOnSeekCompleteListener) {
        super(0);
        this.f305085d = b0Var;
        this.f305086e = j17;
        this.f305087f = i17;
        this.f305088g = f17;
        this.f305089h = z17;
        this.f305090i = iOnSeekCompleteListener;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cw2.b0 b0Var = this.f305085d;
        java.lang.String str = b0Var.f305113c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setStartPlayTime time:");
        long j17 = this.f305086e;
        sb6.append(j17);
        sb6.append(", ");
        int i17 = this.f305087f;
        sb6.append(i17);
        sb6.append(", ");
        float f17 = this.f305088g;
        sb6.append(f17);
        sb6.append(", ");
        sb6.append(this.f305089h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = b0Var.f305111a;
        cw2.da videoView = c15196x85976f5f.getVideoView();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
        if (c15188xd8bd4bd != null) {
            c15188xd8bd4bd.m61418xe1a2e326(new cw2.z(b0Var, this.f305090i));
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b0Var.a(b0Var.f305111a.getVideoView(), this.f305086e, this.f305089h, this.f305087f), java.lang.Boolean.TRUE)) {
            b0Var.b(f17);
            bb2.y2 bulletLifecycle = c15196x85976f5f.getBulletLifecycle();
            if (bulletLifecycle != null) {
                bb2.y2.r(bulletLifecycle, (int) (j17 / 1000), false, 2, null);
            }
        } else {
            b0Var.f305120j = j17;
            b0Var.f305121k = i17;
            b0Var.f305122l = f17;
        }
        return jz5.f0.f384359a;
    }
}
