package al5;

/* loaded from: classes13.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda f87618d;

    public x1(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda c22626x3e1b8dda) {
        this.f87618d = c22626x3e1b8dda;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda c22626x3e1b8dda = this.f87618d;
        if (c22626x3e1b8dda.getVisibility() != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPinProgressBtn", "cur progress bar not visiable, stop auto pregress");
            return;
        }
        int i17 = c22626x3e1b8dda.f292861e + 1;
        c22626x3e1b8dda.f292861e = i17;
        if (i17 >= c22626x3e1b8dda.f292860d) {
            c22626x3e1b8dda.f292861e = i17 - 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPinProgressBtn", "match auto progress max, return");
        } else {
            c22626x3e1b8dda.invalidate();
            c22626x3e1b8dda.postDelayed(c22626x3e1b8dda.f292867n, 200L);
        }
    }
}
