package jt4;

/* loaded from: classes8.dex */
public class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ka5 f383173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f383174e;

    public a(r45.ka5 ka5Var, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, jt4.e eVar) {
        this.f383173d = ka5Var;
        this.f383174e = abstractActivityC22902xe37969e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r45.ka5 ka5Var = this.f383173d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ka5Var.f460097g)) {
            java.lang.String str = ka5Var.f460097g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ECardUtil", "url: %s", str);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                if (str.startsWith("native.")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ECardUtil", "goto native");
                    if (!str.equals("native.qryacctdesc") && !str.equals("native.openecardauth") && !str.equals("native.cancloseecard")) {
                        str.equals("native.withdraw");
                    }
                } else {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", str);
                    intent.putExtra("showShare", false);
                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(this.f383174e, intent);
                }
            }
        }
        dialogInterface.dismiss();
    }
}
