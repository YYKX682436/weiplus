package al5;

/* loaded from: classes3.dex */
public final class j implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.BasePopupWindow f5929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f5930e;

    public j(com.tencent.mm.ui.widget.BasePopupWindow basePopupWindow, yz5.a aVar) {
        this.f5929d = basePopupWindow;
        this.f5930e = aVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        com.tencent.mars.xlog.Log.i(this.f5929d.f211244a, "onDismissCallback");
        this.f5930e.invoke();
    }
}
