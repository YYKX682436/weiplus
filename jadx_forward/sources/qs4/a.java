package qs4;

/* loaded from: classes9.dex */
public class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f447946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qs4.b f447947e;

    public a(qs4.b bVar, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e) {
        this.f447947e = bVar;
        this.f447946d = abstractActivityC22902xe37969e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qs4.b bVar = this.f447947e;
        android.os.Bundle bundle = bVar.f295334c;
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f447946d;
        bVar.f(abstractActivityC22902xe37969e, bundle);
        if (abstractActivityC22902xe37969e.mo63463x4510f9c8()) {
            abstractActivityC22902xe37969e.finish();
        }
        abstractActivityC22902xe37969e.m83095x2f1a9bd8();
    }
}
