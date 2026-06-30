package e33;

/* loaded from: classes10.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f328747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f328748e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e33.b0 f328749f;

    public f(e33.b0 b0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078, long j17) {
        this.f328749f = b0Var;
        this.f328747d = abstractC15633xee433078;
        this.f328748e = j17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((e35.e) ((e40.x) i95.n0.c(e40.x.class))).wi(com.p314xaae8f345.mm.vfs.w6.n(this.f328747d.f219963e), this.f328748e, 4, 1, this.f328749f.f328671q);
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
