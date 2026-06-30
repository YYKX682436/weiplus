package aj5;

/* loaded from: classes.dex */
public final class i extends zm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f5440d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f5441e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f5442f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f5440d = jz5.h.b(new aj5.g(activity, this));
        this.f5441e = jz5.h.b(new aj5.h(activity, this));
        this.f5442f = jz5.h.b(new aj5.f(this));
    }

    @Override // zm3.a
    public ym3.f T6() {
        return (ym3.f) ((jz5.n) this.f5442f).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
    }
}
