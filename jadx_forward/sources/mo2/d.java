package mo2;

/* loaded from: classes2.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mo2.q f411890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f411891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f411892f;

    public d(mo2.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var) {
        this.f411890d = qVar;
        this.f411891e = abstractC14490x69736cb5;
        this.f411892f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/view/MemberCommonConvert$refreshCommentCount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mo2.q.n(this.f411890d, this.f411891e, this.f411892f, 0L);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert$refreshCommentCount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
