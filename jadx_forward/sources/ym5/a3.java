package ym5;

/* loaded from: classes15.dex */
public class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 f544727d;

    public a3(com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 c22796x44e7a3d7) {
        this.f544727d = c22796x44e7a3d7;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 c22796x44e7a3d7 = this.f544727d;
        android.view.View.OnClickListener onClickListener = c22796x44e7a3d7.f294925r;
        if (onClickListener != null) {
            onClickListener.onClick(c22796x44e7a3d7);
        }
    }
}
