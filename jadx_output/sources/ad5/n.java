package ad5;

/* loaded from: classes10.dex */
public final class n implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f3286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ad5.q f3287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f3288f;

    public n(yz5.q qVar, ad5.q qVar2, java.util.List list) {
        this.f3286d = qVar;
        this.f3287e = qVar2;
        this.f3288f = list;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        yz5.q qVar = this.f3286d;
        if (qVar != null) {
            qVar.invoke(this.f3287e, ad5.g.f3255a, this.f3288f);
        }
    }
}
