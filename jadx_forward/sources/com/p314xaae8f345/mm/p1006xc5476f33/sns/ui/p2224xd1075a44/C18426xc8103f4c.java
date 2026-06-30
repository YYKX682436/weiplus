package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/SnsUploadV2EditText;", "Lcom/tencent/mm/plugin/sns/ui/SnsEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsUploadV2EditText */
/* loaded from: classes5.dex */
public final class C18426xc8103f4c extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18056x3bc9e3cf {
    public C18426xc8103f4c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadV2EditText", "init: manual add emoji watcher");
        jg5.c.f381198a.b(this, 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18056x3bc9e3cf, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017, fl5.i
    /* renamed from: getRealEditText */
    public fl5.i mo61840xc52e48b() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017, fl5.i
    public void n(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insetText", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadV2EditText");
        getEditableText().insert(getSelectionStart(), str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insetText", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadV2EditText");
    }
}
