package as2;

/* loaded from: classes2.dex */
public final class g extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f13463d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f13464e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f13465f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f13463d = new java.util.concurrent.CopyOnWriteArrayList();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f13463d.clear();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f13463d = new java.util.concurrent.CopyOnWriteArrayList();
    }
}
