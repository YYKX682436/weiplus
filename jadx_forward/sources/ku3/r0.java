package ku3;

/* loaded from: classes10.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f393907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47 f393908e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(jz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47 c17028xc20c4c47, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f393907d = lVar;
        this.f393908e = c17028xc20c4c47;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ku3.r0(this.f393907d, this.f393908e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ku3.r0 r0Var = (ku3.r0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        r0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        android.os.Bundle bundle = (android.os.Bundle) this.f393907d.f384367e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47 c17028xc20c4c47 = this.f393908e;
        if (bundle != null) {
            float f17 = bundle.getFloat("camera_float_1");
            float f18 = bundle.getFloat("camera_float_2");
            float f19 = bundle.getFloat("camera_float_3");
            ku3.s sVar = c17028xc20c4c47.I;
            android.util.Range range = new android.util.Range(new java.lang.Float(f17), new java.lang.Float(f18));
            sVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitIndicatorPlugin", "initIndicatorData >> " + range + ", " + f19);
            sVar.f393936z = ((float) a06.d.b(f19 * 10.0f)) / 10.0f;
            sVar.A = range;
            java.lang.Object lower = range.getLower();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lower, "getLower(...)");
            float floatValue = ((java.lang.Number) lower).floatValue();
            java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
            java.util.HashMap hashMap = sVar.f393934x;
            if (0.0f < floatValue) {
                java.lang.Object lower2 = range.getLower();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lower2, "getLower(...)");
                if (((java.lang.Number) lower2).floatValue() < 1.0f) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(range.getLower(), "getLower(...)");
                    hashMap.put(1, java.lang.Float.valueOf(a06.d.b(((java.lang.Number) r1).floatValue() * 10.0f) / 10.0f));
                }
            }
            java.lang.Float f27 = (java.lang.Float) range.getUpper();
            float f28 = 2;
            float f29 = 1;
            float floatValue2 = (((f27.floatValue() / f28) % f29) > 0.0f ? 1 : (((f27.floatValue() / f28) % f29) == 0.0f ? 0 : -1)) == 0 ? f27.floatValue() / f28 : (f27.floatValue() / f28) + f29;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitIndicatorPlugin", "initIndicatorData >> " + floatValue2);
            if (floatValue2 > 2.0f) {
                hashMap.put(2, valueOf);
                hashMap.put(3, java.lang.Float.valueOf(2.0f));
                hashMap.put(4, java.lang.Float.valueOf(floatValue2));
                hashMap.put(5, f27);
            } else if (1.0f < floatValue2 && floatValue2 <= 2.0f) {
                hashMap.put(2, valueOf);
                hashMap.put(3, java.lang.Float.valueOf(2.0f));
                hashMap.put(5, f27);
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.a(f27, 2.0f)) {
                hashMap.put(2, valueOf);
                hashMap.put(3, java.lang.Float.valueOf(2.0f));
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.a(f27, 1.0f) && (!hashMap.isEmpty())) {
                hashMap.put(2, valueOf);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CameraKitIndicatorPlugin", "get indicator data is no support to show bar");
                android.view.View b17 = sVar.b();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorData", "(Landroid/util/Range;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(b17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorData", "(Landroid/util/Range;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                sVar.E = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitIndicatorPlugin", "initIndicatorBar >> " + sVar.f393936z + ", " + sVar.A);
            android.view.View b18 = sVar.b();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(b18, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(b18, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            sVar.E = true;
            sVar.m();
            if (hashMap.containsKey(1)) {
                android.view.View j17 = sVar.j();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(j17, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                j17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(j17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                sVar.j().setOnClickListener(sVar);
                java.lang.Object mo141623x754a37bb = ((jz5.n) sVar.f393924n).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                ((android.widget.TextView) mo141623x754a37bb).setText(java.lang.String.valueOf(hashMap.get(1)));
            }
            if (hashMap.containsKey(2)) {
                android.view.View g17 = sVar.g();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(g17, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                g17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(g17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                sVar.g().setOnClickListener(sVar);
                java.lang.Object mo141623x754a37bb2 = ((jz5.n) sVar.f393926p).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
                android.widget.TextView textView = (android.widget.TextView) mo141623x754a37bb2;
                java.lang.Float f37 = (java.lang.Float) hashMap.get(2);
                textView.setText(java.lang.String.valueOf(f37 != null ? java.lang.Integer.valueOf((int) f37.floatValue()) : null));
            }
            if (hashMap.containsKey(3)) {
                android.view.View h17 = sVar.h();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(h17, arrayList5.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                h17.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(h17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                sVar.h().setOnClickListener(sVar);
                java.lang.Object mo141623x754a37bb3 = ((jz5.n) sVar.f393928r).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
                android.widget.TextView textView2 = (android.widget.TextView) mo141623x754a37bb3;
                java.lang.Float f38 = (java.lang.Float) hashMap.get(3);
                textView2.setText(java.lang.String.valueOf(f38 != null ? java.lang.Integer.valueOf((int) f38.floatValue()) : null));
            }
            if (hashMap.containsKey(4)) {
                android.view.View i17 = sVar.i();
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(i17, arrayList6.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i17.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(i17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                sVar.i().setOnClickListener(sVar);
                java.lang.Object mo141623x754a37bb4 = ((jz5.n) sVar.f393930t).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
                android.widget.TextView textView3 = (android.widget.TextView) mo141623x754a37bb4;
                java.lang.Float f39 = (java.lang.Float) hashMap.get(4);
                textView3.setText(java.lang.String.valueOf(f39 != null ? java.lang.Integer.valueOf((int) f39.floatValue()) : null));
            }
            if (hashMap.containsKey(5)) {
                android.view.View f47 = sVar.f();
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(0);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(f47, arrayList7.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f47.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(f47, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "initIndicatorBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                sVar.f().setOnClickListener(sVar);
                java.lang.Object mo141623x754a37bb5 = ((jz5.n) sVar.f393932v).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
                android.widget.TextView textView4 = (android.widget.TextView) mo141623x754a37bb5;
                java.lang.Float f48 = (java.lang.Float) hashMap.get(5);
                textView4.setText(java.lang.String.valueOf(f48 != null ? java.lang.Integer.valueOf((int) f48.floatValue()) : null));
            }
        }
        ku3.l5 l5Var = c17028xc20c4c47.E;
        if (l5Var.f393842f == 1 && l5Var.f393841e) {
            l5Var.f393840d.f557110e.mo9386xf597288(true);
        }
        return jz5.f0.f384359a;
    }
}
