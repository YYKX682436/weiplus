package a31;

/* loaded from: classes5.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a31.m f947d;

    public c(a31.m mVar) {
        this.f947d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.text.Layout layout;
        int selectionStart;
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout;
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout2;
        a31.m mVar = this.f947d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = mVar.f968b;
        if (mMEditText == null || (layout = mMEditText.getLayout()) == null || (selectionStart = mMEditText.getSelectionStart()) < 0) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout3 = mVar.f969c;
        int curV2TStatus = speechInputLayout3 != null ? speechInputLayout3.getCurV2TStatus() : 0;
        int lineForOffset = layout.getLineForOffset(selectionStart);
        float primaryHorizontal = layout.getPrimaryHorizontal(selectionStart);
        int lineBottom = layout.getLineBottom(lineForOffset);
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout4 = mVar.f969c;
        if (speechInputLayout4 != null) {
            speechInputLayout4.getLocationOnScreen(mVar.f981o);
        }
        mMEditText.getLocationOnScreen(mVar.f982p);
        int e17 = mVar.f981o[0] - com.tencent.mm.ui.zk.e(mVar.f967a, com.tencent.mm.R.dimen.f479671c8);
        int totalPaddingTop = ((mVar.f982p[1] + mMEditText.getTotalPaddingTop()) - mMEditText.getScrollY()) + lineBottom;
        if (primaryHorizontal + mVar.f982p[0] > e17 && totalPaddingTop > mVar.f981o[1]) {
            if (curV2TStatus != 1 || (speechInputLayout2 = mVar.f969c) == null) {
                return;
            }
            speechInputLayout2.c(0);
            return;
        }
        if (mVar.f990x && curV2TStatus == 0 && (speechInputLayout = mVar.f969c) != null) {
            speechInputLayout.c(1);
        }
    }
}
