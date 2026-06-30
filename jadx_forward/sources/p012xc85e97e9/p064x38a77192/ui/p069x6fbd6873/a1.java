package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final n0.h3 f92035a = new n0.c2(n0.w2.f415272a, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m0.f92173d);

    /* renamed from: b, reason: collision with root package name */
    public static final n0.h3 f92036b = n0.n1.c(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.n0.f92197d);

    /* renamed from: c, reason: collision with root package name */
    public static final n0.h3 f92037c = n0.n1.c(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.o0.f92206d);

    /* renamed from: d, reason: collision with root package name */
    public static final n0.h3 f92038d = n0.n1.c(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p0.f92213d);

    /* renamed from: e, reason: collision with root package name */
    public static final n0.h3 f92039e = n0.n1.c(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q0.f92237d);

    /* renamed from: f, reason: collision with root package name */
    public static final n0.h3 f92040f = n0.n1.c(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.r0.f92258d);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public static final void a(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 owner, yz5.p content, n0.o oVar, int i17) {
        ?? r07;
        java.util.LinkedHashMap linkedHashMap;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        java.lang.Object obj = n0.e1.f415025a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1396852028);
        android.content.Context context = owner.getContext();
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        java.lang.Object obj2 = n0.n.f415153a;
        if (y17 == obj2) {
            y17 = n0.s4.b(context.getResources().getConfiguration(), n0.w2.f415272a);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        n0.v2 v2Var = (n0.v2) y17;
        y0Var.U(1157296644);
        boolean e17 = y0Var.e(v2Var);
        java.lang.Object y18 = y0Var.y();
        if (e17 || y18 == obj2) {
            y18 = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.s0(v2Var);
            y0Var.g0(y18);
        }
        y0Var.o(false);
        owner.m7056x79a4f37a((yz5.l) y18);
        y0Var.U(-492369756);
        java.lang.Object y19 = y0Var.y();
        if (y19 == obj2) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "context");
            y19 = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.n1(context);
            y0Var.g0(y19);
        }
        y0Var.o(false);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.n1 n1Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.n1) y19;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m m7053xb4c3aed9 = owner.m7053xb4c3aed9();
        if (m7053xb4c3aed9 == null) {
            throw new java.lang.IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        y0Var.U(-492369756);
        java.lang.Object y27 = y0Var.y();
        o4.g owner2 = m7053xb4c3aed9.f92172b;
        if (y27 == obj2) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner2, "owner");
            java.lang.Object parent = owner.getParent();
            if (parent == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            android.view.View view = (android.view.View) parent;
            java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.c8z);
            java.lang.String id6 = tag instanceof java.lang.String ? (java.lang.String) tag : null;
            if (id6 == null) {
                id6 = java.lang.String.valueOf(view.getId());
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
            java.lang.String str = w0.s.class.getSimpleName() + ':' + id6;
            o4.b mo2511xdf516e9d = owner2.mo2511xdf516e9d();
            android.os.Bundle a17 = mo2511xdf516e9d.a(str);
            if (a17 != null) {
                linkedHashMap = new java.util.LinkedHashMap();
                java.util.Set<java.lang.String> keySet = a17.keySet();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "this.keySet()");
                java.util.Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    java.lang.String key = (java.lang.String) it.next();
                    java.util.Iterator it6 = it;
                    java.util.ArrayList parcelableArrayList = a17.getParcelableArrayList(key);
                    if (parcelableArrayList == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "key");
                    linkedHashMap.put(key, parcelableArrayList);
                    it = it6;
                    a17 = a17;
                }
            } else {
                linkedHashMap = null;
            }
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.t2 t2Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.t2.f92283d;
            n0.h3 h3Var = w0.w.f523400a;
            w0.u uVar = new w0.u(linkedHashMap, t2Var);
            try {
                mo2511xdf516e9d.b(str, new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.s2(uVar));
                z17 = true;
            } catch (java.lang.IllegalArgumentException unused) {
                z17 = false;
            }
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q2 q2Var = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q2(uVar, new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.r2(z17, mo2511xdf516e9d, str));
            y0Var.g0(q2Var);
            y27 = q2Var;
            r07 = 0;
        } else {
            r07 = 0;
        }
        y0Var.o(r07);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q2 q2Var2 = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q2) y27;
        n0.d2.c(jz5.f0.f384359a, new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.u0(q2Var2), y0Var, r07);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "context");
        java.lang.Object obj3 = (android.content.res.Configuration) v2Var.mo128745x754a37bb();
        y0Var.U(-485908294);
        y0Var.U(-492369756);
        java.lang.Object y28 = y0Var.y();
        if (y28 == obj2) {
            y28 = new x1.e();
            y0Var.g0(y28);
        }
        y0Var.o(false);
        x1.e eVar = (x1.e) y28;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        y0Var.U(-492369756);
        java.lang.Object y29 = y0Var.y();
        if (y29 == obj2) {
            y0Var.g0(obj3);
        } else {
            obj3 = y29;
        }
        y0Var.o(false);
        h0Var.f391656d = obj3;
        y0Var.U(-492369756);
        java.lang.Object y37 = y0Var.y();
        if (y37 == obj2) {
            y37 = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.z0(h0Var, eVar);
            y0Var.g0(y37);
        }
        y0Var.o(false);
        n0.d2.c(eVar, new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.y0(context, (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.z0) y37), y0Var, 8);
        y0Var.o(false);
        n0.h3 h3Var2 = f92035a;
        android.content.res.Configuration configuration = (android.content.res.Configuration) v2Var.mo128745x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(configuration, "configuration");
        n0.n1.a(new n0.i3[]{h3Var2.b(configuration), f92036b.b(context), f92038d.b(m7053xb4c3aed9.f92171a), f92039e.b(owner2), w0.w.f523400a.b(q2Var2), f92040f.b(owner.m7051xfb86a31b()), f92037c.b(eVar)}, u0.j.b(y0Var, 1471621628, true, new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.v0(owner, n1Var, content, i17)), y0Var, 56);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.w0(owner, content, i17);
        }
        java.lang.Object obj4 = n0.e1.f415025a;
    }

    public static final java.lang.Void b(java.lang.String str) {
        throw new java.lang.IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
