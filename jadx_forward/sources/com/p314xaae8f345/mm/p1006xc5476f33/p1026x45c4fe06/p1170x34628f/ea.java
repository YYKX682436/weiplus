package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class ea extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f168105h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.qd f168106i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f168107j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia f168108k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia iaVar, long j17, java.lang.Boolean bool, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.qd qdVar, int i18) {
        super(j17, bool);
        this.f168108k = iaVar;
        this.f168105h = i17;
        this.f168106i = qdVar;
        this.f168107j = i18;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha p17;
        java.lang.ref.WeakReference weakReference;
        android.view.View view;
        android.view.ViewGroup viewGroup;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha p18;
        android.view.ViewGroup n17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia iaVar = this.f168108k;
        int i17 = iaVar.f168293d;
        int i18 = this.f168105h;
        boolean z17 = false;
        if (i18 != i17 && (p17 = iaVar.p(i18)) != null && (weakReference = p17.f168214a) != null && (view = (android.view.View) weakReference.get()) != null) {
            iaVar.f168298i = i18;
            int i19 = p17.f168216c;
            android.view.ViewGroup n18 = iaVar.n(i19, false, false);
            if ((n18 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1082xe7814c81.C12070x7562ec09) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1082xe7814c81.C12070x7562ec09) n18).f162159d && (p18 = iaVar.p(i19)) != null && (n17 = iaVar.n(p18.f168216c, false, false)) != null) {
                android.view.View view2 = (android.view.View) weakReference.get();
                if (view2 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    view2.setLayoutParams(layoutParams);
                }
                iaVar.f168298i = p18.f168215b;
                p17 = p18;
                n18 = n17;
            }
            if (n18 != null) {
                view = (android.view.View) p17.f168214a.get();
                int indexOfChild = n18.indexOfChild(view);
                android.view.View view3 = iaVar.f168295f;
                if (view3 != null && (viewGroup = (android.view.ViewGroup) view3.getParent()) != null) {
                    viewGroup.removeView(view3);
                }
                n18.addView(view3, indexOfChild);
                n18.removeView(view);
            }
            iaVar.f168294e = new float[]{view.getX(), view.getY(), view.getWidth(), view.getHeight(), p17.f168217d};
            iaVar.f168297h.e(view, this.f168107j);
            iaVar.f168293d = i18;
            iaVar.f168296g = this.f168106i;
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
