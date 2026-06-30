package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class w7 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 f262302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f262303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 f262304f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56, android.view.View.OnClickListener onClickListener, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var) {
        super(false);
        this.f262302d = c19760x34448d56;
        this.f262303e = onClickListener;
        this.f262304f = n8Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8.f262052l1.put(this.f262302d.f273647m, java.lang.Boolean.TRUE);
        this.f262303e.onClick(view);
        if (this.f262304f.f262073x0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14530, 2);
        }
    }
}
