package e05;

/* loaded from: classes9.dex */
public class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ViewOnClickListenerC19553xcfaf7ef f327710d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ViewOnClickListenerC19553xcfaf7ef viewOnClickListenerC19553xcfaf7ef) {
        this.f327710d = viewOnClickListenerC19553xcfaf7ef;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ViewOnClickListenerC19553xcfaf7ef viewOnClickListenerC19553xcfaf7ef = this.f327710d;
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(viewOnClickListenerC19553xcfaf7ef);
        if (g17 != null) {
            g17.f(viewOnClickListenerC19553xcfaf7ef, viewOnClickListenerC19553xcfaf7ef.m83105x7498fe14());
        } else {
            viewOnClickListenerC19553xcfaf7ef.finish();
        }
    }
}
