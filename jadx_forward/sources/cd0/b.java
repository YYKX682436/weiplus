package cd0;

/* loaded from: classes5.dex */
public final class b extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onNewIntent */
    public void mo2280xc944513d(android.content.Intent intent) {
        if (intent != null) {
            intent.getFlags();
        }
        super.mo2280xc944513d(intent);
        if (intent != null ? intent.getBooleanExtra("KEY_START_FROM_LANDING_UIC", false) : false) {
            db5.e1.y(m158354x19263085(), m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5p), "", m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5m), cd0.a.f122052d);
            if (!(m158354x19263085() instanceof com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) || intent == null) {
                return;
            }
            intent.setFlags(intent.getFlags() & (-67108865));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onStartActivityForResult */
    public void mo14640xb30cf874(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        super.mo14640xb30cf874(intent, i17, bundle);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6.f280024f.get();
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            java.util.Objects.toString(intent != null ? intent.getExtras() : null);
            java.util.Objects.toString(bundle);
            java.util.Objects.toString(intent != null ? intent.getComponent() : null);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStartActivityForResult() click MsgId:");
            sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
            sb6.append(" msgSrvId:");
            sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.I0()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MRevokeChat.HomePageUIC", sb6.toString());
        }
        if (f9Var != null) {
            if (intent != null) {
                intent.putExtra("KEY_CLICK_MSG_ID", f9Var.m124847x74d37ac6());
            }
            if (intent != null) {
                intent.putExtra("KEY_CLICK_MSG_TALKER", f9Var.Q0());
            }
            if (intent != null) {
                intent.putExtra("KEY_CLICK_MSG_SRV_ID", f9Var.I0());
            }
        }
        if (intent != null) {
            pf5.j0.a(intent, com.p314xaae8f345.mm.p689xc5a27af6.p761xc84f0e86.C10677xd5472755.class);
        }
        if (intent != null) {
            intent.putExtra("KEY_HOME_PAGE_CLS", m158354x19263085().getClass().getName());
        }
    }
}
