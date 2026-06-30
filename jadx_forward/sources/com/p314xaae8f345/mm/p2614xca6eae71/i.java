package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public class i implements com.p314xaae8f345.mm.p2614xca6eae71.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f f274804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f274805b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f f274806c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f274807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.text.Spannable f274808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pg5.a f274809f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2614xca6eae71.g f274810g;

    public i(com.p314xaae8f345.mm.p2614xca6eae71.g gVar, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, int i17, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2, int i18, android.text.Spannable spannable, pg5.a aVar) {
        this.f274810g = gVar;
        this.f274804a = c19767x257d7f;
        this.f274805b = i17;
        this.f274806c = c19767x257d7f2;
        this.f274807d = i18;
        this.f274808e = spannable;
        this.f274809f = aVar;
    }

    @Override // com.p314xaae8f345.mm.p2614xca6eae71.b1
    public boolean a(final com.p314xaae8f345.mm.p2614xca6eae71.a1 a1Var, final int i17, final int i18) {
        android.graphics.Bitmap bitmap;
        final boolean z17 = a1Var instanceof com.p314xaae8f345.mm.p2614xca6eae71.h1;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = this.f274804a;
        boolean z18 = true;
        boolean z19 = c19767x257d7f.f38864x6ac9171 < this.f274805b;
        this.f274806c.f38864x6ac9171++;
        final int i19 = this.f274807d;
        final android.text.Spannable spannable = this.f274808e;
        final r.a aVar = new r.a() { // from class: com.tencent.mm.smiley.i$$a
            @Override // r.a
            /* renamed from: apply */
            public final java.lang.Object mo1850x58b836e(java.lang.Object obj) {
                boolean z27 = z17;
                android.text.Spannable spannable2 = spannable;
                int i27 = i17;
                int i28 = i18;
                android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj;
                com.p314xaae8f345.mm.p2614xca6eae71.i iVar = com.p314xaae8f345.mm.p2614xca6eae71.i.this;
                iVar.getClass();
                int i29 = i19;
                if (i29 == 0) {
                    return null;
                }
                if (i29 == 2) {
                    if (z27) {
                        return null;
                    }
                    iVar.f274810g.e(spannable2, drawable, i27, i28, false);
                    return null;
                }
                if (i29 != 3) {
                    iVar.f274810g.e(spannable2, drawable, i27, i28, z27);
                    return null;
                }
                if (!z27) {
                    return null;
                }
                iVar.f274810g.e(spannable2, drawable, i27, i28, true);
                return null;
            }
        };
        if (a1Var instanceof com.p314xaae8f345.mm.p2614xca6eae71.b2) {
            if (z19 && (!((com.p314xaae8f345.mm.p2614xca6eae71.b2) a1Var).f274754b || this.f274809f.f435782h)) {
                c19767x257d7f.f38864x6ac9171++;
            } else {
                z18 = false;
            }
        }
        if (!z18) {
            return false;
        }
        int i27 = com.p314xaae8f345.mm.p2614xca6eae71.e.f274769b;
        com.p314xaae8f345.mm.p2614xca6eae71.d.f274766a.getClass();
        android.graphics.drawable.BitmapDrawable bitmapDrawable = null;
        if (a1Var != null) {
            if (a1Var instanceof com.p314xaae8f345.mm.p2614xca6eae71.b2) {
                gr.q.f356209a.getClass();
                bitmap = gr.q.f356210b.d(java.lang.String.valueOf(((com.p314xaae8f345.mm.p2614xca6eae71.b2) a1Var).f274753a.f274792d));
            } else if (a1Var instanceof com.p314xaae8f345.mm.p2614xca6eae71.h1) {
                com.p314xaae8f345.mm.p2614xca6eae71.t1.f274908m.a();
                com.p314xaae8f345.mm.p2614xca6eae71.h1 h1Var = (com.p314xaae8f345.mm.p2614xca6eae71.h1) a1Var;
                int i28 = h1Var.f274799a;
                if (i28 >= 0) {
                    gr.q.f356209a.getClass();
                    bitmap = gr.q.f356210b.c(i28 + ".wxam");
                } else {
                    gr.q.f356209a.getClass();
                    bitmap = gr.q.f356210b.c(h1Var.f274802d);
                }
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), bitmap);
            }
        }
        if (bitmapDrawable != null) {
            aVar.mo1850x58b836e(bitmapDrawable);
        } else {
            ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: com.tencent.mm.smiley.i$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p2614xca6eae71.a1 a1Var2 = com.p314xaae8f345.mm.p2614xca6eae71.a1.this;
                    final r.a aVar2 = aVar;
                    int i29 = com.p314xaae8f345.mm.p2614xca6eae71.e.f274769b;
                    final android.graphics.drawable.Drawable a17 = com.p314xaae8f345.mm.p2614xca6eae71.d.f274766a.a(a1Var2, true);
                    if (a17 != null) {
                        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.smiley.i$$c
                            @Override // java.lang.Runnable
                            public final void run() {
                                r.a.this.mo1850x58b836e(a17);
                            }
                        });
                    }
                }
            });
        }
        return false;
    }
}
