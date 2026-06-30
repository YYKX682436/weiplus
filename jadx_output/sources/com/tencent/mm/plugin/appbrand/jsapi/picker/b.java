package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.picker.e f82712d;

    public b(com.tencent.mm.plugin.appbrand.jsapi.picker.e eVar) {
        this.f82712d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.picker.e eVar = this.f82712d;
        com.tencent.mm.plugin.appbrand.widget.picker.AppBrandDatePickerV2 appBrandDatePickerV2 = (com.tencent.mm.plugin.appbrand.widget.picker.AppBrandDatePickerV2) eVar.c(com.tencent.mm.plugin.appbrand.widget.picker.AppBrandDatePickerV2.class);
        if (appBrandDatePickerV2 == null) {
            eVar.d("fail cant init view", null);
            return;
        }
        tl1.b bVar = eVar.f420200d;
        bVar.setOnResultListener(new com.tencent.mm.plugin.appbrand.jsapi.picker.c(eVar));
        if (eVar.f82721n != null) {
            appBrandDatePickerV2.f91786g = new java.util.Date(eVar.f82721n.longValue());
        }
        if (eVar.f82722o != null) {
            appBrandDatePickerV2.f91787h = new java.util.Date(eVar.f82722o.longValue());
        }
        int i17 = eVar.f82723p;
        int i18 = eVar.f82724q;
        int i19 = eVar.f82725r;
        boolean z17 = eVar.f82720m.ordinal() >= com.tencent.mm.plugin.appbrand.jsapi.picker.d.f82714e.ordinal();
        boolean z18 = eVar.f82720m.ordinal() >= com.tencent.mm.plugin.appbrand.jsapi.picker.d.f82715f.ordinal();
        boolean z19 = eVar.f82720m.ordinal() >= com.tencent.mm.plugin.appbrand.jsapi.picker.d.f82716g.ordinal();
        appBrandDatePickerV2.f91791o = z19;
        appBrandDatePickerV2.f91792p = z18;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i17, i18 - 1, i19);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTime(appBrandDatePickerV2.f91786g);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        calendar3.setTime(appBrandDatePickerV2.f91787h);
        tl1.e eVar2 = new tl1.e(appBrandDatePickerV2);
        android.content.Context context = appBrandDatePickerV2.f91785f;
        t51.b bVar2 = new t51.b(context, eVar2);
        tl1.d dVar = new tl1.d(appBrandDatePickerV2);
        u51.a aVar = bVar2.f415708a;
        aVar.f424782c = dVar;
        aVar.f424785f = false;
        aVar.f424786g = new boolean[]{z17, z18, z19, false, false, false};
        aVar.f424787h = calendar;
        bVar2.b(calendar2, calendar3);
        bVar2.f415708a.f424794o = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a7c);
        w51.g gVar = appBrandDatePickerV2.f91784e;
        bVar2.a(gVar);
        gVar.g(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480137pc));
        context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a7c);
        gVar.f442975p.getClass();
        gVar.f442975p.f(b3.l.getColor(context, com.tencent.mm.R.color.BW_0_Alpha_0_1));
        gVar.h(0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
        java.util.Iterator it = ((java.util.ArrayList) gVar.e()).iterator();
        while (it.hasNext()) {
            com.tencent.mm.picker.base.view.WheelView wheelView = (com.tencent.mm.picker.base.view.WheelView) it.next();
            wheelView.e(b3.l.getColor(context, com.tencent.mm.R.color.BW_0_Alpha_0_9));
            wheelView.f72379d = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
            wheelView.invalidate();
            wheelView.setBackgroundColor(b3.l.getColor(context, com.tencent.mm.R.color.f478494f));
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) gVar.e();
        if (arrayList.size() == 1) {
            ((com.tencent.mm.picker.base.view.WheelView) arrayList.get(0)).setPadding(0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
        } else if (arrayList.size() == 2) {
            ((com.tencent.mm.picker.base.view.WheelView) arrayList.get(0)).setPadding(0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
            ((com.tencent.mm.picker.base.view.WheelView) arrayList.get(1)).setPadding(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
        } else if (arrayList.size() == 3) {
            ((com.tencent.mm.picker.base.view.WheelView) arrayList.get(0)).setPadding(0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
            ((com.tencent.mm.picker.base.view.WheelView) arrayList.get(1)).setPadding(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
            ((com.tencent.mm.picker.base.view.WheelView) arrayList.get(2)).setPadding(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
        }
        bVar.setHeader(eVar.f82744h);
        bVar.i();
    }
}
