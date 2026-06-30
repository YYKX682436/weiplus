package bg2;

/* loaded from: classes2.dex */
public final class l7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f20273d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(bg2.l8 l8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20273d = l8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.l7(this.f20273d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bg2.l7 l7Var = (bg2.l7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.view.View view;
        android.content.Context context;
        java.util.LinkedList<r45.lu5> list;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bg2.l8 l8Var = this.f20273d;
        in5.s0 s0Var = l8Var.f417141d.f417149i;
        if (s0Var == null || (context = s0Var.f293121e) == null) {
            view = null;
        } else {
            android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488975dh2, (android.view.ViewGroup) null);
            com.tencent.mm.plugin.finder.view.FinderTagFlowLayout finderTagFlowLayout = (com.tencent.mm.plugin.finder.view.FinderTagFlowLayout) inflate.findViewById(com.tencent.mm.R.id.qdo);
            r45.vw0 vw0Var = l8Var.f20277h;
            if (vw0Var != null && (list = vw0Var.getList(3)) != null) {
                for (r45.lu5 lu5Var : list) {
                    android.widget.TextView textView = new android.widget.TextView(context);
                    android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
                    layoutParams.setMargins(layoutParams.leftMargin, l8Var.c7(), l8Var.c7() * 2, layoutParams.bottomMargin);
                    textView.setLayoutParams(layoutParams);
                    jz5.g gVar = l8Var.f20278i;
                    textView.setPadding(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), l8Var.c7(), ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), l8Var.c7());
                    textView.setMinWidth(((java.lang.Number) ((jz5.n) l8Var.f20279m).getValue()).intValue());
                    textView.setMinHeight(((java.lang.Number) ((jz5.n) l8Var.f20282p).getValue()).intValue());
                    textView.setGravity(17);
                    textView.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.c48));
                    textView.setTextSize(14.0f);
                    textView.setTextColor(android.graphics.Color.parseColor("#99FFFFFF"));
                    java.lang.String string = lu5Var.getString(1);
                    if (string == null) {
                        string = "";
                    }
                    textView.setText(string);
                    textView.setOnClickListener(new bg2.u7(l8Var, lu5Var, context));
                    finderTagFlowLayout.addView(textView);
                }
            }
            view = inflate;
        }
        if (view != null) {
            android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(1000L);
            animationSet.addAnimation(alphaAnimation);
            android.view.animation.AnimationSet animationSet2 = new android.view.animation.AnimationSet(false);
            android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(1000L);
            animationSet2.addAnimation(alphaAnimation2);
            bg2.r4 r4Var = new bg2.r4(view, animationSet, animationSet2, l8Var.f20284r, new bg2.k7(l8Var));
            bg2.a5 a5Var = (bg2.a5) l8Var.N6(bg2.a5.class);
            if (a5Var != null) {
                a5Var.e7(r4Var);
            }
            l8Var.f20285s = true;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.H2, kz5.c1.l(new jz5.l("liveId", bg2.l8.Z6(l8Var)), new jz5.l("feedId", bg2.l8.Y6(l8Var)), new jz5.l("panel_sence", "1")), null, null, null, null, false, 124, null);
            uc2.g gVar2 = (uc2.g) l8Var.O6(uc2.g.class);
            r45.qt2 c76 = gVar2 != null ? ((sb2.l) gVar2).c7() : null;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = l8Var.f417141d.f417148h;
            if (baseFinderFeed != null) {
                com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedActionType", 87);
                jSONObject.put("feedActionSubType", 401);
                jSONObject.put("value", 1);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                v3Var.a(c76, baseFinderFeed, jSONObject2);
            }
        }
        return jz5.f0.f302826a;
    }
}
