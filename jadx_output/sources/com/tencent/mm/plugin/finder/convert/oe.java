package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class oe extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f104172d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(com.tencent.mm.plugin.finder.convert.qe qeVar) {
        super(0);
        this.f104172d = qeVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent;
        androidx.appcompat.app.AppCompatActivity context = this.f104172d.f104358f.getF122643d().getContext();
        return java.lang.Integer.valueOf((context == null || (intent = context.getIntent()) == null) ? 0 : intent.getIntExtra("key_topic_type", 1));
    }
}
