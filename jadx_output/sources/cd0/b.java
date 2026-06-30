package cd0;

/* loaded from: classes5.dex */
public final class b extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onNewIntent(android.content.Intent intent) {
        if (intent != null) {
            intent.getFlags();
        }
        super.onNewIntent(intent);
        if (intent != null ? intent.getBooleanExtra("KEY_START_FROM_LANDING_UIC", false) : false) {
            db5.e1.y(getActivity(), getActivity().getResources().getString(com.tencent.mm.R.string.b5p), "", getActivity().getResources().getString(com.tencent.mm.R.string.b5m), cd0.a.f40519d);
            if (!(getActivity() instanceof com.tencent.mm.ui.LauncherUI) || intent == null) {
                return;
            }
            intent.setFlags(intent.getFlags() & (-67108865));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onStartActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        super.onStartActivityForResult(intent, i17, bundle);
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) com.tencent.mm.ui.chatting.b6.f198491f.get();
        if (com.tencent.mars.xlog.Log.isDebug()) {
            java.util.Objects.toString(intent != null ? intent.getExtras() : null);
            java.util.Objects.toString(bundle);
            java.util.Objects.toString(intent != null ? intent.getComponent() : null);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStartActivityForResult() click MsgId:");
            sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null);
            sb6.append(" msgSrvId:");
            sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.I0()) : null);
            com.tencent.mars.xlog.Log.i("MRevokeChat.HomePageUIC", sb6.toString());
        }
        if (f9Var != null) {
            if (intent != null) {
                intent.putExtra("KEY_CLICK_MSG_ID", f9Var.getMsgId());
            }
            if (intent != null) {
                intent.putExtra("KEY_CLICK_MSG_TALKER", f9Var.Q0());
            }
            if (intent != null) {
                intent.putExtra("KEY_CLICK_MSG_SRV_ID", f9Var.I0());
            }
        }
        if (intent != null) {
            pf5.j0.a(intent, com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC.class);
        }
        if (intent != null) {
            intent.putExtra("KEY_HOME_PAGE_CLS", getActivity().getClass().getName());
        }
    }
}
