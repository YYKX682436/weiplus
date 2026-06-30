package a31;

/* loaded from: classes5.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a31.m f82480d;

    public c(a31.m mVar) {
        this.f82480d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.text.Layout layout;
        int selectionStart;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d32;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d322;
        a31.m mVar = this.f82480d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = mVar.f82501b;
        if (c22621x7603e017 == null || (layout = c22621x7603e017.getLayout()) == null || (selectionStart = c22621x7603e017.getSelectionStart()) < 0) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d323 = mVar.f82502c;
        int curV2TStatus = c19651x7fe9d323 != null ? c19651x7fe9d323.getCurV2TStatus() : 0;
        int lineForOffset = layout.getLineForOffset(selectionStart);
        float primaryHorizontal = layout.getPrimaryHorizontal(selectionStart);
        int lineBottom = layout.getLineBottom(lineForOffset);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d324 = mVar.f82502c;
        if (c19651x7fe9d324 != null) {
            c19651x7fe9d324.getLocationOnScreen(mVar.f82514o);
        }
        c22621x7603e017.getLocationOnScreen(mVar.f82515p);
        int e17 = mVar.f82514o[0] - com.p314xaae8f345.mm.ui.zk.e(mVar.f82500a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8);
        int totalPaddingTop = ((mVar.f82515p[1] + c22621x7603e017.getTotalPaddingTop()) - c22621x7603e017.getScrollY()) + lineBottom;
        if (primaryHorizontal + mVar.f82515p[0] > e17 && totalPaddingTop > mVar.f82514o[1]) {
            if (curV2TStatus != 1 || (c19651x7fe9d322 = mVar.f82502c) == null) {
                return;
            }
            c19651x7fe9d322.c(0);
            return;
        }
        if (mVar.f82523x && curV2TStatus == 0 && (c19651x7fe9d32 = mVar.f82502c) != null) {
            c19651x7fe9d32.c(1);
        }
    }
}
