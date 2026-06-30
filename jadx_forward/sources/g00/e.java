package g00;

/* loaded from: classes9.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g00.f f348930d;

    public e(g00.f fVar) {
        this.f348930d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/card/vm/EcsShopCardViewModel$shopCardClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        g00.f fVar = this.f348930d;
        if (fVar.f348931d != null) {
            java.lang.Object context = view.getContext();
            p3325xe03a0797.p3326xc267989b.l.d(new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("EcsShopCardViewModel", context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null, 0, 4, null), null, null, new g00.d(view, fVar, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/feature/ecs/card/vm/EcsShopCardViewModel$shopCardClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
