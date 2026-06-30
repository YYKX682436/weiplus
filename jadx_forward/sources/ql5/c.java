package ql5;

/* loaded from: classes15.dex */
public class c implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f446123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ExpandableListView f446124b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ql5.g f446125c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql5.e f446126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ql5.d f446127e;

    public c(ql5.d dVar, int i17, android.widget.ExpandableListView expandableListView, ql5.g gVar, ql5.e eVar) {
        this.f446127e = dVar;
        this.f446123a = i17;
        this.f446124b = expandableListView;
        this.f446125c = gVar;
        this.f446126d = eVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        ql5.d dVar = this.f446127e;
        int i17 = this.f446123a;
        dVar.a(i17).f446139a = false;
        this.f446124b.collapseGroup(i17);
        dVar.notifyDataSetChanged();
        this.f446125c.f446142d = -1;
        this.f446126d.setTag(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
