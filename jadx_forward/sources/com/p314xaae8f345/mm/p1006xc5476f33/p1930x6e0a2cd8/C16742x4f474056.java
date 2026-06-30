package com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8;

/* renamed from: com.tencent.mm.plugin.newtips.NormalIconNewTipPreference */
/* loaded from: classes8.dex */
public class C16742x4f474056 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21557x1753ef1b implements com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a {
    public final android.content.Context Y1;
    public android.view.View Z1;

    /* renamed from: a2, reason: collision with root package name */
    public final java.lang.String f233890a2;

    /* renamed from: b2, reason: collision with root package name */
    public java.lang.String f233891b2;

    /* renamed from: c2, reason: collision with root package name */
    public java.lang.ref.WeakReference f233892c2;

    /* renamed from: d2, reason: collision with root package name */
    public k70.f0 f233893d2;

    /* renamed from: e2, reason: collision with root package name */
    public rn3.g f233894e2;

    /* renamed from: f2, reason: collision with root package name */
    public rn3.h f233895f2;

    /* renamed from: g2, reason: collision with root package name */
    public final k70.f0 f233896g2;

    /* renamed from: h2, reason: collision with root package name */
    public boolean f233897h2;

    public C16742x4f474056(android.content.Context context) {
        this(context, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean T1(boolean z17, r45.pm6 pm6Var) {
        if (z17) {
            c0(8);
            b0(0);
            d0(pm6Var.f464720e, -1, android.graphics.Color.parseColor("#8c8c8c"));
            e0(true);
            Y(8);
        } else {
            c0(8);
            b0(8);
            Y(8);
            a0(8);
        }
        k0();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean W5() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean Y3(boolean z17) {
        if (z17) {
            a0(0);
            this.V = this.Y1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572034wv);
            this.W = com.p314xaae8f345.mm.R.C30861xcebc809e.asx;
        } else {
            c0(8);
            b0(8);
            Y(8);
            a0(8);
        }
        k0();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        if (z17) {
            a0(0);
            java.lang.String str = pm6Var.f464719d + "";
            if (pm6Var.f464719d > 99) {
                str = this.Y1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574837jo3);
            }
            int b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(this.f279303d, pm6Var.f464719d);
            this.V = str;
            this.W = b17;
        } else {
            c0(8);
            b0(8);
            Y(8);
            a0(8);
        }
        k0();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public void c1(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar) {
        rn3.h hVar = this.f233895f2;
        if (hVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17480xafb1a6c c17480xafb1a6c = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17480xafb1a6c) hVar;
            c17480xafb1a6c.getClass();
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617.I;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "plugin ShowNewTipsCallback = " + z17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 c16742x4f474056 = c17480xafb1a6c.f242293a;
            if (z17) {
                c16742x4f474056.H("");
                return;
            }
            java.lang.String c17 = v24.s0.c();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
                return;
            }
            c16742x4f474056.D = true;
            c16742x4f474056.E = android.text.TextUtils.TruncateAt.END;
            c16742x4f474056.H(c17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public void e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar, boolean z17) {
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.b(this, rVar, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    /* renamed from: getPath */
    public java.lang.String mo54844xfb83cc9b() {
        return this.f233890a2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public android.view.View h() {
        if (this.Z1 == null) {
            this.Z1 = new android.view.View(this.Y1);
        }
        return this.Z1;
    }

    public void h0() {
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.a(this);
    }

    public final float i0(android.graphics.Bitmap bitmap) {
        return java.lang.Math.max(this.Y1.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561178bk) * 1.0f, java.lang.Math.min(bitmap.getHeight(), bitmap.getWidth()) * 0.1f);
    }

    public void k0() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar;
        java.lang.ref.WeakReference weakReference = this.f233892c2;
        if (weakReference == null || (rVar = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r) weakReference.get()) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
    }

    public void l0(android.graphics.Bitmap bitmap) {
    }

    public void n0(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar) {
        this.f233892c2 = new java.lang.ref.WeakReference(rVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean o0(boolean z17) {
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.l(z17, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        android.graphics.Bitmap s07;
        if (z17) {
            c0(8);
            Y(0);
            T(0);
            V(0);
            e0(false);
            android.content.Context context = this.Y1;
            android.content.res.Resources resources = context.getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/newtips/NormalIconNewTipPreference", "showRedPointIcon", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/newtips/NormalIconNewTipPreference", "showRedPointIcon", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            if (this.f233897h2) {
                android.content.res.Resources resources2 = context.getResources();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bhp));
                arrayList2.add(resources2);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/newtips/NormalIconNewTipPreference", "showRedPointIcon", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
                yj0.a.e(obj2, decodeResource, "com/tencent/mm/plugin/newtips/NormalIconNewTipPreference", "showRedPointIcon", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            }
            R(decodeResource);
            android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(pm6Var.f464721f);
            if (this.f233893d2 != null) {
                if (Bi != null) {
                    rn3.g gVar = this.f233894e2;
                    if (gVar != null) {
                        gVar.a(null);
                    }
                    if (this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16738xd72a6f01) {
                        l0(Bi);
                    }
                    R(Bi);
                } else {
                    rn3.g gVar2 = this.f233894e2;
                    if (gVar2 != null) {
                        gVar2.a(pm6Var.f464721f);
                    }
                    ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(pm6Var.f464721f, this.f233893d2);
                }
            } else if (Bi != null) {
                this.f233891b2 = null;
                if (this.f233897h2) {
                    s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(Bi, false, Bi.getWidth() / 2);
                } else if (this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16738xd72a6f01) {
                    s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(Bi, false, i0(Bi));
                    l0(s07);
                } else {
                    s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(Bi, false, Bi.getWidth() * 0.1f);
                }
                R(s07);
            } else {
                ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(pm6Var.f464721f, this.f233896g2);
                this.f233891b2 = pm6Var.f464721f;
            }
        } else {
            c0(8);
            b0(8);
            Y(8);
            a0(8);
        }
        k0();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21557x1753ef1b, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        if (this.Z1 == null) {
            this.Z1 = u17;
        }
        return u17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        android.graphics.Bitmap s07;
        if (z17) {
            c0(8);
            Y(0);
            T(0);
            V(0);
            b0(0);
            e0(false);
            d0(pm6Var.f464720e, -1, android.graphics.Color.parseColor("#8c8c8c"));
            android.content.Context context = this.Y1;
            android.content.res.Resources resources = context.getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/newtips/NormalIconNewTipPreference", "showRedPointPointTitleIcon", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/newtips/NormalIconNewTipPreference", "showRedPointPointTitleIcon", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            if (this.f233897h2) {
                android.content.res.Resources resources2 = context.getResources();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bhp));
                arrayList2.add(resources2);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/newtips/NormalIconNewTipPreference", "showRedPointPointTitleIcon", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
                yj0.a.e(obj2, decodeResource, "com/tencent/mm/plugin/newtips/NormalIconNewTipPreference", "showRedPointPointTitleIcon", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            }
            R(decodeResource);
            android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(pm6Var.f464721f);
            if (this.f233893d2 != null) {
                if (Bi != null) {
                    rn3.g gVar = this.f233894e2;
                    if (gVar != null) {
                        gVar.a(null);
                    }
                    if (this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16738xd72a6f01) {
                        l0(Bi);
                    }
                    R(Bi);
                } else {
                    ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(pm6Var.f464721f, this.f233893d2);
                    rn3.g gVar2 = this.f233894e2;
                    if (gVar2 != null) {
                        gVar2.a(pm6Var.f464721f);
                    }
                }
            } else if (Bi != null) {
                this.f233891b2 = null;
                if (this.f233897h2) {
                    s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(Bi, false, Bi.getWidth() / 2);
                } else if (this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16738xd72a6f01) {
                    s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(Bi, false, i0(Bi));
                    l0(s07);
                } else {
                    s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(Bi, false, Bi.getWidth() * 0.1f);
                }
                R(s07);
            } else {
                ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(pm6Var.f464721f, this.f233896g2);
                this.f233891b2 = pm6Var.f464721f;
            }
        } else {
            c0(8);
            b0(8);
            Y(8);
            a0(8);
        }
        k0();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean y(boolean z17) {
        if (z17) {
            c0(0);
        } else {
            c0(8);
            b0(8);
            Y(8);
            a0(8);
        }
        k0();
        return true;
    }

    public C16742x4f474056(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C16742x4f474056(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f233891b2 = null;
        this.f233892c2 = null;
        this.f233896g2 = new rn3.f(this);
        this.f233897h2 = false;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, di0.a.f314156a, i17, 0);
        java.lang.String string = obtainStyledAttributes.getString(0);
        this.f233890a2 = string;
        this.Y1 = context;
        obtainStyledAttributes.recycle();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NormalIconNewTipPreference", "NormalIconNewTipPreference() path:%s", string);
    }
}
