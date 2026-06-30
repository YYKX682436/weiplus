package gn4;

/* loaded from: classes15.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 f355173d;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 activityC18757xb5c40a02) {
        this.f355173d = activityC18757xb5c40a02;
    }

    @Override // java.lang.Runnable
    public void run() {
        gn4.c1 c1Var = this.f355173d.f256689o;
        int y17 = c1Var.y();
        int mo1894x7e414b06 = c1Var.mo1894x7e414b06();
        x.o oVar = c1Var.f346023e;
        int i17 = oVar.f532384g;
        java.lang.Object[] objArr = oVar.f532383f;
        for (int i18 = 0; i18 < i17; i18++) {
            objArr[i18] = null;
        }
        oVar.f532384g = 0;
        oVar.f532381d = false;
        c1Var.m8154xdb81fc7f(mo1894x7e414b06 - y17, y17);
    }
}
