package vc1;

/* loaded from: classes13.dex */
public class u0 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnScreenShotListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516716a;

    public u0(vc1.p1 p1Var) {
        this.f516716a = p1Var;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnScreenShotListener
    /* renamed from: onMapScreenShot */
    public void mo99033x2d275c63(android.graphics.Bitmap bitmap) {
        vc1.p1 p1Var = this.f516716a;
        if (bitmap != null) {
            p1Var.f516599d.setImageBitmap(bitmap);
        }
        p1Var.f516604f0.set(false);
    }
}
