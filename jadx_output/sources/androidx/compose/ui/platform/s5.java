package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public abstract class s5 {

    /* renamed from: a, reason: collision with root package name */
    public static final android.view.ViewGroup.LayoutParams f10745a = new android.view.ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final n0.f1 a(androidx.compose.ui.platform.AbstractComposeView r11, n0.g1 r12, yz5.p r13) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.g(r11, r0)
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.o.g(r13, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = androidx.compose.ui.platform.z2.f10831a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L53
            r0 = -1
            r4 = 6
            u26.w r0 = u26.z.a(r0, r3, r3, r4, r3)
            jz5.g r4 = androidx.compose.ui.platform.i1.f10587r
            jz5.g r4 = androidx.compose.ui.platform.i1.f10587r
            jz5.n r4 = (jz5.n) r4
            java.lang.Object r4 = r4.getValue()
            oz5.l r4 = (oz5.l) r4
            kotlinx.coroutines.y0 r5 = kotlinx.coroutines.z0.a(r4)
            r6 = 0
            r7 = 0
            androidx.compose.ui.platform.x2 r8 = new androidx.compose.ui.platform.x2
            r8.<init>(r0, r3)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.l.d(r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.platform.y2 r4 = new androidx.compose.ui.platform.y2
            r4.<init>(r0)
            java.lang.Object r0 = x0.z.f450963b
            monitor-enter(r0)
            java.util.List r5 = x0.z.f450968g     // Catch: java.lang.Throwable -> L50
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L50
            r5.add(r4)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)
            x0.z.a()
            goto L53
        L50:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        L53:
            int r0 = r11.getChildCount()
            if (r0 <= 0) goto L64
            android.view.View r0 = r11.getChildAt(r1)
            boolean r4 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r4 == 0) goto L67
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            goto L68
        L64:
            r11.removeAllViews()
        L67:
            r0 = r3
        L68:
            if (r0 != 0) goto L81
            androidx.compose.ui.platform.AndroidComposeView r0 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r4 = r11.getContext()
            java.lang.String r5 = "context"
            kotlin.jvm.internal.o.f(r4, r5)
            r0.<init>(r4)
            android.view.View r4 = r0.getView()
            android.view.ViewGroup$LayoutParams r5 = androidx.compose.ui.platform.s5.f10745a
            r11.addView(r4, r5)
        L81:
            int r11 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r11 < r4) goto L95
            androidx.compose.ui.platform.r5 r11 = androidx.compose.ui.platform.r5.f10738a
            java.util.Map r11 = r11.a(r0)
            boolean r11 = r11.isEmpty()
            r11 = r11 ^ r2
            if (r11 == 0) goto L95
            r1 = r2
        L95:
            if (r1 == 0) goto Lb4
            java.util.WeakHashMap r11 = new java.util.WeakHashMap
            r11.<init>()
            java.util.Set r11 = java.util.Collections.newSetFromMap(r11)
            r1 = 2131310715(0x7f09387b, float:1.823975E38)
            r0.setTag(r1, r11)
            java.lang.Class<androidx.compose.ui.platform.f3> r11 = androidx.compose.ui.platform.f3.class
            java.lang.String r1 = "a"
            java.lang.reflect.Field r11 = r11.getDeclaredField(r1)     // Catch: java.lang.Exception -> Lb4
            r11.setAccessible(r2)     // Catch: java.lang.Exception -> Lb4
            r11.setBoolean(r3, r2)     // Catch: java.lang.Exception -> Lb4
        Lb4:
            u1.c2 r11 = new u1.c2
            u1.w r1 = r0.getRoot()
            r11.<init>(r1)
            n0.f1 r11 = n0.k1.a(r11, r12)
            android.view.View r12 = r0.getView()
            r1 = 2131325509(0x7f097245, float:1.8269756E38)
            java.lang.Object r12 = r12.getTag(r1)
            boolean r2 = r12 instanceof androidx.compose.ui.platform.WrappedComposition
            if (r2 == 0) goto Ld3
            r3 = r12
            androidx.compose.ui.platform.WrappedComposition r3 = (androidx.compose.ui.platform.WrappedComposition) r3
        Ld3:
            if (r3 != 0) goto Le1
            androidx.compose.ui.platform.WrappedComposition r3 = new androidx.compose.ui.platform.WrappedComposition
            r3.<init>(r0, r11)
            android.view.View r11 = r0.getView()
            r11.setTag(r1, r3)
        Le1:
            r3.b(r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.s5.a(androidx.compose.ui.platform.AbstractComposeView, n0.g1, yz5.p):n0.f1");
    }
}
