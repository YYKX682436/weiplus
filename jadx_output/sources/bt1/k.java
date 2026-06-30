package bt1;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f24167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bt1.g f24168e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bt1.l f24169f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f24170g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.List list, bt1.g gVar, bt1.l lVar, int i17) {
        super(1);
        this.f24167d = list;
        this.f24168e = gVar;
        this.f24169f = lVar;
        this.f24170g = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fp0.r singleTask = (fp0.r) obj;
        kotlin.jvm.internal.o.g(singleTask, "singleTask");
        java.util.List list = this.f24167d;
        new dt1.h(list, this.f24168e).l().H(new bt1.j(this.f24169f, list, this.f24170g, singleTask));
        return jz5.f0.f302826a;
    }
}
