package ed2;

/* loaded from: classes2.dex */
public final class b implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed2.i f332788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ed2.c f332789e;

    public b(ed2.i iVar, ed2.c cVar) {
        this.f332788d = iVar;
        this.f332789e = cVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f332788d.f332802e = null;
        yz5.a aVar = this.f332789e.f332792c;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
