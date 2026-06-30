package coil.memory;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcoil/memory/RequestDelegate;", "Landroidx/lifecycle/f;", "<init>", "()V", "Lcoil/memory/BaseRequestDelegate;", "Lcoil/memory/ViewTargetRequestDelegate;", "coil-base_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes14.dex */
public abstract class RequestDelegate implements androidx.lifecycle.f {
    private RequestDelegate() {
    }

    public /* synthetic */ RequestDelegate(kotlin.jvm.internal.i iVar) {
        this();
    }

    public void a() {
    }

    public void b() {
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onDestroy(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        b();
    }
}
