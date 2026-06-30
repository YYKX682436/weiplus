package wx1;

/* loaded from: classes7.dex */
public class b implements vx1.f {
    @Override // vx1.f
    public boolean a(int i17) {
        return ih.a.f(e42.d0.clicfg_bitmap_recycle_release_native_v2, true) && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && i17 >= 26 && i17 <= 30;
    }

    @Override // vx1.f
    public boolean b() {
        ux1.d.f513377a = new wx1.a(this);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.jni.C13164x99492626.m54621x37c711();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BitmapReleaseX", "work succ");
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BitmapReleaseX", "work error");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BitmapReleaseX", e17, "", new java.lang.Object[0]);
            return false;
        }
    }
}
