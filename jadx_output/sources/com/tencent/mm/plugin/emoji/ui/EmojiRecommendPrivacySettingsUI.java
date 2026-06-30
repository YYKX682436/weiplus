package com.tencent.mm.plugin.emoji.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmojiRecommendPrivacySettingsUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public class EmojiRecommendPrivacySettingsUI extends com.tencent.mm.ui.MMActivity {
    public final void T6(java.lang.String itemName, android.view.View root, com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn) {
        kotlin.jvm.internal.o.g(itemName, "itemName");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(mMSwitchBtn, "switch");
        root.setContentDescription(mMSwitchBtn.f211363x ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.efy, itemName) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.efx, itemName));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a3e;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents == null) {
            return null;
        }
        java.util.Set W0 = kz5.n0.W0(importUIComponents);
        W0.add(com.tencent.mm.plugin.emoji.ui.x2.class);
        return W0;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.bxe);
        setBackBtn(new com.tencent.mm.plugin.emoji.ui.y2(this));
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.cot);
        com.tencent.mm.storage.h5 h5Var = com.tencent.mm.storage.h5.f195006d;
        mMSwitchBtn.setCheck(h5Var.Ai());
        java.lang.String obj = ((android.widget.TextView) findViewById(com.tencent.mm.R.id.t2i)).getText().toString();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.t2j);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        T6(obj, findViewById, mMSwitchBtn);
        mMSwitchBtn.setSwitchListener(new com.tencent.mm.plugin.emoji.ui.z2(this, mMSwitchBtn));
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.t2h);
        mMSwitchBtn2.setCheck(h5Var.Bi());
        java.lang.String obj2 = ((android.widget.TextView) findViewById(com.tencent.mm.R.id.t2f)).getText().toString();
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.t2g);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        T6(obj2, findViewById2, mMSwitchBtn2);
        mMSwitchBtn2.setSwitchListener(new com.tencent.mm.plugin.emoji.ui.a3(this, mMSwitchBtn2));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.u_m);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.d6s);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        arrayList.add(string);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        ((ke0.e) xVar).sj(getContext(), arrayList, textView.getText().toString(), kz5.c0.k(textView.getText().toString()), textView);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        if (com.tencent.mm.storage.h5.f195006d.Ui()) {
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.cot);
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.t2h);
            mMSwitchBtn2.setCheck(false);
            mMSwitchBtn.setCheck(false);
            com.tencent.mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct customEmotionRecognitionSwitchStruct = new com.tencent.mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct();
            customEmotionRecognitionSwitchStruct.f55765d = 3;
            customEmotionRecognitionSwitchStruct.f55766e = 1L;
            customEmotionRecognitionSwitchStruct.k();
            com.tencent.mm.plugin.emoji.ui.b3 b3Var = new com.tencent.mm.plugin.emoji.ui.b3(mMSwitchBtn2, mMSwitchBtn);
            com.tencent.mm.plugin.emoji.ui.c3 c3Var = com.tencent.mm.plugin.emoji.ui.c3.f97916d;
            com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(this, 0, 0, false);
            z2Var.k(android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.a3d, (android.view.ViewGroup) null, false), 0, 0);
            z2Var.f212058g.findViewById(com.tencent.mm.R.id.lss).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.i4(z2Var, c3Var));
            z2Var.f212058g.findViewById(com.tencent.mm.R.id.f482336bq).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.j4(z2Var, b3Var));
            try {
                android.view.ViewParent parent = z2Var.f212058g.getParent().getParent();
                kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).findViewById(com.tencent.mm.R.id.ohv).setOnClickListener(com.tencent.mm.plugin.emoji.ui.k4.f98078d);
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmotionRecommendPrivacy", "Unable to disable windowCloseOnTouchOutside");
            }
            java.lang.String string = getString(com.tencent.mm.R.string.f491031nd5);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            android.widget.TextView textView = (android.widget.TextView) z2Var.f212058g.findViewById(com.tencent.mm.R.id.cus);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String string2 = getResources().getString(com.tencent.mm.R.string.d6s);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            arrayList.add(string2);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).sj(this, arrayList, textView.getText().toString(), kz5.c0.k(string), textView);
            z2Var.C();
        }
    }
}
