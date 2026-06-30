package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public class m1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f262462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gq f262463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f262464f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(android.content.Context context, r45.gq gqVar, android.view.View.OnClickListener onClickListener) {
        super(false);
        this.f262462d = context;
        this.f262463e = gqVar;
        this.f262464f = onClickListener;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.c(this.f262462d, this.f262463e.f456996e, null);
        android.view.View.OnClickListener onClickListener = this.f262464f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
