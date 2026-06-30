package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class h7 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f102227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f102229f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102230g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(android.content.Intent intent, java.lang.String str, kotlinx.coroutines.q qVar, android.content.Context context) {
        super(3);
        this.f102227d = intent;
        this.f102228e = str;
        this.f102229f = qVar;
        this.f102230g = context;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        ((java.lang.Number) obj3).intValue();
        kotlinx.coroutines.q qVar = this.f102229f;
        if (booleanValue) {
            android.content.Intent intent = this.f102227d;
            intent.putExtra("Retr_MsgQuickShare", true);
            intent.putExtra("Select_Conv_User", this.f102228e);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.TRUE, str)));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.FALSE, null)));
        }
        android.content.Context context = this.f102230g;
        com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI finderLiveShareProductUI = context instanceof com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI ? (com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI) context : null;
        if (finderLiveShareProductUI == null) {
            return null;
        }
        finderLiveShareProductUI.finish();
        return jz5.f0.f302826a;
    }
}
