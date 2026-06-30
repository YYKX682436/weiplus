package al5;

/* loaded from: classes3.dex */
public final class j implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22598x77e1a40b f87462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f87463e;

    public j(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22598x77e1a40b c22598x77e1a40b, yz5.a aVar) {
        this.f87462d = c22598x77e1a40b;
        this.f87463e = aVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f87462d.f292777a, "onDismissCallback");
        this.f87463e.mo152xb9724478();
    }
}
