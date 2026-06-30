package ps4;

@j95.b
/* loaded from: classes9.dex */
public class g extends i95.w implements o05.l {

    /* renamed from: d, reason: collision with root package name */
    public o05.k f439684d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2802xd031a825.g f439685e = new ps4.e(this);

    public void Ai(android.view.ViewGroup viewGroup) {
        if (viewGroup instanceof com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223) {
            ((com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223) viewGroup).u();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletService", "showNumKeyboard error, kbView is not WcPayKeyboard");
        }
    }

    public void Bi(android.app.Activity activity, android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        bundle.putInt("real_name_verify_mode", 2);
        com.p314xaae8f345.mm.p2802xd031a825.a.j(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a.class, bundle, null);
    }

    public android.view.ViewGroup wi(android.content.Context context, android.view.ViewGroup viewGroup, o05.j jVar) {
        if (viewGroup == null) {
            return null;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = new com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223(context, true);
        viewGroup.addView(c22894x55bf3223);
        c22894x55bf3223.setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = c22894x55bf3223.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -2);
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        c22894x55bf3223.setLayoutParams(layoutParams);
        c22894x55bf3223.m82979x8ac63285(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hys));
        c22894x55bf3223.m82981x3c4612d7(true);
        c22894x55bf3223.H = new ps4.f(this, jVar);
        return c22894x55bf3223;
    }
}
