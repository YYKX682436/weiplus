package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class ol implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f228823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d f228824c;

    public ol(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d, java.lang.String str, int i17) {
        this.f228824c = activityC16390x60cac25d;
        this.f228822a = str;
        this.f228823b = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do doCheckAndUseTimeLimitPromo errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d = this.f228824c;
        android.app.Dialog dialog = activityC16390x60cac25d.B;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "retcode: %s", java.lang.Integer.valueOf(((r45.kz) fVar.f152151d).f460574d));
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
            if (fVar2 != null && ((r45.kz) fVar2).f460574d == 0) {
                android.content.Intent intent = new android.content.Intent();
                r45.wv3 U6 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d.U6(activityC16390x60cac25d, this.f228822a);
                if (U6 != null) {
                    try {
                        intent.putExtra("key_envelope_source", U6.mo14344x5f01b1f6());
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LuckyMoneyPickEnvelopeUI", e17, "", new java.lang.Object[0]);
                    }
                    activityC16390x60cac25d.setResult(-1, intent);
                    if (U6.f471039o == 3) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16364x2d32e7b c16364x2d32e7b = activityC16390x60cac25d.f228054i;
                        int i17 = this.f228823b;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.vm vmVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.vm) c16364x2d32e7b.p0(i17);
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) activityC16390x60cac25d.f228054i.p0(i17).f3639x46306858;
                        int width = vmVar.f229112v.getWidth();
                        int height = vmVar.f229112v.getHeight();
                        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(config);
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(java.lang.Integer.valueOf(height));
                        arrayList.add(java.lang.Integer.valueOf(width));
                        java.lang.Object obj2 = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "doReceiveAnimation", "(I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                        yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "doReceiveAnimation", "(I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                        vmVar.f229113w.draw(new android.graphics.Canvas(createBitmap));
                        vmVar.f229112v.setImageBitmap(createBitmap);
                        vmVar.f229112v.setVisibility(0);
                        vmVar.f229113w.setVisibility(4);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16390x60cac25d.mo55332x76847179();
                        u4.c1 c1Var = new u4.c1(mo55332x76847179);
                        android.content.res.XmlResourceParser xml = mo55332x76847179.getResources().getXml(com.p314xaae8f345.mm.R.C30869x993b6d55.f576359a);
                        try {
                            try {
                                try {
                                    p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 b17 = c1Var.b(xml, android.util.Xml.asAttributeSet(xml), null);
                                    xml.close();
                                    p012xc85e97e9.p112x993b6d55.C1184xfa388aad c1184xfa388aad = (p012xc85e97e9.p112x993b6d55.C1184xfa388aad) b17;
                                    c1184xfa388aad.T(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rl(activityC16390x60cac25d, vmVar));
                                    u4.g1.a(viewGroup, c1184xfa388aad);
                                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) vmVar.f229112v.getLayoutParams();
                                    marginLayoutParams.width = i65.a.b(activityC16390x60cac25d.mo55332x76847179(), 256);
                                    marginLayoutParams.height = i65.a.b(activityC16390x60cac25d.mo55332x76847179(), com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60886x8f27a73c);
                                    marginLayoutParams.topMargin = i65.a.b(activityC16390x60cac25d.mo55332x76847179(), 12);
                                    vmVar.f229112v.setLayoutParams(marginLayoutParams);
                                    android.view.View findViewById = vmVar.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567204ik4);
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    arrayList2.add(4);
                                    java.util.Collections.reverse(arrayList2);
                                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "doReceiveAnimation", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                                    yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "doReceiveAnimation", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    vmVar.f229114x.setVisibility(8);
                                    vmVar.f229115y.setVisibility(8);
                                    android.view.View findViewById2 = vmVar.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ikc);
                                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                    arrayList3.add(0);
                                    java.util.Collections.reverse(arrayList3);
                                    yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "doReceiveAnimation", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "doReceiveAnimation", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                } catch (java.lang.Throwable th6) {
                                    xml.close();
                                    throw th6;
                                }
                            } catch (java.io.IOException e18) {
                                throw new android.view.InflateException(xml.getPositionDescription() + ": " + e18.getMessage(), e18);
                            }
                        } catch (org.xmlpull.v1.XmlPullParserException e19) {
                            throw new android.view.InflateException(e19.getMessage(), e19);
                        }
                    }
                }
            } else if (fVar2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.kz) fVar2).f460575e)) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.M(activityC16390x60cac25d.mo55332x76847179(), ((r45.kz) fVar.f152151d).f460575e);
            }
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.K(activityC16390x60cac25d.mo55332x76847179(), fVar.f152150c);
        }
        return null;
    }
}
