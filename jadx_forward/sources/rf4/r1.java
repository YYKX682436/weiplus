package rf4;

/* loaded from: classes4.dex */
public final class r1 implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 f476636d;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 c18486xb54a9331) {
        this.f476636d = c18486xb54a9331;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 c18486xb54a9331 = this.f476636d;
        yz5.l onPageStateCallback = c18486xb54a9331.getOnPageStateCallback();
        if (onPageStateCallback != null) {
            onPageStateCallback.mo146xb9724478(java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18476x97dac0b0 c18476x97dac0b0 = c18486xb54a9331.f253549n;
        if (c18476x97dac0b0.f253448r) {
            c18476x97dac0b0.f253449s = i17;
            if (i17 == 2) {
                c18476x97dac0b0.f253450t = true;
            } else if (i17 == 0) {
                c18476x97dac0b0.f253452v = -1;
                c18476x97dac0b0.f253450t = false;
                c18476x97dac0b0.f253451u = -1.0f;
            }
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 c18486xb54a9331 = this.f476636d;
        yz5.q onPageScrollCallback = c18486xb54a9331.getOnPageScrollCallback();
        if (onPageScrollCallback != null) {
            onPageScrollCallback.mo147xb9724478(java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i18));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18476x97dac0b0 c18476x97dac0b0 = c18486xb54a9331.f253549n;
        if (c18476x97dac0b0.f253448r) {
            int i19 = c18476x97dac0b0.f253449s;
            android.widget.TextView textView = c18476x97dac0b0.f253445o;
            android.widget.TextView textView2 = c18476x97dac0b0.f253444n;
            if (i19 == 1 && i17 == 0) {
                int i27 = c18476x97dac0b0.f253439f >>> 24;
                int i28 = c18476x97dac0b0.f253440g >>> 24;
                float max = java.lang.Math.max(java.lang.Math.min(f17, 1.0f), 0.0f);
                float f18 = (i27 - i28) * max;
                int max2 = (java.lang.Math.max(java.lang.Math.min((int) (i27 - f18), i27), i28) << 24) | 16777215;
                int max3 = (java.lang.Math.max(java.lang.Math.min((int) (i28 + f18), i27), i28) << 24) | 16777215;
                float f19 = c18476x97dac0b0.f253437d;
                float f27 = c18476x97dac0b0.f253438e;
                float f28 = (f19 - f27) * max;
                float max4 = java.lang.Math.max(java.lang.Math.min(f19 - f28, f19), f27);
                float max5 = java.lang.Math.max(java.lang.Math.min(f28 + f27, f19), f27);
                textView2.setTextColor(max2);
                textView2.setTextSize(0, max4);
                textView.setTextColor(max3);
                textView.setTextSize(0, max5);
            }
            float f29 = c18476x97dac0b0.f253451u;
            int i29 = c18476x97dac0b0.f253441h;
            if (f29 > f17) {
                c18476x97dac0b0.f253452v = i29;
            } else if (f29 < f17) {
                c18476x97dac0b0.f253452v = 0;
            }
            if (c18476x97dac0b0.f253450t) {
                if (!(f29 == -1.0f)) {
                    if (!(f29 == 0.0f)) {
                        c18476x97dac0b0.f253450t = false;
                        int i37 = c18476x97dac0b0.f253452v;
                        if (i37 == 0) {
                            c18476x97dac0b0.a(textView);
                            c18476x97dac0b0.c(textView2);
                        } else if (i37 == i29) {
                            c18476x97dac0b0.a(textView2);
                            c18476x97dac0b0.c(textView);
                        }
                    }
                }
            }
            c18476x97dac0b0.f253451u = f17;
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        java.util.List arrayList;
        java.util.List arrayList2;
        java.util.List arrayList3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 c18486xb54a9331 = this.f476636d;
        c18486xb54a9331.m71460xe123f9c7(i17);
        yz5.p onPageSelectedCallback = c18486xb54a9331.getOnPageSelectedCallback();
        if (onPageSelectedCallback != null) {
            onPageSelectedCallback.mo149xb9724478(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(c18486xb54a9331.f253553r));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18476x97dac0b0 c18476x97dac0b0 = c18486xb54a9331.f253549n;
        if (c18476x97dac0b0 != null) {
            c18476x97dac0b0.f253454x = i17;
            if (c18476x97dac0b0.f253448r) {
                if (i17 == 0) {
                    c18476x97dac0b0.d(false, c18476x97dac0b0.f253444n);
                } else if (i17 == 1) {
                    c18476x97dac0b0.d(false, c18476x97dac0b0.f253445o);
                }
            }
        }
        boolean z17 = c18486xb54a9331.f253553r;
        java.util.ArrayList arrayList4 = c18486xb54a9331.f253551p;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef c18485x239212ef = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList4.get(i17);
            if4.a aVar = c18486xb54a9331.f253552q;
            if (aVar == null || (arrayList = aVar.f372773h) == null) {
                arrayList = new java.util.ArrayList();
            }
            c18485x239212ef.c(arrayList);
            return;
        }
        java.lang.String str = "";
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef c18485x239212ef2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList4.get(1);
            if4.a aVar2 = c18486xb54a9331.f253552q;
            if (aVar2 == null || (arrayList3 = aVar2.f372773h) == null) {
                arrayList3 = new java.util.ArrayList();
            }
            c18485x239212ef2.c(arrayList3);
            mf4.d dVar = mf4.d.f407693a;
            long j17 = c18486xb54a9331.f253558w;
            if (j17 != 0) {
                java.lang.String bigInteger = new java.math.BigInteger(java.lang.Long.toBinaryString(j17), 2).toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bigInteger, "toString(...)");
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(bigInteger);
                while (stringBuffer.length() < 25) {
                    stringBuffer.insert(0, "0");
                }
                str = stringBuffer.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
            }
            if (mf4.d.f407701i) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6935x89ce03dd c6935x89ce03dd = mf4.d.f407694b;
                c6935x89ce03dd.f142449d = 5L;
                c6935x89ce03dd.f142450e = c6935x89ce03dd.b("StoryId", str, true);
                dVar.b();
            }
            mf4.d.f407701i = false;
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef c18485x239212ef3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList4.get(0);
        if4.a aVar3 = c18486xb54a9331.f253552q;
        if (aVar3 == null || (arrayList2 = aVar3.f372775j) == null) {
            arrayList2 = new java.util.ArrayList();
        }
        c18485x239212ef3.c(arrayList2);
        c18486xb54a9331.getCommentInputView().b();
        c18486xb54a9331.getCommentInputView().setVisibility(8);
        mf4.d dVar2 = mf4.d.f407693a;
        long j18 = c18486xb54a9331.f253558w;
        if (j18 != 0) {
            java.lang.String bigInteger2 = new java.math.BigInteger(java.lang.Long.toBinaryString(j18), 2).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bigInteger2, "toString(...)");
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer(bigInteger2);
            while (stringBuffer2.length() < 25) {
                stringBuffer2.insert(0, "0");
            }
            str = stringBuffer2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        }
        if (mf4.d.f407700h) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6935x89ce03dd c6935x89ce03dd2 = mf4.d.f407694b;
            c6935x89ce03dd2.f142449d = 8L;
            c6935x89ce03dd2.f142450e = c6935x89ce03dd2.b("StoryId", str, true);
            dVar2.b();
        }
        mf4.d.f407700h = false;
    }
}
