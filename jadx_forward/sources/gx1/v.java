package gx1;

/* loaded from: classes12.dex */
public class v implements com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ix1.m f358861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f358862b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gx1.x f358863c;

    public v(gx1.x xVar, ix1.m mVar, android.content.Context context) {
        this.f358863c = xVar;
        this.f358861a = mVar;
        this.f358862b = context;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.e
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.b bVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.b.SUCC;
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.b bVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.b.OUT_OF_DATE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.b bVar4 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.b.ERR;
        if (bVar == bVar2 || bVar == bVar4 || bVar == bVar3) {
            this.f358863c.f358865d.C.dismiss();
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f.f178086d;
            ((java.util.ArrayList) fVar.f178087a).remove(this.f358863c.f358865d.B);
        }
        if (bVar != bVar2) {
            if (bVar == bVar4 || bVar == bVar3) {
                ((ku5.t0) ku5.t0.f394148d).B(new gx1.u(this));
                return;
            }
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_detail_info_id", 0);
        intent.putExtra("key_detail_fav_path", this.f358861a.f376862r);
        intent.putExtra("key_detail_fav_thumb_path", this.f358861a.f376879s);
        intent.putExtra("key_detail_fav_video_duration", this.f358861a.f376880t);
        intent.putExtra("key_detail_data_id", this.f358861a.f376844a);
        intent.putExtra("key_detail_statExtStr", "");
        intent.putExtra("key_detail_fav_video_show_download_status", false);
        o72.x1.M0((android.app.Activity) this.f358863c.f358865d.f358837f.getContext(), ".ui.detail.FavoriteVideoPlayUI", intent, 1, null);
    }
}
