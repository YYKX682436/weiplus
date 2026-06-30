package com.tencent.mm.plugin.address.ui;

/* loaded from: classes9.dex */
public final class i implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.AddrItemView f74557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f74558e;

    public i(com.tencent.mm.plugin.address.ui.AddrItemView addrItemView, android.content.Context context) {
        this.f74557d = addrItemView;
        this.f74558e = context;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView = this.f74557d;
        if (!z17) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = addrItemView.f74406p;
            if (mMEditText == null) {
                kotlin.jvm.internal.o.o("itemTextET");
                throw null;
            }
            java.lang.String obj = mMEditText.getText().toString();
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(this.f74558e, obj);
            if (!kotlin.jvm.internal.o.b(obj, i17.toString())) {
                com.tencent.mm.ui.widget.MMEditText mMEditText2 = addrItemView.f74406p;
                if (mMEditText2 == null) {
                    kotlin.jvm.internal.o.o("itemTextET");
                    throw null;
                }
                mMEditText2.setText(i17);
            }
        }
        r26.t tVar = com.tencent.mm.plugin.address.ui.AddrItemView.f74396t;
        addrItemView.c(false);
    }
}
