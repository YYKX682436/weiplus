package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes5.dex */
public final class e5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15027x39e0411 f210625d;

    public e5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15027x39e0411 activityC15027x39e0411) {
        this.f210625d = activityC15027x39e0411;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15027x39e0411.f210095w;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15027x39e0411 activityC15027x39e0411 = this.f210625d;
        android.content.Intent intent = activityC15027x39e0411.getIntent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15505x942e3d02 c15505x942e3d02 = activityC15027x39e0411.f210096t;
        if (c15505x942e3d02 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editView");
            throw null;
        }
        intent.putExtra("saveText", c15505x942e3d02.m63438xfb85ada3());
        activityC15027x39e0411.getIntent().writeToParcel(obtain, 0);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_OPEN_UPLOAD_DRAFT_STRING_SYNC, ot5.e.a(obtain.marshall()));
        activityC15027x39e0411.finish();
    }
}
