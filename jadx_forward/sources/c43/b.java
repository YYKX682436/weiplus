package c43;

/* loaded from: classes8.dex */
public class b implements r53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15725x912acd13 f119925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c43.c f119926b;

    public b(c43.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15725x912acd13 c15725x912acd13) {
        this.f119926b = cVar;
        this.f119925a = c15725x912acd13;
    }

    @Override // r53.x
    public void a(android.view.View view, android.graphics.Bitmap bitmap) {
        this.f119926b.Z.post(new c43.a(this, bitmap));
    }

    @Override // r53.x
    public void b(java.lang.String str, android.view.View view) {
    }
}
