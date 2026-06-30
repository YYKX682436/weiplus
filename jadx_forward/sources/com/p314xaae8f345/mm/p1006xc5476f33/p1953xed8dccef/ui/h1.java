package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class h1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16818xbff037ef f234829a;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16818xbff037ef activityC16818xbff037ef) {
        this.f234829a = activityC16818xbff037ef;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.v
    public void a(int i17, int i18, java.lang.String str) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16818xbff037ef activityC16818xbff037ef = this.f234829a;
        if (i17 != 0 || i18 != 0) {
            if (i18 != -10010003) {
                activityC16818xbff037ef.f234725d = str;
                activityC16818xbff037ef.showDialog(-10001);
                return;
            }
            activityC16818xbff037ef.mo67598xf0aced2e(0);
            activityC16818xbff037ef.f234780e.setVisibility(8);
            activityC16818xbff037ef.f234781f.setVisibility(0);
            java.util.List list = activityC16818xbff037ef.f234794v.f530083c;
            if (list == null || list.size() <= 0) {
                return;
            }
            activityC16818xbff037ef.f234792t.f234892e = list;
            return;
        }
        wq3.t tVar = activityC16818xbff037ef.f234794v.f530082b;
        if (tVar == null) {
            activityC16818xbff037ef.mo74408xb0dfae51(false);
        } else {
            activityC16818xbff037ef.mo74408xb0dfae51(true);
            activityC16818xbff037ef.mo67598xf0aced2e(0);
            activityC16818xbff037ef.f234780e.setVisibility(0);
            activityC16818xbff037ef.f234781f.setVisibility(8);
            xq3.c cVar = tVar.f530132e;
            if (cVar != null) {
                activityC16818xbff037ef.f234783h.setText(cVar.f537592d);
                android.widget.TextView textView = activityC16818xbff037ef.f234784i;
                xq3.c cVar2 = tVar.f530132e;
                textView.setText(wq3.h.c(cVar2.f537595g, cVar2.f537596h, cVar2.f537608w));
                activityC16818xbff037ef.f234785m.setText(wq3.h.b(r3.f537594f, tVar.f530132e.f537608w));
            }
            if (activityC16818xbff037ef.f234794v.g() <= 0) {
                activityC16818xbff037ef.f234793u.setEnabled(false);
                activityC16818xbff037ef.f234793u.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574009gs3);
            } else if (activityC16818xbff037ef.f234794v.f530082b.f530131d <= 0) {
                activityC16818xbff037ef.f234793u.setEnabled(false);
                activityC16818xbff037ef.f234793u.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574008gs2);
            } else {
                activityC16818xbff037ef.f234793u.setEnabled(true);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f530137j)) {
                    activityC16818xbff037ef.f234793u.setText(com.p314xaae8f345.mm.R.C30867xcad56011.grr);
                } else {
                    activityC16818xbff037ef.f234793u.setText(tVar.f530137j);
                }
            }
            xq3.c cVar3 = tVar.f530132e;
            if (cVar3 == null || (linkedList = cVar3.f537607v) == null || linkedList.size() <= 0) {
                activityC16818xbff037ef.f234789q.setVisibility(8);
            } else {
                activityC16818xbff037ef.f234789q.setVisibility(0);
                activityC16818xbff037ef.f234790r.c(tVar.f530132e.f537607v);
                activityC16818xbff037ef.f234790r.notifyDataSetChanged();
            }
            xq3.c cVar4 = tVar.f530132e;
            if (cVar4 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar4.f537599n)) {
                activityC16818xbff037ef.f234788p.setVisibility(8);
                activityC16818xbff037ef.f234786n.setVisibility(8);
            } else {
                activityC16818xbff037ef.f234788p.setVisibility(0);
                activityC16818xbff037ef.f234786n.setVisibility(0);
                activityC16818xbff037ef.f234786n.m67596x765074af(tVar.f530132e.f537599n);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f530138k)) {
                activityC16818xbff037ef.f234787o.setVisibility(8);
            } else {
                activityC16818xbff037ef.f234787o.setVisibility(0);
                activityC16818xbff037ef.f234787o.m67596x765074af(tVar.f530138k);
            }
            activityC16818xbff037ef.mo74408xb0dfae51(true);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16818xbff037ef.f234794v.f530091k)) {
                y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.o(activityC16818xbff037ef.f234794v.f530091k);
                ((x60.e) fVar).getClass();
                activityC16818xbff037ef.f234782g.setImageBitmap(x51.w0.d(oVar));
                ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(activityC16818xbff037ef);
            }
        }
        android.widget.Button button = activityC16818xbff037ef.f234793u;
        if (button != null) {
            button.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.g1(this), 200L);
        }
    }
}
