package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f262457a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f262458b = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f262459c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f262460d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f262461e;

    public m() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5186xcb31c54e> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5186xcb31c54e>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.utils.BankcardLogoHelper$1
            {
                this.f39173x3fe91575 = 585646942;
            }

            /* JADX WARN: Code restructure failed: missing block: B:75:0x0114, code lost:
            
                r1.unlock();
             */
            /* JADX WARN: Code restructure failed: missing block: B:76:0x0117, code lost:
            
                return true;
             */
            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5186xcb31c54e r8) {
                /*
                    Method dump skipped, instructions count: 281
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19155x1a642912.mo1xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f262459c = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
    }

    public void a() {
        this.f262459c.mo48814x2efc64();
        java.util.ArrayList arrayList = this.f262457a;
        if (arrayList != null) {
            arrayList.clear();
            this.f262457a = null;
        }
    }

    public boolean b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        at4.k c17 = c01.z1.I() ? dt4.b.c(context, c19091x9511676c.f69217xaef0808c, false) : dt4.b.c(context, c19091x9511676c.f69223x58802fcb, c19091x9511676c.F0());
        return (c17 == null || c17.f95417g) ? false : true;
    }

    public void c(android.content.Context context, java.util.List list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        int size = list.size();
        this.f262460d = new java.util.LinkedList();
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) list.get(i17);
            if (c19091x9511676c.v0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankcardLogoHelper", "ignore balance");
            } else if (!b(context, c19091x9511676c)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankcardLogoHelper", c19091x9511676c.f69223x58802fcb + "'s url is null or need update");
                this.f262460d.add(c19091x9511676c.f69223x58802fcb);
            }
        }
        if (this.f262460d.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankcardLogoHelper", "use cache bankcard logo data");
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5186xcb31c54e().e();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankcardLogoHelper", "doScene to get bankcard logo");
        ss4.f fVar = new ss4.f(this.f262460d);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(1650, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.e(this, context));
        gm0.j1.i();
        gm0.j1.n().f354821b.g(fVar);
    }

    public void d(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c, android.widget.ImageView imageView, android.view.View view, android.widget.ImageView imageView2, android.widget.TextView textView) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l();
        lVar.f262453m = false;
        lVar.f262447d = c19091x9511676c;
        if (imageView != null) {
            imageView.setTag(com.p314xaae8f345.mm.R.id.pbo, c19091x9511676c.f69223x58802fcb);
            lVar.f262448e = new java.lang.ref.WeakReference(imageView);
        }
        if (view != null) {
            lVar.f262449f = new java.lang.ref.WeakReference(view);
        }
        if (imageView2 != null) {
            lVar.f262450g = new java.lang.ref.WeakReference(imageView2);
        }
        if (textView != null) {
            lVar.f262451h = new java.lang.ref.WeakReference(textView);
        }
        this.f262457a.add(lVar);
        java.lang.String str = c01.z1.I() ? c19091x9511676c.f69217xaef0808c : c19091x9511676c.f69223x58802fcb;
        java.util.LinkedList linkedList = this.f262460d;
        if (linkedList != null && linkedList.contains(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankcardLogoHelper", "waiting resp:" + str);
        } else {
            if (b(context, c19091x9511676c)) {
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5186xcb31c54e().e();
                return;
            }
            if (this.f262461e == null) {
                this.f262461e = new java.util.LinkedList();
            }
            this.f262461e.add(c19091x9511676c);
            if (this.f262460d == null) {
                c(context, this.f262461e);
            }
        }
    }

    public void e(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c, android.widget.ImageView imageView) {
        d(context, c19091x9511676c, imageView, null, null, null);
    }

    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c, android.widget.ImageView imageView) {
        java.lang.ref.WeakReference weakReference;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l();
        lVar.f262447d = c19091x9511676c;
        if (imageView != null) {
            imageView.setTag(com.p314xaae8f345.mm.R.id.pbo, c19091x9511676c.f69223x58802fcb);
            lVar.f262448e = new java.lang.ref.WeakReference(imageView);
        }
        at4.k kVar = c19091x9511676c.f261095a3;
        if (kVar == null || (weakReference = lVar.f262448e) == null || weakReference.get() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankcardLogoHelper", "bankUrls == null");
            return;
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) lVar.f262448e.get();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f95411a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankcardLogoHelper", "bankcard logoUrl == null");
            return;
        }
        lVar.f262452i = kVar.f95411a;
        lVar.f262453m = true;
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        gt4.c1 c1Var = new gt4.c1(kVar.f95411a);
        ((x60.e) fVar).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(c1Var);
        if (d17 != null) {
            imageView2.setImageBitmap(d17);
        }
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(lVar);
    }
}
