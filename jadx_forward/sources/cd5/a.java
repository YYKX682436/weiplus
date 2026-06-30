package cd5;

/* loaded from: classes10.dex */
public final class a implements sl5.d {

    /* renamed from: a, reason: collision with root package name */
    public final uc5.r f122192a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.l f122193b;

    public a(uc5.r controller, yz5.l lVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        lVar = (i17 & 2) != 0 ? null : lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f122192a = controller;
        this.f122193b = lVar;
    }

    public java.util.List a() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25;
        int u07;
        uc5.l0 l0Var;
        android.widget.ImageView imageView;
        android.graphics.Bitmap e17;
        android.graphics.drawable.Drawable newDrawable;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c17 = c();
        xm3.t0 b17 = xm3.u0.b(c17);
        if (b17 == null) {
            return kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int childCount = c17.getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            android.view.View childAt = c17.getChildAt(i17);
            if (childAt == null || (u07 = c17.u0(childAt)) == -1 || (l0Var = (uc5.l0) kz5.n0.a0(b17.m82898xfb7e5820(), u07)) == null) {
                c22849x81a93d25 = c17;
            } else {
                boolean z17 = true;
                boolean z18 = (l0Var instanceof uc5.k0) || (l0Var instanceof uc5.i0) || (l0Var instanceof uc5.j0);
                android.graphics.drawable.Drawable drawable = null;
                if ((l0Var instanceof uc5.h0) && (imageView = (android.widget.ImageView) childAt.findViewById(com.p314xaae8f345.mm.R.id.chd)) != null) {
                    android.graphics.drawable.Drawable drawable2 = imageView.getDrawable();
                    if (drawable2 == null || (drawable2 instanceof android.graphics.drawable.ColorDrawable)) {
                        java.lang.Object tag = imageView.getTag(com.p314xaae8f345.mm.R.id.h9z);
                        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
                        if (str != null && str.length() != 0) {
                            z17 = false;
                        }
                        if (!z17 && (e17 = n11.a.b().e(str)) != null && !e17.isRecycled()) {
                            drawable = new android.graphics.drawable.BitmapDrawable(imageView.getResources(), e17);
                        }
                    } else {
                        android.graphics.drawable.Drawable.ConstantState constantState = drawable2.getConstantState();
                        if (constantState != null && (newDrawable = constantState.newDrawable()) != null) {
                            drawable = newDrawable.mutate();
                        }
                    }
                }
                c22849x81a93d25 = c17;
                arrayList.add(new tl5.j(new android.graphics.RectF(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()), drawable, d(l0Var), u07, z18));
            }
            i17++;
            c17 = c22849x81a93d25;
        }
        return arrayList;
    }

    public int b() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c().getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager : null;
        if (c1161x57298f5d != null) {
            return c1161x57298f5d.f93394w;
        }
        cd5.c.f122194e.getClass();
        return cd5.c.f122195f.f122200d;
    }

    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c() {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) this.f122192a).m7();
    }

    public final long d(uc5.l0 l0Var) {
        long j17;
        long j18;
        if (l0Var instanceof uc5.h0) {
            return ((uc5.h0) l0Var).f508027d.p().m124847x74d37ac6();
        }
        if (l0Var instanceof uc5.k0) {
            j17 = ((uc5.k0) l0Var).f508054h;
            j18 = 1000000;
        } else {
            if (l0Var instanceof uc5.i0) {
                return -9223372036854775807L;
            }
            if (!(l0Var instanceof uc5.j0)) {
                throw new jz5.j();
            }
            uc5.j0 j0Var = (uc5.j0) l0Var;
            j17 = j0Var.f508046f + 2000000;
            j18 = j0Var.f508045e;
        }
        return -(j17 + j18);
    }

    public java.lang.Integer e(boolean z17) {
        cd5.c cVar;
        cd5.c a17 = cd5.c.f122194e.a(b());
        if (a17 == null) {
            return null;
        }
        if (z17) {
            int ordinal = a17.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                cVar = cd5.c.f122196g;
            }
            cVar = null;
        } else {
            int ordinal2 = a17.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    throw new jz5.j();
                }
                cVar = null;
            } else {
                cVar = cd5.c.f122197h;
            }
        }
        if (cVar != null) {
            return java.lang.Integer.valueOf(cVar.f122200d);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cd5.a.f(int, int, int):void");
    }
}
