package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class qi extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ti f108826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f108827e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(com.tencent.mm.plugin.finder.feed.ti tiVar, java.lang.String str) {
        super(1);
        this.f108826d = tiVar;
        this.f108827e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.xn1 it = (r45.xn1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ti tiVar = this.f108826d;
        com.tencent.mm.plugin.finder.live.widget.hp hpVar = tiVar.f109061d;
        if (hpVar != null) {
            java.lang.String str = this.f108827e;
            if (str == null) {
                str = "";
            }
            android.app.Activity context = tiVar.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            hpVar.x0(it, (r16 & 2) != 0 ? "" : str, 5, (r16 & 8) != 0 ? null : ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6(), false, (r16 & 32) != 0 ? "" : null);
        }
        return jz5.f0.f302826a;
    }
}
