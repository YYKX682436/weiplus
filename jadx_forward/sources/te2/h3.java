package te2;

/* loaded from: classes10.dex */
public final class h3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f499586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f499587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.i3 f499588f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(int i17, te2.i3 i3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f499587e = i17;
        this.f499588f = i3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te2.h3(this.f499587e, this.f499588f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.h3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f499586d;
        int i18 = this.f499587e;
        te2.i3 i3Var = this.f499588f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (i18 == 1) {
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = i3Var.f499642m;
                if (c22789xd23e9a9b != null) {
                    vl2.s sVar = vl2.s.f519401a;
                    vl2.h hVar = vl2.h.f519367v;
                    this.f499586d = 1;
                    if (sVar.d(hVar, c22789xd23e9a9b, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i3Var.f499645p < 1) {
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = i3Var.f499642m;
                if (c22789xd23e9a9b2 != null) {
                    vl2.s sVar2 = vl2.s.f519401a;
                    vl2.h hVar2 = vl2.h.f519369x;
                    this.f499586d = 2;
                    if (sVar2.d(hVar2, c22789xd23e9a9b2, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = i3Var.f499642m;
                if (c22789xd23e9a9b3 != null) {
                    vl2.s sVar3 = vl2.s.f519401a;
                    vl2.h hVar3 = vl2.h.f519368w;
                    this.f499586d = 3;
                    if (sVar3.d(hVar3, c22789xd23e9a9b3, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 != 1 && i17 != 2 && i17 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        i3Var.f499645p = i18;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b4 = i3Var.f499642m;
        if (c22789xd23e9a9b4 != null) {
            c22789xd23e9a9b4.m82583xcde73672(1);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b5 = i3Var.f499642m;
        if (c22789xd23e9a9b5 != null) {
            c22789xd23e9a9b5.g();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b6 = i3Var.f499642m;
        if (c22789xd23e9a9b6 != null) {
            c22789xd23e9a9b6.a(i3Var.f499643n);
        }
        android.view.View view = i3Var.f499639g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback$updateLuckyMoneyCount$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback$updateLuckyMoneyCount$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = i3Var.f499641i;
        if (textView != null) {
            textView.setText("x" + i18);
        }
        android.widget.TextView textView2 = i3Var.f499641i;
        if (textView2 != null) {
            textView2.setVisibility(i18 == 1 ? 8 : 0);
        }
        return jz5.f0.f384359a;
    }
}
