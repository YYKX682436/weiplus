package dz0;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f326583a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f326584b;

    /* renamed from: c, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f326585c;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f326586d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f326587e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f326588f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f326589g;

    public x() {
        p012xc85e97e9.p093xedfae76a.j0 j0Var = new p012xc85e97e9.p093xedfae76a.j0(kz5.p0.f395529d);
        this.f326583a = j0Var;
        p012xc85e97e9.p093xedfae76a.j0 j0Var2 = new p012xc85e97e9.p093xedfae76a.j0();
        this.f326584b = j0Var2;
        this.f326585c = j0Var;
        this.f326586d = j0Var2;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f326587e = new p012xc85e97e9.p093xedfae76a.j0(bool);
        this.f326588f = new p012xc85e97e9.p093xedfae76a.j0(bool);
        this.f326589g = "";
    }

    public final void a(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 musicInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicInfo, "musicInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "updateMusicInfo: " + musicInfo.m33856x92013dca() + ", " + musicInfo.m33858xd75a8eb6());
        ((ku5.t0) ku5.t0.f394148d).B(new dz0.w(this, musicInfo));
    }

    public final void b(java.util.List musicInfoList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicInfoList, "musicInfoList");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMusicInfoList: size=");
        sb6.append(musicInfoList.size());
        sb6.append(", first=");
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) kz5.n0.a0(musicInfoList, 0);
        sb6.append(c4116xf4b2c356 != null ? c4116xf4b2c356.m33858xd75a8eb6() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", sb6.toString());
        p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f326583a;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : musicInfoList) {
            if (hashSet.add(((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) obj).m33856x92013dca())) {
                arrayList.add(obj);
            }
        }
        j0Var.mo7808x76db6cb1(arrayList);
    }
}
