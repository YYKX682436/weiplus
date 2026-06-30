package b10;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f17021a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17022b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayDeque f17023c;

    /* renamed from: d, reason: collision with root package name */
    public long f17024d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f17025e;

    public d(android.widget.LinearLayout container) {
        kotlin.jvm.internal.o.g(container, "container");
        this.f17021a = container;
        this.f17022b = i65.a.b(container.getContext(), 12);
        this.f17023c = new java.util.ArrayDeque(10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x015d, code lost:
    
        if (r7 == null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.tencent.mm.feature.ecs.kfproductcard.view.EcsKfProductCardItemView r28, bw5.u8 r29, bw5.x7 r30, b10.a r31) {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b10.d.a(com.tencent.mm.feature.ecs.kfproductcard.view.EcsKfProductCardItemView, bw5.u8, bw5.x7, b10.a):void");
    }

    public final void b(long j17, java.util.Map values) {
        kotlin.jvm.internal.o.g(values, "values");
        if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            this.f17024d = j17;
            this.f17025e = values;
        } else {
            throw new java.lang.IllegalStateException(("EcsKfProductCardListController.markRendered must be called on main thread, actual=" + java.lang.Thread.currentThread().getName()).toString());
        }
    }

    public final void c(int i17) {
        android.widget.LinearLayout linearLayout = this.f17021a;
        int childCount = linearLayout.getChildCount() - 1;
        if (i17 > childCount) {
            return;
        }
        while (true) {
            android.view.View childAt = linearLayout.getChildAt(childCount);
            kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.feature.ecs.kfproductcard.view.EcsKfProductCardItemView");
            com.tencent.mm.feature.ecs.kfproductcard.view.EcsKfProductCardItemView ecsKfProductCardItemView = (com.tencent.mm.feature.ecs.kfproductcard.view.EcsKfProductCardItemView) childAt;
            linearLayout.removeViewAt(childCount);
            java.util.ArrayDeque arrayDeque = this.f17023c;
            if (arrayDeque.size() < 10) {
                arrayDeque.push(ecsKfProductCardItemView);
            }
            if (childCount == i17) {
                return;
            } else {
                childCount--;
            }
        }
    }
}
