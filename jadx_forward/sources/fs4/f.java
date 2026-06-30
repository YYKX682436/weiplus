package fs4;

/* loaded from: classes9.dex */
public class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f347872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fs4.h f347873e;

    public f(fs4.h hVar, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e) {
        this.f347873e = hVar;
        this.f347872d = abstractActivityC22902xe37969e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        fs4.h hVar = this.f347873e;
        android.os.Bundle bundle = hVar.f295334c;
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f347872d;
        hVar.f(abstractActivityC22902xe37969e, bundle);
        if (abstractActivityC22902xe37969e.mo63463x4510f9c8()) {
            abstractActivityC22902xe37969e.finish();
        }
        abstractActivityC22902xe37969e.m83095x2f1a9bd8();
    }
}
