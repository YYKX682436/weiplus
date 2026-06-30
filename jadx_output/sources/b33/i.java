package b33;

/* loaded from: classes8.dex */
public class i extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f17668d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f17669e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f17668d = jz5.h.b(new b33.h(this));
        this.f17669e = jz5.h.b(new b33.g(this));
    }

    public final int T6() {
        return ((java.lang.Number) ((jz5.n) this.f17669e).getValue()).intValue();
    }

    public final com.tencent.mm.ui.base.CustomViewPager U6() {
        return (com.tencent.mm.ui.base.CustomViewPager) ((jz5.n) this.f17668d).getValue();
    }
}
