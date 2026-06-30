package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class d6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.l6 f105458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(com.tencent.mm.plugin.finder.extension.reddot.l6 l6Var) {
        super(0);
        this.f105458d = l6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.extension.reddot.l6 l6Var = this.f105458d;
        if (l6Var.f105679e) {
            l6Var.e(false);
            android.widget.LinearLayout linearLayout = l6Var.f105681g;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            l6Var.f105681g = null;
        }
        return jz5.f0.f302826a;
    }
}
