package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes5.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        super(0);
        this.f106196d = a7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f106196d.f106207d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        return new kw2.c(nyVar != null ? nyVar.V6() : null);
    }
}
