package qt2;

/* loaded from: classes2.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.b0 f448160d;

    public w(qt2.b0 b0Var) {
        this.f448160d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC$initClose$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qt2.b0 b0Var = this.f448160d;
        b0Var.c7(0L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3.f207005a, b0Var.m158354x19263085(), 5, null, 4, null);
        b0Var.m160881x5a5b64d();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC$initClose$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
