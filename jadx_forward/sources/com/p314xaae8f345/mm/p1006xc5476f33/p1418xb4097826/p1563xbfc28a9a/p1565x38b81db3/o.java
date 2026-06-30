package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3;

/* loaded from: classes2.dex */
public final class o {
    public o(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final android.graphics.Rect a(android.content.Context context, boolean z17, boolean z18, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Rect rect = new android.graphics.Rect();
        if (z18) {
            int dimension = (i17 - ((int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561257dg))) / 2;
            int i18 = (dimension * 4) / 3;
            if (z17) {
                rect.right = dimension;
                rect.bottom = i18;
            } else {
                rect.bottom = i18;
                rect.right = dimension;
            }
        } else {
            int a17 = (i17 - ym5.x.a(context, 48.0f)) / 3;
            if (z17) {
                int i19 = (a17 * 2) + 4;
                rect.right = i19;
                rect.bottom = a06.d.b((i19 / 3) * 4);
            } else {
                int i27 = (a17 * 2) + 4;
                rect.bottom = i27;
                rect.right = a06.d.b((i27 / 3) * 4);
            }
        }
        return rect;
    }
}
