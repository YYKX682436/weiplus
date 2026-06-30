package yr4;

/* loaded from: classes9.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f546630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yr4.u f546631e;

    public g(yr4.u uVar, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e) {
        this.f546631e = uVar;
        this.f546630d = abstractActivityC22902xe37969e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        yr4.u uVar = this.f546631e;
        uVar.f295334c.putInt("key_err_code", com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15118x25060539);
        android.os.Bundle bundle = uVar.f295334c;
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f546630d;
        uVar.o(abstractActivityC22902xe37969e, 0, bundle);
        if (abstractActivityC22902xe37969e.mo63463x4510f9c8()) {
            abstractActivityC22902xe37969e.finish();
        }
    }
}
