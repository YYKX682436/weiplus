package jf5;

/* loaded from: classes14.dex */
public final class e implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jf5.h f380980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 f380981e;

    public e(jf5.h hVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 c22095x76baed77) {
        this.f380980d = hVar;
        this.f380981e = c22095x76baed77;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        jf5.h hVar = this.f380980d;
        hVar.f380993d = null;
        if (hVar.f380994e == this.f380981e) {
            hVar.f380994e = null;
        }
        if (hVar.f380995f) {
            hVar.f380995f = false;
            return;
        }
        yz5.a aVar = hVar.f380996g;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
