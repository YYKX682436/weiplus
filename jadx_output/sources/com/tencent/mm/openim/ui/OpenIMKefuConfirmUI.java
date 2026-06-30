package com.tencent.mm.openim.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/openim/ui/OpenIMKefuConfirmUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-comm_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes15.dex */
public final class OpenIMKefuConfirmUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public final l41.j1 f72292d = new l41.j1(this);

    /* renamed from: e, reason: collision with root package name */
    public boolean f72293e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.boj;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f72292d.c();
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.s4 s4Var;
        super.onCreate(bundle);
        getController().G0(com.tencent.mm.ui.uk.a(getContext().getResources().getColor(com.tencent.mm.R.color.aaw), 0));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.c_4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/openim/ui/OpenIMKefuConfirmUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/openim/ui/OpenIMKefuConfirmUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.content.Intent intent = getIntent();
        l41.j1 j1Var = this.f72292d;
        j1Var.f315856o = intent;
        java.lang.String str = null;
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = intent != null ? (com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest) intent.getParcelableExtra("key_start_conversation_request") : null;
        j1Var.f315844c = openIMKefuStartConversationRequest;
        java.lang.Object[] objArr = new java.lang.Object[2];
        if (openIMKefuStartConversationRequest != null && (s4Var = openIMKefuStartConversationRequest.f72277i) != null) {
            str = s4Var.f385486d;
        }
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(j1Var.j());
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmController", "onCreate url: %s, confirmPageType: %s", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.openim.ui.OpenIMKefuConfirmUI.onResume():void");
    }
}
