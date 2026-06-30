package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$onComplete$1 */
/* loaded from: classes2.dex */
public final class C15254x2fbe41b7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15230x4b89f918.UserInfoHelper f36311xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15254x2fbe41b7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15230x4b89f918.UserInfoHelper userInfoHelper) {
        super(0);
        this.f36311xcbdd23aa = userInfoHelper;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public final java.lang.Boolean mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        wu5.c cVar;
        u3Var = this.f36311xcbdd23aa.loadingDialog;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        cVar = this.f36311xcbdd23aa.dialogRunnable;
        if (cVar != null) {
            return java.lang.Boolean.valueOf(cVar.cancel(false));
        }
        return null;
    }
}
