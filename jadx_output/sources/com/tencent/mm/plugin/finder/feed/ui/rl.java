package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class rl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f110506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI f110507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI finderTeenModeLimitUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f110507e = finderTeenModeLimitUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.rl(this.f110507e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.ui.rl) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f110506d;
        com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI finderTeenModeLimitUI = this.f110507e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f110506d = 1;
            int i18 = com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI.f109555w;
            finderTeenModeLimitUI.getClass();
            obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new com.tencent.mm.plugin.finder.feed.ui.nl(null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) obj;
        android.view.View view = finderTeenModeLimitUI.f109556t;
        if (view == null) {
            kotlin.jvm.internal.o.o("guardianView");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487472oq3);
        textView.setText(textView.getResources().getString(com.tencent.mm.R.string.f7l));
        view.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.ql(finderTeenModeLimitUI, view));
        int i19 = z3Var != null ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI$initGuardianView$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI$initGuardianView$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
