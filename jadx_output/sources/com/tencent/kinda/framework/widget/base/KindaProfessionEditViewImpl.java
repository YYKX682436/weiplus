package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class KindaProfessionEditViewImpl extends com.tencent.kinda.framework.widget.base.MMKView<android.view.View> implements com.tencent.kinda.gen.KProfessionEditView {
    private byte _hellAccFlag_;
    com.tencent.kinda.gen.KProfessionEditViewOnSelectProfessionCallback callback;
    private android.widget.LinearLayout mContainer;
    private android.content.Context mContext;
    private com.tencent.mm.plugin.wallet_core.id_verify.model.Profession mCurSelectedProfession;
    private android.widget.EditText mEditText;
    private final java.util.List<com.tencent.mm.plugin.wallet_core.id_verify.model.Profession> professions = new java.util.ArrayList();
    private com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ProfessionSelectedEvent> professionSelectedEventIListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ProfessionSelectedEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.kinda.framework.widget.base.KindaProfessionEditViewImpl.1
        {
            this.__eventId = 843767027;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.ProfessionSelectedEvent professionSelectedEvent) {
            if (com.tencent.kinda.framework.widget.base.KindaWrapProfessionActivity.ACTIVITY_CLOSE_FLAG.equals(professionSelectedEvent.f54628g.f8207a)) {
                com.tencent.kinda.framework.widget.base.KindaProfessionEditViewImpl.this.professionSelectedEventIListener.dead();
                return false;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("profession_name:");
            am.vo voVar = professionSelectedEvent.f54628g;
            sb6.append(voVar.f8207a);
            sb6.append(" profession_type:");
            sb6.append(voVar.f8208b);
            com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.MMKView.TAG, sb6.toString());
            com.tencent.kinda.framework.widget.base.KindaProfessionEditViewImpl.this.mCurSelectedProfession = new com.tencent.mm.plugin.wallet_core.id_verify.model.Profession(voVar.f8207a, voVar.f8208b);
            com.tencent.kinda.framework.widget.base.KindaProfessionEditViewImpl.this.mEditText.setText(com.tencent.kinda.framework.widget.base.KindaProfessionEditViewImpl.this.mCurSelectedProfession.f179421d);
            com.tencent.kinda.framework.widget.base.KindaProfessionEditViewImpl.this.mContainer.setContentDescription(com.tencent.kinda.framework.widget.base.KindaProfessionEditViewImpl.this.mCurSelectedProfession.f179421d);
            com.tencent.kinda.framework.widget.base.KindaProfessionEditViewImpl kindaProfessionEditViewImpl = com.tencent.kinda.framework.widget.base.KindaProfessionEditViewImpl.this;
            com.tencent.kinda.gen.KProfessionEditViewOnSelectProfessionCallback kProfessionEditViewOnSelectProfessionCallback = kindaProfessionEditViewImpl.callback;
            if (kProfessionEditViewOnSelectProfessionCallback == null) {
                return false;
            }
            kProfessionEditViewOnSelectProfessionCallback.onSelectProfession(kindaProfessionEditViewImpl.mCurSelectedProfession.f179421d, com.tencent.kinda.framework.widget.base.KindaProfessionEditViewImpl.this.mCurSelectedProfession.f179422e);
            return false;
        }
    };

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.view.View createView(android.content.Context context) {
        android.widget.EditText editText = new android.widget.EditText(context);
        this.mEditText = editText;
        editText.setInputType(0);
        this.mEditText.setFocusable(false);
        this.mEditText.setBackground(null);
        this.mEditText.setHint(com.tencent.mm.R.string.kj9);
        this.mEditText.setTextSize(0, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(context, com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(context) * 17.0f));
        this.mEditText.setPadding(0, 0, 0, 0);
        this.mContext = context;
        com.tencent.kinda.framework.widget.base.LayoutWrapper layoutWrapper = new com.tencent.kinda.framework.widget.base.LayoutWrapper(context, this.mEditText);
        this.mContainer = layoutWrapper;
        layoutWrapper.setContentDescription(context.getString(com.tencent.mm.R.string.kj9));
        return this.mContainer;
    }

    @Override // com.tencent.kinda.gen.KProfessionEditView
    public boolean getFocus() {
        return this.mEditText.isFocused();
    }

    @Override // com.tencent.kinda.gen.KProfessionEditView
    public java.lang.String getProfessionName() {
        com.tencent.mm.plugin.wallet_core.id_verify.model.Profession profession = this.mCurSelectedProfession;
        if (profession != null) {
            return profession.f179421d;
        }
        return null;
    }

    @Override // com.tencent.kinda.gen.KProfessionEditView
    public int getProfessionType() {
        com.tencent.mm.plugin.wallet_core.id_verify.model.Profession profession = this.mCurSelectedProfession;
        if (profession != null) {
            return profession.f179422e;
        }
        return 0;
    }

    @Override // com.tencent.kinda.gen.KProfessionEditView
    public void setData(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        r45.pd5 pd5Var = new r45.pd5();
        try {
            pd5Var.parseFrom(iTransmitKvData.getBinary("profession_list"));
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e(com.tencent.kinda.framework.widget.base.MMKView.TAG, "profession list parse failed");
        }
        this.professions.clear();
        java.util.Iterator it = pd5Var.f382968d.iterator();
        while (it.hasNext()) {
            r45.od5 od5Var = (r45.od5) it.next();
            this.professions.add(new com.tencent.mm.plugin.wallet_core.id_verify.model.Profession(od5Var.f382174e, od5Var.f382173d));
        }
    }

    @Override // com.tencent.kinda.gen.KProfessionEditView
    public void setDefaultProfession(int i17, java.lang.String str) {
        this.mCurSelectedProfession = new com.tencent.mm.plugin.wallet_core.id_verify.model.Profession(str, i17);
        this.mEditText.setText(str);
        this.mContainer.setContentDescription(this.mCurSelectedProfession.f179421d);
    }

    @Override // com.tencent.kinda.gen.KProfessionEditView
    public void setFocus(boolean z17) {
        if (z17) {
            this.professionSelectedEventIListener.alive();
            android.content.Context context = this.mContext;
            if (context instanceof com.tencent.kinda.framework.widget.base.BaseFrActivity) {
                ((com.tencent.kinda.framework.widget.base.BaseFrActivity) context).hideTenpayKB();
                android.content.Intent intent = new android.content.Intent(this.mContext, (java.lang.Class<?>) com.tencent.kinda.framework.widget.base.KindaWrapProfessionActivity.class);
                java.util.List<com.tencent.mm.plugin.wallet_core.id_verify.model.Profession> list = this.professions;
                intent.putExtra("key_profession_list", (android.os.Parcelable[]) list.toArray(new com.tencent.mm.plugin.wallet_core.id_verify.model.Profession[list.size()]));
                android.content.Context context2 = this.mContext;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context2, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/KindaProfessionEditViewImpl", "setFocus", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context2, "com/tencent/kinda/framework/widget/base/KindaProfessionEditViewImpl", "setFocus", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    @Override // com.tencent.kinda.gen.KProfessionEditView
    public void setOnSelectProfessionCallback(com.tencent.kinda.gen.KProfessionEditViewOnSelectProfessionCallback kProfessionEditViewOnSelectProfessionCallback) {
        this.callback = kProfessionEditViewOnSelectProfessionCallback;
    }
}
