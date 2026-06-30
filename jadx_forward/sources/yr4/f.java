package yr4;

/* loaded from: classes9.dex */
public class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f546627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f546628e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yr4.u f546629f;

    public f(yr4.u uVar, int i17, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e) {
        this.f546629f = uVar;
        this.f546627d = i17;
        this.f546628e = abstractActivityC22902xe37969e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        yr4.u uVar = this.f546629f;
        uVar.f295334c.putInt("key_pay_flag", 3);
        uVar.f295334c.putInt("key_err_code", this.f546627d);
        android.os.Bundle bundle = uVar.f295334c;
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f546628e;
        uVar.o(abstractActivityC22902xe37969e, 0, bundle);
        if (abstractActivityC22902xe37969e.mo63463x4510f9c8()) {
            abstractActivityC22902xe37969e.finish();
        }
    }
}
