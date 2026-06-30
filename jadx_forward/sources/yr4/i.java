package yr4;

/* loaded from: classes9.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f546634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yr4.u f546635e;

    public i(yr4.u uVar, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e) {
        this.f546635e = uVar;
        this.f546634d = abstractActivityC22902xe37969e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        yr4.u uVar = this.f546635e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) uVar.f295334c.getParcelable("key_bankcard");
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) uVar.f295334c.getParcelable("key_pay_info");
        if (c19091x9511676c != null && c19760x34448d56 != null) {
            c19091x9511676c.N2 = c19760x34448d56.f273647m;
        }
        uVar.f295334c.putInt("key_err_code", com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15120x37ee42f0);
        android.os.Bundle bundle = uVar.f295334c;
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f546634d;
        uVar.o(abstractActivityC22902xe37969e, 0, bundle);
        if (abstractActivityC22902xe37969e.mo63463x4510f9c8()) {
            abstractActivityC22902xe37969e.finish();
        }
    }
}
