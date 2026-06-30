package se2;

/* loaded from: classes2.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f488418d;

    /* renamed from: e, reason: collision with root package name */
    public int f488419e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f488420f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f488421g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f488422h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f488423i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f488424m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f488425n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.view.View view, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, android.widget.TextView textView, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f488421g = view;
        this.f488422h = c22699x3dcdb352;
        this.f488423i = c22789xd23e9a9b;
        this.f488424m = textView;
        this.f488425n = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        se2.t tVar = new se2.t(this.f488421g, this.f488422h, this.f488423i, this.f488424m, this.f488425n, interfaceC29045xdcb5ca57);
        tVar.f488420f = obj;
        return tVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((se2.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int a17;
        java.lang.Object c17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f488419e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f488422h;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f488423i;
        android.widget.TextView textView = this.f488424m;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f488420f;
            android.view.View view = this.f488421g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$showLikeAnimAndPostLike$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$showLikeAnimAndPostLike$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22699x3dcdb352.setVisibility(8);
            c22789xd23e9a9b.setVisibility(0);
            textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560581oc));
            a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.a(textView.getText().toString());
            c22699x3dcdb352.m82040x7541828(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560581oc));
            se2.s sVar = new se2.s(ae2.in.f85221a.a(ym5.f6.f544855s), c22789xd23e9a9b, null);
            this.f488420f = y0Var;
            this.f488418d = a17;
            this.f488419e = 1;
            c17 = p3325xe03a0797.p3326xc267989b.a4.c(3000L, sVar, this);
            if (c17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i18 = this.f488418d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c17 = obj;
            a17 = i18;
        }
        jz5.f0 f0Var = (jz5.f0) c17;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveGroupCommentHelper", "showLikeAnimAndPostLike pag anim wait timeout(3000 ms), fallback to continue");
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                c22789xd23e9a9b.n();
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var2);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
        }
        c22699x3dcdb352.setVisibility(0);
        textView.setText(java.lang.String.valueOf(a17 + 1));
        textView.setVisibility(0);
        c22789xd23e9a9b.setVisibility(8);
        this.f488425n.mo152xb9724478();
        return f0Var2;
    }
}
