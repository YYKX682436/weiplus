package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e;

/* loaded from: classes8.dex */
public final class h extends jk3.v {
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.c A = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.c(null);
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.b B = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.b();

    /* renamed from: x, reason: collision with root package name */
    public yz5.a f202397x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.a f202398y;

    /* renamed from: z, reason: collision with root package name */
    public yz5.a f202399z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, ak3.c cVar) {
        super(cVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static void c0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar, android.graphics.Bitmap bitmap, int[] iArr, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            bitmap = null;
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        ak3.c cVar = hVar.f381644d;
        if (cVar != null) {
            if (bitmap == null) {
                bitmap = z17 ? hVar.f381656p : hVar.h(cVar.mo2158x12501425());
            }
            hVar.l(bitmap, true);
        }
    }

    @Override // jk3.b
    public void B(boolean z17) {
        super.B(z17);
    }

    @Override // jk3.b
    public boolean E() {
        yz5.a aVar = this.f202399z;
        return !(aVar != null && !((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue());
    }

    @Override // jk3.v
    public void Q(boolean z17) {
        super.Q(true);
    }

    @Override // jk3.v
    public boolean U(int i17, boolean z17) {
        return super.U(i17, z17);
    }

    @Override // jk3.v
    public boolean Z() {
        yz5.a aVar = this.f202398y;
        return !(aVar != null && !((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue());
    }

    public final void d0(boolean z17) {
        if (z17) {
            dk3.f fVar = this.f381648h;
            if (fVar != null) {
                ((dk3.e) fVar).c();
                return;
            }
            return;
        }
        dk3.f fVar2 = this.f381648h;
        if (fVar2 != null) {
            dk3.e eVar = (dk3.e) fVar2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "stop FloatIndicatorController");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new dk3.b(eVar));
            eVar.f315983b.h(null);
        }
    }

    @Override // jk3.b, jk3.e
    public void j() {
        yz5.a aVar = this.f202397x;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // jk3.b
    public boolean x() {
        return true;
    }

    @Override // jk3.v, jk3.b
    public void y(int i17, java.lang.String str) {
        super.y(i17, str);
        this.f381650j = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.e(this);
    }
}
