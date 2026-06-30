package np5;

/* loaded from: classes9.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f420368d;

    public h(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e) {
        this.f420368d = abstractActivityC22902xe37969e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f420368d;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(abstractActivityC22902xe37969e, "https://www.payu.co.za/wechat/contact-us/", true);
        if (abstractActivityC22902xe37969e.mo63463x4510f9c8() || abstractActivityC22902xe37969e.m83104x209a3aba() != 0) {
            abstractActivityC22902xe37969e.finish();
        }
    }
}
