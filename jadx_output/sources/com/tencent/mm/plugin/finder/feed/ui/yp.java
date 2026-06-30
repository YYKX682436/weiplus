package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class yp extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f110783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 f110784e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 occupyFinderUI40, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f110784e = occupyFinderUI40;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.yp(this.f110784e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.ui.yp) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f110783d;
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 occupyFinderUI40 = this.f110784e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f110783d = 1;
            int i18 = com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40.G;
            obj = occupyFinderUI40.e7(3, new java.util.LinkedList(), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            int i19 = com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40.G;
            android.view.View f76 = occupyFinderUI40.f7();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f76, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40$search$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f76, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40$search$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object value = ((jz5.n) occupyFinderUI40.f109622x).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            android.view.View view = (android.view.View) value;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40$search$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40$search$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
