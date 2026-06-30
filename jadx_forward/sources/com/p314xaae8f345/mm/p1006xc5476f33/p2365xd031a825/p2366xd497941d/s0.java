package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class s0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.h f261021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19074x1cba768d f261022e;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19074x1cba768d viewOnClickListenerC19074x1cba768d, com.p314xaae8f345.mm.p2802xd031a825.h hVar) {
        this.f261022e = viewOnClickListenerC19074x1cba768d;
        this.f261021d = hVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.os.Bundle bundle = this.f261021d.f295334c;
        bundle.putInt("real_name_verify_mode", 3);
        bundle.putString("verify_card_flag", "1");
        com.p314xaae8f345.mm.p2802xd031a825.a.d(this.f261022e, bundle);
    }
}
