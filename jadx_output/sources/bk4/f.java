package bk4;

/* loaded from: classes11.dex */
public abstract class f {
    public static /* synthetic */ void R(bk4.f fVar, android.widget.ImageView imageView, java.lang.String str, bi4.d dVar, bi4.b bVar, mj4.h hVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBigIcon");
        }
        if ((i17 & 4) != 0) {
            dVar = bi4.d.FILLED;
        }
        bi4.d dVar2 = dVar;
        if ((i17 & 8) != 0) {
            bVar = bi4.b.DEFAULT;
        }
        bi4.b bVar2 = bVar;
        if ((i17 & 16) != 0) {
            hVar = null;
        }
        fVar.Q(imageView, str, dVar2, bVar2, hVar);
    }

    public static /* synthetic */ void V(bk4.f fVar, android.widget.ImageView imageView, java.lang.String str, bi4.d dVar, bi4.b bVar, mj4.h hVar, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIcon");
        }
        fVar.U(imageView, str, (i17 & 4) != 0 ? bi4.d.FILLED : dVar, (i17 & 8) != 0 ? bi4.b.DEFAULT : bVar, (i17 & 16) != 0 ? null : hVar, (i17 & 32) != 0 ? false : z17, (i17 & 64) != 0 ? false : z18);
    }

    public abstract boolean A(java.lang.String str);

    public abstract boolean B(mj4.h hVar);

    public abstract boolean C();

    public abstract boolean D();

    public abstract boolean E();

    public abstract boolean F();

    public abstract boolean G();

    public abstract boolean H();

    public abstract boolean I();

    public abstract boolean J();

    public abstract boolean K();

    public abstract boolean L(java.lang.String str);

    public abstract void M();

    public abstract void N();

    public final java.lang.CharSequence O(android.view.View view, java.lang.String str, java.lang.CharSequence charSequence, int i17, bi4.d iconType, bi4.c iconScene) {
        kotlin.jvm.internal.o.g(iconType, "iconType");
        kotlin.jvm.internal.o.g(iconScene, "iconScene");
        boolean z17 = true;
        if (str == null || r26.n0.N(str)) {
            return null;
        }
        if (charSequence == null || charSequence.length() == 0) {
            return null;
        }
        mj4.h M = ai4.m0.f5173a.M(str);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence);
        bk4.u0[] u0VarArr = (bk4.u0[]) spannableStringBuilder.getSpans(0, charSequence != null ? charSequence.length() : 0, bk4.u0.class);
        kotlin.jvm.internal.o.d(u0VarArr);
        int length = u0VarArr.length;
        int i18 = 0;
        boolean z18 = false;
        while (i18 < length) {
            spannableStringBuilder.removeSpan(u0VarArr[i18]);
            i18++;
            z18 = true;
        }
        if (M != null) {
            mj4.k kVar = (mj4.k) M;
            android.text.style.ImageSpan k17 = bk4.i.a().k(view, kVar.h(), iconType, kVar.z() ? bi4.b.GREY : bi4.b.DEFAULT, iconScene, i17, M);
            if (!r26.n0.E(spannableStringBuilder, (char) 8199, false, 2, null)) {
                spannableStringBuilder.append((char) 8199);
            }
            spannableStringBuilder.setSpan(k17, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 34);
        } else {
            z17 = z18;
        }
        if (z17) {
            return spannableStringBuilder;
        }
        return null;
    }

    public abstract void P(java.lang.Integer num);

    public abstract void Q(android.widget.ImageView imageView, java.lang.String str, bi4.d dVar, bi4.b bVar, mj4.h hVar);

    public abstract void S(long j17);

    public abstract void T(java.lang.String str);

    public abstract void U(android.widget.ImageView imageView, java.lang.String str, bi4.d dVar, bi4.b bVar, mj4.h hVar, boolean z17, boolean z18);

    public abstract boolean a(java.lang.String str);

    public abstract pj4.p1 b();

    public abstract java.lang.String c(pj4.o0 o0Var, int i17, java.lang.String str, int i18);

    public abstract pj4.p1 d();

    public abstract java.lang.String e();

    public abstract java.lang.String f();

    public abstract java.util.ArrayList g();

    public abstract java.util.ArrayList h();

    public final android.graphics.drawable.Drawable i(android.graphics.Bitmap bitmap, boolean z17, bi4.d iconType, bi4.b iconColor) {
        int color;
        kotlin.jvm.internal.o.g(iconType, "iconType");
        kotlin.jvm.internal.o.g(iconColor, "iconColor");
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(bitmap);
        if (z17) {
            return bitmapDrawable;
        }
        if (bk4.e.f21457a[iconType.ordinal()] == 1) {
            switch (iconColor.ordinal()) {
                case 1:
                    color = -1;
                    break;
                case 2:
                    color = com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f478525a6);
                    break;
                case 3:
                    color = com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f478502m);
                    break;
                case 4:
                default:
                    color = com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f478547ah);
                    break;
                case 5:
                    color = com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2);
                    break;
                case 6:
                    color = com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.FG_1);
                    break;
                case 7:
                    color = com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.FG_0);
                    break;
                case 8:
                    color = com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.FG_2);
                    break;
                case 9:
                    color = com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.FG_3);
                    break;
            }
            com.tencent.mm.ui.uk.f(bitmapDrawable, color);
        } else {
            int ordinal = iconColor.ordinal();
            com.tencent.mm.ui.uk.f(bitmapDrawable, ordinal != 6 ? ordinal != 10 ? com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f478553an) : com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.a0c) : com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.FG_1));
        }
        return bitmapDrawable;
    }

    public abstract pj4.o1 j(java.lang.String str);

    public abstract android.text.style.ImageSpan k(android.view.View view, java.lang.String str, bi4.d dVar, bi4.b bVar, bi4.c cVar, int i17, mj4.h hVar);

    public abstract java.lang.String l(java.lang.String str);

    public abstract java.lang.String m(pj4.o0 o0Var);

    public abstract java.lang.String n(java.lang.String str);

    public abstract long o();

    public abstract pj4.k0 p();

    public final android.text.style.ImageSpan q(android.widget.TextView textView, java.lang.String str, bi4.c cVar, int i17) {
        mj4.h M = ai4.m0.f5173a.M(str);
        if (M == null) {
            return null;
        }
        int i18 = cVar == null ? -1 : bk4.e.f21458b[cVar.ordinal()];
        return k(textView, ((mj4.k) M).h(), bi4.d.OUTLINED, i18 != 1 ? i18 != 2 ? i18 != 3 ? ((mj4.k) M).z() ? bi4.b.GREY : bi4.b.DEFAULT : bi4.b.FG_2 : bi4.b.FG_0 : bi4.b.WHITE, cVar, i17, M);
    }

    public abstract void r(pj4.e1 e1Var);

    public abstract void s(pj4.e1 e1Var);

    public abstract void t(pj4.e1 e1Var);

    public abstract boolean u(pj4.e1 e1Var, ej4.e eVar);

    public abstract void v();

    public abstract boolean w();

    public abstract boolean x();

    public abstract boolean y();

    public abstract boolean z();
}
