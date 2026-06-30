package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b;

/* loaded from: classes12.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Bitmap f286342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332 f286343b;

    public i0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332 c22101xd1256332) {
        this.f286343b = c22101xd1256332;
    }

    public final void a(android.graphics.Bitmap bitmap, boolean z17) {
        this.f286342a = bitmap;
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332 c22101xd1256332 = this.f286343b;
        if (bitmap == null) {
            em.t tVar = c22101xd1256332.f286271y;
            if (tVar != null) {
                tVar.c().setImageResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
        }
        em.t tVar2 = c22101xd1256332.f286271y;
        if (tVar2 != null) {
            tVar2.c().setImageBitmap(bitmap);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
    }
}
