package p02;

/* loaded from: classes8.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p02.g f431904d;

    public c(p02.g gVar, p02.h hVar) {
        this.f431904d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p02.l lVar = (p02.l) view.getTag();
        p02.g gVar = this.f431904d;
        gVar.f431928x.f431930e.l1(lVar.f431937b);
        if (gVar.f431928x.f431929d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gax).equals(gVar.f431918n.getText().toString())) {
            k02.l.c(gVar.f431928x.f431929d, lVar.f431952q, lVar.f431939d, lVar.f431953r);
            o02.a.b(13, 1303, lVar.f431945j, 22, lVar.f431939d, "", "");
        } else if (gVar.f431928x.f431929d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g1c).equals(gVar.f431918n.getText().toString())) {
            h02.a d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(lVar.f431939d);
            if (d17 == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (com.p314xaae8f345.mm.vfs.w6.j(d17.f68419xf1e9b966)) {
                k02.l.a(d17.f68408x32b20428, false, null);
                o02.a.b(13, 1303, lVar.f431945j, 44, lVar.f431939d, "", "");
            }
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("appId", lVar.f431939d);
            intent.addFlags(67108864);
            ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ri(gVar.f431928x.f431929d, intent, null);
            o02.a.b(13, 1303, lVar.f431945j, 23, lVar.f431939d, "", "");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
