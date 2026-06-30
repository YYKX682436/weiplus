package com.tencent.mm.plugin.announcement;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.announcement.q f74704d = new com.tencent.mm.plugin.announcement.q();

    public q() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return "" + ((java.lang.Object) ((android.widget.TextView) it.findViewById(com.tencent.mm.R.id.kfe)).getText()) + ((java.lang.Object) ((android.widget.TextView) it.findViewById(com.tencent.mm.R.id.kfj)).getText());
    }
}
