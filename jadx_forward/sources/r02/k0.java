package r02;

/* loaded from: classes8.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d f449843d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d c13249xf095011d) {
        this.f449843d = c13249xf095011d;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d c13249xf095011d = this.f449843d;
        if (c13249xf095011d.G == null) {
            c13249xf095011d.G = new android.graphics.Rect();
        }
        if (c13249xf095011d.E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TaskItemView", "downloadTipBubble is null");
            return;
        }
        c13249xf095011d.f178936m.getGlobalVisibleRect(c13249xf095011d.G);
        c13249xf095011d.E.a(c13249xf095011d.f178936m);
        c13249xf095011d.E.setOutsideTouchable(true);
        c13249xf095011d.F = true;
    }
}
