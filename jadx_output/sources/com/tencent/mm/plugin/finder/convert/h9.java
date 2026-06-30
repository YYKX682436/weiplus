package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class h9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103562d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(com.tencent.mm.plugin.finder.convert.qe qeVar) {
        super(0);
        this.f103562d = qeVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent;
        androidx.appcompat.app.AppCompatActivity context = this.f103562d.f104358f.getF122643d().getContext();
        int i17 = 0;
        if (context != null && (intent = context.getIntent()) != null) {
            i17 = intent.getIntExtra("key_feed_report_enter", 0);
        }
        return java.lang.Integer.valueOf(i17);
    }
}
