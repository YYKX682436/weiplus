package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final n0.h3 f10502a = new n0.c2(n0.w2.f333739a, androidx.compose.ui.platform.m0.f10640d);

    /* renamed from: b, reason: collision with root package name */
    public static final n0.h3 f10503b = n0.n1.c(androidx.compose.ui.platform.n0.f10664d);

    /* renamed from: c, reason: collision with root package name */
    public static final n0.h3 f10504c = n0.n1.c(androidx.compose.ui.platform.o0.f10673d);

    /* renamed from: d, reason: collision with root package name */
    public static final n0.h3 f10505d = n0.n1.c(androidx.compose.ui.platform.p0.f10680d);

    /* renamed from: e, reason: collision with root package name */
    public static final n0.h3 f10506e = n0.n1.c(androidx.compose.ui.platform.q0.f10704d);

    /* renamed from: f, reason: collision with root package name */
    public static final n0.h3 f10507f = n0.n1.c(androidx.compose.ui.platform.r0.f10725d);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, boolean] */
    public static final void a(androidx.compose.ui.platform.AndroidComposeView owner, yz5.p content, n0.o oVar, int i17) {
        ?? r07;
        java.util.LinkedHashMap linkedHashMap;
        boolean z17;
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(content, "content");
        java.lang.Object obj = n0.e1.f333492a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1396852028);
        android.content.Context context = owner.getContext();
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        java.lang.Object obj2 = n0.n.f333620a;
        if (y17 == obj2) {
            y17 = n0.s4.b(context.getResources().getConfiguration(), n0.w2.f333739a);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        n0.v2 v2Var = (n0.v2) y17;
        y0Var.U(1157296644);
        boolean e17 = y0Var.e(v2Var);
        java.lang.Object y18 = y0Var.y();
        if (e17 || y18 == obj2) {
            y18 = new androidx.compose.ui.platform.s0(v2Var);
            y0Var.g0(y18);
        }
        y0Var.o(false);
        owner.setConfigurationChangeObserver((yz5.l) y18);
        y0Var.U(-492369756);
        java.lang.Object y19 = y0Var.y();
        if (y19 == obj2) {
            kotlin.jvm.internal.o.f(context, "context");
            y19 = new androidx.compose.ui.platform.n1(context);
            y0Var.g0(y19);
        }
        y0Var.o(false);
        androidx.compose.ui.platform.n1 n1Var = (androidx.compose.ui.platform.n1) y19;
        androidx.compose.ui.platform.m viewTreeOwners = owner.getViewTreeOwners();
        if (viewTreeOwners == null) {
            throw new java.lang.IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        y0Var.U(-492369756);
        java.lang.Object y27 = y0Var.y();
        o4.g owner2 = viewTreeOwners.f10639b;
        if (y27 == obj2) {
            kotlin.jvm.internal.o.g(owner2, "owner");
            java.lang.Object parent = owner.getParent();
            if (parent == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            android.view.View view = (android.view.View) parent;
            java.lang.Object tag = view.getTag(com.tencent.mm.R.id.c8z);
            java.lang.String id6 = tag instanceof java.lang.String ? (java.lang.String) tag : null;
            if (id6 == null) {
                id6 = java.lang.String.valueOf(view.getId());
            }
            kotlin.jvm.internal.o.g(id6, "id");
            java.lang.String str = w0.s.class.getSimpleName() + ':' + id6;
            o4.b savedStateRegistry = owner2.getSavedStateRegistry();
            android.os.Bundle a17 = savedStateRegistry.a(str);
            if (a17 != null) {
                linkedHashMap = new java.util.LinkedHashMap();
                java.util.Set<java.lang.String> keySet = a17.keySet();
                kotlin.jvm.internal.o.f(keySet, "this.keySet()");
                java.util.Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    java.lang.String key = (java.lang.String) it.next();
                    java.util.Iterator it6 = it;
                    java.util.ArrayList parcelableArrayList = a17.getParcelableArrayList(key);
                    if (parcelableArrayList == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                    }
                    kotlin.jvm.internal.o.f(key, "key");
                    linkedHashMap.put(key, parcelableArrayList);
                    it = it6;
                    a17 = a17;
                }
            } else {
                linkedHashMap = null;
            }
            androidx.compose.ui.platform.t2 t2Var = androidx.compose.ui.platform.t2.f10750d;
            n0.h3 h3Var = w0.w.f441867a;
            w0.u uVar = new w0.u(linkedHashMap, t2Var);
            try {
                savedStateRegistry.b(str, new androidx.compose.ui.platform.s2(uVar));
                z17 = true;
            } catch (java.lang.IllegalArgumentException unused) {
                z17 = false;
            }
            androidx.compose.ui.platform.q2 q2Var = new androidx.compose.ui.platform.q2(uVar, new androidx.compose.ui.platform.r2(z17, savedStateRegistry, str));
            y0Var.g0(q2Var);
            y27 = q2Var;
            r07 = 0;
        } else {
            r07 = 0;
        }
        y0Var.o(r07);
        androidx.compose.ui.platform.q2 q2Var2 = (androidx.compose.ui.platform.q2) y27;
        n0.d2.c(jz5.f0.f302826a, new androidx.compose.ui.platform.u0(q2Var2), y0Var, r07);
        kotlin.jvm.internal.o.f(context, "context");
        java.lang.Object obj3 = (android.content.res.Configuration) v2Var.getValue();
        y0Var.U(-485908294);
        y0Var.U(-492369756);
        java.lang.Object y28 = y0Var.y();
        if (y28 == obj2) {
            y28 = new x1.e();
            y0Var.g0(y28);
        }
        y0Var.o(false);
        x1.e eVar = (x1.e) y28;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        y0Var.U(-492369756);
        java.lang.Object y29 = y0Var.y();
        if (y29 == obj2) {
            y0Var.g0(obj3);
        } else {
            obj3 = y29;
        }
        y0Var.o(false);
        h0Var.f310123d = obj3;
        y0Var.U(-492369756);
        java.lang.Object y37 = y0Var.y();
        if (y37 == obj2) {
            y37 = new androidx.compose.ui.platform.z0(h0Var, eVar);
            y0Var.g0(y37);
        }
        y0Var.o(false);
        n0.d2.c(eVar, new androidx.compose.ui.platform.y0(context, (androidx.compose.ui.platform.z0) y37), y0Var, 8);
        y0Var.o(false);
        n0.h3 h3Var2 = f10502a;
        android.content.res.Configuration configuration = (android.content.res.Configuration) v2Var.getValue();
        kotlin.jvm.internal.o.f(configuration, "configuration");
        n0.n1.a(new n0.i3[]{h3Var2.b(configuration), f10503b.b(context), f10505d.b(viewTreeOwners.f10638a), f10506e.b(owner2), w0.w.f441867a.b(q2Var2), f10507f.b(owner.getView()), f10504c.b(eVar)}, u0.j.b(y0Var, 1471621628, true, new androidx.compose.ui.platform.v0(owner, n1Var, content, i17)), y0Var, 56);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new androidx.compose.ui.platform.w0(owner, content, i17);
        }
        java.lang.Object obj4 = n0.e1.f333492a;
    }

    public static final java.lang.Void b(java.lang.String str) {
        throw new java.lang.IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
