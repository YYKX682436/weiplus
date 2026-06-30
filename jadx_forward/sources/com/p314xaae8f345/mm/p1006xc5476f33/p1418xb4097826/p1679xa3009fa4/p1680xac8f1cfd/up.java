package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class up extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f217688d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f217689e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f217688d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tp(this));
    }

    public final void O6(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (this.f217689e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskSnapshotUIC", "dismissSnapshot: success, source = ".concat(source));
            this.f217689e = false;
            android.view.View decorView = m158354x19263085().getWindow().getDecorView();
            android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
            if (viewGroup != null) {
                viewGroup.removeView(P6());
            }
            P6().setImageDrawable(null);
        }
    }

    public final android.widget.ImageView P6() {
        return (android.widget.ImageView) ((jz5.n) this.f217688d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("KEY_VIDEO_THUMB_LOCAL_PATH");
        if (stringExtra == null || stringExtra.length() == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskSnapshotUIC", "onCreate: snapshotPath = " + stringExtra);
        android.graphics.Bitmap a17 = al3.b.f87382a.a(stringExtra, null);
        if (a17 == null || a17.isRecycled() || a17.getWidth() == 0 || a17.getHeight() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMultiTaskSnapshotUIC", "onCreate: snapshot error, contentViewBitmap = " + a17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskSnapshotUIC", "onCreate: add snapshot to decor, width = " + a17.getWidth() + "  height = " + a17.getHeight());
        P6().setImageBitmap(a17);
        P6().setBackgroundColor(-16777216);
        android.view.View decorView = m158354x19263085().getWindow().getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            viewGroup.addView(P6(), -1, -1);
            this.f217689e = true;
        }
        pm0.v.V(3000L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sp(this));
    }
}
