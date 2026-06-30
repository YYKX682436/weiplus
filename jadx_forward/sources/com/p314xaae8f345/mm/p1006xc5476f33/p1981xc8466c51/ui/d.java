package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.e2 f236899d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.e eVar, o72.e2 e2Var) {
        this.f236899d = e2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.s.f237099c;
        o72.e2 e2Var = this.f236899d;
        android.view.View view = (android.view.View) ((java.util.HashMap) map).get(e2Var.f67085xf604e54a);
        if (view == null) {
            return;
        }
        et3.b bVar = (et3.b) view.getTag();
        java.lang.String b17 = bt3.z0.b(bVar);
        if (bVar.f338123a.T.equals(e2Var.f67085xf604e54a)) {
            int i17 = e2Var.f67093x10a0fed7;
            java.lang.String str = e2Var.f67085xf604e54a;
            e2Var.v0();
            e2Var.w0();
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.nhn);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda c22626x3e1b8dda = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda) view.findViewById(com.p314xaae8f345.mm.R.id.lbi);
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a) view.findViewById(com.p314xaae8f345.mm.R.id.h88);
            imageView.setVisibility(8);
            c22626x3e1b8dda.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavRecordAdapter", "setVideoPath " + b17);
            aVar.mo69273xd201a062(true);
            aVar.d(b17, false, 0);
        }
    }
}
