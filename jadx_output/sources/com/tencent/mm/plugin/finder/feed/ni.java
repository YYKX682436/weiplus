package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class ni extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ti f108578d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(com.tencent.mm.plugin.finder.feed.ti tiVar) {
        super(1);
        this.f108578d = tiVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (!(str == null || str.length() == 0)) {
            dk2.q4 q4Var = dk2.q4.f233938a;
            com.tencent.mm.plugin.finder.feed.ti tiVar = this.f108578d;
            android.app.Activity context = tiVar.getContext();
            gk2.e eVar = new gk2.e(null, 1, null);
            android.app.Activity context2 = tiVar.getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            dk2.q4.j(q4Var, context, eVar, false, str, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).c(zy2.ra.class))).V6(), false, null, 96, null);
        }
        return jz5.f0.f302826a;
    }
}
