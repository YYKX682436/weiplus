package fs4;

/* loaded from: classes9.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f347878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fs4.m f347879e;

    public l(fs4.m mVar, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e) {
        this.f347879e = mVar;
        this.f347878d = abstractActivityC22902xe37969e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        fs4.m mVar = this.f347879e;
        android.os.Bundle bundle = mVar.f295334c;
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f347878d;
        mVar.f(abstractActivityC22902xe37969e, bundle);
        if (abstractActivityC22902xe37969e.mo63463x4510f9c8()) {
            abstractActivityC22902xe37969e.finish();
        }
        abstractActivityC22902xe37969e.m83095x2f1a9bd8();
    }
}
