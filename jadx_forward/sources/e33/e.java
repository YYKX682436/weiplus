package e33;

/* loaded from: classes10.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f328738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f328739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b f328740f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e33.b0 f328741g;

    public e(e33.b0 b0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b) {
        this.f328741g = b0Var;
        this.f328738d = abstractC15633xee433078;
        this.f328739e = j17;
        this.f328740f = c15635xf0ea441b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((e35.e) ((e40.x) i95.n0.c(e40.x.class))).Ai(com.p314xaae8f345.mm.vfs.w6.n(this.f328738d.f219963e), this.f328739e, 3, 2, this.f328741g.f328671q, this.f328740f.f219979x / 1000);
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
