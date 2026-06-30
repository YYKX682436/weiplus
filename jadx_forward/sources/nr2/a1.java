package nr2;

/* loaded from: classes2.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.i1 f420694d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(nr2.i1 i1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f420694d = i1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nr2.a1(this.f420694d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        nr2.a1 a1Var = (nr2.a1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        a1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        nr2.l1 l1Var = this.f420694d.f420745c;
        if (l1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        l1Var.e();
        if (this.f420694d.f420744b.isEmpty()) {
            nr2.l1 l1Var2 = this.f420694d.f420745c;
            if (l1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            l1Var2.a().setVisibility(0);
            android.view.View view = l1Var2.f420798f;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = l1Var2.f420799g;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nothingView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View c17 = l1Var2.c();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(c17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(c17, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            nr2.l1 l1Var3 = this.f420694d.f420745c;
            if (l1Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View view3 = l1Var3.f420799g;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nothingView");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View c18 = l1Var3.c();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(c18, arrayList5.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c18.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(c18, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l1Var3.a().setVisibility(8);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f420694d.f420746d;
            if (c22848x6ddd90cf == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            c22848x6ddd90cf.m8146xced61ae5();
            if (!this.f420694d.f420750h) {
                nr2.l1 l1Var4 = this.f420694d.f420745c;
                if (l1Var4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                l1Var4.d().k();
            }
        }
        return jz5.f0.f384359a;
    }
}
