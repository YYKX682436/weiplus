package cd5;

/* loaded from: classes10.dex */
public final class a implements sl5.d {

    /* renamed from: a, reason: collision with root package name */
    public final uc5.r f40659a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.l f40660b;

    public a(uc5.r controller, yz5.l lVar, int i17, kotlin.jvm.internal.i iVar) {
        lVar = (i17 & 2) != 0 ? null : lVar;
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f40659a = controller;
        this.f40660b = lVar;
    }

    public java.util.List a() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        int u07;
        uc5.l0 l0Var;
        android.widget.ImageView imageView;
        android.graphics.Bitmap e17;
        android.graphics.drawable.Drawable newDrawable;
        com.tencent.mm.view.recyclerview.WxRecyclerView c17 = c();
        xm3.t0 b17 = xm3.u0.b(c17);
        if (b17 == null) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int childCount = c17.getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            android.view.View childAt = c17.getChildAt(i17);
            if (childAt == null || (u07 = c17.u0(childAt)) == -1 || (l0Var = (uc5.l0) kz5.n0.a0(b17.getData(), u07)) == null) {
                wxRecyclerView = c17;
            } else {
                boolean z17 = true;
                boolean z18 = (l0Var instanceof uc5.k0) || (l0Var instanceof uc5.i0) || (l0Var instanceof uc5.j0);
                android.graphics.drawable.Drawable drawable = null;
                if ((l0Var instanceof uc5.h0) && (imageView = (android.widget.ImageView) childAt.findViewById(com.tencent.mm.R.id.chd)) != null) {
                    android.graphics.drawable.Drawable drawable2 = imageView.getDrawable();
                    if (drawable2 == null || (drawable2 instanceof android.graphics.drawable.ColorDrawable)) {
                        java.lang.Object tag = imageView.getTag(com.tencent.mm.R.id.h9z);
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
                wxRecyclerView = c17;
                arrayList.add(new tl5.j(new android.graphics.RectF(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()), drawable, d(l0Var), u07, z18));
            }
            i17++;
            c17 = wxRecyclerView;
        }
        return arrayList;
    }

    public int b() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = c().getLayoutManager();
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            return gridLayoutManager.f11861w;
        }
        cd5.c.f40661e.getClass();
        return cd5.c.f40662f.f40667d;
    }

    public com.tencent.mm.view.recyclerview.WxRecyclerView c() {
        return ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) this.f40659a).m7();
    }

    public final long d(uc5.l0 l0Var) {
        long j17;
        long j18;
        if (l0Var instanceof uc5.h0) {
            return ((uc5.h0) l0Var).f426494d.p().getMsgId();
        }
        if (l0Var instanceof uc5.k0) {
            j17 = ((uc5.k0) l0Var).f426521h;
            j18 = 1000000;
        } else {
            if (l0Var instanceof uc5.i0) {
                return -9223372036854775807L;
            }
            if (!(l0Var instanceof uc5.j0)) {
                throw new jz5.j();
            }
            uc5.j0 j0Var = (uc5.j0) l0Var;
            j17 = j0Var.f426513f + 2000000;
            j18 = j0Var.f426512e;
        }
        return -(j17 + j18);
    }

    public java.lang.Integer e(boolean z17) {
        cd5.c cVar;
        cd5.c a17 = cd5.c.f40661e.a(b());
        if (a17 == null) {
            return null;
        }
        if (z17) {
            int ordinal = a17.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                cVar = cd5.c.f40663g;
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
                cVar = cd5.c.f40664h;
            }
        }
        if (cVar != null) {
            return java.lang.Integer.valueOf(cVar.f40667d);
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
