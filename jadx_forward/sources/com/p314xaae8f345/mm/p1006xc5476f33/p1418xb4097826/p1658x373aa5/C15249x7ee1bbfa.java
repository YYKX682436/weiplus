package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljz5/f0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showUserInfoConfirmDialogOnLiveRedPacket$1$1 */
/* loaded from: classes3.dex */
public final class C15249x7ee1bbfa extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: $cancel */
    final /* synthetic */ java.lang.String f36288x1eda839e;

    /* renamed from: $context */
    final /* synthetic */ android.content.Context f36289xd461850b;

    /* renamed from: $lcancel */
    final /* synthetic */ android.content.DialogInterface.OnClickListener f36290x9b457d42;

    /* renamed from: $lok */
    final /* synthetic */ android.content.DialogInterface.OnClickListener f36291x1200a4;
    final /* synthetic */ java.lang.String $ok;

    /* renamed from: $title */
    final /* synthetic */ java.lang.String f36292x440298b4;

    /* renamed from: $userInfoContainer */
    final /* synthetic */ android.view.View f36293xce9e3dc4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15249x7ee1bbfa(android.content.Context context, java.lang.String str, android.view.View view, java.lang.String str2, java.lang.String str3, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        super(1);
        this.f36289xd461850b = context;
        this.f36292x440298b4 = str;
        this.f36293xce9e3dc4 = view;
        this.$ok = str2;
        this.f36288x1eda839e = str3;
        this.f36291x1200a4 = onClickListener;
        this.f36290x9b457d42 = onClickListener2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo146xb9724478(java.lang.Object obj) {
        m61680xb9724478(((java.lang.Boolean) obj).booleanValue());
        return jz5.f0.f384359a;
    }

    /* renamed from: invoke */
    public final void m61680xb9724478(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15230x4b89f918.Companion companion = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15230x4b89f918.INSTANCE;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15249x7ee1bbfa.AnonymousClass1 anonymousClass1 = new android.content.DialogInterface.OnDismissListener() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showUserInfoConfirmDialogOnLiveRedPacket$1$1.1
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                }
            };
            android.content.Context context = this.f36289xd461850b;
            java.lang.String str = this.f36292x440298b4;
            android.view.View userInfoContainer = this.f36293xce9e3dc4;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userInfoContainer, "$userInfoContainer");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15230x4b89f918.Companion.m61660xc62862c8(companion, context, null, 0, str, userInfoContainer, this.$ok, this.f36288x1eda839e, 1, this.f36291x1200a4, this.f36290x9b457d42, anonymousClass1, false, 2054, null);
            return;
        }
        android.content.Context context2 = this.f36289xd461850b;
        db5.t7.i(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574767je1), com.p314xaae8f345.mm.R.raw.f79723x416541f0);
    }
}
