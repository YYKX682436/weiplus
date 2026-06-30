package xc2;

/* loaded from: classes2.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14136x8f9c3d6a f534660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14136x8f9c3d6a c14136x8f9c3d6a) {
        super(0);
        this.f534660d = c14136x8f9c3d6a;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f534660d.f191593w;
        return java.lang.Boolean.valueOf(view == null || !view.canScrollVertically(-1));
    }
}
