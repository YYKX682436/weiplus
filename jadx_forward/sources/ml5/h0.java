package ml5;

/* loaded from: classes10.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22680xdd4da1e8 f409958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f409959e;

    public h0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22680xdd4da1e8 c22680xdd4da1e8, android.graphics.Bitmap bitmap) {
        this.f409958d = c22680xdd4da1e8;
        this.f409959e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f409958d.m81934x5854831(this.f409959e);
    }
}
