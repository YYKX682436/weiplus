package gt4;

/* loaded from: classes9.dex */
public class k2 implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 f356998a;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 c19151x10374577) {
        this.f356998a = c19151x10374577;
    }

    @Override // p11.k
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 c19151x10374577;
        a36.c cVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "load background_img_whole finish, url: %s, bitmap: %s", str, bitmap);
        if (bitmap == null || (cVar = (c19151x10374577 = this.f356998a).f262274p) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f82646p) || !c19151x10374577.f262274p.f82646p.equals(str)) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gt4.j2(this, bitmap));
    }
}
