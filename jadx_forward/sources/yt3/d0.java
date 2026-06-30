package yt3;

/* loaded from: classes10.dex */
public final class d0 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f546930d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f546931e;

    /* renamed from: f, reason: collision with root package name */
    public ct0.b f546932f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f546933g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f546934h;

    public d0(android.view.ViewGroup parent, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f546930d = parent;
        this.f546934h = (android.view.ViewGroup) parent.findViewById(com.p314xaae8f345.mm.R.id.pqw);
    }

    public final int a() {
        android.os.Bundle bundle;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f546933g;
        int i17 = 0;
        int i18 = (c16993xacc19624 == null || (bundle = c16993xacc19624.M) == null) ? 0 : bundle.getInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 0);
        int i19 = i18 >> 4;
        if (i19 == 2) {
            i17 = 1;
        } else if (i19 == 3) {
            i17 = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).nj(nu3.i.f421751a.l());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditJumpThirdPlugin", "[getVideoSource] tecScene:" + i18 + " tecSceneShr:" + i19 + " videoSource:" + i17);
        return i17;
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        android.view.ViewGroup viewGroup = this.f546934h;
        if (i17 != 0) {
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(8);
        } else {
            if (!this.f546931e || viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(0);
        }
    }
}
