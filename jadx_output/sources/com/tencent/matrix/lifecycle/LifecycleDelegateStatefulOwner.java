package com.tencent.matrix.lifecycle;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0011B\u001b\b\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\b\u0010\u0006\u001a\u00020\u0003H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/tencent/matrix/lifecycle/LifecycleDelegateStatefulOwner;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onCreate", "onReceiveStart", "onReceiveStop", "", "toString", "Landroidx/lifecycle/y;", ya.b.SOURCE, "Landroidx/lifecycle/y;", "", "async", "<init>", "(Landroidx/lifecycle/y;Z)V", "Companion", "com/tencent/matrix/lifecycle/m", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class LifecycleDelegateStatefulOwner extends com.tencent.matrix.lifecycle.StatefulOwner implements androidx.lifecycle.x {
    public static final com.tencent.matrix.lifecycle.m Companion = new com.tencent.matrix.lifecycle.m(null);
    private final androidx.lifecycle.y source;

    public /* synthetic */ LifecycleDelegateStatefulOwner(androidx.lifecycle.y yVar, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(yVar, (i17 & 2) != 0 ? true : z17);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_CREATE)
    public final void onCreate() {
        turnOff();
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_START)
    public final void onReceiveStart() {
        turnOn();
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
    public final void onReceiveStop() {
        turnOff();
    }

    public java.lang.String toString() {
        return this.source.toString();
    }

    private LifecycleDelegateStatefulOwner(androidx.lifecycle.y yVar, boolean z17) {
        super(z17);
        this.source = yVar;
        yVar.mo133getLifecycle().a(this);
    }
}
