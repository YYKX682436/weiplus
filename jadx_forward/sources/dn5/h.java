package dn5;

/* loaded from: classes10.dex */
public class h extends dn5.c {
    public android.graphics.Bitmap E;
    public android.graphics.Bitmap F;

    @Override // dn5.c
    public android.graphics.Bitmap b(qk.g6 g6Var, boolean z17) {
        if (g6Var == qk.g6.CROP_VIDEO) {
            return z17 ? this.F : this.E;
        }
        return null;
    }

    @Override // dn5.c
    public void g() {
        super.g();
        this.E = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78920x8267a847));
        this.F = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78919xfb9a2b6e));
    }

    @Override // dn5.c
    public boolean j(int i17) {
        boolean j17 = super.j(i17);
        if (f(i17).ordinal() != 6) {
            return j17;
        }
        return false;
    }
}
