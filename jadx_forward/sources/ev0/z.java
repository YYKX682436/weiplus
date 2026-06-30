package ev0;

/* loaded from: classes9.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p888x636ee25.C10934x3bcf5a17 f338422d;

    public z(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p888x636ee25.C10934x3bcf5a17 c10934x3bcf5a17) {
        this.f338422d = c10934x3bcf5a17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p888x636ee25.C10934x3bcf5a17 c10934x3bcf5a17 = this.f338422d;
        android.view.ViewParent parent = c10934x3bcf5a17.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(c10934x3bcf5a17);
        }
    }
}
