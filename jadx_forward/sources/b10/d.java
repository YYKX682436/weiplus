package b10;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f98554a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98555b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayDeque f98556c;

    /* renamed from: d, reason: collision with root package name */
    public long f98557d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f98558e;

    public d(android.widget.LinearLayout container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.f98554a = container;
        this.f98555b = i65.a.b(container.getContext(), 12);
        this.f98556c = new java.util.ArrayDeque(10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x015d, code lost:
    
        if (r7 == null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p726x68a9d444.p727x373aa5.C10533xd4db2447 r28, bw5.u8 r29, bw5.x7 r30, b10.a r31) {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b10.d.a(com.tencent.mm.feature.ecs.kfproductcard.view.EcsKfProductCardItemView, bw5.u8, bw5.x7, b10.a):void");
    }

    public final void b(long j17, java.util.Map values) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            this.f98557d = j17;
            this.f98558e = values;
        } else {
            throw new java.lang.IllegalStateException(("EcsKfProductCardListController.markRendered must be called on main thread, actual=" + java.lang.Thread.currentThread().getName()).toString());
        }
    }

    public final void c(int i17) {
        android.widget.LinearLayout linearLayout = this.f98554a;
        int childCount = linearLayout.getChildCount() - 1;
        if (i17 > childCount) {
            return;
        }
        while (true) {
            android.view.View childAt = linearLayout.getChildAt(childCount);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.feature.ecs.kfproductcard.view.EcsKfProductCardItemView");
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p726x68a9d444.p727x373aa5.C10533xd4db2447 c10533xd4db2447 = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p726x68a9d444.p727x373aa5.C10533xd4db2447) childAt;
            linearLayout.removeViewAt(childCount);
            java.util.ArrayDeque arrayDeque = this.f98556c;
            if (arrayDeque.size() < 10) {
                arrayDeque.push(c10533xd4db2447);
            }
            if (childCount == i17) {
                return;
            } else {
                childCount--;
            }
        }
    }
}
