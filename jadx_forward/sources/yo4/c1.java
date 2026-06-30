package yo4;

/* loaded from: classes10.dex */
public final class c1 implements ml5.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f f545722a;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f c18795x62fd7c3f) {
        this.f545722a = c18795x62fd7c3f;
    }

    @Override // ml5.h
    /* renamed from: onChange */
    public void mo10990x3dcbea6f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f c18795x62fd7c3f = this.f545722a;
        android.graphics.RectF visibilityRect = c18795x62fd7c3f.m72543x67c60a58().f104744g.getVisibilityRect();
        android.graphics.Rect rect = lt3.n.f402796d;
        rect.set((int) visibilityRect.left, (int) visibilityRect.top, (int) visibilityRect.right, (int) visibilityRect.bottom);
        gp4.j jVar = c18795x62fd7c3f.f257408r;
        jVar.getClass();
        jVar.f355945f.w(rect);
        c18795x62fd7c3f.f257406p1.z(c18795x62fd7c3f.m72543x67c60a58().f104744g.getVisibilityRect());
    }
}
