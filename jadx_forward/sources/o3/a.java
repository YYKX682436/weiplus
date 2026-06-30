package o3;

/* loaded from: classes13.dex */
public final class a extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f424152d;

    /* renamed from: e, reason: collision with root package name */
    public final o3.l f424153e;

    /* renamed from: f, reason: collision with root package name */
    public final int f424154f;

    public a(int i17, o3.l lVar, int i18) {
        this.f424152d = i17;
        this.f424153e = lVar;
        this.f424154f = i18;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f424152d);
        this.f424153e.f424175a.performAction(this.f424154f, bundle);
    }
}
