package ad5;

/* loaded from: classes10.dex */
public final class x implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f3325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ad5.y f3326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f3327f;

    public x(yz5.q qVar, ad5.y yVar, java.util.List list) {
        this.f3325d = qVar;
        this.f3326e = yVar;
        this.f3327f = list;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        yz5.q qVar = this.f3325d;
        if (qVar != null) {
            qVar.invoke(this.f3326e, ad5.g.f3255a, this.f3327f);
        }
    }
}
