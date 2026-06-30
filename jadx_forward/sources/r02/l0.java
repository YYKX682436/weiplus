package r02;

/* loaded from: classes8.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d f449845d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d c13249xf095011d) {
        this.f449845d = c13249xf095011d;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d c13249xf095011d = this.f449845d;
        c13249xf095011d.f178935i.setVisibility(0);
        c13249xf095011d.f178937n.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13247xa0adf2d3 c13247xa0adf2d3 = c13249xf095011d.f178936m;
        c13247xa0adf2d3.f178925h = true;
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            c13247xa0adf2d3.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.avt);
        } else {
            c13247xa0adf2d3.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.avu);
        }
    }
}
