package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class o6 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f168486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f168487e;

    public o6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, android.content.Context context) {
        this.f168487e = v5Var;
        this.f168486d = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7 Q1 = this.f168487e.Q1();
        android.content.Context context = this.f168486d;
        android.view.View f17 = Q1.f(android.view.LayoutInflater.from(context));
        if (f17 == null) {
            return new android.widget.FrameLayout(context);
        }
        if (f17 instanceof android.widget.FrameLayout) {
            return f17;
        }
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.addView(f17, new android.view.ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }
}
