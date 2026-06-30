package np5;

/* loaded from: classes9.dex */
public class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f420375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f420376e;

    public m(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, int i17) {
        this.f420375d = abstractActivityC22902xe37969e;
        this.f420376e = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        int i18 = this.f420376e;
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f420375d;
        com.p314xaae8f345.mm.p2802xd031a825.a.c(abstractActivityC22902xe37969e, bundle, i18);
        if (abstractActivityC22902xe37969e.mo63463x4510f9c8()) {
            abstractActivityC22902xe37969e.finish();
        }
    }
}
