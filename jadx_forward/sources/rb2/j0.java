package rb2;

/* loaded from: classes2.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f475193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f475194f;

    public j0(java.lang.String str, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, yz5.l lVar) {
        this.f475192d = str;
        this.f475193e = c19786x6a1e2862;
        this.f475194f = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert$setFollowPatBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentConvert", "onItemClick click comment ref " + this.f475192d + ", jumpInfo=" + hc2.g0.d(this.f475193e));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        this.f475194f.mo146xb9724478(view);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert$setFollowPatBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
