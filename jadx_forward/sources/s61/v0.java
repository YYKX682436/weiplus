package s61;

/* loaded from: classes9.dex */
public class v0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f484928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f484929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11379x123ccf34 f484930f;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11379x123ccf34 activityC11379x123ccf34, int i17, int i18) {
        this.f484930f = activityC11379x123ccf34;
        this.f484928d = i17;
        this.f484929e = i18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (this.f484928d != 4) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7160xdeb98c4c c7160xdeb98c4c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7160xdeb98c4c();
            c7160xdeb98c4c.f144649d = 2;
            c7160xdeb98c4c.f144653h = 1;
            c7160xdeb98c4c.k();
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7160xdeb98c4c c7160xdeb98c4c2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7160xdeb98c4c();
        c7160xdeb98c4c2.f144649d = 2;
        c7160xdeb98c4c2.f144653h = this.f484929e;
        c7160xdeb98c4c2.k();
        this.f484930f.finish();
    }
}
