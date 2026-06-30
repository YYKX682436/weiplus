package hr3;

/* loaded from: classes11.dex */
public class ka implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.va f365253d;

    public ka(hr3.va vaVar) {
        this.f365253d = vaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        hr3.va vaVar = this.f365253d;
        if (vaVar.f365642e.K1.isFinishing()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = vaVar.f365642e;
        xp1.c.c(c16861xdcf09668.K1, c16861xdcf09668.L.d1(), true);
        xp1.c.l(vaVar.f365642e.K1);
    }
}
