package fn4;

/* loaded from: classes15.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e f346130d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e abstractActivityC18755xab3fd75e) {
        this.f346130d = abstractActivityC18755xab3fd75e;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e abstractActivityC18755xab3fd75e = this.f346130d;
        fn4.e eVar = abstractActivityC18755xab3fd75e.f256671r;
        int y17 = eVar.y();
        int mo1894x7e414b06 = eVar.mo1894x7e414b06();
        x.o oVar = eVar.f346023e;
        int i17 = oVar.f532384g;
        java.lang.Object[] objArr = oVar.f532383f;
        for (int i18 = 0; i18 < i17; i18++) {
            objArr[i18] = null;
        }
        oVar.f532384g = 0;
        oVar.f532381d = false;
        eVar.m8154xdb81fc7f(mo1894x7e414b06 - y17, y17);
        fn4.e eVar2 = abstractActivityC18755xab3fd75e.f256675v;
        int y18 = eVar2.y();
        int mo1894x7e414b062 = eVar2.mo1894x7e414b06();
        x.o oVar2 = eVar2.f346023e;
        int i19 = oVar2.f532384g;
        java.lang.Object[] objArr2 = oVar2.f532383f;
        for (int i27 = 0; i27 < i19; i27++) {
            objArr2[i27] = null;
        }
        oVar2.f532384g = 0;
        oVar2.f532381d = false;
        eVar2.m8154xdb81fc7f(mo1894x7e414b062 - y18, y18);
    }
}
