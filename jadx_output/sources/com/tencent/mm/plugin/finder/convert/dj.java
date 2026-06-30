package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class dj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.oj f103158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.n1 f103159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103160f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f103161g;

    public dj(com.tencent.mm.plugin.finder.convert.oj ojVar, so2.n1 n1Var, in5.s0 s0Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        this.f103158d = ojVar;
        this.f103159e = n1Var;
        this.f103160f = s0Var;
        this.f103161g = finderObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.lang.String str;
        kotlin.jvm.internal.c0 c0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$setupRelJumpTipsRecommendClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$setupRelJumpTipsRecommendClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.finder.convert.oj ojVar = this.f103158d;
        cw2.da daVar = ojVar.C;
        if (daVar != null) {
            daVar.pause();
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ne).getValue()).r()).booleanValue();
        so2.n1 n1Var = this.f103159e;
        in5.s0 s0Var = this.f103160f;
        if (booleanValue || n1Var.f2()) {
            str = "(Landroid/view/View;)V";
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ojVar.z(context, this.f103161g, n1Var.f2());
        } else {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f103161g;
            ojVar.getClass();
            android.view.View inflate = com.tencent.mm.ui.id.b(s0Var.f293121e).inflate(com.tencent.mm.R.layout.f489089ee5, (android.view.ViewGroup) null);
            android.content.Context context2 = s0Var.f293121e;
            float dimension = context2.getResources().getDimension(com.tencent.mm.R.dimen.f480495ap3);
            android.view.Window window = ojVar.f104184f.getF122643d().getWindow();
            android.view.View decorView = window != null ? window.getDecorView() : null;
            android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
            if (viewGroup == null) {
                str = "(Landroid/view/View;)V";
            } else {
                kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
                gx2.a aVar = new gx2.a();
                aVar.f277337c = dimension;
                kotlin.jvm.internal.o.d(inflate);
                aVar.f277339e = new hx2.c(inflate);
                aVar.f277338d = new hx2.g(context2, 0, 0, 0, false, false, 62, null);
                aVar.f277340f = new hx2.b(context2, true);
                gx2.q b17 = aVar.b(viewGroup);
                android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.c_x);
                if (findViewById != null) {
                    str = "(Landroid/view/View;)V";
                    c0Var = c0Var2;
                    findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.convert.fj(ojVar, s0Var, finderObject, c0Var2, b17));
                    hc2.v0.e(findViewById, "set_entrance_open", 8, 0, false, false, null, new com.tencent.mm.plugin.finder.convert.gj(ojVar), 60, null);
                } else {
                    str = "(Landroid/view/View;)V";
                    c0Var = c0Var2;
                }
                android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.b5w);
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.convert.hj(b17));
                    hc2.v0.e(findViewById2, "set_entrance_unopen", 8, 0, false, false, null, new com.tencent.mm.plugin.finder.convert.ij(ojVar), 60, null);
                }
                hc2.v0.e(inflate, "set_entrance_popup", 32, 0, false, false, null, new com.tencent.mm.plugin.finder.convert.jj(ojVar), 60, null);
                b17.setOnDrawerClose(new com.tencent.mm.plugin.finder.convert.kj(c0Var, ojVar));
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.m(b17, false, 1, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$setupRelJumpTipsRecommendClick$1", "android/view/View$OnClickListener", "onClick", str);
    }
}
