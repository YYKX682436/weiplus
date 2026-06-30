package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ot extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.ot f108679d = new com.tencent.mm.plugin.finder.feed.ot();

    public ot() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Context context = it.getContext();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
        return java.lang.Boolean.valueOf(appCompatActivity == null || appCompatActivity.mo133getLifecycle().b() == androidx.lifecycle.n.RESUMED);
    }
}
