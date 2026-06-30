package cx2;

/* loaded from: classes9.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f306072a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 f306073b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f306074c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f306075d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f306076e;

    public i(android.content.Context context) {
        this.f306072a = context;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(context);
        this.f306073b = i0Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.A = false;
        aVar.B = false;
        aVar.f293258o = new cx2.h(this);
    }

    public cx2.i a(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a17 = this.f306073b.a();
        this.f306074c = a17;
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f306076e;
        if (onDismissListener != null) {
            a17.setOnDismissListener(onDismissListener);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f306074c;
        java.lang.String str = this.f306075d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        android.content.Context context = this.f306072a;
        if (K0 || str.length() == 0) {
            str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572474bb3);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
            throw null;
        }
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        j0Var.A(str, true, new cx2.f(j0Var, jVar));
        j0Var.w(string, true, new cx2.g(j0Var, jVar));
        return this;
    }

    public cx2.i b(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = this.f306073b;
        i0Var.f293354b.f293249f = booleanValue;
        if (bool.booleanValue()) {
            i0Var.f293354b.f293247d = this.f306072a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572471bb0);
        }
        return this;
    }

    public cx2.i c(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = this.f306073b;
        if (obj != null) {
            java.util.List<java.lang.String> P1 = obj instanceof java.lang.String ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(((java.lang.String) obj).split(",")) : obj instanceof java.util.List ? (java.util.List) obj : null;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(P1)) {
                int size = P1.size();
                android.content.Context context = this.f306072a;
                if (size == 1) {
                    java.lang.String str = (java.lang.String) P1.get(0);
                    i65.a.b(context, (int) (i65.a.q(context) * 20.0f));
                    android.text.SpannableString Ai = ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i27).toString());
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
                    aVar.f293242a = Ai;
                    aVar.S = 3;
                    ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                    java.lang.String e17 = c01.a2.e(str);
                    i65.a.b(context, (int) (i65.a.q(context) * 14.0f));
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
                        ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).getClass();
                        android.text.SpannableString Ai2 = ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(context, (e17 + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ifs, java.lang.Integer.valueOf(c01.v1.o(str)))).toString());
                        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a48, (android.view.ViewGroup) null);
                        android.widget.GridView gridView = (android.widget.GridView) inflate.findViewById(com.p314xaae8f345.mm.R.id.bgk);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).getClass();
                        java.util.List m17 = c01.v1.m(str);
                        i0Var.c(str, Ai2, java.lang.Boolean.TRUE, new cx2.a(inflate, arrayList, str, m17), new cx2.b());
                        cx2.d dVar = new cx2.d(i0Var, context, str);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar2 = i0Var.f293354b;
                        aVar2.f293256m = dVar;
                        gridView.setAdapter((android.widget.ListAdapter) new cx2.m(context, m17, arrayList));
                        gridView.setSelector(new android.graphics.drawable.ColorDrawable(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e)));
                        if (m17 != null) {
                            if (((java.util.LinkedList) m17).size() > 16) {
                                gridView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561168ba)));
                                gridView.setPadding(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561165b7), 0, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561165b7), 0);
                            } else {
                                gridView.setPadding(0, 0, 0, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561162b4));
                            }
                        }
                        aVar2.N = inflate;
                    } else {
                        i0Var.c(str, ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(context, e17.toString()), java.lang.Boolean.FALSE, null, new cx2.e());
                    }
                } else {
                    android.view.View inflate2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.a09, null);
                    int i17 = 0;
                    for (java.lang.String str2 : P1) {
                        if (i17 <= 8 && inflate2 != null) {
                            android.widget.ImageView imageView = (android.widget.ImageView) inflate2.findViewById(cx2.j.f306077a[i17]);
                            if (str2 != null) {
                                imageView.setVisibility(0);
                                ng5.a.a(imageView, str2);
                                i17++;
                            }
                        }
                    }
                    i0Var.f293354b.M = inflate2;
                    java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h0p);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar3 = i0Var.f293354b;
                    aVar3.f293242a = string;
                    aVar3.S = 3;
                }
            }
        }
        i0Var.f293354b.C = true;
        return this;
    }
}
