package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class u9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f104690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(com.tencent.mm.plugin.finder.convert.qe qeVar) {
        super(0);
        this.f104690d = qeVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = this.f104690d.f104358f.getF122643d().getIntent();
        boolean z17 = false;
        if (intent != null && intent.getBooleanExtra("force_show_ad_tip", false)) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
