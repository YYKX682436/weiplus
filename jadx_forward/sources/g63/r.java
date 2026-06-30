package g63;

/* loaded from: classes8.dex */
public final class r implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.s f350698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z53.i f350699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f350700f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g63.b f350701g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f350702h;

    public r(g63.s sVar, z53.i iVar, int i17, g63.b bVar, android.view.View view) {
        this.f350698d = sVar;
        this.f350699e = iVar;
        this.f350700f = i17;
        this.f350701g = bVar;
        this.f350702h = view;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$onBindViewHolder$2$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        z53.i iVar = this.f350699e;
        g63.s sVar = this.f350698d;
        int i17 = this.f350700f;
        g63.s.a(sVar, iVar, 72L, i17);
        z53.i iVar2 = (z53.i) this.f350701g.f374658i;
        g63.d dVar = sVar.f350706c;
        if (dVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar2);
            ((g63.n) dVar).a(this.f350702h, i17, iVar2, ((g63.j) sVar.f350697a).x());
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$onBindViewHolder$2$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
