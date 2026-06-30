package kp1;

/* loaded from: classes11.dex */
public final class l0 implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 f392453a;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 c12881xbe3683d3) {
        this.f392453a = c12881xbe3683d3;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        if (z17) {
            return;
        }
        android.widget.ImageView imageView = this.f392453a.f174541r;
        if (imageView != null) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78922x61de8d17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendUserAvatar");
            throw null;
        }
    }
}
