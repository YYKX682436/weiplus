package np5;

/* loaded from: classes9.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f420369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f420370e;

    public i(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, int i17) {
        this.f420369d = abstractActivityC22902xe37969e;
        this.f420370e = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f420369d;
        com.p314xaae8f345.mm.p2802xd031a825.a.c(abstractActivityC22902xe37969e, abstractActivityC22902xe37969e.m83105x7498fe14(), this.f420370e);
        if (abstractActivityC22902xe37969e.mo63463x4510f9c8() || abstractActivityC22902xe37969e.m83104x209a3aba() != 0) {
            abstractActivityC22902xe37969e.finish();
        }
    }
}
