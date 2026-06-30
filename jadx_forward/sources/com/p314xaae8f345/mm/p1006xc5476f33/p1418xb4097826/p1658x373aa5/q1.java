package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class q1 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f214396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f214397b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f214398c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f214399d;

    public q1(android.content.Context context, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f214396a = context;
        this.f214397b = i17;
        this.f214398c = c0Var;
        this.f214399d = interfaceC29045xdcb5ca57;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        jz5.f0 f0Var;
        int i17;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f214399d;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f214398c;
        if (bitmap != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s1 s1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s1.f214524a;
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.f214396a.getResources(), bitmap);
            int i18 = this.f214397b;
            try {
                i17 = (int) ((i18 * bitmap.getWidth()) / bitmap.getHeight());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcShowBoxUtil", "buildImageSpan " + e17.getMessage());
                i17 = i18 * 2;
            }
            bitmapDrawable.setBounds(0, 0, i17, i18);
            al5.w wVar = new al5.w(bitmapDrawable, 1);
            if (!c0Var.f391645d) {
                c0Var.f391645d = true;
                interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(wVar));
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var != null || c0Var.f391645d) {
            return;
        }
        c0Var.f391645d = true;
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
    }
}
