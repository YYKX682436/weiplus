package ir1;

/* loaded from: classes3.dex */
public final class l1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f375549d;

    /* renamed from: e, reason: collision with root package name */
    public final ir1.m1 f375550e;

    public l1(java.util.ArrayList compositionList, ir1.m1 privateMsgScopeChooseCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compositionList, "compositionList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(privateMsgScopeChooseCallback, "privateMsgScopeChooseCallback");
        this.f375549d = compositionList;
        this.f375550e = privateMsgScopeChooseCallback;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f375549d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        ir1.n1 viewHolderLongClick = (ir1.n1) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolderLongClick, "viewHolderLongClick");
        java.lang.Object obj = this.f375549d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        ir1.j2 j2Var = (ir1.j2) obj;
        viewHolderLongClick.f375558g = j2Var;
        viewHolderLongClick.f375556e.setText(j2Var.f375542b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12972x45ae6e01 activityC12972x45ae6e01 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12972x45ae6e01) viewHolderLongClick.f375555d;
        activityC12972x45ae6e01.getClass();
        java.lang.Integer num = activityC12972x45ae6e01.f175489f;
        viewHolderLongClick.f375557f.setVisibility(num != null && num.intValue() == j2Var.f375541a ? 0 : 8);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "viewGroup");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dzl, viewGroup, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new ir1.n1(inflate, this.f375550e);
    }
}
