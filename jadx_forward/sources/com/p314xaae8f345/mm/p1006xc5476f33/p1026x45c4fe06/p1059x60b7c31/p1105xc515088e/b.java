package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.e f164245d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.e eVar) {
        this.f164245d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.e eVar = this.f164245d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12783xcbc1da9e c12783xcbc1da9e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12783xcbc1da9e) eVar.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12783xcbc1da9e.class);
        if (c12783xcbc1da9e == null) {
            eVar.d("fail cant init view", null);
            return;
        }
        tl1.b bVar = eVar.f501733d;
        bVar.m166747x3c802832(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.c(eVar));
        if (eVar.f164254n != null) {
            c12783xcbc1da9e.f173319g = new java.util.Date(eVar.f164254n.longValue());
        }
        if (eVar.f164255o != null) {
            c12783xcbc1da9e.f173320h = new java.util.Date(eVar.f164255o.longValue());
        }
        int i17 = eVar.f164256p;
        int i18 = eVar.f164257q;
        int i19 = eVar.f164258r;
        boolean z17 = eVar.f164253m.ordinal() >= com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.d.f164247e.ordinal();
        boolean z18 = eVar.f164253m.ordinal() >= com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.d.f164248f.ordinal();
        boolean z19 = eVar.f164253m.ordinal() >= com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.d.f164249g.ordinal();
        c12783xcbc1da9e.f173324o = z19;
        c12783xcbc1da9e.f173325p = z18;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i17, i18 - 1, i19);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTime(c12783xcbc1da9e.f173319g);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        calendar3.setTime(c12783xcbc1da9e.f173320h);
        tl1.e eVar2 = new tl1.e(c12783xcbc1da9e);
        android.content.Context context = c12783xcbc1da9e.f173318f;
        t51.b bVar2 = new t51.b(context, eVar2);
        tl1.d dVar = new tl1.d(c12783xcbc1da9e);
        u51.a aVar = bVar2.f497241a;
        aVar.f506315c = dVar;
        aVar.f506318f = false;
        aVar.f506319g = new boolean[]{z17, z18, z19, false, false, false};
        aVar.f506320h = calendar;
        bVar2.b(calendar2, calendar3);
        bVar2.f497241a.f506327o = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a7c);
        w51.g gVar = c12783xcbc1da9e.f173317e;
        bVar2.a(gVar);
        gVar.g(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561670pc));
        context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a7c);
        gVar.f524508p.getClass();
        gVar.f524508p.f(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
        gVar.h(0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        java.util.Iterator it = ((java.util.ArrayList) gVar.e()).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480 = (com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) it.next();
            c11323x28056480.e(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
            c11323x28056480.f153912d = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            c11323x28056480.invalidate();
            c11323x28056480.setBackgroundColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) gVar.e();
        if (arrayList.size() == 1) {
            ((com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) arrayList.get(0)).setPadding(0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        } else if (arrayList.size() == 2) {
            ((com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) arrayList.get(0)).setPadding(0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            ((com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) arrayList.get(1)).setPadding(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        } else if (arrayList.size() == 3) {
            ((com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) arrayList.get(0)).setPadding(0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            ((com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) arrayList.get(1)).setPadding(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            ((com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) arrayList.get(2)).setPadding(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        }
        bVar.mo166745xf81398f(eVar.f164277h);
        bVar.i();
    }
}
