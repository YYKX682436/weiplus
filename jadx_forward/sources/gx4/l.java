package gx4;

/* loaded from: classes5.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19351x7c5612b9 f358955d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19351x7c5612b9 c19351x7c5612b9) {
        this.f358955d = c19351x7c5612b9;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19351x7c5612b9 c19351x7c5612b9 = this.f358955d;
        c19351x7c5612b9.f265526q = true;
        c19351x7c5612b9.invalidate();
    }
}
