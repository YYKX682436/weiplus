package jt4;

/* loaded from: classes9.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ka5 f383175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f383176e;

    public b(r45.ka5 ka5Var, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e) {
        this.f383175d = ka5Var;
        this.f383176e = abstractActivityC22902xe37969e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = this.f383175d.f460098h;
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f383176e;
        if (i18 == 14586999) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ECardUtil", "do end process");
            com.p314xaae8f345.mm.p2802xd031a825.h m83108x2b5a5a39 = abstractActivityC22902xe37969e.m83108x2b5a5a39();
            if (m83108x2b5a5a39 != null) {
                m83108x2b5a5a39.f(abstractActivityC22902xe37969e, new android.os.Bundle());
            } else {
                abstractActivityC22902xe37969e.finish();
            }
        } else if (i18 == 14586996) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ECardUtil", "back bank list");
            com.p314xaae8f345.mm.p2802xd031a825.h m83108x2b5a5a392 = abstractActivityC22902xe37969e.m83108x2b5a5a39();
            if (m83108x2b5a5a392 != null) {
                m83108x2b5a5a392.c(abstractActivityC22902xe37969e, 100);
            } else {
                abstractActivityC22902xe37969e.finish();
            }
        }
        dialogInterface.dismiss();
    }
}
