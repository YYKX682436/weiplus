package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes5.dex */
public final class g5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15027x39e0411 f210820d;

    public g5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15027x39e0411 activityC15027x39e0411) {
        this.f210820d = activityC15027x39e0411;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15027x39e0411 activityC15027x39e0411 = this.f210820d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15505x942e3d02 c15505x942e3d02 = activityC15027x39e0411.f210096t;
        if (c15505x942e3d02 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editView");
            throw null;
        }
        c15505x942e3d02.m63440x37f637cd(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15505x942e3d02 c15505x942e3d022 = activityC15027x39e0411.f210096t;
        if (c15505x942e3d022 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editView");
            throw null;
        }
        android.graphics.Bitmap b07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(c15505x942e3d022);
        if (b07 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183679o + "text_" + java.lang.System.nanoTime() + ".tmp";
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(b07, 80, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("postType", 7);
            intent.putExtra("hideDescEdit", true);
            intent.putExtra("postMediaList", arrayList);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).hk(activityC15027x39e0411, intent);
            activityC15027x39e0411.finish();
        }
        return true;
    }
}
