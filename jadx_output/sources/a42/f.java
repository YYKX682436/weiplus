package a42;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f1203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f1205f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.widget.TextView textView, int i17, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        super(0);
        this.f1203d = textView;
        this.f1204e = i17;
        this.f1205f = weImageView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f1204e;
        android.widget.TextView textView = this.f1203d;
        if (textView != null) {
            textView.setTextColor(i17);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f1205f;
        if (weImageView != null) {
            weImageView.setIconColor(i17);
        }
        return jz5.f0.f302826a;
    }
}
