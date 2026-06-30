package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805;

/* loaded from: classes9.dex */
public class r implements android.view.View.OnClickListener {
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.s sVar) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        et3.b bVar = (et3.b) view.getTag();
        if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(view.getContext(), pt0.f0.Li(bVar.f338133k, bVar.f338125c).G, bVar.f338123a.M)) {
            yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i18 = bVar.f338127e;
        if (i18 == 0) {
            if (bt3.g2.K(bVar.f338123a, bVar.f338133k, bVar.f338125c)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightViewWrapper", "onclick: play sight");
                android.content.Intent intent = new android.content.Intent(view.getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680.class);
                intent.putExtra("message_id", bVar.f338125c);
                intent.putExtra("message_talker", bVar.f338133k);
                intent.putExtra("record_xml", bVar.f338126d);
                intent.putExtra("record_data_id", bVar.f338123a.T);
                android.content.Context context = view.getContext();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                zs3.y D0 = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(bt3.g2.y(bVar.f338123a.T, bVar.f338133k, bVar.f338125c, true));
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = D0 == null ? "null" : java.lang.Integer.valueOf(D0.f68328x10a0fed7);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightViewWrapper", "onclick: cdnInfo status %s", objArr);
                if (D0 != null && 2 != (i17 = D0.f68328x10a0fed7) && 3 != i17) {
                    if (4 == i17) {
                        db5.e1.T(view.getContext(), view.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccc));
                        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else if (i17 == 0 || 1 == i17) {
                        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                }
                bt3.g2.O(bVar.f338123a, bVar.f338133k, bVar.f338125c, true);
            }
        } else if (i18 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightViewWrapper", "click item favid %d, localid %d, itemstatus %d", java.lang.Integer.valueOf(bVar.f338124b.f67643xc8a07680), java.lang.Long.valueOf(bVar.f338124b.f67645x88be67a1), java.lang.Integer.valueOf(bVar.f338124b.f67644x3059914a));
            if (bVar.f338124b.I0()) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
                am.z9 z9Var = c5432x35bb364f.f135776g;
                z9Var.f90061a = 14;
                z9Var.f90066f = bVar.f338123a;
                c5432x35bb364f.e();
                am.aa aaVar = c5432x35bb364f.f135777h;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightViewWrapper", "favItemInfo is Done,file exist ret = %d", java.lang.Integer.valueOf(aaVar.f87667a));
                if (aaVar.f87667a == 1) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("key_detail_info_id", bVar.f338124b.f67645x88be67a1);
                    intent2.putExtra("key_detail_data_id", bVar.f338123a.T);
                    intent2.putExtra("key_detail_can_delete", false);
                    o72.x1.M0(view.getContext(), ".ui.detail.FavoriteFileDetailUI", intent2, 1, null);
                    yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f338123a.f456967s)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightViewWrapper", "favItemInfo getCdnDataUrl empty");
                    yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightViewWrapper", "? info is done, source file not exist, cdn data url is not null");
            } else {
                o72.r2 r2Var = bVar.f338124b;
                if ((r2Var.f67644x3059914a == 8) || r2Var.P0()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightViewWrapper", "favItemInfo isDownLoadFaied or isUploadFailed, wait download");
                } else {
                    if (bVar.f338124b.J0() || bVar.f338124b.Q0()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightViewWrapper", "favItemInfo isDownloading or isUploadding, wait download");
                        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightViewWrapper", "other status, not done, downloading, uploading, downloadfail, uploadfail");
                }
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
            o72.r2 r2Var2 = bVar.f338124b;
            long j17 = r2Var2.f67645x88be67a1;
            am.z9 z9Var2 = c5432x35bb364f2.f135776g;
            z9Var2.f90065e = j17;
            if (r2Var2.P0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightViewWrapper", "upload failed, try to restart...");
                z9Var2.f90061a = 15;
                c5432x35bb364f2.e();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightViewWrapper", "download failed, try to restart...");
                z9Var2.f90061a = 16;
                c5432x35bb364f2.e();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
