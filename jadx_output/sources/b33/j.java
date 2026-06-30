package b33;

/* loaded from: classes8.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f17670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.VASCommonFragment f17671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yz5.l lVar, com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment) {
        super(1);
        this.f17670d = lVar;
        this.f17671e = vASCommonFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f17671e.f211121p;
        kotlin.jvm.internal.o.e(vASActivity, "null cannot be cast to non-null type com.tencent.mm.ui.gallery.BaseMediaTabActivity");
        this.f17670d.invoke((com.tencent.mm.ui.gallery.BaseMediaTabActivity) vASActivity);
        return jz5.f0.f302826a;
    }
}
