package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class f2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f236921d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public long f236922e = -1;

    /* renamed from: f, reason: collision with root package name */
    public bt3.b2 f236923f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf f236924g;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf activityC16972xc3ec91bf, com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.v1 v1Var) {
        this.f236924g = activityC16972xc3ec91bf;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r) this.f236921d.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f236921d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        if (i17 > this.f236921d.size()) {
            return 2;
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r) this.f236921d.get(i17)).k();
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a;
        boolean f17;
        android.view.View view2 = view;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = getItem(i17);
        java.util.Objects.toString(view);
        java.util.Objects.toString(viewGroup);
        item.k();
        int k17 = item.k();
        boolean z17 = k17 == 15 || k17 == 4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf activityC16972xc3ec91bf = this.f236924g;
        if (!z17) {
            bt3.b2 b2Var = this.f236923f;
            r45.gp0 n17 = getItem(i17).n();
            java.lang.String str = activityC16972xc3ec91bf.f236851o;
            long j17 = this.f236922e;
            android.graphics.Bitmap h17 = b2Var.h(n17, str, j17, false, false);
            if (h17 == null && (f17 = b2Var.f(n17.T, str, j17))) {
                bt3.g2.O(n17, str, j17, f17);
            }
            if (h17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShowImageUI", "get image fail");
                if (view2 == null || (view2 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a)) {
                    view2 = android.view.View.inflate(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570922em5, null);
                }
                android.widget.ImageView imageView = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.crq);
                imageView.setVisibility(0);
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78994x211254f4);
                view2.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
                return view2;
            }
            android.content.Context context = viewGroup.getContext();
            if (view2 == null || !(view2 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a)) {
                c21524xecd57b9a = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a(context, h17.getWidth(), h17.getHeight());
            } else {
                c21524xecd57b9a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) view2;
                int width = h17.getWidth();
                int height = h17.getHeight();
                c21524xecd57b9a.f279184o = width;
                c21524xecd57b9a.f279185p = height;
            }
            c21524xecd57b9a.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
            c21524xecd57b9a.setImageBitmap(h17);
            c21524xecd57b9a.m79201x4cf4f0ef(true);
            return c21524xecd57b9a;
        }
        if (view2 == null) {
            view2 = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505(activityC16972xc3ec91bf.mo55332x76847179(), null);
            ((java.util.ArrayList) activityC16972xc3ec91bf.f236844e).add(view2);
        }
        java.lang.String j18 = item.j();
        java.util.List list = (java.util.List) activityC16972xc3ec91bf.f236845f.get(j18);
        if (list == null) {
            list = new java.util.ArrayList();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505) view2;
        list.add(viewOnClickListenerC13625xe5fb4505);
        activityC16972xc3ec91bf.f236845f.put(j18, list);
        viewOnClickListenerC13625xe5fb4505.f183104i.setVisibility(8);
        viewOnClickListenerC13625xe5fb4505.m55407x6c4ebec7(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.e2(this));
        if (com.p314xaae8f345.mm.vfs.w6.j(j18)) {
            viewOnClickListenerC13625xe5fb4505.m55413xab2cf483(j18);
            viewOnClickListenerC13625xe5fb4505.m55412xab04b759(item.w());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShowImageUI", "VideoPlay:  videoView.setVideoData(fullPath)");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShowImageUI", "VideoPlay:  videoView.initThumbView thumbExist:%s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.j(item.w())));
            viewOnClickListenerC13625xe5fb4505.j(item.j(), true, item.i());
            viewOnClickListenerC13625xe5fb4505.m55412xab04b759(item.w());
            bt3.b2 b2Var2 = this.f236923f;
            java.lang.String i18 = item.i();
            java.lang.String str2 = activityC16972xc3ec91bf.f236851o;
            long j19 = this.f236922e;
            boolean f18 = b2Var2.f(i18, str2, j19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgImgService", "tryDownloadVideo() called with: dataItem = [" + i18 + "], msgId = [" + j19 + "] canRetry:" + f18);
            if (f18) {
                hz4.h hVar = ((hz4.f) hz4.f.wi()).f367940d;
                if (hVar instanceof hz4.w) {
                    bt3.g2.O(((hz4.w) hVar).f(i18), str2, j19, false);
                }
            }
        }
        viewOnClickListenerC13625xe5fb4505.m55414x5981726b(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN);
        return view2;
    }
}
