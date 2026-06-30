package cj5;

/* loaded from: classes.dex */
public final class b extends zm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f42070d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f42070d = jz5.h.b(new cj5.a(activity));
    }

    @Override // zm3.a
    public ym3.f T6() {
        return (oi5.a) ((jz5.n) this.f42070d).getValue();
    }
}
