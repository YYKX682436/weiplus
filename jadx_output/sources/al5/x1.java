package al5;

/* loaded from: classes13.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMPinProgressBtn f6085d;

    public x1(com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn) {
        this.f6085d = mMPinProgressBtn;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn = this.f6085d;
        if (mMPinProgressBtn.getVisibility() != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMPinProgressBtn", "cur progress bar not visiable, stop auto pregress");
            return;
        }
        int i17 = mMPinProgressBtn.f211328e + 1;
        mMPinProgressBtn.f211328e = i17;
        if (i17 >= mMPinProgressBtn.f211327d) {
            mMPinProgressBtn.f211328e = i17 - 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMPinProgressBtn", "match auto progress max, return");
        } else {
            mMPinProgressBtn.invalidate();
            mMPinProgressBtn.postDelayed(mMPinProgressBtn.f211334n, 200L);
        }
    }
}
