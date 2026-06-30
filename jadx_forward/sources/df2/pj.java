package df2;

/* loaded from: classes3.dex */
public final class pj extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f312603d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f312604e;

    public pj(java.lang.ref.WeakReference rController, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rController, "rController");
        this.f312603d = rController;
        this.f312604e = str;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController$CustomTextClickSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        df2.pk pkVar = (df2.pk) this.f312603d.get();
        if (pkVar != null) {
            java.util.List list = pkVar.K;
            java.lang.String str = this.f312604e;
            if (list != null) {
                java.util.Iterator it = list.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ce2.e) it.next()).a(), str)) {
                        break;
                    } else {
                        i17++;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14278x370c3dac c14278x370c3dac = pkVar.f312617x;
                if (c14278x370c3dac != null) {
                    c14278x370c3dac.b(i17);
                }
                p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = pkVar.f312618y;
                if (c1190x18d3c3fe != null) {
                    c1190x18d3c3fe.m8317x940d026a(i17, false);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(pkVar.f312606m, "selectComponent " + str + " but index is null!");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController$CustomTextClickSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(android.graphics.Color.parseColor("#7D90A9"));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
