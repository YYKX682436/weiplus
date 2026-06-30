package af5;

/* loaded from: classes9.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22093x7ffc29ba f86127d;

    public l0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22093x7ffc29ba c22093x7ffc29ba) {
        this.f86127d = c22093x7ffc29ba;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingVideoMvvmView", "invoke reset mask wh");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22093x7ffc29ba c22093x7ffc29ba = this.f86127d;
        android.widget.ImageView c17 = c22093x7ffc29ba.m80110x1cddf0a2().c();
        android.view.ViewGroup.LayoutParams layoutParams = c22093x7ffc29ba.m80110x1cddf0a2().c().getLayoutParams();
        layoutParams.width = c22093x7ffc29ba.m80110x1cddf0a2().b().getWidth();
        layoutParams.height = c22093x7ffc29ba.m80110x1cddf0a2().b().getHeight();
        c17.setLayoutParams(layoutParams);
    }
}
