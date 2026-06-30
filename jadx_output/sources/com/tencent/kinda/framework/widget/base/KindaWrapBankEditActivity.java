package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class KindaWrapBankEditActivity extends com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI {
    public static final java.lang.String FLAG_ACTIVITY_BACK = "flag_activity_back_KindaWrapBankEditActivity";
    public static final java.lang.String FLAG_ACTIVITY_CLOSE = "flag_activity_close_KindaWrapBankEditActivity";
    public static final int REQ_SELECT_BANKCARD_TYPE = 1;
    public static final java.lang.String TAG = "KindaBank.KindaWrapBankEditActivity";
    private java.lang.String mSelectBankName;
    private java.util.List<fb5.n> mSortEntities = new java.util.ArrayList();

    private void sendDatatoKinda(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = "";
        for (com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery : this.bankcardTypeList) {
            if (elementQuery.f179648e.equals(str) && elementQuery.f179660t.equals(str2)) {
                str4 = elementQuery.f179659s;
                com.tencent.mars.xlog.Log.i(TAG, "Ktemp.bank_type：" + elementQuery.f179659s);
            }
        }
        if (!str4.isEmpty()) {
            str3 = str4;
        }
        com.tencent.mm.autogen.events.BankEditSelectedEvent bankEditSelectedEvent = new com.tencent.mm.autogen.events.BankEditSelectedEvent();
        am.m0 m0Var = bankEditSelectedEvent.f53996g;
        m0Var.f7286a = str;
        m0Var.f7288c = str2;
        m0Var.f7287b = str3;
        bankEditSelectedEvent.e();
        com.tencent.mars.xlog.Log.i(TAG, "sendDataToKinda：bankName：" + str + "  bankAccName：" + str2 + "  BankType：" + str3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("KindaWrapBankEditActivity.onItemSelect，发送事件，当前线程：");
        sb6.append(java.lang.Thread.currentThread().getId());
        com.tencent.mars.xlog.Log.i(TAG, sb6.toString());
        finish();
        if (isFinishing()) {
            com.tencent.mm.autogen.events.BankEditSelectedEvent bankEditSelectedEvent2 = new com.tencent.mm.autogen.events.BankEditSelectedEvent();
            bankEditSelectedEvent2.f53996g.f7286a = FLAG_ACTIVITY_CLOSE;
            bankEditSelectedEvent2.e();
        }
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI
    public void fetchData() {
        r45.nd ndVar = new r45.nd();
        try {
            ndVar.parseFrom(getIntent().getByteArrayExtra("major_bank_list"));
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e(TAG, "bank list parse failed");
        }
        this.majorBankCardList = new java.util.ArrayList();
        java.util.Iterator it = ndVar.f381255d.iterator();
        while (it.hasNext()) {
            r45.md mdVar = (r45.md) it.next();
            com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery = new com.tencent.mm.plugin.wallet_core.model.ElementQuery();
            elementQuery.f179648e = mdVar.f380369d;
            elementQuery.f179659s = mdVar.f380371f;
            this.majorBankCardList.add(elementQuery);
        }
        r45.nd ndVar2 = new r45.nd();
        try {
            ndVar2.parseFrom(getIntent().getByteArrayExtra("bank_list"));
        } catch (java.lang.Exception unused2) {
            com.tencent.mars.xlog.Log.e(TAG, "bank list parse failed");
        }
        this.bankcardList = new java.util.ArrayList();
        java.util.Iterator it6 = ndVar2.f381255d.iterator();
        while (it6.hasNext()) {
            r45.md mdVar2 = (r45.md) it6.next();
            com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery2 = new com.tencent.mm.plugin.wallet_core.model.ElementQuery();
            elementQuery2.f179648e = mdVar2.f380369d;
            elementQuery2.f179659s = mdVar2.f380371f;
            this.bankcardList.add(elementQuery2);
        }
        r45.nd ndVar3 = new r45.nd();
        try {
            ndVar3.parseFrom(getIntent().getByteArrayExtra("bank_type_list"));
        } catch (java.lang.Exception unused3) {
            com.tencent.mars.xlog.Log.e(TAG, "bank type list parse failed");
        }
        this.bankcardTypeList = new java.util.ArrayList();
        java.util.Iterator it7 = ndVar3.f381255d.iterator();
        while (it7.hasNext()) {
            r45.md mdVar3 = (r45.md) it7.next();
            com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery3 = new com.tencent.mm.plugin.wallet_core.model.ElementQuery();
            elementQuery3.f179648e = mdVar3.f380369d;
            elementQuery3.f179659s = mdVar3.f380371f;
            elementQuery3.f179660t = mdVar3.f380373h;
            this.bankcardTypeList.add(elementQuery3);
        }
        runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.KindaWrapBankEditActivity.1
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.kinda.framework.widget.base.KindaWrapBankEditActivity.super.fetchData();
            }
        });
        setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.kinda.framework.widget.base.KindaWrapBankEditActivity.2
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                ((com.tencent.mm.wallet_core.ui.WalletBaseUI) com.tencent.kinda.framework.widget.base.KindaWrapBankEditActivity.this).mPayResultType = 4;
                if (com.tencent.kinda.framework.widget.base.KindaWrapBankEditActivity.this.needConfirmFinish()) {
                    com.tencent.kinda.framework.widget.base.KindaWrapBankEditActivity.this.hideVKB();
                    com.tencent.kinda.framework.widget.base.KindaWrapBankEditActivity.this.showDialog(1000);
                    return true;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.L0(((com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI) com.tencent.kinda.framework.widget.base.KindaWrapBankEditActivity.this).bankcardTypeList)) {
                    com.tencent.mm.autogen.events.BankEditSelectedEvent bankEditSelectedEvent = new com.tencent.mm.autogen.events.BankEditSelectedEvent();
                    bankEditSelectedEvent.f53996g.f7286a = com.tencent.kinda.framework.widget.base.KindaWrapBankEditActivity.FLAG_ACTIVITY_BACK;
                    bankEditSelectedEvent.e();
                }
                com.tencent.kinda.framework.widget.base.KindaWrapBankEditActivity.this.finish();
                return true;
            }
        });
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 != 1 || intent == null) {
            return;
        }
        sendDatatoKinda(this.mSelectBankName, intent.getStringExtra("bank_card_acc_name"), "");
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI
    public void onItemSelect(java.lang.Object obj, int i17) {
        gt4.n nVar = (gt4.n) obj;
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        if (nVar == null) {
            return;
        }
        hideVKB();
        this.mSelectBankName = nVar.f275473c;
        if (this.bankcardTypeList.size() == 0) {
            sendDatatoKinda(this.mSelectBankName, "", nVar.f275475e);
            return;
        }
        for (com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery : this.bankcardTypeList) {
            if (elementQuery.f179648e.equals(this.mSelectBankName)) {
                arrayList.add(elementQuery.f179660t);
            }
        }
        if (arrayList.size() == 1) {
            sendDatatoKinda(this.mSelectBankName, arrayList.get(0), "");
            return;
        }
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.wallet_core.ui.WalletBankCardTypeSelectUI.class);
        intent.putStringArrayListExtra("bank_type_show_list", arrayList);
        startActivityForResult(intent, 1);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            com.tencent.mm.autogen.events.BankEditSelectedEvent bankEditSelectedEvent = new com.tencent.mm.autogen.events.BankEditSelectedEvent();
            bankEditSelectedEvent.f53996g.f7286a = FLAG_ACTIVITY_CLOSE;
            bankEditSelectedEvent.e();
        }
    }
}
