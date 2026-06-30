package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public class n1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f262483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gq f262484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f262485f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(android.content.Context context, r45.gq gqVar, android.view.View.OnClickListener onClickListener) {
        super(false);
        this.f262483d = context;
        this.f262484e = gqVar;
        this.f262485f = onClickListener;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.c(this.f262483d, this.f262484e.f456996e, null);
        android.view.View.OnClickListener onClickListener = this.f262485f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
